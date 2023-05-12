package typings.electron.Electron

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SelectUsbDeviceDetails extends StObject {
  
  var deviceList: js.Array[USBDevice]
  
  var frame: WebFrameMain_
}
object SelectUsbDeviceDetails {
  
  inline def apply(deviceList: js.Array[USBDevice], frame: WebFrameMain_): SelectUsbDeviceDetails = {
    val __obj = js.Dynamic.literal(deviceList = deviceList.asInstanceOf[js.Any], frame = frame.asInstanceOf[js.Any])
    __obj.asInstanceOf[SelectUsbDeviceDetails]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: SelectUsbDeviceDetails] (val x: Self) extends AnyVal {
    
    inline def setDeviceList(value: js.Array[USBDevice]): Self = StObject.set(x, "deviceList", value.asInstanceOf[js.Any])
    
    inline def setDeviceListVarargs(value: USBDevice*): Self = StObject.set(x, "deviceList", js.Array(value*))
    
    inline def setFrame(value: WebFrameMain_): Self = StObject.set(x, "frame", value.asInstanceOf[js.Any])
  }
}
