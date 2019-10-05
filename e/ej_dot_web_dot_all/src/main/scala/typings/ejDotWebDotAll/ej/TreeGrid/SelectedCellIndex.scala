package typings.ejDotWebDotAll.ej.TreeGrid

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
  def apply(cellIndex: Int | Double = null, rowIndex: Int | Double = null): SelectedCellIndex = {
    val __obj = js.Dynamic.literal()
    if (cellIndex != null) __obj.updateDynamic("cellIndex")(cellIndex.asInstanceOf[js.Any])
    if (rowIndex != null) __obj.updateDynamic("rowIndex")(rowIndex.asInstanceOf[js.Any])
    __obj.asInstanceOf[SelectedCellIndex]
  }
}

