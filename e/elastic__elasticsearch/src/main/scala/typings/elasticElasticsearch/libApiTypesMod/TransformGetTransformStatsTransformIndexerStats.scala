package typings.elasticElasticsearch.libApiTypesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TransformGetTransformStatsTransformIndexerStats extends StObject {
  
  var delete_time_in_ms: js.UndefOr[EpochTime[UnitMillis]] = js.undefined
  
  var documents_deleted: js.UndefOr[long] = js.undefined
  
  var documents_indexed: long
  
  var documents_processed: long
  
  var exponential_avg_checkpoint_duration_ms: DurationValue[UnitFloatMillis]
  
  var exponential_avg_documents_indexed: double
  
  var exponential_avg_documents_processed: double
  
  var index_failures: long
  
  var index_time_in_ms: DurationValue[UnitMillis]
  
  var index_total: long
  
  var pages_processed: long
  
  var processing_time_in_ms: DurationValue[UnitMillis]
  
  var processing_total: long
  
  var search_failures: long
  
  var search_time_in_ms: DurationValue[UnitMillis]
  
  var search_total: long
  
  var trigger_count: long
}
object TransformGetTransformStatsTransformIndexerStats {
  
  inline def apply(
    documents_indexed: long,
    documents_processed: long,
    exponential_avg_checkpoint_duration_ms: DurationValue[UnitFloatMillis],
    exponential_avg_documents_indexed: double,
    exponential_avg_documents_processed: double,
    index_failures: long,
    index_time_in_ms: DurationValue[UnitMillis],
    index_total: long,
    pages_processed: long,
    processing_time_in_ms: DurationValue[UnitMillis],
    processing_total: long,
    search_failures: long,
    search_time_in_ms: DurationValue[UnitMillis],
    search_total: long,
    trigger_count: long
  ): TransformGetTransformStatsTransformIndexerStats = {
    val __obj = js.Dynamic.literal(documents_indexed = documents_indexed.asInstanceOf[js.Any], documents_processed = documents_processed.asInstanceOf[js.Any], exponential_avg_checkpoint_duration_ms = exponential_avg_checkpoint_duration_ms.asInstanceOf[js.Any], exponential_avg_documents_indexed = exponential_avg_documents_indexed.asInstanceOf[js.Any], exponential_avg_documents_processed = exponential_avg_documents_processed.asInstanceOf[js.Any], index_failures = index_failures.asInstanceOf[js.Any], index_time_in_ms = index_time_in_ms.asInstanceOf[js.Any], index_total = index_total.asInstanceOf[js.Any], pages_processed = pages_processed.asInstanceOf[js.Any], processing_time_in_ms = processing_time_in_ms.asInstanceOf[js.Any], processing_total = processing_total.asInstanceOf[js.Any], search_failures = search_failures.asInstanceOf[js.Any], search_time_in_ms = search_time_in_ms.asInstanceOf[js.Any], search_total = search_total.asInstanceOf[js.Any], trigger_count = trigger_count.asInstanceOf[js.Any])
    __obj.asInstanceOf[TransformGetTransformStatsTransformIndexerStats]
  }
  
  extension [Self <: TransformGetTransformStatsTransformIndexerStats](x: Self) {
    
    inline def setDelete_time_in_ms(value: EpochTime[UnitMillis]): Self = StObject.set(x, "delete_time_in_ms", value.asInstanceOf[js.Any])
    
    inline def setDelete_time_in_msUndefined: Self = StObject.set(x, "delete_time_in_ms", js.undefined)
    
    inline def setDocuments_deleted(value: long): Self = StObject.set(x, "documents_deleted", value.asInstanceOf[js.Any])
    
    inline def setDocuments_deletedUndefined: Self = StObject.set(x, "documents_deleted", js.undefined)
    
    inline def setDocuments_indexed(value: long): Self = StObject.set(x, "documents_indexed", value.asInstanceOf[js.Any])
    
    inline def setDocuments_processed(value: long): Self = StObject.set(x, "documents_processed", value.asInstanceOf[js.Any])
    
    inline def setExponential_avg_checkpoint_duration_ms(value: DurationValue[UnitFloatMillis]): Self = StObject.set(x, "exponential_avg_checkpoint_duration_ms", value.asInstanceOf[js.Any])
    
    inline def setExponential_avg_documents_indexed(value: double): Self = StObject.set(x, "exponential_avg_documents_indexed", value.asInstanceOf[js.Any])
    
    inline def setExponential_avg_documents_processed(value: double): Self = StObject.set(x, "exponential_avg_documents_processed", value.asInstanceOf[js.Any])
    
    inline def setIndex_failures(value: long): Self = StObject.set(x, "index_failures", value.asInstanceOf[js.Any])
    
    inline def setIndex_time_in_ms(value: DurationValue[UnitMillis]): Self = StObject.set(x, "index_time_in_ms", value.asInstanceOf[js.Any])
    
    inline def setIndex_total(value: long): Self = StObject.set(x, "index_total", value.asInstanceOf[js.Any])
    
    inline def setPages_processed(value: long): Self = StObject.set(x, "pages_processed", value.asInstanceOf[js.Any])
    
    inline def setProcessing_time_in_ms(value: DurationValue[UnitMillis]): Self = StObject.set(x, "processing_time_in_ms", value.asInstanceOf[js.Any])
    
    inline def setProcessing_total(value: long): Self = StObject.set(x, "processing_total", value.asInstanceOf[js.Any])
    
    inline def setSearch_failures(value: long): Self = StObject.set(x, "search_failures", value.asInstanceOf[js.Any])
    
    inline def setSearch_time_in_ms(value: DurationValue[UnitMillis]): Self = StObject.set(x, "search_time_in_ms", value.asInstanceOf[js.Any])
    
    inline def setSearch_total(value: long): Self = StObject.set(x, "search_total", value.asInstanceOf[js.Any])
    
    inline def setTrigger_count(value: long): Self = StObject.set(x, "trigger_count", value.asInstanceOf[js.Any])
  }
}
