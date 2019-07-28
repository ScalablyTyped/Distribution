package typings.gapiDotClientDotSheets.gapiNs.clientNs.sheetsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait BatchUpdateValuesByDataFilterResponse extends js.Object {
  /** The response for each range updated. */
  var responses: js.UndefOr[js.Array[UpdateValuesByDataFilterResponse]] = js.undefined
  /** The spreadsheet the updates were applied to. */
  var spreadsheetId: js.UndefOr[String] = js.undefined
  /** The total number of cells updated. */
  var totalUpdatedCells: js.UndefOr[Double] = js.undefined
  /**
    * The total number of columns where at least one cell in the column was
    * updated.
    */
  var totalUpdatedColumns: js.UndefOr[Double] = js.undefined
  /** The total number of rows where at least one cell in the row was updated. */
  var totalUpdatedRows: js.UndefOr[Double] = js.undefined
  /**
    * The total number of sheets where at least one cell in the sheet was
    * updated.
    */
  var totalUpdatedSheets: js.UndefOr[Double] = js.undefined
}

object BatchUpdateValuesByDataFilterResponse {
  @scala.inline
  def apply(
    responses: js.Array[UpdateValuesByDataFilterResponse] = null,
    spreadsheetId: String = null,
    totalUpdatedCells: Int | Double = null,
    totalUpdatedColumns: Int | Double = null,
    totalUpdatedRows: Int | Double = null,
    totalUpdatedSheets: Int | Double = null
  ): BatchUpdateValuesByDataFilterResponse = {
    val __obj = js.Dynamic.literal()
    if (responses != null) __obj.updateDynamic("responses")(responses)
    if (spreadsheetId != null) __obj.updateDynamic("spreadsheetId")(spreadsheetId)
    if (totalUpdatedCells != null) __obj.updateDynamic("totalUpdatedCells")(totalUpdatedCells.asInstanceOf[js.Any])
    if (totalUpdatedColumns != null) __obj.updateDynamic("totalUpdatedColumns")(totalUpdatedColumns.asInstanceOf[js.Any])
    if (totalUpdatedRows != null) __obj.updateDynamic("totalUpdatedRows")(totalUpdatedRows.asInstanceOf[js.Any])
    if (totalUpdatedSheets != null) __obj.updateDynamic("totalUpdatedSheets")(totalUpdatedSheets.asInstanceOf[js.Any])
    __obj.asInstanceOf[BatchUpdateValuesByDataFilterResponse]
  }
}

