package typings.elasticElasticsearch.libApiTypesWithBodyKeyMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SearchShardProfile extends StObject {
  
  var aggregations: js.Array[SearchAggregationProfile]
  
  var fetch: js.UndefOr[SearchFetchProfile] = js.undefined
  
  var id: String
  
  var searches: js.Array[SearchSearchProfile]
}
object SearchShardProfile {
  
  inline def apply(
    aggregations: js.Array[SearchAggregationProfile],
    id: String,
    searches: js.Array[SearchSearchProfile]
  ): SearchShardProfile = {
    val __obj = js.Dynamic.literal(aggregations = aggregations.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], searches = searches.asInstanceOf[js.Any])
    __obj.asInstanceOf[SearchShardProfile]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: SearchShardProfile] (val x: Self) extends AnyVal {
    
    inline def setAggregations(value: js.Array[SearchAggregationProfile]): Self = StObject.set(x, "aggregations", value.asInstanceOf[js.Any])
    
    inline def setAggregationsVarargs(value: SearchAggregationProfile*): Self = StObject.set(x, "aggregations", js.Array(value*))
    
    inline def setFetch(value: SearchFetchProfile): Self = StObject.set(x, "fetch", value.asInstanceOf[js.Any])
    
    inline def setFetchUndefined: Self = StObject.set(x, "fetch", js.undefined)
    
    inline def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    inline def setSearches(value: js.Array[SearchSearchProfile]): Self = StObject.set(x, "searches", value.asInstanceOf[js.Any])
    
    inline def setSearchesVarargs(value: SearchSearchProfile*): Self = StObject.set(x, "searches", js.Array(value*))
  }
}
