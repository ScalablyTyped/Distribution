package typings
package gapiDotClientDotSheetsLib.gapiNs.clientNs.sheetsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GridCoordinate extends js.Object {
  /** The column index of the coordinate. */
  var columnIndex: js.UndefOr[scala.Double] = js.undefined
  /** The row index of the coordinate. */
  var rowIndex: js.UndefOr[scala.Double] = js.undefined
  /** The sheet this coordinate is on. */
  var sheetId: js.UndefOr[scala.Double] = js.undefined
}

object GridCoordinate {
  @scala.inline
  def apply(
    columnIndex: scala.Int | scala.Double = null,
    rowIndex: scala.Int | scala.Double = null,
    sheetId: scala.Int | scala.Double = null
  ): GridCoordinate = {
    val __obj = js.Dynamic.literal()
    if (columnIndex != null) __obj.updateDynamic("columnIndex")(columnIndex.asInstanceOf[js.Any])
    if (rowIndex != null) __obj.updateDynamic("rowIndex")(rowIndex.asInstanceOf[js.Any])
    if (sheetId != null) __obj.updateDynamic("sheetId")(sheetId.asInstanceOf[js.Any])
    __obj.asInstanceOf[GridCoordinate]
  }
}

