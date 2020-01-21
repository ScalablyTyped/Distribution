package typings.ejWebAll.ej.Gantt

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SelectedCellIndex extends js.Object {
  /** Specifies the cell index to be selected in the row.
    * @Default {-1}
    */
  var cellIndex: js.UndefOr[Double] = js.undefined
  /** Specifies the row index of the cell to be selected Gantt control
    * @Default {-1}
    */
  var rowIndex: js.UndefOr[Double] = js.undefined
}

object SelectedCellIndex {
  @scala.inline
  def apply(cellIndex: Int | Double = null, rowIndex: Int | Double = null): SelectedCellIndex = {
    val __obj = js.Dynamic.literal()
    if (cellIndex != null) __obj.updateDynamic("cellIndex")(cellIndex.asInstanceOf[js.Any])
    if (rowIndex != null) __obj.updateDynamic("rowIndex")(rowIndex.asInstanceOf[js.Any])
    __obj.asInstanceOf[SelectedCellIndex]
  }
}

