package typings.googleAppsScript.GoogleAppsScript.Document

import typings.googleAppsScript.GoogleAppsScript.Base.BlobSource
import typings.googleAppsScript.GoogleAppsScript.Integer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * A reference to a location in the document, relative to a specific element. The user's cursor is
  * represented as a Position, among other uses. Scripts can only access the cursor of the
  * user who is running the script, and only if the script is bound to the document.
  *
  *     // Insert some text at the cursor position and make it bold.
  *     var cursor = DocumentApp.getActiveDocument().getCursor();
  *     if (cursor) {
  *       // Attempt to insert text at the cursor position. If the insertion returns null, the cursor's
  *       // containing element doesn't allow insertions, so show the user an error message.
  *       var element = cursor.insertText('ಠ‿ಠ');
  *       if (element) {
  *         element.setBold(true);
  *       } else {
  *         DocumentApp.getUi().alert('Cannot insert text here.');
  *       }
  *     } else {
  *       DocumentApp.getUi().alert('Cannot find a cursor.');
  *     }
  */
@js.native
trait Position extends js.Object {
  
  def getElement(): Element = js.native
  
  def getOffset(): Integer = js.native
  
  def getSurroundingText(): Text = js.native
  
  def getSurroundingTextOffset(): Integer = js.native
  
  def insertBookmark(): Bookmark = js.native
  
  def insertInlineImage(image: BlobSource): InlineImage = js.native
  
  def insertText(text: String): Text = js.native
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
  
  @scala.inline
  implicit class PositionOps[Self <: Position] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setGetElement(value: () => Element): Self = this.set("getElement", js.Any.fromFunction0(value))
    
    @scala.inline
    def setGetOffset(value: () => Integer): Self = this.set("getOffset", js.Any.fromFunction0(value))
    
    @scala.inline
    def setGetSurroundingText(value: () => Text): Self = this.set("getSurroundingText", js.Any.fromFunction0(value))
    
    @scala.inline
    def setGetSurroundingTextOffset(value: () => Integer): Self = this.set("getSurroundingTextOffset", js.Any.fromFunction0(value))
    
    @scala.inline
    def setInsertBookmark(value: () => Bookmark): Self = this.set("insertBookmark", js.Any.fromFunction0(value))
    
    @scala.inline
    def setInsertInlineImage(value: BlobSource => InlineImage): Self = this.set("insertInlineImage", js.Any.fromFunction1(value))
    
    @scala.inline
    def setInsertText(value: String => Text): Self = this.set("insertText", js.Any.fromFunction1(value))
  }
}
