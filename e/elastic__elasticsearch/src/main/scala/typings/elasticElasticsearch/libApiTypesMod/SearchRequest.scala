package typings.elasticElasticsearch.libApiTypesMod

import typings.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SearchRequest
  extends StObject
     with SpecUtilsCommonQueryParameters {
  
  var _source: js.UndefOr[SearchSourceConfig] = js.undefined
  
  var _source_excludes: js.UndefOr[Fields] = js.undefined
  
  var _source_includes: js.UndefOr[Fields] = js.undefined
  
  var aggregations: js.UndefOr[Record[String, AggregationsAggregationContainer]] = js.undefined
  
  var aggs: js.UndefOr[Record[String, AggregationsAggregationContainer]] = js.undefined
  
  var allow_no_indices: js.UndefOr[Boolean] = js.undefined
  
  var allow_partial_search_results: js.UndefOr[Boolean] = js.undefined
  
  var analyze_wildcard: js.UndefOr[Boolean] = js.undefined
  
  var analyzer: js.UndefOr[String] = js.undefined
  
  var batched_reduce_size: js.UndefOr[long] = js.undefined
  
  var ccs_minimize_roundtrips: js.UndefOr[Boolean] = js.undefined
  
  var collapse: js.UndefOr[SearchFieldCollapse] = js.undefined
  
  var default_operator: js.UndefOr[QueryDslOperator] = js.undefined
  
  var df: js.UndefOr[String] = js.undefined
  
  var docvalue_fields: js.UndefOr[js.Array[QueryDslFieldAndFormat | Field]] = js.undefined
  
  var expand_wildcards: js.UndefOr[ExpandWildcards] = js.undefined
  
  var explain: js.UndefOr[Boolean] = js.undefined
  
  var ext: js.UndefOr[Record[String, Any]] = js.undefined
  
  var fields: js.UndefOr[js.Array[QueryDslFieldAndFormat | Field]] = js.undefined
  
  var from: js.UndefOr[integer] = js.undefined
  
  var highlight: js.UndefOr[SearchHighlight] = js.undefined
  
  var ignore_throttled: js.UndefOr[Boolean] = js.undefined
  
  var ignore_unavailable: js.UndefOr[Boolean] = js.undefined
  
  var index: js.UndefOr[Indices] = js.undefined
  
  var indices_boost: js.UndefOr[js.Array[Record[IndexName, double]]] = js.undefined
  
  var knn: js.UndefOr[KnnQuery] = js.undefined
  
  var lenient: js.UndefOr[Boolean] = js.undefined
  
  var max_concurrent_shard_requests: js.UndefOr[long] = js.undefined
  
  var min_compatible_shard_node: js.UndefOr[VersionString] = js.undefined
  
  var min_score: js.UndefOr[double] = js.undefined
  
  var pit: js.UndefOr[SearchPointInTimeReference] = js.undefined
  
  var post_filter: js.UndefOr[QueryDslQueryContainer] = js.undefined
  
  var pre_filter_shard_size: js.UndefOr[long] = js.undefined
  
  var preference: js.UndefOr[String] = js.undefined
  
  var profile: js.UndefOr[Boolean] = js.undefined
  
  var q: js.UndefOr[String] = js.undefined
  
  var query: js.UndefOr[QueryDslQueryContainer] = js.undefined
  
  var request_cache: js.UndefOr[Boolean] = js.undefined
  
  var rescore: js.UndefOr[SearchRescore | js.Array[SearchRescore]] = js.undefined
  
  var rest_total_hits_as_int: js.UndefOr[Boolean] = js.undefined
  
  var routing: js.UndefOr[Routing] = js.undefined
  
  var runtime_mappings: js.UndefOr[MappingRuntimeFields] = js.undefined
  
  var script_fields: js.UndefOr[Record[String, ScriptField]] = js.undefined
  
  var scroll: js.UndefOr[Duration] = js.undefined
  
  var search_after: js.UndefOr[SortResults] = js.undefined
  
  var search_type: js.UndefOr[SearchType] = js.undefined
  
  var seq_no_primary_term: js.UndefOr[Boolean] = js.undefined
  
  var size: js.UndefOr[integer] = js.undefined
  
  var slice: js.UndefOr[SlicedScroll] = js.undefined
  
  var sort: js.UndefOr[Sort] = js.undefined
  
  var stats: js.UndefOr[js.Array[String]] = js.undefined
  
  var stored_fields: js.UndefOr[Fields] = js.undefined
  
  var suggest: js.UndefOr[SearchSuggester] = js.undefined
  
  var suggest_field: js.UndefOr[Field] = js.undefined
  
  var suggest_mode: js.UndefOr[SuggestMode] = js.undefined
  
  var suggest_size: js.UndefOr[long] = js.undefined
  
  var suggest_text: js.UndefOr[String] = js.undefined
  
  var terminate_after: js.UndefOr[long] = js.undefined
  
  var timeout: js.UndefOr[String] = js.undefined
  
  var track_scores: js.UndefOr[Boolean] = js.undefined
  
  var track_total_hits: js.UndefOr[SearchTrackHits] = js.undefined
  
  var typed_keys: js.UndefOr[Boolean] = js.undefined
  
  var version: js.UndefOr[Boolean] = js.undefined
}
object SearchRequest {
  
  inline def apply(): SearchRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SearchRequest]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: SearchRequest] (val x: Self) extends AnyVal {
    
    inline def setAggregations(value: Record[String, AggregationsAggregationContainer]): Self = StObject.set(x, "aggregations", value.asInstanceOf[js.Any])
    
    inline def setAggregationsUndefined: Self = StObject.set(x, "aggregations", js.undefined)
    
    inline def setAggs(value: Record[String, AggregationsAggregationContainer]): Self = StObject.set(x, "aggs", value.asInstanceOf[js.Any])
    
    inline def setAggsUndefined: Self = StObject.set(x, "aggs", js.undefined)
    
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
    
    inline def setCcs_minimize_roundtrips(value: Boolean): Self = StObject.set(x, "ccs_minimize_roundtrips", value.asInstanceOf[js.Any])
    
    inline def setCcs_minimize_roundtripsUndefined: Self = StObject.set(x, "ccs_minimize_roundtrips", js.undefined)
    
    inline def setCollapse(value: SearchFieldCollapse): Self = StObject.set(x, "collapse", value.asInstanceOf[js.Any])
    
    inline def setCollapseUndefined: Self = StObject.set(x, "collapse", js.undefined)
    
    inline def setDefault_operator(value: QueryDslOperator): Self = StObject.set(x, "default_operator", value.asInstanceOf[js.Any])
    
    inline def setDefault_operatorUndefined: Self = StObject.set(x, "default_operator", js.undefined)
    
    inline def setDf(value: String): Self = StObject.set(x, "df", value.asInstanceOf[js.Any])
    
    inline def setDfUndefined: Self = StObject.set(x, "df", js.undefined)
    
    inline def setDocvalue_fields(value: js.Array[QueryDslFieldAndFormat | Field]): Self = StObject.set(x, "docvalue_fields", value.asInstanceOf[js.Any])
    
    inline def setDocvalue_fieldsUndefined: Self = StObject.set(x, "docvalue_fields", js.undefined)
    
    inline def setDocvalue_fieldsVarargs(value: (QueryDslFieldAndFormat | Field)*): Self = StObject.set(x, "docvalue_fields", js.Array(value*))
    
    inline def setExpand_wildcards(value: ExpandWildcards): Self = StObject.set(x, "expand_wildcards", value.asInstanceOf[js.Any])
    
    inline def setExpand_wildcardsUndefined: Self = StObject.set(x, "expand_wildcards", js.undefined)
    
    inline def setExpand_wildcardsVarargs(value: ExpandWildcard*): Self = StObject.set(x, "expand_wildcards", js.Array(value*))
    
    inline def setExplain(value: Boolean): Self = StObject.set(x, "explain", value.asInstanceOf[js.Any])
    
    inline def setExplainUndefined: Self = StObject.set(x, "explain", js.undefined)
    
    inline def setExt(value: Record[String, Any]): Self = StObject.set(x, "ext", value.asInstanceOf[js.Any])
    
    inline def setExtUndefined: Self = StObject.set(x, "ext", js.undefined)
    
    inline def setFields(value: js.Array[QueryDslFieldAndFormat | Field]): Self = StObject.set(x, "fields", value.asInstanceOf[js.Any])
    
    inline def setFieldsUndefined: Self = StObject.set(x, "fields", js.undefined)
    
    inline def setFieldsVarargs(value: (QueryDslFieldAndFormat | Field)*): Self = StObject.set(x, "fields", js.Array(value*))
    
    inline def setFrom(value: integer): Self = StObject.set(x, "from", value.asInstanceOf[js.Any])
    
    inline def setFromUndefined: Self = StObject.set(x, "from", js.undefined)
    
    inline def setHighlight(value: SearchHighlight): Self = StObject.set(x, "highlight", value.asInstanceOf[js.Any])
    
    inline def setHighlightUndefined: Self = StObject.set(x, "highlight", js.undefined)
    
    inline def setIgnore_throttled(value: Boolean): Self = StObject.set(x, "ignore_throttled", value.asInstanceOf[js.Any])
    
    inline def setIgnore_throttledUndefined: Self = StObject.set(x, "ignore_throttled", js.undefined)
    
    inline def setIgnore_unavailable(value: Boolean): Self = StObject.set(x, "ignore_unavailable", value.asInstanceOf[js.Any])
    
    inline def setIgnore_unavailableUndefined: Self = StObject.set(x, "ignore_unavailable", js.undefined)
    
    inline def setIndex(value: Indices): Self = StObject.set(x, "index", value.asInstanceOf[js.Any])
    
    inline def setIndexUndefined: Self = StObject.set(x, "index", js.undefined)
    
    inline def setIndexVarargs(value: IndexName*): Self = StObject.set(x, "index", js.Array(value*))
    
    inline def setIndices_boost(value: js.Array[Record[IndexName, double]]): Self = StObject.set(x, "indices_boost", value.asInstanceOf[js.Any])
    
    inline def setIndices_boostUndefined: Self = StObject.set(x, "indices_boost", js.undefined)
    
    inline def setIndices_boostVarargs(value: (Record[IndexName, double])*): Self = StObject.set(x, "indices_boost", js.Array(value*))
    
    inline def setKnn(value: KnnQuery): Self = StObject.set(x, "knn", value.asInstanceOf[js.Any])
    
    inline def setKnnUndefined: Self = StObject.set(x, "knn", js.undefined)
    
    inline def setLenient(value: Boolean): Self = StObject.set(x, "lenient", value.asInstanceOf[js.Any])
    
    inline def setLenientUndefined: Self = StObject.set(x, "lenient", js.undefined)
    
    inline def setMax_concurrent_shard_requests(value: long): Self = StObject.set(x, "max_concurrent_shard_requests", value.asInstanceOf[js.Any])
    
    inline def setMax_concurrent_shard_requestsUndefined: Self = StObject.set(x, "max_concurrent_shard_requests", js.undefined)
    
    inline def setMin_compatible_shard_node(value: VersionString): Self = StObject.set(x, "min_compatible_shard_node", value.asInstanceOf[js.Any])
    
    inline def setMin_compatible_shard_nodeUndefined: Self = StObject.set(x, "min_compatible_shard_node", js.undefined)
    
    inline def setMin_score(value: double): Self = StObject.set(x, "min_score", value.asInstanceOf[js.Any])
    
    inline def setMin_scoreUndefined: Self = StObject.set(x, "min_score", js.undefined)
    
    inline def setPit(value: SearchPointInTimeReference): Self = StObject.set(x, "pit", value.asInstanceOf[js.Any])
    
    inline def setPitUndefined: Self = StObject.set(x, "pit", js.undefined)
    
    inline def setPost_filter(value: QueryDslQueryContainer): Self = StObject.set(x, "post_filter", value.asInstanceOf[js.Any])
    
    inline def setPost_filterUndefined: Self = StObject.set(x, "post_filter", js.undefined)
    
    inline def setPre_filter_shard_size(value: long): Self = StObject.set(x, "pre_filter_shard_size", value.asInstanceOf[js.Any])
    
    inline def setPre_filter_shard_sizeUndefined: Self = StObject.set(x, "pre_filter_shard_size", js.undefined)
    
    inline def setPreference(value: String): Self = StObject.set(x, "preference", value.asInstanceOf[js.Any])
    
    inline def setPreferenceUndefined: Self = StObject.set(x, "preference", js.undefined)
    
    inline def setProfile(value: Boolean): Self = StObject.set(x, "profile", value.asInstanceOf[js.Any])
    
    inline def setProfileUndefined: Self = StObject.set(x, "profile", js.undefined)
    
    inline def setQ(value: String): Self = StObject.set(x, "q", value.asInstanceOf[js.Any])
    
    inline def setQUndefined: Self = StObject.set(x, "q", js.undefined)
    
    inline def setQuery(value: QueryDslQueryContainer): Self = StObject.set(x, "query", value.asInstanceOf[js.Any])
    
    inline def setQueryUndefined: Self = StObject.set(x, "query", js.undefined)
    
    inline def setRequest_cache(value: Boolean): Self = StObject.set(x, "request_cache", value.asInstanceOf[js.Any])
    
    inline def setRequest_cacheUndefined: Self = StObject.set(x, "request_cache", js.undefined)
    
    inline def setRescore(value: SearchRescore | js.Array[SearchRescore]): Self = StObject.set(x, "rescore", value.asInstanceOf[js.Any])
    
    inline def setRescoreUndefined: Self = StObject.set(x, "rescore", js.undefined)
    
    inline def setRescoreVarargs(value: SearchRescore*): Self = StObject.set(x, "rescore", js.Array(value*))
    
    inline def setRest_total_hits_as_int(value: Boolean): Self = StObject.set(x, "rest_total_hits_as_int", value.asInstanceOf[js.Any])
    
    inline def setRest_total_hits_as_intUndefined: Self = StObject.set(x, "rest_total_hits_as_int", js.undefined)
    
    inline def setRouting(value: Routing): Self = StObject.set(x, "routing", value.asInstanceOf[js.Any])
    
    inline def setRoutingUndefined: Self = StObject.set(x, "routing", js.undefined)
    
    inline def setRuntime_mappings(value: MappingRuntimeFields): Self = StObject.set(x, "runtime_mappings", value.asInstanceOf[js.Any])
    
    inline def setRuntime_mappingsUndefined: Self = StObject.set(x, "runtime_mappings", js.undefined)
    
    inline def setScript_fields(value: Record[String, ScriptField]): Self = StObject.set(x, "script_fields", value.asInstanceOf[js.Any])
    
    inline def setScript_fieldsUndefined: Self = StObject.set(x, "script_fields", js.undefined)
    
    inline def setScroll(value: Duration): Self = StObject.set(x, "scroll", value.asInstanceOf[js.Any])
    
    inline def setScrollUndefined: Self = StObject.set(x, "scroll", js.undefined)
    
    inline def setSearch_after(value: SortResults): Self = StObject.set(x, "search_after", value.asInstanceOf[js.Any])
    
    inline def setSearch_afterUndefined: Self = StObject.set(x, "search_after", js.undefined)
    
    inline def setSearch_afterVarargs(value: FieldValue*): Self = StObject.set(x, "search_after", js.Array(value*))
    
    inline def setSearch_type(value: SearchType): Self = StObject.set(x, "search_type", value.asInstanceOf[js.Any])
    
    inline def setSearch_typeUndefined: Self = StObject.set(x, "search_type", js.undefined)
    
    inline def setSeq_no_primary_term(value: Boolean): Self = StObject.set(x, "seq_no_primary_term", value.asInstanceOf[js.Any])
    
    inline def setSeq_no_primary_termUndefined: Self = StObject.set(x, "seq_no_primary_term", js.undefined)
    
    inline def setSize(value: integer): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
    
    inline def setSizeUndefined: Self = StObject.set(x, "size", js.undefined)
    
    inline def setSlice(value: SlicedScroll): Self = StObject.set(x, "slice", value.asInstanceOf[js.Any])
    
    inline def setSliceUndefined: Self = StObject.set(x, "slice", js.undefined)
    
    inline def setSort(value: Sort): Self = StObject.set(x, "sort", value.asInstanceOf[js.Any])
    
    inline def setSortUndefined: Self = StObject.set(x, "sort", js.undefined)
    
    inline def setSortVarargs(value: SortCombinations*): Self = StObject.set(x, "sort", js.Array(value*))
    
    inline def setStats(value: js.Array[String]): Self = StObject.set(x, "stats", value.asInstanceOf[js.Any])
    
    inline def setStatsUndefined: Self = StObject.set(x, "stats", js.undefined)
    
    inline def setStatsVarargs(value: String*): Self = StObject.set(x, "stats", js.Array(value*))
    
    inline def setStored_fields(value: Fields): Self = StObject.set(x, "stored_fields", value.asInstanceOf[js.Any])
    
    inline def setStored_fieldsUndefined: Self = StObject.set(x, "stored_fields", js.undefined)
    
    inline def setStored_fieldsVarargs(value: Field*): Self = StObject.set(x, "stored_fields", js.Array(value*))
    
    inline def setSuggest(value: SearchSuggester): Self = StObject.set(x, "suggest", value.asInstanceOf[js.Any])
    
    inline def setSuggestUndefined: Self = StObject.set(x, "suggest", js.undefined)
    
    inline def setSuggest_field(value: Field): Self = StObject.set(x, "suggest_field", value.asInstanceOf[js.Any])
    
    inline def setSuggest_fieldUndefined: Self = StObject.set(x, "suggest_field", js.undefined)
    
    inline def setSuggest_mode(value: SuggestMode): Self = StObject.set(x, "suggest_mode", value.asInstanceOf[js.Any])
    
    inline def setSuggest_modeUndefined: Self = StObject.set(x, "suggest_mode", js.undefined)
    
    inline def setSuggest_size(value: long): Self = StObject.set(x, "suggest_size", value.asInstanceOf[js.Any])
    
    inline def setSuggest_sizeUndefined: Self = StObject.set(x, "suggest_size", js.undefined)
    
    inline def setSuggest_text(value: String): Self = StObject.set(x, "suggest_text", value.asInstanceOf[js.Any])
    
    inline def setSuggest_textUndefined: Self = StObject.set(x, "suggest_text", js.undefined)
    
    inline def setTerminate_after(value: long): Self = StObject.set(x, "terminate_after", value.asInstanceOf[js.Any])
    
    inline def setTerminate_afterUndefined: Self = StObject.set(x, "terminate_after", js.undefined)
    
    inline def setTimeout(value: String): Self = StObject.set(x, "timeout", value.asInstanceOf[js.Any])
    
    inline def setTimeoutUndefined: Self = StObject.set(x, "timeout", js.undefined)
    
    inline def setTrack_scores(value: Boolean): Self = StObject.set(x, "track_scores", value.asInstanceOf[js.Any])
    
    inline def setTrack_scoresUndefined: Self = StObject.set(x, "track_scores", js.undefined)
    
    inline def setTrack_total_hits(value: SearchTrackHits): Self = StObject.set(x, "track_total_hits", value.asInstanceOf[js.Any])
    
    inline def setTrack_total_hitsUndefined: Self = StObject.set(x, "track_total_hits", js.undefined)
    
    inline def setTyped_keys(value: Boolean): Self = StObject.set(x, "typed_keys", value.asInstanceOf[js.Any])
    
    inline def setTyped_keysUndefined: Self = StObject.set(x, "typed_keys", js.undefined)
    
    inline def setVersion(value: Boolean): Self = StObject.set(x, "version", value.asInstanceOf[js.Any])
    
    inline def setVersionUndefined: Self = StObject.set(x, "version", js.undefined)
    
    inline def set_source(value: SearchSourceConfig): Self = StObject.set(x, "_source", value.asInstanceOf[js.Any])
    
    inline def set_sourceUndefined: Self = StObject.set(x, "_source", js.undefined)
    
    inline def set_sourceVarargs(value: Field*): Self = StObject.set(x, "_source", js.Array(value*))
    
    inline def set_source_excludes(value: Fields): Self = StObject.set(x, "_source_excludes", value.asInstanceOf[js.Any])
    
    inline def set_source_excludesUndefined: Self = StObject.set(x, "_source_excludes", js.undefined)
    
    inline def set_source_excludesVarargs(value: Field*): Self = StObject.set(x, "_source_excludes", js.Array(value*))
    
    inline def set_source_includes(value: Fields): Self = StObject.set(x, "_source_includes", value.asInstanceOf[js.Any])
    
    inline def set_source_includesUndefined: Self = StObject.set(x, "_source_includes", js.undefined)
    
    inline def set_source_includesVarargs(value: Field*): Self = StObject.set(x, "_source_includes", js.Array(value*))
  }
}
