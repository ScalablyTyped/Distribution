package typings.googleDashAppsDashScript.GoogleAppsScriptNs.SpreadsheetNs

import typings.googleDashAppsDashScript.GoogleAppsScriptNs.Integer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TextStyle extends js.Object {
  def copy(): TextStyleBuilder
  def getFontFamily(): String
  def getFontSize(): Integer
  def getForegroundColor(): String
  def isBold(): Boolean
  def isItalic(): Boolean
  def isStrikethrough(): Boolean
  def isUnderline(): Boolean
}

object TextStyle {
  @scala.inline
  def apply(
    copy: () => TextStyleBuilder,
    getFontFamily: () => String,
    getFontSize: () => Integer,
    getForegroundColor: () => String,
    isBold: () => Boolean,
    isItalic: () => Boolean,
    isStrikethrough: () => Boolean,
    isUnderline: () => Boolean
  ): TextStyle = {
    val __obj = js.Dynamic.literal(copy = js.Any.fromFunction0(copy), getFontFamily = js.Any.fromFunction0(getFontFamily), getFontSize = js.Any.fromFunction0(getFontSize), getForegroundColor = js.Any.fromFunction0(getForegroundColor), isBold = js.Any.fromFunction0(isBold), isItalic = js.Any.fromFunction0(isItalic), isStrikethrough = js.Any.fromFunction0(isStrikethrough), isUnderline = js.Any.fromFunction0(isUnderline))
  
    __obj.asInstanceOf[TextStyle]
  }
}

