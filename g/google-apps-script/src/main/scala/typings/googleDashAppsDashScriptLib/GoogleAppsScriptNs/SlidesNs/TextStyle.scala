package typings
package googleDashAppsDashScriptLib.GoogleAppsScriptNs.SlidesNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TextStyle extends js.Object {
  def getBackgroundColor(): Color = js.native
  def getBaselineOffset(): TextBaselineOffset = js.native
  def getFontFamily(): java.lang.String = js.native
  def getFontSize(): scala.Double = js.native
  def getFontWeight(): googleDashAppsDashScriptLib.GoogleAppsScriptNs.Integer = js.native
  def getForegroundColor(): Color = js.native
  def getLink(): Link = js.native
  def hasLink(): scala.Boolean = js.native
  def isBackgroundTransparent(): scala.Boolean = js.native
  def isBold(): scala.Boolean = js.native
  def isItalic(): scala.Boolean = js.native
  def isSmallCaps(): scala.Boolean = js.native
  def isStrikethrough(): scala.Boolean = js.native
  def isUnderline(): scala.Boolean = js.native
  def removeLink(): TextStyle = js.native
  def setBackgroundColor(color: Color): TextStyle = js.native
  def setBackgroundColor(color: ThemeColorType): TextStyle = js.native
  def setBackgroundColor(hexColor: java.lang.String): TextStyle = js.native
  def setBackgroundColor(
    red: googleDashAppsDashScriptLib.GoogleAppsScriptNs.Integer,
    green: googleDashAppsDashScriptLib.GoogleAppsScriptNs.Integer,
    blue: googleDashAppsDashScriptLib.GoogleAppsScriptNs.Integer
  ): TextStyle = js.native
  def setBackgroundColorTransparent(): TextStyle = js.native
  def setBaselineOffset(offset: TextBaselineOffset): TextStyle = js.native
  def setBold(bold: scala.Boolean): TextStyle = js.native
  def setFontFamily(fontFamily: java.lang.String): TextStyle = js.native
  def setFontFamilyAndWeight(fontFamily: java.lang.String, fontWeight: googleDashAppsDashScriptLib.GoogleAppsScriptNs.Integer): TextStyle = js.native
  def setFontSize(fontSize: scala.Double): TextStyle = js.native
  def setForegroundColor(color: ThemeColorType): TextStyle = js.native
  def setForegroundColor(foregroundColor: Color): TextStyle = js.native
  def setForegroundColor(hexColor: java.lang.String): TextStyle = js.native
  def setForegroundColor(
    red: googleDashAppsDashScriptLib.GoogleAppsScriptNs.Integer,
    green: googleDashAppsDashScriptLib.GoogleAppsScriptNs.Integer,
    blue: googleDashAppsDashScriptLib.GoogleAppsScriptNs.Integer
  ): TextStyle = js.native
  def setItalic(italic: scala.Boolean): TextStyle = js.native
  def setLinkSlide(slideIndex: googleDashAppsDashScriptLib.GoogleAppsScriptNs.Integer): TextStyle = js.native
  def setLinkSlide(slidePosition: SlidePosition): TextStyle = js.native
  def setLinkSlide(slide: Slide): TextStyle = js.native
  def setLinkUrl(url: java.lang.String): TextStyle = js.native
  def setSmallCaps(smallCaps: scala.Boolean): TextStyle = js.native
  def setStrikethrough(strikethrough: scala.Boolean): TextStyle = js.native
  def setUnderline(underline: scala.Boolean): TextStyle = js.native
}

