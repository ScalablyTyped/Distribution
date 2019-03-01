package typings
package gapiDotClientDotSheetsLib.gapiNs.clientNs.sheetsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AppendCellsRequest extends js.Object {
  /**
    * The fields of CellData that should be updated.
    * At least one field must be specified.
    * The root is the CellData; 'row.values.' should not be specified.
    * A single `"&#42;"` can be used as short-hand for listing every field.
    */
  var fields: js.UndefOr[java.lang.String] = js.undefined
  /** The data to append. */
  var rows: js.UndefOr[js.Array[RowData]] = js.undefined
  /** The sheet ID to append the data to. */
  var sheetId: js.UndefOr[scala.Double] = js.undefined
}

object AppendCellsRequest {
  @scala.inline
  def apply(
    fields: java.lang.String = null,
    rows: js.Array[RowData] = null,
    sheetId: scala.Int | scala.Double = null
  ): AppendCellsRequest = {
    val __obj = js.Dynamic.literal()
    if (fields != null) __obj.updateDynamic("fields")(fields)
    if (rows != null) __obj.updateDynamic("rows")(rows)
    if (sheetId != null) __obj.updateDynamic("sheetId")(sheetId.asInstanceOf[js.Any])
    __obj.asInstanceOf[AppendCellsRequest]
  }
}

