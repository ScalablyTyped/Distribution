package typings.googleDashAppsDashScript.GoogleAppsScript.Spreadsheet

import typings.googleDashAppsDashScript.GoogleAppsScript.Integer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * A builder for text styles.
  */
trait TextStyleBuilder extends js.Object {
  def build(): TextStyle
  def setBold(bold: Boolean): TextStyleBuilder
  def setFontFamily(fontFamily: String): TextStyleBuilder
  def setFontSize(fontSize: Integer): TextStyleBuilder
  def setForegroundColor(cssString: String): TextStyleBuilder
  def setItalic(italic: Boolean): TextStyleBuilder
  def setStrikethrough(strikethrough: Boolean): TextStyleBuilder
  def setUnderline(underline: Boolean): TextStyleBuilder
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
}

