package typings.googleapis.buildSrcApisSheetsV4Mod.sheets_v4

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * A chart embedded in a sheet.
  */
@js.native
trait Schema$EmbeddedChart extends js.Object {
  /**
    * The ID of the chart.
    */
  var chartId: js.UndefOr[Double] = js.native
  /**
    * The position of the chart.
    */
  var position: js.UndefOr[Schema$EmbeddedObjectPosition] = js.native
  /**
    * The specification of the chart.
    */
  var spec: js.UndefOr[Schema$ChartSpec] = js.native
}

object Schema$EmbeddedChart {
  @scala.inline
  def apply(
    chartId: Int | Double = null,
    position: Schema$EmbeddedObjectPosition = null,
    spec: Schema$ChartSpec = null
  ): Schema$EmbeddedChart = {
    val __obj = js.Dynamic.literal()
    if (chartId != null) __obj.updateDynamic("chartId")(chartId.asInstanceOf[js.Any])
    if (position != null) __obj.updateDynamic("position")(position.asInstanceOf[js.Any])
    if (spec != null) __obj.updateDynamic("spec")(spec.asInstanceOf[js.Any])
    __obj.asInstanceOf[Schema$EmbeddedChart]
  }
}

