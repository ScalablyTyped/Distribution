package typings.googleDashAppsDashScript.GoogleAppsScript.Sheets.Schema

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait HistogramChartSpec extends js.Object {
  var bucketSize: js.UndefOr[Double] = js.undefined
  var legendPosition: js.UndefOr[String] = js.undefined
  var outlierPercentile: js.UndefOr[Double] = js.undefined
  var series: js.UndefOr[js.Array[HistogramSeries]] = js.undefined
  var showItemDividers: js.UndefOr[Boolean] = js.undefined
}

object HistogramChartSpec {
  @scala.inline
  def apply(
    bucketSize: Int | Double = null,
    legendPosition: String = null,
    outlierPercentile: Int | Double = null,
    series: js.Array[HistogramSeries] = null,
    showItemDividers: js.UndefOr[Boolean] = js.undefined
  ): HistogramChartSpec = {
    val __obj = js.Dynamic.literal()
    if (bucketSize != null) __obj.updateDynamic("bucketSize")(bucketSize.asInstanceOf[js.Any])
    if (legendPosition != null) __obj.updateDynamic("legendPosition")(legendPosition.asInstanceOf[js.Any])
    if (outlierPercentile != null) __obj.updateDynamic("outlierPercentile")(outlierPercentile.asInstanceOf[js.Any])
    if (series != null) __obj.updateDynamic("series")(series.asInstanceOf[js.Any])
    if (!js.isUndefined(showItemDividers)) __obj.updateDynamic("showItemDividers")(showItemDividers.asInstanceOf[js.Any])
    __obj.asInstanceOf[HistogramChartSpec]
  }
}

