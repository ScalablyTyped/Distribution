package typings
package googleDashAppsDashScriptLib.GoogleAppsScriptNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Analyticsreporting extends js.Object {
  var Reports: js.UndefOr[
    googleDashAppsDashScriptLib.GoogleAppsScriptNs.AnalyticsreportingNs.CollectionNs.ReportsCollection
  ] = js.undefined
  var UserActivity: js.UndefOr[
    googleDashAppsDashScriptLib.GoogleAppsScriptNs.AnalyticsreportingNs.CollectionNs.UserActivityCollection
  ] = js.undefined
  // Create a new instance of Cohort
  def newCohort(): googleDashAppsDashScriptLib.GoogleAppsScriptNs.AnalyticsreportingNs.SchemaNs.Cohort
  // Create a new instance of CohortGroup
  def newCohortGroup(): googleDashAppsDashScriptLib.GoogleAppsScriptNs.AnalyticsreportingNs.SchemaNs.CohortGroup
  // Create a new instance of DateRange
  def newDateRange(): googleDashAppsDashScriptLib.GoogleAppsScriptNs.AnalyticsreportingNs.SchemaNs.DateRange
  // Create a new instance of Dimension
  def newDimension(): googleDashAppsDashScriptLib.GoogleAppsScriptNs.AnalyticsreportingNs.SchemaNs.Dimension
  // Create a new instance of DimensionFilter
  def newDimensionFilter(): googleDashAppsDashScriptLib.GoogleAppsScriptNs.AnalyticsreportingNs.SchemaNs.DimensionFilter
  // Create a new instance of DimensionFilterClause
  def newDimensionFilterClause(): googleDashAppsDashScriptLib.GoogleAppsScriptNs.AnalyticsreportingNs.SchemaNs.DimensionFilterClause
  // Create a new instance of DynamicSegment
  def newDynamicSegment(): googleDashAppsDashScriptLib.GoogleAppsScriptNs.AnalyticsreportingNs.SchemaNs.DynamicSegment
  // Create a new instance of GetReportsRequest
  def newGetReportsRequest(): googleDashAppsDashScriptLib.GoogleAppsScriptNs.AnalyticsreportingNs.SchemaNs.GetReportsRequest
  // Create a new instance of Metric
  def newMetric(): googleDashAppsDashScriptLib.GoogleAppsScriptNs.AnalyticsreportingNs.SchemaNs.Metric
  // Create a new instance of MetricFilter
  def newMetricFilter(): googleDashAppsDashScriptLib.GoogleAppsScriptNs.AnalyticsreportingNs.SchemaNs.MetricFilter
  // Create a new instance of MetricFilterClause
  def newMetricFilterClause(): googleDashAppsDashScriptLib.GoogleAppsScriptNs.AnalyticsreportingNs.SchemaNs.MetricFilterClause
  // Create a new instance of OrFiltersForSegment
  def newOrFiltersForSegment(): googleDashAppsDashScriptLib.GoogleAppsScriptNs.AnalyticsreportingNs.SchemaNs.OrFiltersForSegment
  // Create a new instance of OrderBy
  def newOrderBy(): googleDashAppsDashScriptLib.GoogleAppsScriptNs.AnalyticsreportingNs.SchemaNs.OrderBy
  // Create a new instance of Pivot
  def newPivot(): googleDashAppsDashScriptLib.GoogleAppsScriptNs.AnalyticsreportingNs.SchemaNs.Pivot
  // Create a new instance of ReportRequest
  def newReportRequest(): googleDashAppsDashScriptLib.GoogleAppsScriptNs.AnalyticsreportingNs.SchemaNs.ReportRequest
  // Create a new instance of SearchUserActivityRequest
  def newSearchUserActivityRequest(): googleDashAppsDashScriptLib.GoogleAppsScriptNs.AnalyticsreportingNs.SchemaNs.SearchUserActivityRequest
  // Create a new instance of Segment
  def newSegment(): googleDashAppsDashScriptLib.GoogleAppsScriptNs.AnalyticsreportingNs.SchemaNs.Segment
  // Create a new instance of SegmentDefinition
  def newSegmentDefinition(): googleDashAppsDashScriptLib.GoogleAppsScriptNs.AnalyticsreportingNs.SchemaNs.SegmentDefinition
  // Create a new instance of SegmentDimensionFilter
  def newSegmentDimensionFilter(): googleDashAppsDashScriptLib.GoogleAppsScriptNs.AnalyticsreportingNs.SchemaNs.SegmentDimensionFilter
  // Create a new instance of SegmentFilter
  def newSegmentFilter(): googleDashAppsDashScriptLib.GoogleAppsScriptNs.AnalyticsreportingNs.SchemaNs.SegmentFilter
  // Create a new instance of SegmentFilterClause
  def newSegmentFilterClause(): googleDashAppsDashScriptLib.GoogleAppsScriptNs.AnalyticsreportingNs.SchemaNs.SegmentFilterClause
  // Create a new instance of SegmentMetricFilter
  def newSegmentMetricFilter(): googleDashAppsDashScriptLib.GoogleAppsScriptNs.AnalyticsreportingNs.SchemaNs.SegmentMetricFilter
  // Create a new instance of SegmentSequenceStep
  def newSegmentSequenceStep(): googleDashAppsDashScriptLib.GoogleAppsScriptNs.AnalyticsreportingNs.SchemaNs.SegmentSequenceStep
  // Create a new instance of SequenceSegment
  def newSequenceSegment(): googleDashAppsDashScriptLib.GoogleAppsScriptNs.AnalyticsreportingNs.SchemaNs.SequenceSegment
  // Create a new instance of SimpleSegment
  def newSimpleSegment(): googleDashAppsDashScriptLib.GoogleAppsScriptNs.AnalyticsreportingNs.SchemaNs.SimpleSegment
  // Create a new instance of User
  def newUser(): googleDashAppsDashScriptLib.GoogleAppsScriptNs.AnalyticsreportingNs.SchemaNs.User
}

object Analyticsreporting {
  @scala.inline
  def apply(
    newCohort: () => googleDashAppsDashScriptLib.GoogleAppsScriptNs.AnalyticsreportingNs.SchemaNs.Cohort,
    newCohortGroup: () => googleDashAppsDashScriptLib.GoogleAppsScriptNs.AnalyticsreportingNs.SchemaNs.CohortGroup,
    newDateRange: () => googleDashAppsDashScriptLib.GoogleAppsScriptNs.AnalyticsreportingNs.SchemaNs.DateRange,
    newDimension: () => googleDashAppsDashScriptLib.GoogleAppsScriptNs.AnalyticsreportingNs.SchemaNs.Dimension,
    newDimensionFilter: () => googleDashAppsDashScriptLib.GoogleAppsScriptNs.AnalyticsreportingNs.SchemaNs.DimensionFilter,
    newDimensionFilterClause: () => googleDashAppsDashScriptLib.GoogleAppsScriptNs.AnalyticsreportingNs.SchemaNs.DimensionFilterClause,
    newDynamicSegment: () => googleDashAppsDashScriptLib.GoogleAppsScriptNs.AnalyticsreportingNs.SchemaNs.DynamicSegment,
    newGetReportsRequest: () => googleDashAppsDashScriptLib.GoogleAppsScriptNs.AnalyticsreportingNs.SchemaNs.GetReportsRequest,
    newMetric: () => googleDashAppsDashScriptLib.GoogleAppsScriptNs.AnalyticsreportingNs.SchemaNs.Metric,
    newMetricFilter: () => googleDashAppsDashScriptLib.GoogleAppsScriptNs.AnalyticsreportingNs.SchemaNs.MetricFilter,
    newMetricFilterClause: () => googleDashAppsDashScriptLib.GoogleAppsScriptNs.AnalyticsreportingNs.SchemaNs.MetricFilterClause,
    newOrFiltersForSegment: () => googleDashAppsDashScriptLib.GoogleAppsScriptNs.AnalyticsreportingNs.SchemaNs.OrFiltersForSegment,
    newOrderBy: () => googleDashAppsDashScriptLib.GoogleAppsScriptNs.AnalyticsreportingNs.SchemaNs.OrderBy,
    newPivot: () => googleDashAppsDashScriptLib.GoogleAppsScriptNs.AnalyticsreportingNs.SchemaNs.Pivot,
    newReportRequest: () => googleDashAppsDashScriptLib.GoogleAppsScriptNs.AnalyticsreportingNs.SchemaNs.ReportRequest,
    newSearchUserActivityRequest: () => googleDashAppsDashScriptLib.GoogleAppsScriptNs.AnalyticsreportingNs.SchemaNs.SearchUserActivityRequest,
    newSegment: () => googleDashAppsDashScriptLib.GoogleAppsScriptNs.AnalyticsreportingNs.SchemaNs.Segment,
    newSegmentDefinition: () => googleDashAppsDashScriptLib.GoogleAppsScriptNs.AnalyticsreportingNs.SchemaNs.SegmentDefinition,
    newSegmentDimensionFilter: () => googleDashAppsDashScriptLib.GoogleAppsScriptNs.AnalyticsreportingNs.SchemaNs.SegmentDimensionFilter,
    newSegmentFilter: () => googleDashAppsDashScriptLib.GoogleAppsScriptNs.AnalyticsreportingNs.SchemaNs.SegmentFilter,
    newSegmentFilterClause: () => googleDashAppsDashScriptLib.GoogleAppsScriptNs.AnalyticsreportingNs.SchemaNs.SegmentFilterClause,
    newSegmentMetricFilter: () => googleDashAppsDashScriptLib.GoogleAppsScriptNs.AnalyticsreportingNs.SchemaNs.SegmentMetricFilter,
    newSegmentSequenceStep: () => googleDashAppsDashScriptLib.GoogleAppsScriptNs.AnalyticsreportingNs.SchemaNs.SegmentSequenceStep,
    newSequenceSegment: () => googleDashAppsDashScriptLib.GoogleAppsScriptNs.AnalyticsreportingNs.SchemaNs.SequenceSegment,
    newSimpleSegment: () => googleDashAppsDashScriptLib.GoogleAppsScriptNs.AnalyticsreportingNs.SchemaNs.SimpleSegment,
    newUser: () => googleDashAppsDashScriptLib.GoogleAppsScriptNs.AnalyticsreportingNs.SchemaNs.User,
    Reports: googleDashAppsDashScriptLib.GoogleAppsScriptNs.AnalyticsreportingNs.CollectionNs.ReportsCollection = null,
    UserActivity: googleDashAppsDashScriptLib.GoogleAppsScriptNs.AnalyticsreportingNs.CollectionNs.UserActivityCollection = null
  ): Analyticsreporting = {
    val __obj = js.Dynamic.literal(newCohort = js.Any.fromFunction0(newCohort), newCohortGroup = js.Any.fromFunction0(newCohortGroup), newDateRange = js.Any.fromFunction0(newDateRange), newDimension = js.Any.fromFunction0(newDimension), newDimensionFilter = js.Any.fromFunction0(newDimensionFilter), newDimensionFilterClause = js.Any.fromFunction0(newDimensionFilterClause), newDynamicSegment = js.Any.fromFunction0(newDynamicSegment), newGetReportsRequest = js.Any.fromFunction0(newGetReportsRequest), newMetric = js.Any.fromFunction0(newMetric), newMetricFilter = js.Any.fromFunction0(newMetricFilter), newMetricFilterClause = js.Any.fromFunction0(newMetricFilterClause), newOrFiltersForSegment = js.Any.fromFunction0(newOrFiltersForSegment), newOrderBy = js.Any.fromFunction0(newOrderBy), newPivot = js.Any.fromFunction0(newPivot), newReportRequest = js.Any.fromFunction0(newReportRequest), newSearchUserActivityRequest = js.Any.fromFunction0(newSearchUserActivityRequest), newSegment = js.Any.fromFunction0(newSegment), newSegmentDefinition = js.Any.fromFunction0(newSegmentDefinition), newSegmentDimensionFilter = js.Any.fromFunction0(newSegmentDimensionFilter), newSegmentFilter = js.Any.fromFunction0(newSegmentFilter), newSegmentFilterClause = js.Any.fromFunction0(newSegmentFilterClause), newSegmentMetricFilter = js.Any.fromFunction0(newSegmentMetricFilter), newSegmentSequenceStep = js.Any.fromFunction0(newSegmentSequenceStep), newSequenceSegment = js.Any.fromFunction0(newSequenceSegment), newSimpleSegment = js.Any.fromFunction0(newSimpleSegment), newUser = js.Any.fromFunction0(newUser))
    if (Reports != null) __obj.updateDynamic("Reports")(Reports)
    if (UserActivity != null) __obj.updateDynamic("UserActivity")(UserActivity)
    __obj.asInstanceOf[Analyticsreporting]
  }
}

