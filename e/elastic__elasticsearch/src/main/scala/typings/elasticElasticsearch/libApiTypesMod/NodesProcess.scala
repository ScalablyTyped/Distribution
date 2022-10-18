package typings.elasticElasticsearch.libApiTypesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait NodesProcess extends StObject {
  
  var cpu: js.UndefOr[NodesCpu] = js.undefined
  
  var max_file_descriptors: js.UndefOr[integer] = js.undefined
  
  var mem: js.UndefOr[NodesMemoryStats] = js.undefined
  
  var open_file_descriptors: js.UndefOr[integer] = js.undefined
  
  var timestamp: js.UndefOr[long] = js.undefined
}
object NodesProcess {
  
  inline def apply(): NodesProcess = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[NodesProcess]
  }
  
  extension [Self <: NodesProcess](x: Self) {
    
    inline def setCpu(value: NodesCpu): Self = StObject.set(x, "cpu", value.asInstanceOf[js.Any])
    
    inline def setCpuUndefined: Self = StObject.set(x, "cpu", js.undefined)
    
    inline def setMax_file_descriptors(value: integer): Self = StObject.set(x, "max_file_descriptors", value.asInstanceOf[js.Any])
    
    inline def setMax_file_descriptorsUndefined: Self = StObject.set(x, "max_file_descriptors", js.undefined)
    
    inline def setMem(value: NodesMemoryStats): Self = StObject.set(x, "mem", value.asInstanceOf[js.Any])
    
    inline def setMemUndefined: Self = StObject.set(x, "mem", js.undefined)
    
    inline def setOpen_file_descriptors(value: integer): Self = StObject.set(x, "open_file_descriptors", value.asInstanceOf[js.Any])
    
    inline def setOpen_file_descriptorsUndefined: Self = StObject.set(x, "open_file_descriptors", js.undefined)
    
    inline def setTimestamp(value: long): Self = StObject.set(x, "timestamp", value.asInstanceOf[js.Any])
    
    inline def setTimestampUndefined: Self = StObject.set(x, "timestamp", js.undefined)
  }
}
