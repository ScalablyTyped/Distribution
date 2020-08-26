package typings.gapiClientSlides.gapi.client.slides

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DeleteTextRequest extends js.Object {
  /**
    * The optional table cell location if the text is to be deleted from a table
    * cell. If present, the object_id must refer to a table.
    */
  var cellLocation: js.UndefOr[TableCellLocation] = js.native
  /** The object ID of the shape or table from which the text will be deleted. */
  var objectId: js.UndefOr[String] = js.native
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
  var textRange: js.UndefOr[Range] = js.native
}

object DeleteTextRequest {
  @scala.inline
  def apply(): DeleteTextRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DeleteTextRequest]
  }
  @scala.inline
  implicit class DeleteTextRequestOps[Self <: DeleteTextRequest] (val x: Self) extends AnyVal {
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
    def setCellLocation(value: TableCellLocation): Self = this.set("cellLocation", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCellLocation: Self = this.set("cellLocation", js.undefined)
    @scala.inline
    def setObjectId(value: String): Self = this.set("objectId", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteObjectId: Self = this.set("objectId", js.undefined)
    @scala.inline
    def setTextRange(value: Range): Self = this.set("textRange", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTextRange: Self = this.set("textRange", js.undefined)
  }
  
}

