package typings.googleAppsScript.GoogleAppsScript.Spreadsheet

import typings.googleAppsScript.GoogleAppsScript.Integer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * A builder for text styles.
  */
@js.native
trait TextStyleBuilder extends js.Object {
  def build(): TextStyle = js.native
  def setBold(bold: Boolean): TextStyleBuilder = js.native
  def setFontFamily(fontFamily: String): TextStyleBuilder = js.native
  def setFontSize(fontSize: Integer): TextStyleBuilder = js.native
  def setForegroundColor(cssString: String): TextStyleBuilder = js.native
  def setItalic(italic: Boolean): TextStyleBuilder = js.native
  def setStrikethrough(strikethrough: Boolean): TextStyleBuilder = js.native
  def setUnderline(underline: Boolean): TextStyleBuilder = js.native
}

object TextStyleBuilder {
  @scala.inline
  def apply(
    build: () => TextStyle,
    setBold: Boolean => TextStyleBuilder,
    setFontFamily: String => TextStyleBuilder,
    setFontSize: Integer => TextStyleBuilder,
    setForegroundColor: String => TextStyleBuilder,
    setItalic: Boolean => TextStyleBuilder,
    setStrikethrough: Boolean => TextStyleBuilder,
    setUnderline: Boolean => TextStyleBuilder
  ): TextStyleBuilder = {
    val __obj = js.Dynamic.literal(build = js.Any.fromFunction0(build), setBold = js.Any.fromFunction1(setBold), setFontFamily = js.Any.fromFunction1(setFontFamily), setFontSize = js.Any.fromFunction1(setFontSize), setForegroundColor = js.Any.fromFunction1(setForegroundColor), setItalic = js.Any.fromFunction1(setItalic), setStrikethrough = js.Any.fromFunction1(setStrikethrough), setUnderline = js.Any.fromFunction1(setUnderline))
    __obj.asInstanceOf[TextStyleBuilder]
  }
  @scala.inline
  implicit class TextStyleBuilderOps[Self <: TextStyleBuilder] (val x: Self) extends AnyVal {
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
    def setBuild(value: () => TextStyle): Self = this.set("build", js.Any.fromFunction0(value))
    @scala.inline
    def setSetBold(value: Boolean => TextStyleBuilder): Self = this.set("setBold", js.Any.fromFunction1(value))
    @scala.inline
    def setSetFontFamily(value: String => TextStyleBuilder): Self = this.set("setFontFamily", js.Any.fromFunction1(value))
    @scala.inline
    def setSetFontSize(value: Integer => TextStyleBuilder): Self = this.set("setFontSize", js.Any.fromFunction1(value))
    @scala.inline
    def setSetForegroundColor(value: String => TextStyleBuilder): Self = this.set("setForegroundColor", js.Any.fromFunction1(value))
    @scala.inline
    def setSetItalic(value: Boolean => TextStyleBuilder): Self = this.set("setItalic", js.Any.fromFunction1(value))
    @scala.inline
    def setSetStrikethrough(value: Boolean => TextStyleBuilder): Self = this.set("setStrikethrough", js.Any.fromFunction1(value))
    @scala.inline
    def setSetUnderline(value: Boolean => TextStyleBuilder): Self = this.set("setUnderline", js.Any.fromFunction1(value))
  }
  
}

