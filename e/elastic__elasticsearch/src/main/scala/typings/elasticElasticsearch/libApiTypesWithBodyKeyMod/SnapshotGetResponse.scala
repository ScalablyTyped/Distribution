package typings.elasticElasticsearch.libApiTypesWithBodyKeyMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SnapshotGetResponse extends StObject {
  
  var remaining: integer
  
  var responses: js.UndefOr[js.Array[SnapshotGetSnapshotResponseItem]] = js.undefined
  
  var snapshots: js.UndefOr[js.Array[SnapshotSnapshotInfo]] = js.undefined
  
  var total: integer
}
object SnapshotGetResponse {
  
  inline def apply(remaining: integer, total: integer): SnapshotGetResponse = {
    val __obj = js.Dynamic.literal(remaining = remaining.asInstanceOf[js.Any], total = total.asInstanceOf[js.Any])
    __obj.asInstanceOf[SnapshotGetResponse]
  }
  
  extension [Self <: SnapshotGetResponse](x: Self) {
    
    inline def setRemaining(value: integer): Self = StObject.set(x, "remaining", value.asInstanceOf[js.Any])
    
    inline def setResponses(value: js.Array[SnapshotGetSnapshotResponseItem]): Self = StObject.set(x, "responses", value.asInstanceOf[js.Any])
    
    inline def setResponsesUndefined: Self = StObject.set(x, "responses", js.undefined)
    
    inline def setResponsesVarargs(value: SnapshotGetSnapshotResponseItem*): Self = StObject.set(x, "responses", js.Array(value*))
    
    inline def setSnapshots(value: js.Array[SnapshotSnapshotInfo]): Self = StObject.set(x, "snapshots", value.asInstanceOf[js.Any])
    
    inline def setSnapshotsUndefined: Self = StObject.set(x, "snapshots", js.undefined)
    
    inline def setSnapshotsVarargs(value: SnapshotSnapshotInfo*): Self = StObject.set(x, "snapshots", js.Array(value*))
    
    inline def setTotal(value: integer): Self = StObject.set(x, "total", value.asInstanceOf[js.Any])
  }
}
