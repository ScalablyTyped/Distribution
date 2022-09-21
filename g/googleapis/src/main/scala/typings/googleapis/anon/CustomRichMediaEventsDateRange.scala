package typings.googleapis.anon

import typings.googleapis.dfareportingV4Mod.dfareportingV4.SchemaDateRange
import typings.googleapis.dfareportingV4Mod.dfareportingV4.SchemaDimensionValue
import typings.googleapis.dfareportingV4Mod.dfareportingV4.SchemaSortedDimension
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CustomRichMediaEventsDateRange extends StObject {
  
  var customRichMediaEvents: js.UndefOr[js.Array[SchemaDimensionValue]] = js.undefined
  
  var dateRange: js.UndefOr[SchemaDateRange] = js.undefined
  
  var dimensionFilters: js.UndefOr[js.Array[SchemaDimensionValue]] = js.undefined
  
  var dimensions: js.UndefOr[js.Array[SchemaSortedDimension]] = js.undefined
  
  var floodlightConfigId: js.UndefOr[SchemaDimensionValue] = js.undefined
  
  var metricNames: js.UndefOr[js.Array[String]] = js.undefined
  
  var reportProperties: js.UndefOr[IncludeAttributedIPConversions] = js.undefined
}
object CustomRichMediaEventsDateRange {
  
  inline def apply(): CustomRichMediaEventsDateRange = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CustomRichMediaEventsDateRange]
  }
  
  extension [Self <: CustomRichMediaEventsDateRange](x: Self) {
    
    inline def setCustomRichMediaEvents(value: js.Array[SchemaDimensionValue]): Self = StObject.set(x, "customRichMediaEvents", value.asInstanceOf[js.Any])
    
    inline def setCustomRichMediaEventsUndefined: Self = StObject.set(x, "customRichMediaEvents", js.undefined)
    
    inline def setCustomRichMediaEventsVarargs(value: SchemaDimensionValue*): Self = StObject.set(x, "customRichMediaEvents", js.Array(value*))
    
    inline def setDateRange(value: SchemaDateRange): Self = StObject.set(x, "dateRange", value.asInstanceOf[js.Any])
    
    inline def setDateRangeUndefined: Self = StObject.set(x, "dateRange", js.undefined)
    
    inline def setDimensionFilters(value: js.Array[SchemaDimensionValue]): Self = StObject.set(x, "dimensionFilters", value.asInstanceOf[js.Any])
    
    inline def setDimensionFiltersUndefined: Self = StObject.set(x, "dimensionFilters", js.undefined)
    
    inline def setDimensionFiltersVarargs(value: SchemaDimensionValue*): Self = StObject.set(x, "dimensionFilters", js.Array(value*))
    
    inline def setDimensions(value: js.Array[SchemaSortedDimension]): Self = StObject.set(x, "dimensions", value.asInstanceOf[js.Any])
    
    inline def setDimensionsUndefined: Self = StObject.set(x, "dimensions", js.undefined)
    
    inline def setDimensionsVarargs(value: SchemaSortedDimension*): Self = StObject.set(x, "dimensions", js.Array(value*))
    
    inline def setFloodlightConfigId(value: SchemaDimensionValue): Self = StObject.set(x, "floodlightConfigId", value.asInstanceOf[js.Any])
    
    inline def setFloodlightConfigIdUndefined: Self = StObject.set(x, "floodlightConfigId", js.undefined)
    
    inline def setMetricNames(value: js.Array[String]): Self = StObject.set(x, "metricNames", value.asInstanceOf[js.Any])
    
    inline def setMetricNamesUndefined: Self = StObject.set(x, "metricNames", js.undefined)
    
    inline def setMetricNamesVarargs(value: String*): Self = StObject.set(x, "metricNames", js.Array(value*))
    
    inline def setReportProperties(value: IncludeAttributedIPConversions): Self = StObject.set(x, "reportProperties", value.asInstanceOf[js.Any])
    
    inline def setReportPropertiesUndefined: Self = StObject.set(x, "reportProperties", js.undefined)
  }
}
