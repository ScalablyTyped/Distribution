package typings.ejWebAll.ej.datavisualization.HeatMap

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CellMouseEnterEventArgs extends js.Object {
  /** Returns the specific HeatMap cell
    */
  var cell: js.UndefOr[js.Any] = js.native
  /** Value displayed on the cell
    */
  var cellValue: js.UndefOr[String] = js.native
  /** Returns the HeatMap cell data
    */
  var source: js.UndefOr[js.Any] = js.native
}

object CellMouseEnterEventArgs {
  @scala.inline
  def apply(): CellMouseEnterEventArgs = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CellMouseEnterEventArgs]
  }
  @scala.inline
  implicit class CellMouseEnterEventArgsOps[Self <: CellMouseEnterEventArgs] (val x: Self) extends AnyVal {
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
    def setCell(value: js.Any): Self = this.set("cell", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCell: Self = this.set("cell", js.undefined)
    @scala.inline
    def setCellValue(value: String): Self = this.set("cellValue", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCellValue: Self = this.set("cellValue", js.undefined)
    @scala.inline
    def setSource(value: js.Any): Self = this.set("source", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSource: Self = this.set("source", js.undefined)
  }
  
}

