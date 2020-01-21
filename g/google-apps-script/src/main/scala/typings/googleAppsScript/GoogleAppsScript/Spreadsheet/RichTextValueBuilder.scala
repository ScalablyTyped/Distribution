package typings.googleAppsScript.GoogleAppsScript.Spreadsheet

import typings.googleAppsScript.GoogleAppsScript.Integer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * A builder for Rich Text values.
  */
@js.native
trait RichTextValueBuilder extends js.Object {
  def build(): RichTextValue = js.native
  def setText(text: String): RichTextValueBuilder = js.native
  def setTextStyle(): RichTextValueBuilder = js.native
  def setTextStyle(startOffset: Integer, endOffset: Integer): RichTextValueBuilder = js.native
  def setTextStyle(startOffset: Integer, endOffset: Integer, textStyle: TextStyle): RichTextValueBuilder = js.native
  def setTextStyle(textStyle: TextStyle): RichTextValueBuilder = js.native
}

