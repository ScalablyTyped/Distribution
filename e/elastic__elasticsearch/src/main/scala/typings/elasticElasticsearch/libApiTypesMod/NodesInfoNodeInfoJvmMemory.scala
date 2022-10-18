package typings.elasticElasticsearch.libApiTypesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait NodesInfoNodeInfoJvmMemory extends StObject {
  
  var direct_max: js.UndefOr[ByteSize] = js.undefined
  
  var direct_max_in_bytes: long
  
  var heap_init: js.UndefOr[ByteSize] = js.undefined
  
  var heap_init_in_bytes: long
  
  var heap_max: js.UndefOr[ByteSize] = js.undefined
  
  var heap_max_in_bytes: long
  
  var non_heap_init: js.UndefOr[ByteSize] = js.undefined
  
  var non_heap_init_in_bytes: long
  
  var non_heap_max: js.UndefOr[ByteSize] = js.undefined
  
  var non_heap_max_in_bytes: long
}
object NodesInfoNodeInfoJvmMemory {
  
  inline def apply(
    direct_max_in_bytes: long,
    heap_init_in_bytes: long,
    heap_max_in_bytes: long,
    non_heap_init_in_bytes: long,
    non_heap_max_in_bytes: long
  ): NodesInfoNodeInfoJvmMemory = {
    val __obj = js.Dynamic.literal(direct_max_in_bytes = direct_max_in_bytes.asInstanceOf[js.Any], heap_init_in_bytes = heap_init_in_bytes.asInstanceOf[js.Any], heap_max_in_bytes = heap_max_in_bytes.asInstanceOf[js.Any], non_heap_init_in_bytes = non_heap_init_in_bytes.asInstanceOf[js.Any], non_heap_max_in_bytes = non_heap_max_in_bytes.asInstanceOf[js.Any])
    __obj.asInstanceOf[NodesInfoNodeInfoJvmMemory]
  }
  
  extension [Self <: NodesInfoNodeInfoJvmMemory](x: Self) {
    
    inline def setDirect_max(value: ByteSize): Self = StObject.set(x, "direct_max", value.asInstanceOf[js.Any])
    
    inline def setDirect_maxUndefined: Self = StObject.set(x, "direct_max", js.undefined)
    
    inline def setDirect_max_in_bytes(value: long): Self = StObject.set(x, "direct_max_in_bytes", value.asInstanceOf[js.Any])
    
    inline def setHeap_init(value: ByteSize): Self = StObject.set(x, "heap_init", value.asInstanceOf[js.Any])
    
    inline def setHeap_initUndefined: Self = StObject.set(x, "heap_init", js.undefined)
    
    inline def setHeap_init_in_bytes(value: long): Self = StObject.set(x, "heap_init_in_bytes", value.asInstanceOf[js.Any])
    
    inline def setHeap_max(value: ByteSize): Self = StObject.set(x, "heap_max", value.asInstanceOf[js.Any])
    
    inline def setHeap_maxUndefined: Self = StObject.set(x, "heap_max", js.undefined)
    
    inline def setHeap_max_in_bytes(value: long): Self = StObject.set(x, "heap_max_in_bytes", value.asInstanceOf[js.Any])
    
    inline def setNon_heap_init(value: ByteSize): Self = StObject.set(x, "non_heap_init", value.asInstanceOf[js.Any])
    
    inline def setNon_heap_initUndefined: Self = StObject.set(x, "non_heap_init", js.undefined)
    
    inline def setNon_heap_init_in_bytes(value: long): Self = StObject.set(x, "non_heap_init_in_bytes", value.asInstanceOf[js.Any])
    
    inline def setNon_heap_max(value: ByteSize): Self = StObject.set(x, "non_heap_max", value.asInstanceOf[js.Any])
    
    inline def setNon_heap_maxUndefined: Self = StObject.set(x, "non_heap_max", js.undefined)
    
    inline def setNon_heap_max_in_bytes(value: long): Self = StObject.set(x, "non_heap_max_in_bytes", value.asInstanceOf[js.Any])
  }
}
