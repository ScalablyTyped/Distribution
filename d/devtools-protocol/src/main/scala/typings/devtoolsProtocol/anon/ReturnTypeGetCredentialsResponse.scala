package typings.devtoolsProtocol.anon

import typings.devtoolsProtocol.mod.Protocol.WebAuthn.GetCredentialsRequest
import typings.devtoolsProtocol.mod.Protocol.WebAuthn.GetCredentialsResponse
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ReturnTypeGetCredentialsResponse extends StObject {
  
  var paramsType: js.Array[GetCredentialsRequest]
  
  var returnType: GetCredentialsResponse
}
object ReturnTypeGetCredentialsResponse {
  
  @scala.inline
  def apply(paramsType: js.Array[GetCredentialsRequest], returnType: GetCredentialsResponse): ReturnTypeGetCredentialsResponse = {
    val __obj = js.Dynamic.literal(paramsType = paramsType.asInstanceOf[js.Any], returnType = returnType.asInstanceOf[js.Any])
    __obj.asInstanceOf[ReturnTypeGetCredentialsResponse]
  }
  
  @scala.inline
  implicit class ReturnTypeGetCredentialsResponseMutableBuilder[Self <: ReturnTypeGetCredentialsResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setParamsType(value: js.Array[GetCredentialsRequest]): Self = StObject.set(x, "paramsType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setParamsTypeVarargs(value: GetCredentialsRequest*): Self = StObject.set(x, "paramsType", js.Array(value :_*))
    
    @scala.inline
    def setReturnType(value: GetCredentialsResponse): Self = StObject.set(x, "returnType", value.asInstanceOf[js.Any])
  }
}
