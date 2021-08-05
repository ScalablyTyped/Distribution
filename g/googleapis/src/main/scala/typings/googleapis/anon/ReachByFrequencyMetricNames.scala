package typings.googleapis.anon

import typings.googleapis.v33Mod.dfareportingV33.SchemaActivities
import typings.googleapis.v33Mod.dfareportingV33.SchemaCustomRichMediaEvents
import typings.googleapis.v33Mod.dfareportingV33.SchemaDateRange
import typings.googleapis.v33Mod.dfareportingV33.SchemaDimensionValue
import typings.googleapis.v33Mod.dfareportingV33.SchemaSortedDimension
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ReachByFrequencyMetricNames extends StObject {
  
  var activities: js.UndefOr[SchemaActivities] = js.undefined
  
  var customRichMediaEvents: js.UndefOr[SchemaCustomRichMediaEvents] = js.undefined
  
  var dateRange: js.UndefOr[SchemaDateRange] = js.undefined
  
  var dimensionFilters: js.UndefOr[js.Array[SchemaDimensionValue]] = js.undefined
  
  var dimensions: js.UndefOr[js.Array[SchemaSortedDimension]] = js.undefined
  
  var enableAllDimensionCombinations: js.UndefOr[Boolean] = js.undefined
  
  var metricNames: js.UndefOr[js.Array[String]] = js.undefined
  
  var reachByFrequencyMetricNames: js.UndefOr[js.Array[String]] = js.undefined
}
object ReachByFrequencyMetricNames {
  
  inline def apply(): ReachByFrequencyMetricNames = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ReachByFrequencyMetricNames]
  }
  
  extension [Self <: ReachByFrequencyMetricNames](x: Self) {
    
    inline def setActivities(value: SchemaActivities): Self = StObject.set(x, "activities", value.asInstanceOf[js.Any])
    
    inline def setActivitiesUndefined: Self = StObject.set(x, "activities", js.undefined)
    
    inline def setCustomRichMediaEvents(value: SchemaCustomRichMediaEvents): Self = StObject.set(x, "customRichMediaEvents", value.asInstanceOf[js.Any])
    
    inline def setCustomRichMediaEventsUndefined: Self = StObject.set(x, "customRichMediaEvents", js.undefined)
    
    inline def setDateRange(value: SchemaDateRange): Self = StObject.set(x, "dateRange", value.asInstanceOf[js.Any])
    
    inline def setDateRangeUndefined: Self = StObject.set(x, "dateRange", js.undefined)
    
    inline def setDimensionFilters(value: js.Array[SchemaDimensionValue]): Self = StObject.set(x, "dimensionFilters", value.asInstanceOf[js.Any])
    
    inline def setDimensionFiltersUndefined: Self = StObject.set(x, "dimensionFilters", js.undefined)
    
    inline def setDimensionFiltersVarargs(value: SchemaDimensionValue*): Self = StObject.set(x, "dimensionFilters", js.Array(value :_*))
    
    inline def setDimensions(value: js.Array[SchemaSortedDimension]): Self = StObject.set(x, "dimensions", value.asInstanceOf[js.Any])
    
    inline def setDimensionsUndefined: Self = StObject.set(x, "dimensions", js.undefined)
    
    inline def setDimensionsVarargs(value: SchemaSortedDimension*): Self = StObject.set(x, "dimensions", js.Array(value :_*))
    
    inline def setEnableAllDimensionCombinations(value: Boolean): Self = StObject.set(x, "enableAllDimensionCombinations", value.asInstanceOf[js.Any])
    
    inline def setEnableAllDimensionCombinationsUndefined: Self = StObject.set(x, "enableAllDimensionCombinations", js.undefined)
    
    inline def setMetricNames(value: js.Array[String]): Self = StObject.set(x, "metricNames", value.asInstanceOf[js.Any])
    
    inline def setMetricNamesUndefined: Self = StObject.set(x, "metricNames", js.undefined)
    
    inline def setMetricNamesVarargs(value: String*): Self = StObject.set(x, "metricNames", js.Array(value :_*))
    
    inline def setReachByFrequencyMetricNames(value: js.Array[String]): Self = StObject.set(x, "reachByFrequencyMetricNames", value.asInstanceOf[js.Any])
    
    inline def setReachByFrequencyMetricNamesUndefined: Self = StObject.set(x, "reachByFrequencyMetricNames", js.undefined)
    
    inline def setReachByFrequencyMetricNamesVarargs(value: String*): Self = StObject.set(x, "reachByFrequencyMetricNames", js.Array(value :_*))
  }
}
