package typings.electron.Electron

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait HidDeviceRemovedDetails extends StObject {
  
  var device: js.Array[HIDDevice]
  
  var frame: WebFrameMain_
}
object HidDeviceRemovedDetails {
  
  inline def apply(device: js.Array[HIDDevice], frame: WebFrameMain_): HidDeviceRemovedDetails = {
    val __obj = js.Dynamic.literal(device = device.asInstanceOf[js.Any], frame = frame.asInstanceOf[js.Any])
    __obj.asInstanceOf[HidDeviceRemovedDetails]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: HidDeviceRemovedDetails] (val x: Self) extends AnyVal {
    
    inline def setDevice(value: js.Array[HIDDevice]): Self = StObject.set(x, "device", value.asInstanceOf[js.Any])
    
    inline def setDeviceVarargs(value: HIDDevice*): Self = StObject.set(x, "device", js.Array(value*))
    
    inline def setFrame(value: WebFrameMain_): Self = StObject.set(x, "frame", value.asInstanceOf[js.Any])
  }
}
