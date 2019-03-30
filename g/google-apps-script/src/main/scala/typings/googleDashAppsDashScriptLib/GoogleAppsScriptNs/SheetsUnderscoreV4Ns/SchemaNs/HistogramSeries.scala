package typings
package googleDashAppsDashScriptLib.GoogleAppsScriptNs.SheetsUnderscoreV4Ns.SchemaNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait HistogramSeries extends js.Object {
  var barColor: js.UndefOr[Color] = js.undefined
  var data: js.UndefOr[ChartData] = js.undefined
}

object HistogramSeries {
  @scala.inline
  def apply(barColor: Color = null, data: ChartData = null): HistogramSeries = {
    val __obj = js.Dynamic.literal()
    if (barColor != null) __obj.updateDynamic("barColor")(barColor)
    if (data != null) __obj.updateDynamic("data")(data)
    __obj.asInstanceOf[HistogramSeries]
  }
}

