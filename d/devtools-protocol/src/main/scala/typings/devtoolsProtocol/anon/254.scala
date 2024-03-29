package typings.devtoolsProtocol.anon

import typings.devtoolsProtocol.mod.Protocol.WebAuthn.RemoveCredentialRequest
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `254` extends StObject {
  
  var paramsType: js.Array[RemoveCredentialRequest]
  
  var returnType: Unit
}
object `254` {
  
  inline def apply(paramsType: js.Array[RemoveCredentialRequest], returnType: Unit): `254` = {
    val __obj = js.Dynamic.literal(paramsType = paramsType.asInstanceOf[js.Any], returnType = returnType.asInstanceOf[js.Any])
    __obj.asInstanceOf[`254`]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: `254`] (val x: Self) extends AnyVal {
    
    inline def setParamsType(value: js.Array[RemoveCredentialRequest]): Self = StObject.set(x, "paramsType", value.asInstanceOf[js.Any])
    
    inline def setParamsTypeVarargs(value: RemoveCredentialRequest*): Self = StObject.set(x, "paramsType", js.Array(value*))
    
    inline def setReturnType(value: Unit): Self = StObject.set(x, "returnType", value.asInstanceOf[js.Any])
  }
}
