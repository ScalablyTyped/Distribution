package typings
package gapiDotClientDotSlidesLib.gapiNs.clientNs.slidesNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait InsertTableColumnsRequest extends js.Object {
  /**
    * The reference table cell location from which columns will be inserted.
    *
    * A new column will be inserted to the left (or right) of the column where
    * the reference cell is. If the reference cell is a merged cell, a new
    * column will be inserted to the left (or right) of the merged cell.
    */
  var cellLocation: js.UndefOr[TableCellLocation] = js.undefined
  /**
    * Whether to insert new columns to the right of the reference cell location.
    *
    * - `True`: insert to the right.
    * - `False`: insert to the left.
    */
  var insertRight: js.UndefOr[scala.Boolean] = js.undefined
  /** The number of columns to be inserted. Maximum 20 per request. */
  var number: js.UndefOr[scala.Double] = js.undefined
  /** The table to insert columns into. */
  var tableObjectId: js.UndefOr[java.lang.String] = js.undefined
}

