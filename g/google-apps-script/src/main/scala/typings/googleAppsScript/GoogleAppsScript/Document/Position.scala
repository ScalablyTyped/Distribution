package typings.googleAppsScript.GoogleAppsScript.Document

import typings.googleAppsScript.GoogleAppsScript.Base.BlobSource
import typings.googleAppsScript.GoogleAppsScript.Integer
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
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
trait Position extends StObject {
  
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
  
  @scala.inline
  implicit class PositionMutableBuilder[Self <: Position] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setGetElement(value: () => Element): Self = StObject.set(x, "getElement", js.Any.fromFunction0(value))
    
    @scala.inline
    def setGetOffset(value: () => Integer): Self = StObject.set(x, "getOffset", js.Any.fromFunction0(value))
    
    @scala.inline
    def setGetSurroundingText(value: () => Text): Self = StObject.set(x, "getSurroundingText", js.Any.fromFunction0(value))
    
    @scala.inline
    def setGetSurroundingTextOffset(value: () => Integer): Self = StObject.set(x, "getSurroundingTextOffset", js.Any.fromFunction0(value))
    
    @scala.inline
    def setInsertBookmark(value: () => Bookmark): Self = StObject.set(x, "insertBookmark", js.Any.fromFunction0(value))
    
    @scala.inline
    def setInsertInlineImage(value: BlobSource => InlineImage): Self = StObject.set(x, "insertInlineImage", js.Any.fromFunction1(value))
    
    @scala.inline
    def setInsertText(value: String => Text): Self = StObject.set(x, "insertText", js.Any.fromFunction1(value))
  }
}
