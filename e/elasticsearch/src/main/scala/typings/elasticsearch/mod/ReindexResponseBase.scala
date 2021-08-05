package typings.elasticsearch.mod

import typings.elasticsearch.anon.Bulk
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ReindexResponseBase extends StObject {
  
  var batches: Double
  
  var deleted: Double
  
  var noops: Double
  
  var requests_per_second: Double
  
  var retries: Bulk
  
  var throttled_millis: Double
  
  var throttled_until_millis: Double
  
  var total: Double
  
  var updated: Double
  
  var version_conflicts: Double
}
object ReindexResponseBase {
  
  inline def apply(
    batches: Double,
    deleted: Double,
    noops: Double,
    requests_per_second: Double,
    retries: Bulk,
    throttled_millis: Double,
    throttled_until_millis: Double,
    total: Double,
    updated: Double,
    version_conflicts: Double
  ): ReindexResponseBase = {
    val __obj = js.Dynamic.literal(batches = batches.asInstanceOf[js.Any], deleted = deleted.asInstanceOf[js.Any], noops = noops.asInstanceOf[js.Any], requests_per_second = requests_per_second.asInstanceOf[js.Any], retries = retries.asInstanceOf[js.Any], throttled_millis = throttled_millis.asInstanceOf[js.Any], throttled_until_millis = throttled_until_millis.asInstanceOf[js.Any], total = total.asInstanceOf[js.Any], updated = updated.asInstanceOf[js.Any], version_conflicts = version_conflicts.asInstanceOf[js.Any])
    __obj.asInstanceOf[ReindexResponseBase]
  }
  
  extension [Self <: ReindexResponseBase](x: Self) {
    
    inline def setBatches(value: Double): Self = StObject.set(x, "batches", value.asInstanceOf[js.Any])
    
    inline def setDeleted(value: Double): Self = StObject.set(x, "deleted", value.asInstanceOf[js.Any])
    
    inline def setNoops(value: Double): Self = StObject.set(x, "noops", value.asInstanceOf[js.Any])
    
    inline def setRequests_per_second(value: Double): Self = StObject.set(x, "requests_per_second", value.asInstanceOf[js.Any])
    
    inline def setRetries(value: Bulk): Self = StObject.set(x, "retries", value.asInstanceOf[js.Any])
    
    inline def setThrottled_millis(value: Double): Self = StObject.set(x, "throttled_millis", value.asInstanceOf[js.Any])
    
    inline def setThrottled_until_millis(value: Double): Self = StObject.set(x, "throttled_until_millis", value.asInstanceOf[js.Any])
    
    inline def setTotal(value: Double): Self = StObject.set(x, "total", value.asInstanceOf[js.Any])
    
    inline def setUpdated(value: Double): Self = StObject.set(x, "updated", value.asInstanceOf[js.Any])
    
    inline def setVersion_conflicts(value: Double): Self = StObject.set(x, "version_conflicts", value.asInstanceOf[js.Any])
  }
}
