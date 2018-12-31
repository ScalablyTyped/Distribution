package typings
package gapiDotClientDotSheetsLib.gapiNs.clientNs.sheetsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait InsertRangeRequest extends js.Object {
  /** The range to insert new cells into. */
  var range: js.UndefOr[GridRange] = js.undefined
  /**
    * The dimension which will be shifted when inserting cells.
    * If ROWS, existing cells will be shifted down.
    * If COLUMNS, existing cells will be shifted right.
    */
  var shiftDimension: js.UndefOr[java.lang.String] = js.undefined
}

