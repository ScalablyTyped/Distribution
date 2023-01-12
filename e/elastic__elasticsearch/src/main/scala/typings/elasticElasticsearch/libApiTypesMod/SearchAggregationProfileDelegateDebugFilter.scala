package typings.elasticElasticsearch.libApiTypesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SearchAggregationProfileDelegateDebugFilter extends StObject {
  
  var query: js.UndefOr[String] = js.undefined
  
  var results_from_metadata: js.UndefOr[integer] = js.undefined
  
  var segments_counted_in_constant_time: js.UndefOr[integer] = js.undefined
  
  var specialized_for: js.UndefOr[String] = js.undefined
}
object SearchAggregationProfileDelegateDebugFilter {
  
  inline def apply(): SearchAggregationProfileDelegateDebugFilter = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SearchAggregationProfileDelegateDebugFilter]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: SearchAggregationProfileDelegateDebugFilter] (val x: Self) extends AnyVal {
    
    inline def setQuery(value: String): Self = StObject.set(x, "query", value.asInstanceOf[js.Any])
    
    inline def setQueryUndefined: Self = StObject.set(x, "query", js.undefined)
    
    inline def setResults_from_metadata(value: integer): Self = StObject.set(x, "results_from_metadata", value.asInstanceOf[js.Any])
    
    inline def setResults_from_metadataUndefined: Self = StObject.set(x, "results_from_metadata", js.undefined)
    
    inline def setSegments_counted_in_constant_time(value: integer): Self = StObject.set(x, "segments_counted_in_constant_time", value.asInstanceOf[js.Any])
    
    inline def setSegments_counted_in_constant_timeUndefined: Self = StObject.set(x, "segments_counted_in_constant_time", js.undefined)
    
    inline def setSpecialized_for(value: String): Self = StObject.set(x, "specialized_for", value.asInstanceOf[js.Any])
    
    inline def setSpecialized_forUndefined: Self = StObject.set(x, "specialized_for", js.undefined)
  }
}
