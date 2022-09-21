package typings.googleapis.chromemanagementV1Mod.chromemanagementV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaGoogleChromeManagementV1Device extends StObject {
  
  /**
    * Output only. The ID of the device that reported this Chrome browser information.
    */
  var deviceId: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Output only. The name of the machine within its local network.
    */
  var machine: js.UndefOr[String | Null] = js.undefined
}
object SchemaGoogleChromeManagementV1Device {
  
  inline def apply(): SchemaGoogleChromeManagementV1Device = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaGoogleChromeManagementV1Device]
  }
  
  extension [Self <: SchemaGoogleChromeManagementV1Device](x: Self) {
    
    inline def setDeviceId(value: String): Self = StObject.set(x, "deviceId", value.asInstanceOf[js.Any])
    
    inline def setDeviceIdNull: Self = StObject.set(x, "deviceId", null)
    
    inline def setDeviceIdUndefined: Self = StObject.set(x, "deviceId", js.undefined)
    
    inline def setMachine(value: String): Self = StObject.set(x, "machine", value.asInstanceOf[js.Any])
    
    inline def setMachineNull: Self = StObject.set(x, "machine", null)
    
    inline def setMachineUndefined: Self = StObject.set(x, "machine", js.undefined)
  }
}
