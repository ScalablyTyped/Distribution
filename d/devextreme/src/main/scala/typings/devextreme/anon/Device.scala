package typings.devextreme.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Device extends StObject {
  
  var device: js.UndefOr[
    typings.devextreme.mod.DevExpress.Device | js.Array[typings.devextreme.mod.DevExpress.Device] | js.Function
  ] = js.undefined
  
  var options: js.UndefOr[js.Any] = js.undefined
}
object Device {
  
  inline def apply(): Device = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Device]
  }
  
  extension [Self <: Device](x: Self) {
    
    inline def setDevice(
      value: typings.devextreme.mod.DevExpress.Device | js.Array[typings.devextreme.mod.DevExpress.Device] | js.Function
    ): Self = StObject.set(x, "device", value.asInstanceOf[js.Any])
    
    inline def setDeviceUndefined: Self = StObject.set(x, "device", js.undefined)
    
    inline def setDeviceVarargs(value: typings.devextreme.mod.DevExpress.Device*): Self = StObject.set(x, "device", js.Array(value :_*))
    
    inline def setOptions(value: js.Any): Self = StObject.set(x, "options", value.asInstanceOf[js.Any])
    
    inline def setOptionsUndefined: Self = StObject.set(x, "options", js.undefined)
  }
}
