package typings
package googleDashAppsDashScriptLib.GoogleAppsScriptNs.SheetsNs.SchemaNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AppendValuesResponse extends js.Object {
  var spreadsheetId: js.UndefOr[java.lang.String] = js.undefined
  var tableRange: js.UndefOr[java.lang.String] = js.undefined
  var updates: js.UndefOr[UpdateValuesResponse] = js.undefined
}

object AppendValuesResponse {
  @scala.inline
  def apply(
    spreadsheetId: java.lang.String = null,
    tableRange: java.lang.String = null,
    updates: UpdateValuesResponse = null
  ): AppendValuesResponse = {
    val __obj = js.Dynamic.literal()
    if (spreadsheetId != null) __obj.updateDynamic("spreadsheetId")(spreadsheetId)
    if (tableRange != null) __obj.updateDynamic("tableRange")(tableRange)
    if (updates != null) __obj.updateDynamic("updates")(updates)
    __obj.asInstanceOf[AppendValuesResponse]
  }
}

