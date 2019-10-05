package typings.googleDashAppsDashScript.GoogleAppsScript.Sheets.Schema

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AppendValuesResponse extends js.Object {
  var spreadsheetId: js.UndefOr[String] = js.undefined
  var tableRange: js.UndefOr[String] = js.undefined
  var updates: js.UndefOr[UpdateValuesResponse] = js.undefined
}

object AppendValuesResponse {
  @scala.inline
  def apply(spreadsheetId: String = null, tableRange: String = null, updates: UpdateValuesResponse = null): AppendValuesResponse = {
    val __obj = js.Dynamic.literal()
    if (spreadsheetId != null) __obj.updateDynamic("spreadsheetId")(spreadsheetId)
    if (tableRange != null) __obj.updateDynamic("tableRange")(tableRange)
    if (updates != null) __obj.updateDynamic("updates")(updates)
    __obj.asInstanceOf[AppendValuesResponse]
  }
}

