package typings.elasticElasticsearch.requestParamsMod

import typings.elasticElasticsearch.elasticElasticsearchStrings.AND
import typings.elasticElasticsearch.elasticElasticsearchStrings.OR
import typings.elasticElasticsearch.elasticElasticsearchStrings.all
import typings.elasticElasticsearch.elasticElasticsearchStrings.always
import typings.elasticElasticsearch.elasticElasticsearchStrings.closed
import typings.elasticElasticsearch.elasticElasticsearchStrings.dfs_query_then_fetch
import typings.elasticElasticsearch.elasticElasticsearchStrings.hidden
import typings.elasticElasticsearch.elasticElasticsearchStrings.missing
import typings.elasticElasticsearch.elasticElasticsearchStrings.none
import typings.elasticElasticsearch.elasticElasticsearchStrings.open
import typings.elasticElasticsearch.elasticElasticsearchStrings.popular
import typings.elasticElasticsearch.elasticElasticsearchStrings.query_then_fetch
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AsyncSearchSubmit[T]
  extends StObject
     with Generic {
  
  var _source: js.UndefOr[String | js.Array[String]] = js.undefined
  
  var _source_exclude: js.UndefOr[String | js.Array[String]] = js.undefined
  
  var _source_excludes: js.UndefOr[String | js.Array[String]] = js.undefined
  
  var _source_include: js.UndefOr[String | js.Array[String]] = js.undefined
  
  var _source_includes: js.UndefOr[String | js.Array[String]] = js.undefined
  
  var allow_no_indices: js.UndefOr[Boolean] = js.undefined
  
  var allow_partial_search_results: js.UndefOr[Boolean] = js.undefined
  
  var analyze_wildcard: js.UndefOr[Boolean] = js.undefined
  
  var analyzer: js.UndefOr[String] = js.undefined
  
  var batched_reduce_size: js.UndefOr[Double] = js.undefined
  
  var body: js.UndefOr[T] = js.undefined
  
  var default_operator: js.UndefOr[AND | OR] = js.undefined
  
  var df: js.UndefOr[String] = js.undefined
  
  var docvalue_fields: js.UndefOr[String | js.Array[String]] = js.undefined
  
  var expand_wildcards: js.UndefOr[open | closed | hidden | none | all] = js.undefined
  
  var explain: js.UndefOr[Boolean] = js.undefined
  
  var from: js.UndefOr[Double] = js.undefined
  
  var ignore_throttled: js.UndefOr[Boolean] = js.undefined
  
  var ignore_unavailable: js.UndefOr[Boolean] = js.undefined
  
  var index: js.UndefOr[String | js.Array[String]] = js.undefined
  
  var keep_alive: js.UndefOr[String] = js.undefined
  
  var keep_on_completion: js.UndefOr[Boolean] = js.undefined
  
  var lenient: js.UndefOr[Boolean] = js.undefined
  
  var max_concurrent_shard_requests: js.UndefOr[Double] = js.undefined
  
  var preference: js.UndefOr[String] = js.undefined
  
  var q: js.UndefOr[String] = js.undefined
  
  var request_cache: js.UndefOr[Boolean] = js.undefined
  
  var routing: js.UndefOr[String | js.Array[String]] = js.undefined
  
  var search_type: js.UndefOr[query_then_fetch | dfs_query_then_fetch] = js.undefined
  
  var seq_no_primary_term: js.UndefOr[Boolean] = js.undefined
  
  var size: js.UndefOr[Double] = js.undefined
  
  var sort: js.UndefOr[String | js.Array[String]] = js.undefined
  
  var stats: js.UndefOr[String | js.Array[String]] = js.undefined
  
  var stored_fields: js.UndefOr[String | js.Array[String]] = js.undefined
  
  var suggest_field: js.UndefOr[String] = js.undefined
  
  var suggest_mode: js.UndefOr[missing | popular | always] = js.undefined
  
  var suggest_size: js.UndefOr[Double] = js.undefined
  
  var suggest_text: js.UndefOr[String] = js.undefined
  
  var terminate_after: js.UndefOr[Double] = js.undefined
  
  var timeout: js.UndefOr[String] = js.undefined
  
  var track_scores: js.UndefOr[Boolean] = js.undefined
  
  var track_total_hits: js.UndefOr[Boolean] = js.undefined
  
  var typed_keys: js.UndefOr[Boolean] = js.undefined
  
  var version: js.UndefOr[Boolean] = js.undefined
  
  var wait_for_completion_timeout: js.UndefOr[String] = js.undefined
}
object AsyncSearchSubmit {
  
  @scala.inline
  def apply[T](): AsyncSearchSubmit[T] = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AsyncSearchSubmit[T]]
  }
  
  @scala.inline
  implicit class AsyncSearchSubmitMutableBuilder[Self <: AsyncSearchSubmit[?], T] (val x: Self & AsyncSearchSubmit[T]) extends AnyVal {
    
    @scala.inline
    def setAllow_no_indices(value: Boolean): Self = StObject.set(x, "allow_no_indices", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAllow_no_indicesUndefined: Self = StObject.set(x, "allow_no_indices", js.undefined)
    
    @scala.inline
    def setAllow_partial_search_results(value: Boolean): Self = StObject.set(x, "allow_partial_search_results", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAllow_partial_search_resultsUndefined: Self = StObject.set(x, "allow_partial_search_results", js.undefined)
    
    @scala.inline
    def setAnalyze_wildcard(value: Boolean): Self = StObject.set(x, "analyze_wildcard", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAnalyze_wildcardUndefined: Self = StObject.set(x, "analyze_wildcard", js.undefined)
    
    @scala.inline
    def setAnalyzer(value: String): Self = StObject.set(x, "analyzer", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAnalyzerUndefined: Self = StObject.set(x, "analyzer", js.undefined)
    
    @scala.inline
    def setBatched_reduce_size(value: Double): Self = StObject.set(x, "batched_reduce_size", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBatched_reduce_sizeUndefined: Self = StObject.set(x, "batched_reduce_size", js.undefined)
    
    @scala.inline
    def setBody(value: T): Self = StObject.set(x, "body", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBodyUndefined: Self = StObject.set(x, "body", js.undefined)
    
    @scala.inline
    def setDefault_operator(value: AND | OR): Self = StObject.set(x, "default_operator", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDefault_operatorUndefined: Self = StObject.set(x, "default_operator", js.undefined)
    
    @scala.inline
    def setDf(value: String): Self = StObject.set(x, "df", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDfUndefined: Self = StObject.set(x, "df", js.undefined)
    
    @scala.inline
    def setDocvalue_fields(value: String | js.Array[String]): Self = StObject.set(x, "docvalue_fields", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDocvalue_fieldsUndefined: Self = StObject.set(x, "docvalue_fields", js.undefined)
    
    @scala.inline
    def setDocvalue_fieldsVarargs(value: String*): Self = StObject.set(x, "docvalue_fields", js.Array(value :_*))
    
    @scala.inline
    def setExpand_wildcards(value: open | closed | hidden | none | all): Self = StObject.set(x, "expand_wildcards", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setExpand_wildcardsUndefined: Self = StObject.set(x, "expand_wildcards", js.undefined)
    
    @scala.inline
    def setExplain(value: Boolean): Self = StObject.set(x, "explain", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setExplainUndefined: Self = StObject.set(x, "explain", js.undefined)
    
    @scala.inline
    def setFrom(value: Double): Self = StObject.set(x, "from", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFromUndefined: Self = StObject.set(x, "from", js.undefined)
    
    @scala.inline
    def setIgnore_throttled(value: Boolean): Self = StObject.set(x, "ignore_throttled", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIgnore_throttledUndefined: Self = StObject.set(x, "ignore_throttled", js.undefined)
    
    @scala.inline
    def setIgnore_unavailable(value: Boolean): Self = StObject.set(x, "ignore_unavailable", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIgnore_unavailableUndefined: Self = StObject.set(x, "ignore_unavailable", js.undefined)
    
    @scala.inline
    def setIndex(value: String | js.Array[String]): Self = StObject.set(x, "index", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIndexUndefined: Self = StObject.set(x, "index", js.undefined)
    
    @scala.inline
    def setIndexVarargs(value: String*): Self = StObject.set(x, "index", js.Array(value :_*))
    
    @scala.inline
    def setKeep_alive(value: String): Self = StObject.set(x, "keep_alive", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setKeep_aliveUndefined: Self = StObject.set(x, "keep_alive", js.undefined)
    
    @scala.inline
    def setKeep_on_completion(value: Boolean): Self = StObject.set(x, "keep_on_completion", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setKeep_on_completionUndefined: Self = StObject.set(x, "keep_on_completion", js.undefined)
    
    @scala.inline
    def setLenient(value: Boolean): Self = StObject.set(x, "lenient", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLenientUndefined: Self = StObject.set(x, "lenient", js.undefined)
    
    @scala.inline
    def setMax_concurrent_shard_requests(value: Double): Self = StObject.set(x, "max_concurrent_shard_requests", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMax_concurrent_shard_requestsUndefined: Self = StObject.set(x, "max_concurrent_shard_requests", js.undefined)
    
    @scala.inline
    def setPreference(value: String): Self = StObject.set(x, "preference", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPreferenceUndefined: Self = StObject.set(x, "preference", js.undefined)
    
    @scala.inline
    def setQ(value: String): Self = StObject.set(x, "q", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setQUndefined: Self = StObject.set(x, "q", js.undefined)
    
    @scala.inline
    def setRequest_cache(value: Boolean): Self = StObject.set(x, "request_cache", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRequest_cacheUndefined: Self = StObject.set(x, "request_cache", js.undefined)
    
    @scala.inline
    def setRouting(value: String | js.Array[String]): Self = StObject.set(x, "routing", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRoutingUndefined: Self = StObject.set(x, "routing", js.undefined)
    
    @scala.inline
    def setRoutingVarargs(value: String*): Self = StObject.set(x, "routing", js.Array(value :_*))
    
    @scala.inline
    def setSearch_type(value: query_then_fetch | dfs_query_then_fetch): Self = StObject.set(x, "search_type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSearch_typeUndefined: Self = StObject.set(x, "search_type", js.undefined)
    
    @scala.inline
    def setSeq_no_primary_term(value: Boolean): Self = StObject.set(x, "seq_no_primary_term", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSeq_no_primary_termUndefined: Self = StObject.set(x, "seq_no_primary_term", js.undefined)
    
    @scala.inline
    def setSize(value: Double): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSizeUndefined: Self = StObject.set(x, "size", js.undefined)
    
    @scala.inline
    def setSort(value: String | js.Array[String]): Self = StObject.set(x, "sort", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSortUndefined: Self = StObject.set(x, "sort", js.undefined)
    
    @scala.inline
    def setSortVarargs(value: String*): Self = StObject.set(x, "sort", js.Array(value :_*))
    
    @scala.inline
    def setStats(value: String | js.Array[String]): Self = StObject.set(x, "stats", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStatsUndefined: Self = StObject.set(x, "stats", js.undefined)
    
    @scala.inline
    def setStatsVarargs(value: String*): Self = StObject.set(x, "stats", js.Array(value :_*))
    
    @scala.inline
    def setStored_fields(value: String | js.Array[String]): Self = StObject.set(x, "stored_fields", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStored_fieldsUndefined: Self = StObject.set(x, "stored_fields", js.undefined)
    
    @scala.inline
    def setStored_fieldsVarargs(value: String*): Self = StObject.set(x, "stored_fields", js.Array(value :_*))
    
    @scala.inline
    def setSuggest_field(value: String): Self = StObject.set(x, "suggest_field", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSuggest_fieldUndefined: Self = StObject.set(x, "suggest_field", js.undefined)
    
    @scala.inline
    def setSuggest_mode(value: missing | popular | always): Self = StObject.set(x, "suggest_mode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSuggest_modeUndefined: Self = StObject.set(x, "suggest_mode", js.undefined)
    
    @scala.inline
    def setSuggest_size(value: Double): Self = StObject.set(x, "suggest_size", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSuggest_sizeUndefined: Self = StObject.set(x, "suggest_size", js.undefined)
    
    @scala.inline
    def setSuggest_text(value: String): Self = StObject.set(x, "suggest_text", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSuggest_textUndefined: Self = StObject.set(x, "suggest_text", js.undefined)
    
    @scala.inline
    def setTerminate_after(value: Double): Self = StObject.set(x, "terminate_after", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTerminate_afterUndefined: Self = StObject.set(x, "terminate_after", js.undefined)
    
    @scala.inline
    def setTimeout(value: String): Self = StObject.set(x, "timeout", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTimeoutUndefined: Self = StObject.set(x, "timeout", js.undefined)
    
    @scala.inline
    def setTrack_scores(value: Boolean): Self = StObject.set(x, "track_scores", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTrack_scoresUndefined: Self = StObject.set(x, "track_scores", js.undefined)
    
    @scala.inline
    def setTrack_total_hits(value: Boolean): Self = StObject.set(x, "track_total_hits", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTrack_total_hitsUndefined: Self = StObject.set(x, "track_total_hits", js.undefined)
    
    @scala.inline
    def setTyped_keys(value: Boolean): Self = StObject.set(x, "typed_keys", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTyped_keysUndefined: Self = StObject.set(x, "typed_keys", js.undefined)
    
    @scala.inline
    def setVersion(value: Boolean): Self = StObject.set(x, "version", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setVersionUndefined: Self = StObject.set(x, "version", js.undefined)
    
    @scala.inline
    def setWait_for_completion_timeout(value: String): Self = StObject.set(x, "wait_for_completion_timeout", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWait_for_completion_timeoutUndefined: Self = StObject.set(x, "wait_for_completion_timeout", js.undefined)
    
    @scala.inline
    def set_source(value: String | js.Array[String]): Self = StObject.set(x, "_source", value.asInstanceOf[js.Any])
    
    @scala.inline
    def set_sourceUndefined: Self = StObject.set(x, "_source", js.undefined)
    
    @scala.inline
    def set_sourceVarargs(value: String*): Self = StObject.set(x, "_source", js.Array(value :_*))
    
    @scala.inline
    def set_source_exclude(value: String | js.Array[String]): Self = StObject.set(x, "_source_exclude", value.asInstanceOf[js.Any])
    
    @scala.inline
    def set_source_excludeUndefined: Self = StObject.set(x, "_source_exclude", js.undefined)
    
    @scala.inline
    def set_source_excludeVarargs(value: String*): Self = StObject.set(x, "_source_exclude", js.Array(value :_*))
    
    @scala.inline
    def set_source_excludes(value: String | js.Array[String]): Self = StObject.set(x, "_source_excludes", value.asInstanceOf[js.Any])
    
    @scala.inline
    def set_source_excludesUndefined: Self = StObject.set(x, "_source_excludes", js.undefined)
    
    @scala.inline
    def set_source_excludesVarargs(value: String*): Self = StObject.set(x, "_source_excludes", js.Array(value :_*))
    
    @scala.inline
    def set_source_include(value: String | js.Array[String]): Self = StObject.set(x, "_source_include", value.asInstanceOf[js.Any])
    
    @scala.inline
    def set_source_includeUndefined: Self = StObject.set(x, "_source_include", js.undefined)
    
    @scala.inline
    def set_source_includeVarargs(value: String*): Self = StObject.set(x, "_source_include", js.Array(value :_*))
    
    @scala.inline
    def set_source_includes(value: String | js.Array[String]): Self = StObject.set(x, "_source_includes", value.asInstanceOf[js.Any])
    
    @scala.inline
    def set_source_includesUndefined: Self = StObject.set(x, "_source_includes", js.undefined)
    
    @scala.inline
    def set_source_includesVarargs(value: String*): Self = StObject.set(x, "_source_includes", js.Array(value :_*))
  }
}
