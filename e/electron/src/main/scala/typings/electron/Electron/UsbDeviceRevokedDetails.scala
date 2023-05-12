package typings.electron.Electron

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait UsbDeviceRevokedDetails extends StObject {
  
  var device: js.Array[USBDevice]
  
  /**
    * The origin that the device has been revoked from.
    */
  var origin: js.UndefOr[String] = js.undefined
}
object UsbDeviceRevokedDetails {
  
  inline def apply(device: js.Array[USBDevice]): UsbDeviceRevokedDetails = {
    val __obj = js.Dynamic.literal(device = device.asInstanceOf[js.Any])
    __obj.asInstanceOf[UsbDeviceRevokedDetails]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: UsbDeviceRevokedDetails] (val x: Self) extends AnyVal {
    
    inline def setDevice(value: js.Array[USBDevice]): Self = StObject.set(x, "device", value.asInstanceOf[js.Any])
    
    inline def setDeviceVarargs(value: USBDevice*): Self = StObject.set(x, "device", js.Array(value*))
    
    inline def setOrigin(value: String): Self = StObject.set(x, "origin", value.asInstanceOf[js.Any])
    
    inline def setOriginUndefined: Self = StObject.set(x, "origin", js.undefined)
  }
}
