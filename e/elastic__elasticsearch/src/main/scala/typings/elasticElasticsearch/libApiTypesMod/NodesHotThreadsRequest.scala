package typings.elasticElasticsearch.libApiTypesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait NodesHotThreadsRequest
  extends StObject
     with SpecUtilsCommonQueryParameters {
  
  var ignore_idle_threads: js.UndefOr[Boolean] = js.undefined
  
  var interval: js.UndefOr[Duration] = js.undefined
  
  var master_timeout: js.UndefOr[Duration] = js.undefined
  
  var node_id: js.UndefOr[NodeIds] = js.undefined
  
  var snapshots: js.UndefOr[long] = js.undefined
  
  var sort: js.UndefOr[ThreadType] = js.undefined
  
  var threads: js.UndefOr[long] = js.undefined
  
  var timeout: js.UndefOr[Duration] = js.undefined
  
  var `type`: js.UndefOr[ThreadType] = js.undefined
}
object NodesHotThreadsRequest {
  
  inline def apply(): NodesHotThreadsRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[NodesHotThreadsRequest]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: NodesHotThreadsRequest] (val x: Self) extends AnyVal {
    
    inline def setIgnore_idle_threads(value: Boolean): Self = StObject.set(x, "ignore_idle_threads", value.asInstanceOf[js.Any])
    
    inline def setIgnore_idle_threadsUndefined: Self = StObject.set(x, "ignore_idle_threads", js.undefined)
    
    inline def setInterval(value: Duration): Self = StObject.set(x, "interval", value.asInstanceOf[js.Any])
    
    inline def setIntervalUndefined: Self = StObject.set(x, "interval", js.undefined)
    
    inline def setMaster_timeout(value: Duration): Self = StObject.set(x, "master_timeout", value.asInstanceOf[js.Any])
    
    inline def setMaster_timeoutUndefined: Self = StObject.set(x, "master_timeout", js.undefined)
    
    inline def setNode_id(value: NodeIds): Self = StObject.set(x, "node_id", value.asInstanceOf[js.Any])
    
    inline def setNode_idUndefined: Self = StObject.set(x, "node_id", js.undefined)
    
    inline def setNode_idVarargs(value: NodeId*): Self = StObject.set(x, "node_id", js.Array(value*))
    
    inline def setSnapshots(value: long): Self = StObject.set(x, "snapshots", value.asInstanceOf[js.Any])
    
    inline def setSnapshotsUndefined: Self = StObject.set(x, "snapshots", js.undefined)
    
    inline def setSort(value: ThreadType): Self = StObject.set(x, "sort", value.asInstanceOf[js.Any])
    
    inline def setSortUndefined: Self = StObject.set(x, "sort", js.undefined)
    
    inline def setThreads(value: long): Self = StObject.set(x, "threads", value.asInstanceOf[js.Any])
    
    inline def setThreadsUndefined: Self = StObject.set(x, "threads", js.undefined)
    
    inline def setTimeout(value: Duration): Self = StObject.set(x, "timeout", value.asInstanceOf[js.Any])
    
    inline def setTimeoutUndefined: Self = StObject.set(x, "timeout", js.undefined)
    
    inline def setType(value: ThreadType): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    inline def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
  }
}
