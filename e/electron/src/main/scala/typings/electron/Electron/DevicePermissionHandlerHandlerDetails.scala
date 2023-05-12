package typings.electron.Electron

import typings.electron.electronStrings.hid
import typings.electron.electronStrings.serial
import typings.electron.electronStrings.usb
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DevicePermissionHandlerHandlerDetails extends StObject {
  
  /**
    * the device that permission is being requested for.
    */
  var device: HIDDevice | SerialPort | USBDevice
  
  /**
    * The type of device that permission is being requested on, can be `hid`,
    * `serial`, or `usb`.
    */
  var deviceType: hid | serial | usb
  
  /**
    * The origin URL of the device permission check.
    */
  var origin: String
}
object DevicePermissionHandlerHandlerDetails {
  
  inline def apply(device: HIDDevice | SerialPort | USBDevice, deviceType: hid | serial | usb, origin: String): DevicePermissionHandlerHandlerDetails = {
    val __obj = js.Dynamic.literal(device = device.asInstanceOf[js.Any], deviceType = deviceType.asInstanceOf[js.Any], origin = origin.asInstanceOf[js.Any])
    __obj.asInstanceOf[DevicePermissionHandlerHandlerDetails]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: DevicePermissionHandlerHandlerDetails] (val x: Self) extends AnyVal {
    
    inline def setDevice(value: HIDDevice | SerialPort | USBDevice): Self = StObject.set(x, "device", value.asInstanceOf[js.Any])
    
    inline def setDeviceType(value: hid | serial | usb): Self = StObject.set(x, "deviceType", value.asInstanceOf[js.Any])
    
    inline def setOrigin(value: String): Self = StObject.set(x, "origin", value.asInstanceOf[js.Any])
  }
}
