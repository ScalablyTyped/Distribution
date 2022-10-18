package typings.elasticElasticsearch.libApiTypesWithBodyKeyMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait NodesCgroup extends StObject {
  
  var cpu: js.UndefOr[NodesCgroupCpu] = js.undefined
  
  var cpuacct: js.UndefOr[NodesCpuAcct] = js.undefined
  
  var memory: js.UndefOr[NodesCgroupMemory] = js.undefined
}
object NodesCgroup {
  
  inline def apply(): NodesCgroup = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[NodesCgroup]
  }
  
  extension [Self <: NodesCgroup](x: Self) {
    
    inline def setCpu(value: NodesCgroupCpu): Self = StObject.set(x, "cpu", value.asInstanceOf[js.Any])
    
    inline def setCpuUndefined: Self = StObject.set(x, "cpu", js.undefined)
    
    inline def setCpuacct(value: NodesCpuAcct): Self = StObject.set(x, "cpuacct", value.asInstanceOf[js.Any])
    
    inline def setCpuacctUndefined: Self = StObject.set(x, "cpuacct", js.undefined)
    
    inline def setMemory(value: NodesCgroupMemory): Self = StObject.set(x, "memory", value.asInstanceOf[js.Any])
    
    inline def setMemoryUndefined: Self = StObject.set(x, "memory", js.undefined)
  }
}
