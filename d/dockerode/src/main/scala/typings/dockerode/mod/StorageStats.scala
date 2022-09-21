package typings.dockerode.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait StorageStats extends StObject {
  
  var read_count_normalized: js.UndefOr[Double] = js.undefined
  
  var read_size_bytes: js.UndefOr[Double] = js.undefined
  
  var write_count_normalized: js.UndefOr[Double] = js.undefined
  
  var write_size_bytes: js.UndefOr[Double] = js.undefined
}
object StorageStats {
  
  inline def apply(): StorageStats = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[StorageStats]
  }
  
  extension [Self <: StorageStats](x: Self) {
    
    inline def setRead_count_normalized(value: Double): Self = StObject.set(x, "read_count_normalized", value.asInstanceOf[js.Any])
    
    inline def setRead_count_normalizedUndefined: Self = StObject.set(x, "read_count_normalized", js.undefined)
    
    inline def setRead_size_bytes(value: Double): Self = StObject.set(x, "read_size_bytes", value.asInstanceOf[js.Any])
    
    inline def setRead_size_bytesUndefined: Self = StObject.set(x, "read_size_bytes", js.undefined)
    
    inline def setWrite_count_normalized(value: Double): Self = StObject.set(x, "write_count_normalized", value.asInstanceOf[js.Any])
    
    inline def setWrite_count_normalizedUndefined: Self = StObject.set(x, "write_count_normalized", js.undefined)
    
    inline def setWrite_size_bytes(value: Double): Self = StObject.set(x, "write_size_bytes", value.asInstanceOf[js.Any])
    
    inline def setWrite_size_bytesUndefined: Self = StObject.set(x, "write_size_bytes", js.undefined)
  }
}
