package typings.googleAppsScript.GoogleAppsScript.Sheets.Schema

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
    totalUpdatedCells: js.UndefOr[Double] = js.undefined,
    totalUpdatedColumns: js.UndefOr[Double] = js.undefined,
    totalUpdatedRows: js.UndefOr[Double] = js.undefined,
    totalUpdatedSheets: js.UndefOr[Double] = js.undefined
  ): BatchUpdateValuesResponse = {
    val __obj = js.Dynamic.literal()
    if (responses != null) __obj.updateDynamic("responses")(responses.asInstanceOf[js.Any])
    if (spreadsheetId != null) __obj.updateDynamic("spreadsheetId")(spreadsheetId.asInstanceOf[js.Any])
    if (!js.isUndefined(totalUpdatedCells)) __obj.updateDynamic("totalUpdatedCells")(totalUpdatedCells.get.asInstanceOf[js.Any])
    if (!js.isUndefined(totalUpdatedColumns)) __obj.updateDynamic("totalUpdatedColumns")(totalUpdatedColumns.get.asInstanceOf[js.Any])
    if (!js.isUndefined(totalUpdatedRows)) __obj.updateDynamic("totalUpdatedRows")(totalUpdatedRows.get.asInstanceOf[js.Any])
    if (!js.isUndefined(totalUpdatedSheets)) __obj.updateDynamic("totalUpdatedSheets")(totalUpdatedSheets.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[BatchUpdateValuesResponse]
  }
}

