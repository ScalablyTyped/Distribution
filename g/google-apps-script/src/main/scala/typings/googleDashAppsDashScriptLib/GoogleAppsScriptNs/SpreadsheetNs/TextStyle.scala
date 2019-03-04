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
    copy: js.Function0[TextStyleBuilder],
    getFontFamily: js.Function0[java.lang.String],
    getFontSize: js.Function0[googleDashAppsDashScriptLib.GoogleAppsScriptNs.Integer],
    getForegroundColor: js.Function0[java.lang.String],
    isBold: js.Function0[scala.Boolean],
    isItalic: js.Function0[scala.Boolean],
    isStrikethrough: js.Function0[scala.Boolean],
    isUnderline: js.Function0[scala.Boolean]
  ): TextStyle = {
    val __obj = js.Dynamic.literal(copy = copy, getFontFamily = getFontFamily, getFontSize = getFontSize, getForegroundColor = getForegroundColor, isBold = isBold, isItalic = isItalic, isStrikethrough = isStrikethrough, isUnderline = isUnderline)
  
    __obj.asInstanceOf[TextStyle]
  }
}

