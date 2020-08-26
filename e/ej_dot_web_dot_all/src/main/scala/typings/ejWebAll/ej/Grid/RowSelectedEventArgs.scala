package typings.ejWebAll.ej.Grid

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait RowSelectedEventArgs extends js.Object {
  /** Returns the cancel option value.
    */
  var cancel: js.UndefOr[Boolean] = js.native
  /** Returns current record object (JSON).
    */
  var data: js.UndefOr[js.Any] = js.native
  /** Returns the foreign key record object (JSON).
    */
  var foreignKeyData: js.UndefOr[js.Any] = js.native
  /** Returns the grid model.
    */
  var model: js.UndefOr[js.Any] = js.native
  /** Returns the previous selected row element.
    */
  var prevRow: js.UndefOr[js.Any] = js.native
  /** Returns the previous selected row index.
    */
  var prevRowIndex: js.UndefOr[Double] = js.native
  /** Returns the current selected row.
    */
  var row: js.UndefOr[js.Any] = js.native
  /** Returns the row index of the selected row.
    */
  var rowIndex: js.UndefOr[Double] = js.native
  /** Returns current record object (JSON).
    */
  var selectedData: js.UndefOr[js.Any] = js.native
  /** Returns the name of the event.
    */
  var `type`: js.UndefOr[String] = js.native
}

object RowSelectedEventArgs {
  @scala.inline
  def apply(): RowSelectedEventArgs = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[RowSelectedEventArgs]
  }
  @scala.inline
  implicit class RowSelectedEventArgsOps[Self <: RowSelectedEventArgs] (val x: Self) extends AnyVal {
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
    def setPrevRow(value: js.Any): Self = this.set("prevRow", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePrevRow: Self = this.set("prevRow", js.undefined)
    @scala.inline
    def setPrevRowIndex(value: Double): Self = this.set("prevRowIndex", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePrevRowIndex: Self = this.set("prevRowIndex", js.undefined)
    @scala.inline
    def setRow(value: js.Any): Self = this.set("row", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRow: Self = this.set("row", js.undefined)
    @scala.inline
    def setRowIndex(value: Double): Self = this.set("rowIndex", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRowIndex: Self = this.set("rowIndex", js.undefined)
    @scala.inline
    def setSelectedData(value: js.Any): Self = this.set("selectedData", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSelectedData: Self = this.set("selectedData", js.undefined)
    @scala.inline
    def setType(value: String): Self = this.set("type", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteType: Self = this.set("type", js.undefined)
  }
  
}

