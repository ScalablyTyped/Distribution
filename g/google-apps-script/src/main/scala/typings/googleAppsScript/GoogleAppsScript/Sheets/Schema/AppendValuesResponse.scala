package typings.googleAppsScript.GoogleAppsScript.Sheets.Schema

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
    if (spreadsheetId != null) __obj.updateDynamic("spreadsheetId")(spreadsheetId.asInstanceOf[js.Any])
    if (tableRange != null) __obj.updateDynamic("tableRange")(tableRange.asInstanceOf[js.Any])
    if (updates != null) __obj.updateDynamic("updates")(updates.asInstanceOf[js.Any])
    __obj.asInstanceOf[AppendValuesResponse]
  }
}

