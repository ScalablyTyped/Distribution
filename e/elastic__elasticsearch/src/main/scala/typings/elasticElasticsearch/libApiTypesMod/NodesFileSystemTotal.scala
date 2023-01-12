package typings.elasticElasticsearch.libApiTypesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait NodesFileSystemTotal extends StObject {
  
  var available: js.UndefOr[String] = js.undefined
  
  var available_in_bytes: js.UndefOr[long] = js.undefined
  
  var free: js.UndefOr[String] = js.undefined
  
  var free_in_bytes: js.UndefOr[long] = js.undefined
  
  var total: js.UndefOr[String] = js.undefined
  
  var total_in_bytes: js.UndefOr[long] = js.undefined
}
object NodesFileSystemTotal {
  
  inline def apply(): NodesFileSystemTotal = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[NodesFileSystemTotal]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: NodesFileSystemTotal] (val x: Self) extends AnyVal {
    
    inline def setAvailable(value: String): Self = StObject.set(x, "available", value.asInstanceOf[js.Any])
    
    inline def setAvailableUndefined: Self = StObject.set(x, "available", js.undefined)
    
    inline def setAvailable_in_bytes(value: long): Self = StObject.set(x, "available_in_bytes", value.asInstanceOf[js.Any])
    
    inline def setAvailable_in_bytesUndefined: Self = StObject.set(x, "available_in_bytes", js.undefined)
    
    inline def setFree(value: String): Self = StObject.set(x, "free", value.asInstanceOf[js.Any])
    
    inline def setFreeUndefined: Self = StObject.set(x, "free", js.undefined)
    
    inline def setFree_in_bytes(value: long): Self = StObject.set(x, "free_in_bytes", value.asInstanceOf[js.Any])
    
    inline def setFree_in_bytesUndefined: Self = StObject.set(x, "free_in_bytes", js.undefined)
    
    inline def setTotal(value: String): Self = StObject.set(x, "total", value.asInstanceOf[js.Any])
    
    inline def setTotalUndefined: Self = StObject.set(x, "total", js.undefined)
    
    inline def setTotal_in_bytes(value: long): Self = StObject.set(x, "total_in_bytes", value.asInstanceOf[js.Any])
    
    inline def setTotal_in_bytesUndefined: Self = StObject.set(x, "total_in_bytes", js.undefined)
  }
}
