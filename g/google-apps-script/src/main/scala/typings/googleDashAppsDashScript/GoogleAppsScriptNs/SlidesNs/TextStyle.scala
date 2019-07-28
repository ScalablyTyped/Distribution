package typings.googleDashAppsDashScript.GoogleAppsScriptNs.SlidesNs

import typings.googleDashAppsDashScript.GoogleAppsScriptNs.Integer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TextStyle extends js.Object {
  def getBackgroundColor(): Color = js.native
  def getBaselineOffset(): TextBaselineOffset = js.native
  def getFontFamily(): String = js.native
  def getFontSize(): Double = js.native
  def getFontWeight(): Integer = js.native
  def getForegroundColor(): Color = js.native
  def getLink(): Link = js.native
  def hasLink(): Boolean = js.native
  def isBackgroundTransparent(): Boolean = js.native
  def isBold(): Boolean = js.native
  def isItalic(): Boolean = js.native
  def isSmallCaps(): Boolean = js.native
  def isStrikethrough(): Boolean = js.native
  def isUnderline(): Boolean = js.native
  def removeLink(): TextStyle = js.native
  def setBackgroundColor(color: Color): TextStyle = js.native
  def setBackgroundColor(color: ThemeColorType): TextStyle = js.native
  def setBackgroundColor(hexColor: String): TextStyle = js.native
  def setBackgroundColor(red: Integer, green: Integer, blue: Integer): TextStyle = js.native
  def setBackgroundColorTransparent(): TextStyle = js.native
  def setBaselineOffset(offset: TextBaselineOffset): TextStyle = js.native
  def setBold(bold: Boolean): TextStyle = js.native
  def setFontFamily(fontFamily: String): TextStyle = js.native
  def setFontFamilyAndWeight(fontFamily: String, fontWeight: Integer): TextStyle = js.native
  def setFontSize(fontSize: Double): TextStyle = js.native
  def setForegroundColor(color: ThemeColorType): TextStyle = js.native
  def setForegroundColor(foregroundColor: Color): TextStyle = js.native
  def setForegroundColor(hexColor: String): TextStyle = js.native
  def setForegroundColor(red: Integer, green: Integer, blue: Integer): TextStyle = js.native
  def setItalic(italic: Boolean): TextStyle = js.native
  def setLinkSlide(slideIndex: Integer): TextStyle = js.native
  def setLinkSlide(slidePosition: SlidePosition): TextStyle = js.native
  def setLinkSlide(slide: Slide): TextStyle = js.native
  def setLinkUrl(url: String): TextStyle = js.native
  def setSmallCaps(smallCaps: Boolean): TextStyle = js.native
  def setStrikethrough(strikethrough: Boolean): TextStyle = js.native
  def setUnderline(underline: Boolean): TextStyle = js.native
}

