package typings.googleDashAppsDashScript.GoogleAppsScriptNs

import typings.googleDashAppsDashScript.GoogleAppsScriptNs.AnalyticsreportingNs.CollectionNs.ReportsCollection
import typings.googleDashAppsDashScript.GoogleAppsScriptNs.AnalyticsreportingNs.CollectionNs.UserActivityCollection
import typings.googleDashAppsDashScript.GoogleAppsScriptNs.AnalyticsreportingNs.SchemaNs.Cohort
import typings.googleDashAppsDashScript.GoogleAppsScriptNs.AnalyticsreportingNs.SchemaNs.CohortGroup
import typings.googleDashAppsDashScript.GoogleAppsScriptNs.AnalyticsreportingNs.SchemaNs.DateRange
import typings.googleDashAppsDashScript.GoogleAppsScriptNs.AnalyticsreportingNs.SchemaNs.Dimension
import typings.googleDashAppsDashScript.GoogleAppsScriptNs.AnalyticsreportingNs.SchemaNs.DimensionFilter
import typings.googleDashAppsDashScript.GoogleAppsScriptNs.AnalyticsreportingNs.SchemaNs.DimensionFilterClause
import typings.googleDashAppsDashScript.GoogleAppsScriptNs.AnalyticsreportingNs.SchemaNs.DynamicSegment
import typings.googleDashAppsDashScript.GoogleAppsScriptNs.AnalyticsreportingNs.SchemaNs.GetReportsRequest
import typings.googleDashAppsDashScript.GoogleAppsScriptNs.AnalyticsreportingNs.SchemaNs.Metric
import typings.googleDashAppsDashScript.GoogleAppsScriptNs.AnalyticsreportingNs.SchemaNs.MetricFilter
import typings.googleDashAppsDashScript.GoogleAppsScriptNs.AnalyticsreportingNs.SchemaNs.MetricFilterClause
import typings.googleDashAppsDashScript.GoogleAppsScriptNs.AnalyticsreportingNs.SchemaNs.OrFiltersForSegment
import typings.googleDashAppsDashScript.GoogleAppsScriptNs.AnalyticsreportingNs.SchemaNs.OrderBy
import typings.googleDashAppsDashScript.GoogleAppsScriptNs.AnalyticsreportingNs.SchemaNs.Pivot
import typings.googleDashAppsDashScript.GoogleAppsScriptNs.AnalyticsreportingNs.SchemaNs.ReportRequest
import typings.googleDashAppsDashScript.GoogleAppsScriptNs.AnalyticsreportingNs.SchemaNs.SearchUserActivityRequest
import typings.googleDashAppsDashScript.GoogleAppsScriptNs.AnalyticsreportingNs.SchemaNs.Segment
import typings.googleDashAppsDashScript.GoogleAppsScriptNs.AnalyticsreportingNs.SchemaNs.SegmentDefinition
import typings.googleDashAppsDashScript.GoogleAppsScriptNs.AnalyticsreportingNs.SchemaNs.SegmentDimensionFilter
import typings.googleDashAppsDashScript.GoogleAppsScriptNs.AnalyticsreportingNs.SchemaNs.SegmentFilter
import typings.googleDashAppsDashScript.GoogleAppsScriptNs.AnalyticsreportingNs.SchemaNs.SegmentFilterClause
import typings.googleDashAppsDashScript.GoogleAppsScriptNs.AnalyticsreportingNs.SchemaNs.SegmentMetricFilter
import typings.googleDashAppsDashScript.GoogleAppsScriptNs.AnalyticsreportingNs.SchemaNs.SegmentSequenceStep
import typings.googleDashAppsDashScript.GoogleAppsScriptNs.AnalyticsreportingNs.SchemaNs.SequenceSegment
import typings.googleDashAppsDashScript.GoogleAppsScriptNs.AnalyticsreportingNs.SchemaNs.SimpleSegment
import typings.googleDashAppsDashScript.GoogleAppsScriptNs.AnalyticsreportingNs.SchemaNs.User
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Analyticsreporting extends js.Object {
  var Reports: js.UndefOr[ReportsCollection] = js.undefined
  var UserActivity: js.UndefOr[UserActivityCollection] = js.undefined
  // Create a new instance of Cohort
  def newCohort(): Cohort
  // Create a new instance of CohortGroup
  def newCohortGroup(): CohortGroup
  // Create a new instance of DateRange
  def newDateRange(): DateRange
  // Create a new instance of Dimension
  def newDimension(): Dimension
  // Create a new instance of DimensionFilter
  def newDimensionFilter(): DimensionFilter
  // Create a new instance of DimensionFilterClause
  def newDimensionFilterClause(): DimensionFilterClause
  // Create a new instance of DynamicSegment
  def newDynamicSegment(): DynamicSegment
  // Create a new instance of GetReportsRequest
  def newGetReportsRequest(): GetReportsRequest
  // Create a new instance of Metric
  def newMetric(): Metric
  // Create a new instance of MetricFilter
  def newMetricFilter(): MetricFilter
  // Create a new instance of MetricFilterClause
  def newMetricFilterClause(): MetricFilterClause
  // Create a new instance of OrFiltersForSegment
  def newOrFiltersForSegment(): OrFiltersForSegment
  // Create a new instance of OrderBy
  def newOrderBy(): OrderBy
  // Create a new instance of Pivot
  def newPivot(): Pivot
  // Create a new instance of ReportRequest
  def newReportRequest(): ReportRequest
  // Create a new instance of SearchUserActivityRequest
  def newSearchUserActivityRequest(): SearchUserActivityRequest
  // Create a new instance of Segment
  def newSegment(): Segment
  // Create a new instance of SegmentDefinition
  def newSegmentDefinition(): SegmentDefinition
  // Create a new instance of SegmentDimensionFilter
  def newSegmentDimensionFilter(): SegmentDimensionFilter
  // Create a new instance of SegmentFilter
  def newSegmentFilter(): SegmentFilter
  // Create a new instance of SegmentFilterClause
  def newSegmentFilterClause(): SegmentFilterClause
  // Create a new instance of SegmentMetricFilter
  def newSegmentMetricFilter(): SegmentMetricFilter
  // Create a new instance of SegmentSequenceStep
  def newSegmentSequenceStep(): SegmentSequenceStep
  // Create a new instance of SequenceSegment
  def newSequenceSegment(): SequenceSegment
  // Create a new instance of SimpleSegment
  def newSimpleSegment(): SimpleSegment
  // Create a new instance of User
  def newUser(): User
}

object Analyticsreporting {
  @scala.inline
  def apply(
    newCohort: () => Cohort,
    newCohortGroup: () => CohortGroup,
    newDateRange: () => DateRange,
    newDimension: () => Dimension,
    newDimensionFilter: () => DimensionFilter,
    newDimensionFilterClause: () => DimensionFilterClause,
    newDynamicSegment: () => DynamicSegment,
    newGetReportsRequest: () => GetReportsRequest,
    newMetric: () => Metric,
    newMetricFilter: () => MetricFilter,
    newMetricFilterClause: () => MetricFilterClause,
    newOrFiltersForSegment: () => OrFiltersForSegment,
    newOrderBy: () => OrderBy,
    newPivot: () => Pivot,
    newReportRequest: () => ReportRequest,
    newSearchUserActivityRequest: () => SearchUserActivityRequest,
    newSegment: () => Segment,
    newSegmentDefinition: () => SegmentDefinition,
    newSegmentDimensionFilter: () => SegmentDimensionFilter,
    newSegmentFilter: () => SegmentFilter,
    newSegmentFilterClause: () => SegmentFilterClause,
    newSegmentMetricFilter: () => SegmentMetricFilter,
    newSegmentSequenceStep: () => SegmentSequenceStep,
    newSequenceSegment: () => SequenceSegment,
    newSimpleSegment: () => SimpleSegment,
    newUser: () => User,
    Reports: ReportsCollection = null,
    UserActivity: UserActivityCollection = null
  ): Analyticsreporting = {
    val __obj = js.Dynamic.literal(newCohort = js.Any.fromFunction0(newCohort), newCohortGroup = js.Any.fromFunction0(newCohortGroup), newDateRange = js.Any.fromFunction0(newDateRange), newDimension = js.Any.fromFunction0(newDimension), newDimensionFilter = js.Any.fromFunction0(newDimensionFilter), newDimensionFilterClause = js.Any.fromFunction0(newDimensionFilterClause), newDynamicSegment = js.Any.fromFunction0(newDynamicSegment), newGetReportsRequest = js.Any.fromFunction0(newGetReportsRequest), newMetric = js.Any.fromFunction0(newMetric), newMetricFilter = js.Any.fromFunction0(newMetricFilter), newMetricFilterClause = js.Any.fromFunction0(newMetricFilterClause), newOrFiltersForSegment = js.Any.fromFunction0(newOrFiltersForSegment), newOrderBy = js.Any.fromFunction0(newOrderBy), newPivot = js.Any.fromFunction0(newPivot), newReportRequest = js.Any.fromFunction0(newReportRequest), newSearchUserActivityRequest = js.Any.fromFunction0(newSearchUserActivityRequest), newSegment = js.Any.fromFunction0(newSegment), newSegmentDefinition = js.Any.fromFunction0(newSegmentDefinition), newSegmentDimensionFilter = js.Any.fromFunction0(newSegmentDimensionFilter), newSegmentFilter = js.Any.fromFunction0(newSegmentFilter), newSegmentFilterClause = js.Any.fromFunction0(newSegmentFilterClause), newSegmentMetricFilter = js.Any.fromFunction0(newSegmentMetricFilter), newSegmentSequenceStep = js.Any.fromFunction0(newSegmentSequenceStep), newSequenceSegment = js.Any.fromFunction0(newSequenceSegment), newSimpleSegment = js.Any.fromFunction0(newSimpleSegment), newUser = js.Any.fromFunction0(newUser))
    if (Reports != null) __obj.updateDynamic("Reports")(Reports)
    if (UserActivity != null) __obj.updateDynamic("UserActivity")(UserActivity)
    __obj.asInstanceOf[Analyticsreporting]
  }
}

