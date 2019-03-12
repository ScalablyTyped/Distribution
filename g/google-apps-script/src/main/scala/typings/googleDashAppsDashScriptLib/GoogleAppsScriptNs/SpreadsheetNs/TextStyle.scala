package typings
package googleDashAppsDashScriptLib.GoogleAppsScriptNs.SpreadsheetNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TextStyle extends js.Object {
  def copy(): TextStyleBuilder
  def getFontFamily(): java.lang.String
  def getFontSize(): googleDashAppsDashScriptLib.GoogleAppsScriptNs.Integer
  def getForegroundColor(): java.lang.String
  def isBold(): scala.Boolean
  def isItalic(): scala.Boolean
  def isStrikethrough(): scala.Boolean
  def isUnderline(): scala.Boolean
}

object TextStyle {
  @scala.inline
  def apply(
    copy: () => TextStyleBuilder,
    getFontFamily: () => java.lang.String,
    getFontSize: () => googleDashAppsDashScriptLib.GoogleAppsScriptNs.Integer,
    getForegroundColor: () => java.lang.String,
    isBold: () => scala.Boolean,
    isItalic: () => scala.Boolean,
    isStrikethrough: () => scala.Boolean,
    isUnderline: () => scala.Boolean
  ): TextStyle = {
    val __obj = js.Dynamic.literal(copy = js.Any.fromFunction0(copy), getFontFamily = js.Any.fromFunction0(getFontFamily), getFontSize = js.Any.fromFunction0(getFontSize), getForegroundColor = js.Any.fromFunction0(getForegroundColor), isBold = js.Any.fromFunction0(isBold), isItalic = js.Any.fromFunction0(isItalic), isStrikethrough = js.Any.fromFunction0(isStrikethrough), isUnderline = js.Any.fromFunction0(isUnderline))
  
    __obj.asInstanceOf[TextStyle]
  }
}

