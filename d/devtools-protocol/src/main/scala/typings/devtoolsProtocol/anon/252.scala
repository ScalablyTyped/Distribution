package typings.devtoolsProtocol.anon

import typings.devtoolsProtocol.mod.Protocol.WebAuthn.RemoveVirtualAuthenticatorRequest
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `252` extends StObject {
  
  var paramsType: js.Array[RemoveVirtualAuthenticatorRequest]
  
  var returnType: Unit
}
object `252` {
  
  inline def apply(paramsType: js.Array[RemoveVirtualAuthenticatorRequest], returnType: Unit): `252` = {
    val __obj = js.Dynamic.literal(paramsType = paramsType.asInstanceOf[js.Any], returnType = returnType.asInstanceOf[js.Any])
    __obj.asInstanceOf[`252`]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: `252`] (val x: Self) extends AnyVal {
    
    inline def setParamsType(value: js.Array[RemoveVirtualAuthenticatorRequest]): Self = StObject.set(x, "paramsType", value.asInstanceOf[js.Any])
    
    inline def setParamsTypeVarargs(value: RemoveVirtualAuthenticatorRequest*): Self = StObject.set(x, "paramsType", js.Array(value*))
    
    inline def setReturnType(value: Unit): Self = StObject.set(x, "returnType", value.asInstanceOf[js.Any])
  }
}
