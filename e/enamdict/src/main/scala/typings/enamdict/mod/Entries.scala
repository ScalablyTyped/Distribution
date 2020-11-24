package typings.enamdict.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Entries extends js.Object {
  
  /**
    * Returns an array of objects representing matching entries.
    */
  def entries(): js.Array[Entry] = js.native
  
  /**
    * If a query was done with `.find()` then this will return a string representing the Kana reading of the name.
    *
    * If a query was done with `.findKanji()` then this will return an array of all the possible Kana readings of the Kanji.
    */
  def kana(): String | js.Array[String] = js.native
  
  /**
    * If a query was done with `.find()` then this will return an array of all the possible Kanji versions of the name.
    *
    * If a query was done with `.findKanji()` then this will return a string representing the Kanji version of the name.
    */
  def kanji(): String | js.Array[String] = js.native
  
  /**
    * If a query was done with .find() then this will return a string representing the Romaji reading of the name.
    *
    * If a query was done with `.findKanji()` then this will return an array of all the possible Romaji readings of the Kanji.
    */
  def romaji(): String | js.Array[String] = js.native
  
  /**
    * Returns the most popular type of the name, aggregated from all matching entries.
    * For example if 5 entries were found, three of which were "surname", 1 of which was "given", and 1 of which was "unknown" then this method would return "surname".
    * Returns the same possible values as the type property itself.
    */
  def `type`(): NameType = js.native
}
object Entries {
  
  @scala.inline
  def apply(
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
  
  @scala.inline
  implicit class EntriesOps[Self <: Entries] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setEntries(value: () => js.Array[Entry]): Self = this.set("entries", js.Any.fromFunction0(value))
    
    @scala.inline
    def setKana(value: () => String | js.Array[String]): Self = this.set("kana", js.Any.fromFunction0(value))
    
    @scala.inline
    def setKanji(value: () => String | js.Array[String]): Self = this.set("kanji", js.Any.fromFunction0(value))
    
    @scala.inline
    def setRomaji(value: () => String | js.Array[String]): Self = this.set("romaji", js.Any.fromFunction0(value))
    
    @scala.inline
    def setType(value: () => NameType): Self = this.set("type", js.Any.fromFunction0(value))
  }
}
