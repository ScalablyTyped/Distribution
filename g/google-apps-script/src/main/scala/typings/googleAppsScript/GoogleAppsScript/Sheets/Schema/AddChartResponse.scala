package typings.googleAppsScript.GoogleAppsScript.Sheets.Schema

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AddChartResponse extends js.Object {
  var chart: js.UndefOr[EmbeddedChart] = js.undefined
}

object AddChartResponse {
  @scala.inline
  def apply(chart: EmbeddedChart = null): AddChartResponse = {
    val __obj = js.Dynamic.literal()
    if (chart != null) __obj.updateDynamic("chart")(chart.asInstanceOf[js.Any])
    __obj.asInstanceOf[AddChartResponse]
  }
}

