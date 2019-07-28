package typings.googleDashAppsDashScript.GoogleAppsScriptNs.SheetsNs.SchemaNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait BatchClearValuesByDataFilterResponse extends js.Object {
  var clearedRanges: js.UndefOr[js.Array[String]] = js.undefined
  var spreadsheetId: js.UndefOr[String] = js.undefined
}

object BatchClearValuesByDataFilterResponse {
  @scala.inline
  def apply(clearedRanges: js.Array[String] = null, spreadsheetId: String = null): BatchClearValuesByDataFilterResponse = {
    val __obj = js.Dynamic.literal()
    if (clearedRanges != null) __obj.updateDynamic("clearedRanges")(clearedRanges)
    if (spreadsheetId != null) __obj.updateDynamic("spreadsheetId")(spreadsheetId)
    __obj.asInstanceOf[BatchClearValuesByDataFilterResponse]
  }
}

