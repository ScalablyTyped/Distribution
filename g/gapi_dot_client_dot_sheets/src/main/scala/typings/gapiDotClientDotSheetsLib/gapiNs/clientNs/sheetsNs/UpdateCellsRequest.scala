package typings
package gapiDotClientDotSheetsLib.gapiNs.clientNs.sheetsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait UpdateCellsRequest extends js.Object {
  /**
    * The fields of CellData that should be updated.
    * At least one field must be specified.
    * The root is the CellData; 'row.values.' should not be specified.
    * A single `"&#42;"` can be used as short-hand for listing every field.
    */
  var fields: js.UndefOr[java.lang.String] = js.undefined
  /**
    * The range to write data to.
    *
    * If the data in rows does not cover the entire requested range,
    * the fields matching those set in fields will be cleared.
    */
  var range: js.UndefOr[GridRange] = js.undefined
  /** The data to write. */
  var rows: js.UndefOr[js.Array[RowData]] = js.undefined
  /**
    * The coordinate to start writing data at.
    * Any number of rows and columns (including a different number of
    * columns per row) may be written.
    */
  var start: js.UndefOr[GridCoordinate] = js.undefined
}

object UpdateCellsRequest {
  @scala.inline
  def apply(
    fields: java.lang.String = null,
    range: GridRange = null,
    rows: js.Array[RowData] = null,
    start: GridCoordinate = null
  ): UpdateCellsRequest = {
    val __obj = js.Dynamic.literal()
    if (fields != null) __obj.updateDynamic("fields")(fields)
    if (range != null) __obj.updateDynamic("range")(range)
    if (rows != null) __obj.updateDynamic("rows")(rows)
    if (start != null) __obj.updateDynamic("start")(start)
    __obj.asInstanceOf[UpdateCellsRequest]
  }
}

