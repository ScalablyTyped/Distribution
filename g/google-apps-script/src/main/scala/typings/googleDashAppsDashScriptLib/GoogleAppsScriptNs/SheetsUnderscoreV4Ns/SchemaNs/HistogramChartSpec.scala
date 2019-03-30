package typings
package googleDashAppsDashScriptLib.GoogleAppsScriptNs.SheetsUnderscoreV4Ns.SchemaNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait HistogramChartSpec extends js.Object {
  var bucketSize: js.UndefOr[stdLib.Number] = js.undefined
  var legendPosition: js.UndefOr[java.lang.String] = js.undefined
  var outlierPercentile: js.UndefOr[stdLib.Number] = js.undefined
  var series: js.UndefOr[js.Array[HistogramSeries]] = js.undefined
  var showItemDividers: js.UndefOr[scala.Boolean] = js.undefined
}

object HistogramChartSpec {
  @scala.inline
  def apply(
    bucketSize: stdLib.Number = null,
    legendPosition: java.lang.String = null,
    outlierPercentile: stdLib.Number = null,
    series: js.Array[HistogramSeries] = null,
    showItemDividers: js.UndefOr[scala.Boolean] = js.undefined
  ): HistogramChartSpec = {
    val __obj = js.Dynamic.literal()
    if (bucketSize != null) __obj.updateDynamic("bucketSize")(bucketSize)
    if (legendPosition != null) __obj.updateDynamic("legendPosition")(legendPosition)
    if (outlierPercentile != null) __obj.updateDynamic("outlierPercentile")(outlierPercentile)
    if (series != null) __obj.updateDynamic("series")(series)
    if (!js.isUndefined(showItemDividers)) __obj.updateDynamic("showItemDividers")(showItemDividers)
    __obj.asInstanceOf[HistogramChartSpec]
  }
}

