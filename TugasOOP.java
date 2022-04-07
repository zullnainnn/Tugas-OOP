package tugas.oop;

class Personalization{
    String nama;
    String hobi;
    Byte umur;
    
public class TugasOOP {

    public static void main(String[] args) {
        // TODO code application logic here
        Personalization person1 = new Personalization();
        person1.nama = "Zulqarnain";
        person1.umur = 18;
        person1.hobi = "jalan-jalan";


        System.out.println("Nama : " + person1.nama);
        System.out.println("Umur : " + person1.umur);
        System.out.println("Hobi : " + person1.hobi);
    }
    
}