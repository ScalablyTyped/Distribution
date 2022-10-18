package typings.elasticElasticsearch.libApiTypesWithBodyKeyMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait StoreStats extends StObject {
  
  var reserved: js.UndefOr[ByteSize] = js.undefined
  
  var reserved_in_bytes: integer
  
  var size: js.UndefOr[ByteSize] = js.undefined
  
  var size_in_bytes: integer
  
  var total_data_set_size: js.UndefOr[ByteSize] = js.undefined
  
  var total_data_set_size_in_bytes: js.UndefOr[integer] = js.undefined
}
object StoreStats {
  
  inline def apply(reserved_in_bytes: integer, size_in_bytes: integer): StoreStats = {
    val __obj = js.Dynamic.literal(reserved_in_bytes = reserved_in_bytes.asInstanceOf[js.Any], size_in_bytes = size_in_bytes.asInstanceOf[js.Any])
    __obj.asInstanceOf[StoreStats]
  }
  
  extension [Self <: StoreStats](x: Self) {
    
    inline def setReserved(value: ByteSize): Self = StObject.set(x, "reserved", value.asInstanceOf[js.Any])
    
    inline def setReservedUndefined: Self = StObject.set(x, "reserved", js.undefined)
    
    inline def setReserved_in_bytes(value: integer): Self = StObject.set(x, "reserved_in_bytes", value.asInstanceOf[js.Any])
    
    inline def setSize(value: ByteSize): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
    
    inline def setSizeUndefined: Self = StObject.set(x, "size", js.undefined)
    
    inline def setSize_in_bytes(value: integer): Self = StObject.set(x, "size_in_bytes", value.asInstanceOf[js.Any])
    
    inline def setTotal_data_set_size(value: ByteSize): Self = StObject.set(x, "total_data_set_size", value.asInstanceOf[js.Any])
    
    inline def setTotal_data_set_sizeUndefined: Self = StObject.set(x, "total_data_set_size", js.undefined)
    
    inline def setTotal_data_set_size_in_bytes(value: integer): Self = StObject.set(x, "total_data_set_size_in_bytes", value.asInstanceOf[js.Any])
    
    inline def setTotal_data_set_size_in_bytesUndefined: Self = StObject.set(x, "total_data_set_size_in_bytes", js.undefined)
  }
}
