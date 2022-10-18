package typings.elasticElasticsearch.libApiTypesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait NodesPool extends StObject {
  
  var max_in_bytes: js.UndefOr[long] = js.undefined
  
  var peak_max_in_bytes: js.UndefOr[long] = js.undefined
  
  var peak_used_in_bytes: js.UndefOr[long] = js.undefined
  
  var used_in_bytes: js.UndefOr[long] = js.undefined
}
object NodesPool {
  
  inline def apply(): NodesPool = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[NodesPool]
  }
  
  extension [Self <: NodesPool](x: Self) {
    
    inline def setMax_in_bytes(value: long): Self = StObject.set(x, "max_in_bytes", value.asInstanceOf[js.Any])
    
    inline def setMax_in_bytesUndefined: Self = StObject.set(x, "max_in_bytes", js.undefined)
    
    inline def setPeak_max_in_bytes(value: long): Self = StObject.set(x, "peak_max_in_bytes", value.asInstanceOf[js.Any])
    
    inline def setPeak_max_in_bytesUndefined: Self = StObject.set(x, "peak_max_in_bytes", js.undefined)
    
    inline def setPeak_used_in_bytes(value: long): Self = StObject.set(x, "peak_used_in_bytes", value.asInstanceOf[js.Any])
    
    inline def setPeak_used_in_bytesUndefined: Self = StObject.set(x, "peak_used_in_bytes", js.undefined)
    
    inline def setUsed_in_bytes(value: long): Self = StObject.set(x, "used_in_bytes", value.asInstanceOf[js.Any])
    
    inline def setUsed_in_bytesUndefined: Self = StObject.set(x, "used_in_bytes", js.undefined)
  }
}
