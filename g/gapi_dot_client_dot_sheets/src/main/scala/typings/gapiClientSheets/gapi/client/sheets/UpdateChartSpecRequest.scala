package typings.gapiClientSheets.gapi.client.sheets

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
  def apply(chartId: js.UndefOr[Double] = js.undefined, spec: ChartSpec = null): UpdateChartSpecRequest = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(chartId)) __obj.updateDynamic("chartId")(chartId.get.asInstanceOf[js.Any])
    if (spec != null) __obj.updateDynamic("spec")(spec.asInstanceOf[js.Any])
    __obj.asInstanceOf[UpdateChartSpecRequest]
  }
}

