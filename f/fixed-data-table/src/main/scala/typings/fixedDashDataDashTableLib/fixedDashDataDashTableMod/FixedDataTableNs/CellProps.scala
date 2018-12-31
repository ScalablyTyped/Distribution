package typings
package fixedDashDataDashTableLib.fixedDashDataDashTableMod.FixedDataTableNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CellProps
  extends reactLib.reactMod.ReactNs.HTMLAttributes[Cell] {
  /**
    * Optional prop that if specified on the Column will be
    * passed to the cell. It can be used to uniquely identify
    * which column is the cell is in.
    */
  var columnKey: js.UndefOr[java.lang.String | scala.Double] = js.undefined
  /**
    * Outer height of the cell.
    */
  var height: js.UndefOr[scala.Double] = js.undefined
  /**
    * The row index of the cell.
    */
  var rowIndex: js.UndefOr[scala.Double] = js.undefined
  /**
    * Outer width of the cell.
    */
  var width: js.UndefOr[scala.Double] = js.undefined
}

