package typings.elasticElasticsearch.libApiTypesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ClusterStatsClusterJvmMemory extends StObject {
  
  var heap_max_in_bytes: long
  
  var heap_used_in_bytes: long
}
object ClusterStatsClusterJvmMemory {
  
  inline def apply(heap_max_in_bytes: long, heap_used_in_bytes: long): ClusterStatsClusterJvmMemory = {
    val __obj = js.Dynamic.literal(heap_max_in_bytes = heap_max_in_bytes.asInstanceOf[js.Any], heap_used_in_bytes = heap_used_in_bytes.asInstanceOf[js.Any])
    __obj.asInstanceOf[ClusterStatsClusterJvmMemory]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ClusterStatsClusterJvmMemory] (val x: Self) extends AnyVal {
    
    inline def setHeap_max_in_bytes(value: long): Self = StObject.set(x, "heap_max_in_bytes", value.asInstanceOf[js.Any])
    
    inline def setHeap_used_in_bytes(value: long): Self = StObject.set(x, "heap_used_in_bytes", value.asInstanceOf[js.Any])
  }
}
