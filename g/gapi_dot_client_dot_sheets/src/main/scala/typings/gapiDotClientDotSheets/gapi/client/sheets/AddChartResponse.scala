package typings.gapiDotClientDotSheets.gapi.client.sheets

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AddChartResponse extends js.Object {
  /** The newly added chart. */
  var chart: js.UndefOr[EmbeddedChart] = js.undefined
}

object AddChartResponse {
  @scala.inline
  def apply(chart: EmbeddedChart = null): AddChartResponse = {
    val __obj = js.Dynamic.literal()
    if (chart != null) __obj.updateDynamic("chart")(chart)
    __obj.asInstanceOf[AddChartResponse]
  }
}

