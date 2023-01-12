package typings.elasticElasticsearch.libApiTypesWithBodyKeyMod

import typings.elasticElasticsearch.anon.Collapse
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait FleetSearchRequest
  extends StObject
     with SpecUtilsCommonQueryParameters {
  
  var _source_excludes: js.UndefOr[Fields] = js.undefined
  
  var _source_includes: js.UndefOr[Fields] = js.undefined
  
  var allow_no_indices: js.UndefOr[Boolean] = js.undefined
  
  var allow_partial_search_results: js.UndefOr[Boolean] = js.undefined
  
  var analyze_wildcard: js.UndefOr[Boolean] = js.undefined
  
  var analyzer: js.UndefOr[String] = js.undefined
  
  var batched_reduce_size: js.UndefOr[long] = js.undefined
  
  /** @deprecated The use of the 'body' key has been deprecated, move the nested keys to the top level object. */
  var body: js.UndefOr[Collapse] = js.undefined
  
  var ccs_minimize_roundtrips: js.UndefOr[Boolean] = js.undefined
  
  var default_operator: js.UndefOr[QueryDslOperator] = js.undefined
  
  var df: js.UndefOr[String] = js.undefined
  
  var expand_wildcards: js.UndefOr[ExpandWildcards] = js.undefined
  
  var ignore_throttled: js.UndefOr[Boolean] = js.undefined
  
  var ignore_unavailable: js.UndefOr[Boolean] = js.undefined
  
  var index: IndexName | IndexAlias
  
  var lenient: js.UndefOr[Boolean] = js.undefined
  
  var max_concurrent_shard_requests: js.UndefOr[long] = js.undefined
  
  var min_compatible_shard_node: js.UndefOr[VersionString] = js.undefined
  
  var pre_filter_shard_size: js.UndefOr[long] = js.undefined
  
  var preference: js.UndefOr[String] = js.undefined
  
  var q: js.UndefOr[String] = js.undefined
  
  var request_cache: js.UndefOr[Boolean] = js.undefined
  
  var rest_total_hits_as_int: js.UndefOr[Boolean] = js.undefined
  
  var routing: js.UndefOr[Routing] = js.undefined
  
  var scroll: js.UndefOr[Duration] = js.undefined
  
  var search_type: js.UndefOr[SearchType] = js.undefined
  
  var suggest_field: js.UndefOr[Field] = js.undefined
  
  var suggest_mode: js.UndefOr[SuggestMode] = js.undefined
  
  var suggest_size: js.UndefOr[long] = js.undefined
  
  var suggest_text: js.UndefOr[String] = js.undefined
  
  var typed_keys: js.UndefOr[Boolean] = js.undefined
  
  var wait_for_checkpoints: js.UndefOr[js.Array[FleetCheckpoint]] = js.undefined
}
object FleetSearchRequest {
  
  inline def apply(index: IndexName | IndexAlias): FleetSearchRequest = {
    val __obj = js.Dynamic.literal(index = index.asInstanceOf[js.Any])
    __obj.asInstanceOf[FleetSearchRequest]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: FleetSearchRequest] (val x: Self) extends AnyVal {
    
    inline def setAllow_no_indices(value: Boolean): Self = StObject.set(x, "allow_no_indices", value.asInstanceOf[js.Any])
    
    inline def setAllow_no_indicesUndefined: Self = StObject.set(x, "allow_no_indices", js.undefined)
    
    inline def setAllow_partial_search_results(value: Boolean): Self = StObject.set(x, "allow_partial_search_results", value.asInstanceOf[js.Any])
    
    inline def setAllow_partial_search_resultsUndefined: Self = StObject.set(x, "allow_partial_search_results", js.undefined)
    
    inline def setAnalyze_wildcard(value: Boolean): Self = StObject.set(x, "analyze_wildcard", value.asInstanceOf[js.Any])
    
    inline def setAnalyze_wildcardUndefined: Self = StObject.set(x, "analyze_wildcard", js.undefined)
    
    inline def setAnalyzer(value: String): Self = StObject.set(x, "analyzer", value.asInstanceOf[js.Any])
    
    inline def setAnalyzerUndefined: Self = StObject.set(x, "analyzer", js.undefined)
    
    inline def setBatched_reduce_size(value: long): Self = StObject.set(x, "batched_reduce_size", value.asInstanceOf[js.Any])
    
    inline def setBatched_reduce_sizeUndefined: Self = StObject.set(x, "batched_reduce_size", js.undefined)
    
    inline def setBody(value: Collapse): Self = StObject.set(x, "body", value.asInstanceOf[js.Any])
    
    inline def setBodyUndefined: Self = StObject.set(x, "body", js.undefined)
    
    inline def setCcs_minimize_roundtrips(value: Boolean): Self = StObject.set(x, "ccs_minimize_roundtrips", value.asInstanceOf[js.Any])
    
    inline def setCcs_minimize_roundtripsUndefined: Self = StObject.set(x, "ccs_minimize_roundtrips", js.undefined)
    
    inline def setDefault_operator(value: QueryDslOperator): Self = StObject.set(x, "default_operator", value.asInstanceOf[js.Any])
    
    inline def setDefault_operatorUndefined: Self = StObject.set(x, "default_operator", js.undefined)
    
    inline def setDf(value: String): Self = StObject.set(x, "df", value.asInstanceOf[js.Any])
    
    inline def setDfUndefined: Self = StObject.set(x, "df", js.undefined)
    
    inline def setExpand_wildcards(value: ExpandWildcards): Self = StObject.set(x, "expand_wildcards", value.asInstanceOf[js.Any])
    
    inline def setExpand_wildcardsUndefined: Self = StObject.set(x, "expand_wildcards", js.undefined)
    
    inline def setExpand_wildcardsVarargs(value: ExpandWildcard*): Self = StObject.set(x, "expand_wildcards", js.Array(value*))
    
    inline def setIgnore_throttled(value: Boolean): Self = StObject.set(x, "ignore_throttled", value.asInstanceOf[js.Any])
    
    inline def setIgnore_throttledUndefined: Self = StObject.set(x, "ignore_throttled", js.undefined)
    
    inline def setIgnore_unavailable(value: Boolean): Self = StObject.set(x, "ignore_unavailable", value.asInstanceOf[js.Any])
    
    inline def setIgnore_unavailableUndefined: Self = StObject.set(x, "ignore_unavailable", js.undefined)
    
    inline def setIndex(value: IndexName | IndexAlias): Self = StObject.set(x, "index", value.asInstanceOf[js.Any])
    
    inline def setLenient(value: Boolean): Self = StObject.set(x, "lenient", value.asInstanceOf[js.Any])
    
    inline def setLenientUndefined: Self = StObject.set(x, "lenient", js.undefined)
    
    inline def setMax_concurrent_shard_requests(value: long): Self = StObject.set(x, "max_concurrent_shard_requests", value.asInstanceOf[js.Any])
    
    inline def setMax_concurrent_shard_requestsUndefined: Self = StObject.set(x, "max_concurrent_shard_requests", js.undefined)
    
    inline def setMin_compatible_shard_node(value: VersionString): Self = StObject.set(x, "min_compatible_shard_node", value.asInstanceOf[js.Any])
    
    inline def setMin_compatible_shard_nodeUndefined: Self = StObject.set(x, "min_compatible_shard_node", js.undefined)
    
    inline def setPre_filter_shard_size(value: long): Self = StObject.set(x, "pre_filter_shard_size", value.asInstanceOf[js.Any])
    
    inline def setPre_filter_shard_sizeUndefined: Self = StObject.set(x, "pre_filter_shard_size", js.undefined)
    
    inline def setPreference(value: String): Self = StObject.set(x, "preference", value.asInstanceOf[js.Any])
    
    inline def setPreferenceUndefined: Self = StObject.set(x, "preference", js.undefined)
    
    inline def setQ(value: String): Self = StObject.set(x, "q", value.asInstanceOf[js.Any])
    
    inline def setQUndefined: Self = StObject.set(x, "q", js.undefined)
    
    inline def setRequest_cache(value: Boolean): Self = StObject.set(x, "request_cache", value.asInstanceOf[js.Any])
    
    inline def setRequest_cacheUndefined: Self = StObject.set(x, "request_cache", js.undefined)
    
    inline def setRest_total_hits_as_int(value: Boolean): Self = StObject.set(x, "rest_total_hits_as_int", value.asInstanceOf[js.Any])
    
    inline def setRest_total_hits_as_intUndefined: Self = StObject.set(x, "rest_total_hits_as_int", js.undefined)
    
    inline def setRouting(value: Routing): Self = StObject.set(x, "routing", value.asInstanceOf[js.Any])
    
    inline def setRoutingUndefined: Self = StObject.set(x, "routing", js.undefined)
    
    inline def setScroll(value: Duration): Self = StObject.set(x, "scroll", value.asInstanceOf[js.Any])
    
    inline def setScrollUndefined: Self = StObject.set(x, "scroll", js.undefined)
    
    inline def setSearch_type(value: SearchType): Self = StObject.set(x, "search_type", value.asInstanceOf[js.Any])
    
    inline def setSearch_typeUndefined: Self = StObject.set(x, "search_type", js.undefined)
    
    inline def setSuggest_field(value: Field): Self = StObject.set(x, "suggest_field", value.asInstanceOf[js.Any])
    
    inline def setSuggest_fieldUndefined: Self = StObject.set(x, "suggest_field", js.undefined)
    
    inline def setSuggest_mode(value: SuggestMode): Self = StObject.set(x, "suggest_mode", value.asInstanceOf[js.Any])
    
    inline def setSuggest_modeUndefined: Self = StObject.set(x, "suggest_mode", js.undefined)
    
    inline def setSuggest_size(value: long): Self = StObject.set(x, "suggest_size", value.asInstanceOf[js.Any])
    
    inline def setSuggest_sizeUndefined: Self = StObject.set(x, "suggest_size", js.undefined)
    
    inline def setSuggest_text(value: String): Self = StObject.set(x, "suggest_text", value.asInstanceOf[js.Any])
    
    inline def setSuggest_textUndefined: Self = StObject.set(x, "suggest_text", js.undefined)
    
    inline def setTyped_keys(value: Boolean): Self = StObject.set(x, "typed_keys", value.asInstanceOf[js.Any])
    
    inline def setTyped_keysUndefined: Self = StObject.set(x, "typed_keys", js.undefined)
    
    inline def setWait_for_checkpoints(value: js.Array[FleetCheckpoint]): Self = StObject.set(x, "wait_for_checkpoints", value.asInstanceOf[js.Any])
    
    inline def setWait_for_checkpointsUndefined: Self = StObject.set(x, "wait_for_checkpoints", js.undefined)
    
    inline def setWait_for_checkpointsVarargs(value: FleetCheckpoint*): Self = StObject.set(x, "wait_for_checkpoints", js.Array(value*))
    
    inline def set_source_excludes(value: Fields): Self = StObject.set(x, "_source_excludes", value.asInstanceOf[js.Any])
    
    inline def set_source_excludesUndefined: Self = StObject.set(x, "_source_excludes", js.undefined)
    
    inline def set_source_excludesVarargs(value: Field*): Self = StObject.set(x, "_source_excludes", js.Array(value*))
    
    inline def set_source_includes(value: Fields): Self = StObject.set(x, "_source_includes", value.asInstanceOf[js.Any])
    
    inline def set_source_includesUndefined: Self = StObject.set(x, "_source_includes", js.undefined)
    
    inline def set_source_includesVarargs(value: Field*): Self = StObject.set(x, "_source_includes", js.Array(value*))
  }
}
