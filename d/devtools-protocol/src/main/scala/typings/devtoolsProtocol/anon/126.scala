package typings.devtoolsProtocol.anon

import typings.devtoolsProtocol.mod.Protocol.Memory.SetPressureNotificationsSuppressedRequest
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `126` extends StObject {
  
  var paramsType: js.Array[SetPressureNotificationsSuppressedRequest]
  
  var returnType: Unit
}
object `126` {
  
  inline def apply(paramsType: js.Array[SetPressureNotificationsSuppressedRequest], returnType: Unit): `126` = {
    val __obj = js.Dynamic.literal(paramsType = paramsType.asInstanceOf[js.Any], returnType = returnType.asInstanceOf[js.Any])
    __obj.asInstanceOf[`126`]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: `126`] (val x: Self) extends AnyVal {
    
    inline def setParamsType(value: js.Array[SetPressureNotificationsSuppressedRequest]): Self = StObject.set(x, "paramsType", value.asInstanceOf[js.Any])
    
    inline def setParamsTypeVarargs(value: SetPressureNotificationsSuppressedRequest*): Self = StObject.set(x, "paramsType", js.Array(value*))
    
    inline def setReturnType(value: Unit): Self = StObject.set(x, "returnType", value.asInstanceOf[js.Any])
  }
}
