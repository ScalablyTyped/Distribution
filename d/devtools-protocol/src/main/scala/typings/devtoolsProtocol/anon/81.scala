package typings.devtoolsProtocol.anon

import typings.devtoolsProtocol.mod.Protocol.DeviceOrientation.SetDeviceOrientationOverrideRequest
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `81` extends StObject {
  
  var paramsType: js.Array[SetDeviceOrientationOverrideRequest]
  
  var returnType: Unit
}
object `81` {
  
  inline def apply(paramsType: js.Array[SetDeviceOrientationOverrideRequest], returnType: Unit): `81` = {
    val __obj = js.Dynamic.literal(paramsType = paramsType.asInstanceOf[js.Any], returnType = returnType.asInstanceOf[js.Any])
    __obj.asInstanceOf[`81`]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: `81`] (val x: Self) extends AnyVal {
    
    inline def setParamsType(value: js.Array[SetDeviceOrientationOverrideRequest]): Self = StObject.set(x, "paramsType", value.asInstanceOf[js.Any])
    
    inline def setParamsTypeVarargs(value: SetDeviceOrientationOverrideRequest*): Self = StObject.set(x, "paramsType", js.Array(value*))
    
    inline def setReturnType(value: Unit): Self = StObject.set(x, "returnType", value.asInstanceOf[js.Any])
  }
}
