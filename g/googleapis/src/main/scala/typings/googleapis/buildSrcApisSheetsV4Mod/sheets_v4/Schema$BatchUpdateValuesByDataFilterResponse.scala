package typings.googleapis.buildSrcApisSheetsV4Mod.sheets_v4

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * The response when updating a range of values in a spreadsheet.
  */
@js.native
trait Schema$BatchUpdateValuesByDataFilterResponse extends js.Object {
  /**
    * The response for each range updated.
    */
  var responses: js.UndefOr[js.Array[Schema$UpdateValuesByDataFilterResponse]] = js.native
  /**
    * The spreadsheet the updates were applied to.
    */
  var spreadsheetId: js.UndefOr[String] = js.native
  /**
    * The total number of cells updated.
    */
  var totalUpdatedCells: js.UndefOr[Double] = js.native
  /**
    * The total number of columns where at least one cell in the column was
    * updated.
    */
  var totalUpdatedColumns: js.UndefOr[Double] = js.native
  /**
    * The total number of rows where at least one cell in the row was updated.
    */
  var totalUpdatedRows: js.UndefOr[Double] = js.native
  /**
    * The total number of sheets where at least one cell in the sheet was
    * updated.
    */
  var totalUpdatedSheets: js.UndefOr[Double] = js.native
}

object Schema$BatchUpdateValuesByDataFilterResponse {
  @scala.inline
  def apply(
    responses: js.Array[Schema$UpdateValuesByDataFilterResponse] = null,
    spreadsheetId: String = null,
    totalUpdatedCells: Int | Double = null,
    totalUpdatedColumns: Int | Double = null,
    totalUpdatedRows: Int | Double = null,
    totalUpdatedSheets: Int | Double = null
  ): Schema$BatchUpdateValuesByDataFilterResponse = {
    val __obj = js.Dynamic.literal()
    if (responses != null) __obj.updateDynamic("responses")(responses.asInstanceOf[js.Any])
    if (spreadsheetId != null) __obj.updateDynamic("spreadsheetId")(spreadsheetId.asInstanceOf[js.Any])
    if (totalUpdatedCells != null) __obj.updateDynamic("totalUpdatedCells")(totalUpdatedCells.asInstanceOf[js.Any])
    if (totalUpdatedColumns != null) __obj.updateDynamic("totalUpdatedColumns")(totalUpdatedColumns.asInstanceOf[js.Any])
    if (totalUpdatedRows != null) __obj.updateDynamic("totalUpdatedRows")(totalUpdatedRows.asInstanceOf[js.Any])
    if (totalUpdatedSheets != null) __obj.updateDynamic("totalUpdatedSheets")(totalUpdatedSheets.asInstanceOf[js.Any])
    __obj.asInstanceOf[Schema$BatchUpdateValuesByDataFilterResponse]
  }
}

