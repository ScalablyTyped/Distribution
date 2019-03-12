package typings
package googleDashAppsDashScriptLib.GoogleAppsScriptNs.SpreadsheetNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TextStyleBuilder extends js.Object {
  def build(): TextStyle
  def setBold(bold: scala.Boolean): TextStyleBuilder
  def setFontFamily(fontFamily: java.lang.String): TextStyleBuilder
  def setFontSize(fontSize: googleDashAppsDashScriptLib.GoogleAppsScriptNs.Integer): TextStyleBuilder
  def setForegroundColor(cssString: java.lang.String): TextStyleBuilder
  def setItalic(italic: scala.Boolean): TextStyleBuilder
  def setStrikethrough(strikethrough: scala.Boolean): TextStyleBuilder
  def setUnderline(underline: scala.Boolean): TextStyleBuilder
}

object TextStyleBuilder {
  @scala.inline
  def apply(
    build: () => TextStyle,
    setBold: scala.Boolean => TextStyleBuilder,
    setFontFamily: java.lang.String => TextStyleBuilder,
    setFontSize: googleDashAppsDashScriptLib.GoogleAppsScriptNs.Integer => TextStyleBuilder,
    setForegroundColor: java.lang.String => TextStyleBuilder,
    setItalic: scala.Boolean => TextStyleBuilder,
    setStrikethrough: scala.Boolean => TextStyleBuilder,
    setUnderline: scala.Boolean => TextStyleBuilder
  ): TextStyleBuilder = {
    val __obj = js.Dynamic.literal(build = js.Any.fromFunction0(build), setBold = js.Any.fromFunction1(setBold), setFontFamily = js.Any.fromFunction1(setFontFamily), setFontSize = js.Any.fromFunction1(setFontSize), setForegroundColor = js.Any.fromFunction1(setForegroundColor), setItalic = js.Any.fromFunction1(setItalic), setStrikethrough = js.Any.fromFunction1(setStrikethrough), setUnderline = js.Any.fromFunction1(setUnderline))
  
    __obj.asInstanceOf[TextStyleBuilder]
  }
}

