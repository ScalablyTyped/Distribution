package typings.ejWebAll.ej.Grid

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait RowDataBoundEventArgs extends js.Object {
  /** Returns the cancel option value.
    */
  var cancel: js.UndefOr[Boolean] = js.native
  /** Returns current row record object (JSON).
    */
  var data: js.UndefOr[js.Any] = js.native
  /** Returns the foreign key record object (JSON).
    */
  var foreignKeyData: js.UndefOr[js.Any] = js.native
  /** Returns the grid model.
    */
  var model: js.UndefOr[js.Any] = js.native
  /** Returns grid row.
    */
  var row: js.UndefOr[js.Any] = js.native
  /** Returns current row record object (JSON).
    */
  var rowData: js.UndefOr[js.Any] = js.native
  /** Returns the name of the event.
    */
  var `type`: js.UndefOr[String] = js.native
}

object RowDataBoundEventArgs {
  @scala.inline
  def apply(): RowDataBoundEventArgs = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[RowDataBoundEventArgs]
  }
  @scala.inline
  implicit class RowDataBoundEventArgsOps[Self <: RowDataBoundEventArgs] (val x: Self) extends AnyVal {
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
    def setCancel(value: Boolean): Self = this.set("cancel", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCancel: Self = this.set("cancel", js.undefined)
    @scala.inline
    def setData(value: js.Any): Self = this.set("data", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteData: Self = this.set("data", js.undefined)
    @scala.inline
    def setForeignKeyData(value: js.Any): Self = this.set("foreignKeyData", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteForeignKeyData: Self = this.set("foreignKeyData", js.undefined)
    @scala.inline
    def setModel(value: js.Any): Self = this.set("model", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteModel: Self = this.set("model", js.undefined)
    @scala.inline
    def setRow(value: js.Any): Self = this.set("row", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRow: Self = this.set("row", js.undefined)
    @scala.inline
    def setRowData(value: js.Any): Self = this.set("rowData", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRowData: Self = this.set("rowData", js.undefined)
    @scala.inline
    def setType(value: String): Self = this.set("type", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteType: Self = this.set("type", js.undefined)
  }
  
}

