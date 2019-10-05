package typings.googleDashAppsDashScript.GoogleAppsScript.Sheets.Schema

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ClearValuesResponse extends js.Object {
  var clearedRange: js.UndefOr[String] = js.undefined
  var spreadsheetId: js.UndefOr[String] = js.undefined
}

object ClearValuesResponse {
  @scala.inline
  def apply(clearedRange: String = null, spreadsheetId: String = null): ClearValuesResponse = {
    val __obj = js.Dynamic.literal()
    if (clearedRange != null) __obj.updateDynamic("clearedRange")(clearedRange)
    if (spreadsheetId != null) __obj.updateDynamic("spreadsheetId")(spreadsheetId)
    __obj.asInstanceOf[ClearValuesResponse]
  }
}

