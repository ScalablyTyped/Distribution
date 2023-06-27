package typings.devtoolsProtocol.anon

import typings.devtoolsProtocol.mod.Protocol.ServiceWorker.UpdateRegistrationRequest
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `208` extends StObject {
  
  var paramsType: js.Array[UpdateRegistrationRequest]
  
  var returnType: Unit
}
object `208` {
  
  inline def apply(paramsType: js.Array[UpdateRegistrationRequest], returnType: Unit): `208` = {
    val __obj = js.Dynamic.literal(paramsType = paramsType.asInstanceOf[js.Any], returnType = returnType.asInstanceOf[js.Any])
    __obj.asInstanceOf[`208`]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: `208`] (val x: Self) extends AnyVal {
    
    inline def setParamsType(value: js.Array[UpdateRegistrationRequest]): Self = StObject.set(x, "paramsType", value.asInstanceOf[js.Any])
    
    inline def setParamsTypeVarargs(value: UpdateRegistrationRequest*): Self = StObject.set(x, "paramsType", js.Array(value*))
    
    inline def setReturnType(value: Unit): Self = StObject.set(x, "returnType", value.asInstanceOf[js.Any])
  }
}
