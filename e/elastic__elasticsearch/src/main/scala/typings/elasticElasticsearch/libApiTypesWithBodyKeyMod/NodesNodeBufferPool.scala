package typings.elasticElasticsearch.libApiTypesWithBodyKeyMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait NodesNodeBufferPool extends StObject {
  
  var count: js.UndefOr[long] = js.undefined
  
  var total_capacity: js.UndefOr[String] = js.undefined
  
  var total_capacity_in_bytes: js.UndefOr[long] = js.undefined
  
  var used: js.UndefOr[String] = js.undefined
  
  var used_in_bytes: js.UndefOr[long] = js.undefined
}
object NodesNodeBufferPool {
  
  inline def apply(): NodesNodeBufferPool = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[NodesNodeBufferPool]
  }
  
  extension [Self <: NodesNodeBufferPool](x: Self) {
    
    inline def setCount(value: long): Self = StObject.set(x, "count", value.asInstanceOf[js.Any])
    
    inline def setCountUndefined: Self = StObject.set(x, "count", js.undefined)
    
    inline def setTotal_capacity(value: String): Self = StObject.set(x, "total_capacity", value.asInstanceOf[js.Any])
    
    inline def setTotal_capacityUndefined: Self = StObject.set(x, "total_capacity", js.undefined)
    
    inline def setTotal_capacity_in_bytes(value: long): Self = StObject.set(x, "total_capacity_in_bytes", value.asInstanceOf[js.Any])
    
    inline def setTotal_capacity_in_bytesUndefined: Self = StObject.set(x, "total_capacity_in_bytes", js.undefined)
    
    inline def setUsed(value: String): Self = StObject.set(x, "used", value.asInstanceOf[js.Any])
    
    inline def setUsedUndefined: Self = StObject.set(x, "used", js.undefined)
    
    inline def setUsed_in_bytes(value: long): Self = StObject.set(x, "used_in_bytes", value.asInstanceOf[js.Any])
    
    inline def setUsed_in_bytesUndefined: Self = StObject.set(x, "used_in_bytes", js.undefined)
  }
}
