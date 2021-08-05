package typings.googleapis.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Filters extends StObject {
  
  var dimensions: js.UndefOr[String] = js.undefined
  
  var filters: js.UndefOr[String] = js.undefined
  
  var ids: js.UndefOr[String] = js.undefined
  
  var `max-results`: js.UndefOr[Double] = js.undefined
  
  var metrics: js.UndefOr[js.Array[String]] = js.undefined
  
  var sort: js.UndefOr[js.Array[String]] = js.undefined
}
object Filters {
  
  inline def apply(): Filters = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Filters]
  }
  
  extension [Self <: Filters](x: Self) {
    
    inline def setDimensions(value: String): Self = StObject.set(x, "dimensions", value.asInstanceOf[js.Any])
    
    inline def setDimensionsUndefined: Self = StObject.set(x, "dimensions", js.undefined)
    
    inline def setFilters(value: String): Self = StObject.set(x, "filters", value.asInstanceOf[js.Any])
    
    inline def setFiltersUndefined: Self = StObject.set(x, "filters", js.undefined)
    
    inline def setIds(value: String): Self = StObject.set(x, "ids", value.asInstanceOf[js.Any])
    
    inline def setIdsUndefined: Self = StObject.set(x, "ids", js.undefined)
    
    inline def `setMax-results`(value: Double): Self = StObject.set(x, "max-results", value.asInstanceOf[js.Any])
    
    inline def `setMax-resultsUndefined`: Self = StObject.set(x, "max-results", js.undefined)
    
    inline def setMetrics(value: js.Array[String]): Self = StObject.set(x, "metrics", value.asInstanceOf[js.Any])
    
    inline def setMetricsUndefined: Self = StObject.set(x, "metrics", js.undefined)
    
    inline def setMetricsVarargs(value: String*): Self = StObject.set(x, "metrics", js.Array(value :_*))
    
    inline def setSort(value: js.Array[String]): Self = StObject.set(x, "sort", value.asInstanceOf[js.Any])
    
    inline def setSortUndefined: Self = StObject.set(x, "sort", js.undefined)
    
    inline def setSortVarargs(value: String*): Self = StObject.set(x, "sort", js.Array(value :_*))
  }
}
