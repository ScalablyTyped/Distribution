package typings.googleapis.buildSrcApisSlidesV1Mod.slides_v1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Deletes text from a shape or a table cell.
  */
@js.native
trait Schema$DeleteTextRequest extends js.Object {
  /**
    * The optional table cell location if the text is to be deleted from a
    * table cell. If present, the object_id must refer to a table.
    */
  var cellLocation: js.UndefOr[Schema$TableCellLocation] = js.native
  /**
    * The object ID of the shape or table from which the text will be deleted.
    */
  var objectId: js.UndefOr[String] = js.native
  /**
    * The range of text to delete, based on TextElement indexes.  There is
    * always an implicit newline character at the end of a shape&#39;s or table
    * cell&#39;s text that cannot be deleted. `Range.Type.ALL` will use the
    * correct bounds, but care must be taken when specifying explicit bounds
    * for range types `FROM_START_INDEX` and `FIXED_RANGE`. For example, if the
    * text is &quot;ABC&quot;, followed by an implicit newline, then the
    * maximum value is 2 for `text_range.start_index` and 3 for
    * `text_range.end_index`.  Deleting text that crosses a paragraph boundary
    * may result in changes to paragraph styles and lists as the two paragraphs
    * are merged.  Ranges that include only one code unit of a surrogate pair
    * are expanded to include both code units.
    */
  var textRange: js.UndefOr[Schema$Range] = js.native
}

object Schema$DeleteTextRequest {
  @scala.inline
  def apply(
    cellLocation: Schema$TableCellLocation = null,
    objectId: String = null,
    textRange: Schema$Range = null
  ): Schema$DeleteTextRequest = {
    val __obj = js.Dynamic.literal()
    if (cellLocation != null) __obj.updateDynamic("cellLocation")(cellLocation.asInstanceOf[js.Any])
    if (objectId != null) __obj.updateDynamic("objectId")(objectId.asInstanceOf[js.Any])
    if (textRange != null) __obj.updateDynamic("textRange")(textRange.asInstanceOf[js.Any])
    __obj.asInstanceOf[Schema$DeleteTextRequest]
  }
}

