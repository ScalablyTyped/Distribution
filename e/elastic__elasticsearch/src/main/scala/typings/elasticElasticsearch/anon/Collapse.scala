package typings.elasticElasticsearch.anon

import typings.elasticElasticsearch.libApiTypesWithBodyKeyMod.AggregationsAggregationContainer
import typings.elasticElasticsearch.libApiTypesWithBodyKeyMod.Field
import typings.elasticElasticsearch.libApiTypesWithBodyKeyMod.FieldValue
import typings.elasticElasticsearch.libApiTypesWithBodyKeyMod.IndexName
import typings.elasticElasticsearch.libApiTypesWithBodyKeyMod.MappingRuntimeFields
import typings.elasticElasticsearch.libApiTypesWithBodyKeyMod.QueryDslFieldAndFormat
import typings.elasticElasticsearch.libApiTypesWithBodyKeyMod.QueryDslQueryContainer
import typings.elasticElasticsearch.libApiTypesWithBodyKeyMod.ScriptField
import typings.elasticElasticsearch.libApiTypesWithBodyKeyMod.SearchFieldCollapse
import typings.elasticElasticsearch.libApiTypesWithBodyKeyMod.SearchHighlight
import typings.elasticElasticsearch.libApiTypesWithBodyKeyMod.SearchPointInTimeReference
import typings.elasticElasticsearch.libApiTypesWithBodyKeyMod.SearchRescore
import typings.elasticElasticsearch.libApiTypesWithBodyKeyMod.SearchSourceConfig
import typings.elasticElasticsearch.libApiTypesWithBodyKeyMod.SearchSuggester
import typings.elasticElasticsearch.libApiTypesWithBodyKeyMod.SearchTrackHits
import typings.elasticElasticsearch.libApiTypesWithBodyKeyMod.SlicedScroll
import typings.elasticElasticsearch.libApiTypesWithBodyKeyMod.Sort
import typings.elasticElasticsearch.libApiTypesWithBodyKeyMod.SortCombinations
import typings.elasticElasticsearch.libApiTypesWithBodyKeyMod.SortResults
import typings.elasticElasticsearch.libApiTypesWithBodyKeyMod.double
import typings.elasticElasticsearch.libApiTypesWithBodyKeyMod.integer
import typings.elasticElasticsearch.libApiTypesWithBodyKeyMod.long
import typings.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Collapse extends StObject {
  
  var _source: js.UndefOr[SearchSourceConfig] = js.undefined
  
  var aggregations: js.UndefOr[Record[String, AggregationsAggregationContainer]] = js.undefined
  
  var aggs: js.UndefOr[Record[String, AggregationsAggregationContainer]] = js.undefined
  
  var collapse: js.UndefOr[SearchFieldCollapse] = js.undefined
  
  var docvalue_fields: js.UndefOr[js.Array[QueryDslFieldAndFormat | Field]] = js.undefined
  
  var explain: js.UndefOr[Boolean] = js.undefined
  
  var ext: js.UndefOr[Record[String, Any]] = js.undefined
  
  var fields: js.UndefOr[js.Array[QueryDslFieldAndFormat | Field]] = js.undefined
  
  var from: js.UndefOr[integer] = js.undefined
  
  var highlight: js.UndefOr[SearchHighlight] = js.undefined
  
  var indices_boost: js.UndefOr[js.Array[Record[IndexName, double]]] = js.undefined
  
  var min_score: js.UndefOr[double] = js.undefined
  
  var pit: js.UndefOr[SearchPointInTimeReference] = js.undefined
  
  var post_filter: js.UndefOr[QueryDslQueryContainer] = js.undefined
  
  var profile: js.UndefOr[Boolean] = js.undefined
  
  var query: js.UndefOr[QueryDslQueryContainer] = js.undefined
  
  var rescore: js.UndefOr[SearchRescore | js.Array[SearchRescore]] = js.undefined
  
  var runtime_mappings: js.UndefOr[MappingRuntimeFields] = js.undefined
  
  var script_fields: js.UndefOr[Record[String, ScriptField]] = js.undefined
  
  var search_after: js.UndefOr[SortResults] = js.undefined
  
  var seq_no_primary_term: js.UndefOr[Boolean] = js.undefined
  
  var size: js.UndefOr[integer] = js.undefined
  
  var slice: js.UndefOr[SlicedScroll] = js.undefined
  
  var sort: js.UndefOr[Sort] = js.undefined
  
  var stats: js.UndefOr[js.Array[String]] = js.undefined
  
  var stored_fields: js.UndefOr[typings.elasticElasticsearch.libApiTypesWithBodyKeyMod.Fields] = js.undefined
  
  var suggest: js.UndefOr[SearchSuggester] = js.undefined
  
  var terminate_after: js.UndefOr[long] = js.undefined
  
  var timeout: js.UndefOr[String] = js.undefined
  
  var track_scores: js.UndefOr[Boolean] = js.undefined
  
  var track_total_hits: js.UndefOr[SearchTrackHits] = js.undefined
  
  var version: js.UndefOr[Boolean] = js.undefined
}
object Collapse {
  
  inline def apply(): Collapse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Collapse]
  }
  
  extension [Self <: Collapse](x: Self) {
    
    inline def setAggregations(value: Record[String, AggregationsAggregationContainer]): Self = StObject.set(x, "aggregations", value.asInstanceOf[js.Any])
    
    inline def setAggregationsUndefined: Self = StObject.set(x, "aggregations", js.undefined)
    
    inline def setAggs(value: Record[String, AggregationsAggregationContainer]): Self = StObject.set(x, "aggs", value.asInstanceOf[js.Any])
    
    inline def setAggsUndefined: Self = StObject.set(x, "aggs", js.undefined)
    
    inline def setCollapse(value: SearchFieldCollapse): Self = StObject.set(x, "collapse", value.asInstanceOf[js.Any])
    
    inline def setCollapseUndefined: Self = StObject.set(x, "collapse", js.undefined)
    
    inline def setDocvalue_fields(value: js.Array[QueryDslFieldAndFormat | Field]): Self = StObject.set(x, "docvalue_fields", value.asInstanceOf[js.Any])
    
    inline def setDocvalue_fieldsUndefined: Self = StObject.set(x, "docvalue_fields", js.undefined)
    
    inline def setDocvalue_fieldsVarargs(value: (QueryDslFieldAndFormat | Field)*): Self = StObject.set(x, "docvalue_fields", js.Array(value*))
    
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
    
    inline def setIndices_boost(value: js.Array[Record[IndexName, double]]): Self = StObject.set(x, "indices_boost", value.asInstanceOf[js.Any])
    
    inline def setIndices_boostUndefined: Self = StObject.set(x, "indices_boost", js.undefined)
    
    inline def setIndices_boostVarargs(value: (Record[IndexName, double])*): Self = StObject.set(x, "indices_boost", js.Array(value*))
    
    inline def setMin_score(value: double): Self = StObject.set(x, "min_score", value.asInstanceOf[js.Any])
    
    inline def setMin_scoreUndefined: Self = StObject.set(x, "min_score", js.undefined)
    
    inline def setPit(value: SearchPointInTimeReference): Self = StObject.set(x, "pit", value.asInstanceOf[js.Any])
    
    inline def setPitUndefined: Self = StObject.set(x, "pit", js.undefined)
    
    inline def setPost_filter(value: QueryDslQueryContainer): Self = StObject.set(x, "post_filter", value.asInstanceOf[js.Any])
    
    inline def setPost_filterUndefined: Self = StObject.set(x, "post_filter", js.undefined)
    
    inline def setProfile(value: Boolean): Self = StObject.set(x, "profile", value.asInstanceOf[js.Any])
    
    inline def setProfileUndefined: Self = StObject.set(x, "profile", js.undefined)
    
    inline def setQuery(value: QueryDslQueryContainer): Self = StObject.set(x, "query", value.asInstanceOf[js.Any])
    
    inline def setQueryUndefined: Self = StObject.set(x, "query", js.undefined)
    
    inline def setRescore(value: SearchRescore | js.Array[SearchRescore]): Self = StObject.set(x, "rescore", value.asInstanceOf[js.Any])
    
    inline def setRescoreUndefined: Self = StObject.set(x, "rescore", js.undefined)
    
    inline def setRescoreVarargs(value: SearchRescore*): Self = StObject.set(x, "rescore", js.Array(value*))
    
    inline def setRuntime_mappings(value: MappingRuntimeFields): Self = StObject.set(x, "runtime_mappings", value.asInstanceOf[js.Any])
    
    inline def setRuntime_mappingsUndefined: Self = StObject.set(x, "runtime_mappings", js.undefined)
    
    inline def setScript_fields(value: Record[String, ScriptField]): Self = StObject.set(x, "script_fields", value.asInstanceOf[js.Any])
    
    inline def setScript_fieldsUndefined: Self = StObject.set(x, "script_fields", js.undefined)
    
    inline def setSearch_after(value: SortResults): Self = StObject.set(x, "search_after", value.asInstanceOf[js.Any])
    
    inline def setSearch_afterUndefined: Self = StObject.set(x, "search_after", js.undefined)
    
    inline def setSearch_afterVarargs(value: FieldValue*): Self = StObject.set(x, "search_after", js.Array(value*))
    
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
    
    inline def setStored_fields(value: typings.elasticElasticsearch.libApiTypesWithBodyKeyMod.Fields): Self = StObject.set(x, "stored_fields", value.asInstanceOf[js.Any])
    
    inline def setStored_fieldsUndefined: Self = StObject.set(x, "stored_fields", js.undefined)
    
    inline def setStored_fieldsVarargs(value: Field*): Self = StObject.set(x, "stored_fields", js.Array(value*))
    
    inline def setSuggest(value: SearchSuggester): Self = StObject.set(x, "suggest", value.asInstanceOf[js.Any])
    
    inline def setSuggestUndefined: Self = StObject.set(x, "suggest", js.undefined)
    
    inline def setTerminate_after(value: long): Self = StObject.set(x, "terminate_after", value.asInstanceOf[js.Any])
    
    inline def setTerminate_afterUndefined: Self = StObject.set(x, "terminate_after", js.undefined)
    
    inline def setTimeout(value: String): Self = StObject.set(x, "timeout", value.asInstanceOf[js.Any])
    
    inline def setTimeoutUndefined: Self = StObject.set(x, "timeout", js.undefined)
    
    inline def setTrack_scores(value: Boolean): Self = StObject.set(x, "track_scores", value.asInstanceOf[js.Any])
    
    inline def setTrack_scoresUndefined: Self = StObject.set(x, "track_scores", js.undefined)
    
    inline def setTrack_total_hits(value: SearchTrackHits): Self = StObject.set(x, "track_total_hits", value.asInstanceOf[js.Any])
    
    inline def setTrack_total_hitsUndefined: Self = StObject.set(x, "track_total_hits", js.undefined)
    
    inline def setVersion(value: Boolean): Self = StObject.set(x, "version", value.asInstanceOf[js.Any])
    
    inline def setVersionUndefined: Self = StObject.set(x, "version", js.undefined)
    
    inline def set_source(value: SearchSourceConfig): Self = StObject.set(x, "_source", value.asInstanceOf[js.Any])
    
    inline def set_sourceUndefined: Self = StObject.set(x, "_source", js.undefined)
    
    inline def set_sourceVarargs(value: Field*): Self = StObject.set(x, "_source", js.Array(value*))
  }
}
