package typings.gapiClientSlides.gapi.client.slides

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait UpdateParagraphStyleRequest extends js.Object {
  /**
    * The location of the cell in the table containing the paragraph(s) to
    * style. If `object_id` refers to a table, `cell_location` must have a value.
    * Otherwise, it must not.
    */
  var cellLocation: js.UndefOr[TableCellLocation] = js.undefined
  /**
    * The fields that should be updated.
    *
    * At least one field must be specified. The root `style` is implied and
    * should not be specified. A single `"&#42;"` can be used as short-hand for
    * listing every field.
    *
    * For example, to update the paragraph alignment, set `fields` to
    * `"alignment"`.
    *
    * To reset a property to its default value, include its field name in the
    * field mask but leave the field itself unset.
    */
  var fields: js.UndefOr[String] = js.undefined
  /** The object ID of the shape or table with the text to be styled. */
  var objectId: js.UndefOr[String] = js.undefined
  /** The paragraph's style. */
  var style: js.UndefOr[ParagraphStyle] = js.undefined
  /** The range of text containing the paragraph(s) to style. */
  var textRange: js.UndefOr[Range] = js.undefined
}

object UpdateParagraphStyleRequest {
  @scala.inline
  def apply(
    cellLocation: TableCellLocation = null,
    fields: String = null,
    objectId: String = null,
    style: ParagraphStyle = null,
    textRange: Range = null
  ): UpdateParagraphStyleRequest = {
    val __obj = js.Dynamic.literal()
    if (cellLocation != null) __obj.updateDynamic("cellLocation")(cellLocation.asInstanceOf[js.Any])
    if (fields != null) __obj.updateDynamic("fields")(fields.asInstanceOf[js.Any])
    if (objectId != null) __obj.updateDynamic("objectId")(objectId.asInstanceOf[js.Any])
    if (style != null) __obj.updateDynamic("style")(style.asInstanceOf[js.Any])
    if (textRange != null) __obj.updateDynamic("textRange")(textRange.asInstanceOf[js.Any])
    __obj.asInstanceOf[UpdateParagraphStyleRequest]
  }
}

