package typings.gapiClientSlides.gapi.client.slides

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait UpdateTableCellPropertiesRequest extends js.Object {
  /**
    * The fields that should be updated.
    *
    * At least one field must be specified. The root `tableCellProperties` is
    * implied and should not be specified. A single `"&#42;"` can be used as
    * short-hand for listing every field.
    *
    * For example to update the table cell background solid fill color, set
    * `fields` to `"tableCellBackgroundFill.solidFill.color"`.
    *
    * To reset a property to its default value, include its field name in the
    * field mask but leave the field itself unset.
    */
  var fields: js.UndefOr[String] = js.native
  /** The object ID of the table. */
  var objectId: js.UndefOr[String] = js.native
  /** The table cell properties to update. */
  var tableCellProperties: js.UndefOr[TableCellProperties] = js.native
  /**
    * The table range representing the subset of the table to which the updates
    * are applied. If a table range is not specified, the updates will apply to
    * the entire table.
    */
  var tableRange: js.UndefOr[TableRange] = js.native
}

object UpdateTableCellPropertiesRequest {
  @scala.inline
  def apply(): UpdateTableCellPropertiesRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[UpdateTableCellPropertiesRequest]
  }
  @scala.inline
  implicit class UpdateTableCellPropertiesRequestOps[Self <: UpdateTableCellPropertiesRequest] (val x: Self) extends AnyVal {
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
    def setFields(value: String): Self = this.set("fields", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFields: Self = this.set("fields", js.undefined)
    @scala.inline
    def setObjectId(value: String): Self = this.set("objectId", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteObjectId: Self = this.set("objectId", js.undefined)
    @scala.inline
    def setTableCellProperties(value: TableCellProperties): Self = this.set("tableCellProperties", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTableCellProperties: Self = this.set("tableCellProperties", js.undefined)
    @scala.inline
    def setTableRange(value: TableRange): Self = this.set("tableRange", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTableRange: Self = this.set("tableRange", js.undefined)
  }
  
}

