package typings.gapiClientSheets.gapi.client.sheets

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait UpdateValuesResponse extends js.Object {
  /** The spreadsheet the updates were applied to. */
  var spreadsheetId: js.UndefOr[String] = js.undefined
  /** The number of cells updated. */
  var updatedCells: js.UndefOr[Double] = js.undefined
  /** The number of columns where at least one cell in the column was updated. */
  var updatedColumns: js.UndefOr[Double] = js.undefined
  /**
    * The values of the cells after updates were applied.
    * This is only included if the request's `includeValuesInResponse` field
    * was `true`.
    */
  var updatedData: js.UndefOr[ValueRange] = js.undefined
  /** The range (in A1 notation) that updates were applied to. */
  var updatedRange: js.UndefOr[String] = js.undefined
  /** The number of rows where at least one cell in the row was updated. */
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

