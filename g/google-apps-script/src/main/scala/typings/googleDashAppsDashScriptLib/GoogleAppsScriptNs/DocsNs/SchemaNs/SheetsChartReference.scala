package typings
package googleDashAppsDashScriptLib.GoogleAppsScriptNs.DocsNs.SchemaNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SheetsChartReference extends js.Object {
  var chartId: js.UndefOr[scala.Double] = js.undefined
  var spreadsheetId: js.UndefOr[java.lang.String] = js.undefined
}

object SheetsChartReference {
  @scala.inline
  def apply(chartId: scala.Int | scala.Double = null, spreadsheetId: java.lang.String = null): SheetsChartReference = {
    val __obj = js.Dynamic.literal()
    if (chartId != null) __obj.updateDynamic("chartId")(chartId.asInstanceOf[js.Any])
    if (spreadsheetId != null) __obj.updateDynamic("spreadsheetId")(spreadsheetId)
    __obj.asInstanceOf[SheetsChartReference]
  }
}

