package typings.elasticElasticsearch.libApiTypesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait FleetMsearchRequest
  extends StObject
     with SpecUtilsCommonQueryParameters {
  
  var allow_no_indices: js.UndefOr[Boolean] = js.undefined
  
  var allow_partial_search_results: js.UndefOr[Boolean] = js.undefined
  
  var ccs_minimize_roundtrips: js.UndefOr[Boolean] = js.undefined
  
  var expand_wildcards: js.UndefOr[ExpandWildcards] = js.undefined
  
  var ignore_throttled: js.UndefOr[Boolean] = js.undefined
  
  var ignore_unavailable: js.UndefOr[Boolean] = js.undefined
  
  var index: js.UndefOr[IndexName | IndexAlias] = js.undefined
  
  var max_concurrent_searches: js.UndefOr[long] = js.undefined
  
  var max_concurrent_shard_requests: js.UndefOr[long] = js.undefined
  
  var pre_filter_shard_size: js.UndefOr[long] = js.undefined
  
  var rest_total_hits_as_int: js.UndefOr[Boolean] = js.undefined
  
  var search_type: js.UndefOr[SearchType] = js.undefined
  
  var searches: js.UndefOr[js.Array[MsearchRequestItem]] = js.undefined
  
  var typed_keys: js.UndefOr[Boolean] = js.undefined
  
  var wait_for_checkpoints: js.UndefOr[js.Array[FleetCheckpoint]] = js.undefined
}
object FleetMsearchRequest {
  
  inline def apply(): FleetMsearchRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[FleetMsearchRequest]
  }
  
  extension [Self <: FleetMsearchRequest](x: Self) {
    
    inline def setAllow_no_indices(value: Boolean): Self = StObject.set(x, "allow_no_indices", value.asInstanceOf[js.Any])
    
    inline def setAllow_no_indicesUndefined: Self = StObject.set(x, "allow_no_indices", js.undefined)
    
    inline def setAllow_partial_search_results(value: Boolean): Self = StObject.set(x, "allow_partial_search_results", value.asInstanceOf[js.Any])
    
    inline def setAllow_partial_search_resultsUndefined: Self = StObject.set(x, "allow_partial_search_results", js.undefined)
    
    inline def setCcs_minimize_roundtrips(value: Boolean): Self = StObject.set(x, "ccs_minimize_roundtrips", value.asInstanceOf[js.Any])
    
    inline def setCcs_minimize_roundtripsUndefined: Self = StObject.set(x, "ccs_minimize_roundtrips", js.undefined)
    
    inline def setExpand_wildcards(value: ExpandWildcards): Self = StObject.set(x, "expand_wildcards", value.asInstanceOf[js.Any])
    
    inline def setExpand_wildcardsUndefined: Self = StObject.set(x, "expand_wildcards", js.undefined)
    
    inline def setExpand_wildcardsVarargs(value: ExpandWildcard*): Self = StObject.set(x, "expand_wildcards", js.Array(value*))
    
    inline def setIgnore_throttled(value: Boolean): Self = StObject.set(x, "ignore_throttled", value.asInstanceOf[js.Any])
    
    inline def setIgnore_throttledUndefined: Self = StObject.set(x, "ignore_throttled", js.undefined)
    
    inline def setIgnore_unavailable(value: Boolean): Self = StObject.set(x, "ignore_unavailable", value.asInstanceOf[js.Any])
    
    inline def setIgnore_unavailableUndefined: Self = StObject.set(x, "ignore_unavailable", js.undefined)
    
    inline def setIndex(value: IndexName | IndexAlias): Self = StObject.set(x, "index", value.asInstanceOf[js.Any])
    
    inline def setIndexUndefined: Self = StObject.set(x, "index", js.undefined)
    
    inline def setMax_concurrent_searches(value: long): Self = StObject.set(x, "max_concurrent_searches", value.asInstanceOf[js.Any])
    
    inline def setMax_concurrent_searchesUndefined: Self = StObject.set(x, "max_concurrent_searches", js.undefined)
    
    inline def setMax_concurrent_shard_requests(value: long): Self = StObject.set(x, "max_concurrent_shard_requests", value.asInstanceOf[js.Any])
    
    inline def setMax_concurrent_shard_requestsUndefined: Self = StObject.set(x, "max_concurrent_shard_requests", js.undefined)
    
    inline def setPre_filter_shard_size(value: long): Self = StObject.set(x, "pre_filter_shard_size", value.asInstanceOf[js.Any])
    
    inline def setPre_filter_shard_sizeUndefined: Self = StObject.set(x, "pre_filter_shard_size", js.undefined)
    
    inline def setRest_total_hits_as_int(value: Boolean): Self = StObject.set(x, "rest_total_hits_as_int", value.asInstanceOf[js.Any])
    
    inline def setRest_total_hits_as_intUndefined: Self = StObject.set(x, "rest_total_hits_as_int", js.undefined)
    
    inline def setSearch_type(value: SearchType): Self = StObject.set(x, "search_type", value.asInstanceOf[js.Any])
    
    inline def setSearch_typeUndefined: Self = StObject.set(x, "search_type", js.undefined)
    
    inline def setSearches(value: js.Array[MsearchRequestItem]): Self = StObject.set(x, "searches", value.asInstanceOf[js.Any])
    
    inline def setSearchesUndefined: Self = StObject.set(x, "searches", js.undefined)
    
    inline def setSearchesVarargs(value: MsearchRequestItem*): Self = StObject.set(x, "searches", js.Array(value*))
    
    inline def setTyped_keys(value: Boolean): Self = StObject.set(x, "typed_keys", value.asInstanceOf[js.Any])
    
    inline def setTyped_keysUndefined: Self = StObject.set(x, "typed_keys", js.undefined)
    
    inline def setWait_for_checkpoints(value: js.Array[FleetCheckpoint]): Self = StObject.set(x, "wait_for_checkpoints", value.asInstanceOf[js.Any])
    
    inline def setWait_for_checkpointsUndefined: Self = StObject.set(x, "wait_for_checkpoints", js.undefined)
    
    inline def setWait_for_checkpointsVarargs(value: FleetCheckpoint*): Self = StObject.set(x, "wait_for_checkpoints", js.Array(value*))
  }
}
