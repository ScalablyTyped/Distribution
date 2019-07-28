package typings.gapiDotClientDotSheets.gapiNs.clientNs.sheetsNs

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
    updatedCells: Int | Double = null,
    updatedColumns: Int | Double = null,
    updatedData: ValueRange = null,
    updatedRange: String = null,
    updatedRows: Int | Double = null
  ): UpdateValuesResponse = {
    val __obj = js.Dynamic.literal()
    if (spreadsheetId != null) __obj.updateDynamic("spreadsheetId")(spreadsheetId)
    if (updatedCells != null) __obj.updateDynamic("updatedCells")(updatedCells.asInstanceOf[js.Any])
    if (updatedColumns != null) __obj.updateDynamic("updatedColumns")(updatedColumns.asInstanceOf[js.Any])
    if (updatedData != null) __obj.updateDynamic("updatedData")(updatedData)
    if (updatedRange != null) __obj.updateDynamic("updatedRange")(updatedRange)
    if (updatedRows != null) __obj.updateDynamic("updatedRows")(updatedRows.asInstanceOf[js.Any])
    __obj.asInstanceOf[UpdateValuesResponse]
  }
}

