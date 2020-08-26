package typings.ejWebAll.ej.Grid

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait RowDeselectingEventArgs extends js.Object {
  /** Returns current record object (JSON).
    */
  var data: js.UndefOr[js.Any] = js.native
  /** Returns whether the ctrl key is pressed while deselecting row
    */
  var isCtrlKeyPressed: js.UndefOr[Boolean] = js.native
  /** Returns whether the shift key is pressed while deselecting row
    */
  var isShiftKeyPressed: js.UndefOr[Boolean] = js.native
  /** Returns the grid model.
    */
  var model: js.UndefOr[js.Any] = js.native
  /** Returns the deselecting row element.
    */
  var row: js.UndefOr[js.Any] = js.native
  /** Returns the deselecting row index value.
    */
  var rowIndex: js.UndefOr[Double] = js.native
  /** Returns current record object (JSON).
    */
  var selectedData: js.UndefOr[js.Any] = js.native
  /** Returns the name of the event.
    */
  var `type`: js.UndefOr[String] = js.native
}

object RowDeselectingEventArgs {
  @scala.inline
  def apply(): RowDeselectingEventArgs = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[RowDeselectingEventArgs]
  }
  @scala.inline
  implicit class RowDeselectingEventArgsOps[Self <: RowDeselectingEventArgs] (val x: Self) extends AnyVal {
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
    def setData(value: js.Any): Self = this.set("data", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteData: Self = this.set("data", js.undefined)
    @scala.inline
    def setIsCtrlKeyPressed(value: Boolean): Self = this.set("isCtrlKeyPressed", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteIsCtrlKeyPressed: Self = this.set("isCtrlKeyPressed", js.undefined)
    @scala.inline
    def setIsShiftKeyPressed(value: Boolean): Self = this.set("isShiftKeyPressed", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteIsShiftKeyPressed: Self = this.set("isShiftKeyPressed", js.undefined)
    @scala.inline
    def setModel(value: js.Any): Self = this.set("model", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteModel: Self = this.set("model", js.undefined)
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

