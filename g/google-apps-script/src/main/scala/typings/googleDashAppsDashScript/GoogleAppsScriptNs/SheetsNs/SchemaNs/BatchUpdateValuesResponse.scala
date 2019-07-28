package typings.googleDashAppsDashScript.GoogleAppsScriptNs.SheetsNs.SchemaNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait BatchUpdateValuesResponse extends js.Object {
  var responses: js.UndefOr[js.Array[UpdateValuesResponse]] = js.undefined
  var spreadsheetId: js.UndefOr[String] = js.undefined
  var totalUpdatedCells: js.UndefOr[Double] = js.undefined
  var totalUpdatedColumns: js.UndefOr[Double] = js.undefined
  var totalUpdatedRows: js.UndefOr[Double] = js.undefined
  var totalUpdatedSheets: js.UndefOr[Double] = js.undefined
}

object BatchUpdateValuesResponse {
  @scala.inline
  def apply(
    responses: js.Array[UpdateValuesResponse] = null,
    spreadsheetId: String = null,
    totalUpdatedCells: Int | Double = null,
    totalUpdatedColumns: Int | Double = null,
    totalUpdatedRows: Int | Double = null,
    totalUpdatedSheets: Int | Double = null
  ): BatchUpdateValuesResponse = {
    val __obj = js.Dynamic.literal()
    if (responses != null) __obj.updateDynamic("responses")(responses)
    if (spreadsheetId != null) __obj.updateDynamic("spreadsheetId")(spreadsheetId)
    if (totalUpdatedCells != null) __obj.updateDynamic("totalUpdatedCells")(totalUpdatedCells.asInstanceOf[js.Any])
    if (totalUpdatedColumns != null) __obj.updateDynamic("totalUpdatedColumns")(totalUpdatedColumns.asInstanceOf[js.Any])
    if (totalUpdatedRows != null) __obj.updateDynamic("totalUpdatedRows")(totalUpdatedRows.asInstanceOf[js.Any])
    if (totalUpdatedSheets != null) __obj.updateDynamic("totalUpdatedSheets")(totalUpdatedSheets.asInstanceOf[js.Any])
    __obj.asInstanceOf[BatchUpdateValuesResponse]
  }
}

