package typings
package gapiDotClientDotSheetsLib.gapiNs.clientNs.sheetsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait InsertDimensionRequest extends js.Object {
  /**
    * Whether dimension properties should be extended from the dimensions
    * before or after the newly inserted dimensions.
    * True to inherit from the dimensions before (in which case the start
    * index must be greater than 0), and false to inherit from the dimensions
    * after.
    *
    * For example, if row index 0 has red background and row index 1
    * has a green background, then inserting 2 rows at index 1 can inherit
    * either the green or red background.  If `inheritFromBefore` is true,
    * the two new rows will be red (because the row before the insertion point
    * was red), whereas if `inheritFromBefore` is false, the two new rows will
    * be green (because the row after the insertion point was green).
    */
  var inheritFromBefore: js.UndefOr[scala.Boolean] = js.undefined
  /** The dimensions to insert.  Both the start and end indexes must be bounded. */
  var range: js.UndefOr[DimensionRange] = js.undefined
}

