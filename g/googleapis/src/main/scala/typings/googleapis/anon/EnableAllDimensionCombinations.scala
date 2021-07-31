package typings.googleapis.anon

import typings.googleapis.v32Mod.dfareportingV32.SchemaActivities
import typings.googleapis.v32Mod.dfareportingV32.SchemaCustomRichMediaEvents
import typings.googleapis.v32Mod.dfareportingV32.SchemaDateRange
import typings.googleapis.v32Mod.dfareportingV32.SchemaDimensionValue
import typings.googleapis.v32Mod.dfareportingV32.SchemaSortedDimension
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait EnableAllDimensionCombinations extends StObject {
  
  var activities: js.UndefOr[SchemaActivities] = js.undefined
  
  var customRichMediaEvents: js.UndefOr[SchemaCustomRichMediaEvents] = js.undefined
  
  var dateRange: js.UndefOr[SchemaDateRange] = js.undefined
  
  var dimensionFilters: js.UndefOr[js.Array[SchemaDimensionValue]] = js.undefined
  
  var dimensions: js.UndefOr[js.Array[SchemaSortedDimension]] = js.undefined
  
  var enableAllDimensionCombinations: js.UndefOr[Boolean] = js.undefined
  
  var metricNames: js.UndefOr[js.Array[String]] = js.undefined
  
  var reachByFrequencyMetricNames: js.UndefOr[js.Array[String]] = js.undefined
}
object EnableAllDimensionCombinations {
  
  @scala.inline
  def apply(): EnableAllDimensionCombinations = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[EnableAllDimensionCombinations]
  }
  
  @scala.inline
  implicit class EnableAllDimensionCombinationsMutableBuilder[Self <: EnableAllDimensionCombinations] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setActivities(value: SchemaActivities): Self = StObject.set(x, "activities", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setActivitiesUndefined: Self = StObject.set(x, "activities", js.undefined)
    
    @scala.inline
    def setCustomRichMediaEvents(value: SchemaCustomRichMediaEvents): Self = StObject.set(x, "customRichMediaEvents", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCustomRichMediaEventsUndefined: Self = StObject.set(x, "customRichMediaEvents", js.undefined)
    
    @scala.inline
    def setDateRange(value: SchemaDateRange): Self = StObject.set(x, "dateRange", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDateRangeUndefined: Self = StObject.set(x, "dateRange", js.undefined)
    
    @scala.inline
    def setDimensionFilters(value: js.Array[SchemaDimensionValue]): Self = StObject.set(x, "dimensionFilters", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDimensionFiltersUndefined: Self = StObject.set(x, "dimensionFilters", js.undefined)
    
    @scala.inline
    def setDimensionFiltersVarargs(value: SchemaDimensionValue*): Self = StObject.set(x, "dimensionFilters", js.Array(value :_*))
    
    @scala.inline
    def setDimensions(value: js.Array[SchemaSortedDimension]): Self = StObject.set(x, "dimensions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDimensionsUndefined: Self = StObject.set(x, "dimensions", js.undefined)
    
    @scala.inline
    def setDimensionsVarargs(value: SchemaSortedDimension*): Self = StObject.set(x, "dimensions", js.Array(value :_*))
    
    @scala.inline
    def setEnableAllDimensionCombinations(value: Boolean): Self = StObject.set(x, "enableAllDimensionCombinations", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEnableAllDimensionCombinationsUndefined: Self = StObject.set(x, "enableAllDimensionCombinations", js.undefined)
    
    @scala.inline
    def setMetricNames(value: js.Array[String]): Self = StObject.set(x, "metricNames", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMetricNamesUndefined: Self = StObject.set(x, "metricNames", js.undefined)
    
    @scala.inline
    def setMetricNamesVarargs(value: String*): Self = StObject.set(x, "metricNames", js.Array(value :_*))
    
    @scala.inline
    def setReachByFrequencyMetricNames(value: js.Array[String]): Self = StObject.set(x, "reachByFrequencyMetricNames", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setReachByFrequencyMetricNamesUndefined: Self = StObject.set(x, "reachByFrequencyMetricNames", js.undefined)
    
    @scala.inline
    def setReachByFrequencyMetricNamesVarargs(value: String*): Self = StObject.set(x, "reachByFrequencyMetricNames", js.Array(value :_*))
  }
}
