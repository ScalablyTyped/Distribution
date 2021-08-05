package typings.enamdict

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("enamdict", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def find(romajiName: String): Entries = ^.asInstanceOf[js.Dynamic].applyDynamic("find")(romajiName.asInstanceOf[js.Any]).asInstanceOf[Entries]
  
  inline def findKanji(kanjiName: String): Entries = ^.asInstanceOf[js.Dynamic].applyDynamic("findKanji")(kanjiName.asInstanceOf[js.Any]).asInstanceOf[Entries]
  
  inline def init(callback: js.Function0[Unit]): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("init")(callback.asInstanceOf[js.Any]).asInstanceOf[Unit]
  
  trait Entries extends StObject {
    
    /**
      * Returns an array of objects representing matching entries.
      */
    def entries(): js.Array[Entry]
    
    /**
      * If a query was done with `.find()` then this will return a string representing the Kana reading of the name.
      *
      * If a query was done with `.findKanji()` then this will return an array of all the possible Kana readings of the Kanji.
      */
    def kana(): String | js.Array[String]
    
    /**
      * If a query was done with `.find()` then this will return an array of all the possible Kanji versions of the name.
      *
      * If a query was done with `.findKanji()` then this will return a string representing the Kanji version of the name.
      */
    def kanji(): String | js.Array[String]
    
    /**
      * If a query was done with .find() then this will return a string representing the Romaji reading of the name.
      *
      * If a query was done with `.findKanji()` then this will return an array of all the possible Romaji readings of the Kanji.
      */
    def romaji(): String | js.Array[String]
    
    /**
      * Returns the most popular type of the name, aggregated from all matching entries.
      * For example if 5 entries were found, three of which were "surname", 1 of which was "given", and 1 of which was "unknown" then this method would return "surname".
      * Returns the same possible values as the type property itself.
      */
    def `type`(): NameType
  }
  object Entries {
    
    inline def apply(
      entries: () => js.Array[Entry],
      kana: () => String | js.Array[String],
      kanji: () => String | js.Array[String],
      romaji: () => String | js.Array[String],
      `type`: () => NameType
    ): Entries = {
      val __obj = js.Dynamic.literal(entries = js.Any.fromFunction0(entries), kana = js.Any.fromFunction0(kana), kanji = js.Any.fromFunction0(kanji), romaji = js.Any.fromFunction0(romaji))
      __obj.updateDynamic("type")(js.Any.fromFunction0(`type`))
      __obj.asInstanceOf[Entries]
    }
    
    extension [Self <: Entries](x: Self) {
      
      inline def setEntries(value: () => js.Array[Entry]): Self = StObject.set(x, "entries", js.Any.fromFunction0(value))
      
      inline def setKana(value: () => String | js.Array[String]): Self = StObject.set(x, "kana", js.Any.fromFunction0(value))
      
      inline def setKanji(value: () => String | js.Array[String]): Self = StObject.set(x, "kanji", js.Any.fromFunction0(value))
      
      inline def setRomaji(value: () => String | js.Array[String]): Self = StObject.set(x, "romaji", js.Any.fromFunction0(value))
      
      inline def setType(value: () => NameType): Self = StObject.set(x, "type", js.Any.fromFunction0(value))
    }
  }
  
  trait Entry extends StObject {
    
    /**
      *  A string holding a Kana representation of a name.
      */
    var kana: String | js.Array[String]
    
    /**
      * A string holding a Kanji representation of a name.
      */
    var kanji: String | js.Array[String]
    
    /**
      * A string holding an English (Romaji) representation of a name.
      */
    var romaji: String | js.Array[String]
    
    /**
      * A string that represents the type of the name.
      */
    var `type`: NameType
  }
  object Entry {
    
    inline def apply(
      kana: String | js.Array[String],
      kanji: String | js.Array[String],
      romaji: String | js.Array[String],
      `type`: NameType
    ): Entry = {
      val __obj = js.Dynamic.literal(kana = kana.asInstanceOf[js.Any], kanji = kanji.asInstanceOf[js.Any], romaji = romaji.asInstanceOf[js.Any])
      __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
      __obj.asInstanceOf[Entry]
    }
    
    extension [Self <: Entry](x: Self) {
      
      inline def setKana(value: String | js.Array[String]): Self = StObject.set(x, "kana", value.asInstanceOf[js.Any])
      
      inline def setKanaVarargs(value: String*): Self = StObject.set(x, "kana", js.Array(value :_*))
      
      inline def setKanji(value: String | js.Array[String]): Self = StObject.set(x, "kanji", value.asInstanceOf[js.Any])
      
      inline def setKanjiVarargs(value: String*): Self = StObject.set(x, "kanji", js.Array(value :_*))
      
      inline def setRomaji(value: String | js.Array[String]): Self = StObject.set(x, "romaji", value.asInstanceOf[js.Any])
      
      inline def setRomajiVarargs(value: String*): Self = StObject.set(x, "romaji", js.Array(value :_*))
      
      inline def setType(value: NameType): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    }
  }
  
  /* Rewritten from type alias, can be one of: 
    - typings.enamdict.enamdictStrings.unknown
    - typings.enamdict.enamdictStrings.surname
    - typings.enamdict.enamdictStrings.`given`
  */
  trait NameType extends StObject
  object NameType {
    
    inline def `given`: typings.enamdict.enamdictStrings.`given` = "given".asInstanceOf[typings.enamdict.enamdictStrings.`given`]
    
    inline def surname: typings.enamdict.enamdictStrings.surname = "surname".asInstanceOf[typings.enamdict.enamdictStrings.surname]
    
    inline def unknown: typings.enamdict.enamdictStrings.unknown = "unknown".asInstanceOf[typings.enamdict.enamdictStrings.unknown]
  }
}
