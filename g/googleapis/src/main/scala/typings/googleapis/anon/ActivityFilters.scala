package typings.googleapis.anon

import typings.googleapis.v31Mod.dfareportingV31.SchemaDateRange
import typings.googleapis.v31Mod.dfareportingV31.SchemaDimensionValue
import typings.googleapis.v31Mod.dfareportingV31.SchemaSortedDimension
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ActivityFilters extends StObject {
  
  var activityFilters: js.UndefOr[js.Array[SchemaDimensionValue]] = js.native
  
  var conversionDimensions: js.UndefOr[js.Array[SchemaSortedDimension]] = js.native
  
  var customFloodlightVariables: js.UndefOr[js.Array[SchemaSortedDimension]] = js.native
  
  var customRichMediaEvents: js.UndefOr[js.Array[SchemaDimensionValue]] = js.native
  
  var dateRange: js.UndefOr[SchemaDateRange] = js.native
  
  var floodlightConfigId: js.UndefOr[SchemaDimensionValue] = js.native
  
  var metricNames: js.UndefOr[js.Array[String]] = js.native
  
  var perInteractionDimensions: js.UndefOr[js.Array[SchemaSortedDimension]] = js.native
  
  var reportProperties: js.UndefOr[ClicksLookbackWindow] = js.native
}
object ActivityFilters {
  
  @scala.inline
  def apply(): ActivityFilters = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ActivityFilters]
  }
  
  @scala.inline
  implicit class ActivityFiltersMutableBuilder[Self <: ActivityFilters] (val x: Self) extends AnyVal {
    
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
