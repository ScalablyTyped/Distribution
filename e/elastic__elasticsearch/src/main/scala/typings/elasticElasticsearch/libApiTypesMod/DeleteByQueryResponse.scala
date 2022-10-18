package typings.elasticElasticsearch.libApiTypesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DeleteByQueryResponse extends StObject {
  
  var batches: js.UndefOr[long] = js.undefined
  
  var deleted: js.UndefOr[long] = js.undefined
  
  var failures: js.UndefOr[js.Array[BulkIndexByScrollFailure]] = js.undefined
  
  var noops: js.UndefOr[long] = js.undefined
  
  var requests_per_second: js.UndefOr[float] = js.undefined
  
  var retries: js.UndefOr[Retries] = js.undefined
  
  var slice_id: js.UndefOr[integer] = js.undefined
  
  var task: js.UndefOr[TaskId] = js.undefined
  
  var throttled: js.UndefOr[Duration] = js.undefined
  
  var throttled_millis: DurationValue[UnitMillis]
  
  var throttled_until: js.UndefOr[Duration] = js.undefined
  
  var throttled_until_millis: DurationValue[UnitMillis]
  
  var timed_out: js.UndefOr[Boolean] = js.undefined
  
  var took: js.UndefOr[DurationValue[UnitMillis]] = js.undefined
  
  var total: js.UndefOr[long] = js.undefined
  
  var version_conflicts: js.UndefOr[long] = js.undefined
}
object DeleteByQueryResponse {
  
  inline def apply(throttled_millis: DurationValue[UnitMillis], throttled_until_millis: DurationValue[UnitMillis]): DeleteByQueryResponse = {
    val __obj = js.Dynamic.literal(throttled_millis = throttled_millis.asInstanceOf[js.Any], throttled_until_millis = throttled_until_millis.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeleteByQueryResponse]
  }
  
  extension [Self <: DeleteByQueryResponse](x: Self) {
    
    inline def setBatches(value: long): Self = StObject.set(x, "batches", value.asInstanceOf[js.Any])
    
    inline def setBatchesUndefined: Self = StObject.set(x, "batches", js.undefined)
    
    inline def setDeleted(value: long): Self = StObject.set(x, "deleted", value.asInstanceOf[js.Any])
    
    inline def setDeletedUndefined: Self = StObject.set(x, "deleted", js.undefined)
    
    inline def setFailures(value: js.Array[BulkIndexByScrollFailure]): Self = StObject.set(x, "failures", value.asInstanceOf[js.Any])
    
    inline def setFailuresUndefined: Self = StObject.set(x, "failures", js.undefined)
    
    inline def setFailuresVarargs(value: BulkIndexByScrollFailure*): Self = StObject.set(x, "failures", js.Array(value*))
    
    inline def setNoops(value: long): Self = StObject.set(x, "noops", value.asInstanceOf[js.Any])
    
    inline def setNoopsUndefined: Self = StObject.set(x, "noops", js.undefined)
    
    inline def setRequests_per_second(value: float): Self = StObject.set(x, "requests_per_second", value.asInstanceOf[js.Any])
    
    inline def setRequests_per_secondUndefined: Self = StObject.set(x, "requests_per_second", js.undefined)
    
    inline def setRetries(value: Retries): Self = StObject.set(x, "retries", value.asInstanceOf[js.Any])
    
    inline def setRetriesUndefined: Self = StObject.set(x, "retries", js.undefined)
    
    inline def setSlice_id(value: integer): Self = StObject.set(x, "slice_id", value.asInstanceOf[js.Any])
    
    inline def setSlice_idUndefined: Self = StObject.set(x, "slice_id", js.undefined)
    
    inline def setTask(value: TaskId): Self = StObject.set(x, "task", value.asInstanceOf[js.Any])
    
    inline def setTaskUndefined: Self = StObject.set(x, "task", js.undefined)
    
    inline def setThrottled(value: Duration): Self = StObject.set(x, "throttled", value.asInstanceOf[js.Any])
    
    inline def setThrottledUndefined: Self = StObject.set(x, "throttled", js.undefined)
    
    inline def setThrottled_millis(value: DurationValue[UnitMillis]): Self = StObject.set(x, "throttled_millis", value.asInstanceOf[js.Any])
    
    inline def setThrottled_until(value: Duration): Self = StObject.set(x, "throttled_until", value.asInstanceOf[js.Any])
    
    inline def setThrottled_untilUndefined: Self = StObject.set(x, "throttled_until", js.undefined)
    
    inline def setThrottled_until_millis(value: DurationValue[UnitMillis]): Self = StObject.set(x, "throttled_until_millis", value.asInstanceOf[js.Any])
    
    inline def setTimed_out(value: Boolean): Self = StObject.set(x, "timed_out", value.asInstanceOf[js.Any])
    
    inline def setTimed_outUndefined: Self = StObject.set(x, "timed_out", js.undefined)
    
    inline def setTook(value: DurationValue[UnitMillis]): Self = StObject.set(x, "took", value.asInstanceOf[js.Any])
    
    inline def setTookUndefined: Self = StObject.set(x, "took", js.undefined)
    
    inline def setTotal(value: long): Self = StObject.set(x, "total", value.asInstanceOf[js.Any])
    
    inline def setTotalUndefined: Self = StObject.set(x, "total", js.undefined)
    
    inline def setVersion_conflicts(value: long): Self = StObject.set(x, "version_conflicts", value.asInstanceOf[js.Any])
    
    inline def setVersion_conflictsUndefined: Self = StObject.set(x, "version_conflicts", js.undefined)
  }
}
