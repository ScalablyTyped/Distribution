package typings.gapiDotClientDotSlides.gapiNs.clientNs.slidesNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DeleteTextRequest extends js.Object {
  /**
    * The optional table cell location if the text is to be deleted from a table
    * cell. If present, the object_id must refer to a table.
    */
  var cellLocation: js.UndefOr[TableCellLocation] = js.undefined
  /** The object ID of the shape or table from which the text will be deleted. */
  var objectId: js.UndefOr[String] = js.undefined
  /**
    * The range of text to delete, based on TextElement indexes.
    *
    * There is always an implicit newline character at the end of a shape's or
    * table cell's text that cannot be deleted. `Range.Type.ALL` will use the
    * correct bounds, but care must be taken when specifying explicit bounds for
    * range types `FROM_START_INDEX` and `FIXED_RANGE`. For example, if the text
    * is "ABC", followed by an implicit newline, then the maximum value is 2 for
    * `text_range.start_index` and 3 for `text_range.end_index`.
    *
    * Deleting text that crosses a paragraph boundary may result in changes
    * to paragraph styles and lists as the two paragraphs are merged.
    *
    * Ranges that include only one code unit of a surrogate pair are expanded to
    * include both code units.
    */
  var textRange: js.UndefOr[Range] = js.undefined
}

object DeleteTextRequest {
  @scala.inline
  def apply(cellLocation: TableCellLocation = null, objectId: String = null, textRange: Range = null): DeleteTextRequest = {
    val __obj = js.Dynamic.literal()
    if (cellLocation != null) __obj.updateDynamic("cellLocation")(cellLocation)
    if (objectId != null) __obj.updateDynamic("objectId")(objectId)
    if (textRange != null) __obj.updateDynamic("textRange")(textRange)
    __obj.asInstanceOf[DeleteTextRequest]
  }
}

