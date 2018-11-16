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
       * Returns all tables contained in the specified interval.
       * @param interval A text buffer interval that contains the target tables.
       */
  def findTables(interval: Interval): js.Array[Field] = js.native
  /**
       * Returns a table if its interval includes the specified position.
       * @param position An integer value specifying the target table's position.
       */
  def findTables(position: scala.Double): js.Array[Field] = js.native
}

