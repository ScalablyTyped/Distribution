package typings.googleAppsScript.GoogleAppsScript.Sheets.Schema

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait UpdateValuesResponse extends js.Object {
  var spreadsheetId: js.UndefOr[String] = js.undefined
  var updatedCells: js.UndefOr[Double] = js.undefined
  var updatedColumns: js.UndefOr[Double] = js.undefined
  var updatedData: js.UndefOr[ValueRange] = js.undefined
  var updatedRange: js.UndefOr[String] = js.undefined
  var updatedRows: js.UndefOr[Double] = js.undefined
}

object UpdateValuesResponse {
  @scala.inline
  def apply(
    spreadsheetId: String = null,
    updatedCells: js.UndefOr[Double] = js.undefined,
    updatedColumns: js.UndefOr[Double] = js.undefined,
    updatedData: ValueRange = null,
    updatedRange: String = null,
    updatedRows: js.UndefOr[Double] = js.undefined
  ): UpdateValuesResponse = {
    val __obj = js.Dynamic.literal()
    if (spreadsheetId != null) __obj.updateDynamic("spreadsheetId")(spreadsheetId.asInstanceOf[js.Any])
    if (!js.isUndefined(updatedCells)) __obj.updateDynamic("updatedCells")(updatedCells.get.asInstanceOf[js.Any])
    if (!js.isUndefined(updatedColumns)) __obj.updateDynamic("updatedColumns")(updatedColumns.get.asInstanceOf[js.Any])
    if (updatedData != null) __obj.updateDynamic("updatedData")(updatedData.asInstanceOf[js.Any])
    if (updatedRange != null) __obj.updateDynamic("updatedRange")(updatedRange.asInstanceOf[js.Any])
    if (!js.isUndefined(updatedRows)) __obj.updateDynamic("updatedRows")(updatedRows.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[UpdateValuesResponse]
  }
}

