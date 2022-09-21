package typings.googleapis.chromemanagementV1Mod.chromemanagementV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaGoogleChromeManagementV1GraphicsAdapterInfo extends StObject {
  
  /**
    * Output only. Adapter name. Example: Mesa DRI Intel(R) UHD Graphics 620 (Kabylake GT2).
    */
  var adapter: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Output only. Represents the graphics card device id.
    */
  var deviceId: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Output only. Version of the GPU driver.
    */
  var driverVersion: js.UndefOr[String | Null] = js.undefined
}
object SchemaGoogleChromeManagementV1GraphicsAdapterInfo {
  
  inline def apply(): SchemaGoogleChromeManagementV1GraphicsAdapterInfo = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaGoogleChromeManagementV1GraphicsAdapterInfo]
  }
  
  extension [Self <: SchemaGoogleChromeManagementV1GraphicsAdapterInfo](x: Self) {
    
    inline def setAdapter(value: String): Self = StObject.set(x, "adapter", value.asInstanceOf[js.Any])
    
    inline def setAdapterNull: Self = StObject.set(x, "adapter", null)
    
    inline def setAdapterUndefined: Self = StObject.set(x, "adapter", js.undefined)
    
    inline def setDeviceId(value: String): Self = StObject.set(x, "deviceId", value.asInstanceOf[js.Any])
    
    inline def setDeviceIdNull: Self = StObject.set(x, "deviceId", null)
    
    inline def setDeviceIdUndefined: Self = StObject.set(x, "deviceId", js.undefined)
    
    inline def setDriverVersion(value: String): Self = StObject.set(x, "driverVersion", value.asInstanceOf[js.Any])
    
    inline def setDriverVersionNull: Self = StObject.set(x, "driverVersion", null)
    
    inline def setDriverVersionUndefined: Self = StObject.set(x, "driverVersion", js.undefined)
  }
}
