package typings.googleDashAppsDashScript.GoogleAppsScriptNs.SheetsNs.SchemaNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait BatchUpdateSpreadsheetResponse extends js.Object {
  var replies: js.UndefOr[js.Array[Response]] = js.undefined
  var spreadsheetId: js.UndefOr[String] = js.undefined
  var updatedSpreadsheet: js.UndefOr[Spreadsheet] = js.undefined
}

object BatchUpdateSpreadsheetResponse {
  @scala.inline
  def apply(
    replies: js.Array[Response] = null,
    spreadsheetId: String = null,
    updatedSpreadsheet: Spreadsheet = null
  ): BatchUpdateSpreadsheetResponse = {
    val __obj = js.Dynamic.literal()
    if (replies != null) __obj.updateDynamic("replies")(replies)
    if (spreadsheetId != null) __obj.updateDynamic("spreadsheetId")(spreadsheetId)
    if (updatedSpreadsheet != null) __obj.updateDynamic("updatedSpreadsheet")(updatedSpreadsheet)
    __obj.asInstanceOf[BatchUpdateSpreadsheetResponse]
  }
}

