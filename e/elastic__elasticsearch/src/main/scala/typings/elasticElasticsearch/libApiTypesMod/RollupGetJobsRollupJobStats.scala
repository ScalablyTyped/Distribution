package typings.elasticElasticsearch.libApiTypesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait RollupGetJobsRollupJobStats extends StObject {
  
  var documents_processed: long
  
  var index_failures: long
  
  var index_time_in_ms: DurationValue[UnitMillis]
  
  var index_total: long
  
  var pages_processed: long
  
  var processing_time_in_ms: DurationValue[UnitMillis]
  
  var processing_total: long
  
  var rollups_indexed: long
  
  var search_failures: long
  
  var search_time_in_ms: DurationValue[UnitMillis]
  
  var search_total: long
  
  var trigger_count: long
}
object RollupGetJobsRollupJobStats {
  
  inline def apply(
    documents_processed: long,
    index_failures: long,
    index_time_in_ms: DurationValue[UnitMillis],
    index_total: long,
    pages_processed: long,
    processing_time_in_ms: DurationValue[UnitMillis],
    processing_total: long,
    rollups_indexed: long,
    search_failures: long,
    search_time_in_ms: DurationValue[UnitMillis],
    search_total: long,
    trigger_count: long
  ): RollupGetJobsRollupJobStats = {
    val __obj = js.Dynamic.literal(documents_processed = documents_processed.asInstanceOf[js.Any], index_failures = index_failures.asInstanceOf[js.Any], index_time_in_ms = index_time_in_ms.asInstanceOf[js.Any], index_total = index_total.asInstanceOf[js.Any], pages_processed = pages_processed.asInstanceOf[js.Any], processing_time_in_ms = processing_time_in_ms.asInstanceOf[js.Any], processing_total = processing_total.asInstanceOf[js.Any], rollups_indexed = rollups_indexed.asInstanceOf[js.Any], search_failures = search_failures.asInstanceOf[js.Any], search_time_in_ms = search_time_in_ms.asInstanceOf[js.Any], search_total = search_total.asInstanceOf[js.Any], trigger_count = trigger_count.asInstanceOf[js.Any])
    __obj.asInstanceOf[RollupGetJobsRollupJobStats]
  }
  
  extension [Self <: RollupGetJobsRollupJobStats](x: Self) {
    
    inline def setDocuments_processed(value: long): Self = StObject.set(x, "documents_processed", value.asInstanceOf[js.Any])
    
    inline def setIndex_failures(value: long): Self = StObject.set(x, "index_failures", value.asInstanceOf[js.Any])
    
    inline def setIndex_time_in_ms(value: DurationValue[UnitMillis]): Self = StObject.set(x, "index_time_in_ms", value.asInstanceOf[js.Any])
    
    inline def setIndex_total(value: long): Self = StObject.set(x, "index_total", value.asInstanceOf[js.Any])
    
    inline def setPages_processed(value: long): Self = StObject.set(x, "pages_processed", value.asInstanceOf[js.Any])
    
    inline def setProcessing_time_in_ms(value: DurationValue[UnitMillis]): Self = StObject.set(x, "processing_time_in_ms", value.asInstanceOf[js.Any])
    
    inline def setProcessing_total(value: long): Self = StObject.set(x, "processing_total", value.asInstanceOf[js.Any])
    
    inline def setRollups_indexed(value: long): Self = StObject.set(x, "rollups_indexed", value.asInstanceOf[js.Any])
    
    inline def setSearch_failures(value: long): Self = StObject.set(x, "search_failures", value.asInstanceOf[js.Any])
    
    inline def setSearch_time_in_ms(value: DurationValue[UnitMillis]): Self = StObject.set(x, "search_time_in_ms", value.asInstanceOf[js.Any])
    
    inline def setSearch_total(value: long): Self = StObject.set(x, "search_total", value.asInstanceOf[js.Any])
    
    inline def setTrigger_count(value: long): Self = StObject.set(x, "trigger_count", value.asInstanceOf[js.Any])
  }
}
