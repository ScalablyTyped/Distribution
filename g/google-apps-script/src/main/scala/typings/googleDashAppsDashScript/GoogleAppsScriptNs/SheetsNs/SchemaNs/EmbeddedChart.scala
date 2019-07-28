package typings.googleDashAppsDashScript.GoogleAppsScriptNs.SheetsNs.SchemaNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait EmbeddedChart extends js.Object {
  var chartId: js.UndefOr[Double] = js.undefined
  var position: js.UndefOr[EmbeddedObjectPosition] = js.undefined
  var spec: js.UndefOr[ChartSpec] = js.undefined
}

object EmbeddedChart {
  @scala.inline
  def apply(chartId: Int | Double = null, position: EmbeddedObjectPosition = null, spec: ChartSpec = null): EmbeddedChart = {
    val __obj = js.Dynamic.literal()
    if (chartId != null) __obj.updateDynamic("chartId")(chartId.asInstanceOf[js.Any])
    if (position != null) __obj.updateDynamic("position")(position)
    if (spec != null) __obj.updateDynamic("spec")(spec)
    __obj.asInstanceOf[EmbeddedChart]
  }
}

