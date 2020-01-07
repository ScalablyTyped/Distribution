package typings.googleapis.buildSrcApisSheetsV4Mod.sheets_v4

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Adds a chart to a sheet in the spreadsheet.
  */
@js.native
trait Schema$AddChartRequest extends js.Object {
  /**
    * The chart that should be added to the spreadsheet, including the position
    * where it should be placed. The chartId field is optional; if one is not
    * set, an id will be randomly generated. (It is an error to specify the ID
    * of a chart that already exists.)
    */
  var chart: js.UndefOr[Schema$EmbeddedChart] = js.native
}

object Schema$AddChartRequest {
  @scala.inline
  def apply(chart: Schema$EmbeddedChart = null): Schema$AddChartRequest = {
    val __obj = js.Dynamic.literal()
    if (chart != null) __obj.updateDynamic("chart")(chart.asInstanceOf[js.Any])
    __obj.asInstanceOf[Schema$AddChartRequest]
  }
}

