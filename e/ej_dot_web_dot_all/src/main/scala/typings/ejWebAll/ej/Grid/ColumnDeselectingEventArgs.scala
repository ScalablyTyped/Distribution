package typings.ejWebAll.ej.Grid

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ColumnDeselectingEventArgs extends js.Object {
  /** Returns corresponding column object (JSON).
    */
  var column: js.UndefOr[js.Any] = js.native
  /** Returns the deselecting column index value.
    */
  var columnIndex: js.UndefOr[Double] = js.native
  /** Returns the deselecting column header element.
    */
  var headerCell: js.UndefOr[js.Any] = js.native
  /** Returns whether the ctrl key is pressed while deselecting column
    */
  var isCtrlKeyPressed: js.UndefOr[Boolean] = js.native
  /** Returns whether the shift key is pressed while deselecting column
    */
  var isShiftKeyPressed: js.UndefOr[Boolean] = js.native
  /** Returns the grid model.
    */
  var model: js.UndefOr[js.Any] = js.native
  /** Returns the name of the event.
    */
  var `type`: js.UndefOr[String] = js.native
}

object ColumnDeselectingEventArgs {
  @scala.inline
  def apply(): ColumnDeselectingEventArgs = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ColumnDeselectingEventArgs]
  }
  @scala.inline
  implicit class ColumnDeselectingEventArgsOps[Self <: ColumnDeselectingEventArgs] (val x: Self) extends AnyVal {
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
    def setColumn(value: js.Any): Self = this.set("column", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteColumn: Self = this.set("column", js.undefined)
    @scala.inline
    def setColumnIndex(value: Double): Self = this.set("columnIndex", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteColumnIndex: Self = this.set("columnIndex", js.undefined)
    @scala.inline
    def setHeaderCell(value: js.Any): Self = this.set("headerCell", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteHeaderCell: Self = this.set("headerCell", js.undefined)
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
    def setType(value: String): Self = this.set("type", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteType: Self = this.set("type", js.undefined)
  }
  
}

