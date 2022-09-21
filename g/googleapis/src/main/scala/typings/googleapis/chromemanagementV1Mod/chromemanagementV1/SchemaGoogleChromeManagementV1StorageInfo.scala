package typings.googleapis.chromemanagementV1Mod.chromemanagementV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaGoogleChromeManagementV1StorageInfo extends StObject {
  
  /**
    * The available space for user data storage in the device in bytes.
    */
  var availableDiskBytes: js.UndefOr[String | Null] = js.undefined
  
  /**
    * The total space for user data storage in the device in bytes.
    */
  var totalDiskBytes: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Information for disk volumes
    */
  var volume: js.UndefOr[js.Array[SchemaGoogleChromeManagementV1StorageInfoDiskVolume]] = js.undefined
}
object SchemaGoogleChromeManagementV1StorageInfo {
  
  inline def apply(): SchemaGoogleChromeManagementV1StorageInfo = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaGoogleChromeManagementV1StorageInfo]
  }
  
  extension [Self <: SchemaGoogleChromeManagementV1StorageInfo](x: Self) {
    
    inline def setAvailableDiskBytes(value: String): Self = StObject.set(x, "availableDiskBytes", value.asInstanceOf[js.Any])
    
    inline def setAvailableDiskBytesNull: Self = StObject.set(x, "availableDiskBytes", null)
    
    inline def setAvailableDiskBytesUndefined: Self = StObject.set(x, "availableDiskBytes", js.undefined)
    
    inline def setTotalDiskBytes(value: String): Self = StObject.set(x, "totalDiskBytes", value.asInstanceOf[js.Any])
    
    inline def setTotalDiskBytesNull: Self = StObject.set(x, "totalDiskBytes", null)
    
    inline def setTotalDiskBytesUndefined: Self = StObject.set(x, "totalDiskBytes", js.undefined)
    
    inline def setVolume(value: js.Array[SchemaGoogleChromeManagementV1StorageInfoDiskVolume]): Self = StObject.set(x, "volume", value.asInstanceOf[js.Any])
    
    inline def setVolumeUndefined: Self = StObject.set(x, "volume", js.undefined)
    
    inline def setVolumeVarargs(value: SchemaGoogleChromeManagementV1StorageInfoDiskVolume*): Self = StObject.set(x, "volume", js.Array(value*))
  }
}
