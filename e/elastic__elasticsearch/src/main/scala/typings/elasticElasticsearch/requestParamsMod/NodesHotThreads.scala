package typings.elasticElasticsearch.requestParamsMod

import typings.elasticElasticsearch.elasticElasticsearchStrings.block
import typings.elasticElasticsearch.elasticElasticsearchStrings.cpu
import typings.elasticElasticsearch.elasticElasticsearchStrings.wait
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait NodesHotThreads extends Generic {
  
  var ignore_idle_threads: js.UndefOr[Boolean] = js.native
  
  var interval: js.UndefOr[String] = js.native
  
  var node_id: js.UndefOr[String | js.Array[String]] = js.native
  
  var snapshots: js.UndefOr[Double] = js.native
  
  var threads: js.UndefOr[Double] = js.native
  
  var timeout: js.UndefOr[String] = js.native
  
  var `type`: js.UndefOr[cpu | wait | block] = js.native
}
object NodesHotThreads {
  
  @scala.inline
  def apply(): NodesHotThreads = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[NodesHotThreads]
  }
  
  @scala.inline
  implicit class NodesHotThreadsMutableBuilder[Self <: NodesHotThreads] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setIgnore_idle_threads(value: Boolean): Self = StObject.set(x, "ignore_idle_threads", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIgnore_idle_threadsUndefined: Self = StObject.set(x, "ignore_idle_threads", js.undefined)
    
    @scala.inline
    def setInterval(value: String): Self = StObject.set(x, "interval", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIntervalUndefined: Self = StObject.set(x, "interval", js.undefined)
    
    @scala.inline
    def setNode_id(value: String | js.Array[String]): Self = StObject.set(x, "node_id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNode_idUndefined: Self = StObject.set(x, "node_id", js.undefined)
    
    @scala.inline
    def setNode_idVarargs(value: String*): Self = StObject.set(x, "node_id", js.Array(value :_*))
    
    @scala.inline
    def setSnapshots(value: Double): Self = StObject.set(x, "snapshots", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSnapshotsUndefined: Self = StObject.set(x, "snapshots", js.undefined)
    
    @scala.inline
    def setThreads(value: Double): Self = StObject.set(x, "threads", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setThreadsUndefined: Self = StObject.set(x, "threads", js.undefined)
    
    @scala.inline
    def setTimeout(value: String): Self = StObject.set(x, "timeout", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTimeoutUndefined: Self = StObject.set(x, "timeout", js.undefined)
    
    @scala.inline
    def setType(value: cpu | wait | block): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
  }
}
