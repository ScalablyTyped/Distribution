package typings.devtoolsProtocol.anon

import typings.devtoolsProtocol.mod.Protocol.WebAuthn.AddCredentialRequest
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `253` extends StObject {
  
  var paramsType: js.Array[AddCredentialRequest]
  
  var returnType: Unit
}
object `253` {
  
  inline def apply(paramsType: js.Array[AddCredentialRequest], returnType: Unit): `253` = {
    val __obj = js.Dynamic.literal(paramsType = paramsType.asInstanceOf[js.Any], returnType = returnType.asInstanceOf[js.Any])
    __obj.asInstanceOf[`253`]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: `253`] (val x: Self) extends AnyVal {
    
    inline def setParamsType(value: js.Array[AddCredentialRequest]): Self = StObject.set(x, "paramsType", value.asInstanceOf[js.Any])
    
    inline def setParamsTypeVarargs(value: AddCredentialRequest*): Self = StObject.set(x, "paramsType", js.Array(value*))
    
    inline def setReturnType(value: Unit): Self = StObject.set(x, "returnType", value.asInstanceOf[js.Any])
  }
}
