package typings.elasticsearch.mod

import typings.elasticsearch.anon.Bulk
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ReindexOrByQueryResponseSlice
  extends StObject
     with ReindexResponseBase {
  
  var slice_id: Double
}
object ReindexOrByQueryResponseSlice {
  
  inline def apply(
    batches: Double,
    deleted: Double,
    noops: Double,
    requests_per_second: Double,
    retries: Bulk,
    slice_id: Double,
    throttled_millis: Double,
    throttled_until_millis: Double,
    total: Double,
    updated: Double,
    version_conflicts: Double
  ): ReindexOrByQueryResponseSlice = {
    val __obj = js.Dynamic.literal(batches = batches.asInstanceOf[js.Any], deleted = deleted.asInstanceOf[js.Any], noops = noops.asInstanceOf[js.Any], requests_per_second = requests_per_second.asInstanceOf[js.Any], retries = retries.asInstanceOf[js.Any], slice_id = slice_id.asInstanceOf[js.Any], throttled_millis = throttled_millis.asInstanceOf[js.Any], throttled_until_millis = throttled_until_millis.asInstanceOf[js.Any], total = total.asInstanceOf[js.Any], updated = updated.asInstanceOf[js.Any], version_conflicts = version_conflicts.asInstanceOf[js.Any])
    __obj.asInstanceOf[ReindexOrByQueryResponseSlice]
  }
  
  extension [Self <: ReindexOrByQueryResponseSlice](x: Self) {
    
    inline def setSlice_id(value: Double): Self = StObject.set(x, "slice_id", value.asInstanceOf[js.Any])
  }
}
