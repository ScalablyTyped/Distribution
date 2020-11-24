package typings.emojiMart.dataMod

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Emoji extends js.Object {
  
  var a: js.UndefOr[String] = js.native
  
  var added_in: js.UndefOr[Double] = js.native
  
  var b: js.UndefOr[String] = js.native
  
  var c: js.UndefOr[String] = js.native
  
  var d: js.UndefOr[Boolean] = js.native
  
  var e: js.UndefOr[Boolean] = js.native
  
  var emoticons: js.UndefOr[js.Array[String]] = js.native
  
  var f: js.UndefOr[Boolean] = js.native
  
  var g: js.UndefOr[Boolean] = js.native
  
  var h: js.UndefOr[Boolean] = js.native
  
  var has_img_apple: js.UndefOr[Boolean] = js.native
  
  var has_img_emojione: js.UndefOr[Boolean] = js.native
  
  var has_img_facebook: js.UndefOr[Boolean] = js.native
  
  var has_img_google: js.UndefOr[Boolean] = js.native
  
  var has_img_messenger: js.UndefOr[Boolean] = js.native
  
  var has_img_twitter: js.UndefOr[Boolean] = js.native
  
  var i: js.UndefOr[Boolean] = js.native
  
  var j: js.UndefOr[js.Array[String]] = js.native
  
  var k: js.UndefOr[js.Array[Double]] = js.native
  
  var keywords: js.UndefOr[js.Array[String]] = js.native
  
  var l: js.UndefOr[js.Array[String]] = js.native
  
  var m: js.UndefOr[String] = js.native
  
  var n: js.UndefOr[js.Array[String]] = js.native
  
  var name: js.UndefOr[String] = js.native
  
  var non_qualified: js.UndefOr[String] = js.native
  
  var o: js.UndefOr[Double] = js.native
  
  var obsoleted_by: js.UndefOr[String] = js.native
  
  var obsoletes: js.UndefOr[String] = js.native
  
  var sheet: js.UndefOr[js.Array[Double]] = js.native
  
  var sheet_x: js.UndefOr[Double] = js.native
  
  var sheet_y: js.UndefOr[Double] = js.native
  
  var short_names: js.UndefOr[js.Array[String]] = js.native
  
  var skin_variations: js.UndefOr[StringDictionary[SkinVariation]] = js.native
  
  var text: js.UndefOr[String] = js.native
  
  var unified: js.UndefOr[String] = js.native
}
object Emoji {
  
  @scala.inline
  def apply(): Emoji = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Emoji]
  }
  
  @scala.inline
  implicit class EmojiOps[Self <: Emoji] (val x: Self) extends AnyVal {
    
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
    def setA(value: String): Self = this.set("a", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteA: Self = this.set("a", js.undefined)
    
    @scala.inline
    def setAdded_in(value: Double): Self = this.set("added_in", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAdded_in: Self = this.set("added_in", js.undefined)
    
    @scala.inline
    def setB(value: String): Self = this.set("b", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteB: Self = this.set("b", js.undefined)
    
    @scala.inline
    def setC(value: String): Self = this.set("c", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteC: Self = this.set("c", js.undefined)
    
    @scala.inline
    def setD(value: Boolean): Self = this.set("d", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteD: Self = this.set("d", js.undefined)
    
    @scala.inline
    def setE(value: Boolean): Self = this.set("e", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteE: Self = this.set("e", js.undefined)
    
    @scala.inline
    def setEmoticonsVarargs(value: String*): Self = this.set("emoticons", js.Array(value :_*))
    
    @scala.inline
    def setEmoticons(value: js.Array[String]): Self = this.set("emoticons", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteEmoticons: Self = this.set("emoticons", js.undefined)
    
    @scala.inline
    def setF(value: Boolean): Self = this.set("f", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteF: Self = this.set("f", js.undefined)
    
    @scala.inline
    def setG(value: Boolean): Self = this.set("g", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteG: Self = this.set("g", js.undefined)
    
    @scala.inline
    def setH(value: Boolean): Self = this.set("h", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteH: Self = this.set("h", js.undefined)
    
    @scala.inline
    def setHas_img_apple(value: Boolean): Self = this.set("has_img_apple", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteHas_img_apple: Self = this.set("has_img_apple", js.undefined)
    
    @scala.inline
    def setHas_img_emojione(value: Boolean): Self = this.set("has_img_emojione", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteHas_img_emojione: Self = this.set("has_img_emojione", js.undefined)
    
    @scala.inline
    def setHas_img_facebook(value: Boolean): Self = this.set("has_img_facebook", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteHas_img_facebook: Self = this.set("has_img_facebook", js.undefined)
    
    @scala.inline
    def setHas_img_google(value: Boolean): Self = this.set("has_img_google", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteHas_img_google: Self = this.set("has_img_google", js.undefined)
    
    @scala.inline
    def setHas_img_messenger(value: Boolean): Self = this.set("has_img_messenger", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteHas_img_messenger: Self = this.set("has_img_messenger", js.undefined)
    
    @scala.inline
    def setHas_img_twitter(value: Boolean): Self = this.set("has_img_twitter", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteHas_img_twitter: Self = this.set("has_img_twitter", js.undefined)
    
    @scala.inline
    def setI(value: Boolean): Self = this.set("i", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteI: Self = this.set("i", js.undefined)
    
    @scala.inline
    def setJVarargs(value: String*): Self = this.set("j", js.Array(value :_*))
    
    @scala.inline
    def setJ(value: js.Array[String]): Self = this.set("j", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteJ: Self = this.set("j", js.undefined)
    
    @scala.inline
    def setKVarargs(value: Double*): Self = this.set("k", js.Array(value :_*))
    
    @scala.inline
    def setK(value: js.Array[Double]): Self = this.set("k", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteK: Self = this.set("k", js.undefined)
    
    @scala.inline
    def setKeywordsVarargs(value: String*): Self = this.set("keywords", js.Array(value :_*))
    
    @scala.inline
    def setKeywords(value: js.Array[String]): Self = this.set("keywords", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteKeywords: Self = this.set("keywords", js.undefined)
    
    @scala.inline
    def setLVarargs(value: String*): Self = this.set("l", js.Array(value :_*))
    
    @scala.inline
    def setL(value: js.Array[String]): Self = this.set("l", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteL: Self = this.set("l", js.undefined)
    
    @scala.inline
    def setM(value: String): Self = this.set("m", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteM: Self = this.set("m", js.undefined)
    
    @scala.inline
    def setNVarargs(value: String*): Self = this.set("n", js.Array(value :_*))
    
    @scala.inline
    def setN(value: js.Array[String]): Self = this.set("n", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteN: Self = this.set("n", js.undefined)
    
    @scala.inline
    def setName(value: String): Self = this.set("name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteName: Self = this.set("name", js.undefined)
    
    @scala.inline
    def setNon_qualified(value: String): Self = this.set("non_qualified", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteNon_qualified: Self = this.set("non_qualified", js.undefined)
    
    @scala.inline
    def setO(value: Double): Self = this.set("o", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteO: Self = this.set("o", js.undefined)
    
    @scala.inline
    def setObsoleted_by(value: String): Self = this.set("obsoleted_by", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteObsoleted_by: Self = this.set("obsoleted_by", js.undefined)
    
    @scala.inline
    def setObsoletes(value: String): Self = this.set("obsoletes", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteObsoletes: Self = this.set("obsoletes", js.undefined)
    
    @scala.inline
    def setSheetVarargs(value: Double*): Self = this.set("sheet", js.Array(value :_*))
    
    @scala.inline
    def setSheet(value: js.Array[Double]): Self = this.set("sheet", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSheet: Self = this.set("sheet", js.undefined)
    
    @scala.inline
    def setSheet_x(value: Double): Self = this.set("sheet_x", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSheet_x: Self = this.set("sheet_x", js.undefined)
    
    @scala.inline
    def setSheet_y(value: Double): Self = this.set("sheet_y", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSheet_y: Self = this.set("sheet_y", js.undefined)
    
    @scala.inline
    def setShort_namesVarargs(value: String*): Self = this.set("short_names", js.Array(value :_*))
    
    @scala.inline
    def setShort_names(value: js.Array[String]): Self = this.set("short_names", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteShort_names: Self = this.set("short_names", js.undefined)
    
    @scala.inline
    def setSkin_variations(value: StringDictionary[SkinVariation]): Self = this.set("skin_variations", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSkin_variations: Self = this.set("skin_variations", js.undefined)
    
    @scala.inline
    def setText(value: String): Self = this.set("text", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteText: Self = this.set("text", js.undefined)
    
    @scala.inline
    def setUnified(value: String): Self = this.set("unified", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteUnified: Self = this.set("unified", js.undefined)
  }
}
