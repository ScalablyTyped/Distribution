package typings.googleapis.anon

import typings.googleapis.v33Mod.dfareportingV33.SchemaDateRange
import typings.googleapis.v33Mod.dfareportingV33.SchemaDimensionValue
import typings.googleapis.v33Mod.dfareportingV33.SchemaSortedDimension
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
  
  @scala.inline
  def apply(): CustomFloodlightVariables = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CustomFloodlightVariables]
  }
  
  @scala.inline
  implicit class CustomFloodlightVariablesMutableBuilder[Self <: CustomFloodlightVariables] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setActivityFilters(value: js.Array[SchemaDimensionValue]): Self = StObject.set(x, "activityFilters", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setActivityFiltersUndefined: Self = StObject.set(x, "activityFilters", js.undefined)
    
    @scala.inline
    def setActivityFiltersVarargs(value: SchemaDimensionValue*): Self = StObject.set(x, "activityFilters", js.Array(value :_*))
    
    @scala.inline
    def setConversionDimensions(value: js.Array[SchemaSortedDimension]): Self = StObject.set(x, "conversionDimensions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setConversionDimensionsUndefined: Self = StObject.set(x, "conversionDimensions", js.undefined)
    
    @scala.inline
    def setConversionDimensionsVarargs(value: SchemaSortedDimension*): Self = StObject.set(x, "conversionDimensions", js.Array(value :_*))
    
    @scala.inline
    def setCustomFloodlightVariables(value: js.Array[SchemaSortedDimension]): Self = StObject.set(x, "customFloodlightVariables", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCustomFloodlightVariablesUndefined: Self = StObject.set(x, "customFloodlightVariables", js.undefined)
    
    @scala.inline
    def setCustomFloodlightVariablesVarargs(value: SchemaSortedDimension*): Self = StObject.set(x, "customFloodlightVariables", js.Array(value :_*))
    
    @scala.inline
    def setCustomRichMediaEvents(value: js.Array[SchemaDimensionValue]): Self = StObject.set(x, "customRichMediaEvents", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCustomRichMediaEventsUndefined: Self = StObject.set(x, "customRichMediaEvents", js.undefined)
    
    @scala.inline
    def setCustomRichMediaEventsVarargs(value: SchemaDimensionValue*): Self = StObject.set(x, "customRichMediaEvents", js.Array(value :_*))
    
    @scala.inline
    def setDateRange(value: SchemaDateRange): Self = StObject.set(x, "dateRange", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDateRangeUndefined: Self = StObject.set(x, "dateRange", js.undefined)
    
    @scala.inline
    def setFloodlightConfigId(value: SchemaDimensionValue): Self = StObject.set(x, "floodlightConfigId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFloodlightConfigIdUndefined: Self = StObject.set(x, "floodlightConfigId", js.undefined)
    
    @scala.inline
    def setMetricNames(value: js.Array[String]): Self = StObject.set(x, "metricNames", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMetricNamesUndefined: Self = StObject.set(x, "metricNames", js.undefined)
    
    @scala.inline
    def setMetricNamesVarargs(value: String*): Self = StObject.set(x, "metricNames", js.Array(value :_*))
    
    @scala.inline
    def setPerInteractionDimensions(value: js.Array[SchemaSortedDimension]): Self = StObject.set(x, "perInteractionDimensions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPerInteractionDimensionsUndefined: Self = StObject.set(x, "perInteractionDimensions", js.undefined)
    
    @scala.inline
    def setPerInteractionDimensionsVarargs(value: SchemaSortedDimension*): Self = StObject.set(x, "perInteractionDimensions", js.Array(value :_*))
    
    @scala.inline
    def setReportProperties(value: ClicksLookbackWindow): Self = StObject.set(x, "reportProperties", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setReportPropertiesUndefined: Self = StObject.set(x, "reportProperties", js.undefined)
  }
}
