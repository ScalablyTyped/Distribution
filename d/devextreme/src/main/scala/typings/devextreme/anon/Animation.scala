package typings.devextreme.anon

import typings.devextreme.mod.DevExpress.AnimationConfig
import typings.devextreme.mod.DevExpress.Device
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Animation extends StObject {
  
  var animation: AnimationConfig
  
  var device: js.UndefOr[Device] = js.undefined
}
object Animation {
  
  inline def apply(animation: AnimationConfig): Animation = {
    val __obj = js.Dynamic.literal(animation = animation.asInstanceOf[js.Any])
    __obj.asInstanceOf[Animation]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Animation] (val x: Self) extends AnyVal {
    
    inline def setAnimation(value: AnimationConfig): Self = StObject.set(x, "animation", value.asInstanceOf[js.Any])
    
    inline def setDevice(value: Device): Self = StObject.set(x, "device", value.asInstanceOf[js.Any])
    
    inline def setDeviceUndefined: Self = StObject.set(x, "device", js.undefined)
  }
}
