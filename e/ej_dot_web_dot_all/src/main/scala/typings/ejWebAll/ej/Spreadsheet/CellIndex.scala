package typings.ejWebAll.ej.Spreadsheet

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CellIndex extends js.Object {
  /** Pass the column index of the starting cell
    */
  var colIndex: js.UndefOr[Double] = js.undefined
  /** Pass the row index of the starting cell
    */
  var rowIndex: js.UndefOr[Double] = js.undefined
}

object CellIndex {
  @scala.inline
  def apply(colIndex: js.UndefOr[Double] = js.undefined, rowIndex: js.UndefOr[Double] = js.undefined): CellIndex = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(colIndex)) __obj.updateDynamic("colIndex")(colIndex.get.asInstanceOf[js.Any])
    if (!js.isUndefined(rowIndex)) __obj.updateDynamic("rowIndex")(rowIndex.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[CellIndex]
  }
}

