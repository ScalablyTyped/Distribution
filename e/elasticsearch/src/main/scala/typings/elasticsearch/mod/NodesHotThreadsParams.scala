package typings.elasticsearch.mod

import typings.elasticsearch.elasticsearchStrings.blocked
import typings.elasticsearch.elasticsearchStrings.cpu
import typings.elasticsearch.elasticsearchStrings.wait
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait NodesHotThreadsParams
  extends StObject
     with GenericParams {
  
  var ignoreIdleThreads: js.UndefOr[Boolean] = js.undefined
  
  var interval: js.UndefOr[TimeSpan] = js.undefined
  
  var nodeId: NameList
  
  var snapshots: js.UndefOr[Double] = js.undefined
  
  var threads: js.UndefOr[Double] = js.undefined
  
  var timeout: js.UndefOr[TimeSpan] = js.undefined
  
  var `type`: js.UndefOr[cpu | wait | blocked] = js.undefined
}
object NodesHotThreadsParams {
  
  inline def apply(nodeId: NameList): NodesHotThreadsParams = {
    val __obj = js.Dynamic.literal(nodeId = nodeId.asInstanceOf[js.Any])
    __obj.asInstanceOf[NodesHotThreadsParams]
  }
  
  extension [Self <: NodesHotThreadsParams](x: Self) {
    
    inline def setIgnoreIdleThreads(value: Boolean): Self = StObject.set(x, "ignoreIdleThreads", value.asInstanceOf[js.Any])
    
    inline def setIgnoreIdleThreadsUndefined: Self = StObject.set(x, "ignoreIdleThreads", js.undefined)
    
    inline def setInterval(value: TimeSpan): Self = StObject.set(x, "interval", value.asInstanceOf[js.Any])
    
    inline def setIntervalUndefined: Self = StObject.set(x, "interval", js.undefined)
    
    inline def setNodeId(value: NameList): Self = StObject.set(x, "nodeId", value.asInstanceOf[js.Any])
    
    inline def setNodeIdVarargs(value: String*): Self = StObject.set(x, "nodeId", js.Array(value*))
    
    inline def setSnapshots(value: Double): Self = StObject.set(x, "snapshots", value.asInstanceOf[js.Any])
    
    inline def setSnapshotsUndefined: Self = StObject.set(x, "snapshots", js.undefined)
    
    inline def setThreads(value: Double): Self = StObject.set(x, "threads", value.asInstanceOf[js.Any])
    
    inline def setThreadsUndefined: Self = StObject.set(x, "threads", js.undefined)
    
    inline def setTimeout(value: TimeSpan): Self = StObject.set(x, "timeout", value.asInstanceOf[js.Any])
    
    inline def setTimeoutUndefined: Self = StObject.set(x, "timeout", js.undefined)
    
    inline def setType(value: cpu | wait | blocked): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    inline def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
  }
}
