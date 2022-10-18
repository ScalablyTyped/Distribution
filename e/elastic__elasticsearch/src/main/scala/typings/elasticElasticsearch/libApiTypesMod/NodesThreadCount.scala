package typings.elasticElasticsearch.libApiTypesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait NodesThreadCount extends StObject {
  
  var active: js.UndefOr[long] = js.undefined
  
  var completed: js.UndefOr[long] = js.undefined
  
  var largest: js.UndefOr[long] = js.undefined
  
  var queue: js.UndefOr[long] = js.undefined
  
  var rejected: js.UndefOr[long] = js.undefined
  
  var threads: js.UndefOr[long] = js.undefined
}
object NodesThreadCount {
  
  inline def apply(): NodesThreadCount = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[NodesThreadCount]
  }
  
  extension [Self <: NodesThreadCount](x: Self) {
    
    inline def setActive(value: long): Self = StObject.set(x, "active", value.asInstanceOf[js.Any])
    
    inline def setActiveUndefined: Self = StObject.set(x, "active", js.undefined)
    
    inline def setCompleted(value: long): Self = StObject.set(x, "completed", value.asInstanceOf[js.Any])
    
    inline def setCompletedUndefined: Self = StObject.set(x, "completed", js.undefined)
    
    inline def setLargest(value: long): Self = StObject.set(x, "largest", value.asInstanceOf[js.Any])
    
    inline def setLargestUndefined: Self = StObject.set(x, "largest", js.undefined)
    
    inline def setQueue(value: long): Self = StObject.set(x, "queue", value.asInstanceOf[js.Any])
    
    inline def setQueueUndefined: Self = StObject.set(x, "queue", js.undefined)
    
    inline def setRejected(value: long): Self = StObject.set(x, "rejected", value.asInstanceOf[js.Any])
    
    inline def setRejectedUndefined: Self = StObject.set(x, "rejected", js.undefined)
    
    inline def setThreads(value: long): Self = StObject.set(x, "threads", value.asInstanceOf[js.Any])
    
    inline def setThreadsUndefined: Self = StObject.set(x, "threads", js.undefined)
  }
}
