package typings.ejWebAll.ej.TreeGrid

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SelectedCellIndex extends js.Object {
  /** Specifies the cell index to be selected in the row.
    */
  var cellIndex: js.UndefOr[Double] = js.undefined
  /** Specifies the row index of the cell to be selected in TreeGrid control
    */
  var rowIndex: js.UndefOr[Double] = js.undefined
}

object SelectedCellIndex {
  @scala.inline
  def apply(cellIndex: js.UndefOr[Double] = js.undefined, rowIndex: js.UndefOr[Double] = js.undefined): SelectedCellIndex = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(cellIndex)) __obj.updateDynamic("cellIndex")(cellIndex.get.asInstanceOf[js.Any])
    if (!js.isUndefined(rowIndex)) __obj.updateDynamic("rowIndex")(rowIndex.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[SelectedCellIndex]
  }
}

