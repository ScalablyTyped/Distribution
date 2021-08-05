package typings.devtoolsProtocol.anon

import typings.devtoolsProtocol.mod.Protocol.Memory.SimulatePressureNotificationRequest
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `109` extends StObject {
  
  var paramsType: js.Array[SimulatePressureNotificationRequest]
  
  var returnType: Unit
}
object `109` {
  
  inline def apply(paramsType: js.Array[SimulatePressureNotificationRequest], returnType: Unit): `109` = {
    val __obj = js.Dynamic.literal(paramsType = paramsType.asInstanceOf[js.Any], returnType = returnType.asInstanceOf[js.Any])
    __obj.asInstanceOf[`109`]
  }
  
  extension [Self <: `109`](x: Self) {
    
    inline def setParamsType(value: js.Array[SimulatePressureNotificationRequest]): Self = StObject.set(x, "paramsType", value.asInstanceOf[js.Any])
    
    inline def setParamsTypeVarargs(value: SimulatePressureNotificationRequest*): Self = StObject.set(x, "paramsType", js.Array(value :_*))
    
    inline def setReturnType(value: Unit): Self = StObject.set(x, "returnType", value.asInstanceOf[js.Any])
  }
}
