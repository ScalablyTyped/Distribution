package typings.googleapis.anon

import typings.googleapis.v35Mod.dfareportingV35.SchemaDateRange
import typings.googleapis.v35Mod.dfareportingV35.SchemaDimensionValue
import typings.googleapis.v35Mod.dfareportingV35.SchemaSortedDimension
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CustomFloodlightVariables extends StObject {
  
  var activityFilters: js.UndefOr[js.Array[SchemaDimensionValue]] = js.undefined
  
  var conversionDimensions: js.UndefOr[js.Array[SchemaSortedDimension]] = js.undefined
  
  var customFloodlightVariables: js.UndefOr[js.Array[SchemaSortedDimension]] = js.undefined
  
  var customRichMediaEvents: js.UndefOr[js.Array[SchemaDimensionValue]] = js.undefined
  
  var dateRange: js.UndefOr[SchemaDateRange] = js.undefined
  
  var floodlightConfigId: js.UndefOr[SchemaDimensionValue] = js.undefined
  
  var metricNames: js.UndefOr[js.Array[String]] = js.undefined
  
  var perInteractionDimensions: js.UndefOr[js.Array[SchemaSortedDimension]] = js.undefined
  
  var reportProperties: js.UndefOr[ClicksLookbackWindow] = js.undefined
}
object CustomFloodlightVariables {
  
  inline def apply(): CustomFloodlightVariables = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CustomFloodlightVariables]
  }
  
  extension [Self <: CustomFloodlightVariables](x: Self) {
    
    inline def setActivityFilters(value: js.Array[SchemaDimensionValue]): Self = StObject.set(x, "activityFilters", value.asInstanceOf[js.Any])
    
    inline def setActivityFiltersUndefined: Self = StObject.set(x, "activityFilters", js.undefined)
    
    inline def setActivityFiltersVarargs(value: SchemaDimensionValue*): Self = StObject.set(x, "activityFilters", js.Array(value*))
    
    inline def setConversionDimensions(value: js.Array[SchemaSortedDimension]): Self = StObject.set(x, "conversionDimensions", value.asInstanceOf[js.Any])
    
    inline def setConversionDimensionsUndefined: Self = StObject.set(x, "conversionDimensions", js.undefined)
    
    inline def setConversionDimensionsVarargs(value: SchemaSortedDimension*): Self = StObject.set(x, "conversionDimensions", js.Array(value*))
    
    inline def setCustomFloodlightVariables(value: js.Array[SchemaSortedDimension]): Self = StObject.set(x, "customFloodlightVariables", value.asInstanceOf[js.Any])
    
    inline def setCustomFloodlightVariablesUndefined: Self = StObject.set(x, "customFloodlightVariables", js.undefined)
    
    inline def setCustomFloodlightVariablesVarargs(value: SchemaSortedDimension*): Self = StObject.set(x, "customFloodlightVariables", js.Array(value*))
    
    inline def setCustomRichMediaEvents(value: js.Array[SchemaDimensionValue]): Self = StObject.set(x, "customRichMediaEvents", value.asInstanceOf[js.Any])
    
    inline def setCustomRichMediaEventsUndefined: Self = StObject.set(x, "customRichMediaEvents", js.undefined)
    
    inline def setCustomRichMediaEventsVarargs(value: SchemaDimensionValue*): Self = StObject.set(x, "customRichMediaEvents", js.Array(value*))
    
    inline def setDateRange(value: SchemaDateRange): Self = StObject.set(x, "dateRange", value.asInstanceOf[js.Any])
    
    inline def setDateRangeUndefined: Self = StObject.set(x, "dateRange", js.undefined)
    
    inline def setFloodlightConfigId(value: SchemaDimensionValue): Self = StObject.set(x, "floodlightConfigId", value.asInstanceOf[js.Any])
    
    inline def setFloodlightConfigIdUndefined: Self = StObject.set(x, "floodlightConfigId", js.undefined)
    
    inline def setMetricNames(value: js.Array[String]): Self = StObject.set(x, "metricNames", value.asInstanceOf[js.Any])
    
    inline def setMetricNamesUndefined: Self = StObject.set(x, "metricNames", js.undefined)
    
    inline def setMetricNamesVarargs(value: String*): Self = StObject.set(x, "metricNames", js.Array(value*))
    
    inline def setPerInteractionDimensions(value: js.Array[SchemaSortedDimension]): Self = StObject.set(x, "perInteractionDimensions", value.asInstanceOf[js.Any])
    
    inline def setPerInteractionDimensionsUndefined: Self = StObject.set(x, "perInteractionDimensions", js.undefined)
    
    inline def setPerInteractionDimensionsVarargs(value: SchemaSortedDimension*): Self = StObject.set(x, "perInteractionDimensions", js.Array(value*))
    
    inline def setReportProperties(value: ClicksLookbackWindow): Self = StObject.set(x, "reportProperties", value.asInstanceOf[js.Any])
    
    inline def setReportPropertiesUndefined: Self = StObject.set(x, "reportProperties", js.undefined)
  }
}
