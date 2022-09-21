package typings.devexpressWeb

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Exposes the settings providing the information about the essential document functionality.
  */
@js.native
trait SubDocument extends StObject {
  
  /**
    * Provides information about document bookmarks.
    */
  val bookmarksInfo: js.Array[Bookmark] = js.native
  
  /**
    * Provides information about fields in the current document.
    */
  val fieldsInfo: js.Array[Field] = js.native
  
  def findBookmarks(arg: String): js.Array[Bookmark] = js.native
  def findBookmarks(arg: js.Array[Interval]): js.Array[Bookmark] = js.native
  def findBookmarks(arg: js.RegExp): js.Array[Bookmark] = js.native
  /**
    * Returns an array of bookmarks that match the search conditions. An array of the Bookmark objects.
    * @param arg Contains a position or interval(s) where to search bookmarks, or a bookmark name, or a regular expression.
    */
  def findBookmarks(arg: Double): js.Array[Bookmark] = js.native
  def findBookmarks(arg: Interval): js.Array[Bookmark] = js.native
  
  /**
    * Returns an array of fields that match the search conditions. An array of the Field objects.
    * @param arg A position or interval indicating where to search fields.
    */
  def findFields(arg: Double): js.Array[Field] = js.native
  def findFields(arg: Interval): js.Array[Field] = js.native
  
  def findParagraphs(arg: js.Array[Interval]): js.Array[Paragraph] = js.native
  /**
    * Returns an array of paragraphs that match the search conditions. An array of the Paragraph objects.
    * @param arg Contains a position or interval(s) where to search paragraphs.
    */
  def findParagraphs(arg: Double): js.Array[Paragraph] = js.native
  def findParagraphs(arg: Interval): js.Array[Paragraph] = js.native
  
  /**
    * Returns an array of tables that match the search conditions. An array of the Table objects.
    * @param arg Contains a position or interval indicating where to search tables.
    */
  def findTables(arg: Double): js.Array[Table] = js.native
  def findTables(arg: Interval): js.Array[Table] = js.native
  
  /**
    * Provides information about floating pictures in the sub-document.
    */
  val floatingPicturesInfo: js.Array[FloatingPictureInfo] = js.native
  
  /**
    * Provides information about floating text boxes contained within the sub-document if it is the main sub-document or header/footer.
    */
  val floatingTextBoxesInfo: js.Array[FloatingTextBoxInfo] = js.native
  
  /**
    * Returns information specific for floating text boxes about the sub-document.
    */
  def getFloatingTextBoxInfo(): FloatingTextBoxInfo = js.native
  
  /**
    * Return the document's textual representation contained in the specified interval. A string value specifying the text contained in the specified interval.
    * @param interval A text buffer interval that contains the target text.
    */
  def getTextByInterval(interval: Interval): String = js.native
  
  /**
    * Gets the sub-document identifier.
    */
  val id: Double = js.native
  
  /**
    * Provides access to an array of objects containing in-line picture settings.
    */
  val inlinePicturesInfo: js.Array[InlinePictureInfo] = js.native
  
  /**
    * Gets the character length of the document.
    */
  val length: Double = js.native
  
  /**
    * Provides information about paragraphs contained in the document.
    */
  val paragraphsInfo: js.Array[Paragraph] = js.native
  
  /**
    * Provides information about tables contained in the document.
    */
  val tablesInfo: js.Array[Table] = js.native
  
  /**
    * Gets the document's textual representation.
    */
  val text: String = js.native
  
  /**
    * Gets a value specifying the sub-document type.
    */
  val `type`: SubDocumentType = js.native
}
