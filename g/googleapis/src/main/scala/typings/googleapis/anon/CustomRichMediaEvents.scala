package typings.googleapis.anon

import typings.googleapis.v31Mod.dfareportingV31.SchemaDateRange
import typings.googleapis.v31Mod.dfareportingV31.SchemaDimensionValue
import typings.googleapis.v31Mod.dfareportingV31.SchemaSortedDimension
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CustomRichMediaEvents extends StObject {
  
  var customRichMediaEvents: js.UndefOr[js.Array[SchemaDimensionValue]] = js.undefined
  
  var dateRange: js.UndefOr[SchemaDateRange] = js.undefined
  
  var dimensionFilters: js.UndefOr[js.Array[SchemaDimensionValue]] = js.undefined
  
  var dimensions: js.UndefOr[js.Array[SchemaSortedDimension]] = js.undefined
  
  var floodlightConfigId: js.UndefOr[SchemaDimensionValue] = js.undefined
  
  var metricNames: js.UndefOr[js.Array[String]] = js.undefined
  
  var reportProperties: js.UndefOr[IncludeAttributedIPConversions] = js.undefined
}
object CustomRichMediaEvents {
  
  @scala.inline
  def apply(): CustomRichMediaEvents = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CustomRichMediaEvents]
  }
  
  @scala.inline
  implicit class CustomRichMediaEventsMutableBuilder[Self <: CustomRichMediaEvents] (val x: Self) extends AnyVal {
    
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
    def setReportProperties(value: IncludeAttributedIPConversions): Self = StObject.set(x, "reportProperties", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setReportPropertiesUndefined: Self = StObject.set(x, "reportProperties", js.undefined)
  }
}
