package typings.devtoolsProtocol.anon

import typings.devtoolsProtocol.mod.Protocol.WebAuthn.GetCredentialRequest
import typings.devtoolsProtocol.mod.Protocol.WebAuthn.GetCredentialResponse
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ReturnTypeGetCredentialResponse extends StObject {
  
  var paramsType: js.Array[GetCredentialRequest]
  
  var returnType: GetCredentialResponse
}
object ReturnTypeGetCredentialResponse {
  
  inline def apply(paramsType: js.Array[GetCredentialRequest], returnType: GetCredentialResponse): ReturnTypeGetCredentialResponse = {
    val __obj = js.Dynamic.literal(paramsType = paramsType.asInstanceOf[js.Any], returnType = returnType.asInstanceOf[js.Any])
    __obj.asInstanceOf[ReturnTypeGetCredentialResponse]
  }
  
  extension [Self <: ReturnTypeGetCredentialResponse](x: Self) {
    
    inline def setParamsType(value: js.Array[GetCredentialRequest]): Self = StObject.set(x, "paramsType", value.asInstanceOf[js.Any])
    
    inline def setParamsTypeVarargs(value: GetCredentialRequest*): Self = StObject.set(x, "paramsType", js.Array(value :_*))
    
    inline def setReturnType(value: GetCredentialResponse): Self = StObject.set(x, "returnType", value.asInstanceOf[js.Any])
  }
}
