package typings.googleapis.anon

import typings.googleapis.v33Mod.dfareportingV33.SchemaDateRange
import typings.googleapis.v33Mod.dfareportingV33.SchemaDimensionValue
import typings.googleapis.v33Mod.dfareportingV33.SchemaSortedDimension
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait OverlapMetricNames extends StObject {
  
  var breakdown: js.UndefOr[js.Array[SchemaSortedDimension]] = js.undefined
  
  var dateRange: js.UndefOr[SchemaDateRange] = js.undefined
  
  var dimension: js.UndefOr[String] = js.undefined
  
  var dimensionFilters: js.UndefOr[js.Array[SchemaDimensionValue]] = js.undefined
  
  var metricNames: js.UndefOr[js.Array[String]] = js.undefined
  
  var overlapMetricNames: js.UndefOr[js.Array[String]] = js.undefined
  
  var pivoted: js.UndefOr[Boolean] = js.undefined
}
object OverlapMetricNames {
  
  inline def apply(): OverlapMetricNames = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[OverlapMetricNames]
  }
  
  extension [Self <: OverlapMetricNames](x: Self) {
    
    inline def setBreakdown(value: js.Array[SchemaSortedDimension]): Self = StObject.set(x, "breakdown", value.asInstanceOf[js.Any])
    
    inline def setBreakdownUndefined: Self = StObject.set(x, "breakdown", js.undefined)
    
    inline def setBreakdownVarargs(value: SchemaSortedDimension*): Self = StObject.set(x, "breakdown", js.Array(value :_*))
    
    inline def setDateRange(value: SchemaDateRange): Self = StObject.set(x, "dateRange", value.asInstanceOf[js.Any])
    
    inline def setDateRangeUndefined: Self = StObject.set(x, "dateRange", js.undefined)
    
    inline def setDimension(value: String): Self = StObject.set(x, "dimension", value.asInstanceOf[js.Any])
    
    inline def setDimensionFilters(value: js.Array[SchemaDimensionValue]): Self = StObject.set(x, "dimensionFilters", value.asInstanceOf[js.Any])
    
    inline def setDimensionFiltersUndefined: Self = StObject.set(x, "dimensionFilters", js.undefined)
    
    inline def setDimensionFiltersVarargs(value: SchemaDimensionValue*): Self = StObject.set(x, "dimensionFilters", js.Array(value :_*))
    
    inline def setDimensionUndefined: Self = StObject.set(x, "dimension", js.undefined)
    
    inline def setMetricNames(value: js.Array[String]): Self = StObject.set(x, "metricNames", value.asInstanceOf[js.Any])
    
    inline def setMetricNamesUndefined: Self = StObject.set(x, "metricNames", js.undefined)
    
    inline def setMetricNamesVarargs(value: String*): Self = StObject.set(x, "metricNames", js.Array(value :_*))
    
    inline def setOverlapMetricNames(value: js.Array[String]): Self = StObject.set(x, "overlapMetricNames", value.asInstanceOf[js.Any])
    
    inline def setOverlapMetricNamesUndefined: Self = StObject.set(x, "overlapMetricNames", js.undefined)
    
    inline def setOverlapMetricNamesVarargs(value: String*): Self = StObject.set(x, "overlapMetricNames", js.Array(value :_*))
    
    inline def setPivoted(value: Boolean): Self = StObject.set(x, "pivoted", value.asInstanceOf[js.Any])
    
    inline def setPivotedUndefined: Self = StObject.set(x, "pivoted", js.undefined)
  }
}
