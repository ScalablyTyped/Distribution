package typings
package ejDotWebDotAllLib.ejNs.SpreadsheetNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CellIndex extends js.Object {
  /** Pass the column index of the starting cell
    */
  var colIndex: js.UndefOr[scala.Double] = js.undefined
  /** Pass the row index of the starting cell
    */
  var rowIndex: js.UndefOr[scala.Double] = js.undefined
}

object CellIndex {
  @scala.inline
  def apply(colIndex: scala.Int | scala.Double = null, rowIndex: scala.Int | scala.Double = null): CellIndex = {
    val __obj = js.Dynamic.literal()
    if (colIndex != null) __obj.updateDynamic("colIndex")(colIndex.asInstanceOf[js.Any])
    if (rowIndex != null) __obj.updateDynamic("rowIndex")(rowIndex.asInstanceOf[js.Any])
    __obj.asInstanceOf[CellIndex]
  }
}

