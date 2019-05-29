package typings
package googleDashAppsDashScriptLib.GoogleAppsScriptNs.SheetsNs.SchemaNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait HistogramChartSpec extends js.Object {
  var bucketSize: js.UndefOr[scala.Double] = js.undefined
  var legendPosition: js.UndefOr[java.lang.String] = js.undefined
  var outlierPercentile: js.UndefOr[scala.Double] = js.undefined
  var series: js.UndefOr[js.Array[HistogramSeries]] = js.undefined
  var showItemDividers: js.UndefOr[scala.Boolean] = js.undefined
}

object HistogramChartSpec {
  @scala.inline
  def apply(
    bucketSize: scala.Int | scala.Double = null,
    legendPosition: java.lang.String = null,
    outlierPercentile: scala.Int | scala.Double = null,
    series: js.Array[HistogramSeries] = null,
    showItemDividers: js.UndefOr[scala.Boolean] = js.undefined
  ): HistogramChartSpec = {
    val __obj = js.Dynamic.literal()
    if (bucketSize != null) __obj.updateDynamic("bucketSize")(bucketSize.asInstanceOf[js.Any])
    if (legendPosition != null) __obj.updateDynamic("legendPosition")(legendPosition)
    if (outlierPercentile != null) __obj.updateDynamic("outlierPercentile")(outlierPercentile.asInstanceOf[js.Any])
    if (series != null) __obj.updateDynamic("series")(series)
    if (!js.isUndefined(showItemDividers)) __obj.updateDynamic("showItemDividers")(showItemDividers)
    __obj.asInstanceOf[HistogramChartSpec]
  }
}

