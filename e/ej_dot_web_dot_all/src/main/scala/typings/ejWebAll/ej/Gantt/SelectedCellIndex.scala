package typings.ejWebAll.ej.Gantt

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SelectedCellIndex extends js.Object {
  /** Specifies the cell index to be selected in the row.
    * @Default {-1}
    */
  var cellIndex: js.UndefOr[Double] = js.native
  /** Specifies the row index of the cell to be selected Gantt control
    * @Default {-1}
    */
  var rowIndex: js.UndefOr[Double] = js.native
}

object SelectedCellIndex {
  @scala.inline
  def apply(): SelectedCellIndex = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SelectedCellIndex]
  }
  @scala.inline
  implicit class SelectedCellIndexOps[Self <: SelectedCellIndex] (val x: Self) extends AnyVal {
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
    def setRowIndex(value: Double): Self = this.set("rowIndex", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRowIndex: Self = this.set("rowIndex", js.undefined)
  }
  
}

