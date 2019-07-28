package typings.gapiDotClientDotSheets.gapiNs.clientNs.sheetsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait UpdateChartSpecRequest extends js.Object {
  /** The ID of the chart to update. */
  var chartId: js.UndefOr[Double] = js.undefined
  /** The specification to apply to the chart. */
  var spec: js.UndefOr[ChartSpec] = js.undefined
}

object UpdateChartSpecRequest {
  @scala.inline
  def apply(chartId: Int | Double = null, spec: ChartSpec = null): UpdateChartSpecRequest = {
    val __obj = js.Dynamic.literal()
    if (chartId != null) __obj.updateDynamic("chartId")(chartId.asInstanceOf[js.Any])
    if (spec != null) __obj.updateDynamic("spec")(spec)
    __obj.asInstanceOf[UpdateChartSpecRequest]
  }
}

