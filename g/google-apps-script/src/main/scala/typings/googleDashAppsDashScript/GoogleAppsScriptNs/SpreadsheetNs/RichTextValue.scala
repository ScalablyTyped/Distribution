package typings.googleDashAppsDashScript.GoogleAppsScriptNs.SpreadsheetNs

import typings.googleDashAppsDashScript.GoogleAppsScriptNs.Integer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait RichTextValue extends js.Object {
  def copy(): RichTextValueBuilder = js.native
  def getEndIndex(): Integer = js.native
  def getRuns(): js.Array[RichTextValue] = js.native
  def getStartIndex(): Integer = js.native
  def getText(): String = js.native
  def getTextStyle(): TextStyle = js.native
  def getTextStyle(startOffset: Integer, endOffset: Integer): TextStyle = js.native
}

