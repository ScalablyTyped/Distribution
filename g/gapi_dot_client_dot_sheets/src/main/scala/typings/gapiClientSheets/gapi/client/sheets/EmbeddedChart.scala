package typings.gapiClientSheets.gapi.client.sheets

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait EmbeddedChart extends js.Object {
  /** The ID of the chart. */
  var chartId: js.UndefOr[Double] = js.undefined
  /** The position of the chart. */
  var position: js.UndefOr[EmbeddedObjectPosition] = js.undefined
  /** The specification of the chart. */
  var spec: js.UndefOr[ChartSpec] = js.undefined
}

object EmbeddedChart {
  @scala.inline
  def apply(
    chartId: js.UndefOr[Double] = js.undefined,
    position: EmbeddedObjectPosition = null,
    spec: ChartSpec = null
  ): EmbeddedChart = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(chartId)) __obj.updateDynamic("chartId")(chartId.get.asInstanceOf[js.Any])
    if (position != null) __obj.updateDynamic("position")(position.asInstanceOf[js.Any])
    if (spec != null) __obj.updateDynamic("spec")(spec.asInstanceOf[js.Any])
    __obj.asInstanceOf[EmbeddedChart]
  }
}

