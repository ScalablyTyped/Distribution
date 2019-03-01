package typings
package gapiDotClientDotSheetsLib.gapiNs.clientNs.sheetsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait BatchUpdateSpreadsheetResponse extends js.Object {
  /**
    * The reply of the updates.  This maps 1:1 with the updates, although
    * replies to some requests may be empty.
    */
  var replies: js.UndefOr[js.Array[Response]] = js.undefined
  /** The spreadsheet the updates were applied to. */
  var spreadsheetId: js.UndefOr[java.lang.String] = js.undefined
  /**
    * The spreadsheet after updates were applied. This is only set if
    * [BatchUpdateSpreadsheetRequest.include_spreadsheet_in_response] is `true`.
    */
  var updatedSpreadsheet: js.UndefOr[Spreadsheet] = js.undefined
}

object BatchUpdateSpreadsheetResponse {
  @scala.inline
  def apply(
    replies: js.Array[Response] = null,
    spreadsheetId: java.lang.String = null,
    updatedSpreadsheet: Spreadsheet = null
  ): BatchUpdateSpreadsheetResponse = {
    val __obj = js.Dynamic.literal()
    if (replies != null) __obj.updateDynamic("replies")(replies)
    if (spreadsheetId != null) __obj.updateDynamic("spreadsheetId")(spreadsheetId)
    if (updatedSpreadsheet != null) __obj.updateDynamic("updatedSpreadsheet")(updatedSpreadsheet)
    __obj.asInstanceOf[BatchUpdateSpreadsheetResponse]
  }
}

