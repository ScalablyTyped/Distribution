package typings
package googleDashAppsDashScriptLib.GoogleAppsScriptNs.SheetsNs.SchemaNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AddChartRequest extends js.Object {
  var chart: js.UndefOr[EmbeddedChart] = js.undefined
}

object AddChartRequest {
  @scala.inline
  def apply(chart: EmbeddedChart = null): AddChartRequest = {
    val __obj = js.Dynamic.literal()
    if (chart != null) __obj.updateDynamic("chart")(chart)
    __obj.asInstanceOf[AddChartRequest]
  }
}

