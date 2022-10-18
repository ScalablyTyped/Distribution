package typings.elasticElasticsearch.libApiTypesWithBodyKeyMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SearchAggregationProfileDelegateDebugFilter extends StObject {
  
  var query: js.UndefOr[String] = js.undefined
  
  var results_from_metadata: js.UndefOr[integer] = js.undefined
  
  var specialized_for: js.UndefOr[String] = js.undefined
}
object SearchAggregationProfileDelegateDebugFilter {
  
  inline def apply(): SearchAggregationProfileDelegateDebugFilter = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SearchAggregationProfileDelegateDebugFilter]
  }
  
  extension [Self <: SearchAggregationProfileDelegateDebugFilter](x: Self) {
    
    inline def setQuery(value: String): Self = StObject.set(x, "query", value.asInstanceOf[js.Any])
    
    inline def setQueryUndefined: Self = StObject.set(x, "query", js.undefined)
    
    inline def setResults_from_metadata(value: integer): Self = StObject.set(x, "results_from_metadata", value.asInstanceOf[js.Any])
    
    inline def setResults_from_metadataUndefined: Self = StObject.set(x, "results_from_metadata", js.undefined)
    
    inline def setSpecialized_for(value: String): Self = StObject.set(x, "specialized_for", value.asInstanceOf[js.Any])
    
    inline def setSpecialized_forUndefined: Self = StObject.set(x, "specialized_for", js.undefined)
  }
}
