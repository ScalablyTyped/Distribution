package typings.googleapis.anon

import typings.googleapis.v35Mod.dfareportingV35.SchemaChannelGrouping
import typings.googleapis.v35Mod.dfareportingV35.SchemaDateRange
import typings.googleapis.v35Mod.dfareportingV35.SchemaDimensionValue
import typings.googleapis.v35Mod.dfareportingV35.SchemaPathFilter
import typings.googleapis.v35Mod.dfareportingV35.SchemaSortedDimension
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PathFilters extends StObject {
  
  var activityFilters: js.UndefOr[js.Array[SchemaDimensionValue]] = js.undefined
  
  var customChannelGrouping: js.UndefOr[SchemaChannelGrouping] = js.undefined
  
  var dateRange: js.UndefOr[SchemaDateRange] = js.undefined
  
  var dimensions: js.UndefOr[js.Array[SchemaSortedDimension]] = js.undefined
  
  var floodlightConfigId: js.UndefOr[SchemaDimensionValue] = js.undefined
  
  var metricNames: js.UndefOr[js.Array[String]] = js.undefined
  
  var pathFilters: js.UndefOr[js.Array[SchemaPathFilter]] = js.undefined
}
object PathFilters {
  
  inline def apply(): PathFilters = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PathFilters]
  }
  
  extension [Self <: PathFilters](x: Self) {
    
    inline def setActivityFilters(value: js.Array[SchemaDimensionValue]): Self = StObject.set(x, "activityFilters", value.asInstanceOf[js.Any])
    
    inline def setActivityFiltersUndefined: Self = StObject.set(x, "activityFilters", js.undefined)
    
    inline def setActivityFiltersVarargs(value: SchemaDimensionValue*): Self = StObject.set(x, "activityFilters", js.Array(value*))
    
    inline def setCustomChannelGrouping(value: SchemaChannelGrouping): Self = StObject.set(x, "customChannelGrouping", value.asInstanceOf[js.Any])
    
    inline def setCustomChannelGroupingUndefined: Self = StObject.set(x, "customChannelGrouping", js.undefined)
    
    inline def setDateRange(value: SchemaDateRange): Self = StObject.set(x, "dateRange", value.asInstanceOf[js.Any])
    
    inline def setDateRangeUndefined: Self = StObject.set(x, "dateRange", js.undefined)
    
    inline def setDimensions(value: js.Array[SchemaSortedDimension]): Self = StObject.set(x, "dimensions", value.asInstanceOf[js.Any])
    
    inline def setDimensionsUndefined: Self = StObject.set(x, "dimensions", js.undefined)
    
    inline def setDimensionsVarargs(value: SchemaSortedDimension*): Self = StObject.set(x, "dimensions", js.Array(value*))
    
    inline def setFloodlightConfigId(value: SchemaDimensionValue): Self = StObject.set(x, "floodlightConfigId", value.asInstanceOf[js.Any])
    
    inline def setFloodlightConfigIdUndefined: Self = StObject.set(x, "floodlightConfigId", js.undefined)
    
    inline def setMetricNames(value: js.Array[String]): Self = StObject.set(x, "metricNames", value.asInstanceOf[js.Any])
    
    inline def setMetricNamesUndefined: Self = StObject.set(x, "metricNames", js.undefined)
    
    inline def setMetricNamesVarargs(value: String*): Self = StObject.set(x, "metricNames", js.Array(value*))
    
    inline def setPathFilters(value: js.Array[SchemaPathFilter]): Self = StObject.set(x, "pathFilters", value.asInstanceOf[js.Any])
    
    inline def setPathFiltersUndefined: Self = StObject.set(x, "pathFilters", js.undefined)
    
    inline def setPathFiltersVarargs(value: SchemaPathFilter*): Self = StObject.set(x, "pathFilters", js.Array(value*))
  }
}
