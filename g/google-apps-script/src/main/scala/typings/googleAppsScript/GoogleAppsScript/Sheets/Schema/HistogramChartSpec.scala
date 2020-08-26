package typings.googleAppsScript.GoogleAppsScript.Sheets.Schema

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait HistogramChartSpec extends js.Object {
  var bucketSize: js.UndefOr[Double] = js.native
  var legendPosition: js.UndefOr[String] = js.native
  var outlierPercentile: js.UndefOr[Double] = js.native
  var series: js.UndefOr[js.Array[HistogramSeries]] = js.native
  var showItemDividers: js.UndefOr[Boolean] = js.native
}

object HistogramChartSpec {
  @scala.inline
  def apply(): HistogramChartSpec = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[HistogramChartSpec]
  }
  @scala.inline
  implicit class HistogramChartSpecOps[Self <: HistogramChartSpec] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setBucketSize(value: Double): Self = this.set("bucketSize", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteBucketSize: Self = this.set("bucketSize", js.undefined)
    @scala.inline
    def setLegendPosition(value: String): Self = this.set("legendPosition", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLegendPosition: Self = this.set("legendPosition", js.undefined)
    @scala.inline
    def setOutlierPercentile(value: Double): Self = this.set("outlierPercentile", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteOutlierPercentile: Self = this.set("outlierPercentile", js.undefined)
    @scala.inline
    def setSeriesVarargs(value: HistogramSeries*): Self = this.set("series", js.Array(value :_*))
    @scala.inline
    def setSeries(value: js.Array[HistogramSeries]): Self = this.set("series", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSeries: Self = this.set("series", js.undefined)
    @scala.inline
    def setShowItemDividers(value: Boolean): Self = this.set("showItemDividers", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteShowItemDividers: Self = this.set("showItemDividers", js.undefined)
  }
  
}

