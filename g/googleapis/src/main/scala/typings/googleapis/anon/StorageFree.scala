package typings.googleapis.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait StorageFree extends StObject {
  
  var storageFree: js.UndefOr[String] = js.native
  
  var storageTotal: js.UndefOr[String] = js.native
  
  var volumeId: js.UndefOr[String] = js.native
}
object StorageFree {
  
  @scala.inline
  def apply(): StorageFree = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[StorageFree]
  }
  
  @scala.inline
  implicit class StorageFreeMutableBuilder[Self <: StorageFree] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setStorageFree(value: String): Self = StObject.set(x, "storageFree", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStorageFreeUndefined: Self = StObject.set(x, "storageFree", js.undefined)
    
    @scala.inline
    def setStorageTotal(value: String): Self = StObject.set(x, "storageTotal", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStorageTotalUndefined: Self = StObject.set(x, "storageTotal", js.undefined)
    
    @scala.inline
    def setVolumeId(value: String): Self = StObject.set(x, "volumeId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setVolumeIdUndefined: Self = StObject.set(x, "volumeId", js.undefined)
  }
}
