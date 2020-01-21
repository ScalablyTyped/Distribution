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
  def apply(colIndex: Int | Double = null, rowIndex: Int | Double = null): CellIndex = {
    val __obj = js.Dynamic.literal()
    if (colIndex != null) __obj.updateDynamic("colIndex")(colIndex.asInstanceOf[js.Any])
    if (rowIndex != null) __obj.updateDynamic("rowIndex")(rowIndex.asInstanceOf[js.Any])
    __obj.asInstanceOf[CellIndex]
  }
}

