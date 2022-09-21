package typings.googleapis.chromemanagementV1Mod.chromemanagementV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaGoogleChromeManagementV1StorageInfoDiskVolume extends StObject {
  
  /**
    * Free storage space in bytes.
    */
  var storageFreeBytes: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Total storage space in bytes.
    */
  var storageTotalBytes: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Disk volume id.
    */
  var volumeId: js.UndefOr[String | Null] = js.undefined
}
object SchemaGoogleChromeManagementV1StorageInfoDiskVolume {
  
  inline def apply(): SchemaGoogleChromeManagementV1StorageInfoDiskVolume = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaGoogleChromeManagementV1StorageInfoDiskVolume]
  }
  
  extension [Self <: SchemaGoogleChromeManagementV1StorageInfoDiskVolume](x: Self) {
    
    inline def setStorageFreeBytes(value: String): Self = StObject.set(x, "storageFreeBytes", value.asInstanceOf[js.Any])
    
    inline def setStorageFreeBytesNull: Self = StObject.set(x, "storageFreeBytes", null)
    
    inline def setStorageFreeBytesUndefined: Self = StObject.set(x, "storageFreeBytes", js.undefined)
    
    inline def setStorageTotalBytes(value: String): Self = StObject.set(x, "storageTotalBytes", value.asInstanceOf[js.Any])
    
    inline def setStorageTotalBytesNull: Self = StObject.set(x, "storageTotalBytes", null)
    
    inline def setStorageTotalBytesUndefined: Self = StObject.set(x, "storageTotalBytes", js.undefined)
    
    inline def setVolumeId(value: String): Self = StObject.set(x, "volumeId", value.asInstanceOf[js.Any])
    
    inline def setVolumeIdNull: Self = StObject.set(x, "volumeId", null)
    
    inline def setVolumeIdUndefined: Self = StObject.set(x, "volumeId", js.undefined)
  }
}
