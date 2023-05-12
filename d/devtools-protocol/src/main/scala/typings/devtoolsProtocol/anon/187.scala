package typings.devtoolsProtocol.anon

import typings.devtoolsProtocol.mod.Protocol.Page.SetRPHRegistrationModeRequest
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `187` extends StObject {
  
  var paramsType: js.Array[SetRPHRegistrationModeRequest]
  
  var returnType: Unit
}
object `187` {
  
  inline def apply(paramsType: js.Array[SetRPHRegistrationModeRequest], returnType: Unit): `187` = {
    val __obj = js.Dynamic.literal(paramsType = paramsType.asInstanceOf[js.Any], returnType = returnType.asInstanceOf[js.Any])
    __obj.asInstanceOf[`187`]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: `187`] (val x: Self) extends AnyVal {
    
    inline def setParamsType(value: js.Array[SetRPHRegistrationModeRequest]): Self = StObject.set(x, "paramsType", value.asInstanceOf[js.Any])
    
    inline def setParamsTypeVarargs(value: SetRPHRegistrationModeRequest*): Self = StObject.set(x, "paramsType", js.Array(value*))
    
    inline def setReturnType(value: Unit): Self = StObject.set(x, "returnType", value.asInstanceOf[js.Any])
  }
}
