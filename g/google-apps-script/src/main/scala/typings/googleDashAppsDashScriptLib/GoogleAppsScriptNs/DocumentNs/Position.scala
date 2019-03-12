package typings
package googleDashAppsDashScriptLib.GoogleAppsScriptNs.DocumentNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Position extends js.Object {
  def getElement(): Element
  def getOffset(): googleDashAppsDashScriptLib.GoogleAppsScriptNs.Integer
  def getSurroundingText(): Text
  def getSurroundingTextOffset(): googleDashAppsDashScriptLib.GoogleAppsScriptNs.Integer
  def insertBookmark(): Bookmark
  def insertInlineImage(image: googleDashAppsDashScriptLib.GoogleAppsScriptNs.BaseNs.BlobSource): InlineImage
  def insertText(text: java.lang.String): Text
}

object Position {
  @scala.inline
  def apply(
    getElement: () => Element,
    getOffset: () => googleDashAppsDashScriptLib.GoogleAppsScriptNs.Integer,
    getSurroundingText: () => Text,
    getSurroundingTextOffset: () => googleDashAppsDashScriptLib.GoogleAppsScriptNs.Integer,
    insertBookmark: () => Bookmark,
    insertInlineImage: googleDashAppsDashScriptLib.GoogleAppsScriptNs.BaseNs.BlobSource => InlineImage,
    insertText: java.lang.String => Text
  ): Position = {
    val __obj = js.Dynamic.literal(getElement = js.Any.fromFunction0(getElement), getOffset = js.Any.fromFunction0(getOffset), getSurroundingText = js.Any.fromFunction0(getSurroundingText), getSurroundingTextOffset = js.Any.fromFunction0(getSurroundingTextOffset), insertBookmark = js.Any.fromFunction0(insertBookmark), insertInlineImage = js.Any.fromFunction1(insertInlineImage), insertText = js.Any.fromFunction1(insertText))
  
    __obj.asInstanceOf[Position]
  }
}

