package typings.enamdict.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Entry extends js.Object {
  
  /**
    *  A string holding a Kana representation of a name.
    */
  var kana: String | js.Array[String] = js.native
  
  /**
    * A string holding a Kanji representation of a name.
    */
  var kanji: String | js.Array[String] = js.native
  
  /**
    * A string holding an English (Romaji) representation of a name.
    */
  var romaji: String | js.Array[String] = js.native
  
  /**
    * A string that represents the type of the name.
    */
  var `type`: NameType = js.native
}
object Entry {
  
  @scala.inline
  def apply(
    kana: String | js.Array[String],
    kanji: String | js.Array[String],
    romaji: String | js.Array[String],
    `type`: NameType
  ): Entry = {
    val __obj = js.Dynamic.literal(kana = kana.asInstanceOf[js.Any], kanji = kanji.asInstanceOf[js.Any], romaji = romaji.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Entry]
  }
  
  @scala.inline
  implicit class EntryOps[Self <: Entry] (val x: Self) extends AnyVal {
    
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
    def setKanaVarargs(value: String*): Self = this.set("kana", js.Array(value :_*))
    
    @scala.inline
    def setKana(value: String | js.Array[String]): Self = this.set("kana", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setKanjiVarargs(value: String*): Self = this.set("kanji", js.Array(value :_*))
    
    @scala.inline
    def setKanji(value: String | js.Array[String]): Self = this.set("kanji", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRomajiVarargs(value: String*): Self = this.set("romaji", js.Array(value :_*))
    
    @scala.inline
    def setRomaji(value: String | js.Array[String]): Self = this.set("romaji", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setType(value: NameType): Self = this.set("type", value.asInstanceOf[js.Any])
  }
}
