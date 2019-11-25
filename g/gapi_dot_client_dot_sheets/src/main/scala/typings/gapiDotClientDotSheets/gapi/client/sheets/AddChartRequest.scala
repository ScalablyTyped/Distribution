package typings.gapiDotClientDotSheets.gapi.client.sheets

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AddChartRequest extends js.Object {
  /**
    * The chart that should be added to the spreadsheet, including the position
    * where it should be placed. The chartId
    * field is optional; if one is not set, an id will be randomly generated. (It
    * is an error to specify the ID of an embedded object that already exists.)
    */
  var chart: js.UndefOr[EmbeddedChart] = js.undefined
}

object AddChartRequest {
  @scala.inline
  def apply(chart: EmbeddedChart = null): AddChartRequest = {
    val __obj = js.Dynamic.literal()
    if (chart != null) __obj.updateDynamic("chart")(chart.asInstanceOf[js.Any])
    __obj.asInstanceOf[AddChartRequest]
  }
}

