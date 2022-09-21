package typings.devtoolsProtocol.anon

import typings.devtoolsProtocol.mod.Protocol.WebAuthn.AddVirtualAuthenticatorRequest
import typings.devtoolsProtocol.mod.Protocol.WebAuthn.AddVirtualAuthenticatorResponse
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ReturnTypeAddVirtualAuthenticatorResponse extends StObject {
  
  var paramsType: js.Array[AddVirtualAuthenticatorRequest]
  
  var returnType: AddVirtualAuthenticatorResponse
}
object ReturnTypeAddVirtualAuthenticatorResponse {
  
  inline def apply(paramsType: js.Array[AddVirtualAuthenticatorRequest], returnType: AddVirtualAuthenticatorResponse): ReturnTypeAddVirtualAuthenticatorResponse = {
    val __obj = js.Dynamic.literal(paramsType = paramsType.asInstanceOf[js.Any], returnType = returnType.asInstanceOf[js.Any])
    __obj.asInstanceOf[ReturnTypeAddVirtualAuthenticatorResponse]
  }
  
  extension [Self <: ReturnTypeAddVirtualAuthenticatorResponse](x: Self) {
    
    inline def setParamsType(value: js.Array[AddVirtualAuthenticatorRequest]): Self = StObject.set(x, "paramsType", value.asInstanceOf[js.Any])
    
    inline def setParamsTypeVarargs(value: AddVirtualAuthenticatorRequest*): Self = StObject.set(x, "paramsType", js.Array(value*))
    
    inline def setReturnType(value: AddVirtualAuthenticatorResponse): Self = StObject.set(x, "returnType", value.asInstanceOf[js.Any])
  }
}
