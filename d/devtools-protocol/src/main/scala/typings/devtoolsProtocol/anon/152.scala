package typings.devtoolsProtocol.anon

import typings.devtoolsProtocol.mod.Protocol.Page.SetDeviceOrientationOverrideRequest
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `152` extends StObject {
  
  var paramsType: js.Array[SetDeviceOrientationOverrideRequest]
  
  var returnType: Unit
}
object `152` {
  
  inline def apply(paramsType: js.Array[SetDeviceOrientationOverrideRequest], returnType: Unit): `152` = {
    val __obj = js.Dynamic.literal(paramsType = paramsType.asInstanceOf[js.Any], returnType = returnType.asInstanceOf[js.Any])
    __obj.asInstanceOf[`152`]
  }
  
  extension [Self <: `152`](x: Self) {
    
    inline def setParamsType(value: js.Array[SetDeviceOrientationOverrideRequest]): Self = StObject.set(x, "paramsType", value.asInstanceOf[js.Any])
    
    inline def setParamsTypeVarargs(value: SetDeviceOrientationOverrideRequest*): Self = StObject.set(x, "paramsType", js.Array(value :_*))
    
    inline def setReturnType(value: Unit): Self = StObject.set(x, "returnType", value.asInstanceOf[js.Any])
  }
}
