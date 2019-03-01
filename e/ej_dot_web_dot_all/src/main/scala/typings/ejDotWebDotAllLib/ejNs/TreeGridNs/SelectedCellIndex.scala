package typings
package ejDotWebDotAllLib.ejNs.TreeGridNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SelectedCellIndex extends js.Object {
  /** Specifies the cell index to be selected in the row.
    */
  var cellIndex: js.UndefOr[scala.Double] = js.undefined
  /** Specifies the row index of the cell to be selected in TreeGrid control
    */
  var rowIndex: js.UndefOr[scala.Double] = js.undefined
}

object SelectedCellIndex {
  @scala.inline
  def apply(cellIndex: scala.Int | scala.Double = null, rowIndex: scala.Int | scala.Double = null): SelectedCellIndex = {
    val __obj = js.Dynamic.literal()
    if (cellIndex != null) __obj.updateDynamic("cellIndex")(cellIndex.asInstanceOf[js.Any])
    if (rowIndex != null) __obj.updateDynamic("rowIndex")(rowIndex.asInstanceOf[js.Any])
    __obj.asInstanceOf[SelectedCellIndex]
  }
}

