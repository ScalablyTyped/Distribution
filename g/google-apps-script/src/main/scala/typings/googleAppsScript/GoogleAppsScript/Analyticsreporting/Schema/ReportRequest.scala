package typings.googleAppsScript.GoogleAppsScript.Analyticsreporting.Schema

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ReportRequest extends js.Object {
  var cohortGroup: js.UndefOr[CohortGroup] = js.native
  var dateRanges: js.UndefOr[js.Array[DateRange]] = js.native
  var dimensionFilterClauses: js.UndefOr[js.Array[DimensionFilterClause]] = js.native
  var dimensions: js.UndefOr[js.Array[Dimension]] = js.native
  var filtersExpression: js.UndefOr[String] = js.native
  var hideTotals: js.UndefOr[Boolean] = js.native
  var hideValueRanges: js.UndefOr[Boolean] = js.native
  var includeEmptyRows: js.UndefOr[Boolean] = js.native
  var metricFilterClauses: js.UndefOr[js.Array[MetricFilterClause]] = js.native
  var metrics: js.UndefOr[js.Array[Metric]] = js.native
  var orderBys: js.UndefOr[js.Array[OrderBy]] = js.native
  var pageSize: js.UndefOr[Double] = js.native
  var pageToken: js.UndefOr[String] = js.native
  var pivots: js.UndefOr[js.Array[Pivot]] = js.native
  var samplingLevel: js.UndefOr[String] = js.native
  var segments: js.UndefOr[js.Array[Segment]] = js.native
  var viewId: js.UndefOr[String] = js.native
}

object ReportRequest {
  @scala.inline
  def apply(): ReportRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ReportRequest]
  }
  @scala.inline
  implicit class ReportRequestOps[Self <: ReportRequest] (val x: Self) extends AnyVal {
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
    def setCohortGroup(value: CohortGroup): Self = this.set("cohortGroup", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCohortGroup: Self = this.set("cohortGroup", js.undefined)
    @scala.inline
    def setDateRangesVarargs(value: DateRange*): Self = this.set("dateRanges", js.Array(value :_*))
    @scala.inline
    def setDateRanges(value: js.Array[DateRange]): Self = this.set("dateRanges", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDateRanges: Self = this.set("dateRanges", js.undefined)
    @scala.inline
    def setDimensionFilterClausesVarargs(value: DimensionFilterClause*): Self = this.set("dimensionFilterClauses", js.Array(value :_*))
    @scala.inline
    def setDimensionFilterClauses(value: js.Array[DimensionFilterClause]): Self = this.set("dimensionFilterClauses", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDimensionFilterClauses: Self = this.set("dimensionFilterClauses", js.undefined)
    @scala.inline
    def setDimensionsVarargs(value: Dimension*): Self = this.set("dimensions", js.Array(value :_*))
    @scala.inline
    def setDimensions(value: js.Array[Dimension]): Self = this.set("dimensions", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDimensions: Self = this.set("dimensions", js.undefined)
    @scala.inline
    def setFiltersExpression(value: String): Self = this.set("filtersExpression", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFiltersExpression: Self = this.set("filtersExpression", js.undefined)
    @scala.inline
    def setHideTotals(value: Boolean): Self = this.set("hideTotals", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteHideTotals: Self = this.set("hideTotals", js.undefined)
    @scala.inline
    def setHideValueRanges(value: Boolean): Self = this.set("hideValueRanges", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteHideValueRanges: Self = this.set("hideValueRanges", js.undefined)
    @scala.inline
    def setIncludeEmptyRows(value: Boolean): Self = this.set("includeEmptyRows", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteIncludeEmptyRows: Self = this.set("includeEmptyRows", js.undefined)
    @scala.inline
    def setMetricFilterClausesVarargs(value: MetricFilterClause*): Self = this.set("metricFilterClauses", js.Array(value :_*))
    @scala.inline
    def setMetricFilterClauses(value: js.Array[MetricFilterClause]): Self = this.set("metricFilterClauses", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMetricFilterClauses: Self = this.set("metricFilterClauses", js.undefined)
    @scala.inline
    def setMetricsVarargs(value: Metric*): Self = this.set("metrics", js.Array(value :_*))
    @scala.inline
    def setMetrics(value: js.Array[Metric]): Self = this.set("metrics", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMetrics: Self = this.set("metrics", js.undefined)
    @scala.inline
    def setOrderBysVarargs(value: OrderBy*): Self = this.set("orderBys", js.Array(value :_*))
    @scala.inline
    def setOrderBys(value: js.Array[OrderBy]): Self = this.set("orderBys", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteOrderBys: Self = this.set("orderBys", js.undefined)
    @scala.inline
    def setPageSize(value: Double): Self = this.set("pageSize", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePageSize: Self = this.set("pageSize", js.undefined)
    @scala.inline
    def setPageToken(value: String): Self = this.set("pageToken", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePageToken: Self = this.set("pageToken", js.undefined)
    @scala.inline
    def setPivotsVarargs(value: Pivot*): Self = this.set("pivots", js.Array(value :_*))
    @scala.inline
    def setPivots(value: js.Array[Pivot]): Self = this.set("pivots", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePivots: Self = this.set("pivots", js.undefined)
    @scala.inline
    def setSamplingLevel(value: String): Self = this.set("samplingLevel", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSamplingLevel: Self = this.set("samplingLevel", js.undefined)
    @scala.inline
    def setSegmentsVarargs(value: Segment*): Self = this.set("segments", js.Array(value :_*))
    @scala.inline
    def setSegments(value: js.Array[Segment]): Self = this.set("segments", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSegments: Self = this.set("segments", js.undefined)
    @scala.inline
    def setViewId(value: String): Self = this.set("viewId", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteViewId: Self = this.set("viewId", js.undefined)
  }
  
}

