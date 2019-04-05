package typings
package googleDashAppsDashScriptLib.GoogleAppsScriptNs.SheetsNs.SchemaNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait UpdateChartSpecRequest extends js.Object {
  var chartId: js.UndefOr[scala.Double] = js.undefined
  var spec: js.UndefOr[ChartSpec] = js.undefined
}

object UpdateChartSpecRequest {
  @scala.inline
  def apply(chartId: scala.Int | scala.Double = null, spec: ChartSpec = null): UpdateChartSpecRequest = {
    val __obj = js.Dynamic.literal()
    if (chartId != null) __obj.updateDynamic("chartId")(chartId.asInstanceOf[js.Any])
    if (spec != null) __obj.updateDynamic("spec")(spec)
    __obj.asInstanceOf[UpdateChartSpecRequest]
  }
}

