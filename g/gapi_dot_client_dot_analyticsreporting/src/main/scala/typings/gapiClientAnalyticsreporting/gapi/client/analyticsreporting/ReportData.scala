package typings.gapiClientAnalyticsreporting.gapi.client.analyticsreporting

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ReportData extends js.Object {
  /**
    * The last time the data in the report was refreshed. All the hits received
    * before this timestamp are included in the calculation of the report.
    */
  var dataLastRefreshed: js.UndefOr[String] = js.native
  /**
    * Indicates if response to this request is golden or not. Data is
    * golden when the exact same request will not produce any new results if
    * asked at a later point in time.
    */
  var isDataGolden: js.UndefOr[Boolean] = js.native
  /**
    * Minimum and maximum values seen over all matching rows. These are both
    * empty when `hideValueRanges` in the request is false, or when
    * rowCount is zero.
    */
  var maximums: js.UndefOr[js.Array[DateRangeValues]] = js.native
  /**
    * Minimum and maximum values seen over all matching rows. These are both
    * empty when `hideValueRanges` in the request is false, or when
    * rowCount is zero.
    */
  var minimums: js.UndefOr[js.Array[DateRangeValues]] = js.native
  /** Total number of matching rows for this query. */
  var rowCount: js.UndefOr[Double] = js.native
  /** There's one ReportRow for every unique combination of dimensions. */
  var rows: js.UndefOr[js.Array[ReportRow]] = js.native
  /**
    * If the results are
    * [sampled](https://support.google.com/analytics/answer/2637192),
    * this returns the total number of samples read, one entry per date range.
    * If the results are not sampled this field will not be defined. See
    * [developer guide](/analytics/devguides/reporting/core/v4/basics#sampling)
    * for details.
    */
  var samplesReadCounts: js.UndefOr[js.Array[String]] = js.native
  /**
    * If the results are
    * [sampled](https://support.google.com/analytics/answer/2637192),
    * this returns the total number of
    * samples present, one entry per date range. If the results are not sampled
    * this field will not be defined. See
    * [developer guide](/analytics/devguides/reporting/core/v4/basics#sampling)
    * for details.
    */
  var samplingSpaceSizes: js.UndefOr[js.Array[String]] = js.native
  /**
    * For each requested date range, for the set of all rows that match
    * the query, every requested value format gets a total. The total
    * for a value format is computed by first totaling the metrics
    * mentioned in the value format and then evaluating the value
    * format as a scalar expression.  E.g., The "totals" for
    * `3 / (ga:sessions + 2)` we compute
    * `3 / ((sum of all relevant ga:sessions) + 2)`.
    * Totals are computed before pagination.
    */
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

