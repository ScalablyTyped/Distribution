package typings.elasticElasticsearch.libApiTypesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IndicesIndexSettingsKeys extends StObject {
  
  var analysis: js.UndefOr[IndicesIndexSettingsAnalysis] = js.undefined
  
  var analyze: js.UndefOr[IndicesSettingsAnalyze] = js.undefined
  
  var auto_expand_replicas: js.UndefOr[String] = js.undefined
  
  var blocks: js.UndefOr[IndicesIndexSettingBlocks] = js.undefined
  
  var check_on_startup: js.UndefOr[IndicesIndexCheckOnStartup] = js.undefined
  
  var codec: js.UndefOr[String] = js.undefined
  
  var creation_date: js.UndefOr[SpecUtilsStringified[EpochTime[UnitMillis]]] = js.undefined
  
  var creation_date_string: js.UndefOr[DateTime] = js.undefined
  
  var default_pipeline: js.UndefOr[PipelineName] = js.undefined
  
  var final_pipeline: js.UndefOr[PipelineName] = js.undefined
  
  var format: js.UndefOr[String | integer] = js.undefined
  
  var gc_deletes: js.UndefOr[Duration] = js.undefined
  
  var hidden: js.UndefOr[Boolean | String] = js.undefined
  
  var highlight: js.UndefOr[IndicesSettingsHighlight] = js.undefined
  
  var index: js.UndefOr[IndicesIndexSettings] = js.undefined
  
  @JSName("indexing.slowlog")
  var indexingDotslowlog: js.UndefOr[IndicesSlowlogSettings] = js.undefined
  
  var indexing_pressure: js.UndefOr[IndicesIndexingPressure] = js.undefined
  
  var lifecycle: js.UndefOr[IndicesIndexSettingsLifecycle] = js.undefined
  
  var load_fixed_bitset_filters_eagerly: js.UndefOr[Boolean] = js.undefined
  
  var mapping: js.UndefOr[IndicesMappingLimitSettings] = js.undefined
  
  var max_docvalue_fields_search: js.UndefOr[integer] = js.undefined
  
  var max_inner_result_window: js.UndefOr[integer] = js.undefined
  
  var max_ngram_diff: js.UndefOr[integer] = js.undefined
  
  var max_refresh_listeners: js.UndefOr[integer] = js.undefined
  
  var max_regex_length: js.UndefOr[integer] = js.undefined
  
  var max_rescore_window: js.UndefOr[integer] = js.undefined
  
  var max_result_window: js.UndefOr[integer] = js.undefined
  
  var max_script_fields: js.UndefOr[integer] = js.undefined
  
  var max_shingle_diff: js.UndefOr[integer] = js.undefined
  
  var max_slices_per_scroll: js.UndefOr[integer] = js.undefined
  
  var max_terms_count: js.UndefOr[integer] = js.undefined
  
  var merge: js.UndefOr[IndicesMerge] = js.undefined
  
  var mode: js.UndefOr[String] = js.undefined
  
  var number_of_replicas: js.UndefOr[integer | String] = js.undefined
  
  var number_of_routing_shards: js.UndefOr[integer] = js.undefined
  
  var number_of_shards: js.UndefOr[integer | String] = js.undefined
  
  var priority: js.UndefOr[integer | String] = js.undefined
  
  var provided_name: js.UndefOr[Name] = js.undefined
  
  var queries: js.UndefOr[IndicesQueries] = js.undefined
  
  var query_string: js.UndefOr[IndicesSettingsQueryString] = js.undefined
  
  var refresh_interval: js.UndefOr[Duration] = js.undefined
  
  var routing: js.UndefOr[IndicesIndexRouting] = js.undefined
  
  var routing_partition_size: js.UndefOr[integer] = js.undefined
  
  var routing_path: js.UndefOr[String | js.Array[String]] = js.undefined
  
  var search: js.UndefOr[IndicesSettingsSearch] = js.undefined
  
  var settings: js.UndefOr[IndicesIndexSettings] = js.undefined
  
  var shards: js.UndefOr[integer] = js.undefined
  
  var similarity: js.UndefOr[IndicesSettingsSimilarity] = js.undefined
  
  var soft_deletes: js.UndefOr[IndicesSoftDeletes] = js.undefined
  
  var sort: js.UndefOr[IndicesIndexSegmentSort] = js.undefined
  
  var store: js.UndefOr[IndicesStorage] = js.undefined
  
  var time_series: js.UndefOr[IndicesIndexSettingsTimeSeries] = js.undefined
  
  var top_metrics_max_size: js.UndefOr[integer] = js.undefined
  
  var translog: js.UndefOr[IndicesTranslog] = js.undefined
  
  var uuid: js.UndefOr[Uuid] = js.undefined
  
  var verified_before_close: js.UndefOr[Boolean | String] = js.undefined
  
  var version: js.UndefOr[IndicesIndexVersioning] = js.undefined
}
object IndicesIndexSettingsKeys {
  
  inline def apply(): IndicesIndexSettingsKeys = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IndicesIndexSettingsKeys]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: IndicesIndexSettingsKeys] (val x: Self) extends AnyVal {
    
    inline def setAnalysis(value: IndicesIndexSettingsAnalysis): Self = StObject.set(x, "analysis", value.asInstanceOf[js.Any])
    
    inline def setAnalysisUndefined: Self = StObject.set(x, "analysis", js.undefined)
    
    inline def setAnalyze(value: IndicesSettingsAnalyze): Self = StObject.set(x, "analyze", value.asInstanceOf[js.Any])
    
    inline def setAnalyzeUndefined: Self = StObject.set(x, "analyze", js.undefined)
    
    inline def setAuto_expand_replicas(value: String): Self = StObject.set(x, "auto_expand_replicas", value.asInstanceOf[js.Any])
    
    inline def setAuto_expand_replicasUndefined: Self = StObject.set(x, "auto_expand_replicas", js.undefined)
    
    inline def setBlocks(value: IndicesIndexSettingBlocks): Self = StObject.set(x, "blocks", value.asInstanceOf[js.Any])
    
    inline def setBlocksUndefined: Self = StObject.set(x, "blocks", js.undefined)
    
    inline def setCheck_on_startup(value: IndicesIndexCheckOnStartup): Self = StObject.set(x, "check_on_startup", value.asInstanceOf[js.Any])
    
    inline def setCheck_on_startupUndefined: Self = StObject.set(x, "check_on_startup", js.undefined)
    
    inline def setCodec(value: String): Self = StObject.set(x, "codec", value.asInstanceOf[js.Any])
    
    inline def setCodecUndefined: Self = StObject.set(x, "codec", js.undefined)
    
    inline def setCreation_date(value: SpecUtilsStringified[EpochTime[UnitMillis]]): Self = StObject.set(x, "creation_date", value.asInstanceOf[js.Any])
    
    inline def setCreation_dateUndefined: Self = StObject.set(x, "creation_date", js.undefined)
    
    inline def setCreation_date_string(value: DateTime): Self = StObject.set(x, "creation_date_string", value.asInstanceOf[js.Any])
    
    inline def setCreation_date_stringUndefined: Self = StObject.set(x, "creation_date_string", js.undefined)
    
    inline def setDefault_pipeline(value: PipelineName): Self = StObject.set(x, "default_pipeline", value.asInstanceOf[js.Any])
    
    inline def setDefault_pipelineUndefined: Self = StObject.set(x, "default_pipeline", js.undefined)
    
    inline def setFinal_pipeline(value: PipelineName): Self = StObject.set(x, "final_pipeline", value.asInstanceOf[js.Any])
    
    inline def setFinal_pipelineUndefined: Self = StObject.set(x, "final_pipeline", js.undefined)
    
    inline def setFormat(value: String | integer): Self = StObject.set(x, "format", value.asInstanceOf[js.Any])
    
    inline def setFormatUndefined: Self = StObject.set(x, "format", js.undefined)
    
    inline def setGc_deletes(value: Duration): Self = StObject.set(x, "gc_deletes", value.asInstanceOf[js.Any])
    
    inline def setGc_deletesUndefined: Self = StObject.set(x, "gc_deletes", js.undefined)
    
    inline def setHidden(value: Boolean | String): Self = StObject.set(x, "hidden", value.asInstanceOf[js.Any])
    
    inline def setHiddenUndefined: Self = StObject.set(x, "hidden", js.undefined)
    
    inline def setHighlight(value: IndicesSettingsHighlight): Self = StObject.set(x, "highlight", value.asInstanceOf[js.Any])
    
    inline def setHighlightUndefined: Self = StObject.set(x, "highlight", js.undefined)
    
    inline def setIndex(value: IndicesIndexSettings): Self = StObject.set(x, "index", value.asInstanceOf[js.Any])
    
    inline def setIndexUndefined: Self = StObject.set(x, "index", js.undefined)
    
    inline def setIndexingDotslowlog(value: IndicesSlowlogSettings): Self = StObject.set(x, "indexing.slowlog", value.asInstanceOf[js.Any])
    
    inline def setIndexingDotslowlogUndefined: Self = StObject.set(x, "indexing.slowlog", js.undefined)
    
    inline def setIndexing_pressure(value: IndicesIndexingPressure): Self = StObject.set(x, "indexing_pressure", value.asInstanceOf[js.Any])
    
    inline def setIndexing_pressureUndefined: Self = StObject.set(x, "indexing_pressure", js.undefined)
    
    inline def setLifecycle(value: IndicesIndexSettingsLifecycle): Self = StObject.set(x, "lifecycle", value.asInstanceOf[js.Any])
    
    inline def setLifecycleUndefined: Self = StObject.set(x, "lifecycle", js.undefined)
    
    inline def setLoad_fixed_bitset_filters_eagerly(value: Boolean): Self = StObject.set(x, "load_fixed_bitset_filters_eagerly", value.asInstanceOf[js.Any])
    
    inline def setLoad_fixed_bitset_filters_eagerlyUndefined: Self = StObject.set(x, "load_fixed_bitset_filters_eagerly", js.undefined)
    
    inline def setMapping(value: IndicesMappingLimitSettings): Self = StObject.set(x, "mapping", value.asInstanceOf[js.Any])
    
    inline def setMappingUndefined: Self = StObject.set(x, "mapping", js.undefined)
    
    inline def setMax_docvalue_fields_search(value: integer): Self = StObject.set(x, "max_docvalue_fields_search", value.asInstanceOf[js.Any])
    
    inline def setMax_docvalue_fields_searchUndefined: Self = StObject.set(x, "max_docvalue_fields_search", js.undefined)
    
    inline def setMax_inner_result_window(value: integer): Self = StObject.set(x, "max_inner_result_window", value.asInstanceOf[js.Any])
    
    inline def setMax_inner_result_windowUndefined: Self = StObject.set(x, "max_inner_result_window", js.undefined)
    
    inline def setMax_ngram_diff(value: integer): Self = StObject.set(x, "max_ngram_diff", value.asInstanceOf[js.Any])
    
    inline def setMax_ngram_diffUndefined: Self = StObject.set(x, "max_ngram_diff", js.undefined)
    
    inline def setMax_refresh_listeners(value: integer): Self = StObject.set(x, "max_refresh_listeners", value.asInstanceOf[js.Any])
    
    inline def setMax_refresh_listenersUndefined: Self = StObject.set(x, "max_refresh_listeners", js.undefined)
    
    inline def setMax_regex_length(value: integer): Self = StObject.set(x, "max_regex_length", value.asInstanceOf[js.Any])
    
    inline def setMax_regex_lengthUndefined: Self = StObject.set(x, "max_regex_length", js.undefined)
    
    inline def setMax_rescore_window(value: integer): Self = StObject.set(x, "max_rescore_window", value.asInstanceOf[js.Any])
    
    inline def setMax_rescore_windowUndefined: Self = StObject.set(x, "max_rescore_window", js.undefined)
    
    inline def setMax_result_window(value: integer): Self = StObject.set(x, "max_result_window", value.asInstanceOf[js.Any])
    
    inline def setMax_result_windowUndefined: Self = StObject.set(x, "max_result_window", js.undefined)
    
    inline def setMax_script_fields(value: integer): Self = StObject.set(x, "max_script_fields", value.asInstanceOf[js.Any])
    
    inline def setMax_script_fieldsUndefined: Self = StObject.set(x, "max_script_fields", js.undefined)
    
    inline def setMax_shingle_diff(value: integer): Self = StObject.set(x, "max_shingle_diff", value.asInstanceOf[js.Any])
    
    inline def setMax_shingle_diffUndefined: Self = StObject.set(x, "max_shingle_diff", js.undefined)
    
    inline def setMax_slices_per_scroll(value: integer): Self = StObject.set(x, "max_slices_per_scroll", value.asInstanceOf[js.Any])
    
    inline def setMax_slices_per_scrollUndefined: Self = StObject.set(x, "max_slices_per_scroll", js.undefined)
    
    inline def setMax_terms_count(value: integer): Self = StObject.set(x, "max_terms_count", value.asInstanceOf[js.Any])
    
    inline def setMax_terms_countUndefined: Self = StObject.set(x, "max_terms_count", js.undefined)
    
    inline def setMerge(value: IndicesMerge): Self = StObject.set(x, "merge", value.asInstanceOf[js.Any])
    
    inline def setMergeUndefined: Self = StObject.set(x, "merge", js.undefined)
    
    inline def setMode(value: String): Self = StObject.set(x, "mode", value.asInstanceOf[js.Any])
    
    inline def setModeUndefined: Self = StObject.set(x, "mode", js.undefined)
    
    inline def setNumber_of_replicas(value: integer | String): Self = StObject.set(x, "number_of_replicas", value.asInstanceOf[js.Any])
    
    inline def setNumber_of_replicasUndefined: Self = StObject.set(x, "number_of_replicas", js.undefined)
    
    inline def setNumber_of_routing_shards(value: integer): Self = StObject.set(x, "number_of_routing_shards", value.asInstanceOf[js.Any])
    
    inline def setNumber_of_routing_shardsUndefined: Self = StObject.set(x, "number_of_routing_shards", js.undefined)
    
    inline def setNumber_of_shards(value: integer | String): Self = StObject.set(x, "number_of_shards", value.asInstanceOf[js.Any])
    
    inline def setNumber_of_shardsUndefined: Self = StObject.set(x, "number_of_shards", js.undefined)
    
    inline def setPriority(value: integer | String): Self = StObject.set(x, "priority", value.asInstanceOf[js.Any])
    
    inline def setPriorityUndefined: Self = StObject.set(x, "priority", js.undefined)
    
    inline def setProvided_name(value: Name): Self = StObject.set(x, "provided_name", value.asInstanceOf[js.Any])
    
    inline def setProvided_nameUndefined: Self = StObject.set(x, "provided_name", js.undefined)
    
    inline def setQueries(value: IndicesQueries): Self = StObject.set(x, "queries", value.asInstanceOf[js.Any])
    
    inline def setQueriesUndefined: Self = StObject.set(x, "queries", js.undefined)
    
    inline def setQuery_string(value: IndicesSettingsQueryString): Self = StObject.set(x, "query_string", value.asInstanceOf[js.Any])
    
    inline def setQuery_stringUndefined: Self = StObject.set(x, "query_string", js.undefined)
    
    inline def setRefresh_interval(value: Duration): Self = StObject.set(x, "refresh_interval", value.asInstanceOf[js.Any])
    
    inline def setRefresh_intervalUndefined: Self = StObject.set(x, "refresh_interval", js.undefined)
    
    inline def setRouting(value: IndicesIndexRouting): Self = StObject.set(x, "routing", value.asInstanceOf[js.Any])
    
    inline def setRoutingUndefined: Self = StObject.set(x, "routing", js.undefined)
    
    inline def setRouting_partition_size(value: integer): Self = StObject.set(x, "routing_partition_size", value.asInstanceOf[js.Any])
    
    inline def setRouting_partition_sizeUndefined: Self = StObject.set(x, "routing_partition_size", js.undefined)
    
    inline def setRouting_path(value: String | js.Array[String]): Self = StObject.set(x, "routing_path", value.asInstanceOf[js.Any])
    
    inline def setRouting_pathUndefined: Self = StObject.set(x, "routing_path", js.undefined)
    
    inline def setRouting_pathVarargs(value: String*): Self = StObject.set(x, "routing_path", js.Array(value*))
    
    inline def setSearch(value: IndicesSettingsSearch): Self = StObject.set(x, "search", value.asInstanceOf[js.Any])
    
    inline def setSearchUndefined: Self = StObject.set(x, "search", js.undefined)
    
    inline def setSettings(value: IndicesIndexSettings): Self = StObject.set(x, "settings", value.asInstanceOf[js.Any])
    
    inline def setSettingsUndefined: Self = StObject.set(x, "settings", js.undefined)
    
    inline def setShards(value: integer): Self = StObject.set(x, "shards", value.asInstanceOf[js.Any])
    
    inline def setShardsUndefined: Self = StObject.set(x, "shards", js.undefined)
    
    inline def setSimilarity(value: IndicesSettingsSimilarity): Self = StObject.set(x, "similarity", value.asInstanceOf[js.Any])
    
    inline def setSimilarityUndefined: Self = StObject.set(x, "similarity", js.undefined)
    
    inline def setSoft_deletes(value: IndicesSoftDeletes): Self = StObject.set(x, "soft_deletes", value.asInstanceOf[js.Any])
    
    inline def setSoft_deletesUndefined: Self = StObject.set(x, "soft_deletes", js.undefined)
    
    inline def setSort(value: IndicesIndexSegmentSort): Self = StObject.set(x, "sort", value.asInstanceOf[js.Any])
    
    inline def setSortUndefined: Self = StObject.set(x, "sort", js.undefined)
    
    inline def setStore(value: IndicesStorage): Self = StObject.set(x, "store", value.asInstanceOf[js.Any])
    
    inline def setStoreUndefined: Self = StObject.set(x, "store", js.undefined)
    
    inline def setTime_series(value: IndicesIndexSettingsTimeSeries): Self = StObject.set(x, "time_series", value.asInstanceOf[js.Any])
    
    inline def setTime_seriesUndefined: Self = StObject.set(x, "time_series", js.undefined)
    
    inline def setTop_metrics_max_size(value: integer): Self = StObject.set(x, "top_metrics_max_size", value.asInstanceOf[js.Any])
    
    inline def setTop_metrics_max_sizeUndefined: Self = StObject.set(x, "top_metrics_max_size", js.undefined)
    
    inline def setTranslog(value: IndicesTranslog): Self = StObject.set(x, "translog", value.asInstanceOf[js.Any])
    
    inline def setTranslogUndefined: Self = StObject.set(x, "translog", js.undefined)
    
    inline def setUuid(value: Uuid): Self = StObject.set(x, "uuid", value.asInstanceOf[js.Any])
    
    inline def setUuidUndefined: Self = StObject.set(x, "uuid", js.undefined)
    
    inline def setVerified_before_close(value: Boolean | String): Self = StObject.set(x, "verified_before_close", value.asInstanceOf[js.Any])
    
    inline def setVerified_before_closeUndefined: Self = StObject.set(x, "verified_before_close", js.undefined)
    
    inline def setVersion(value: IndicesIndexVersioning): Self = StObject.set(x, "version", value.asInstanceOf[js.Any])
    
    inline def setVersionUndefined: Self = StObject.set(x, "version", js.undefined)
  }
}
