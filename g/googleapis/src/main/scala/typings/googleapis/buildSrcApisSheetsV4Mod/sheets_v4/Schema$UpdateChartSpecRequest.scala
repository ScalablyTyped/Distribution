package typings.googleapis.buildSrcApisSheetsV4Mod.sheets_v4

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Updates a chart&#39;s specifications. (This does not move or resize a
  * chart. To move or resize a chart, use UpdateEmbeddedObjectPositionRequest.)
  */
@js.native
trait Schema$UpdateChartSpecRequest extends js.Object {
  /**
    * The ID of the chart to update.
    */
  var chartId: js.UndefOr[Double] = js.native
  /**
    * The specification to apply to the chart.
    */
  var spec: js.UndefOr[Schema$ChartSpec] = js.native
}

object Schema$UpdateChartSpecRequest {
  @scala.inline
  def apply(chartId: Int | Double = null, spec: Schema$ChartSpec = null): Schema$UpdateChartSpecRequest = {
    val __obj = js.Dynamic.literal()
    if (chartId != null) __obj.updateDynamic("chartId")(chartId.asInstanceOf[js.Any])
    if (spec != null) __obj.updateDynamic("spec")(spec.asInstanceOf[js.Any])
    __obj.asInstanceOf[Schema$UpdateChartSpecRequest]
  }
}

