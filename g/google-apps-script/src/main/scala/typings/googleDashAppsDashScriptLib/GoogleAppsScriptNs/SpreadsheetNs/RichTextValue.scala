package typings
package googleDashAppsDashScriptLib.GoogleAppsScriptNs.SpreadsheetNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait RichTextValue extends js.Object {
  def copy(): RichTextValueBuilder = js.native
  def getEndIndex(): googleDashAppsDashScriptLib.GoogleAppsScriptNs.Integer = js.native
  def getRuns(): js.Array[RichTextValue] = js.native
  def getStartIndex(): googleDashAppsDashScriptLib.GoogleAppsScriptNs.Integer = js.native
  def getText(): java.lang.String = js.native
  def getTextStyle(): TextStyle = js.native
  def getTextStyle(
    startOffset: googleDashAppsDashScriptLib.GoogleAppsScriptNs.Integer,
    endOffset: googleDashAppsDashScriptLib.GoogleAppsScriptNs.Integer
  ): TextStyle = js.native
}

