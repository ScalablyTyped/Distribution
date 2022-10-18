package typings.elasticElasticsearch.libApiTypesWithBodyKeyMod

import typings.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait NodesJvmMemoryStats extends StObject {
  
  var heap_committed_in_bytes: js.UndefOr[long] = js.undefined
  
  var heap_max_in_bytes: js.UndefOr[long] = js.undefined
  
  var heap_used_in_bytes: js.UndefOr[long] = js.undefined
  
  var heap_used_percent: js.UndefOr[long] = js.undefined
  
  var non_heap_committed_in_bytes: js.UndefOr[long] = js.undefined
  
  var non_heap_used_in_bytes: js.UndefOr[long] = js.undefined
  
  var pools: js.UndefOr[Record[String, NodesPool]] = js.undefined
}
object NodesJvmMemoryStats {
  
  inline def apply(): NodesJvmMemoryStats = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[NodesJvmMemoryStats]
  }
  
  extension [Self <: NodesJvmMemoryStats](x: Self) {
    
    inline def setHeap_committed_in_bytes(value: long): Self = StObject.set(x, "heap_committed_in_bytes", value.asInstanceOf[js.Any])
    
    inline def setHeap_committed_in_bytesUndefined: Self = StObject.set(x, "heap_committed_in_bytes", js.undefined)
    
    inline def setHeap_max_in_bytes(value: long): Self = StObject.set(x, "heap_max_in_bytes", value.asInstanceOf[js.Any])
    
    inline def setHeap_max_in_bytesUndefined: Self = StObject.set(x, "heap_max_in_bytes", js.undefined)
    
    inline def setHeap_used_in_bytes(value: long): Self = StObject.set(x, "heap_used_in_bytes", value.asInstanceOf[js.Any])
    
    inline def setHeap_used_in_bytesUndefined: Self = StObject.set(x, "heap_used_in_bytes", js.undefined)
    
    inline def setHeap_used_percent(value: long): Self = StObject.set(x, "heap_used_percent", value.asInstanceOf[js.Any])
    
    inline def setHeap_used_percentUndefined: Self = StObject.set(x, "heap_used_percent", js.undefined)
    
    inline def setNon_heap_committed_in_bytes(value: long): Self = StObject.set(x, "non_heap_committed_in_bytes", value.asInstanceOf[js.Any])
    
    inline def setNon_heap_committed_in_bytesUndefined: Self = StObject.set(x, "non_heap_committed_in_bytes", js.undefined)
    
    inline def setNon_heap_used_in_bytes(value: long): Self = StObject.set(x, "non_heap_used_in_bytes", value.asInstanceOf[js.Any])
    
    inline def setNon_heap_used_in_bytesUndefined: Self = StObject.set(x, "non_heap_used_in_bytes", js.undefined)
    
    inline def setPools(value: Record[String, NodesPool]): Self = StObject.set(x, "pools", value.asInstanceOf[js.Any])
    
    inline def setPoolsUndefined: Self = StObject.set(x, "pools", js.undefined)
  }
}
