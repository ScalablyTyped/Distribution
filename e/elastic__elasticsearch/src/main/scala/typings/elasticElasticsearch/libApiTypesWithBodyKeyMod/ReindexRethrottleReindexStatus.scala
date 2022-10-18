package typings.elasticElasticsearch.libApiTypesWithBodyKeyMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ReindexRethrottleReindexStatus extends StObject {
  
  var batches: long
  
  var created: long
  
  var deleted: long
  
  var noops: long
  
  var requests_per_second: float
  
  var retries: Retries
  
  var throttled: js.UndefOr[Duration] = js.undefined
  
  var throttled_millis: DurationValue[UnitMillis]
  
  var throttled_until: js.UndefOr[Duration] = js.undefined
  
  var throttled_until_millis: DurationValue[UnitMillis]
  
  var total: long
  
  var updated: long
  
  var version_conflicts: long
}
object ReindexRethrottleReindexStatus {
  
  inline def apply(
    batches: long,
    created: long,
    deleted: long,
    noops: long,
    requests_per_second: float,
    retries: Retries,
    throttled_millis: DurationValue[UnitMillis],
    throttled_until_millis: DurationValue[UnitMillis],
    total: long,
    updated: long,
    version_conflicts: long
  ): ReindexRethrottleReindexStatus = {
    val __obj = js.Dynamic.literal(batches = batches.asInstanceOf[js.Any], created = created.asInstanceOf[js.Any], deleted = deleted.asInstanceOf[js.Any], noops = noops.asInstanceOf[js.Any], requests_per_second = requests_per_second.asInstanceOf[js.Any], retries = retries.asInstanceOf[js.Any], throttled_millis = throttled_millis.asInstanceOf[js.Any], throttled_until_millis = throttled_until_millis.asInstanceOf[js.Any], total = total.asInstanceOf[js.Any], updated = updated.asInstanceOf[js.Any], version_conflicts = version_conflicts.asInstanceOf[js.Any])
    __obj.asInstanceOf[ReindexRethrottleReindexStatus]
  }
  
  extension [Self <: ReindexRethrottleReindexStatus](x: Self) {
    
    inline def setBatches(value: long): Self = StObject.set(x, "batches", value.asInstanceOf[js.Any])
    
    inline def setCreated(value: long): Self = StObject.set(x, "created", value.asInstanceOf[js.Any])
    
    inline def setDeleted(value: long): Self = StObject.set(x, "deleted", value.asInstanceOf[js.Any])
    
    inline def setNoops(value: long): Self = StObject.set(x, "noops", value.asInstanceOf[js.Any])
    
    inline def setRequests_per_second(value: float): Self = StObject.set(x, "requests_per_second", value.asInstanceOf[js.Any])
    
    inline def setRetries(value: Retries): Self = StObject.set(x, "retries", value.asInstanceOf[js.Any])
    
    inline def setThrottled(value: Duration): Self = StObject.set(x, "throttled", value.asInstanceOf[js.Any])
    
    inline def setThrottledUndefined: Self = StObject.set(x, "throttled", js.undefined)
    
    inline def setThrottled_millis(value: DurationValue[UnitMillis]): Self = StObject.set(x, "throttled_millis", value.asInstanceOf[js.Any])
    
    inline def setThrottled_until(value: Duration): Self = StObject.set(x, "throttled_until", value.asInstanceOf[js.Any])
    
    inline def setThrottled_untilUndefined: Self = StObject.set(x, "throttled_until", js.undefined)
    
    inline def setThrottled_until_millis(value: DurationValue[UnitMillis]): Self = StObject.set(x, "throttled_until_millis", value.asInstanceOf[js.Any])
    
    inline def setTotal(value: long): Self = StObject.set(x, "total", value.asInstanceOf[js.Any])
    
    inline def setUpdated(value: long): Self = StObject.set(x, "updated", value.asInstanceOf[js.Any])
    
    inline def setVersion_conflicts(value: long): Self = StObject.set(x, "version_conflicts", value.asInstanceOf[js.Any])
  }
}
