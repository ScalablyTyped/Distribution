package typings.gapiDotClientDotSheets.gapi.client.sheets

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ClearValuesResponse extends js.Object {
  /**
    * The range (in A1 notation) that was cleared.
    * (If the request was for an unbounded range or a ranger larger
    * than the bounds of the sheet, this will be the actual range
    * that was cleared, bounded to the sheet's limits.)
    */
  var clearedRange: js.UndefOr[String] = js.undefined
  /** The spreadsheet the updates were applied to. */
  var spreadsheetId: js.UndefOr[String] = js.undefined
}

object ClearValuesResponse {
  @scala.inline
  def apply(clearedRange: String = null, spreadsheetId: String = null): ClearValuesResponse = {
    val __obj = js.Dynamic.literal()
    if (clearedRange != null) __obj.updateDynamic("clearedRange")(clearedRange.asInstanceOf[js.Any])
    if (spreadsheetId != null) __obj.updateDynamic("spreadsheetId")(spreadsheetId.asInstanceOf[js.Any])
    __obj.asInstanceOf[ClearValuesResponse]
  }
}

