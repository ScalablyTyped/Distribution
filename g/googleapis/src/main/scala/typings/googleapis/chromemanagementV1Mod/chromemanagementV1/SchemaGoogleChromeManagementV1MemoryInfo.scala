package typings.googleapis.chromemanagementV1Mod.chromemanagementV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaGoogleChromeManagementV1MemoryInfo extends StObject {
  
  /**
    * Output only. Amount of available RAM in bytes.
    */
  var availableRamBytes: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Output only. Total memory encryption info for the device.
    */
  var totalMemoryEncryption: js.UndefOr[SchemaGoogleChromeManagementV1TotalMemoryEncryptionInfo] = js.undefined
  
  /**
    * Output only. Total RAM in bytes.
    */
  var totalRamBytes: js.UndefOr[String | Null] = js.undefined
}
object SchemaGoogleChromeManagementV1MemoryInfo {
  
  inline def apply(): SchemaGoogleChromeManagementV1MemoryInfo = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaGoogleChromeManagementV1MemoryInfo]
  }
  
  extension [Self <: SchemaGoogleChromeManagementV1MemoryInfo](x: Self) {
    
    inline def setAvailableRamBytes(value: String): Self = StObject.set(x, "availableRamBytes", value.asInstanceOf[js.Any])
    
    inline def setAvailableRamBytesNull: Self = StObject.set(x, "availableRamBytes", null)
    
    inline def setAvailableRamBytesUndefined: Self = StObject.set(x, "availableRamBytes", js.undefined)
    
    inline def setTotalMemoryEncryption(value: SchemaGoogleChromeManagementV1TotalMemoryEncryptionInfo): Self = StObject.set(x, "totalMemoryEncryption", value.asInstanceOf[js.Any])
    
    inline def setTotalMemoryEncryptionUndefined: Self = StObject.set(x, "totalMemoryEncryption", js.undefined)
    
    inline def setTotalRamBytes(value: String): Self = StObject.set(x, "totalRamBytes", value.asInstanceOf[js.Any])
    
    inline def setTotalRamBytesNull: Self = StObject.set(x, "totalRamBytes", null)
    
    inline def setTotalRamBytesUndefined: Self = StObject.set(x, "totalRamBytes", js.undefined)
  }
}
