package typings.googleDashAppsDashScript.GoogleAppsScriptNs.AnalyticsreportingNs.SchemaNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ReportRequest extends js.Object {
  var cohortGroup: js.UndefOr[CohortGroup] = js.undefined
  var dateRanges: js.UndefOr[js.Array[DateRange]] = js.undefined
  var dimensionFilterClauses: js.UndefOr[js.Array[DimensionFilterClause]] = js.undefined
  var dimensions: js.UndefOr[js.Array[Dimension]] = js.undefined
  var filtersExpression: js.UndefOr[String] = js.undefined
  var hideTotals: js.UndefOr[Boolean] = js.undefined
  var hideValueRanges: js.UndefOr[Boolean] = js.undefined
  var includeEmptyRows: js.UndefOr[Boolean] = js.undefined
  var metricFilterClauses: js.UndefOr[js.Array[MetricFilterClause]] = js.undefined
  var metrics: js.UndefOr[js.Array[Metric]] = js.undefined
  var orderBys: js.UndefOr[js.Array[OrderBy]] = js.undefined
  var pageSize: js.UndefOr[Double] = js.undefined
  var pageToken: js.UndefOr[String] = js.undefined
  var pivots: js.UndefOr[js.Array[Pivot]] = js.undefined
  var samplingLevel: js.UndefOr[String] = js.undefined
  var segments: js.UndefOr[js.Array[Segment]] = js.undefined
  var viewId: js.UndefOr[String] = js.undefined
}

object ReportRequest {
  @scala.inline
  def apply(
    cohortGroup: CohortGroup = null,
    dateRanges: js.Array[DateRange] = null,
    dimensionFilterClauses: js.Array[DimensionFilterClause] = null,
    dimensions: js.Array[Dimension] = null,
    filtersExpression: String = null,
    hideTotals: js.UndefOr[Boolean] = js.undefined,
    hideValueRanges: js.UndefOr[Boolean] = js.undefined,
    includeEmptyRows: js.UndefOr[Boolean] = js.undefined,
    metricFilterClauses: js.Array[MetricFilterClause] = null,
    metrics: js.Array[Metric] = null,
    orderBys: js.Array[OrderBy] = null,
    pageSize: Int | Double = null,
    pageToken: String = null,
    pivots: js.Array[Pivot] = null,
    samplingLevel: String = null,
    segments: js.Array[Segment] = null,
    viewId: String = null
  ): ReportRequest = {
    val __obj = js.Dynamic.literal()
    if (cohortGroup != null) __obj.updateDynamic("cohortGroup")(cohortGroup)
    if (dateRanges != null) __obj.updateDynamic("dateRanges")(dateRanges)
    if (dimensionFilterClauses != null) __obj.updateDynamic("dimensionFilterClauses")(dimensionFilterClauses)
    if (dimensions != null) __obj.updateDynamic("dimensions")(dimensions)
    if (filtersExpression != null) __obj.updateDynamic("filtersExpression")(filtersExpression)
    if (!js.isUndefined(hideTotals)) __obj.updateDynamic("hideTotals")(hideTotals)
    if (!js.isUndefined(hideValueRanges)) __obj.updateDynamic("hideValueRanges")(hideValueRanges)
    if (!js.isUndefined(includeEmptyRows)) __obj.updateDynamic("includeEmptyRows")(includeEmptyRows)
    if (metricFilterClauses != null) __obj.updateDynamic("metricFilterClauses")(metricFilterClauses)
    if (metrics != null) __obj.updateDynamic("metrics")(metrics)
    if (orderBys != null) __obj.updateDynamic("orderBys")(orderBys)
    if (pageSize != null) __obj.updateDynamic("pageSize")(pageSize.asInstanceOf[js.Any])
    if (pageToken != null) __obj.updateDynamic("pageToken")(pageToken)
    if (pivots != null) __obj.updateDynamic("pivots")(pivots)
    if (samplingLevel != null) __obj.updateDynamic("samplingLevel")(samplingLevel)
    if (segments != null) __obj.updateDynamic("segments")(segments)
    if (viewId != null) __obj.updateDynamic("viewId")(viewId)
    __obj.asInstanceOf[ReportRequest]
  }
}

