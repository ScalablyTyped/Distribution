package typings.gapiClientSheets.gapi.client.sheets

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
  var fields: js.UndefOr[String] = js.undefined
  /** The data to append. */
  var rows: js.UndefOr[js.Array[RowData]] = js.undefined
  /** The sheet ID to append the data to. */
  var sheetId: js.UndefOr[Double] = js.undefined
}

object AppendCellsRequest {
  @scala.inline
  def apply(fields: String = null, rows: js.Array[RowData] = null, sheetId: Int | Double = null): AppendCellsRequest = {
    val __obj = js.Dynamic.literal()
    if (fields != null) __obj.updateDynamic("fields")(fields.asInstanceOf[js.Any])
    if (rows != null) __obj.updateDynamic("rows")(rows.asInstanceOf[js.Any])
    if (sheetId != null) __obj.updateDynamic("sheetId")(sheetId.asInstanceOf[js.Any])
    __obj.asInstanceOf[AppendCellsRequest]
  }
}

