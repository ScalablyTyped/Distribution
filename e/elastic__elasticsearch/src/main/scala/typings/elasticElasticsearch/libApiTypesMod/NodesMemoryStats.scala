package typings.elasticElasticsearch.libApiTypesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait NodesMemoryStats extends StObject {
  
  var adjusted_total_in_bytes: js.UndefOr[long] = js.undefined
  
  var free_in_bytes: js.UndefOr[long] = js.undefined
  
  var resident: js.UndefOr[String] = js.undefined
  
  var resident_in_bytes: js.UndefOr[long] = js.undefined
  
  var share: js.UndefOr[String] = js.undefined
  
  var share_in_bytes: js.UndefOr[long] = js.undefined
  
  var total_in_bytes: js.UndefOr[long] = js.undefined
  
  var total_virtual: js.UndefOr[String] = js.undefined
  
  var total_virtual_in_bytes: js.UndefOr[long] = js.undefined
  
  var used_in_bytes: js.UndefOr[long] = js.undefined
}
object NodesMemoryStats {
  
  inline def apply(): NodesMemoryStats = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[NodesMemoryStats]
  }
  
  extension [Self <: NodesMemoryStats](x: Self) {
    
    inline def setAdjusted_total_in_bytes(value: long): Self = StObject.set(x, "adjusted_total_in_bytes", value.asInstanceOf[js.Any])
    
    inline def setAdjusted_total_in_bytesUndefined: Self = StObject.set(x, "adjusted_total_in_bytes", js.undefined)
    
    inline def setFree_in_bytes(value: long): Self = StObject.set(x, "free_in_bytes", value.asInstanceOf[js.Any])
    
    inline def setFree_in_bytesUndefined: Self = StObject.set(x, "free_in_bytes", js.undefined)
    
    inline def setResident(value: String): Self = StObject.set(x, "resident", value.asInstanceOf[js.Any])
    
    inline def setResidentUndefined: Self = StObject.set(x, "resident", js.undefined)
    
    inline def setResident_in_bytes(value: long): Self = StObject.set(x, "resident_in_bytes", value.asInstanceOf[js.Any])
    
    inline def setResident_in_bytesUndefined: Self = StObject.set(x, "resident_in_bytes", js.undefined)
    
    inline def setShare(value: String): Self = StObject.set(x, "share", value.asInstanceOf[js.Any])
    
    inline def setShareUndefined: Self = StObject.set(x, "share", js.undefined)
    
    inline def setShare_in_bytes(value: long): Self = StObject.set(x, "share_in_bytes", value.asInstanceOf[js.Any])
    
    inline def setShare_in_bytesUndefined: Self = StObject.set(x, "share_in_bytes", js.undefined)
    
    inline def setTotal_in_bytes(value: long): Self = StObject.set(x, "total_in_bytes", value.asInstanceOf[js.Any])
    
    inline def setTotal_in_bytesUndefined: Self = StObject.set(x, "total_in_bytes", js.undefined)
    
    inline def setTotal_virtual(value: String): Self = StObject.set(x, "total_virtual", value.asInstanceOf[js.Any])
    
    inline def setTotal_virtualUndefined: Self = StObject.set(x, "total_virtual", js.undefined)
    
    inline def setTotal_virtual_in_bytes(value: long): Self = StObject.set(x, "total_virtual_in_bytes", value.asInstanceOf[js.Any])
    
    inline def setTotal_virtual_in_bytesUndefined: Self = StObject.set(x, "total_virtual_in_bytes", js.undefined)
    
    inline def setUsed_in_bytes(value: long): Self = StObject.set(x, "used_in_bytes", value.asInstanceOf[js.Any])
    
    inline def setUsed_in_bytesUndefined: Self = StObject.set(x, "used_in_bytes", js.undefined)
  }
}
