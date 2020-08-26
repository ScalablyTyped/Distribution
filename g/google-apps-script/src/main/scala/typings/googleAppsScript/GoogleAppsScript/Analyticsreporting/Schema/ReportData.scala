package typings.googleAppsScript.GoogleAppsScript.Analyticsreporting.Schema

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ReportData extends js.Object {
  var dataLastRefreshed: js.UndefOr[String] = js.native
  var isDataGolden: js.UndefOr[Boolean] = js.native
  var maximums: js.UndefOr[js.Array[DateRangeValues]] = js.native
  var minimums: js.UndefOr[js.Array[DateRangeValues]] = js.native
  var rowCount: js.UndefOr[Double] = js.native
  var rows: js.UndefOr[js.Array[ReportRow]] = js.native
  var samplesReadCounts: js.UndefOr[js.Array[String]] = js.native
  var samplingSpaceSizes: js.UndefOr[js.Array[String]] = js.native
  var totals: js.UndefOr[js.Array[DateRangeValues]] = js.native
}

object ReportData {
  @scala.inline
  def apply(): ReportData = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ReportData]
  }
  @scala.inline
  implicit class ReportDataOps[Self <: ReportData] (val x: Self) extends AnyVal {
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
    def setDataLastRefreshed(value: String): Self = this.set("dataLastRefreshed", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDataLastRefreshed: Self = this.set("dataLastRefreshed", js.undefined)
    @scala.inline
    def setIsDataGolden(value: Boolean): Self = this.set("isDataGolden", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteIsDataGolden: Self = this.set("isDataGolden", js.undefined)
    @scala.inline
    def setMaximumsVarargs(value: DateRangeValues*): Self = this.set("maximums", js.Array(value :_*))
    @scala.inline
    def setMaximums(value: js.Array[DateRangeValues]): Self = this.set("maximums", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMaximums: Self = this.set("maximums", js.undefined)
    @scala.inline
    def setMinimumsVarargs(value: DateRangeValues*): Self = this.set("minimums", js.Array(value :_*))
    @scala.inline
    def setMinimums(value: js.Array[DateRangeValues]): Self = this.set("minimums", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMinimums: Self = this.set("minimums", js.undefined)
    @scala.inline
    def setRowCount(value: Double): Self = this.set("rowCount", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRowCount: Self = this.set("rowCount", js.undefined)
    @scala.inline
    def setRowsVarargs(value: ReportRow*): Self = this.set("rows", js.Array(value :_*))
    @scala.inline
    def setRows(value: js.Array[ReportRow]): Self = this.set("rows", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRows: Self = this.set("rows", js.undefined)
    @scala.inline
    def setSamplesReadCountsVarargs(value: String*): Self = this.set("samplesReadCounts", js.Array(value :_*))
    @scala.inline
    def setSamplesReadCounts(value: js.Array[String]): Self = this.set("samplesReadCounts", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSamplesReadCounts: Self = this.set("samplesReadCounts", js.undefined)
    @scala.inline
    def setSamplingSpaceSizesVarargs(value: String*): Self = this.set("samplingSpaceSizes", js.Array(value :_*))
    @scala.inline
    def setSamplingSpaceSizes(value: js.Array[String]): Self = this.set("samplingSpaceSizes", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSamplingSpaceSizes: Self = this.set("samplingSpaceSizes", js.undefined)
    @scala.inline
    def setTotalsVarargs(value: DateRangeValues*): Self = this.set("totals", js.Array(value :_*))
    @scala.inline
    def setTotals(value: js.Array[DateRangeValues]): Self = this.set("totals", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTotals: Self = this.set("totals", js.undefined)
  }
  
}

