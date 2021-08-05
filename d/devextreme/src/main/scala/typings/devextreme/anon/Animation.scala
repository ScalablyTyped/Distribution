package typings.devextreme.anon

import typings.devextreme.mod.DevExpress.animationConfig
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Animation extends StObject {
  
  var animation: js.UndefOr[animationConfig] = js.undefined
  
  var device: js.UndefOr[typings.devextreme.mod.DevExpress.Device] = js.undefined
}
object Animation {
  
  inline def apply(): Animation = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Animation]
  }
  
  extension [Self <: Animation](x: Self) {
    
    inline def setAnimation(value: animationConfig): Self = StObject.set(x, "animation", value.asInstanceOf[js.Any])
    
    inline def setAnimationUndefined: Self = StObject.set(x, "animation", js.undefined)
    
    inline def setDevice(value: typings.devextreme.mod.DevExpress.Device): Self = StObject.set(x, "device", value.asInstanceOf[js.Any])
    
    inline def setDeviceUndefined: Self = StObject.set(x, "device", js.undefined)
  }
}
