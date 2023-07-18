import java.util.Scanner;
public class atmUygulamasi {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);

        String userName,password;
        int right=3;
        int select;
        int principal=1500;
        int price;

        while (right>0) {

            System.out.println("Kullanıcı Adınızı Giriniz: ");
            userName = input.nextLine();

            System.out.println("Şifrenizi Giriniz: ");
            password = input.nextLine();

            if (userName.equals("patika") && password.equals("dev123")) {

                System.out.println("Sistemi Başarılı! Kodluyoruz Bankasına Hoşgeldiniz.");

                do {

                    System.out.println("Yapılacak İşlemler:\n 1-Para Çekme\n 2-Para Yatırma\n 3-Bakiye Sorgulama\n 4-Çıkış  ");

                    System.out.print("Lütfen Yapmak İstediğiniz İşlemi Giriniz: ");
                    select= input.nextInt();

                    switch (select){

                        case 1:
                            System.out.println("Çekilecek Miktarı Giriniz: ");
                            price= input.nextInt();

                            if(price>principal){

                                System.out.println("Yetersiz Bakiye!");
                            }
                            else{
                                principal-=price;
                                System.out.println("İşlem Başarılı.");
                            }
                            break;
                        case 2:

                            System.out.println("Yatırılacak Miktarı Giriniz: ");
                            price= input.nextInt();

                            principal+=price;

                            System.out.println("İşlem Başarılı.");
                            break;

                        case 3:

                            System.out.println("Bakiyeniz: "+principal);

                            break;

                        default:
                            System.out.println("Hatalı Sayı Girdiniz!");
                    }

                }
                while (select!=4);

                    System.out.println("Tekrar Görüşmek Üzere ");
                    break;

                    
            } else {

                right--;
                System.out.println("Kullanıcı Adı veya Şifre Yanlış!");
                if(right==0){

                    System.out.println("Hesabınız Bloke Olmuştur.Lütfen Banka İle İletişime Geçiniz.");
                }
                else{

                    System.out.println("Kalan Hakkınız "+right);
                }
            }
        }

























    }
}