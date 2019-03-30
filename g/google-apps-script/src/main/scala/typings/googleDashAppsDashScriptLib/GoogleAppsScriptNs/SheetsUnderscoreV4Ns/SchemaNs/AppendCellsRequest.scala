package typings
package googleDashAppsDashScriptLib.GoogleAppsScriptNs.SheetsUnderscoreV4Ns.SchemaNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AppendCellsRequest extends js.Object {
  var fields: js.UndefOr[java.lang.String] = js.undefined
  var rows: js.UndefOr[js.Array[RowData]] = js.undefined
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

