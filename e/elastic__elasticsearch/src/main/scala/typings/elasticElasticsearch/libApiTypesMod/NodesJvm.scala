package typings.elasticElasticsearch.libApiTypesMod

import typings.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait NodesJvm extends StObject {
  
  var buffer_pools: js.UndefOr[Record[String, NodesNodeBufferPool]] = js.undefined
  
  var classes: js.UndefOr[NodesJvmClasses] = js.undefined
  
  var gc: js.UndefOr[NodesGarbageCollector] = js.undefined
  
  var mem: js.UndefOr[NodesJvmMemoryStats] = js.undefined
  
  var threads: js.UndefOr[NodesJvmThreads] = js.undefined
  
  var timestamp: js.UndefOr[long] = js.undefined
  
  var uptime: js.UndefOr[String] = js.undefined
  
  var uptime_in_millis: js.UndefOr[long] = js.undefined
}
object NodesJvm {
  
  inline def apply(): NodesJvm = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[NodesJvm]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: NodesJvm] (val x: Self) extends AnyVal {
    
    inline def setBuffer_pools(value: Record[String, NodesNodeBufferPool]): Self = StObject.set(x, "buffer_pools", value.asInstanceOf[js.Any])
    
    inline def setBuffer_poolsUndefined: Self = StObject.set(x, "buffer_pools", js.undefined)
    
    inline def setClasses(value: NodesJvmClasses): Self = StObject.set(x, "classes", value.asInstanceOf[js.Any])
    
    inline def setClassesUndefined: Self = StObject.set(x, "classes", js.undefined)
    
    inline def setGc(value: NodesGarbageCollector): Self = StObject.set(x, "gc", value.asInstanceOf[js.Any])
    
    inline def setGcUndefined: Self = StObject.set(x, "gc", js.undefined)
    
    inline def setMem(value: NodesJvmMemoryStats): Self = StObject.set(x, "mem", value.asInstanceOf[js.Any])
    
    inline def setMemUndefined: Self = StObject.set(x, "mem", js.undefined)
    
    inline def setThreads(value: NodesJvmThreads): Self = StObject.set(x, "threads", value.asInstanceOf[js.Any])
    
    inline def setThreadsUndefined: Self = StObject.set(x, "threads", js.undefined)
    
    inline def setTimestamp(value: long): Self = StObject.set(x, "timestamp", value.asInstanceOf[js.Any])
    
    inline def setTimestampUndefined: Self = StObject.set(x, "timestamp", js.undefined)
    
    inline def setUptime(value: String): Self = StObject.set(x, "uptime", value.asInstanceOf[js.Any])
    
    inline def setUptimeUndefined: Self = StObject.set(x, "uptime", js.undefined)
    
    inline def setUptime_in_millis(value: long): Self = StObject.set(x, "uptime_in_millis", value.asInstanceOf[js.Any])
    
    inline def setUptime_in_millisUndefined: Self = StObject.set(x, "uptime_in_millis", js.undefined)
  }
}
