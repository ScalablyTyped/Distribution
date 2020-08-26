package typings.expoVectorIcons.createMultiStyleIconSetMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait FontStyle extends js.Object {
  var fontFamily: String = js.native
  var fontFile: js.Any = js.native
  var fontStyle: js.Any = js.native
  var glyphMap: js.Any = js.native
}

object FontStyle {
  @scala.inline
  def apply(fontFamily: String, fontFile: js.Any, fontStyle: js.Any, glyphMap: js.Any): FontStyle = {
    val __obj = js.Dynamic.literal(fontFamily = fontFamily.asInstanceOf[js.Any], fontFile = fontFile.asInstanceOf[js.Any], fontStyle = fontStyle.asInstanceOf[js.Any], glyphMap = glyphMap.asInstanceOf[js.Any])
    __obj.asInstanceOf[FontStyle]
  }
  @scala.inline
  implicit class FontStyleOps[Self <: FontStyle] (val x: Self) extends AnyVal {
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
    def setFontFamily(value: String): Self = this.set("fontFamily", value.asInstanceOf[js.Any])
    @scala.inline
    def setFontFile(value: js.Any): Self = this.set("fontFile", value.asInstanceOf[js.Any])
    @scala.inline
    def setFontStyle(value: js.Any): Self = this.set("fontStyle", value.asInstanceOf[js.Any])
    @scala.inline
    def setGlyphMap(value: js.Any): Self = this.set("glyphMap", value.asInstanceOf[js.Any])
  }
  
}

