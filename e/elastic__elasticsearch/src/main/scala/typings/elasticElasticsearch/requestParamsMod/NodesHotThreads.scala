package typings.elasticElasticsearch.requestParamsMod

import typings.elasticElasticsearch.elasticElasticsearchStrings.block
import typings.elasticElasticsearch.elasticElasticsearchStrings.cpu
import typings.elasticElasticsearch.elasticElasticsearchStrings.wait
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait NodesHotThreads
  extends StObject
     with Generic {
  
  var ignore_idle_threads: js.UndefOr[Boolean] = js.undefined
  
  var interval: js.UndefOr[String] = js.undefined
  
  var node_id: js.UndefOr[String | js.Array[String]] = js.undefined
  
  var snapshots: js.UndefOr[Double] = js.undefined
  
  var threads: js.UndefOr[Double] = js.undefined
  
  var timeout: js.UndefOr[String] = js.undefined
  
  var `type`: js.UndefOr[cpu | wait | block] = js.undefined
}
object NodesHotThreads {
  
  inline def apply(): NodesHotThreads = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[NodesHotThreads]
  }
  
  extension [Self <: NodesHotThreads](x: Self) {
    
    inline def setIgnore_idle_threads(value: Boolean): Self = StObject.set(x, "ignore_idle_threads", value.asInstanceOf[js.Any])
    
    inline def setIgnore_idle_threadsUndefined: Self = StObject.set(x, "ignore_idle_threads", js.undefined)
    
    inline def setInterval(value: String): Self = StObject.set(x, "interval", value.asInstanceOf[js.Any])
    
    inline def setIntervalUndefined: Self = StObject.set(x, "interval", js.undefined)
    
    inline def setNode_id(value: String | js.Array[String]): Self = StObject.set(x, "node_id", value.asInstanceOf[js.Any])
    
    inline def setNode_idUndefined: Self = StObject.set(x, "node_id", js.undefined)
    
    inline def setNode_idVarargs(value: String*): Self = StObject.set(x, "node_id", js.Array(value :_*))
    
    inline def setSnapshots(value: Double): Self = StObject.set(x, "snapshots", value.asInstanceOf[js.Any])
    
    inline def setSnapshotsUndefined: Self = StObject.set(x, "snapshots", js.undefined)
    
    inline def setThreads(value: Double): Self = StObject.set(x, "threads", value.asInstanceOf[js.Any])
    
    inline def setThreadsUndefined: Self = StObject.set(x, "threads", js.undefined)
    
    inline def setTimeout(value: String): Self = StObject.set(x, "timeout", value.asInstanceOf[js.Any])
    
    inline def setTimeoutUndefined: Self = StObject.set(x, "timeout", js.undefined)
    
    inline def setType(value: cpu | wait | block): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    inline def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
  }
}
