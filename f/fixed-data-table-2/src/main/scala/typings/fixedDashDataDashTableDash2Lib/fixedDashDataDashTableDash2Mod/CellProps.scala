package typings
package fixedDashDataDashTableDash2Lib.fixedDashDataDashTableDash2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CellProps
  extends reactLib.reactMod.ReactNs.HTMLAttributes[Cell] {
  /**
    * Optional prop that if specified on the `Column` will be passed to the
    * cell. It can be used to uniquely identify which column is the cell is in.
    */
  var columnKey: js.UndefOr[java.lang.String | scala.Double] = js.undefined
  /**
    * Outer height of the cell.
    */
  var height: js.UndefOr[scala.Double] = js.undefined
  /**
    * Optional prop that represents the rows index in the table.
    * For the 'cell' prop of a Column, this parameter will exist for any
    * cell in a row with a positive index.
    *
    * Below that entry point the user is welcome to consume or
    * pass the prop through at their discretion.
    */
  var rowIndex: js.UndefOr[scala.Double] = js.undefined
  /**
    * Outer width of the cell.
    */
  var width: js.UndefOr[scala.Double] = js.undefined
}

