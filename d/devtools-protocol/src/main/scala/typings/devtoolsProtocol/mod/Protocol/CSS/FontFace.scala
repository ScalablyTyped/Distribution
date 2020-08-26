package typings.devtoolsProtocol.mod.Protocol.CSS

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait FontFace extends js.Object {
  /**
    * The font-family.
    */
  var fontFamily: String = js.native
  /**
    * The font-stretch.
    */
  var fontStretch: String = js.native
  /**
    * The font-style.
    */
  var fontStyle: String = js.native
  /**
    * The font-variant.
    */
  var fontVariant: String = js.native
  /**
    * The font-weight.
    */
  var fontWeight: String = js.native
  /**
    * The resolved platform font family
    */
  var platformFontFamily: String = js.native
  /**
    * The src.
    */
  var src: String = js.native
  /**
    * The unicode-range.
    */
  var unicodeRange: String = js.native
}

object FontFace {
  @scala.inline
  def apply(
    fontFamily: String,
    fontStretch: String,
    fontStyle: String,
    fontVariant: String,
    fontWeight: String,
    platformFontFamily: String,
    src: String,
    unicodeRange: String
  ): FontFace = {
    val __obj = js.Dynamic.literal(fontFamily = fontFamily.asInstanceOf[js.Any], fontStretch = fontStretch.asInstanceOf[js.Any], fontStyle = fontStyle.asInstanceOf[js.Any], fontVariant = fontVariant.asInstanceOf[js.Any], fontWeight = fontWeight.asInstanceOf[js.Any], platformFontFamily = platformFontFamily.asInstanceOf[js.Any], src = src.asInstanceOf[js.Any], unicodeRange = unicodeRange.asInstanceOf[js.Any])
    __obj.asInstanceOf[FontFace]
  }
  @scala.inline
  implicit class FontFaceOps[Self <: FontFace] (val x: Self) extends AnyVal {
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
    def setFontStretch(value: String): Self = this.set("fontStretch", value.asInstanceOf[js.Any])
    @scala.inline
    def setFontStyle(value: String): Self = this.set("fontStyle", value.asInstanceOf[js.Any])
    @scala.inline
    def setFontVariant(value: String): Self = this.set("fontVariant", value.asInstanceOf[js.Any])
    @scala.inline
    def setFontWeight(value: String): Self = this.set("fontWeight", value.asInstanceOf[js.Any])
    @scala.inline
    def setPlatformFontFamily(value: String): Self = this.set("platformFontFamily", value.asInstanceOf[js.Any])
    @scala.inline
    def setSrc(value: String): Self = this.set("src", value.asInstanceOf[js.Any])
    @scala.inline
    def setUnicodeRange(value: String): Self = this.set("unicodeRange", value.asInstanceOf[js.Any])
  }
  
}

