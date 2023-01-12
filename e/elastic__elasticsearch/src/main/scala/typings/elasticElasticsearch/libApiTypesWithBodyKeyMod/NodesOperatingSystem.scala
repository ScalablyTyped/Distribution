package typings.elasticElasticsearch.libApiTypesWithBodyKeyMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait NodesOperatingSystem extends StObject {
  
  var cgroup: js.UndefOr[NodesCgroup] = js.undefined
  
  var cpu: js.UndefOr[NodesCpu] = js.undefined
  
  var mem: js.UndefOr[NodesExtendedMemoryStats] = js.undefined
  
  var swap: js.UndefOr[NodesMemoryStats] = js.undefined
  
  var timestamp: js.UndefOr[long] = js.undefined
}
object NodesOperatingSystem {
  
  inline def apply(): NodesOperatingSystem = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[NodesOperatingSystem]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: NodesOperatingSystem] (val x: Self) extends AnyVal {
    
    inline def setCgroup(value: NodesCgroup): Self = StObject.set(x, "cgroup", value.asInstanceOf[js.Any])
    
    inline def setCgroupUndefined: Self = StObject.set(x, "cgroup", js.undefined)
    
    inline def setCpu(value: NodesCpu): Self = StObject.set(x, "cpu", value.asInstanceOf[js.Any])
    
    inline def setCpuUndefined: Self = StObject.set(x, "cpu", js.undefined)
    
    inline def setMem(value: NodesExtendedMemoryStats): Self = StObject.set(x, "mem", value.asInstanceOf[js.Any])
    
    inline def setMemUndefined: Self = StObject.set(x, "mem", js.undefined)
    
    inline def setSwap(value: NodesMemoryStats): Self = StObject.set(x, "swap", value.asInstanceOf[js.Any])
    
    inline def setSwapUndefined: Self = StObject.set(x, "swap", js.undefined)
    
    inline def setTimestamp(value: long): Self = StObject.set(x, "timestamp", value.asInstanceOf[js.Any])
    
    inline def setTimestampUndefined: Self = StObject.set(x, "timestamp", js.undefined)
  }
}
