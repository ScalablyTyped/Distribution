package typings.googleAppsScript.GoogleAppsScript.Sheets.Schema

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait UpdateChartSpecRequest extends js.Object {
  var chartId: js.UndefOr[Double] = js.undefined
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

