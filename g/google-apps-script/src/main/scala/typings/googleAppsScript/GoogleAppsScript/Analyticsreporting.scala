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
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Analyticsreporting extends StObject {
  
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
  
  inline def apply(
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
  
  extension [Self <: Analyticsreporting](x: Self) {
    
    inline def setNewCohort(value: () => Cohort): Self = StObject.set(x, "newCohort", js.Any.fromFunction0(value))
    
    inline def setNewCohortGroup(value: () => CohortGroup): Self = StObject.set(x, "newCohortGroup", js.Any.fromFunction0(value))
    
    inline def setNewDateRange(value: () => DateRange): Self = StObject.set(x, "newDateRange", js.Any.fromFunction0(value))
    
    inline def setNewDimension(value: () => Dimension): Self = StObject.set(x, "newDimension", js.Any.fromFunction0(value))
    
    inline def setNewDimensionFilter(value: () => DimensionFilter): Self = StObject.set(x, "newDimensionFilter", js.Any.fromFunction0(value))
    
    inline def setNewDimensionFilterClause(value: () => DimensionFilterClause): Self = StObject.set(x, "newDimensionFilterClause", js.Any.fromFunction0(value))
    
    inline def setNewDynamicSegment(value: () => DynamicSegment): Self = StObject.set(x, "newDynamicSegment", js.Any.fromFunction0(value))
    
    inline def setNewGetReportsRequest(value: () => GetReportsRequest): Self = StObject.set(x, "newGetReportsRequest", js.Any.fromFunction0(value))
    
    inline def setNewMetric(value: () => Metric): Self = StObject.set(x, "newMetric", js.Any.fromFunction0(value))
    
    inline def setNewMetricFilter(value: () => MetricFilter): Self = StObject.set(x, "newMetricFilter", js.Any.fromFunction0(value))
    
    inline def setNewMetricFilterClause(value: () => MetricFilterClause): Self = StObject.set(x, "newMetricFilterClause", js.Any.fromFunction0(value))
    
    inline def setNewOrFiltersForSegment(value: () => OrFiltersForSegment): Self = StObject.set(x, "newOrFiltersForSegment", js.Any.fromFunction0(value))
    
    inline def setNewOrderBy(value: () => OrderBy): Self = StObject.set(x, "newOrderBy", js.Any.fromFunction0(value))
    
    inline def setNewPivot(value: () => Pivot): Self = StObject.set(x, "newPivot", js.Any.fromFunction0(value))
    
    inline def setNewReportRequest(value: () => ReportRequest): Self = StObject.set(x, "newReportRequest", js.Any.fromFunction0(value))
    
    inline def setNewSearchUserActivityRequest(value: () => SearchUserActivityRequest): Self = StObject.set(x, "newSearchUserActivityRequest", js.Any.fromFunction0(value))
    
    inline def setNewSegment(value: () => Segment): Self = StObject.set(x, "newSegment", js.Any.fromFunction0(value))
    
    inline def setNewSegmentDefinition(value: () => SegmentDefinition): Self = StObject.set(x, "newSegmentDefinition", js.Any.fromFunction0(value))
    
    inline def setNewSegmentDimensionFilter(value: () => SegmentDimensionFilter): Self = StObject.set(x, "newSegmentDimensionFilter", js.Any.fromFunction0(value))
    
    inline def setNewSegmentFilter(value: () => SegmentFilter): Self = StObject.set(x, "newSegmentFilter", js.Any.fromFunction0(value))
    
    inline def setNewSegmentFilterClause(value: () => SegmentFilterClause): Self = StObject.set(x, "newSegmentFilterClause", js.Any.fromFunction0(value))
    
    inline def setNewSegmentMetricFilter(value: () => SegmentMetricFilter): Self = StObject.set(x, "newSegmentMetricFilter", js.Any.fromFunction0(value))
    
    inline def setNewSegmentSequenceStep(value: () => SegmentSequenceStep): Self = StObject.set(x, "newSegmentSequenceStep", js.Any.fromFunction0(value))
    
    inline def setNewSequenceSegment(value: () => SequenceSegment): Self = StObject.set(x, "newSequenceSegment", js.Any.fromFunction0(value))
    
    inline def setNewSimpleSegment(value: () => SimpleSegment): Self = StObject.set(x, "newSimpleSegment", js.Any.fromFunction0(value))
    
    inline def setNewUser(value: () => User): Self = StObject.set(x, "newUser", js.Any.fromFunction0(value))
    
    inline def setReports(value: ReportsCollection): Self = StObject.set(x, "Reports", value.asInstanceOf[js.Any])
    
    inline def setReportsUndefined: Self = StObject.set(x, "Reports", js.undefined)
    
    inline def setUserActivity(value: UserActivityCollection): Self = StObject.set(x, "UserActivity", value.asInstanceOf[js.Any])
    
    inline def setUserActivityUndefined: Self = StObject.set(x, "UserActivity", js.undefined)
  }
  
  object Collection {
    
    trait ReportsCollection extends StObject {
      
      // Returns the Analytics data.
      def batchGet(resource: GetReportsRequest): GetReportsResponse
    }
    object ReportsCollection {
      
      inline def apply(batchGet: GetReportsRequest => GetReportsResponse): ReportsCollection = {
        val __obj = js.Dynamic.literal(batchGet = js.Any.fromFunction1(batchGet))
        __obj.asInstanceOf[ReportsCollection]
      }
      
      extension [Self <: ReportsCollection](x: Self) {
        
        inline def setBatchGet(value: GetReportsRequest => GetReportsResponse): Self = StObject.set(x, "batchGet", js.Any.fromFunction1(value))
      }
    }
    
    trait UserActivityCollection extends StObject {
      
      // Returns User Activity data.
      def search(resource: SearchUserActivityRequest): SearchUserActivityResponse
    }
    object UserActivityCollection {
      
      inline def apply(search: SearchUserActivityRequest => SearchUserActivityResponse): UserActivityCollection = {
        val __obj = js.Dynamic.literal(search = js.Any.fromFunction1(search))
        __obj.asInstanceOf[UserActivityCollection]
      }
      
      extension [Self <: UserActivityCollection](x: Self) {
        
        inline def setSearch(value: SearchUserActivityRequest => SearchUserActivityResponse): Self = StObject.set(x, "search", js.Any.fromFunction1(value))
      }
    }
  }
  
  object Schema {
    
    trait Activity extends StObject {
      
      var activityTime: js.UndefOr[String] = js.undefined
      
      var activityType: js.UndefOr[String] = js.undefined
      
      var appview: js.UndefOr[ScreenviewData] = js.undefined
      
      var campaign: js.UndefOr[String] = js.undefined
      
      var channelGrouping: js.UndefOr[String] = js.undefined
      
      var customDimension: js.UndefOr[js.Array[CustomDimension]] = js.undefined
      
      var ecommerce: js.UndefOr[EcommerceData] = js.undefined
      
      var event: js.UndefOr[EventData] = js.undefined
      
      var goals: js.UndefOr[GoalSetData] = js.undefined
      
      var hostname: js.UndefOr[String] = js.undefined
      
      var keyword: js.UndefOr[String] = js.undefined
      
      var landingPagePath: js.UndefOr[String] = js.undefined
      
      var medium: js.UndefOr[String] = js.undefined
      
      var pageview: js.UndefOr[PageviewData] = js.undefined
      
      var source: js.UndefOr[String] = js.undefined
    }
    object Activity {
      
      inline def apply(): Activity = {
        val __obj = js.Dynamic.literal()
        __obj.asInstanceOf[Activity]
      }
      
      extension [Self <: Activity](x: Self) {
        
        inline def setActivityTime(value: String): Self = StObject.set(x, "activityTime", value.asInstanceOf[js.Any])
        
        inline def setActivityTimeUndefined: Self = StObject.set(x, "activityTime", js.undefined)
        
        inline def setActivityType(value: String): Self = StObject.set(x, "activityType", value.asInstanceOf[js.Any])
        
        inline def setActivityTypeUndefined: Self = StObject.set(x, "activityType", js.undefined)
        
        inline def setAppview(value: ScreenviewData): Self = StObject.set(x, "appview", value.asInstanceOf[js.Any])
        
        inline def setAppviewUndefined: Self = StObject.set(x, "appview", js.undefined)
        
        inline def setCampaign(value: String): Self = StObject.set(x, "campaign", value.asInstanceOf[js.Any])
        
        inline def setCampaignUndefined: Self = StObject.set(x, "campaign", js.undefined)
        
        inline def setChannelGrouping(value: String): Self = StObject.set(x, "channelGrouping", value.asInstanceOf[js.Any])
        
        inline def setChannelGroupingUndefined: Self = StObject.set(x, "channelGrouping", js.undefined)
        
        inline def setCustomDimension(value: js.Array[CustomDimension]): Self = StObject.set(x, "customDimension", value.asInstanceOf[js.Any])
        
        inline def setCustomDimensionUndefined: Self = StObject.set(x, "customDimension", js.undefined)
        
        inline def setCustomDimensionVarargs(value: CustomDimension*): Self = StObject.set(x, "customDimension", js.Array(value*))
        
        inline def setEcommerce(value: EcommerceData): Self = StObject.set(x, "ecommerce", value.asInstanceOf[js.Any])
        
        inline def setEcommerceUndefined: Self = StObject.set(x, "ecommerce", js.undefined)
        
        inline def setEvent(value: EventData): Self = StObject.set(x, "event", value.asInstanceOf[js.Any])
        
        inline def setEventUndefined: Self = StObject.set(x, "event", js.undefined)
        
        inline def setGoals(value: GoalSetData): Self = StObject.set(x, "goals", value.asInstanceOf[js.Any])
        
        inline def setGoalsUndefined: Self = StObject.set(x, "goals", js.undefined)
        
        inline def setHostname(value: String): Self = StObject.set(x, "hostname", value.asInstanceOf[js.Any])
        
        inline def setHostnameUndefined: Self = StObject.set(x, "hostname", js.undefined)
        
        inline def setKeyword(value: String): Self = StObject.set(x, "keyword", value.asInstanceOf[js.Any])
        
        inline def setKeywordUndefined: Self = StObject.set(x, "keyword", js.undefined)
        
        inline def setLandingPagePath(value: String): Self = StObject.set(x, "landingPagePath", value.asInstanceOf[js.Any])
        
        inline def setLandingPagePathUndefined: Self = StObject.set(x, "landingPagePath", js.undefined)
        
        inline def setMedium(value: String): Self = StObject.set(x, "medium", value.asInstanceOf[js.Any])
        
        inline def setMediumUndefined: Self = StObject.set(x, "medium", js.undefined)
        
        inline def setPageview(value: PageviewData): Self = StObject.set(x, "pageview", value.asInstanceOf[js.Any])
        
        inline def setPageviewUndefined: Self = StObject.set(x, "pageview", js.undefined)
        
        inline def setSource(value: String): Self = StObject.set(x, "source", value.asInstanceOf[js.Any])
        
        inline def setSourceUndefined: Self = StObject.set(x, "source", js.undefined)
      }
    }
    
    trait Cohort extends StObject {
      
      var dateRange: js.UndefOr[DateRange] = js.undefined
      
      var name: js.UndefOr[String] = js.undefined
      
      var `type`: js.UndefOr[String] = js.undefined
    }
    object Cohort {
      
      inline def apply(): Cohort = {
        val __obj = js.Dynamic.literal()
        __obj.asInstanceOf[Cohort]
      }
      
      extension [Self <: Cohort](x: Self) {
        
        inline def setDateRange(value: DateRange): Self = StObject.set(x, "dateRange", value.asInstanceOf[js.Any])
        
        inline def setDateRangeUndefined: Self = StObject.set(x, "dateRange", js.undefined)
        
        inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
        
        inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
        
        inline def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
        
        inline def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
      }
    }
    
    trait CohortGroup extends StObject {
      
      var cohorts: js.UndefOr[js.Array[Cohort]] = js.undefined
      
      var lifetimeValue: js.UndefOr[Boolean] = js.undefined
    }
    object CohortGroup {
      
      inline def apply(): CohortGroup = {
        val __obj = js.Dynamic.literal()
        __obj.asInstanceOf[CohortGroup]
      }
      
      extension [Self <: CohortGroup](x: Self) {
        
        inline def setCohorts(value: js.Array[Cohort]): Self = StObject.set(x, "cohorts", value.asInstanceOf[js.Any])
        
        inline def setCohortsUndefined: Self = StObject.set(x, "cohorts", js.undefined)
        
        inline def setCohortsVarargs(value: Cohort*): Self = StObject.set(x, "cohorts", js.Array(value*))
        
        inline def setLifetimeValue(value: Boolean): Self = StObject.set(x, "lifetimeValue", value.asInstanceOf[js.Any])
        
        inline def setLifetimeValueUndefined: Self = StObject.set(x, "lifetimeValue", js.undefined)
      }
    }
    
    trait ColumnHeader extends StObject {
      
      var dimensions: js.UndefOr[js.Array[String]] = js.undefined
      
      var metricHeader: js.UndefOr[MetricHeader] = js.undefined
    }
    object ColumnHeader {
      
      inline def apply(): ColumnHeader = {
        val __obj = js.Dynamic.literal()
        __obj.asInstanceOf[ColumnHeader]
      }
      
      extension [Self <: ColumnHeader](x: Self) {
        
        inline def setDimensions(value: js.Array[String]): Self = StObject.set(x, "dimensions", value.asInstanceOf[js.Any])
        
        inline def setDimensionsUndefined: Self = StObject.set(x, "dimensions", js.undefined)
        
        inline def setDimensionsVarargs(value: String*): Self = StObject.set(x, "dimensions", js.Array(value*))
        
        inline def setMetricHeader(value: MetricHeader): Self = StObject.set(x, "metricHeader", value.asInstanceOf[js.Any])
        
        inline def setMetricHeaderUndefined: Self = StObject.set(x, "metricHeader", js.undefined)
      }
    }
    
    trait CustomDimension extends StObject {
      
      var index: js.UndefOr[Double] = js.undefined
      
      var value: js.UndefOr[String] = js.undefined
    }
    object CustomDimension {
      
      inline def apply(): CustomDimension = {
        val __obj = js.Dynamic.literal()
        __obj.asInstanceOf[CustomDimension]
      }
      
      extension [Self <: CustomDimension](x: Self) {
        
        inline def setIndex(value: Double): Self = StObject.set(x, "index", value.asInstanceOf[js.Any])
        
        inline def setIndexUndefined: Self = StObject.set(x, "index", js.undefined)
        
        inline def setValue(value: String): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
        
        inline def setValueUndefined: Self = StObject.set(x, "value", js.undefined)
      }
    }
    
    trait DateRange extends StObject {
      
      var endDate: js.UndefOr[String] = js.undefined
      
      var startDate: js.UndefOr[String] = js.undefined
    }
    object DateRange {
      
      inline def apply(): DateRange = {
        val __obj = js.Dynamic.literal()
        __obj.asInstanceOf[DateRange]
      }
      
      extension [Self <: DateRange](x: Self) {
        
        inline def setEndDate(value: String): Self = StObject.set(x, "endDate", value.asInstanceOf[js.Any])
        
        inline def setEndDateUndefined: Self = StObject.set(x, "endDate", js.undefined)
        
        inline def setStartDate(value: String): Self = StObject.set(x, "startDate", value.asInstanceOf[js.Any])
        
        inline def setStartDateUndefined: Self = StObject.set(x, "startDate", js.undefined)
      }
    }
    
    trait DateRangeValues extends StObject {
      
      var pivotValueRegions: js.UndefOr[js.Array[PivotValueRegion]] = js.undefined
      
      var values: js.UndefOr[js.Array[String]] = js.undefined
    }
    object DateRangeValues {
      
      inline def apply(): DateRangeValues = {
        val __obj = js.Dynamic.literal()
        __obj.asInstanceOf[DateRangeValues]
      }
      
      extension [Self <: DateRangeValues](x: Self) {
        
        inline def setPivotValueRegions(value: js.Array[PivotValueRegion]): Self = StObject.set(x, "pivotValueRegions", value.asInstanceOf[js.Any])
        
        inline def setPivotValueRegionsUndefined: Self = StObject.set(x, "pivotValueRegions", js.undefined)
        
        inline def setPivotValueRegionsVarargs(value: PivotValueRegion*): Self = StObject.set(x, "pivotValueRegions", js.Array(value*))
        
        inline def setValues(value: js.Array[String]): Self = StObject.set(x, "values", value.asInstanceOf[js.Any])
        
        inline def setValuesUndefined: Self = StObject.set(x, "values", js.undefined)
        
        inline def setValuesVarargs(value: String*): Self = StObject.set(x, "values", js.Array(value*))
      }
    }
    
    trait Dimension extends StObject {
      
      var histogramBuckets: js.UndefOr[js.Array[String]] = js.undefined
      
      var name: js.UndefOr[String] = js.undefined
    }
    object Dimension {
      
      inline def apply(): Dimension = {
        val __obj = js.Dynamic.literal()
        __obj.asInstanceOf[Dimension]
      }
      
      extension [Self <: Dimension](x: Self) {
        
        inline def setHistogramBuckets(value: js.Array[String]): Self = StObject.set(x, "histogramBuckets", value.asInstanceOf[js.Any])
        
        inline def setHistogramBucketsUndefined: Self = StObject.set(x, "histogramBuckets", js.undefined)
        
        inline def setHistogramBucketsVarargs(value: String*): Self = StObject.set(x, "histogramBuckets", js.Array(value*))
        
        inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
        
        inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
      }
    }
    
    trait DimensionFilter extends StObject {
      
      var caseSensitive: js.UndefOr[Boolean] = js.undefined
      
      var dimensionName: js.UndefOr[String] = js.undefined
      
      var expressions: js.UndefOr[js.Array[String]] = js.undefined
      
      var not: js.UndefOr[Boolean] = js.undefined
      
      var operator: js.UndefOr[String] = js.undefined
    }
    object DimensionFilter {
      
      inline def apply(): DimensionFilter = {
        val __obj = js.Dynamic.literal()
        __obj.asInstanceOf[DimensionFilter]
      }
      
      extension [Self <: DimensionFilter](x: Self) {
        
        inline def setCaseSensitive(value: Boolean): Self = StObject.set(x, "caseSensitive", value.asInstanceOf[js.Any])
        
        inline def setCaseSensitiveUndefined: Self = StObject.set(x, "caseSensitive", js.undefined)
        
        inline def setDimensionName(value: String): Self = StObject.set(x, "dimensionName", value.asInstanceOf[js.Any])
        
        inline def setDimensionNameUndefined: Self = StObject.set(x, "dimensionName", js.undefined)
        
        inline def setExpressions(value: js.Array[String]): Self = StObject.set(x, "expressions", value.asInstanceOf[js.Any])
        
        inline def setExpressionsUndefined: Self = StObject.set(x, "expressions", js.undefined)
        
        inline def setExpressionsVarargs(value: String*): Self = StObject.set(x, "expressions", js.Array(value*))
        
        inline def setNot(value: Boolean): Self = StObject.set(x, "not", value.asInstanceOf[js.Any])
        
        inline def setNotUndefined: Self = StObject.set(x, "not", js.undefined)
        
        inline def setOperator(value: String): Self = StObject.set(x, "operator", value.asInstanceOf[js.Any])
        
        inline def setOperatorUndefined: Self = StObject.set(x, "operator", js.undefined)
      }
    }
    
    trait DimensionFilterClause extends StObject {
      
      var filters: js.UndefOr[js.Array[DimensionFilter]] = js.undefined
      
      var operator: js.UndefOr[String] = js.undefined
    }
    object DimensionFilterClause {
      
      inline def apply(): DimensionFilterClause = {
        val __obj = js.Dynamic.literal()
        __obj.asInstanceOf[DimensionFilterClause]
      }
      
      extension [Self <: DimensionFilterClause](x: Self) {
        
        inline def setFilters(value: js.Array[DimensionFilter]): Self = StObject.set(x, "filters", value.asInstanceOf[js.Any])
        
        inline def setFiltersUndefined: Self = StObject.set(x, "filters", js.undefined)
        
        inline def setFiltersVarargs(value: DimensionFilter*): Self = StObject.set(x, "filters", js.Array(value*))
        
        inline def setOperator(value: String): Self = StObject.set(x, "operator", value.asInstanceOf[js.Any])
        
        inline def setOperatorUndefined: Self = StObject.set(x, "operator", js.undefined)
      }
    }
    
    trait DynamicSegment extends StObject {
      
      var name: js.UndefOr[String] = js.undefined
      
      var sessionSegment: js.UndefOr[SegmentDefinition] = js.undefined
      
      var userSegment: js.UndefOr[SegmentDefinition] = js.undefined
    }
    object DynamicSegment {
      
      inline def apply(): DynamicSegment = {
        val __obj = js.Dynamic.literal()
        __obj.asInstanceOf[DynamicSegment]
      }
      
      extension [Self <: DynamicSegment](x: Self) {
        
        inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
        
        inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
        
        inline def setSessionSegment(value: SegmentDefinition): Self = StObject.set(x, "sessionSegment", value.asInstanceOf[js.Any])
        
        inline def setSessionSegmentUndefined: Self = StObject.set(x, "sessionSegment", js.undefined)
        
        inline def setUserSegment(value: SegmentDefinition): Self = StObject.set(x, "userSegment", value.asInstanceOf[js.Any])
        
        inline def setUserSegmentUndefined: Self = StObject.set(x, "userSegment", js.undefined)
      }
    }
    
    trait EcommerceData extends StObject {
      
      var actionType: js.UndefOr[String] = js.undefined
      
      var ecommerceType: js.UndefOr[String] = js.undefined
      
      var products: js.UndefOr[js.Array[ProductData]] = js.undefined
      
      var transaction: js.UndefOr[TransactionData] = js.undefined
    }
    object EcommerceData {
      
      inline def apply(): EcommerceData = {
        val __obj = js.Dynamic.literal()
        __obj.asInstanceOf[EcommerceData]
      }
      
      extension [Self <: EcommerceData](x: Self) {
        
        inline def setActionType(value: String): Self = StObject.set(x, "actionType", value.asInstanceOf[js.Any])
        
        inline def setActionTypeUndefined: Self = StObject.set(x, "actionType", js.undefined)
        
        inline def setEcommerceType(value: String): Self = StObject.set(x, "ecommerceType", value.asInstanceOf[js.Any])
        
        inline def setEcommerceTypeUndefined: Self = StObject.set(x, "ecommerceType", js.undefined)
        
        inline def setProducts(value: js.Array[ProductData]): Self = StObject.set(x, "products", value.asInstanceOf[js.Any])
        
        inline def setProductsUndefined: Self = StObject.set(x, "products", js.undefined)
        
        inline def setProductsVarargs(value: ProductData*): Self = StObject.set(x, "products", js.Array(value*))
        
        inline def setTransaction(value: TransactionData): Self = StObject.set(x, "transaction", value.asInstanceOf[js.Any])
        
        inline def setTransactionUndefined: Self = StObject.set(x, "transaction", js.undefined)
      }
    }
    
    trait EventData extends StObject {
      
      var eventAction: js.UndefOr[String] = js.undefined
      
      var eventCategory: js.UndefOr[String] = js.undefined
      
      var eventCount: js.UndefOr[String] = js.undefined
      
      var eventLabel: js.UndefOr[String] = js.undefined
      
      var eventValue: js.UndefOr[String] = js.undefined
    }
    object EventData {
      
      inline def apply(): EventData = {
        val __obj = js.Dynamic.literal()
        __obj.asInstanceOf[EventData]
      }
      
      extension [Self <: EventData](x: Self) {
        
        inline def setEventAction(value: String): Self = StObject.set(x, "eventAction", value.asInstanceOf[js.Any])
        
        inline def setEventActionUndefined: Self = StObject.set(x, "eventAction", js.undefined)
        
        inline def setEventCategory(value: String): Self = StObject.set(x, "eventCategory", value.asInstanceOf[js.Any])
        
        inline def setEventCategoryUndefined: Self = StObject.set(x, "eventCategory", js.undefined)
        
        inline def setEventCount(value: String): Self = StObject.set(x, "eventCount", value.asInstanceOf[js.Any])
        
        inline def setEventCountUndefined: Self = StObject.set(x, "eventCount", js.undefined)
        
        inline def setEventLabel(value: String): Self = StObject.set(x, "eventLabel", value.asInstanceOf[js.Any])
        
        inline def setEventLabelUndefined: Self = StObject.set(x, "eventLabel", js.undefined)
        
        inline def setEventValue(value: String): Self = StObject.set(x, "eventValue", value.asInstanceOf[js.Any])
        
        inline def setEventValueUndefined: Self = StObject.set(x, "eventValue", js.undefined)
      }
    }
    
    trait GetReportsRequest extends StObject {
      
      var reportRequests: js.UndefOr[js.Array[ReportRequest]] = js.undefined
      
      var useResourceQuotas: js.UndefOr[Boolean] = js.undefined
    }
    object GetReportsRequest {
      
      inline def apply(): GetReportsRequest = {
        val __obj = js.Dynamic.literal()
        __obj.asInstanceOf[GetReportsRequest]
      }
      
      extension [Self <: GetReportsRequest](x: Self) {
        
        inline def setReportRequests(value: js.Array[ReportRequest]): Self = StObject.set(x, "reportRequests", value.asInstanceOf[js.Any])
        
        inline def setReportRequestsUndefined: Self = StObject.set(x, "reportRequests", js.undefined)
        
        inline def setReportRequestsVarargs(value: ReportRequest*): Self = StObject.set(x, "reportRequests", js.Array(value*))
        
        inline def setUseResourceQuotas(value: Boolean): Self = StObject.set(x, "useResourceQuotas", value.asInstanceOf[js.Any])
        
        inline def setUseResourceQuotasUndefined: Self = StObject.set(x, "useResourceQuotas", js.undefined)
      }
    }
    
    trait GetReportsResponse extends StObject {
      
      var queryCost: js.UndefOr[Double] = js.undefined
      
      var reports: js.UndefOr[js.Array[Report]] = js.undefined
      
      var resourceQuotasRemaining: js.UndefOr[ResourceQuotasRemaining] = js.undefined
    }
    object GetReportsResponse {
      
      inline def apply(): GetReportsResponse = {
        val __obj = js.Dynamic.literal()
        __obj.asInstanceOf[GetReportsResponse]
      }
      
      extension [Self <: GetReportsResponse](x: Self) {
        
        inline def setQueryCost(value: Double): Self = StObject.set(x, "queryCost", value.asInstanceOf[js.Any])
        
        inline def setQueryCostUndefined: Self = StObject.set(x, "queryCost", js.undefined)
        
        inline def setReports(value: js.Array[Report]): Self = StObject.set(x, "reports", value.asInstanceOf[js.Any])
        
        inline def setReportsUndefined: Self = StObject.set(x, "reports", js.undefined)
        
        inline def setReportsVarargs(value: Report*): Self = StObject.set(x, "reports", js.Array(value*))
        
        inline def setResourceQuotasRemaining(value: ResourceQuotasRemaining): Self = StObject.set(x, "resourceQuotasRemaining", value.asInstanceOf[js.Any])
        
        inline def setResourceQuotasRemainingUndefined: Self = StObject.set(x, "resourceQuotasRemaining", js.undefined)
      }
    }
    
    trait GoalData extends StObject {
      
      var goalCompletionLocation: js.UndefOr[String] = js.undefined
      
      var goalCompletions: js.UndefOr[String] = js.undefined
      
      var goalIndex: js.UndefOr[Double] = js.undefined
      
      var goalName: js.UndefOr[String] = js.undefined
      
      var goalPreviousStep1: js.UndefOr[String] = js.undefined
      
      var goalPreviousStep2: js.UndefOr[String] = js.undefined
      
      var goalPreviousStep3: js.UndefOr[String] = js.undefined
      
      var goalValue: js.UndefOr[Double] = js.undefined
    }
    object GoalData {
      
      inline def apply(): GoalData = {
        val __obj = js.Dynamic.literal()
        __obj.asInstanceOf[GoalData]
      }
      
      extension [Self <: GoalData](x: Self) {
        
        inline def setGoalCompletionLocation(value: String): Self = StObject.set(x, "goalCompletionLocation", value.asInstanceOf[js.Any])
        
        inline def setGoalCompletionLocationUndefined: Self = StObject.set(x, "goalCompletionLocation", js.undefined)
        
        inline def setGoalCompletions(value: String): Self = StObject.set(x, "goalCompletions", value.asInstanceOf[js.Any])
        
        inline def setGoalCompletionsUndefined: Self = StObject.set(x, "goalCompletions", js.undefined)
        
        inline def setGoalIndex(value: Double): Self = StObject.set(x, "goalIndex", value.asInstanceOf[js.Any])
        
        inline def setGoalIndexUndefined: Self = StObject.set(x, "goalIndex", js.undefined)
        
        inline def setGoalName(value: String): Self = StObject.set(x, "goalName", value.asInstanceOf[js.Any])
        
        inline def setGoalNameUndefined: Self = StObject.set(x, "goalName", js.undefined)
        
        inline def setGoalPreviousStep1(value: String): Self = StObject.set(x, "goalPreviousStep1", value.asInstanceOf[js.Any])
        
        inline def setGoalPreviousStep1Undefined: Self = StObject.set(x, "goalPreviousStep1", js.undefined)
        
        inline def setGoalPreviousStep2(value: String): Self = StObject.set(x, "goalPreviousStep2", value.asInstanceOf[js.Any])
        
        inline def setGoalPreviousStep2Undefined: Self = StObject.set(x, "goalPreviousStep2", js.undefined)
        
        inline def setGoalPreviousStep3(value: String): Self = StObject.set(x, "goalPreviousStep3", value.asInstanceOf[js.Any])
        
        inline def setGoalPreviousStep3Undefined: Self = StObject.set(x, "goalPreviousStep3", js.undefined)
        
        inline def setGoalValue(value: Double): Self = StObject.set(x, "goalValue", value.asInstanceOf[js.Any])
        
        inline def setGoalValueUndefined: Self = StObject.set(x, "goalValue", js.undefined)
      }
    }
    
    trait GoalSetData extends StObject {
      
      var goals: js.UndefOr[js.Array[GoalData]] = js.undefined
    }
    object GoalSetData {
      
      inline def apply(): GoalSetData = {
        val __obj = js.Dynamic.literal()
        __obj.asInstanceOf[GoalSetData]
      }
      
      extension [Self <: GoalSetData](x: Self) {
        
        inline def setGoals(value: js.Array[GoalData]): Self = StObject.set(x, "goals", value.asInstanceOf[js.Any])
        
        inline def setGoalsUndefined: Self = StObject.set(x, "goals", js.undefined)
        
        inline def setGoalsVarargs(value: GoalData*): Self = StObject.set(x, "goals", js.Array(value*))
      }
    }
    
    trait Metric extends StObject {
      
      var alias: js.UndefOr[String] = js.undefined
      
      var expression: js.UndefOr[String] = js.undefined
      
      var formattingType: js.UndefOr[String] = js.undefined
    }
    object Metric {
      
      inline def apply(): Metric = {
        val __obj = js.Dynamic.literal()
        __obj.asInstanceOf[Metric]
      }
      
      extension [Self <: Metric](x: Self) {
        
        inline def setAlias(value: String): Self = StObject.set(x, "alias", value.asInstanceOf[js.Any])
        
        inline def setAliasUndefined: Self = StObject.set(x, "alias", js.undefined)
        
        inline def setExpression(value: String): Self = StObject.set(x, "expression", value.asInstanceOf[js.Any])
        
        inline def setExpressionUndefined: Self = StObject.set(x, "expression", js.undefined)
        
        inline def setFormattingType(value: String): Self = StObject.set(x, "formattingType", value.asInstanceOf[js.Any])
        
        inline def setFormattingTypeUndefined: Self = StObject.set(x, "formattingType", js.undefined)
      }
    }
    
    trait MetricFilter extends StObject {
      
      var comparisonValue: js.UndefOr[String] = js.undefined
      
      var metricName: js.UndefOr[String] = js.undefined
      
      var not: js.UndefOr[Boolean] = js.undefined
      
      var operator: js.UndefOr[String] = js.undefined
    }
    object MetricFilter {
      
      inline def apply(): MetricFilter = {
        val __obj = js.Dynamic.literal()
        __obj.asInstanceOf[MetricFilter]
      }
      
      extension [Self <: MetricFilter](x: Self) {
        
        inline def setComparisonValue(value: String): Self = StObject.set(x, "comparisonValue", value.asInstanceOf[js.Any])
        
        inline def setComparisonValueUndefined: Self = StObject.set(x, "comparisonValue", js.undefined)
        
        inline def setMetricName(value: String): Self = StObject.set(x, "metricName", value.asInstanceOf[js.Any])
        
        inline def setMetricNameUndefined: Self = StObject.set(x, "metricName", js.undefined)
        
        inline def setNot(value: Boolean): Self = StObject.set(x, "not", value.asInstanceOf[js.Any])
        
        inline def setNotUndefined: Self = StObject.set(x, "not", js.undefined)
        
        inline def setOperator(value: String): Self = StObject.set(x, "operator", value.asInstanceOf[js.Any])
        
        inline def setOperatorUndefined: Self = StObject.set(x, "operator", js.undefined)
      }
    }
    
    trait MetricFilterClause extends StObject {
      
      var filters: js.UndefOr[js.Array[MetricFilter]] = js.undefined
      
      var operator: js.UndefOr[String] = js.undefined
    }
    object MetricFilterClause {
      
      inline def apply(): MetricFilterClause = {
        val __obj = js.Dynamic.literal()
        __obj.asInstanceOf[MetricFilterClause]
      }
      
      extension [Self <: MetricFilterClause](x: Self) {
        
        inline def setFilters(value: js.Array[MetricFilter]): Self = StObject.set(x, "filters", value.asInstanceOf[js.Any])
        
        inline def setFiltersUndefined: Self = StObject.set(x, "filters", js.undefined)
        
        inline def setFiltersVarargs(value: MetricFilter*): Self = StObject.set(x, "filters", js.Array(value*))
        
        inline def setOperator(value: String): Self = StObject.set(x, "operator", value.asInstanceOf[js.Any])
        
        inline def setOperatorUndefined: Self = StObject.set(x, "operator", js.undefined)
      }
    }
    
    trait MetricHeader extends StObject {
      
      var metricHeaderEntries: js.UndefOr[js.Array[MetricHeaderEntry]] = js.undefined
      
      var pivotHeaders: js.UndefOr[js.Array[PivotHeader]] = js.undefined
    }
    object MetricHeader {
      
      inline def apply(): MetricHeader = {
        val __obj = js.Dynamic.literal()
        __obj.asInstanceOf[MetricHeader]
      }
      
      extension [Self <: MetricHeader](x: Self) {
        
        inline def setMetricHeaderEntries(value: js.Array[MetricHeaderEntry]): Self = StObject.set(x, "metricHeaderEntries", value.asInstanceOf[js.Any])
        
        inline def setMetricHeaderEntriesUndefined: Self = StObject.set(x, "metricHeaderEntries", js.undefined)
        
        inline def setMetricHeaderEntriesVarargs(value: MetricHeaderEntry*): Self = StObject.set(x, "metricHeaderEntries", js.Array(value*))
        
        inline def setPivotHeaders(value: js.Array[PivotHeader]): Self = StObject.set(x, "pivotHeaders", value.asInstanceOf[js.Any])
        
        inline def setPivotHeadersUndefined: Self = StObject.set(x, "pivotHeaders", js.undefined)
        
        inline def setPivotHeadersVarargs(value: PivotHeader*): Self = StObject.set(x, "pivotHeaders", js.Array(value*))
      }
    }
    
    trait MetricHeaderEntry extends StObject {
      
      var name: js.UndefOr[String] = js.undefined
      
      var `type`: js.UndefOr[String] = js.undefined
    }
    object MetricHeaderEntry {
      
      inline def apply(): MetricHeaderEntry = {
        val __obj = js.Dynamic.literal()
        __obj.asInstanceOf[MetricHeaderEntry]
      }
      
      extension [Self <: MetricHeaderEntry](x: Self) {
        
        inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
        
        inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
        
        inline def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
        
        inline def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
      }
    }
    
    trait OrFiltersForSegment extends StObject {
      
      var segmentFilterClauses: js.UndefOr[js.Array[SegmentFilterClause]] = js.undefined
    }
    object OrFiltersForSegment {
      
      inline def apply(): OrFiltersForSegment = {
        val __obj = js.Dynamic.literal()
        __obj.asInstanceOf[OrFiltersForSegment]
      }
      
      extension [Self <: OrFiltersForSegment](x: Self) {
        
        inline def setSegmentFilterClauses(value: js.Array[SegmentFilterClause]): Self = StObject.set(x, "segmentFilterClauses", value.asInstanceOf[js.Any])
        
        inline def setSegmentFilterClausesUndefined: Self = StObject.set(x, "segmentFilterClauses", js.undefined)
        
        inline def setSegmentFilterClausesVarargs(value: SegmentFilterClause*): Self = StObject.set(x, "segmentFilterClauses", js.Array(value*))
      }
    }
    
    trait OrderBy extends StObject {
      
      var fieldName: js.UndefOr[String] = js.undefined
      
      var orderType: js.UndefOr[String] = js.undefined
      
      var sortOrder: js.UndefOr[String] = js.undefined
    }
    object OrderBy {
      
      inline def apply(): OrderBy = {
        val __obj = js.Dynamic.literal()
        __obj.asInstanceOf[OrderBy]
      }
      
      extension [Self <: OrderBy](x: Self) {
        
        inline def setFieldName(value: String): Self = StObject.set(x, "fieldName", value.asInstanceOf[js.Any])
        
        inline def setFieldNameUndefined: Self = StObject.set(x, "fieldName", js.undefined)
        
        inline def setOrderType(value: String): Self = StObject.set(x, "orderType", value.asInstanceOf[js.Any])
        
        inline def setOrderTypeUndefined: Self = StObject.set(x, "orderType", js.undefined)
        
        inline def setSortOrder(value: String): Self = StObject.set(x, "sortOrder", value.asInstanceOf[js.Any])
        
        inline def setSortOrderUndefined: Self = StObject.set(x, "sortOrder", js.undefined)
      }
    }
    
    trait PageviewData extends StObject {
      
      var pagePath: js.UndefOr[String] = js.undefined
      
      var pageTitle: js.UndefOr[String] = js.undefined
    }
    object PageviewData {
      
      inline def apply(): PageviewData = {
        val __obj = js.Dynamic.literal()
        __obj.asInstanceOf[PageviewData]
      }
      
      extension [Self <: PageviewData](x: Self) {
        
        inline def setPagePath(value: String): Self = StObject.set(x, "pagePath", value.asInstanceOf[js.Any])
        
        inline def setPagePathUndefined: Self = StObject.set(x, "pagePath", js.undefined)
        
        inline def setPageTitle(value: String): Self = StObject.set(x, "pageTitle", value.asInstanceOf[js.Any])
        
        inline def setPageTitleUndefined: Self = StObject.set(x, "pageTitle", js.undefined)
      }
    }
    
    trait Pivot extends StObject {
      
      var dimensionFilterClauses: js.UndefOr[js.Array[DimensionFilterClause]] = js.undefined
      
      var dimensions: js.UndefOr[js.Array[Dimension]] = js.undefined
      
      var maxGroupCount: js.UndefOr[Double] = js.undefined
      
      var metrics: js.UndefOr[js.Array[Metric]] = js.undefined
      
      var startGroup: js.UndefOr[Double] = js.undefined
    }
    object Pivot {
      
      inline def apply(): Pivot = {
        val __obj = js.Dynamic.literal()
        __obj.asInstanceOf[Pivot]
      }
      
      extension [Self <: Pivot](x: Self) {
        
        inline def setDimensionFilterClauses(value: js.Array[DimensionFilterClause]): Self = StObject.set(x, "dimensionFilterClauses", value.asInstanceOf[js.Any])
        
        inline def setDimensionFilterClausesUndefined: Self = StObject.set(x, "dimensionFilterClauses", js.undefined)
        
        inline def setDimensionFilterClausesVarargs(value: DimensionFilterClause*): Self = StObject.set(x, "dimensionFilterClauses", js.Array(value*))
        
        inline def setDimensions(value: js.Array[Dimension]): Self = StObject.set(x, "dimensions", value.asInstanceOf[js.Any])
        
        inline def setDimensionsUndefined: Self = StObject.set(x, "dimensions", js.undefined)
        
        inline def setDimensionsVarargs(value: Dimension*): Self = StObject.set(x, "dimensions", js.Array(value*))
        
        inline def setMaxGroupCount(value: Double): Self = StObject.set(x, "maxGroupCount", value.asInstanceOf[js.Any])
        
        inline def setMaxGroupCountUndefined: Self = StObject.set(x, "maxGroupCount", js.undefined)
        
        inline def setMetrics(value: js.Array[Metric]): Self = StObject.set(x, "metrics", value.asInstanceOf[js.Any])
        
        inline def setMetricsUndefined: Self = StObject.set(x, "metrics", js.undefined)
        
        inline def setMetricsVarargs(value: Metric*): Self = StObject.set(x, "metrics", js.Array(value*))
        
        inline def setStartGroup(value: Double): Self = StObject.set(x, "startGroup", value.asInstanceOf[js.Any])
        
        inline def setStartGroupUndefined: Self = StObject.set(x, "startGroup", js.undefined)
      }
    }
    
    trait PivotHeader extends StObject {
      
      var pivotHeaderEntries: js.UndefOr[js.Array[PivotHeaderEntry]] = js.undefined
      
      var totalPivotGroupsCount: js.UndefOr[Double] = js.undefined
    }
    object PivotHeader {
      
      inline def apply(): PivotHeader = {
        val __obj = js.Dynamic.literal()
        __obj.asInstanceOf[PivotHeader]
      }
      
      extension [Self <: PivotHeader](x: Self) {
        
        inline def setPivotHeaderEntries(value: js.Array[PivotHeaderEntry]): Self = StObject.set(x, "pivotHeaderEntries", value.asInstanceOf[js.Any])
        
        inline def setPivotHeaderEntriesUndefined: Self = StObject.set(x, "pivotHeaderEntries", js.undefined)
        
        inline def setPivotHeaderEntriesVarargs(value: PivotHeaderEntry*): Self = StObject.set(x, "pivotHeaderEntries", js.Array(value*))
        
        inline def setTotalPivotGroupsCount(value: Double): Self = StObject.set(x, "totalPivotGroupsCount", value.asInstanceOf[js.Any])
        
        inline def setTotalPivotGroupsCountUndefined: Self = StObject.set(x, "totalPivotGroupsCount", js.undefined)
      }
    }
    
    trait PivotHeaderEntry extends StObject {
      
      var dimensionNames: js.UndefOr[js.Array[String]] = js.undefined
      
      var dimensionValues: js.UndefOr[js.Array[String]] = js.undefined
      
      var metric: js.UndefOr[MetricHeaderEntry] = js.undefined
    }
    object PivotHeaderEntry {
      
      inline def apply(): PivotHeaderEntry = {
        val __obj = js.Dynamic.literal()
        __obj.asInstanceOf[PivotHeaderEntry]
      }
      
      extension [Self <: PivotHeaderEntry](x: Self) {
        
        inline def setDimensionNames(value: js.Array[String]): Self = StObject.set(x, "dimensionNames", value.asInstanceOf[js.Any])
        
        inline def setDimensionNamesUndefined: Self = StObject.set(x, "dimensionNames", js.undefined)
        
        inline def setDimensionNamesVarargs(value: String*): Self = StObject.set(x, "dimensionNames", js.Array(value*))
        
        inline def setDimensionValues(value: js.Array[String]): Self = StObject.set(x, "dimensionValues", value.asInstanceOf[js.Any])
        
        inline def setDimensionValuesUndefined: Self = StObject.set(x, "dimensionValues", js.undefined)
        
        inline def setDimensionValuesVarargs(value: String*): Self = StObject.set(x, "dimensionValues", js.Array(value*))
        
        inline def setMetric(value: MetricHeaderEntry): Self = StObject.set(x, "metric", value.asInstanceOf[js.Any])
        
        inline def setMetricUndefined: Self = StObject.set(x, "metric", js.undefined)
      }
    }
    
    trait PivotValueRegion extends StObject {
      
      var values: js.UndefOr[js.Array[String]] = js.undefined
    }
    object PivotValueRegion {
      
      inline def apply(): PivotValueRegion = {
        val __obj = js.Dynamic.literal()
        __obj.asInstanceOf[PivotValueRegion]
      }
      
      extension [Self <: PivotValueRegion](x: Self) {
        
        inline def setValues(value: js.Array[String]): Self = StObject.set(x, "values", value.asInstanceOf[js.Any])
        
        inline def setValuesUndefined: Self = StObject.set(x, "values", js.undefined)
        
        inline def setValuesVarargs(value: String*): Self = StObject.set(x, "values", js.Array(value*))
      }
    }
    
    trait ProductData extends StObject {
      
      var itemRevenue: js.UndefOr[Double] = js.undefined
      
      var productName: js.UndefOr[String] = js.undefined
      
      var productQuantity: js.UndefOr[String] = js.undefined
      
      var productSku: js.UndefOr[String] = js.undefined
    }
    object ProductData {
      
      inline def apply(): ProductData = {
        val __obj = js.Dynamic.literal()
        __obj.asInstanceOf[ProductData]
      }
      
      extension [Self <: ProductData](x: Self) {
        
        inline def setItemRevenue(value: Double): Self = StObject.set(x, "itemRevenue", value.asInstanceOf[js.Any])
        
        inline def setItemRevenueUndefined: Self = StObject.set(x, "itemRevenue", js.undefined)
        
        inline def setProductName(value: String): Self = StObject.set(x, "productName", value.asInstanceOf[js.Any])
        
        inline def setProductNameUndefined: Self = StObject.set(x, "productName", js.undefined)
        
        inline def setProductQuantity(value: String): Self = StObject.set(x, "productQuantity", value.asInstanceOf[js.Any])
        
        inline def setProductQuantityUndefined: Self = StObject.set(x, "productQuantity", js.undefined)
        
        inline def setProductSku(value: String): Self = StObject.set(x, "productSku", value.asInstanceOf[js.Any])
        
        inline def setProductSkuUndefined: Self = StObject.set(x, "productSku", js.undefined)
      }
    }
    
    trait Report extends StObject {
      
      var columnHeader: js.UndefOr[ColumnHeader] = js.undefined
      
      var data: js.UndefOr[ReportData] = js.undefined
      
      var nextPageToken: js.UndefOr[String] = js.undefined
    }
    object Report {
      
      inline def apply(): Report = {
        val __obj = js.Dynamic.literal()
        __obj.asInstanceOf[Report]
      }
      
      extension [Self <: Report](x: Self) {
        
        inline def setColumnHeader(value: ColumnHeader): Self = StObject.set(x, "columnHeader", value.asInstanceOf[js.Any])
        
        inline def setColumnHeaderUndefined: Self = StObject.set(x, "columnHeader", js.undefined)
        
        inline def setData(value: ReportData): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
        
        inline def setDataUndefined: Self = StObject.set(x, "data", js.undefined)
        
        inline def setNextPageToken(value: String): Self = StObject.set(x, "nextPageToken", value.asInstanceOf[js.Any])
        
        inline def setNextPageTokenUndefined: Self = StObject.set(x, "nextPageToken", js.undefined)
      }
    }
    
    trait ReportData extends StObject {
      
      var dataLastRefreshed: js.UndefOr[String] = js.undefined
      
      var isDataGolden: js.UndefOr[Boolean] = js.undefined
      
      var maximums: js.UndefOr[js.Array[DateRangeValues]] = js.undefined
      
      var minimums: js.UndefOr[js.Array[DateRangeValues]] = js.undefined
      
      var rowCount: js.UndefOr[Double] = js.undefined
      
      var rows: js.UndefOr[js.Array[ReportRow]] = js.undefined
      
      var samplesReadCounts: js.UndefOr[js.Array[String]] = js.undefined
      
      var samplingSpaceSizes: js.UndefOr[js.Array[String]] = js.undefined
      
      var totals: js.UndefOr[js.Array[DateRangeValues]] = js.undefined
    }
    object ReportData {
      
      inline def apply(): ReportData = {
        val __obj = js.Dynamic.literal()
        __obj.asInstanceOf[ReportData]
      }
      
      extension [Self <: ReportData](x: Self) {
        
        inline def setDataLastRefreshed(value: String): Self = StObject.set(x, "dataLastRefreshed", value.asInstanceOf[js.Any])
        
        inline def setDataLastRefreshedUndefined: Self = StObject.set(x, "dataLastRefreshed", js.undefined)
        
        inline def setIsDataGolden(value: Boolean): Self = StObject.set(x, "isDataGolden", value.asInstanceOf[js.Any])
        
        inline def setIsDataGoldenUndefined: Self = StObject.set(x, "isDataGolden", js.undefined)
        
        inline def setMaximums(value: js.Array[DateRangeValues]): Self = StObject.set(x, "maximums", value.asInstanceOf[js.Any])
        
        inline def setMaximumsUndefined: Self = StObject.set(x, "maximums", js.undefined)
        
        inline def setMaximumsVarargs(value: DateRangeValues*): Self = StObject.set(x, "maximums", js.Array(value*))
        
        inline def setMinimums(value: js.Array[DateRangeValues]): Self = StObject.set(x, "minimums", value.asInstanceOf[js.Any])
        
        inline def setMinimumsUndefined: Self = StObject.set(x, "minimums", js.undefined)
        
        inline def setMinimumsVarargs(value: DateRangeValues*): Self = StObject.set(x, "minimums", js.Array(value*))
        
        inline def setRowCount(value: Double): Self = StObject.set(x, "rowCount", value.asInstanceOf[js.Any])
        
        inline def setRowCountUndefined: Self = StObject.set(x, "rowCount", js.undefined)
        
        inline def setRows(value: js.Array[ReportRow]): Self = StObject.set(x, "rows", value.asInstanceOf[js.Any])
        
        inline def setRowsUndefined: Self = StObject.set(x, "rows", js.undefined)
        
        inline def setRowsVarargs(value: ReportRow*): Self = StObject.set(x, "rows", js.Array(value*))
        
        inline def setSamplesReadCounts(value: js.Array[String]): Self = StObject.set(x, "samplesReadCounts", value.asInstanceOf[js.Any])
        
        inline def setSamplesReadCountsUndefined: Self = StObject.set(x, "samplesReadCounts", js.undefined)
        
        inline def setSamplesReadCountsVarargs(value: String*): Self = StObject.set(x, "samplesReadCounts", js.Array(value*))
        
        inline def setSamplingSpaceSizes(value: js.Array[String]): Self = StObject.set(x, "samplingSpaceSizes", value.asInstanceOf[js.Any])
        
        inline def setSamplingSpaceSizesUndefined: Self = StObject.set(x, "samplingSpaceSizes", js.undefined)
        
        inline def setSamplingSpaceSizesVarargs(value: String*): Self = StObject.set(x, "samplingSpaceSizes", js.Array(value*))
        
        inline def setTotals(value: js.Array[DateRangeValues]): Self = StObject.set(x, "totals", value.asInstanceOf[js.Any])
        
        inline def setTotalsUndefined: Self = StObject.set(x, "totals", js.undefined)
        
        inline def setTotalsVarargs(value: DateRangeValues*): Self = StObject.set(x, "totals", js.Array(value*))
      }
    }
    
    trait ReportRequest extends StObject {
      
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
      
      inline def apply(): ReportRequest = {
        val __obj = js.Dynamic.literal()
        __obj.asInstanceOf[ReportRequest]
      }
      
      extension [Self <: ReportRequest](x: Self) {
        
        inline def setCohortGroup(value: CohortGroup): Self = StObject.set(x, "cohortGroup", value.asInstanceOf[js.Any])
        
        inline def setCohortGroupUndefined: Self = StObject.set(x, "cohortGroup", js.undefined)
        
        inline def setDateRanges(value: js.Array[DateRange]): Self = StObject.set(x, "dateRanges", value.asInstanceOf[js.Any])
        
        inline def setDateRangesUndefined: Self = StObject.set(x, "dateRanges", js.undefined)
        
        inline def setDateRangesVarargs(value: DateRange*): Self = StObject.set(x, "dateRanges", js.Array(value*))
        
        inline def setDimensionFilterClauses(value: js.Array[DimensionFilterClause]): Self = StObject.set(x, "dimensionFilterClauses", value.asInstanceOf[js.Any])
        
        inline def setDimensionFilterClausesUndefined: Self = StObject.set(x, "dimensionFilterClauses", js.undefined)
        
        inline def setDimensionFilterClausesVarargs(value: DimensionFilterClause*): Self = StObject.set(x, "dimensionFilterClauses", js.Array(value*))
        
        inline def setDimensions(value: js.Array[Dimension]): Self = StObject.set(x, "dimensions", value.asInstanceOf[js.Any])
        
        inline def setDimensionsUndefined: Self = StObject.set(x, "dimensions", js.undefined)
        
        inline def setDimensionsVarargs(value: Dimension*): Self = StObject.set(x, "dimensions", js.Array(value*))
        
        inline def setFiltersExpression(value: String): Self = StObject.set(x, "filtersExpression", value.asInstanceOf[js.Any])
        
        inline def setFiltersExpressionUndefined: Self = StObject.set(x, "filtersExpression", js.undefined)
        
        inline def setHideTotals(value: Boolean): Self = StObject.set(x, "hideTotals", value.asInstanceOf[js.Any])
        
        inline def setHideTotalsUndefined: Self = StObject.set(x, "hideTotals", js.undefined)
        
        inline def setHideValueRanges(value: Boolean): Self = StObject.set(x, "hideValueRanges", value.asInstanceOf[js.Any])
        
        inline def setHideValueRangesUndefined: Self = StObject.set(x, "hideValueRanges", js.undefined)
        
        inline def setIncludeEmptyRows(value: Boolean): Self = StObject.set(x, "includeEmptyRows", value.asInstanceOf[js.Any])
        
        inline def setIncludeEmptyRowsUndefined: Self = StObject.set(x, "includeEmptyRows", js.undefined)
        
        inline def setMetricFilterClauses(value: js.Array[MetricFilterClause]): Self = StObject.set(x, "metricFilterClauses", value.asInstanceOf[js.Any])
        
        inline def setMetricFilterClausesUndefined: Self = StObject.set(x, "metricFilterClauses", js.undefined)
        
        inline def setMetricFilterClausesVarargs(value: MetricFilterClause*): Self = StObject.set(x, "metricFilterClauses", js.Array(value*))
        
        inline def setMetrics(value: js.Array[Metric]): Self = StObject.set(x, "metrics", value.asInstanceOf[js.Any])
        
        inline def setMetricsUndefined: Self = StObject.set(x, "metrics", js.undefined)
        
        inline def setMetricsVarargs(value: Metric*): Self = StObject.set(x, "metrics", js.Array(value*))
        
        inline def setOrderBys(value: js.Array[OrderBy]): Self = StObject.set(x, "orderBys", value.asInstanceOf[js.Any])
        
        inline def setOrderBysUndefined: Self = StObject.set(x, "orderBys", js.undefined)
        
        inline def setOrderBysVarargs(value: OrderBy*): Self = StObject.set(x, "orderBys", js.Array(value*))
        
        inline def setPageSize(value: Double): Self = StObject.set(x, "pageSize", value.asInstanceOf[js.Any])
        
        inline def setPageSizeUndefined: Self = StObject.set(x, "pageSize", js.undefined)
        
        inline def setPageToken(value: String): Self = StObject.set(x, "pageToken", value.asInstanceOf[js.Any])
        
        inline def setPageTokenUndefined: Self = StObject.set(x, "pageToken", js.undefined)
        
        inline def setPivots(value: js.Array[Pivot]): Self = StObject.set(x, "pivots", value.asInstanceOf[js.Any])
        
        inline def setPivotsUndefined: Self = StObject.set(x, "pivots", js.undefined)
        
        inline def setPivotsVarargs(value: Pivot*): Self = StObject.set(x, "pivots", js.Array(value*))
        
        inline def setSamplingLevel(value: String): Self = StObject.set(x, "samplingLevel", value.asInstanceOf[js.Any])
        
        inline def setSamplingLevelUndefined: Self = StObject.set(x, "samplingLevel", js.undefined)
        
        inline def setSegments(value: js.Array[Segment]): Self = StObject.set(x, "segments", value.asInstanceOf[js.Any])
        
        inline def setSegmentsUndefined: Self = StObject.set(x, "segments", js.undefined)
        
        inline def setSegmentsVarargs(value: Segment*): Self = StObject.set(x, "segments", js.Array(value*))
        
        inline def setViewId(value: String): Self = StObject.set(x, "viewId", value.asInstanceOf[js.Any])
        
        inline def setViewIdUndefined: Self = StObject.set(x, "viewId", js.undefined)
      }
    }
    
    trait ReportRow extends StObject {
      
      var dimensions: js.UndefOr[js.Array[String]] = js.undefined
      
      var metrics: js.UndefOr[js.Array[DateRangeValues]] = js.undefined
    }
    object ReportRow {
      
      inline def apply(): ReportRow = {
        val __obj = js.Dynamic.literal()
        __obj.asInstanceOf[ReportRow]
      }
      
      extension [Self <: ReportRow](x: Self) {
        
        inline def setDimensions(value: js.Array[String]): Self = StObject.set(x, "dimensions", value.asInstanceOf[js.Any])
        
        inline def setDimensionsUndefined: Self = StObject.set(x, "dimensions", js.undefined)
        
        inline def setDimensionsVarargs(value: String*): Self = StObject.set(x, "dimensions", js.Array(value*))
        
        inline def setMetrics(value: js.Array[DateRangeValues]): Self = StObject.set(x, "metrics", value.asInstanceOf[js.Any])
        
        inline def setMetricsUndefined: Self = StObject.set(x, "metrics", js.undefined)
        
        inline def setMetricsVarargs(value: DateRangeValues*): Self = StObject.set(x, "metrics", js.Array(value*))
      }
    }
    
    trait ResourceQuotasRemaining extends StObject {
      
      var dailyQuotaTokensRemaining: js.UndefOr[Double] = js.undefined
      
      var hourlyQuotaTokensRemaining: js.UndefOr[Double] = js.undefined
    }
    object ResourceQuotasRemaining {
      
      inline def apply(): ResourceQuotasRemaining = {
        val __obj = js.Dynamic.literal()
        __obj.asInstanceOf[ResourceQuotasRemaining]
      }
      
      extension [Self <: ResourceQuotasRemaining](x: Self) {
        
        inline def setDailyQuotaTokensRemaining(value: Double): Self = StObject.set(x, "dailyQuotaTokensRemaining", value.asInstanceOf[js.Any])
        
        inline def setDailyQuotaTokensRemainingUndefined: Self = StObject.set(x, "dailyQuotaTokensRemaining", js.undefined)
        
        inline def setHourlyQuotaTokensRemaining(value: Double): Self = StObject.set(x, "hourlyQuotaTokensRemaining", value.asInstanceOf[js.Any])
        
        inline def setHourlyQuotaTokensRemainingUndefined: Self = StObject.set(x, "hourlyQuotaTokensRemaining", js.undefined)
      }
    }
    
    trait ScreenviewData extends StObject {
      
      var appName: js.UndefOr[String] = js.undefined
      
      var mobileDeviceBranding: js.UndefOr[String] = js.undefined
      
      var mobileDeviceModel: js.UndefOr[String] = js.undefined
      
      var screenName: js.UndefOr[String] = js.undefined
    }
    object ScreenviewData {
      
      inline def apply(): ScreenviewData = {
        val __obj = js.Dynamic.literal()
        __obj.asInstanceOf[ScreenviewData]
      }
      
      extension [Self <: ScreenviewData](x: Self) {
        
        inline def setAppName(value: String): Self = StObject.set(x, "appName", value.asInstanceOf[js.Any])
        
        inline def setAppNameUndefined: Self = StObject.set(x, "appName", js.undefined)
        
        inline def setMobileDeviceBranding(value: String): Self = StObject.set(x, "mobileDeviceBranding", value.asInstanceOf[js.Any])
        
        inline def setMobileDeviceBrandingUndefined: Self = StObject.set(x, "mobileDeviceBranding", js.undefined)
        
        inline def setMobileDeviceModel(value: String): Self = StObject.set(x, "mobileDeviceModel", value.asInstanceOf[js.Any])
        
        inline def setMobileDeviceModelUndefined: Self = StObject.set(x, "mobileDeviceModel", js.undefined)
        
        inline def setScreenName(value: String): Self = StObject.set(x, "screenName", value.asInstanceOf[js.Any])
        
        inline def setScreenNameUndefined: Self = StObject.set(x, "screenName", js.undefined)
      }
    }
    
    trait SearchUserActivityRequest extends StObject {
      
      var activityTypes: js.UndefOr[js.Array[String]] = js.undefined
      
      var dateRange: js.UndefOr[DateRange] = js.undefined
      
      var pageSize: js.UndefOr[Double] = js.undefined
      
      var pageToken: js.UndefOr[String] = js.undefined
      
      var user: js.UndefOr[User] = js.undefined
      
      var viewId: js.UndefOr[String] = js.undefined
    }
    object SearchUserActivityRequest {
      
      inline def apply(): SearchUserActivityRequest = {
        val __obj = js.Dynamic.literal()
        __obj.asInstanceOf[SearchUserActivityRequest]
      }
      
      extension [Self <: SearchUserActivityRequest](x: Self) {
        
        inline def setActivityTypes(value: js.Array[String]): Self = StObject.set(x, "activityTypes", value.asInstanceOf[js.Any])
        
        inline def setActivityTypesUndefined: Self = StObject.set(x, "activityTypes", js.undefined)
        
        inline def setActivityTypesVarargs(value: String*): Self = StObject.set(x, "activityTypes", js.Array(value*))
        
        inline def setDateRange(value: DateRange): Self = StObject.set(x, "dateRange", value.asInstanceOf[js.Any])
        
        inline def setDateRangeUndefined: Self = StObject.set(x, "dateRange", js.undefined)
        
        inline def setPageSize(value: Double): Self = StObject.set(x, "pageSize", value.asInstanceOf[js.Any])
        
        inline def setPageSizeUndefined: Self = StObject.set(x, "pageSize", js.undefined)
        
        inline def setPageToken(value: String): Self = StObject.set(x, "pageToken", value.asInstanceOf[js.Any])
        
        inline def setPageTokenUndefined: Self = StObject.set(x, "pageToken", js.undefined)
        
        inline def setUser(value: User): Self = StObject.set(x, "user", value.asInstanceOf[js.Any])
        
        inline def setUserUndefined: Self = StObject.set(x, "user", js.undefined)
        
        inline def setViewId(value: String): Self = StObject.set(x, "viewId", value.asInstanceOf[js.Any])
        
        inline def setViewIdUndefined: Self = StObject.set(x, "viewId", js.undefined)
      }
    }
    
    trait SearchUserActivityResponse extends StObject {
      
      var nextPageToken: js.UndefOr[String] = js.undefined
      
      var sampleRate: js.UndefOr[Double] = js.undefined
      
      var sessions: js.UndefOr[js.Array[UserActivitySession]] = js.undefined
      
      var totalRows: js.UndefOr[Double] = js.undefined
    }
    object SearchUserActivityResponse {
      
      inline def apply(): SearchUserActivityResponse = {
        val __obj = js.Dynamic.literal()
        __obj.asInstanceOf[SearchUserActivityResponse]
      }
      
      extension [Self <: SearchUserActivityResponse](x: Self) {
        
        inline def setNextPageToken(value: String): Self = StObject.set(x, "nextPageToken", value.asInstanceOf[js.Any])
        
        inline def setNextPageTokenUndefined: Self = StObject.set(x, "nextPageToken", js.undefined)
        
        inline def setSampleRate(value: Double): Self = StObject.set(x, "sampleRate", value.asInstanceOf[js.Any])
        
        inline def setSampleRateUndefined: Self = StObject.set(x, "sampleRate", js.undefined)
        
        inline def setSessions(value: js.Array[UserActivitySession]): Self = StObject.set(x, "sessions", value.asInstanceOf[js.Any])
        
        inline def setSessionsUndefined: Self = StObject.set(x, "sessions", js.undefined)
        
        inline def setSessionsVarargs(value: UserActivitySession*): Self = StObject.set(x, "sessions", js.Array(value*))
        
        inline def setTotalRows(value: Double): Self = StObject.set(x, "totalRows", value.asInstanceOf[js.Any])
        
        inline def setTotalRowsUndefined: Self = StObject.set(x, "totalRows", js.undefined)
      }
    }
    
    trait Segment extends StObject {
      
      var dynamicSegment: js.UndefOr[DynamicSegment] = js.undefined
      
      var segmentId: js.UndefOr[String] = js.undefined
    }
    object Segment {
      
      inline def apply(): Segment = {
        val __obj = js.Dynamic.literal()
        __obj.asInstanceOf[Segment]
      }
      
      extension [Self <: Segment](x: Self) {
        
        inline def setDynamicSegment(value: DynamicSegment): Self = StObject.set(x, "dynamicSegment", value.asInstanceOf[js.Any])
        
        inline def setDynamicSegmentUndefined: Self = StObject.set(x, "dynamicSegment", js.undefined)
        
        inline def setSegmentId(value: String): Self = StObject.set(x, "segmentId", value.asInstanceOf[js.Any])
        
        inline def setSegmentIdUndefined: Self = StObject.set(x, "segmentId", js.undefined)
      }
    }
    
    trait SegmentDefinition extends StObject {
      
      var segmentFilters: js.UndefOr[js.Array[SegmentFilter]] = js.undefined
    }
    object SegmentDefinition {
      
      inline def apply(): SegmentDefinition = {
        val __obj = js.Dynamic.literal()
        __obj.asInstanceOf[SegmentDefinition]
      }
      
      extension [Self <: SegmentDefinition](x: Self) {
        
        inline def setSegmentFilters(value: js.Array[SegmentFilter]): Self = StObject.set(x, "segmentFilters", value.asInstanceOf[js.Any])
        
        inline def setSegmentFiltersUndefined: Self = StObject.set(x, "segmentFilters", js.undefined)
        
        inline def setSegmentFiltersVarargs(value: SegmentFilter*): Self = StObject.set(x, "segmentFilters", js.Array(value*))
      }
    }
    
    trait SegmentDimensionFilter extends StObject {
      
      var caseSensitive: js.UndefOr[Boolean] = js.undefined
      
      var dimensionName: js.UndefOr[String] = js.undefined
      
      var expressions: js.UndefOr[js.Array[String]] = js.undefined
      
      var maxComparisonValue: js.UndefOr[String] = js.undefined
      
      var minComparisonValue: js.UndefOr[String] = js.undefined
      
      var operator: js.UndefOr[String] = js.undefined
    }
    object SegmentDimensionFilter {
      
      inline def apply(): SegmentDimensionFilter = {
        val __obj = js.Dynamic.literal()
        __obj.asInstanceOf[SegmentDimensionFilter]
      }
      
      extension [Self <: SegmentDimensionFilter](x: Self) {
        
        inline def setCaseSensitive(value: Boolean): Self = StObject.set(x, "caseSensitive", value.asInstanceOf[js.Any])
        
        inline def setCaseSensitiveUndefined: Self = StObject.set(x, "caseSensitive", js.undefined)
        
        inline def setDimensionName(value: String): Self = StObject.set(x, "dimensionName", value.asInstanceOf[js.Any])
        
        inline def setDimensionNameUndefined: Self = StObject.set(x, "dimensionName", js.undefined)
        
        inline def setExpressions(value: js.Array[String]): Self = StObject.set(x, "expressions", value.asInstanceOf[js.Any])
        
        inline def setExpressionsUndefined: Self = StObject.set(x, "expressions", js.undefined)
        
        inline def setExpressionsVarargs(value: String*): Self = StObject.set(x, "expressions", js.Array(value*))
        
        inline def setMaxComparisonValue(value: String): Self = StObject.set(x, "maxComparisonValue", value.asInstanceOf[js.Any])
        
        inline def setMaxComparisonValueUndefined: Self = StObject.set(x, "maxComparisonValue", js.undefined)
        
        inline def setMinComparisonValue(value: String): Self = StObject.set(x, "minComparisonValue", value.asInstanceOf[js.Any])
        
        inline def setMinComparisonValueUndefined: Self = StObject.set(x, "minComparisonValue", js.undefined)
        
        inline def setOperator(value: String): Self = StObject.set(x, "operator", value.asInstanceOf[js.Any])
        
        inline def setOperatorUndefined: Self = StObject.set(x, "operator", js.undefined)
      }
    }
    
    trait SegmentFilter extends StObject {
      
      var not: js.UndefOr[Boolean] = js.undefined
      
      var sequenceSegment: js.UndefOr[SequenceSegment] = js.undefined
      
      var simpleSegment: js.UndefOr[SimpleSegment] = js.undefined
    }
    object SegmentFilter {
      
      inline def apply(): SegmentFilter = {
        val __obj = js.Dynamic.literal()
        __obj.asInstanceOf[SegmentFilter]
      }
      
      extension [Self <: SegmentFilter](x: Self) {
        
        inline def setNot(value: Boolean): Self = StObject.set(x, "not", value.asInstanceOf[js.Any])
        
        inline def setNotUndefined: Self = StObject.set(x, "not", js.undefined)
        
        inline def setSequenceSegment(value: SequenceSegment): Self = StObject.set(x, "sequenceSegment", value.asInstanceOf[js.Any])
        
        inline def setSequenceSegmentUndefined: Self = StObject.set(x, "sequenceSegment", js.undefined)
        
        inline def setSimpleSegment(value: SimpleSegment): Self = StObject.set(x, "simpleSegment", value.asInstanceOf[js.Any])
        
        inline def setSimpleSegmentUndefined: Self = StObject.set(x, "simpleSegment", js.undefined)
      }
    }
    
    trait SegmentFilterClause extends StObject {
      
      var dimensionFilter: js.UndefOr[SegmentDimensionFilter] = js.undefined
      
      var metricFilter: js.UndefOr[SegmentMetricFilter] = js.undefined
      
      var not: js.UndefOr[Boolean] = js.undefined
    }
    object SegmentFilterClause {
      
      inline def apply(): SegmentFilterClause = {
        val __obj = js.Dynamic.literal()
        __obj.asInstanceOf[SegmentFilterClause]
      }
      
      extension [Self <: SegmentFilterClause](x: Self) {
        
        inline def setDimensionFilter(value: SegmentDimensionFilter): Self = StObject.set(x, "dimensionFilter", value.asInstanceOf[js.Any])
        
        inline def setDimensionFilterUndefined: Self = StObject.set(x, "dimensionFilter", js.undefined)
        
        inline def setMetricFilter(value: SegmentMetricFilter): Self = StObject.set(x, "metricFilter", value.asInstanceOf[js.Any])
        
        inline def setMetricFilterUndefined: Self = StObject.set(x, "metricFilter", js.undefined)
        
        inline def setNot(value: Boolean): Self = StObject.set(x, "not", value.asInstanceOf[js.Any])
        
        inline def setNotUndefined: Self = StObject.set(x, "not", js.undefined)
      }
    }
    
    trait SegmentMetricFilter extends StObject {
      
      var comparisonValue: js.UndefOr[String] = js.undefined
      
      var maxComparisonValue: js.UndefOr[String] = js.undefined
      
      var metricName: js.UndefOr[String] = js.undefined
      
      var operator: js.UndefOr[String] = js.undefined
      
      var scope: js.UndefOr[String] = js.undefined
    }
    object SegmentMetricFilter {
      
      inline def apply(): SegmentMetricFilter = {
        val __obj = js.Dynamic.literal()
        __obj.asInstanceOf[SegmentMetricFilter]
      }
      
      extension [Self <: SegmentMetricFilter](x: Self) {
        
        inline def setComparisonValue(value: String): Self = StObject.set(x, "comparisonValue", value.asInstanceOf[js.Any])
        
        inline def setComparisonValueUndefined: Self = StObject.set(x, "comparisonValue", js.undefined)
        
        inline def setMaxComparisonValue(value: String): Self = StObject.set(x, "maxComparisonValue", value.asInstanceOf[js.Any])
        
        inline def setMaxComparisonValueUndefined: Self = StObject.set(x, "maxComparisonValue", js.undefined)
        
        inline def setMetricName(value: String): Self = StObject.set(x, "metricName", value.asInstanceOf[js.Any])
        
        inline def setMetricNameUndefined: Self = StObject.set(x, "metricName", js.undefined)
        
        inline def setOperator(value: String): Self = StObject.set(x, "operator", value.asInstanceOf[js.Any])
        
        inline def setOperatorUndefined: Self = StObject.set(x, "operator", js.undefined)
        
        inline def setScope(value: String): Self = StObject.set(x, "scope", value.asInstanceOf[js.Any])
        
        inline def setScopeUndefined: Self = StObject.set(x, "scope", js.undefined)
      }
    }
    
    trait SegmentSequenceStep extends StObject {
      
      var matchType: js.UndefOr[String] = js.undefined
      
      var orFiltersForSegment: js.UndefOr[js.Array[OrFiltersForSegment]] = js.undefined
    }
    object SegmentSequenceStep {
      
      inline def apply(): SegmentSequenceStep = {
        val __obj = js.Dynamic.literal()
        __obj.asInstanceOf[SegmentSequenceStep]
      }
      
      extension [Self <: SegmentSequenceStep](x: Self) {
        
        inline def setMatchType(value: String): Self = StObject.set(x, "matchType", value.asInstanceOf[js.Any])
        
        inline def setMatchTypeUndefined: Self = StObject.set(x, "matchType", js.undefined)
        
        inline def setOrFiltersForSegment(value: js.Array[OrFiltersForSegment]): Self = StObject.set(x, "orFiltersForSegment", value.asInstanceOf[js.Any])
        
        inline def setOrFiltersForSegmentUndefined: Self = StObject.set(x, "orFiltersForSegment", js.undefined)
        
        inline def setOrFiltersForSegmentVarargs(value: OrFiltersForSegment*): Self = StObject.set(x, "orFiltersForSegment", js.Array(value*))
      }
    }
    
    trait SequenceSegment extends StObject {
      
      var firstStepShouldMatchFirstHit: js.UndefOr[Boolean] = js.undefined
      
      var segmentSequenceSteps: js.UndefOr[js.Array[SegmentSequenceStep]] = js.undefined
    }
    object SequenceSegment {
      
      inline def apply(): SequenceSegment = {
        val __obj = js.Dynamic.literal()
        __obj.asInstanceOf[SequenceSegment]
      }
      
      extension [Self <: SequenceSegment](x: Self) {
        
        inline def setFirstStepShouldMatchFirstHit(value: Boolean): Self = StObject.set(x, "firstStepShouldMatchFirstHit", value.asInstanceOf[js.Any])
        
        inline def setFirstStepShouldMatchFirstHitUndefined: Self = StObject.set(x, "firstStepShouldMatchFirstHit", js.undefined)
        
        inline def setSegmentSequenceSteps(value: js.Array[SegmentSequenceStep]): Self = StObject.set(x, "segmentSequenceSteps", value.asInstanceOf[js.Any])
        
        inline def setSegmentSequenceStepsUndefined: Self = StObject.set(x, "segmentSequenceSteps", js.undefined)
        
        inline def setSegmentSequenceStepsVarargs(value: SegmentSequenceStep*): Self = StObject.set(x, "segmentSequenceSteps", js.Array(value*))
      }
    }
    
    trait SimpleSegment extends StObject {
      
      var orFiltersForSegment: js.UndefOr[js.Array[OrFiltersForSegment]] = js.undefined
    }
    object SimpleSegment {
      
      inline def apply(): SimpleSegment = {
        val __obj = js.Dynamic.literal()
        __obj.asInstanceOf[SimpleSegment]
      }
      
      extension [Self <: SimpleSegment](x: Self) {
        
        inline def setOrFiltersForSegment(value: js.Array[OrFiltersForSegment]): Self = StObject.set(x, "orFiltersForSegment", value.asInstanceOf[js.Any])
        
        inline def setOrFiltersForSegmentUndefined: Self = StObject.set(x, "orFiltersForSegment", js.undefined)
        
        inline def setOrFiltersForSegmentVarargs(value: OrFiltersForSegment*): Self = StObject.set(x, "orFiltersForSegment", js.Array(value*))
      }
    }
    
    trait TransactionData extends StObject {
      
      var transactionId: js.UndefOr[String] = js.undefined
      
      var transactionRevenue: js.UndefOr[Double] = js.undefined
      
      var transactionShipping: js.UndefOr[Double] = js.undefined
      
      var transactionTax: js.UndefOr[Double] = js.undefined
    }
    object TransactionData {
      
      inline def apply(): TransactionData = {
        val __obj = js.Dynamic.literal()
        __obj.asInstanceOf[TransactionData]
      }
      
      extension [Self <: TransactionData](x: Self) {
        
        inline def setTransactionId(value: String): Self = StObject.set(x, "transactionId", value.asInstanceOf[js.Any])
        
        inline def setTransactionIdUndefined: Self = StObject.set(x, "transactionId", js.undefined)
        
        inline def setTransactionRevenue(value: Double): Self = StObject.set(x, "transactionRevenue", value.asInstanceOf[js.Any])
        
        inline def setTransactionRevenueUndefined: Self = StObject.set(x, "transactionRevenue", js.undefined)
        
        inline def setTransactionShipping(value: Double): Self = StObject.set(x, "transactionShipping", value.asInstanceOf[js.Any])
        
        inline def setTransactionShippingUndefined: Self = StObject.set(x, "transactionShipping", js.undefined)
        
        inline def setTransactionTax(value: Double): Self = StObject.set(x, "transactionTax", value.asInstanceOf[js.Any])
        
        inline def setTransactionTaxUndefined: Self = StObject.set(x, "transactionTax", js.undefined)
      }
    }
    
    trait User extends StObject {
      
      var `type`: js.UndefOr[String] = js.undefined
      
      var userId: js.UndefOr[String] = js.undefined
    }
    object User {
      
      inline def apply(): User = {
        val __obj = js.Dynamic.literal()
        __obj.asInstanceOf[User]
      }
      
      extension [Self <: User](x: Self) {
        
        inline def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
        
        inline def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
        
        inline def setUserId(value: String): Self = StObject.set(x, "userId", value.asInstanceOf[js.Any])
        
        inline def setUserIdUndefined: Self = StObject.set(x, "userId", js.undefined)
      }
    }
    
    trait UserActivitySession extends StObject {
      
      var activities: js.UndefOr[js.Array[Activity]] = js.undefined
      
      var dataSource: js.UndefOr[String] = js.undefined
      
      var deviceCategory: js.UndefOr[String] = js.undefined
      
      var platform: js.UndefOr[String] = js.undefined
      
      var sessionDate: js.UndefOr[String] = js.undefined
      
      var sessionId: js.UndefOr[String] = js.undefined
    }
    object UserActivitySession {
      
      inline def apply(): UserActivitySession = {
        val __obj = js.Dynamic.literal()
        __obj.asInstanceOf[UserActivitySession]
      }
      
      extension [Self <: UserActivitySession](x: Self) {
        
        inline def setActivities(value: js.Array[Activity]): Self = StObject.set(x, "activities", value.asInstanceOf[js.Any])
        
        inline def setActivitiesUndefined: Self = StObject.set(x, "activities", js.undefined)
        
        inline def setActivitiesVarargs(value: Activity*): Self = StObject.set(x, "activities", js.Array(value*))
        
        inline def setDataSource(value: String): Self = StObject.set(x, "dataSource", value.asInstanceOf[js.Any])
        
        inline def setDataSourceUndefined: Self = StObject.set(x, "dataSource", js.undefined)
        
        inline def setDeviceCategory(value: String): Self = StObject.set(x, "deviceCategory", value.asInstanceOf[js.Any])
        
        inline def setDeviceCategoryUndefined: Self = StObject.set(x, "deviceCategory", js.undefined)
        
        inline def setPlatform(value: String): Self = StObject.set(x, "platform", value.asInstanceOf[js.Any])
        
        inline def setPlatformUndefined: Self = StObject.set(x, "platform", js.undefined)
        
        inline def setSessionDate(value: String): Self = StObject.set(x, "sessionDate", value.asInstanceOf[js.Any])
        
        inline def setSessionDateUndefined: Self = StObject.set(x, "sessionDate", js.undefined)
        
        inline def setSessionId(value: String): Self = StObject.set(x, "sessionId", value.asInstanceOf[js.Any])
        
        inline def setSessionIdUndefined: Self = StObject.set(x, "sessionId", js.undefined)
      }
    }
  }
}
