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
import typings.googleAppsScript.GoogleAppsScript.Analyticsreporting.Schema.GetReportsResponse
import typings.googleAppsScript.GoogleAppsScript.Analyticsreporting.Schema.Metric
import typings.googleAppsScript.GoogleAppsScript.Analyticsreporting.Schema.MetricFilter
import typings.googleAppsScript.GoogleAppsScript.Analyticsreporting.Schema.MetricFilterClause
import typings.googleAppsScript.GoogleAppsScript.Analyticsreporting.Schema.OrFiltersForSegment
import typings.googleAppsScript.GoogleAppsScript.Analyticsreporting.Schema.OrderBy
import typings.googleAppsScript.GoogleAppsScript.Analyticsreporting.Schema.Pivot
import typings.googleAppsScript.GoogleAppsScript.Analyticsreporting.Schema.ReportRequest
import typings.googleAppsScript.GoogleAppsScript.Analyticsreporting.Schema.SearchUserActivityRequest
import typings.googleAppsScript.GoogleAppsScript.Analyticsreporting.Schema.SearchUserActivityResponse
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
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Analyticsreporting extends StObject {
  
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
    newUser: () => User
  ): Analyticsreporting = {
    val __obj = js.Dynamic.literal(newCohort = js.Any.fromFunction0(newCohort), newCohortGroup = js.Any.fromFunction0(newCohortGroup), newDateRange = js.Any.fromFunction0(newDateRange), newDimension = js.Any.fromFunction0(newDimension), newDimensionFilter = js.Any.fromFunction0(newDimensionFilter), newDimensionFilterClause = js.Any.fromFunction0(newDimensionFilterClause), newDynamicSegment = js.Any.fromFunction0(newDynamicSegment), newGetReportsRequest = js.Any.fromFunction0(newGetReportsRequest), newMetric = js.Any.fromFunction0(newMetric), newMetricFilter = js.Any.fromFunction0(newMetricFilter), newMetricFilterClause = js.Any.fromFunction0(newMetricFilterClause), newOrFiltersForSegment = js.Any.fromFunction0(newOrFiltersForSegment), newOrderBy = js.Any.fromFunction0(newOrderBy), newPivot = js.Any.fromFunction0(newPivot), newReportRequest = js.Any.fromFunction0(newReportRequest), newSearchUserActivityRequest = js.Any.fromFunction0(newSearchUserActivityRequest), newSegment = js.Any.fromFunction0(newSegment), newSegmentDefinition = js.Any.fromFunction0(newSegmentDefinition), newSegmentDimensionFilter = js.Any.fromFunction0(newSegmentDimensionFilter), newSegmentFilter = js.Any.fromFunction0(newSegmentFilter), newSegmentFilterClause = js.Any.fromFunction0(newSegmentFilterClause), newSegmentMetricFilter = js.Any.fromFunction0(newSegmentMetricFilter), newSegmentSequenceStep = js.Any.fromFunction0(newSegmentSequenceStep), newSequenceSegment = js.Any.fromFunction0(newSequenceSegment), newSimpleSegment = js.Any.fromFunction0(newSimpleSegment), newUser = js.Any.fromFunction0(newUser))
    __obj.asInstanceOf[Analyticsreporting]
  }
  
  @scala.inline
  implicit class AnalyticsreportingMutableBuilder[Self <: Analyticsreporting] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setNewCohort(value: () => Cohort): Self = StObject.set(x, "newCohort", js.Any.fromFunction0(value))
    
    @scala.inline
    def setNewCohortGroup(value: () => CohortGroup): Self = StObject.set(x, "newCohortGroup", js.Any.fromFunction0(value))
    
    @scala.inline
    def setNewDateRange(value: () => DateRange): Self = StObject.set(x, "newDateRange", js.Any.fromFunction0(value))
    
    @scala.inline
    def setNewDimension(value: () => Dimension): Self = StObject.set(x, "newDimension", js.Any.fromFunction0(value))
    
    @scala.inline
    def setNewDimensionFilter(value: () => DimensionFilter): Self = StObject.set(x, "newDimensionFilter", js.Any.fromFunction0(value))
    
    @scala.inline
    def setNewDimensionFilterClause(value: () => DimensionFilterClause): Self = StObject.set(x, "newDimensionFilterClause", js.Any.fromFunction0(value))
    
    @scala.inline
    def setNewDynamicSegment(value: () => DynamicSegment): Self = StObject.set(x, "newDynamicSegment", js.Any.fromFunction0(value))
    
    @scala.inline
    def setNewGetReportsRequest(value: () => GetReportsRequest): Self = StObject.set(x, "newGetReportsRequest", js.Any.fromFunction0(value))
    
    @scala.inline
    def setNewMetric(value: () => Metric): Self = StObject.set(x, "newMetric", js.Any.fromFunction0(value))
    
    @scala.inline
    def setNewMetricFilter(value: () => MetricFilter): Self = StObject.set(x, "newMetricFilter", js.Any.fromFunction0(value))
    
    @scala.inline
    def setNewMetricFilterClause(value: () => MetricFilterClause): Self = StObject.set(x, "newMetricFilterClause", js.Any.fromFunction0(value))
    
    @scala.inline
    def setNewOrFiltersForSegment(value: () => OrFiltersForSegment): Self = StObject.set(x, "newOrFiltersForSegment", js.Any.fromFunction0(value))
    
    @scala.inline
    def setNewOrderBy(value: () => OrderBy): Self = StObject.set(x, "newOrderBy", js.Any.fromFunction0(value))
    
    @scala.inline
    def setNewPivot(value: () => Pivot): Self = StObject.set(x, "newPivot", js.Any.fromFunction0(value))
    
    @scala.inline
    def setNewReportRequest(value: () => ReportRequest): Self = StObject.set(x, "newReportRequest", js.Any.fromFunction0(value))
    
    @scala.inline
    def setNewSearchUserActivityRequest(value: () => SearchUserActivityRequest): Self = StObject.set(x, "newSearchUserActivityRequest", js.Any.fromFunction0(value))
    
    @scala.inline
    def setNewSegment(value: () => Segment): Self = StObject.set(x, "newSegment", js.Any.fromFunction0(value))
    
    @scala.inline
    def setNewSegmentDefinition(value: () => SegmentDefinition): Self = StObject.set(x, "newSegmentDefinition", js.Any.fromFunction0(value))
    
    @scala.inline
    def setNewSegmentDimensionFilter(value: () => SegmentDimensionFilter): Self = StObject.set(x, "newSegmentDimensionFilter", js.Any.fromFunction0(value))
    
    @scala.inline
    def setNewSegmentFilter(value: () => SegmentFilter): Self = StObject.set(x, "newSegmentFilter", js.Any.fromFunction0(value))
    
    @scala.inline
    def setNewSegmentFilterClause(value: () => SegmentFilterClause): Self = StObject.set(x, "newSegmentFilterClause", js.Any.fromFunction0(value))
    
    @scala.inline
    def setNewSegmentMetricFilter(value: () => SegmentMetricFilter): Self = StObject.set(x, "newSegmentMetricFilter", js.Any.fromFunction0(value))
    
    @scala.inline
    def setNewSegmentSequenceStep(value: () => SegmentSequenceStep): Self = StObject.set(x, "newSegmentSequenceStep", js.Any.fromFunction0(value))
    
    @scala.inline
    def setNewSequenceSegment(value: () => SequenceSegment): Self = StObject.set(x, "newSequenceSegment", js.Any.fromFunction0(value))
    
    @scala.inline
    def setNewSimpleSegment(value: () => SimpleSegment): Self = StObject.set(x, "newSimpleSegment", js.Any.fromFunction0(value))
    
    @scala.inline
    def setNewUser(value: () => User): Self = StObject.set(x, "newUser", js.Any.fromFunction0(value))
    
    @scala.inline
    def setReports(value: ReportsCollection): Self = StObject.set(x, "Reports", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setReportsUndefined: Self = StObject.set(x, "Reports", js.undefined)
    
    @scala.inline
    def setUserActivity(value: UserActivityCollection): Self = StObject.set(x, "UserActivity", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUserActivityUndefined: Self = StObject.set(x, "UserActivity", js.undefined)
  }
  
  object Collection {
    
    @js.native
    trait ReportsCollection extends StObject {
      
      // Returns the Analytics data.
      def batchGet(resource: GetReportsRequest): GetReportsResponse = js.native
    }
    object ReportsCollection {
      
      @scala.inline
      def apply(batchGet: GetReportsRequest => GetReportsResponse): ReportsCollection = {
        val __obj = js.Dynamic.literal(batchGet = js.Any.fromFunction1(batchGet))
        __obj.asInstanceOf[ReportsCollection]
      }
      
      @scala.inline
      implicit class ReportsCollectionMutableBuilder[Self <: ReportsCollection] (val x: Self) extends AnyVal {
        
        @scala.inline
        def setBatchGet(value: GetReportsRequest => GetReportsResponse): Self = StObject.set(x, "batchGet", js.Any.fromFunction1(value))
      }
    }
    
    @js.native
    trait UserActivityCollection extends StObject {
      
      // Returns User Activity data.
      def search(resource: SearchUserActivityRequest): SearchUserActivityResponse = js.native
    }
    object UserActivityCollection {
      
      @scala.inline
      def apply(search: SearchUserActivityRequest => SearchUserActivityResponse): UserActivityCollection = {
        val __obj = js.Dynamic.literal(search = js.Any.fromFunction1(search))
        __obj.asInstanceOf[UserActivityCollection]
      }
      
      @scala.inline
      implicit class UserActivityCollectionMutableBuilder[Self <: UserActivityCollection] (val x: Self) extends AnyVal {
        
        @scala.inline
        def setSearch(value: SearchUserActivityRequest => SearchUserActivityResponse): Self = StObject.set(x, "search", js.Any.fromFunction1(value))
      }
    }
  }
  
  object Schema {
    
    @js.native
    trait Activity extends StObject {
      
      var activityTime: js.UndefOr[String] = js.native
      
      var activityType: js.UndefOr[String] = js.native
      
      var appview: js.UndefOr[ScreenviewData] = js.native
      
      var campaign: js.UndefOr[String] = js.native
      
      var channelGrouping: js.UndefOr[String] = js.native
      
      var customDimension: js.UndefOr[js.Array[CustomDimension]] = js.native
      
      var ecommerce: js.UndefOr[EcommerceData] = js.native
      
      var event: js.UndefOr[EventData] = js.native
      
      var goals: js.UndefOr[GoalSetData] = js.native
      
      var hostname: js.UndefOr[String] = js.native
      
      var keyword: js.UndefOr[String] = js.native
      
      var landingPagePath: js.UndefOr[String] = js.native
      
      var medium: js.UndefOr[String] = js.native
      
      var pageview: js.UndefOr[PageviewData] = js.native
      
      var source: js.UndefOr[String] = js.native
    }
    object Activity {
      
      @scala.inline
      def apply(): Activity = {
        val __obj = js.Dynamic.literal()
        __obj.asInstanceOf[Activity]
      }
      
      @scala.inline
      implicit class ActivityMutableBuilder[Self <: Activity] (val x: Self) extends AnyVal {
        
        @scala.inline
        def setActivityTime(value: String): Self = StObject.set(x, "activityTime", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setActivityTimeUndefined: Self = StObject.set(x, "activityTime", js.undefined)
        
        @scala.inline
        def setActivityType(value: String): Self = StObject.set(x, "activityType", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setActivityTypeUndefined: Self = StObject.set(x, "activityType", js.undefined)
        
        @scala.inline
        def setAppview(value: ScreenviewData): Self = StObject.set(x, "appview", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setAppviewUndefined: Self = StObject.set(x, "appview", js.undefined)
        
        @scala.inline
        def setCampaign(value: String): Self = StObject.set(x, "campaign", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setCampaignUndefined: Self = StObject.set(x, "campaign", js.undefined)
        
        @scala.inline
        def setChannelGrouping(value: String): Self = StObject.set(x, "channelGrouping", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setChannelGroupingUndefined: Self = StObject.set(x, "channelGrouping", js.undefined)
        
        @scala.inline
        def setCustomDimension(value: js.Array[CustomDimension]): Self = StObject.set(x, "customDimension", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setCustomDimensionUndefined: Self = StObject.set(x, "customDimension", js.undefined)
        
        @scala.inline
        def setCustomDimensionVarargs(value: CustomDimension*): Self = StObject.set(x, "customDimension", js.Array(value :_*))
        
        @scala.inline
        def setEcommerce(value: EcommerceData): Self = StObject.set(x, "ecommerce", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setEcommerceUndefined: Self = StObject.set(x, "ecommerce", js.undefined)
        
        @scala.inline
        def setEvent(value: EventData): Self = StObject.set(x, "event", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setEventUndefined: Self = StObject.set(x, "event", js.undefined)
        
        @scala.inline
        def setGoals(value: GoalSetData): Self = StObject.set(x, "goals", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setGoalsUndefined: Self = StObject.set(x, "goals", js.undefined)
        
        @scala.inline
        def setHostname(value: String): Self = StObject.set(x, "hostname", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setHostnameUndefined: Self = StObject.set(x, "hostname", js.undefined)
        
        @scala.inline
        def setKeyword(value: String): Self = StObject.set(x, "keyword", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setKeywordUndefined: Self = StObject.set(x, "keyword", js.undefined)
        
        @scala.inline
        def setLandingPagePath(value: String): Self = StObject.set(x, "landingPagePath", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setLandingPagePathUndefined: Self = StObject.set(x, "landingPagePath", js.undefined)
        
        @scala.inline
        def setMedium(value: String): Self = StObject.set(x, "medium", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setMediumUndefined: Self = StObject.set(x, "medium", js.undefined)
        
        @scala.inline
        def setPageview(value: PageviewData): Self = StObject.set(x, "pageview", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setPageviewUndefined: Self = StObject.set(x, "pageview", js.undefined)
        
        @scala.inline
        def setSource(value: String): Self = StObject.set(x, "source", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setSourceUndefined: Self = StObject.set(x, "source", js.undefined)
      }
    }
    
    @js.native
    trait Cohort extends StObject {
      
      var dateRange: js.UndefOr[DateRange] = js.native
      
      var name: js.UndefOr[String] = js.native
      
      var `type`: js.UndefOr[String] = js.native
    }
    object Cohort {
      
      @scala.inline
      def apply(): Cohort = {
        val __obj = js.Dynamic.literal()
        __obj.asInstanceOf[Cohort]
      }
      
      @scala.inline
      implicit class CohortMutableBuilder[Self <: Cohort] (val x: Self) extends AnyVal {
        
        @scala.inline
        def setDateRange(value: DateRange): Self = StObject.set(x, "dateRange", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setDateRangeUndefined: Self = StObject.set(x, "dateRange", js.undefined)
        
        @scala.inline
        def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
        
        @scala.inline
        def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
      }
    }
    
    @js.native
    trait CohortGroup extends StObject {
      
      var cohorts: js.UndefOr[js.Array[Cohort]] = js.native
      
      var lifetimeValue: js.UndefOr[Boolean] = js.native
    }
    object CohortGroup {
      
      @scala.inline
      def apply(): CohortGroup = {
        val __obj = js.Dynamic.literal()
        __obj.asInstanceOf[CohortGroup]
      }
      
      @scala.inline
      implicit class CohortGroupMutableBuilder[Self <: CohortGroup] (val x: Self) extends AnyVal {
        
        @scala.inline
        def setCohorts(value: js.Array[Cohort]): Self = StObject.set(x, "cohorts", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setCohortsUndefined: Self = StObject.set(x, "cohorts", js.undefined)
        
        @scala.inline
        def setCohortsVarargs(value: Cohort*): Self = StObject.set(x, "cohorts", js.Array(value :_*))
        
        @scala.inline
        def setLifetimeValue(value: Boolean): Self = StObject.set(x, "lifetimeValue", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setLifetimeValueUndefined: Self = StObject.set(x, "lifetimeValue", js.undefined)
      }
    }
    
    @js.native
    trait ColumnHeader extends StObject {
      
      var dimensions: js.UndefOr[js.Array[String]] = js.native
      
      var metricHeader: js.UndefOr[MetricHeader] = js.native
    }
    object ColumnHeader {
      
      @scala.inline
      def apply(): ColumnHeader = {
        val __obj = js.Dynamic.literal()
        __obj.asInstanceOf[ColumnHeader]
      }
      
      @scala.inline
      implicit class ColumnHeaderMutableBuilder[Self <: ColumnHeader] (val x: Self) extends AnyVal {
        
        @scala.inline
        def setDimensions(value: js.Array[String]): Self = StObject.set(x, "dimensions", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setDimensionsUndefined: Self = StObject.set(x, "dimensions", js.undefined)
        
        @scala.inline
        def setDimensionsVarargs(value: String*): Self = StObject.set(x, "dimensions", js.Array(value :_*))
        
        @scala.inline
        def setMetricHeader(value: MetricHeader): Self = StObject.set(x, "metricHeader", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setMetricHeaderUndefined: Self = StObject.set(x, "metricHeader", js.undefined)
      }
    }
    
    @js.native
    trait CustomDimension extends StObject {
      
      var index: js.UndefOr[Double] = js.native
      
      var value: js.UndefOr[String] = js.native
    }
    object CustomDimension {
      
      @scala.inline
      def apply(): CustomDimension = {
        val __obj = js.Dynamic.literal()
        __obj.asInstanceOf[CustomDimension]
      }
      
      @scala.inline
      implicit class CustomDimensionMutableBuilder[Self <: CustomDimension] (val x: Self) extends AnyVal {
        
        @scala.inline
        def setIndex(value: Double): Self = StObject.set(x, "index", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setIndexUndefined: Self = StObject.set(x, "index", js.undefined)
        
        @scala.inline
        def setValue(value: String): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setValueUndefined: Self = StObject.set(x, "value", js.undefined)
      }
    }
    
    @js.native
    trait DateRange extends StObject {
      
      var endDate: js.UndefOr[String] = js.native
      
      var startDate: js.UndefOr[String] = js.native
    }
    object DateRange {
      
      @scala.inline
      def apply(): DateRange = {
        val __obj = js.Dynamic.literal()
        __obj.asInstanceOf[DateRange]
      }
      
      @scala.inline
      implicit class DateRangeMutableBuilder[Self <: DateRange] (val x: Self) extends AnyVal {
        
        @scala.inline
        def setEndDate(value: String): Self = StObject.set(x, "endDate", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setEndDateUndefined: Self = StObject.set(x, "endDate", js.undefined)
        
        @scala.inline
        def setStartDate(value: String): Self = StObject.set(x, "startDate", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setStartDateUndefined: Self = StObject.set(x, "startDate", js.undefined)
      }
    }
    
    @js.native
    trait DateRangeValues extends StObject {
      
      var pivotValueRegions: js.UndefOr[js.Array[PivotValueRegion]] = js.native
      
      var values: js.UndefOr[js.Array[String]] = js.native
    }
    object DateRangeValues {
      
      @scala.inline
      def apply(): DateRangeValues = {
        val __obj = js.Dynamic.literal()
        __obj.asInstanceOf[DateRangeValues]
      }
      
      @scala.inline
      implicit class DateRangeValuesMutableBuilder[Self <: DateRangeValues] (val x: Self) extends AnyVal {
        
        @scala.inline
        def setPivotValueRegions(value: js.Array[PivotValueRegion]): Self = StObject.set(x, "pivotValueRegions", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setPivotValueRegionsUndefined: Self = StObject.set(x, "pivotValueRegions", js.undefined)
        
        @scala.inline
        def setPivotValueRegionsVarargs(value: PivotValueRegion*): Self = StObject.set(x, "pivotValueRegions", js.Array(value :_*))
        
        @scala.inline
        def setValues(value: js.Array[String]): Self = StObject.set(x, "values", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setValuesUndefined: Self = StObject.set(x, "values", js.undefined)
        
        @scala.inline
        def setValuesVarargs(value: String*): Self = StObject.set(x, "values", js.Array(value :_*))
      }
    }
    
    @js.native
    trait Dimension extends StObject {
      
      var histogramBuckets: js.UndefOr[js.Array[String]] = js.native
      
      var name: js.UndefOr[String] = js.native
    }
    object Dimension {
      
      @scala.inline
      def apply(): Dimension = {
        val __obj = js.Dynamic.literal()
        __obj.asInstanceOf[Dimension]
      }
      
      @scala.inline
      implicit class DimensionMutableBuilder[Self <: Dimension] (val x: Self) extends AnyVal {
        
        @scala.inline
        def setHistogramBuckets(value: js.Array[String]): Self = StObject.set(x, "histogramBuckets", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setHistogramBucketsUndefined: Self = StObject.set(x, "histogramBuckets", js.undefined)
        
        @scala.inline
        def setHistogramBucketsVarargs(value: String*): Self = StObject.set(x, "histogramBuckets", js.Array(value :_*))
        
        @scala.inline
        def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
      }
    }
    
    @js.native
    trait DimensionFilter extends StObject {
      
      var caseSensitive: js.UndefOr[Boolean] = js.native
      
      var dimensionName: js.UndefOr[String] = js.native
      
      var expressions: js.UndefOr[js.Array[String]] = js.native
      
      var not: js.UndefOr[Boolean] = js.native
      
      var operator: js.UndefOr[String] = js.native
    }
    object DimensionFilter {
      
      @scala.inline
      def apply(): DimensionFilter = {
        val __obj = js.Dynamic.literal()
        __obj.asInstanceOf[DimensionFilter]
      }
      
      @scala.inline
      implicit class DimensionFilterMutableBuilder[Self <: DimensionFilter] (val x: Self) extends AnyVal {
        
        @scala.inline
        def setCaseSensitive(value: Boolean): Self = StObject.set(x, "caseSensitive", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setCaseSensitiveUndefined: Self = StObject.set(x, "caseSensitive", js.undefined)
        
        @scala.inline
        def setDimensionName(value: String): Self = StObject.set(x, "dimensionName", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setDimensionNameUndefined: Self = StObject.set(x, "dimensionName", js.undefined)
        
        @scala.inline
        def setExpressions(value: js.Array[String]): Self = StObject.set(x, "expressions", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setExpressionsUndefined: Self = StObject.set(x, "expressions", js.undefined)
        
        @scala.inline
        def setExpressionsVarargs(value: String*): Self = StObject.set(x, "expressions", js.Array(value :_*))
        
        @scala.inline
        def setNot(value: Boolean): Self = StObject.set(x, "not", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setNotUndefined: Self = StObject.set(x, "not", js.undefined)
        
        @scala.inline
        def setOperator(value: String): Self = StObject.set(x, "operator", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setOperatorUndefined: Self = StObject.set(x, "operator", js.undefined)
      }
    }
    
    @js.native
    trait DimensionFilterClause extends StObject {
      
      var filters: js.UndefOr[js.Array[DimensionFilter]] = js.native
      
      var operator: js.UndefOr[String] = js.native
    }
    object DimensionFilterClause {
      
      @scala.inline
      def apply(): DimensionFilterClause = {
        val __obj = js.Dynamic.literal()
        __obj.asInstanceOf[DimensionFilterClause]
      }
      
      @scala.inline
      implicit class DimensionFilterClauseMutableBuilder[Self <: DimensionFilterClause] (val x: Self) extends AnyVal {
        
        @scala.inline
        def setFilters(value: js.Array[DimensionFilter]): Self = StObject.set(x, "filters", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setFiltersUndefined: Self = StObject.set(x, "filters", js.undefined)
        
        @scala.inline
        def setFiltersVarargs(value: DimensionFilter*): Self = StObject.set(x, "filters", js.Array(value :_*))
        
        @scala.inline
        def setOperator(value: String): Self = StObject.set(x, "operator", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setOperatorUndefined: Self = StObject.set(x, "operator", js.undefined)
      }
    }
    
    @js.native
    trait DynamicSegment extends StObject {
      
      var name: js.UndefOr[String] = js.native
      
      var sessionSegment: js.UndefOr[SegmentDefinition] = js.native
      
      var userSegment: js.UndefOr[SegmentDefinition] = js.native
    }
    object DynamicSegment {
      
      @scala.inline
      def apply(): DynamicSegment = {
        val __obj = js.Dynamic.literal()
        __obj.asInstanceOf[DynamicSegment]
      }
      
      @scala.inline
      implicit class DynamicSegmentMutableBuilder[Self <: DynamicSegment] (val x: Self) extends AnyVal {
        
        @scala.inline
        def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
        
        @scala.inline
        def setSessionSegment(value: SegmentDefinition): Self = StObject.set(x, "sessionSegment", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setSessionSegmentUndefined: Self = StObject.set(x, "sessionSegment", js.undefined)
        
        @scala.inline
        def setUserSegment(value: SegmentDefinition): Self = StObject.set(x, "userSegment", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setUserSegmentUndefined: Self = StObject.set(x, "userSegment", js.undefined)
      }
    }
    
    @js.native
    trait EcommerceData extends StObject {
      
      var actionType: js.UndefOr[String] = js.native
      
      var ecommerceType: js.UndefOr[String] = js.native
      
      var products: js.UndefOr[js.Array[ProductData]] = js.native
      
      var transaction: js.UndefOr[TransactionData] = js.native
    }
    object EcommerceData {
      
      @scala.inline
      def apply(): EcommerceData = {
        val __obj = js.Dynamic.literal()
        __obj.asInstanceOf[EcommerceData]
      }
      
      @scala.inline
      implicit class EcommerceDataMutableBuilder[Self <: EcommerceData] (val x: Self) extends AnyVal {
        
        @scala.inline
        def setActionType(value: String): Self = StObject.set(x, "actionType", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setActionTypeUndefined: Self = StObject.set(x, "actionType", js.undefined)
        
        @scala.inline
        def setEcommerceType(value: String): Self = StObject.set(x, "ecommerceType", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setEcommerceTypeUndefined: Self = StObject.set(x, "ecommerceType", js.undefined)
        
        @scala.inline
        def setProducts(value: js.Array[ProductData]): Self = StObject.set(x, "products", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setProductsUndefined: Self = StObject.set(x, "products", js.undefined)
        
        @scala.inline
        def setProductsVarargs(value: ProductData*): Self = StObject.set(x, "products", js.Array(value :_*))
        
        @scala.inline
        def setTransaction(value: TransactionData): Self = StObject.set(x, "transaction", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setTransactionUndefined: Self = StObject.set(x, "transaction", js.undefined)
      }
    }
    
    @js.native
    trait EventData extends StObject {
      
      var eventAction: js.UndefOr[String] = js.native
      
      var eventCategory: js.UndefOr[String] = js.native
      
      var eventCount: js.UndefOr[String] = js.native
      
      var eventLabel: js.UndefOr[String] = js.native
      
      var eventValue: js.UndefOr[String] = js.native
    }
    object EventData {
      
      @scala.inline
      def apply(): EventData = {
        val __obj = js.Dynamic.literal()
        __obj.asInstanceOf[EventData]
      }
      
      @scala.inline
      implicit class EventDataMutableBuilder[Self <: EventData] (val x: Self) extends AnyVal {
        
        @scala.inline
        def setEventAction(value: String): Self = StObject.set(x, "eventAction", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setEventActionUndefined: Self = StObject.set(x, "eventAction", js.undefined)
        
        @scala.inline
        def setEventCategory(value: String): Self = StObject.set(x, "eventCategory", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setEventCategoryUndefined: Self = StObject.set(x, "eventCategory", js.undefined)
        
        @scala.inline
        def setEventCount(value: String): Self = StObject.set(x, "eventCount", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setEventCountUndefined: Self = StObject.set(x, "eventCount", js.undefined)
        
        @scala.inline
        def setEventLabel(value: String): Self = StObject.set(x, "eventLabel", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setEventLabelUndefined: Self = StObject.set(x, "eventLabel", js.undefined)
        
        @scala.inline
        def setEventValue(value: String): Self = StObject.set(x, "eventValue", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setEventValueUndefined: Self = StObject.set(x, "eventValue", js.undefined)
      }
    }
    
    @js.native
    trait GetReportsRequest extends StObject {
      
      var reportRequests: js.UndefOr[js.Array[ReportRequest]] = js.native
      
      var useResourceQuotas: js.UndefOr[Boolean] = js.native
    }
    object GetReportsRequest {
      
      @scala.inline
      def apply(): GetReportsRequest = {
        val __obj = js.Dynamic.literal()
        __obj.asInstanceOf[GetReportsRequest]
      }
      
      @scala.inline
      implicit class GetReportsRequestMutableBuilder[Self <: GetReportsRequest] (val x: Self) extends AnyVal {
        
        @scala.inline
        def setReportRequests(value: js.Array[ReportRequest]): Self = StObject.set(x, "reportRequests", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setReportRequestsUndefined: Self = StObject.set(x, "reportRequests", js.undefined)
        
        @scala.inline
        def setReportRequestsVarargs(value: ReportRequest*): Self = StObject.set(x, "reportRequests", js.Array(value :_*))
        
        @scala.inline
        def setUseResourceQuotas(value: Boolean): Self = StObject.set(x, "useResourceQuotas", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setUseResourceQuotasUndefined: Self = StObject.set(x, "useResourceQuotas", js.undefined)
      }
    }
    
    @js.native
    trait GetReportsResponse extends StObject {
      
      var queryCost: js.UndefOr[Double] = js.native
      
      var reports: js.UndefOr[js.Array[Report]] = js.native
      
      var resourceQuotasRemaining: js.UndefOr[ResourceQuotasRemaining] = js.native
    }
    object GetReportsResponse {
      
      @scala.inline
      def apply(): GetReportsResponse = {
        val __obj = js.Dynamic.literal()
        __obj.asInstanceOf[GetReportsResponse]
      }
      
      @scala.inline
      implicit class GetReportsResponseMutableBuilder[Self <: GetReportsResponse] (val x: Self) extends AnyVal {
        
        @scala.inline
        def setQueryCost(value: Double): Self = StObject.set(x, "queryCost", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setQueryCostUndefined: Self = StObject.set(x, "queryCost", js.undefined)
        
        @scala.inline
        def setReports(value: js.Array[Report]): Self = StObject.set(x, "reports", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setReportsUndefined: Self = StObject.set(x, "reports", js.undefined)
        
        @scala.inline
        def setReportsVarargs(value: Report*): Self = StObject.set(x, "reports", js.Array(value :_*))
        
        @scala.inline
        def setResourceQuotasRemaining(value: ResourceQuotasRemaining): Self = StObject.set(x, "resourceQuotasRemaining", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setResourceQuotasRemainingUndefined: Self = StObject.set(x, "resourceQuotasRemaining", js.undefined)
      }
    }
    
    @js.native
    trait GoalData extends StObject {
      
      var goalCompletionLocation: js.UndefOr[String] = js.native
      
      var goalCompletions: js.UndefOr[String] = js.native
      
      var goalIndex: js.UndefOr[Double] = js.native
      
      var goalName: js.UndefOr[String] = js.native
      
      var goalPreviousStep1: js.UndefOr[String] = js.native
      
      var goalPreviousStep2: js.UndefOr[String] = js.native
      
      var goalPreviousStep3: js.UndefOr[String] = js.native
      
      var goalValue: js.UndefOr[Double] = js.native
    }
    object GoalData {
      
      @scala.inline
      def apply(): GoalData = {
        val __obj = js.Dynamic.literal()
        __obj.asInstanceOf[GoalData]
      }
      
      @scala.inline
      implicit class GoalDataMutableBuilder[Self <: GoalData] (val x: Self) extends AnyVal {
        
        @scala.inline
        def setGoalCompletionLocation(value: String): Self = StObject.set(x, "goalCompletionLocation", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setGoalCompletionLocationUndefined: Self = StObject.set(x, "goalCompletionLocation", js.undefined)
        
        @scala.inline
        def setGoalCompletions(value: String): Self = StObject.set(x, "goalCompletions", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setGoalCompletionsUndefined: Self = StObject.set(x, "goalCompletions", js.undefined)
        
        @scala.inline
        def setGoalIndex(value: Double): Self = StObject.set(x, "goalIndex", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setGoalIndexUndefined: Self = StObject.set(x, "goalIndex", js.undefined)
        
        @scala.inline
        def setGoalName(value: String): Self = StObject.set(x, "goalName", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setGoalNameUndefined: Self = StObject.set(x, "goalName", js.undefined)
        
        @scala.inline
        def setGoalPreviousStep1(value: String): Self = StObject.set(x, "goalPreviousStep1", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setGoalPreviousStep1Undefined: Self = StObject.set(x, "goalPreviousStep1", js.undefined)
        
        @scala.inline
        def setGoalPreviousStep2(value: String): Self = StObject.set(x, "goalPreviousStep2", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setGoalPreviousStep2Undefined: Self = StObject.set(x, "goalPreviousStep2", js.undefined)
        
        @scala.inline
        def setGoalPreviousStep3(value: String): Self = StObject.set(x, "goalPreviousStep3", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setGoalPreviousStep3Undefined: Self = StObject.set(x, "goalPreviousStep3", js.undefined)
        
        @scala.inline
        def setGoalValue(value: Double): Self = StObject.set(x, "goalValue", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setGoalValueUndefined: Self = StObject.set(x, "goalValue", js.undefined)
      }
    }
    
    @js.native
    trait GoalSetData extends StObject {
      
      var goals: js.UndefOr[js.Array[GoalData]] = js.native
    }
    object GoalSetData {
      
      @scala.inline
      def apply(): GoalSetData = {
        val __obj = js.Dynamic.literal()
        __obj.asInstanceOf[GoalSetData]
      }
      
      @scala.inline
      implicit class GoalSetDataMutableBuilder[Self <: GoalSetData] (val x: Self) extends AnyVal {
        
        @scala.inline
        def setGoals(value: js.Array[GoalData]): Self = StObject.set(x, "goals", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setGoalsUndefined: Self = StObject.set(x, "goals", js.undefined)
        
        @scala.inline
        def setGoalsVarargs(value: GoalData*): Self = StObject.set(x, "goals", js.Array(value :_*))
      }
    }
    
    @js.native
    trait Metric extends StObject {
      
      var alias: js.UndefOr[String] = js.native
      
      var expression: js.UndefOr[String] = js.native
      
      var formattingType: js.UndefOr[String] = js.native
    }
    object Metric {
      
      @scala.inline
      def apply(): Metric = {
        val __obj = js.Dynamic.literal()
        __obj.asInstanceOf[Metric]
      }
      
      @scala.inline
      implicit class MetricMutableBuilder[Self <: Metric] (val x: Self) extends AnyVal {
        
        @scala.inline
        def setAlias(value: String): Self = StObject.set(x, "alias", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setAliasUndefined: Self = StObject.set(x, "alias", js.undefined)
        
        @scala.inline
        def setExpression(value: String): Self = StObject.set(x, "expression", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setExpressionUndefined: Self = StObject.set(x, "expression", js.undefined)
        
        @scala.inline
        def setFormattingType(value: String): Self = StObject.set(x, "formattingType", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setFormattingTypeUndefined: Self = StObject.set(x, "formattingType", js.undefined)
      }
    }
    
    @js.native
    trait MetricFilter extends StObject {
      
      var comparisonValue: js.UndefOr[String] = js.native
      
      var metricName: js.UndefOr[String] = js.native
      
      var not: js.UndefOr[Boolean] = js.native
      
      var operator: js.UndefOr[String] = js.native
    }
    object MetricFilter {
      
      @scala.inline
      def apply(): MetricFilter = {
        val __obj = js.Dynamic.literal()
        __obj.asInstanceOf[MetricFilter]
      }
      
      @scala.inline
      implicit class MetricFilterMutableBuilder[Self <: MetricFilter] (val x: Self) extends AnyVal {
        
        @scala.inline
        def setComparisonValue(value: String): Self = StObject.set(x, "comparisonValue", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setComparisonValueUndefined: Self = StObject.set(x, "comparisonValue", js.undefined)
        
        @scala.inline
        def setMetricName(value: String): Self = StObject.set(x, "metricName", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setMetricNameUndefined: Self = StObject.set(x, "metricName", js.undefined)
        
        @scala.inline
        def setNot(value: Boolean): Self = StObject.set(x, "not", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setNotUndefined: Self = StObject.set(x, "not", js.undefined)
        
        @scala.inline
        def setOperator(value: String): Self = StObject.set(x, "operator", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setOperatorUndefined: Self = StObject.set(x, "operator", js.undefined)
      }
    }
    
    @js.native
    trait MetricFilterClause extends StObject {
      
      var filters: js.UndefOr[js.Array[MetricFilter]] = js.native
      
      var operator: js.UndefOr[String] = js.native
    }
    object MetricFilterClause {
      
      @scala.inline
      def apply(): MetricFilterClause = {
        val __obj = js.Dynamic.literal()
        __obj.asInstanceOf[MetricFilterClause]
      }
      
      @scala.inline
      implicit class MetricFilterClauseMutableBuilder[Self <: MetricFilterClause] (val x: Self) extends AnyVal {
        
        @scala.inline
        def setFilters(value: js.Array[MetricFilter]): Self = StObject.set(x, "filters", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setFiltersUndefined: Self = StObject.set(x, "filters", js.undefined)
        
        @scala.inline
        def setFiltersVarargs(value: MetricFilter*): Self = StObject.set(x, "filters", js.Array(value :_*))
        
        @scala.inline
        def setOperator(value: String): Self = StObject.set(x, "operator", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setOperatorUndefined: Self = StObject.set(x, "operator", js.undefined)
      }
    }
    
    @js.native
    trait MetricHeader extends StObject {
      
      var metricHeaderEntries: js.UndefOr[js.Array[MetricHeaderEntry]] = js.native
      
      var pivotHeaders: js.UndefOr[js.Array[PivotHeader]] = js.native
    }
    object MetricHeader {
      
      @scala.inline
      def apply(): MetricHeader = {
        val __obj = js.Dynamic.literal()
        __obj.asInstanceOf[MetricHeader]
      }
      
      @scala.inline
      implicit class MetricHeaderMutableBuilder[Self <: MetricHeader] (val x: Self) extends AnyVal {
        
        @scala.inline
        def setMetricHeaderEntries(value: js.Array[MetricHeaderEntry]): Self = StObject.set(x, "metricHeaderEntries", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setMetricHeaderEntriesUndefined: Self = StObject.set(x, "metricHeaderEntries", js.undefined)
        
        @scala.inline
        def setMetricHeaderEntriesVarargs(value: MetricHeaderEntry*): Self = StObject.set(x, "metricHeaderEntries", js.Array(value :_*))
        
        @scala.inline
        def setPivotHeaders(value: js.Array[PivotHeader]): Self = StObject.set(x, "pivotHeaders", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setPivotHeadersUndefined: Self = StObject.set(x, "pivotHeaders", js.undefined)
        
        @scala.inline
        def setPivotHeadersVarargs(value: PivotHeader*): Self = StObject.set(x, "pivotHeaders", js.Array(value :_*))
      }
    }
    
    @js.native
    trait MetricHeaderEntry extends StObject {
      
      var name: js.UndefOr[String] = js.native
      
      var `type`: js.UndefOr[String] = js.native
    }
    object MetricHeaderEntry {
      
      @scala.inline
      def apply(): MetricHeaderEntry = {
        val __obj = js.Dynamic.literal()
        __obj.asInstanceOf[MetricHeaderEntry]
      }
      
      @scala.inline
      implicit class MetricHeaderEntryMutableBuilder[Self <: MetricHeaderEntry] (val x: Self) extends AnyVal {
        
        @scala.inline
        def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
        
        @scala.inline
        def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
      }
    }
    
    @js.native
    trait OrFiltersForSegment extends StObject {
      
      var segmentFilterClauses: js.UndefOr[js.Array[SegmentFilterClause]] = js.native
    }
    object OrFiltersForSegment {
      
      @scala.inline
      def apply(): OrFiltersForSegment = {
        val __obj = js.Dynamic.literal()
        __obj.asInstanceOf[OrFiltersForSegment]
      }
      
      @scala.inline
      implicit class OrFiltersForSegmentMutableBuilder[Self <: OrFiltersForSegment] (val x: Self) extends AnyVal {
        
        @scala.inline
        def setSegmentFilterClauses(value: js.Array[SegmentFilterClause]): Self = StObject.set(x, "segmentFilterClauses", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setSegmentFilterClausesUndefined: Self = StObject.set(x, "segmentFilterClauses", js.undefined)
        
        @scala.inline
        def setSegmentFilterClausesVarargs(value: SegmentFilterClause*): Self = StObject.set(x, "segmentFilterClauses", js.Array(value :_*))
      }
    }
    
    @js.native
    trait OrderBy extends StObject {
      
      var fieldName: js.UndefOr[String] = js.native
      
      var orderType: js.UndefOr[String] = js.native
      
      var sortOrder: js.UndefOr[String] = js.native
    }
    object OrderBy {
      
      @scala.inline
      def apply(): OrderBy = {
        val __obj = js.Dynamic.literal()
        __obj.asInstanceOf[OrderBy]
      }
      
      @scala.inline
      implicit class OrderByMutableBuilder[Self <: OrderBy] (val x: Self) extends AnyVal {
        
        @scala.inline
        def setFieldName(value: String): Self = StObject.set(x, "fieldName", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setFieldNameUndefined: Self = StObject.set(x, "fieldName", js.undefined)
        
        @scala.inline
        def setOrderType(value: String): Self = StObject.set(x, "orderType", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setOrderTypeUndefined: Self = StObject.set(x, "orderType", js.undefined)
        
        @scala.inline
        def setSortOrder(value: String): Self = StObject.set(x, "sortOrder", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setSortOrderUndefined: Self = StObject.set(x, "sortOrder", js.undefined)
      }
    }
    
    @js.native
    trait PageviewData extends StObject {
      
      var pagePath: js.UndefOr[String] = js.native
      
      var pageTitle: js.UndefOr[String] = js.native
    }
    object PageviewData {
      
      @scala.inline
      def apply(): PageviewData = {
        val __obj = js.Dynamic.literal()
        __obj.asInstanceOf[PageviewData]
      }
      
      @scala.inline
      implicit class PageviewDataMutableBuilder[Self <: PageviewData] (val x: Self) extends AnyVal {
        
        @scala.inline
        def setPagePath(value: String): Self = StObject.set(x, "pagePath", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setPagePathUndefined: Self = StObject.set(x, "pagePath", js.undefined)
        
        @scala.inline
        def setPageTitle(value: String): Self = StObject.set(x, "pageTitle", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setPageTitleUndefined: Self = StObject.set(x, "pageTitle", js.undefined)
      }
    }
    
    @js.native
    trait Pivot extends StObject {
      
      var dimensionFilterClauses: js.UndefOr[js.Array[DimensionFilterClause]] = js.native
      
      var dimensions: js.UndefOr[js.Array[Dimension]] = js.native
      
      var maxGroupCount: js.UndefOr[Double] = js.native
      
      var metrics: js.UndefOr[js.Array[Metric]] = js.native
      
      var startGroup: js.UndefOr[Double] = js.native
    }
    object Pivot {
      
      @scala.inline
      def apply(): Pivot = {
        val __obj = js.Dynamic.literal()
        __obj.asInstanceOf[Pivot]
      }
      
      @scala.inline
      implicit class PivotMutableBuilder[Self <: Pivot] (val x: Self) extends AnyVal {
        
        @scala.inline
        def setDimensionFilterClauses(value: js.Array[DimensionFilterClause]): Self = StObject.set(x, "dimensionFilterClauses", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setDimensionFilterClausesUndefined: Self = StObject.set(x, "dimensionFilterClauses", js.undefined)
        
        @scala.inline
        def setDimensionFilterClausesVarargs(value: DimensionFilterClause*): Self = StObject.set(x, "dimensionFilterClauses", js.Array(value :_*))
        
        @scala.inline
        def setDimensions(value: js.Array[Dimension]): Self = StObject.set(x, "dimensions", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setDimensionsUndefined: Self = StObject.set(x, "dimensions", js.undefined)
        
        @scala.inline
        def setDimensionsVarargs(value: Dimension*): Self = StObject.set(x, "dimensions", js.Array(value :_*))
        
        @scala.inline
        def setMaxGroupCount(value: Double): Self = StObject.set(x, "maxGroupCount", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setMaxGroupCountUndefined: Self = StObject.set(x, "maxGroupCount", js.undefined)
        
        @scala.inline
        def setMetrics(value: js.Array[Metric]): Self = StObject.set(x, "metrics", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setMetricsUndefined: Self = StObject.set(x, "metrics", js.undefined)
        
        @scala.inline
        def setMetricsVarargs(value: Metric*): Self = StObject.set(x, "metrics", js.Array(value :_*))
        
        @scala.inline
        def setStartGroup(value: Double): Self = StObject.set(x, "startGroup", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setStartGroupUndefined: Self = StObject.set(x, "startGroup", js.undefined)
      }
    }
    
    @js.native
    trait PivotHeader extends StObject {
      
      var pivotHeaderEntries: js.UndefOr[js.Array[PivotHeaderEntry]] = js.native
      
      var totalPivotGroupsCount: js.UndefOr[Double] = js.native
    }
    object PivotHeader {
      
      @scala.inline
      def apply(): PivotHeader = {
        val __obj = js.Dynamic.literal()
        __obj.asInstanceOf[PivotHeader]
      }
      
      @scala.inline
      implicit class PivotHeaderMutableBuilder[Self <: PivotHeader] (val x: Self) extends AnyVal {
        
        @scala.inline
        def setPivotHeaderEntries(value: js.Array[PivotHeaderEntry]): Self = StObject.set(x, "pivotHeaderEntries", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setPivotHeaderEntriesUndefined: Self = StObject.set(x, "pivotHeaderEntries", js.undefined)
        
        @scala.inline
        def setPivotHeaderEntriesVarargs(value: PivotHeaderEntry*): Self = StObject.set(x, "pivotHeaderEntries", js.Array(value :_*))
        
        @scala.inline
        def setTotalPivotGroupsCount(value: Double): Self = StObject.set(x, "totalPivotGroupsCount", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setTotalPivotGroupsCountUndefined: Self = StObject.set(x, "totalPivotGroupsCount", js.undefined)
      }
    }
    
    @js.native
    trait PivotHeaderEntry extends StObject {
      
      var dimensionNames: js.UndefOr[js.Array[String]] = js.native
      
      var dimensionValues: js.UndefOr[js.Array[String]] = js.native
      
      var metric: js.UndefOr[MetricHeaderEntry] = js.native
    }
    object PivotHeaderEntry {
      
      @scala.inline
      def apply(): PivotHeaderEntry = {
        val __obj = js.Dynamic.literal()
        __obj.asInstanceOf[PivotHeaderEntry]
      }
      
      @scala.inline
      implicit class PivotHeaderEntryMutableBuilder[Self <: PivotHeaderEntry] (val x: Self) extends AnyVal {
        
        @scala.inline
        def setDimensionNames(value: js.Array[String]): Self = StObject.set(x, "dimensionNames", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setDimensionNamesUndefined: Self = StObject.set(x, "dimensionNames", js.undefined)
        
        @scala.inline
        def setDimensionNamesVarargs(value: String*): Self = StObject.set(x, "dimensionNames", js.Array(value :_*))
        
        @scala.inline
        def setDimensionValues(value: js.Array[String]): Self = StObject.set(x, "dimensionValues", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setDimensionValuesUndefined: Self = StObject.set(x, "dimensionValues", js.undefined)
        
        @scala.inline
        def setDimensionValuesVarargs(value: String*): Self = StObject.set(x, "dimensionValues", js.Array(value :_*))
        
        @scala.inline
        def setMetric(value: MetricHeaderEntry): Self = StObject.set(x, "metric", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setMetricUndefined: Self = StObject.set(x, "metric", js.undefined)
      }
    }
    
    @js.native
    trait PivotValueRegion extends StObject {
      
      var values: js.UndefOr[js.Array[String]] = js.native
    }
    object PivotValueRegion {
      
      @scala.inline
      def apply(): PivotValueRegion = {
        val __obj = js.Dynamic.literal()
        __obj.asInstanceOf[PivotValueRegion]
      }
      
      @scala.inline
      implicit class PivotValueRegionMutableBuilder[Self <: PivotValueRegion] (val x: Self) extends AnyVal {
        
        @scala.inline
        def setValues(value: js.Array[String]): Self = StObject.set(x, "values", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setValuesUndefined: Self = StObject.set(x, "values", js.undefined)
        
        @scala.inline
        def setValuesVarargs(value: String*): Self = StObject.set(x, "values", js.Array(value :_*))
      }
    }
    
    @js.native
    trait ProductData extends StObject {
      
      var itemRevenue: js.UndefOr[Double] = js.native
      
      var productName: js.UndefOr[String] = js.native
      
      var productQuantity: js.UndefOr[String] = js.native
      
      var productSku: js.UndefOr[String] = js.native
    }
    object ProductData {
      
      @scala.inline
      def apply(): ProductData = {
        val __obj = js.Dynamic.literal()
        __obj.asInstanceOf[ProductData]
      }
      
      @scala.inline
      implicit class ProductDataMutableBuilder[Self <: ProductData] (val x: Self) extends AnyVal {
        
        @scala.inline
        def setItemRevenue(value: Double): Self = StObject.set(x, "itemRevenue", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setItemRevenueUndefined: Self = StObject.set(x, "itemRevenue", js.undefined)
        
        @scala.inline
        def setProductName(value: String): Self = StObject.set(x, "productName", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setProductNameUndefined: Self = StObject.set(x, "productName", js.undefined)
        
        @scala.inline
        def setProductQuantity(value: String): Self = StObject.set(x, "productQuantity", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setProductQuantityUndefined: Self = StObject.set(x, "productQuantity", js.undefined)
        
        @scala.inline
        def setProductSku(value: String): Self = StObject.set(x, "productSku", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setProductSkuUndefined: Self = StObject.set(x, "productSku", js.undefined)
      }
    }
    
    @js.native
    trait Report extends StObject {
      
      var columnHeader: js.UndefOr[ColumnHeader] = js.native
      
      var data: js.UndefOr[ReportData] = js.native
      
      var nextPageToken: js.UndefOr[String] = js.native
    }
    object Report {
      
      @scala.inline
      def apply(): Report = {
        val __obj = js.Dynamic.literal()
        __obj.asInstanceOf[Report]
      }
      
      @scala.inline
      implicit class ReportMutableBuilder[Self <: Report] (val x: Self) extends AnyVal {
        
        @scala.inline
        def setColumnHeader(value: ColumnHeader): Self = StObject.set(x, "columnHeader", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setColumnHeaderUndefined: Self = StObject.set(x, "columnHeader", js.undefined)
        
        @scala.inline
        def setData(value: ReportData): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setDataUndefined: Self = StObject.set(x, "data", js.undefined)
        
        @scala.inline
        def setNextPageToken(value: String): Self = StObject.set(x, "nextPageToken", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setNextPageTokenUndefined: Self = StObject.set(x, "nextPageToken", js.undefined)
      }
    }
    
    @js.native
    trait ReportData extends StObject {
      
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
      implicit class ReportDataMutableBuilder[Self <: ReportData] (val x: Self) extends AnyVal {
        
        @scala.inline
        def setDataLastRefreshed(value: String): Self = StObject.set(x, "dataLastRefreshed", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setDataLastRefreshedUndefined: Self = StObject.set(x, "dataLastRefreshed", js.undefined)
        
        @scala.inline
        def setIsDataGolden(value: Boolean): Self = StObject.set(x, "isDataGolden", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setIsDataGoldenUndefined: Self = StObject.set(x, "isDataGolden", js.undefined)
        
        @scala.inline
        def setMaximums(value: js.Array[DateRangeValues]): Self = StObject.set(x, "maximums", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setMaximumsUndefined: Self = StObject.set(x, "maximums", js.undefined)
        
        @scala.inline
        def setMaximumsVarargs(value: DateRangeValues*): Self = StObject.set(x, "maximums", js.Array(value :_*))
        
        @scala.inline
        def setMinimums(value: js.Array[DateRangeValues]): Self = StObject.set(x, "minimums", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setMinimumsUndefined: Self = StObject.set(x, "minimums", js.undefined)
        
        @scala.inline
        def setMinimumsVarargs(value: DateRangeValues*): Self = StObject.set(x, "minimums", js.Array(value :_*))
        
        @scala.inline
        def setRowCount(value: Double): Self = StObject.set(x, "rowCount", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setRowCountUndefined: Self = StObject.set(x, "rowCount", js.undefined)
        
        @scala.inline
        def setRows(value: js.Array[ReportRow]): Self = StObject.set(x, "rows", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setRowsUndefined: Self = StObject.set(x, "rows", js.undefined)
        
        @scala.inline
        def setRowsVarargs(value: ReportRow*): Self = StObject.set(x, "rows", js.Array(value :_*))
        
        @scala.inline
        def setSamplesReadCounts(value: js.Array[String]): Self = StObject.set(x, "samplesReadCounts", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setSamplesReadCountsUndefined: Self = StObject.set(x, "samplesReadCounts", js.undefined)
        
        @scala.inline
        def setSamplesReadCountsVarargs(value: String*): Self = StObject.set(x, "samplesReadCounts", js.Array(value :_*))
        
        @scala.inline
        def setSamplingSpaceSizes(value: js.Array[String]): Self = StObject.set(x, "samplingSpaceSizes", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setSamplingSpaceSizesUndefined: Self = StObject.set(x, "samplingSpaceSizes", js.undefined)
        
        @scala.inline
        def setSamplingSpaceSizesVarargs(value: String*): Self = StObject.set(x, "samplingSpaceSizes", js.Array(value :_*))
        
        @scala.inline
        def setTotals(value: js.Array[DateRangeValues]): Self = StObject.set(x, "totals", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setTotalsUndefined: Self = StObject.set(x, "totals", js.undefined)
        
        @scala.inline
        def setTotalsVarargs(value: DateRangeValues*): Self = StObject.set(x, "totals", js.Array(value :_*))
      }
    }
    
    @js.native
    trait ReportRequest extends StObject {
      
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
      implicit class ReportRequestMutableBuilder[Self <: ReportRequest] (val x: Self) extends AnyVal {
        
        @scala.inline
        def setCohortGroup(value: CohortGroup): Self = StObject.set(x, "cohortGroup", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setCohortGroupUndefined: Self = StObject.set(x, "cohortGroup", js.undefined)
        
        @scala.inline
        def setDateRanges(value: js.Array[DateRange]): Self = StObject.set(x, "dateRanges", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setDateRangesUndefined: Self = StObject.set(x, "dateRanges", js.undefined)
        
        @scala.inline
        def setDateRangesVarargs(value: DateRange*): Self = StObject.set(x, "dateRanges", js.Array(value :_*))
        
        @scala.inline
        def setDimensionFilterClauses(value: js.Array[DimensionFilterClause]): Self = StObject.set(x, "dimensionFilterClauses", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setDimensionFilterClausesUndefined: Self = StObject.set(x, "dimensionFilterClauses", js.undefined)
        
        @scala.inline
        def setDimensionFilterClausesVarargs(value: DimensionFilterClause*): Self = StObject.set(x, "dimensionFilterClauses", js.Array(value :_*))
        
        @scala.inline
        def setDimensions(value: js.Array[Dimension]): Self = StObject.set(x, "dimensions", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setDimensionsUndefined: Self = StObject.set(x, "dimensions", js.undefined)
        
        @scala.inline
        def setDimensionsVarargs(value: Dimension*): Self = StObject.set(x, "dimensions", js.Array(value :_*))
        
        @scala.inline
        def setFiltersExpression(value: String): Self = StObject.set(x, "filtersExpression", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setFiltersExpressionUndefined: Self = StObject.set(x, "filtersExpression", js.undefined)
        
        @scala.inline
        def setHideTotals(value: Boolean): Self = StObject.set(x, "hideTotals", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setHideTotalsUndefined: Self = StObject.set(x, "hideTotals", js.undefined)
        
        @scala.inline
        def setHideValueRanges(value: Boolean): Self = StObject.set(x, "hideValueRanges", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setHideValueRangesUndefined: Self = StObject.set(x, "hideValueRanges", js.undefined)
        
        @scala.inline
        def setIncludeEmptyRows(value: Boolean): Self = StObject.set(x, "includeEmptyRows", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setIncludeEmptyRowsUndefined: Self = StObject.set(x, "includeEmptyRows", js.undefined)
        
        @scala.inline
        def setMetricFilterClauses(value: js.Array[MetricFilterClause]): Self = StObject.set(x, "metricFilterClauses", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setMetricFilterClausesUndefined: Self = StObject.set(x, "metricFilterClauses", js.undefined)
        
        @scala.inline
        def setMetricFilterClausesVarargs(value: MetricFilterClause*): Self = StObject.set(x, "metricFilterClauses", js.Array(value :_*))
        
        @scala.inline
        def setMetrics(value: js.Array[Metric]): Self = StObject.set(x, "metrics", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setMetricsUndefined: Self = StObject.set(x, "metrics", js.undefined)
        
        @scala.inline
        def setMetricsVarargs(value: Metric*): Self = StObject.set(x, "metrics", js.Array(value :_*))
        
        @scala.inline
        def setOrderBys(value: js.Array[OrderBy]): Self = StObject.set(x, "orderBys", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setOrderBysUndefined: Self = StObject.set(x, "orderBys", js.undefined)
        
        @scala.inline
        def setOrderBysVarargs(value: OrderBy*): Self = StObject.set(x, "orderBys", js.Array(value :_*))
        
        @scala.inline
        def setPageSize(value: Double): Self = StObject.set(x, "pageSize", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setPageSizeUndefined: Self = StObject.set(x, "pageSize", js.undefined)
        
        @scala.inline
        def setPageToken(value: String): Self = StObject.set(x, "pageToken", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setPageTokenUndefined: Self = StObject.set(x, "pageToken", js.undefined)
        
        @scala.inline
        def setPivots(value: js.Array[Pivot]): Self = StObject.set(x, "pivots", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setPivotsUndefined: Self = StObject.set(x, "pivots", js.undefined)
        
        @scala.inline
        def setPivotsVarargs(value: Pivot*): Self = StObject.set(x, "pivots", js.Array(value :_*))
        
        @scala.inline
        def setSamplingLevel(value: String): Self = StObject.set(x, "samplingLevel", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setSamplingLevelUndefined: Self = StObject.set(x, "samplingLevel", js.undefined)
        
        @scala.inline
        def setSegments(value: js.Array[Segment]): Self = StObject.set(x, "segments", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setSegmentsUndefined: Self = StObject.set(x, "segments", js.undefined)
        
        @scala.inline
        def setSegmentsVarargs(value: Segment*): Self = StObject.set(x, "segments", js.Array(value :_*))
        
        @scala.inline
        def setViewId(value: String): Self = StObject.set(x, "viewId", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setViewIdUndefined: Self = StObject.set(x, "viewId", js.undefined)
      }
    }
    
    @js.native
    trait ReportRow extends StObject {
      
      var dimensions: js.UndefOr[js.Array[String]] = js.native
      
      var metrics: js.UndefOr[js.Array[DateRangeValues]] = js.native
    }
    object ReportRow {
      
      @scala.inline
      def apply(): ReportRow = {
        val __obj = js.Dynamic.literal()
        __obj.asInstanceOf[ReportRow]
      }
      
      @scala.inline
      implicit class ReportRowMutableBuilder[Self <: ReportRow] (val x: Self) extends AnyVal {
        
        @scala.inline
        def setDimensions(value: js.Array[String]): Self = StObject.set(x, "dimensions", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setDimensionsUndefined: Self = StObject.set(x, "dimensions", js.undefined)
        
        @scala.inline
        def setDimensionsVarargs(value: String*): Self = StObject.set(x, "dimensions", js.Array(value :_*))
        
        @scala.inline
        def setMetrics(value: js.Array[DateRangeValues]): Self = StObject.set(x, "metrics", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setMetricsUndefined: Self = StObject.set(x, "metrics", js.undefined)
        
        @scala.inline
        def setMetricsVarargs(value: DateRangeValues*): Self = StObject.set(x, "metrics", js.Array(value :_*))
      }
    }
    
    @js.native
    trait ResourceQuotasRemaining extends StObject {
      
      var dailyQuotaTokensRemaining: js.UndefOr[Double] = js.native
      
      var hourlyQuotaTokensRemaining: js.UndefOr[Double] = js.native
    }
    object ResourceQuotasRemaining {
      
      @scala.inline
      def apply(): ResourceQuotasRemaining = {
        val __obj = js.Dynamic.literal()
        __obj.asInstanceOf[ResourceQuotasRemaining]
      }
      
      @scala.inline
      implicit class ResourceQuotasRemainingMutableBuilder[Self <: ResourceQuotasRemaining] (val x: Self) extends AnyVal {
        
        @scala.inline
        def setDailyQuotaTokensRemaining(value: Double): Self = StObject.set(x, "dailyQuotaTokensRemaining", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setDailyQuotaTokensRemainingUndefined: Self = StObject.set(x, "dailyQuotaTokensRemaining", js.undefined)
        
        @scala.inline
        def setHourlyQuotaTokensRemaining(value: Double): Self = StObject.set(x, "hourlyQuotaTokensRemaining", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setHourlyQuotaTokensRemainingUndefined: Self = StObject.set(x, "hourlyQuotaTokensRemaining", js.undefined)
      }
    }
    
    @js.native
    trait ScreenviewData extends StObject {
      
      var appName: js.UndefOr[String] = js.native
      
      var mobileDeviceBranding: js.UndefOr[String] = js.native
      
      var mobileDeviceModel: js.UndefOr[String] = js.native
      
      var screenName: js.UndefOr[String] = js.native
    }
    object ScreenviewData {
      
      @scala.inline
      def apply(): ScreenviewData = {
        val __obj = js.Dynamic.literal()
        __obj.asInstanceOf[ScreenviewData]
      }
      
      @scala.inline
      implicit class ScreenviewDataMutableBuilder[Self <: ScreenviewData] (val x: Self) extends AnyVal {
        
        @scala.inline
        def setAppName(value: String): Self = StObject.set(x, "appName", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setAppNameUndefined: Self = StObject.set(x, "appName", js.undefined)
        
        @scala.inline
        def setMobileDeviceBranding(value: String): Self = StObject.set(x, "mobileDeviceBranding", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setMobileDeviceBrandingUndefined: Self = StObject.set(x, "mobileDeviceBranding", js.undefined)
        
        @scala.inline
        def setMobileDeviceModel(value: String): Self = StObject.set(x, "mobileDeviceModel", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setMobileDeviceModelUndefined: Self = StObject.set(x, "mobileDeviceModel", js.undefined)
        
        @scala.inline
        def setScreenName(value: String): Self = StObject.set(x, "screenName", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setScreenNameUndefined: Self = StObject.set(x, "screenName", js.undefined)
      }
    }
    
    @js.native
    trait SearchUserActivityRequest extends StObject {
      
      var activityTypes: js.UndefOr[js.Array[String]] = js.native
      
      var dateRange: js.UndefOr[DateRange] = js.native
      
      var pageSize: js.UndefOr[Double] = js.native
      
      var pageToken: js.UndefOr[String] = js.native
      
      var user: js.UndefOr[User] = js.native
      
      var viewId: js.UndefOr[String] = js.native
    }
    object SearchUserActivityRequest {
      
      @scala.inline
      def apply(): SearchUserActivityRequest = {
        val __obj = js.Dynamic.literal()
        __obj.asInstanceOf[SearchUserActivityRequest]
      }
      
      @scala.inline
      implicit class SearchUserActivityRequestMutableBuilder[Self <: SearchUserActivityRequest] (val x: Self) extends AnyVal {
        
        @scala.inline
        def setActivityTypes(value: js.Array[String]): Self = StObject.set(x, "activityTypes", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setActivityTypesUndefined: Self = StObject.set(x, "activityTypes", js.undefined)
        
        @scala.inline
        def setActivityTypesVarargs(value: String*): Self = StObject.set(x, "activityTypes", js.Array(value :_*))
        
        @scala.inline
        def setDateRange(value: DateRange): Self = StObject.set(x, "dateRange", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setDateRangeUndefined: Self = StObject.set(x, "dateRange", js.undefined)
        
        @scala.inline
        def setPageSize(value: Double): Self = StObject.set(x, "pageSize", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setPageSizeUndefined: Self = StObject.set(x, "pageSize", js.undefined)
        
        @scala.inline
        def setPageToken(value: String): Self = StObject.set(x, "pageToken", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setPageTokenUndefined: Self = StObject.set(x, "pageToken", js.undefined)
        
        @scala.inline
        def setUser(value: User): Self = StObject.set(x, "user", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setUserUndefined: Self = StObject.set(x, "user", js.undefined)
        
        @scala.inline
        def setViewId(value: String): Self = StObject.set(x, "viewId", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setViewIdUndefined: Self = StObject.set(x, "viewId", js.undefined)
      }
    }
    
    @js.native
    trait SearchUserActivityResponse extends StObject {
      
      var nextPageToken: js.UndefOr[String] = js.native
      
      var sampleRate: js.UndefOr[Double] = js.native
      
      var sessions: js.UndefOr[js.Array[UserActivitySession]] = js.native
      
      var totalRows: js.UndefOr[Double] = js.native
    }
    object SearchUserActivityResponse {
      
      @scala.inline
      def apply(): SearchUserActivityResponse = {
        val __obj = js.Dynamic.literal()
        __obj.asInstanceOf[SearchUserActivityResponse]
      }
      
      @scala.inline
      implicit class SearchUserActivityResponseMutableBuilder[Self <: SearchUserActivityResponse] (val x: Self) extends AnyVal {
        
        @scala.inline
        def setNextPageToken(value: String): Self = StObject.set(x, "nextPageToken", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setNextPageTokenUndefined: Self = StObject.set(x, "nextPageToken", js.undefined)
        
        @scala.inline
        def setSampleRate(value: Double): Self = StObject.set(x, "sampleRate", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setSampleRateUndefined: Self = StObject.set(x, "sampleRate", js.undefined)
        
        @scala.inline
        def setSessions(value: js.Array[UserActivitySession]): Self = StObject.set(x, "sessions", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setSessionsUndefined: Self = StObject.set(x, "sessions", js.undefined)
        
        @scala.inline
        def setSessionsVarargs(value: UserActivitySession*): Self = StObject.set(x, "sessions", js.Array(value :_*))
        
        @scala.inline
        def setTotalRows(value: Double): Self = StObject.set(x, "totalRows", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setTotalRowsUndefined: Self = StObject.set(x, "totalRows", js.undefined)
      }
    }
    
    @js.native
    trait Segment extends StObject {
      
      var dynamicSegment: js.UndefOr[DynamicSegment] = js.native
      
      var segmentId: js.UndefOr[String] = js.native
    }
    object Segment {
      
      @scala.inline
      def apply(): Segment = {
        val __obj = js.Dynamic.literal()
        __obj.asInstanceOf[Segment]
      }
      
      @scala.inline
      implicit class SegmentMutableBuilder[Self <: Segment] (val x: Self) extends AnyVal {
        
        @scala.inline
        def setDynamicSegment(value: DynamicSegment): Self = StObject.set(x, "dynamicSegment", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setDynamicSegmentUndefined: Self = StObject.set(x, "dynamicSegment", js.undefined)
        
        @scala.inline
        def setSegmentId(value: String): Self = StObject.set(x, "segmentId", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setSegmentIdUndefined: Self = StObject.set(x, "segmentId", js.undefined)
      }
    }
    
    @js.native
    trait SegmentDefinition extends StObject {
      
      var segmentFilters: js.UndefOr[js.Array[SegmentFilter]] = js.native
    }
    object SegmentDefinition {
      
      @scala.inline
      def apply(): SegmentDefinition = {
        val __obj = js.Dynamic.literal()
        __obj.asInstanceOf[SegmentDefinition]
      }
      
      @scala.inline
      implicit class SegmentDefinitionMutableBuilder[Self <: SegmentDefinition] (val x: Self) extends AnyVal {
        
        @scala.inline
        def setSegmentFilters(value: js.Array[SegmentFilter]): Self = StObject.set(x, "segmentFilters", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setSegmentFiltersUndefined: Self = StObject.set(x, "segmentFilters", js.undefined)
        
        @scala.inline
        def setSegmentFiltersVarargs(value: SegmentFilter*): Self = StObject.set(x, "segmentFilters", js.Array(value :_*))
      }
    }
    
    @js.native
    trait SegmentDimensionFilter extends StObject {
      
      var caseSensitive: js.UndefOr[Boolean] = js.native
      
      var dimensionName: js.UndefOr[String] = js.native
      
      var expressions: js.UndefOr[js.Array[String]] = js.native
      
      var maxComparisonValue: js.UndefOr[String] = js.native
      
      var minComparisonValue: js.UndefOr[String] = js.native
      
      var operator: js.UndefOr[String] = js.native
    }
    object SegmentDimensionFilter {
      
      @scala.inline
      def apply(): SegmentDimensionFilter = {
        val __obj = js.Dynamic.literal()
        __obj.asInstanceOf[SegmentDimensionFilter]
      }
      
      @scala.inline
      implicit class SegmentDimensionFilterMutableBuilder[Self <: SegmentDimensionFilter] (val x: Self) extends AnyVal {
        
        @scala.inline
        def setCaseSensitive(value: Boolean): Self = StObject.set(x, "caseSensitive", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setCaseSensitiveUndefined: Self = StObject.set(x, "caseSensitive", js.undefined)
        
        @scala.inline
        def setDimensionName(value: String): Self = StObject.set(x, "dimensionName", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setDimensionNameUndefined: Self = StObject.set(x, "dimensionName", js.undefined)
        
        @scala.inline
        def setExpressions(value: js.Array[String]): Self = StObject.set(x, "expressions", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setExpressionsUndefined: Self = StObject.set(x, "expressions", js.undefined)
        
        @scala.inline
        def setExpressionsVarargs(value: String*): Self = StObject.set(x, "expressions", js.Array(value :_*))
        
        @scala.inline
        def setMaxComparisonValue(value: String): Self = StObject.set(x, "maxComparisonValue", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setMaxComparisonValueUndefined: Self = StObject.set(x, "maxComparisonValue", js.undefined)
        
        @scala.inline
        def setMinComparisonValue(value: String): Self = StObject.set(x, "minComparisonValue", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setMinComparisonValueUndefined: Self = StObject.set(x, "minComparisonValue", js.undefined)
        
        @scala.inline
        def setOperator(value: String): Self = StObject.set(x, "operator", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setOperatorUndefined: Self = StObject.set(x, "operator", js.undefined)
      }
    }
    
    @js.native
    trait SegmentFilter extends StObject {
      
      var not: js.UndefOr[Boolean] = js.native
      
      var sequenceSegment: js.UndefOr[SequenceSegment] = js.native
      
      var simpleSegment: js.UndefOr[SimpleSegment] = js.native
    }
    object SegmentFilter {
      
      @scala.inline
      def apply(): SegmentFilter = {
        val __obj = js.Dynamic.literal()
        __obj.asInstanceOf[SegmentFilter]
      }
      
      @scala.inline
      implicit class SegmentFilterMutableBuilder[Self <: SegmentFilter] (val x: Self) extends AnyVal {
        
        @scala.inline
        def setNot(value: Boolean): Self = StObject.set(x, "not", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setNotUndefined: Self = StObject.set(x, "not", js.undefined)
        
        @scala.inline
        def setSequenceSegment(value: SequenceSegment): Self = StObject.set(x, "sequenceSegment", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setSequenceSegmentUndefined: Self = StObject.set(x, "sequenceSegment", js.undefined)
        
        @scala.inline
        def setSimpleSegment(value: SimpleSegment): Self = StObject.set(x, "simpleSegment", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setSimpleSegmentUndefined: Self = StObject.set(x, "simpleSegment", js.undefined)
      }
    }
    
    @js.native
    trait SegmentFilterClause extends StObject {
      
      var dimensionFilter: js.UndefOr[SegmentDimensionFilter] = js.native
      
      var metricFilter: js.UndefOr[SegmentMetricFilter] = js.native
      
      var not: js.UndefOr[Boolean] = js.native
    }
    object SegmentFilterClause {
      
      @scala.inline
      def apply(): SegmentFilterClause = {
        val __obj = js.Dynamic.literal()
        __obj.asInstanceOf[SegmentFilterClause]
      }
      
      @scala.inline
      implicit class SegmentFilterClauseMutableBuilder[Self <: SegmentFilterClause] (val x: Self) extends AnyVal {
        
        @scala.inline
        def setDimensionFilter(value: SegmentDimensionFilter): Self = StObject.set(x, "dimensionFilter", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setDimensionFilterUndefined: Self = StObject.set(x, "dimensionFilter", js.undefined)
        
        @scala.inline
        def setMetricFilter(value: SegmentMetricFilter): Self = StObject.set(x, "metricFilter", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setMetricFilterUndefined: Self = StObject.set(x, "metricFilter", js.undefined)
        
        @scala.inline
        def setNot(value: Boolean): Self = StObject.set(x, "not", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setNotUndefined: Self = StObject.set(x, "not", js.undefined)
      }
    }
    
    @js.native
    trait SegmentMetricFilter extends StObject {
      
      var comparisonValue: js.UndefOr[String] = js.native
      
      var maxComparisonValue: js.UndefOr[String] = js.native
      
      var metricName: js.UndefOr[String] = js.native
      
      var operator: js.UndefOr[String] = js.native
      
      var scope: js.UndefOr[String] = js.native
    }
    object SegmentMetricFilter {
      
      @scala.inline
      def apply(): SegmentMetricFilter = {
        val __obj = js.Dynamic.literal()
        __obj.asInstanceOf[SegmentMetricFilter]
      }
      
      @scala.inline
      implicit class SegmentMetricFilterMutableBuilder[Self <: SegmentMetricFilter] (val x: Self) extends AnyVal {
        
        @scala.inline
        def setComparisonValue(value: String): Self = StObject.set(x, "comparisonValue", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setComparisonValueUndefined: Self = StObject.set(x, "comparisonValue", js.undefined)
        
        @scala.inline
        def setMaxComparisonValue(value: String): Self = StObject.set(x, "maxComparisonValue", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setMaxComparisonValueUndefined: Self = StObject.set(x, "maxComparisonValue", js.undefined)
        
        @scala.inline
        def setMetricName(value: String): Self = StObject.set(x, "metricName", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setMetricNameUndefined: Self = StObject.set(x, "metricName", js.undefined)
        
        @scala.inline
        def setOperator(value: String): Self = StObject.set(x, "operator", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setOperatorUndefined: Self = StObject.set(x, "operator", js.undefined)
        
        @scala.inline
        def setScope(value: String): Self = StObject.set(x, "scope", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setScopeUndefined: Self = StObject.set(x, "scope", js.undefined)
      }
    }
    
    @js.native
    trait SegmentSequenceStep extends StObject {
      
      var matchType: js.UndefOr[String] = js.native
      
      var orFiltersForSegment: js.UndefOr[js.Array[OrFiltersForSegment]] = js.native
    }
    object SegmentSequenceStep {
      
      @scala.inline
      def apply(): SegmentSequenceStep = {
        val __obj = js.Dynamic.literal()
        __obj.asInstanceOf[SegmentSequenceStep]
      }
      
      @scala.inline
      implicit class SegmentSequenceStepMutableBuilder[Self <: SegmentSequenceStep] (val x: Self) extends AnyVal {
        
        @scala.inline
        def setMatchType(value: String): Self = StObject.set(x, "matchType", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setMatchTypeUndefined: Self = StObject.set(x, "matchType", js.undefined)
        
        @scala.inline
        def setOrFiltersForSegment(value: js.Array[OrFiltersForSegment]): Self = StObject.set(x, "orFiltersForSegment", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setOrFiltersForSegmentUndefined: Self = StObject.set(x, "orFiltersForSegment", js.undefined)
        
        @scala.inline
        def setOrFiltersForSegmentVarargs(value: OrFiltersForSegment*): Self = StObject.set(x, "orFiltersForSegment", js.Array(value :_*))
      }
    }
    
    @js.native
    trait SequenceSegment extends StObject {
      
      var firstStepShouldMatchFirstHit: js.UndefOr[Boolean] = js.native
      
      var segmentSequenceSteps: js.UndefOr[js.Array[SegmentSequenceStep]] = js.native
    }
    object SequenceSegment {
      
      @scala.inline
      def apply(): SequenceSegment = {
        val __obj = js.Dynamic.literal()
        __obj.asInstanceOf[SequenceSegment]
      }
      
      @scala.inline
      implicit class SequenceSegmentMutableBuilder[Self <: SequenceSegment] (val x: Self) extends AnyVal {
        
        @scala.inline
        def setFirstStepShouldMatchFirstHit(value: Boolean): Self = StObject.set(x, "firstStepShouldMatchFirstHit", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setFirstStepShouldMatchFirstHitUndefined: Self = StObject.set(x, "firstStepShouldMatchFirstHit", js.undefined)
        
        @scala.inline
        def setSegmentSequenceSteps(value: js.Array[SegmentSequenceStep]): Self = StObject.set(x, "segmentSequenceSteps", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setSegmentSequenceStepsUndefined: Self = StObject.set(x, "segmentSequenceSteps", js.undefined)
        
        @scala.inline
        def setSegmentSequenceStepsVarargs(value: SegmentSequenceStep*): Self = StObject.set(x, "segmentSequenceSteps", js.Array(value :_*))
      }
    }
    
    @js.native
    trait SimpleSegment extends StObject {
      
      var orFiltersForSegment: js.UndefOr[js.Array[OrFiltersForSegment]] = js.native
    }
    object SimpleSegment {
      
      @scala.inline
      def apply(): SimpleSegment = {
        val __obj = js.Dynamic.literal()
        __obj.asInstanceOf[SimpleSegment]
      }
      
      @scala.inline
      implicit class SimpleSegmentMutableBuilder[Self <: SimpleSegment] (val x: Self) extends AnyVal {
        
        @scala.inline
        def setOrFiltersForSegment(value: js.Array[OrFiltersForSegment]): Self = StObject.set(x, "orFiltersForSegment", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setOrFiltersForSegmentUndefined: Self = StObject.set(x, "orFiltersForSegment", js.undefined)
        
        @scala.inline
        def setOrFiltersForSegmentVarargs(value: OrFiltersForSegment*): Self = StObject.set(x, "orFiltersForSegment", js.Array(value :_*))
      }
    }
    
    @js.native
    trait TransactionData extends StObject {
      
      var transactionId: js.UndefOr[String] = js.native
      
      var transactionRevenue: js.UndefOr[Double] = js.native
      
      var transactionShipping: js.UndefOr[Double] = js.native
      
      var transactionTax: js.UndefOr[Double] = js.native
    }
    object TransactionData {
      
      @scala.inline
      def apply(): TransactionData = {
        val __obj = js.Dynamic.literal()
        __obj.asInstanceOf[TransactionData]
      }
      
      @scala.inline
      implicit class TransactionDataMutableBuilder[Self <: TransactionData] (val x: Self) extends AnyVal {
        
        @scala.inline
        def setTransactionId(value: String): Self = StObject.set(x, "transactionId", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setTransactionIdUndefined: Self = StObject.set(x, "transactionId", js.undefined)
        
        @scala.inline
        def setTransactionRevenue(value: Double): Self = StObject.set(x, "transactionRevenue", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setTransactionRevenueUndefined: Self = StObject.set(x, "transactionRevenue", js.undefined)
        
        @scala.inline
        def setTransactionShipping(value: Double): Self = StObject.set(x, "transactionShipping", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setTransactionShippingUndefined: Self = StObject.set(x, "transactionShipping", js.undefined)
        
        @scala.inline
        def setTransactionTax(value: Double): Self = StObject.set(x, "transactionTax", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setTransactionTaxUndefined: Self = StObject.set(x, "transactionTax", js.undefined)
      }
    }
    
    @js.native
    trait User extends StObject {
      
      var `type`: js.UndefOr[String] = js.native
      
      var userId: js.UndefOr[String] = js.native
    }
    object User {
      
      @scala.inline
      def apply(): User = {
        val __obj = js.Dynamic.literal()
        __obj.asInstanceOf[User]
      }
      
      @scala.inline
      implicit class UserMutableBuilder[Self <: User] (val x: Self) extends AnyVal {
        
        @scala.inline
        def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
        
        @scala.inline
        def setUserId(value: String): Self = StObject.set(x, "userId", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setUserIdUndefined: Self = StObject.set(x, "userId", js.undefined)
      }
    }
    
    @js.native
    trait UserActivitySession extends StObject {
      
      var activities: js.UndefOr[js.Array[Activity]] = js.native
      
      var dataSource: js.UndefOr[String] = js.native
      
      var deviceCategory: js.UndefOr[String] = js.native
      
      var platform: js.UndefOr[String] = js.native
      
      var sessionDate: js.UndefOr[String] = js.native
      
      var sessionId: js.UndefOr[String] = js.native
    }
    object UserActivitySession {
      
      @scala.inline
      def apply(): UserActivitySession = {
        val __obj = js.Dynamic.literal()
        __obj.asInstanceOf[UserActivitySession]
      }
      
      @scala.inline
      implicit class UserActivitySessionMutableBuilder[Self <: UserActivitySession] (val x: Self) extends AnyVal {
        
        @scala.inline
        def setActivities(value: js.Array[Activity]): Self = StObject.set(x, "activities", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setActivitiesUndefined: Self = StObject.set(x, "activities", js.undefined)
        
        @scala.inline
        def setActivitiesVarargs(value: Activity*): Self = StObject.set(x, "activities", js.Array(value :_*))
        
        @scala.inline
        def setDataSource(value: String): Self = StObject.set(x, "dataSource", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setDataSourceUndefined: Self = StObject.set(x, "dataSource", js.undefined)
        
        @scala.inline
        def setDeviceCategory(value: String): Self = StObject.set(x, "deviceCategory", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setDeviceCategoryUndefined: Self = StObject.set(x, "deviceCategory", js.undefined)
        
        @scala.inline
        def setPlatform(value: String): Self = StObject.set(x, "platform", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setPlatformUndefined: Self = StObject.set(x, "platform", js.undefined)
        
        @scala.inline
        def setSessionDate(value: String): Self = StObject.set(x, "sessionDate", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setSessionDateUndefined: Self = StObject.set(x, "sessionDate", js.undefined)
        
        @scala.inline
        def setSessionId(value: String): Self = StObject.set(x, "sessionId", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setSessionIdUndefined: Self = StObject.set(x, "sessionId", js.undefined)
      }
    }
  }
}
