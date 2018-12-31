package typings
package gapiDotClientDotSheetsLib.gapiNs.clientNs.sheetsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DeleteRangeRequest extends js.Object {
  /** The range of cells to delete. */
  var range: js.UndefOr[GridRange] = js.undefined
  /**
    * The dimension from which deleted cells will be replaced with.
    * If ROWS, existing cells will be shifted upward to
    * replace the deleted cells. If COLUMNS, existing cells
    * will be shifted left to replace the deleted cells.
    */
  var shiftDimension: js.UndefOr[java.lang.String] = js.undefined
}

