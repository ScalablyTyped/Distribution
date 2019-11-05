package typings.googleDashAppsDashScript.GoogleAppsScript.Spreadsheet

import typings.googleDashAppsDashScript.GoogleAppsScript.Integer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * A stylized text string used to represent cell text. Substrings of the text can have different
  * text styles.
  *
  * A run is the longest unbroken substring having the same text style. For example, the
  * sentence "This kid has two apples." has four runs: ["This ", "kid ", "has two ",
  * "apples."].
  */
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

