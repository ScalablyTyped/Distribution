package typings
package googleDashAppsDashScriptLib.GoogleAppsScriptNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Analyticsreporting_v4 extends js.Object {
  var Reports: js.UndefOr[
    googleDashAppsDashScriptLib.GoogleAppsScriptNs.AnalyticsreportingUnderscoreV4Ns.CollectionNs.ReportsCollection
  ] = js.undefined
  var UserActivity: js.UndefOr[
    googleDashAppsDashScriptLib.GoogleAppsScriptNs.AnalyticsreportingUnderscoreV4Ns.CollectionNs.UserActivityCollection
  ] = js.undefined
  // Create a new instance of Cohort
  def newCohort(): googleDashAppsDashScriptLib.GoogleAppsScriptNs.AnalyticsreportingUnderscoreV4Ns.SchemaNs.Cohort
  // Create a new instance of CohortGroup
  def newCohortGroup(): googleDashAppsDashScriptLib.GoogleAppsScriptNs.AnalyticsreportingUnderscoreV4Ns.SchemaNs.CohortGroup
  // Create a new instance of DateRange
  def newDateRange(): googleDashAppsDashScriptLib.GoogleAppsScriptNs.AnalyticsreportingUnderscoreV4Ns.SchemaNs.DateRange
  // Create a new instance of Dimension
  def newDimension(): googleDashAppsDashScriptLib.GoogleAppsScriptNs.AnalyticsreportingUnderscoreV4Ns.SchemaNs.Dimension
  // Create a new instance of DimensionFilter
  def newDimensionFilter(): googleDashAppsDashScriptLib.GoogleAppsScriptNs.AnalyticsreportingUnderscoreV4Ns.SchemaNs.DimensionFilter
  // Create a new instance of DimensionFilterClause
  def newDimensionFilterClause(): googleDashAppsDashScriptLib.GoogleAppsScriptNs.AnalyticsreportingUnderscoreV4Ns.SchemaNs.DimensionFilterClause
  // Create a new instance of DynamicSegment
  def newDynamicSegment(): googleDashAppsDashScriptLib.GoogleAppsScriptNs.AnalyticsreportingUnderscoreV4Ns.SchemaNs.DynamicSegment
  // Create a new instance of GetReportsRequest
  def newGetReportsRequest(): googleDashAppsDashScriptLib.GoogleAppsScriptNs.AnalyticsreportingUnderscoreV4Ns.SchemaNs.GetReportsRequest
  // Create a new instance of Metric
  def newMetric(): googleDashAppsDashScriptLib.GoogleAppsScriptNs.AnalyticsreportingUnderscoreV4Ns.SchemaNs.Metric
  // Create a new instance of MetricFilter
  def newMetricFilter(): googleDashAppsDashScriptLib.GoogleAppsScriptNs.AnalyticsreportingUnderscoreV4Ns.SchemaNs.MetricFilter
  // Create a new instance of MetricFilterClause
  def newMetricFilterClause(): googleDashAppsDashScriptLib.GoogleAppsScriptNs.AnalyticsreportingUnderscoreV4Ns.SchemaNs.MetricFilterClause
  // Create a new instance of OrFiltersForSegment
  def newOrFiltersForSegment(): googleDashAppsDashScriptLib.GoogleAppsScriptNs.AnalyticsreportingUnderscoreV4Ns.SchemaNs.OrFiltersForSegment
  // Create a new instance of OrderBy
  def newOrderBy(): googleDashAppsDashScriptLib.GoogleAppsScriptNs.AnalyticsreportingUnderscoreV4Ns.SchemaNs.OrderBy
  // Create a new instance of Pivot
  def newPivot(): googleDashAppsDashScriptLib.GoogleAppsScriptNs.AnalyticsreportingUnderscoreV4Ns.SchemaNs.Pivot
  // Create a new instance of ReportRequest
  def newReportRequest(): googleDashAppsDashScriptLib.GoogleAppsScriptNs.AnalyticsreportingUnderscoreV4Ns.SchemaNs.ReportRequest
  // Create a new instance of SearchUserActivityRequest
  def newSearchUserActivityRequest(): googleDashAppsDashScriptLib.GoogleAppsScriptNs.AnalyticsreportingUnderscoreV4Ns.SchemaNs.SearchUserActivityRequest
  // Create a new instance of Segment
  def newSegment(): googleDashAppsDashScriptLib.GoogleAppsScriptNs.AnalyticsreportingUnderscoreV4Ns.SchemaNs.Segment
  // Create a new instance of SegmentDefinition
  def newSegmentDefinition(): googleDashAppsDashScriptLib.GoogleAppsScriptNs.AnalyticsreportingUnderscoreV4Ns.SchemaNs.SegmentDefinition
  // Create a new instance of SegmentDimensionFilter
  def newSegmentDimensionFilter(): googleDashAppsDashScriptLib.GoogleAppsScriptNs.AnalyticsreportingUnderscoreV4Ns.SchemaNs.SegmentDimensionFilter
  // Create a new instance of SegmentFilter
  def newSegmentFilter(): googleDashAppsDashScriptLib.GoogleAppsScriptNs.AnalyticsreportingUnderscoreV4Ns.SchemaNs.SegmentFilter
  // Create a new instance of SegmentFilterClause
  def newSegmentFilterClause(): googleDashAppsDashScriptLib.GoogleAppsScriptNs.AnalyticsreportingUnderscoreV4Ns.SchemaNs.SegmentFilterClause
  // Create a new instance of SegmentMetricFilter
  def newSegmentMetricFilter(): googleDashAppsDashScriptLib.GoogleAppsScriptNs.AnalyticsreportingUnderscoreV4Ns.SchemaNs.SegmentMetricFilter
  // Create a new instance of SegmentSequenceStep
  def newSegmentSequenceStep(): googleDashAppsDashScriptLib.GoogleAppsScriptNs.AnalyticsreportingUnderscoreV4Ns.SchemaNs.SegmentSequenceStep
  // Create a new instance of SequenceSegment
  def newSequenceSegment(): googleDashAppsDashScriptLib.GoogleAppsScriptNs.AnalyticsreportingUnderscoreV4Ns.SchemaNs.SequenceSegment
  // Create a new instance of SimpleSegment
  def newSimpleSegment(): googleDashAppsDashScriptLib.GoogleAppsScriptNs.AnalyticsreportingUnderscoreV4Ns.SchemaNs.SimpleSegment
  // Create a new instance of User
  def newUser(): googleDashAppsDashScriptLib.GoogleAppsScriptNs.AnalyticsreportingUnderscoreV4Ns.SchemaNs.User
}

object Analyticsreporting_v4 {
  @scala.inline
  def apply(
    newCohort: () => googleDashAppsDashScriptLib.GoogleAppsScriptNs.AnalyticsreportingUnderscoreV4Ns.SchemaNs.Cohort,
    newCohortGroup: () => googleDashAppsDashScriptLib.GoogleAppsScriptNs.AnalyticsreportingUnderscoreV4Ns.SchemaNs.CohortGroup,
    newDateRange: () => googleDashAppsDashScriptLib.GoogleAppsScriptNs.AnalyticsreportingUnderscoreV4Ns.SchemaNs.DateRange,
    newDimension: () => googleDashAppsDashScriptLib.GoogleAppsScriptNs.AnalyticsreportingUnderscoreV4Ns.SchemaNs.Dimension,
    newDimensionFilter: () => googleDashAppsDashScriptLib.GoogleAppsScriptNs.AnalyticsreportingUnderscoreV4Ns.SchemaNs.DimensionFilter,
    newDimensionFilterClause: () => googleDashAppsDashScriptLib.GoogleAppsScriptNs.AnalyticsreportingUnderscoreV4Ns.SchemaNs.DimensionFilterClause,
    newDynamicSegment: () => googleDashAppsDashScriptLib.GoogleAppsScriptNs.AnalyticsreportingUnderscoreV4Ns.SchemaNs.DynamicSegment,
    newGetReportsRequest: () => googleDashAppsDashScriptLib.GoogleAppsScriptNs.AnalyticsreportingUnderscoreV4Ns.SchemaNs.GetReportsRequest,
    newMetric: () => googleDashAppsDashScriptLib.GoogleAppsScriptNs.AnalyticsreportingUnderscoreV4Ns.SchemaNs.Metric,
    newMetricFilter: () => googleDashAppsDashScriptLib.GoogleAppsScriptNs.AnalyticsreportingUnderscoreV4Ns.SchemaNs.MetricFilter,
    newMetricFilterClause: () => googleDashAppsDashScriptLib.GoogleAppsScriptNs.AnalyticsreportingUnderscoreV4Ns.SchemaNs.MetricFilterClause,
    newOrFiltersForSegment: () => googleDashAppsDashScriptLib.GoogleAppsScriptNs.AnalyticsreportingUnderscoreV4Ns.SchemaNs.OrFiltersForSegment,
    newOrderBy: () => googleDashAppsDashScriptLib.GoogleAppsScriptNs.AnalyticsreportingUnderscoreV4Ns.SchemaNs.OrderBy,
    newPivot: () => googleDashAppsDashScriptLib.GoogleAppsScriptNs.AnalyticsreportingUnderscoreV4Ns.SchemaNs.Pivot,
    newReportRequest: () => googleDashAppsDashScriptLib.GoogleAppsScriptNs.AnalyticsreportingUnderscoreV4Ns.SchemaNs.ReportRequest,
    newSearchUserActivityRequest: () => googleDashAppsDashScriptLib.GoogleAppsScriptNs.AnalyticsreportingUnderscoreV4Ns.SchemaNs.SearchUserActivityRequest,
    newSegment: () => googleDashAppsDashScriptLib.GoogleAppsScriptNs.AnalyticsreportingUnderscoreV4Ns.SchemaNs.Segment,
    newSegmentDefinition: () => googleDashAppsDashScriptLib.GoogleAppsScriptNs.AnalyticsreportingUnderscoreV4Ns.SchemaNs.SegmentDefinition,
    newSegmentDimensionFilter: () => googleDashAppsDashScriptLib.GoogleAppsScriptNs.AnalyticsreportingUnderscoreV4Ns.SchemaNs.SegmentDimensionFilter,
    newSegmentFilter: () => googleDashAppsDashScriptLib.GoogleAppsScriptNs.AnalyticsreportingUnderscoreV4Ns.SchemaNs.SegmentFilter,
    newSegmentFilterClause: () => googleDashAppsDashScriptLib.GoogleAppsScriptNs.AnalyticsreportingUnderscoreV4Ns.SchemaNs.SegmentFilterClause,
    newSegmentMetricFilter: () => googleDashAppsDashScriptLib.GoogleAppsScriptNs.AnalyticsreportingUnderscoreV4Ns.SchemaNs.SegmentMetricFilter,
    newSegmentSequenceStep: () => googleDashAppsDashScriptLib.GoogleAppsScriptNs.AnalyticsreportingUnderscoreV4Ns.SchemaNs.SegmentSequenceStep,
    newSequenceSegment: () => googleDashAppsDashScriptLib.GoogleAppsScriptNs.AnalyticsreportingUnderscoreV4Ns.SchemaNs.SequenceSegment,
    newSimpleSegment: () => googleDashAppsDashScriptLib.GoogleAppsScriptNs.AnalyticsreportingUnderscoreV4Ns.SchemaNs.SimpleSegment,
    newUser: () => googleDashAppsDashScriptLib.GoogleAppsScriptNs.AnalyticsreportingUnderscoreV4Ns.SchemaNs.User,
    Reports: googleDashAppsDashScriptLib.GoogleAppsScriptNs.AnalyticsreportingUnderscoreV4Ns.CollectionNs.ReportsCollection = null,
    UserActivity: googleDashAppsDashScriptLib.GoogleAppsScriptNs.AnalyticsreportingUnderscoreV4Ns.CollectionNs.UserActivityCollection = null
  ): Analyticsreporting_v4 = {
    val __obj = js.Dynamic.literal(newCohort = js.Any.fromFunction0(newCohort), newCohortGroup = js.Any.fromFunction0(newCohortGroup), newDateRange = js.Any.fromFunction0(newDateRange), newDimension = js.Any.fromFunction0(newDimension), newDimensionFilter = js.Any.fromFunction0(newDimensionFilter), newDimensionFilterClause = js.Any.fromFunction0(newDimensionFilterClause), newDynamicSegment = js.Any.fromFunction0(newDynamicSegment), newGetReportsRequest = js.Any.fromFunction0(newGetReportsRequest), newMetric = js.Any.fromFunction0(newMetric), newMetricFilter = js.Any.fromFunction0(newMetricFilter), newMetricFilterClause = js.Any.fromFunction0(newMetricFilterClause), newOrFiltersForSegment = js.Any.fromFunction0(newOrFiltersForSegment), newOrderBy = js.Any.fromFunction0(newOrderBy), newPivot = js.Any.fromFunction0(newPivot), newReportRequest = js.Any.fromFunction0(newReportRequest), newSearchUserActivityRequest = js.Any.fromFunction0(newSearchUserActivityRequest), newSegment = js.Any.fromFunction0(newSegment), newSegmentDefinition = js.Any.fromFunction0(newSegmentDefinition), newSegmentDimensionFilter = js.Any.fromFunction0(newSegmentDimensionFilter), newSegmentFilter = js.Any.fromFunction0(newSegmentFilter), newSegmentFilterClause = js.Any.fromFunction0(newSegmentFilterClause), newSegmentMetricFilter = js.Any.fromFunction0(newSegmentMetricFilter), newSegmentSequenceStep = js.Any.fromFunction0(newSegmentSequenceStep), newSequenceSegment = js.Any.fromFunction0(newSequenceSegment), newSimpleSegment = js.Any.fromFunction0(newSimpleSegment), newUser = js.Any.fromFunction0(newUser))
    if (Reports != null) __obj.updateDynamic("Reports")(Reports)
    if (UserActivity != null) __obj.updateDynamic("UserActivity")(UserActivity)
    __obj.asInstanceOf[Analyticsreporting_v4]
  }
}

