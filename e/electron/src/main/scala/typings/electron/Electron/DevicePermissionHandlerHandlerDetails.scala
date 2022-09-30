package typings.electron.Electron

import typings.electron.electronStrings.hid
import typings.electron.electronStrings.serial
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DevicePermissionHandlerHandlerDetails extends StObject {
  
  /**
    * the device that permission is being requested for.
    */
  var device: HIDDevice | SerialPort
  
  /**
    * The type of device that permission is being requested on, can be `hid` or
    * `serial`.
    */
  var deviceType: hid | serial
  
  /**
    * The origin URL of the device permission check.
    */
  var origin: String
}
object DevicePermissionHandlerHandlerDetails {
  
  inline def apply(device: HIDDevice | SerialPort, deviceType: hid | serial, origin: String): DevicePermissionHandlerHandlerDetails = {
    val __obj = js.Dynamic.literal(device = device.asInstanceOf[js.Any], deviceType = deviceType.asInstanceOf[js.Any], origin = origin.asInstanceOf[js.Any])
    __obj.asInstanceOf[DevicePermissionHandlerHandlerDetails]
  }
  
  extension [Self <: DevicePermissionHandlerHandlerDetails](x: Self) {
    
    inline def setDevice(value: HIDDevice | SerialPort): Self = StObject.set(x, "device", value.asInstanceOf[js.Any])
    
    inline def setDeviceType(value: hid | serial): Self = StObject.set(x, "deviceType", value.asInstanceOf[js.Any])
    
    inline def setOrigin(value: String): Self = StObject.set(x, "origin", value.asInstanceOf[js.Any])
  }
}
