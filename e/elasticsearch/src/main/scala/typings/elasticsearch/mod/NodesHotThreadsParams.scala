package typings.elasticsearch.mod

import typings.elasticsearch.elasticsearchStrings.blocked
import typings.elasticsearch.elasticsearchStrings.cpu
import typings.elasticsearch.elasticsearchStrings.wait
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait NodesHotThreadsParams extends GenericParams {
  
  var ignoreIdleThreads: js.UndefOr[Boolean] = js.native
  
  var interval: js.UndefOr[TimeSpan] = js.native
  
  var nodeId: NameList = js.native
  
  var snapshots: js.UndefOr[Double] = js.native
  
  var threads: js.UndefOr[Double] = js.native
  
  var timeout: js.UndefOr[TimeSpan] = js.native
  
  var `type`: js.UndefOr[cpu | wait | blocked] = js.native
}
object NodesHotThreadsParams {
  
  @scala.inline
  def apply(nodeId: NameList): NodesHotThreadsParams = {
    val __obj = js.Dynamic.literal(nodeId = nodeId.asInstanceOf[js.Any])
    __obj.asInstanceOf[NodesHotThreadsParams]
  }
  
  @scala.inline
  implicit class NodesHotThreadsParamsMutableBuilder[Self <: NodesHotThreadsParams] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setIgnoreIdleThreads(value: Boolean): Self = StObject.set(x, "ignoreIdleThreads", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIgnoreIdleThreadsUndefined: Self = StObject.set(x, "ignoreIdleThreads", js.undefined)
    
    @scala.inline
    def setInterval(value: TimeSpan): Self = StObject.set(x, "interval", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIntervalUndefined: Self = StObject.set(x, "interval", js.undefined)
    
    @scala.inline
    def setNodeId(value: NameList): Self = StObject.set(x, "nodeId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNodeIdVarargs(value: String*): Self = StObject.set(x, "nodeId", js.Array(value :_*))
    
    @scala.inline
    def setSnapshots(value: Double): Self = StObject.set(x, "snapshots", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSnapshotsUndefined: Self = StObject.set(x, "snapshots", js.undefined)
    
    @scala.inline
    def setThreads(value: Double): Self = StObject.set(x, "threads", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setThreadsUndefined: Self = StObject.set(x, "threads", js.undefined)
    
    @scala.inline
    def setTimeout(value: TimeSpan): Self = StObject.set(x, "timeout", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTimeoutUndefined: Self = StObject.set(x, "timeout", js.undefined)
    
    @scala.inline
    def setType(value: cpu | wait | blocked): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
  }
}
