package typings.gestalt.mod

import typings.gestalt.gestaltStrings.desktop
import typings.gestalt.gestaltStrings.mobile
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DeviceTypeProviderProps extends StObject {
  
  var children: Node
  
  var deviceType: desktop | mobile
}
object DeviceTypeProviderProps {
  
  inline def apply(deviceType: desktop | mobile): DeviceTypeProviderProps = {
    val __obj = js.Dynamic.literal(deviceType = deviceType.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeviceTypeProviderProps]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: DeviceTypeProviderProps] (val x: Self) extends AnyVal {
    
    inline def setChildren(value: Node): Self = StObject.set(x, "children", value.asInstanceOf[js.Any])
    
    inline def setChildrenUndefined: Self = StObject.set(x, "children", js.undefined)
    
    inline def setDeviceType(value: desktop | mobile): Self = StObject.set(x, "deviceType", value.asInstanceOf[js.Any])
  }
}
