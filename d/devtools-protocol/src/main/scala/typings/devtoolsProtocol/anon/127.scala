package typings.devtoolsProtocol.anon

import typings.devtoolsProtocol.mod.Protocol.Memory.SimulatePressureNotificationRequest
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `127` extends StObject {
  
  var paramsType: js.Array[SimulatePressureNotificationRequest]
  
  var returnType: Unit
}
object `127` {
  
  inline def apply(paramsType: js.Array[SimulatePressureNotificationRequest], returnType: Unit): `127` = {
    val __obj = js.Dynamic.literal(paramsType = paramsType.asInstanceOf[js.Any], returnType = returnType.asInstanceOf[js.Any])
    __obj.asInstanceOf[`127`]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: `127`] (val x: Self) extends AnyVal {
    
    inline def setParamsType(value: js.Array[SimulatePressureNotificationRequest]): Self = StObject.set(x, "paramsType", value.asInstanceOf[js.Any])
    
    inline def setParamsTypeVarargs(value: SimulatePressureNotificationRequest*): Self = StObject.set(x, "paramsType", js.Array(value*))
    
    inline def setReturnType(value: Unit): Self = StObject.set(x, "returnType", value.asInstanceOf[js.Any])
  }
}
