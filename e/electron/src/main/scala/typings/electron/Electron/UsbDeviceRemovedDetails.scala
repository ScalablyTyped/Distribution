package typings.electron.Electron

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait UsbDeviceRemovedDetails extends StObject {
  
  var device: USBDevice
  
  var frame: WebFrameMain_
}
object UsbDeviceRemovedDetails {
  
  inline def apply(device: USBDevice, frame: WebFrameMain_): UsbDeviceRemovedDetails = {
    val __obj = js.Dynamic.literal(device = device.asInstanceOf[js.Any], frame = frame.asInstanceOf[js.Any])
    __obj.asInstanceOf[UsbDeviceRemovedDetails]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: UsbDeviceRemovedDetails] (val x: Self) extends AnyVal {
    
    inline def setDevice(value: USBDevice): Self = StObject.set(x, "device", value.asInstanceOf[js.Any])
    
    inline def setFrame(value: WebFrameMain_): Self = StObject.set(x, "frame", value.asInstanceOf[js.Any])
  }
}
