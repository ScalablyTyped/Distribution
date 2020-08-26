package typings.ejWebAll.ej.Grid

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CellDeselectedEventArgs extends js.Object {
  /** Returns the deselected cell index value.
    */
  var cellIndex: js.UndefOr[Double] = js.native
  /** Returns the deselected cell element.
    */
  var currentCell: js.UndefOr[js.Any] = js.native
  /** Returns current record object (JSON).
    */
  var data: js.UndefOr[js.Any] = js.native
  /** Returns the grid model.
    */
  var model: js.UndefOr[js.Any] = js.native
  /** Returns current record object (JSON).
    */
  var selectedData: js.UndefOr[js.Any] = js.native
  /** Returns the name of the event.
    */
  var `type`: js.UndefOr[String] = js.native
}

object CellDeselectedEventArgs {
  @scala.inline
  def apply(): CellDeselectedEventArgs = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CellDeselectedEventArgs]
  }
  @scala.inline
  implicit class CellDeselectedEventArgsOps[Self <: CellDeselectedEventArgs] (val x: Self) extends AnyVal {
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
    def setCellIndex(value: Double): Self = this.set("cellIndex", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCellIndex: Self = this.set("cellIndex", js.undefined)
    @scala.inline
    def setCurrentCell(value: js.Any): Self = this.set("currentCell", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCurrentCell: Self = this.set("currentCell", js.undefined)
    @scala.inline
    def setData(value: js.Any): Self = this.set("data", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteData: Self = this.set("data", js.undefined)
    @scala.inline
    def setModel(value: js.Any): Self = this.set("model", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteModel: Self = this.set("model", js.undefined)
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

