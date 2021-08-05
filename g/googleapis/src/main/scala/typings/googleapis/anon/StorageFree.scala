package typings.googleapis.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait StorageFree extends StObject {
  
  var storageFree: js.UndefOr[String] = js.undefined
  
  var storageTotal: js.UndefOr[String] = js.undefined
  
  var volumeId: js.UndefOr[String] = js.undefined
}
object StorageFree {
  
  inline def apply(): StorageFree = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[StorageFree]
  }
  
  extension [Self <: StorageFree](x: Self) {
    
    inline def setStorageFree(value: String): Self = StObject.set(x, "storageFree", value.asInstanceOf[js.Any])
    
    inline def setStorageFreeUndefined: Self = StObject.set(x, "storageFree", js.undefined)
    
    inline def setStorageTotal(value: String): Self = StObject.set(x, "storageTotal", value.asInstanceOf[js.Any])
    
    inline def setStorageTotalUndefined: Self = StObject.set(x, "storageTotal", js.undefined)
    
    inline def setVolumeId(value: String): Self = StObject.set(x, "volumeId", value.asInstanceOf[js.Any])
    
    inline def setVolumeIdUndefined: Self = StObject.set(x, "volumeId", js.undefined)
  }
}
