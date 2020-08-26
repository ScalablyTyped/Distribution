package typings.gapiClientSheets.gapi.client.sheets

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TextFormat extends js.Object {
  /** True if the text is bold. */
  var bold: js.UndefOr[Boolean] = js.native
  /** The font family. */
  var fontFamily: js.UndefOr[String] = js.native
  /** The size of the font. */
  var fontSize: js.UndefOr[Double] = js.native
  /** The foreground color of the text. */
  var foregroundColor: js.UndefOr[Color] = js.native
  /**
    * The foreground color of the text.
    * If foreground_color is also set, this field takes precedence.
    */
  var foregroundColorStyle: js.UndefOr[ColorStyle] = js.native
  /** True if the text is italicized. */
  var italic: js.UndefOr[Boolean] = js.native
  /** True if the text has a strikethrough. */
  var strikethrough: js.UndefOr[Boolean] = js.native
  /** True if the text is underlined. */
  var underline: js.UndefOr[Boolean] = js.native
}

object TextFormat {
  @scala.inline
  def apply(): TextFormat = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[TextFormat]
  }
  @scala.inline
  implicit class TextFormatOps[Self <: TextFormat] (val x: Self) extends AnyVal {
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
    def setBold(value: Boolean): Self = this.set("bold", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteBold: Self = this.set("bold", js.undefined)
    @scala.inline
    def setFontFamily(value: String): Self = this.set("fontFamily", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFontFamily: Self = this.set("fontFamily", js.undefined)
    @scala.inline
    def setFontSize(value: Double): Self = this.set("fontSize", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFontSize: Self = this.set("fontSize", js.undefined)
    @scala.inline
    def setForegroundColor(value: Color): Self = this.set("foregroundColor", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteForegroundColor: Self = this.set("foregroundColor", js.undefined)
    @scala.inline
    def setForegroundColorStyle(value: ColorStyle): Self = this.set("foregroundColorStyle", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteForegroundColorStyle: Self = this.set("foregroundColorStyle", js.undefined)
    @scala.inline
    def setItalic(value: Boolean): Self = this.set("italic", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteItalic: Self = this.set("italic", js.undefined)
    @scala.inline
    def setStrikethrough(value: Boolean): Self = this.set("strikethrough", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteStrikethrough: Self = this.set("strikethrough", js.undefined)
    @scala.inline
    def setUnderline(value: Boolean): Self = this.set("underline", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteUnderline: Self = this.set("underline", js.undefined)
  }
  
}

