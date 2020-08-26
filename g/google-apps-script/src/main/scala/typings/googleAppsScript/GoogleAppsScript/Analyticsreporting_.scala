package typings.googleAppsScript.GoogleAppsScript

import typings.googleAppsScript.GoogleAppsScript.Analyticsreporting.Collection.ReportsCollection
import typings.googleAppsScript.GoogleAppsScript.Analyticsreporting.Collection.UserActivityCollection
import typings.googleAppsScript.GoogleAppsScript.Analyticsreporting.Schema.Cohort
import typings.googleAppsScript.GoogleAppsScript.Analyticsreporting.Schema.CohortGroup
import typings.googleAppsScript.GoogleAppsScript.Analyticsreporting.Schema.DateRange
import typings.googleAppsScript.GoogleAppsScript.Analyticsreporting.Schema.Dimension
import typings.googleAppsScript.GoogleAppsScript.Analyticsreporting.Schema.DimensionFilter
import typings.googleAppsScript.GoogleAppsScript.Analyticsreporting.Schema.DimensionFilterClause
import typings.googleAppsScript.GoogleAppsScript.Analyticsreporting.Schema.DynamicSegment
import typings.googleAppsScript.GoogleAppsScript.Analyticsreporting.Schema.GetReportsRequest
import typings.googleAppsScript.GoogleAppsScript.Analyticsreporting.Schema.Metric
import typings.googleAppsScript.GoogleAppsScript.Analyticsreporting.Schema.MetricFilter
import typings.googleAppsScript.GoogleAppsScript.Analyticsreporting.Schema.MetricFilterClause
import typings.googleAppsScript.GoogleAppsScript.Analyticsreporting.Schema.OrFiltersForSegment
import typings.googleAppsScript.GoogleAppsScript.Analyticsreporting.Schema.OrderBy
import typings.googleAppsScript.GoogleAppsScript.Analyticsreporting.Schema.Pivot
import typings.googleAppsScript.GoogleAppsScript.Analyticsreporting.Schema.ReportRequest
import typings.googleAppsScript.GoogleAppsScript.Analyticsreporting.Schema.SearchUserActivityRequest
import typings.googleAppsScript.GoogleAppsScript.Analyticsreporting.Schema.Segment
import typings.googleAppsScript.GoogleAppsScript.Analyticsreporting.Schema.SegmentDefinition
import typings.googleAppsScript.GoogleAppsScript.Analyticsreporting.Schema.SegmentDimensionFilter
import typings.googleAppsScript.GoogleAppsScript.Analyticsreporting.Schema.SegmentFilter
import typings.googleAppsScript.GoogleAppsScript.Analyticsreporting.Schema.SegmentFilterClause
import typings.googleAppsScript.GoogleAppsScript.Analyticsreporting.Schema.SegmentMetricFilter
import typings.googleAppsScript.GoogleAppsScript.Analyticsreporting.Schema.SegmentSequenceStep
import typings.googleAppsScript.GoogleAppsScript.Analyticsreporting.Schema.SequenceSegment
import typings.googleAppsScript.GoogleAppsScript.Analyticsreporting.Schema.SimpleSegment
import typings.googleAppsScript.GoogleAppsScript.Analyticsreporting.Schema.User
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Analyticsreporting_ extends js.Object {
  var Reports: js.UndefOr[ReportsCollection] = js.native
  var UserActivity: js.UndefOr[UserActivityCollection] = js.native
  // Create a new instance of Cohort
  def newCohort(): Cohort = js.native
  // Create a new instance of CohortGroup
  def newCohortGroup(): CohortGroup = js.native
  // Create a new instance of DateRange
  def newDateRange(): DateRange = js.native
  // Create a new instance of Dimension
  def newDimension(): Dimension = js.native
  // Create a new instance of DimensionFilter
  def newDimensionFilter(): DimensionFilter = js.native
  // Create a new instance of DimensionFilterClause
  def newDimensionFilterClause(): DimensionFilterClause = js.native
  // Create a new instance of DynamicSegment
  def newDynamicSegment(): DynamicSegment = js.native
  // Create a new instance of GetReportsRequest
  def newGetReportsRequest(): GetReportsRequest = js.native
  // Create a new instance of Metric
  def newMetric(): Metric = js.native
  // Create a new instance of MetricFilter
  def newMetricFilter(): MetricFilter = js.native
  // Create a new instance of MetricFilterClause
  def newMetricFilterClause(): MetricFilterClause = js.native
  // Create a new instance of OrFiltersForSegment
  def newOrFiltersForSegment(): OrFiltersForSegment = js.native
  // Create a new instance of OrderBy
  def newOrderBy(): OrderBy = js.native
  // Create a new instance of Pivot
  def newPivot(): Pivot = js.native
  // Create a new instance of ReportRequest
  def newReportRequest(): ReportRequest = js.native
  // Create a new instance of SearchUserActivityRequest
  def newSearchUserActivityRequest(): SearchUserActivityRequest = js.native
  // Create a new instance of Segment
  def newSegment(): Segment = js.native
  // Create a new instance of SegmentDefinition
  def newSegmentDefinition(): SegmentDefinition = js.native
  // Create a new instance of SegmentDimensionFilter
  def newSegmentDimensionFilter(): SegmentDimensionFilter = js.native
  // Create a new instance of SegmentFilter
  def newSegmentFilter(): SegmentFilter = js.native
  // Create a new instance of SegmentFilterClause
  def newSegmentFilterClause(): SegmentFilterClause = js.native
  // Create a new instance of SegmentMetricFilter
  def newSegmentMetricFilter(): SegmentMetricFilter = js.native
  // Create a new instance of SegmentSequenceStep
  def newSegmentSequenceStep(): SegmentSequenceStep = js.native
  // Create a new instance of SequenceSegment
  def newSequenceSegment(): SequenceSegment = js.native
  // Create a new instance of SimpleSegment
  def newSimpleSegment(): SimpleSegment = js.native
  // Create a new instance of User
  def newUser(): User = js.native
}

object Analyticsreporting_ {
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
    newUser: () => User
  ): Analyticsreporting_ = {
    val __obj = js.Dynamic.literal(newCohort = js.Any.fromFunction0(newCohort), newCohortGroup = js.Any.fromFunction0(newCohortGroup), newDateRange = js.Any.fromFunction0(newDateRange), newDimension = js.Any.fromFunction0(newDimension), newDimensionFilter = js.Any.fromFunction0(newDimensionFilter), newDimensionFilterClause = js.Any.fromFunction0(newDimensionFilterClause), newDynamicSegment = js.Any.fromFunction0(newDynamicSegment), newGetReportsRequest = js.Any.fromFunction0(newGetReportsRequest), newMetric = js.Any.fromFunction0(newMetric), newMetricFilter = js.Any.fromFunction0(newMetricFilter), newMetricFilterClause = js.Any.fromFunction0(newMetricFilterClause), newOrFiltersForSegment = js.Any.fromFunction0(newOrFiltersForSegment), newOrderBy = js.Any.fromFunction0(newOrderBy), newPivot = js.Any.fromFunction0(newPivot), newReportRequest = js.Any.fromFunction0(newReportRequest), newSearchUserActivityRequest = js.Any.fromFunction0(newSearchUserActivityRequest), newSegment = js.Any.fromFunction0(newSegment), newSegmentDefinition = js.Any.fromFunction0(newSegmentDefinition), newSegmentDimensionFilter = js.Any.fromFunction0(newSegmentDimensionFilter), newSegmentFilter = js.Any.fromFunction0(newSegmentFilter), newSegmentFilterClause = js.Any.fromFunction0(newSegmentFilterClause), newSegmentMetricFilter = js.Any.fromFunction0(newSegmentMetricFilter), newSegmentSequenceStep = js.Any.fromFunction0(newSegmentSequenceStep), newSequenceSegment = js.Any.fromFunction0(newSequenceSegment), newSimpleSegment = js.Any.fromFunction0(newSimpleSegment), newUser = js.Any.fromFunction0(newUser))
    __obj.asInstanceOf[Analyticsreporting_]
  }
  @scala.inline
  implicit class Analyticsreporting_Ops[Self <: Analyticsreporting_] (val x: Self) extends AnyVal {
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
    def setNewCohort(value: () => Cohort): Self = this.set("newCohort", js.Any.fromFunction0(value))
    @scala.inline
    def setNewCohortGroup(value: () => CohortGroup): Self = this.set("newCohortGroup", js.Any.fromFunction0(value))
    @scala.inline
    def setNewDateRange(value: () => DateRange): Self = this.set("newDateRange", js.Any.fromFunction0(value))
    @scala.inline
    def setNewDimension(value: () => Dimension): Self = this.set("newDimension", js.Any.fromFunction0(value))
    @scala.inline
    def setNewDimensionFilter(value: () => DimensionFilter): Self = this.set("newDimensionFilter", js.Any.fromFunction0(value))
    @scala.inline
    def setNewDimensionFilterClause(value: () => DimensionFilterClause): Self = this.set("newDimensionFilterClause", js.Any.fromFunction0(value))
    @scala.inline
    def setNewDynamicSegment(value: () => DynamicSegment): Self = this.set("newDynamicSegment", js.Any.fromFunction0(value))
    @scala.inline
    def setNewGetReportsRequest(value: () => GetReportsRequest): Self = this.set("newGetReportsRequest", js.Any.fromFunction0(value))
    @scala.inline
    def setNewMetric(value: () => Metric): Self = this.set("newMetric", js.Any.fromFunction0(value))
    @scala.inline
    def setNewMetricFilter(value: () => MetricFilter): Self = this.set("newMetricFilter", js.Any.fromFunction0(value))
    @scala.inline
    def setNewMetricFilterClause(value: () => MetricFilterClause): Self = this.set("newMetricFilterClause", js.Any.fromFunction0(value))
    @scala.inline
    def setNewOrFiltersForSegment(value: () => OrFiltersForSegment): Self = this.set("newOrFiltersForSegment", js.Any.fromFunction0(value))
    @scala.inline
    def setNewOrderBy(value: () => OrderBy): Self = this.set("newOrderBy", js.Any.fromFunction0(value))
    @scala.inline
    def setNewPivot(value: () => Pivot): Self = this.set("newPivot", js.Any.fromFunction0(value))
    @scala.inline
    def setNewReportRequest(value: () => ReportRequest): Self = this.set("newReportRequest", js.Any.fromFunction0(value))
    @scala.inline
    def setNewSearchUserActivityRequest(value: () => SearchUserActivityRequest): Self = this.set("newSearchUserActivityRequest", js.Any.fromFunction0(value))
    @scala.inline
    def setNewSegment(value: () => Segment): Self = this.set("newSegment", js.Any.fromFunction0(value))
    @scala.inline
    def setNewSegmentDefinition(value: () => SegmentDefinition): Self = this.set("newSegmentDefinition", js.Any.fromFunction0(value))
    @scala.inline
    def setNewSegmentDimensionFilter(value: () => SegmentDimensionFilter): Self = this.set("newSegmentDimensionFilter", js.Any.fromFunction0(value))
    @scala.inline
    def setNewSegmentFilter(value: () => SegmentFilter): Self = this.set("newSegmentFilter", js.Any.fromFunction0(value))
    @scala.inline
    def setNewSegmentFilterClause(value: () => SegmentFilterClause): Self = this.set("newSegmentFilterClause", js.Any.fromFunction0(value))
    @scala.inline
    def setNewSegmentMetricFilter(value: () => SegmentMetricFilter): Self = this.set("newSegmentMetricFilter", js.Any.fromFunction0(value))
    @scala.inline
    def setNewSegmentSequenceStep(value: () => SegmentSequenceStep): Self = this.set("newSegmentSequenceStep", js.Any.fromFunction0(value))
    @scala.inline
    def setNewSequenceSegment(value: () => SequenceSegment): Self = this.set("newSequenceSegment", js.Any.fromFunction0(value))
    @scala.inline
    def setNewSimpleSegment(value: () => SimpleSegment): Self = this.set("newSimpleSegment", js.Any.fromFunction0(value))
    @scala.inline
    def setNewUser(value: () => User): Self = this.set("newUser", js.Any.fromFunction0(value))
    @scala.inline
    def setReports(value: ReportsCollection): Self = this.set("Reports", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteReports: Self = this.set("Reports", js.undefined)
    @scala.inline
    def setUserActivity(value: UserActivityCollection): Self = this.set("UserActivity", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteUserActivity: Self = this.set("UserActivity", js.undefined)
  }
  
}

