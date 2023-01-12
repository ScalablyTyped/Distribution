package typings.elasticElasticsearch.libApiTypesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SearchAggregationProfileDebug extends StObject {
  
  var built_buckets: js.UndefOr[integer] = js.undefined
  
  var chars_fetched: js.UndefOr[integer] = js.undefined
  
  var collect_analyzed_count: js.UndefOr[integer] = js.undefined
  
  var collect_analyzed_ns: js.UndefOr[integer] = js.undefined
  
  var collection_strategy: js.UndefOr[String] = js.undefined
  
  var deferred_aggregators: js.UndefOr[js.Array[String]] = js.undefined
  
  var delegate: js.UndefOr[String] = js.undefined
  
  var delegate_debug: js.UndefOr[SearchAggregationProfileDebug] = js.undefined
  
  var empty_collectors_used: js.UndefOr[integer] = js.undefined
  
  var extract_count: js.UndefOr[integer] = js.undefined
  
  var extract_ns: js.UndefOr[integer] = js.undefined
  
  var filters: js.UndefOr[js.Array[SearchAggregationProfileDelegateDebugFilter]] = js.undefined
  
  var has_filter: js.UndefOr[Boolean] = js.undefined
  
  var map_reducer: js.UndefOr[String] = js.undefined
  
  var numeric_collectors_used: js.UndefOr[integer] = js.undefined
  
  var ordinals_collectors_overhead_too_high: js.UndefOr[integer] = js.undefined
  
  var ordinals_collectors_used: js.UndefOr[integer] = js.undefined
  
  var result_strategy: js.UndefOr[String] = js.undefined
  
  var segments_collected: js.UndefOr[integer] = js.undefined
  
  var segments_counted: js.UndefOr[integer] = js.undefined
  
  var segments_with_deleted_docs: js.UndefOr[integer] = js.undefined
  
  var segments_with_doc_count_field: js.UndefOr[integer] = js.undefined
  
  var segments_with_multi_valued_ords: js.UndefOr[integer] = js.undefined
  
  var segments_with_single_valued_ords: js.UndefOr[integer] = js.undefined
  
  var string_hashing_collectors_used: js.UndefOr[integer] = js.undefined
  
  var surviving_buckets: js.UndefOr[integer] = js.undefined
  
  var total_buckets: js.UndefOr[integer] = js.undefined
  
  var values_fetched: js.UndefOr[integer] = js.undefined
}
object SearchAggregationProfileDebug {
  
  inline def apply(): SearchAggregationProfileDebug = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SearchAggregationProfileDebug]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: SearchAggregationProfileDebug] (val x: Self) extends AnyVal {
    
    inline def setBuilt_buckets(value: integer): Self = StObject.set(x, "built_buckets", value.asInstanceOf[js.Any])
    
    inline def setBuilt_bucketsUndefined: Self = StObject.set(x, "built_buckets", js.undefined)
    
    inline def setChars_fetched(value: integer): Self = StObject.set(x, "chars_fetched", value.asInstanceOf[js.Any])
    
    inline def setChars_fetchedUndefined: Self = StObject.set(x, "chars_fetched", js.undefined)
    
    inline def setCollect_analyzed_count(value: integer): Self = StObject.set(x, "collect_analyzed_count", value.asInstanceOf[js.Any])
    
    inline def setCollect_analyzed_countUndefined: Self = StObject.set(x, "collect_analyzed_count", js.undefined)
    
    inline def setCollect_analyzed_ns(value: integer): Self = StObject.set(x, "collect_analyzed_ns", value.asInstanceOf[js.Any])
    
    inline def setCollect_analyzed_nsUndefined: Self = StObject.set(x, "collect_analyzed_ns", js.undefined)
    
    inline def setCollection_strategy(value: String): Self = StObject.set(x, "collection_strategy", value.asInstanceOf[js.Any])
    
    inline def setCollection_strategyUndefined: Self = StObject.set(x, "collection_strategy", js.undefined)
    
    inline def setDeferred_aggregators(value: js.Array[String]): Self = StObject.set(x, "deferred_aggregators", value.asInstanceOf[js.Any])
    
    inline def setDeferred_aggregatorsUndefined: Self = StObject.set(x, "deferred_aggregators", js.undefined)
    
    inline def setDeferred_aggregatorsVarargs(value: String*): Self = StObject.set(x, "deferred_aggregators", js.Array(value*))
    
    inline def setDelegate(value: String): Self = StObject.set(x, "delegate", value.asInstanceOf[js.Any])
    
    inline def setDelegateUndefined: Self = StObject.set(x, "delegate", js.undefined)
    
    inline def setDelegate_debug(value: SearchAggregationProfileDebug): Self = StObject.set(x, "delegate_debug", value.asInstanceOf[js.Any])
    
    inline def setDelegate_debugUndefined: Self = StObject.set(x, "delegate_debug", js.undefined)
    
    inline def setEmpty_collectors_used(value: integer): Self = StObject.set(x, "empty_collectors_used", value.asInstanceOf[js.Any])
    
    inline def setEmpty_collectors_usedUndefined: Self = StObject.set(x, "empty_collectors_used", js.undefined)
    
    inline def setExtract_count(value: integer): Self = StObject.set(x, "extract_count", value.asInstanceOf[js.Any])
    
    inline def setExtract_countUndefined: Self = StObject.set(x, "extract_count", js.undefined)
    
    inline def setExtract_ns(value: integer): Self = StObject.set(x, "extract_ns", value.asInstanceOf[js.Any])
    
    inline def setExtract_nsUndefined: Self = StObject.set(x, "extract_ns", js.undefined)
    
    inline def setFilters(value: js.Array[SearchAggregationProfileDelegateDebugFilter]): Self = StObject.set(x, "filters", value.asInstanceOf[js.Any])
    
    inline def setFiltersUndefined: Self = StObject.set(x, "filters", js.undefined)
    
    inline def setFiltersVarargs(value: SearchAggregationProfileDelegateDebugFilter*): Self = StObject.set(x, "filters", js.Array(value*))
    
    inline def setHas_filter(value: Boolean): Self = StObject.set(x, "has_filter", value.asInstanceOf[js.Any])
    
    inline def setHas_filterUndefined: Self = StObject.set(x, "has_filter", js.undefined)
    
    inline def setMap_reducer(value: String): Self = StObject.set(x, "map_reducer", value.asInstanceOf[js.Any])
    
    inline def setMap_reducerUndefined: Self = StObject.set(x, "map_reducer", js.undefined)
    
    inline def setNumeric_collectors_used(value: integer): Self = StObject.set(x, "numeric_collectors_used", value.asInstanceOf[js.Any])
    
    inline def setNumeric_collectors_usedUndefined: Self = StObject.set(x, "numeric_collectors_used", js.undefined)
    
    inline def setOrdinals_collectors_overhead_too_high(value: integer): Self = StObject.set(x, "ordinals_collectors_overhead_too_high", value.asInstanceOf[js.Any])
    
    inline def setOrdinals_collectors_overhead_too_highUndefined: Self = StObject.set(x, "ordinals_collectors_overhead_too_high", js.undefined)
    
    inline def setOrdinals_collectors_used(value: integer): Self = StObject.set(x, "ordinals_collectors_used", value.asInstanceOf[js.Any])
    
    inline def setOrdinals_collectors_usedUndefined: Self = StObject.set(x, "ordinals_collectors_used", js.undefined)
    
    inline def setResult_strategy(value: String): Self = StObject.set(x, "result_strategy", value.asInstanceOf[js.Any])
    
    inline def setResult_strategyUndefined: Self = StObject.set(x, "result_strategy", js.undefined)
    
    inline def setSegments_collected(value: integer): Self = StObject.set(x, "segments_collected", value.asInstanceOf[js.Any])
    
    inline def setSegments_collectedUndefined: Self = StObject.set(x, "segments_collected", js.undefined)
    
    inline def setSegments_counted(value: integer): Self = StObject.set(x, "segments_counted", value.asInstanceOf[js.Any])
    
    inline def setSegments_countedUndefined: Self = StObject.set(x, "segments_counted", js.undefined)
    
    inline def setSegments_with_deleted_docs(value: integer): Self = StObject.set(x, "segments_with_deleted_docs", value.asInstanceOf[js.Any])
    
    inline def setSegments_with_deleted_docsUndefined: Self = StObject.set(x, "segments_with_deleted_docs", js.undefined)
    
    inline def setSegments_with_doc_count_field(value: integer): Self = StObject.set(x, "segments_with_doc_count_field", value.asInstanceOf[js.Any])
    
    inline def setSegments_with_doc_count_fieldUndefined: Self = StObject.set(x, "segments_with_doc_count_field", js.undefined)
    
    inline def setSegments_with_multi_valued_ords(value: integer): Self = StObject.set(x, "segments_with_multi_valued_ords", value.asInstanceOf[js.Any])
    
    inline def setSegments_with_multi_valued_ordsUndefined: Self = StObject.set(x, "segments_with_multi_valued_ords", js.undefined)
    
    inline def setSegments_with_single_valued_ords(value: integer): Self = StObject.set(x, "segments_with_single_valued_ords", value.asInstanceOf[js.Any])
    
    inline def setSegments_with_single_valued_ordsUndefined: Self = StObject.set(x, "segments_with_single_valued_ords", js.undefined)
    
    inline def setString_hashing_collectors_used(value: integer): Self = StObject.set(x, "string_hashing_collectors_used", value.asInstanceOf[js.Any])
    
    inline def setString_hashing_collectors_usedUndefined: Self = StObject.set(x, "string_hashing_collectors_used", js.undefined)
    
    inline def setSurviving_buckets(value: integer): Self = StObject.set(x, "surviving_buckets", value.asInstanceOf[js.Any])
    
    inline def setSurviving_bucketsUndefined: Self = StObject.set(x, "surviving_buckets", js.undefined)
    
    inline def setTotal_buckets(value: integer): Self = StObject.set(x, "total_buckets", value.asInstanceOf[js.Any])
    
    inline def setTotal_bucketsUndefined: Self = StObject.set(x, "total_buckets", js.undefined)
    
    inline def setValues_fetched(value: integer): Self = StObject.set(x, "values_fetched", value.asInstanceOf[js.Any])
    
    inline def setValues_fetchedUndefined: Self = StObject.set(x, "values_fetched", js.undefined)
  }
}
