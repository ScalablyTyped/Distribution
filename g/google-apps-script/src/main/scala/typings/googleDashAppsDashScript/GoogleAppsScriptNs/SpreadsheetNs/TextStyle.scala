package typings.googleDashAppsDashScript.GoogleAppsScriptNs.SpreadsheetNs

import typings.googleDashAppsDashScript.GoogleAppsScriptNs.Integer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TextStyle extends js.Object {
  def copy(): TextStyleBuilder
  def getFontFamily(): String | Null
  def getFontSize(): Integer | Null
  def getForegroundColor(): String | Null
  def isBold(): Boolean | Null
  def isItalic(): Boolean | Null
  def isStrikethrough(): Boolean | Null
  def isUnderline(): Boolean | Null
}

object TextStyle {
  @scala.inline
  def apply(
    copy: () => TextStyleBuilder,
    getFontFamily: () => String | Null,
    getFontSize: () => Integer | Null,
    getForegroundColor: () => String | Null,
    isBold: () => Boolean | Null,
    isItalic: () => Boolean | Null,
    isStrikethrough: () => Boolean | Null,
    isUnderline: () => Boolean | Null
  ): TextStyle = {
    val __obj = js.Dynamic.literal(copy = js.Any.fromFunction0(copy), getFontFamily = js.Any.fromFunction0(getFontFamily), getFontSize = js.Any.fromFunction0(getFontSize), getForegroundColor = js.Any.fromFunction0(getForegroundColor), isBold = js.Any.fromFunction0(isBold), isItalic = js.Any.fromFunction0(isItalic), isStrikethrough = js.Any.fromFunction0(isStrikethrough), isUnderline = js.Any.fromFunction0(isUnderline))
  
    __obj.asInstanceOf[TextStyle]
  }
}

