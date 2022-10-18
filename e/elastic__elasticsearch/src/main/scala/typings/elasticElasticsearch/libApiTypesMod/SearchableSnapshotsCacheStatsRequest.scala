package typings.elasticElasticsearch.libApiTypesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SearchableSnapshotsCacheStatsRequest
  extends StObject
     with SpecUtilsCommonQueryParameters {
  
  var master_timeout: js.UndefOr[Duration] = js.undefined
  
  var node_id: js.UndefOr[NodeIds] = js.undefined
}
object SearchableSnapshotsCacheStatsRequest {
  
  inline def apply(): SearchableSnapshotsCacheStatsRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SearchableSnapshotsCacheStatsRequest]
  }
  
  extension [Self <: SearchableSnapshotsCacheStatsRequest](x: Self) {
    
    inline def setMaster_timeout(value: Duration): Self = StObject.set(x, "master_timeout", value.asInstanceOf[js.Any])
    
    inline def setMaster_timeoutUndefined: Self = StObject.set(x, "master_timeout", js.undefined)
    
    inline def setNode_id(value: NodeIds): Self = StObject.set(x, "node_id", value.asInstanceOf[js.Any])
    
    inline def setNode_idUndefined: Self = StObject.set(x, "node_id", js.undefined)
    
    inline def setNode_idVarargs(value: NodeId*): Self = StObject.set(x, "node_id", js.Array(value*))
  }
}
