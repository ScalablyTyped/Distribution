package typings.ejWebAll.ej.Spreadsheet

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CellIndex extends js.Object {
  /** Pass the column index of the starting cell
    */
  var colIndex: js.UndefOr[Double] = js.native
  /** Pass the row index of the starting cell
    */
  var rowIndex: js.UndefOr[Double] = js.native
}

object CellIndex {
  @scala.inline
  def apply(): CellIndex = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CellIndex]
  }
  @scala.inline
  implicit class CellIndexOps[Self <: CellIndex] (val x: Self) extends AnyVal {
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
    def setColIndex(value: Double): Self = this.set("colIndex", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteColIndex: Self = this.set("colIndex", js.undefined)
    @scala.inline
    def setRowIndex(value: Double): Self = this.set("rowIndex", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRowIndex: Self = this.set("rowIndex", js.undefined)
  }
  
}

