package typings
package googleDashAppsDashScriptLib.GoogleAppsScriptNs.SheetsNs.SchemaNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait BatchClearValuesResponse extends js.Object {
  var clearedRanges: js.UndefOr[js.Array[java.lang.String]] = js.undefined
  var spreadsheetId: js.UndefOr[java.lang.String] = js.undefined
}

object BatchClearValuesResponse {
  @scala.inline
  def apply(clearedRanges: js.Array[java.lang.String] = null, spreadsheetId: java.lang.String = null): BatchClearValuesResponse = {
    val __obj = js.Dynamic.literal()
    if (clearedRanges != null) __obj.updateDynamic("clearedRanges")(clearedRanges)
    if (spreadsheetId != null) __obj.updateDynamic("spreadsheetId")(spreadsheetId)
    __obj.asInstanceOf[BatchClearValuesResponse]
  }
}

