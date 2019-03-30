package typings
package googleDashAppsDashScriptLib.GoogleAppsScriptNs.SlidesUnderscoreV1Ns.SchemaNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SheetsChart extends js.Object {
  var chartId: js.UndefOr[scala.Double] = js.undefined
  var contentUrl: js.UndefOr[java.lang.String] = js.undefined
  var sheetsChartProperties: js.UndefOr[SheetsChartProperties] = js.undefined
  var spreadsheetId: js.UndefOr[java.lang.String] = js.undefined
}

object SheetsChart {
  @scala.inline
  def apply(
    chartId: scala.Int | scala.Double = null,
    contentUrl: java.lang.String = null,
    sheetsChartProperties: SheetsChartProperties = null,
    spreadsheetId: java.lang.String = null
  ): SheetsChart = {
    val __obj = js.Dynamic.literal()
    if (chartId != null) __obj.updateDynamic("chartId")(chartId.asInstanceOf[js.Any])
    if (contentUrl != null) __obj.updateDynamic("contentUrl")(contentUrl)
    if (sheetsChartProperties != null) __obj.updateDynamic("sheetsChartProperties")(sheetsChartProperties)
    if (spreadsheetId != null) __obj.updateDynamic("spreadsheetId")(spreadsheetId)
    __obj.asInstanceOf[SheetsChart]
  }
}

