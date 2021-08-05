package typings.elasticElasticsearch.requestParamsMod

import typings.elasticElasticsearch.elasticElasticsearchStrings.dfs_query_and_fetch
import typings.elasticElasticsearch.elasticElasticsearchStrings.dfs_query_then_fetch
import typings.elasticElasticsearch.elasticElasticsearchStrings.query_and_fetch
import typings.elasticElasticsearch.elasticElasticsearchStrings.query_then_fetch
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Msearch[T]
  extends StObject
     with Generic {
  
  var body: T
  
  var ccs_minimize_roundtrips: js.UndefOr[Boolean] = js.undefined
  
  var index: js.UndefOr[String | js.Array[String]] = js.undefined
  
  var max_concurrent_searches: js.UndefOr[Double] = js.undefined
  
  var max_concurrent_shard_requests: js.UndefOr[Double] = js.undefined
  
  var pre_filter_shard_size: js.UndefOr[Double] = js.undefined
  
  var rest_total_hits_as_int: js.UndefOr[Boolean] = js.undefined
  
  var search_type: js.UndefOr[query_then_fetch | query_and_fetch | dfs_query_then_fetch | dfs_query_and_fetch] = js.undefined
  
  var `type`: js.UndefOr[String | js.Array[String]] = js.undefined
  
  var typed_keys: js.UndefOr[Boolean] = js.undefined
}
object Msearch {
  
  inline def apply[T](body: T): Msearch[T] = {
    val __obj = js.Dynamic.literal(body = body.asInstanceOf[js.Any])
    __obj.asInstanceOf[Msearch[T]]
  }
  
  extension [Self <: Msearch[?], T](x: Self & Msearch[T]) {
    
    inline def setBody(value: T): Self = StObject.set(x, "body", value.asInstanceOf[js.Any])
    
    inline def setCcs_minimize_roundtrips(value: Boolean): Self = StObject.set(x, "ccs_minimize_roundtrips", value.asInstanceOf[js.Any])
    
    inline def setCcs_minimize_roundtripsUndefined: Self = StObject.set(x, "ccs_minimize_roundtrips", js.undefined)
    
    inline def setIndex(value: String | js.Array[String]): Self = StObject.set(x, "index", value.asInstanceOf[js.Any])
    
    inline def setIndexUndefined: Self = StObject.set(x, "index", js.undefined)
    
    inline def setIndexVarargs(value: String*): Self = StObject.set(x, "index", js.Array(value :_*))
    
    inline def setMax_concurrent_searches(value: Double): Self = StObject.set(x, "max_concurrent_searches", value.asInstanceOf[js.Any])
    
    inline def setMax_concurrent_searchesUndefined: Self = StObject.set(x, "max_concurrent_searches", js.undefined)
    
    inline def setMax_concurrent_shard_requests(value: Double): Self = StObject.set(x, "max_concurrent_shard_requests", value.asInstanceOf[js.Any])
    
    inline def setMax_concurrent_shard_requestsUndefined: Self = StObject.set(x, "max_concurrent_shard_requests", js.undefined)
    
    inline def setPre_filter_shard_size(value: Double): Self = StObject.set(x, "pre_filter_shard_size", value.asInstanceOf[js.Any])
    
    inline def setPre_filter_shard_sizeUndefined: Self = StObject.set(x, "pre_filter_shard_size", js.undefined)
    
    inline def setRest_total_hits_as_int(value: Boolean): Self = StObject.set(x, "rest_total_hits_as_int", value.asInstanceOf[js.Any])
    
    inline def setRest_total_hits_as_intUndefined: Self = StObject.set(x, "rest_total_hits_as_int", js.undefined)
    
    inline def setSearch_type(value: query_then_fetch | query_and_fetch | dfs_query_then_fetch | dfs_query_and_fetch): Self = StObject.set(x, "search_type", value.asInstanceOf[js.Any])
    
    inline def setSearch_typeUndefined: Self = StObject.set(x, "search_type", js.undefined)
    
    inline def setType(value: String | js.Array[String]): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    inline def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
    
    inline def setTypeVarargs(value: String*): Self = StObject.set(x, "type", js.Array(value :_*))
    
    inline def setTyped_keys(value: Boolean): Self = StObject.set(x, "typed_keys", value.asInstanceOf[js.Any])
    
    inline def setTyped_keysUndefined: Self = StObject.set(x, "typed_keys", js.undefined)
  }
}
