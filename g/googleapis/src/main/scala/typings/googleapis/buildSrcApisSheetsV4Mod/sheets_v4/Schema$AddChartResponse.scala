package typings.googleapis.buildSrcApisSheetsV4Mod.sheets_v4

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * The result of adding a chart to a spreadsheet.
  */
@js.native
trait Schema$AddChartResponse extends js.Object {
  /**
    * The newly added chart.
    */
  var chart: js.UndefOr[Schema$EmbeddedChart] = js.native
}

object Schema$AddChartResponse {
  @scala.inline
  def apply(chart: Schema$EmbeddedChart = null): Schema$AddChartResponse = {
    val __obj = js.Dynamic.literal()
    if (chart != null) __obj.updateDynamic("chart")(chart.asInstanceOf[js.Any])
    __obj.asInstanceOf[Schema$AddChartResponse]
  }
}

