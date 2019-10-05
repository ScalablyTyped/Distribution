package typings.googleDashAppsDashScript.GoogleAppsScript.Document

import typings.googleDashAppsDashScript.GoogleAppsScript.Base.BlobSource
import typings.googleDashAppsDashScript.GoogleAppsScript.Integer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Position extends js.Object {
  def getElement(): Element
  def getOffset(): Integer
  def getSurroundingText(): Text
  def getSurroundingTextOffset(): Integer
  def insertBookmark(): Bookmark
  def insertInlineImage(image: BlobSource): InlineImage
  def insertText(text: String): Text
}

object Position {
  @scala.inline
  def apply(
    getElement: () => Element,
    getOffset: () => Integer,
    getSurroundingText: () => Text,
    getSurroundingTextOffset: () => Integer,
    insertBookmark: () => Bookmark,
    insertInlineImage: BlobSource => InlineImage,
    insertText: String => Text
  ): Position = {
    val __obj = js.Dynamic.literal(getElement = js.Any.fromFunction0(getElement), getOffset = js.Any.fromFunction0(getOffset), getSurroundingText = js.Any.fromFunction0(getSurroundingText), getSurroundingTextOffset = js.Any.fromFunction0(getSurroundingTextOffset), insertBookmark = js.Any.fromFunction0(insertBookmark), insertInlineImage = js.Any.fromFunction1(insertInlineImage), insertText = js.Any.fromFunction1(insertText))
  
    __obj.asInstanceOf[Position]
  }
}

