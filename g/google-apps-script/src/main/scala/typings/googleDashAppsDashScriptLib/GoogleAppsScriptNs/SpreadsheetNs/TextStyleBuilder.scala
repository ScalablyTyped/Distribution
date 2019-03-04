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
    build: js.Function0[TextStyle],
    setBold: js.Function1[scala.Boolean, TextStyleBuilder],
    setFontFamily: js.Function1[java.lang.String, TextStyleBuilder],
    setFontSize: js.Function1[googleDashAppsDashScriptLib.GoogleAppsScriptNs.Integer, TextStyleBuilder],
    setForegroundColor: js.Function1[java.lang.String, TextStyleBuilder],
    setItalic: js.Function1[scala.Boolean, TextStyleBuilder],
    setStrikethrough: js.Function1[scala.Boolean, TextStyleBuilder],
    setUnderline: js.Function1[scala.Boolean, TextStyleBuilder]
  ): TextStyleBuilder = {
    val __obj = js.Dynamic.literal(build = build, setBold = setBold, setFontFamily = setFontFamily, setFontSize = setFontSize, setForegroundColor = setForegroundColor, setItalic = setItalic, setStrikethrough = setStrikethrough, setUnderline = setUnderline)
  
    __obj.asInstanceOf[TextStyleBuilder]
  }
}

