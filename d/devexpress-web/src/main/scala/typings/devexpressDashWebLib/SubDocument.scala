package typings
package devexpressDashWebLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
 * Exposes the settings providing the information about the essential document functionality.
 */
@js.native
trait SubDocument extends js.Object {
  /**
       * Provides information about document bookmarks.
       * Value: An array of Bookmark objects storing information about document bookmarks.
       */
  var bookmarksInfo: js.Array[Bookmark] = js.native
  /**
       * Provides information about fields in the current document.
       * Value: An array of Field objects storing information about document fields.
       */
  var fieldsInfo: js.Array[Field] = js.native
  /**
       * Provides information about floating pictures in the sub-document.
       * Value: An array of FloatingPictureInfo objects storing information about floating objects.
       */
  var floatingPicturesInfo: js.Array[FloatingPictureInfo] = js.native
  /**
       * Provides information about floating text boxes contained within the sub-document if it is the main sub-document or header/footer.
       * Value: An array of FloatingTextBoxInfo objects storing the information about floating text boxes.
       */
  var floatingTextBoxesInfo: js.Array[FloatingTextBoxInfo] = js.native
  /**
       * Gets the sub-document identifier.
       * Value: An integer value specifying the sub-document identifier.
       */
  var id: scala.Double = js.native
  /**
       * Provides access to an array of objects containing in-line picture settings.
       * Value: An array of <see cref="InlinePictureInfo[]" /> objects.
       */
  var inlinePicturesInfo: js.Array[InlinePictureInfo] = js.native
  /**
       * Gets the character length of the document.
       * Value: An integer that is the number of character positions in the document.
       */
  var length: scala.Double = js.native
  /**
       * Provides information about paragraphs contained in the document.
       * Value: An array of Paragraph objects storing information about document paragraphs.
       */
  var paragraphsInfo: js.Array[Paragraph] = js.native
  /**
       * Provides information about tables contained in the document.
       * Value: An array of Table objects storing information about document tables.
       */
  var tablesInfo: js.Array[Table] = js.native
  /**
       * Gets the document's textual representation.
       * Value: A string value specifying the document's text.
       */
  var text: java.lang.String = js.native
  /**
       * Gets a value specifying the sub-document type.
       * Value: One of the <see cref="SubDocumentType" /> enumeration values.
       */
  var `type`: js.Any = js.native
  /**
       * Returns an array of bookmarks whose range intersects the specified interval in the sub-document.
       * @param interval An Interval object specifying the target interval in the sub-document.
       */
  def findBookmarks(interval: Interval): js.Array[Bookmark] = js.native
  /**
       * Returns an array of bookmarks whose range intersects the specified intervals in the sub-document.
       * @param intervals An array of Interval objects specifying the target intervals in the sub-document.
       */
  def findBookmarks(intervals: js.Array[Interval]): js.Array[Bookmark] = js.native
  /**
       * Returns a bookmark specified by its name.
       * @param name A string value specifying the target bookmark's name.
       */
  def findBookmarks(name: java.lang.String): js.Array[Bookmark] = js.native
  /**
       * Returns an array of bookmarks whose range includes the specified position in the sub-document.
       * @param position An integer value specifying the target position in the sub-document.
       */
  def findBookmarks(position: scala.Double): js.Array[Bookmark] = js.native
  /**
       * Returns an array of bookmarks whose names are matched to the specified regular expression.
       * @param regExp A string value specifying the regular expression that defines the pattern for searching by names in the sub-document's bookmark collection.
       */
  def findBookmarks(regExp: js.Any): js.Array[Bookmark] = js.native
  /**
       * Returns all fields contained in the specified interval.
       * @param interval A text buffer interval that contains the target fields.
       */
  def findFields(interval: Interval): js.Array[Field] = js.native
  /**
       * Returns a field if its interval includes the specified position.
       * @param position An integer value specifying the target field's position.
       */
  def findFields(position: scala.Double): js.Array[Field] = js.native
  /**
       * Returns an array of paragraphs whose range intersects the specified interval in the sub-document.
       * @param interval An Interval object specifying the target interval in the sub-document.
       */
  def findParagraphs(interval: Interval): js.Array[Paragraph] = js.native
  /**
       * Returns an array of paragraphs whose range intersects the specified intervals in the sub-document.
       * @param intervals An array of the Interval object specifying the target intervals in the sub-document.
       */
  def findParagraphs(intervals: js.Array[Interval]): js.Array[Paragraph] = js.native
  /**
       * Returns an array of paragraphs whose range includes the specified position in the sub-document.
       * @param position An integer value specifying the target position in the sub-document.
       */
  def findParagraphs(position: scala.Double): js.Array[Paragraph] = js.native
  /**
       * Returns all tables contained in the specified interval.
       * @param interval A text buffer interval that contains the target tables.
       */
  def findTables(interval: Interval): js.Array[Field] = js.native
  /**
       * Returns a table if its interval includes the specified position.
       * @param position An integer value specifying the target table's position.
       */
  def findTables(position: scala.Double): js.Array[Field] = js.native
  /**
       * Returns information specific for floating text boxes about the sub-document.
       */
  def getFloatingTextBoxInfo(): FloatingTextBoxInfo = js.native
  /**
       * Return the document's textual representation contained in the specified interval.
       * @param interval A text buffer interval that contains the target text.
       */
  def getTextByInterval(interval: Interval): java.lang.String = js.native
}

