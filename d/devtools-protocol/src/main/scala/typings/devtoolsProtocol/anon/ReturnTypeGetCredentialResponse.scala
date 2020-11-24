package typings.devtoolsProtocol.anon

import typings.devtoolsProtocol.mod.Protocol.WebAuthn.GetCredentialRequest
import typings.devtoolsProtocol.mod.Protocol.WebAuthn.GetCredentialResponse
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ReturnTypeGetCredentialResponse extends js.Object {
  
  var paramsType: js.Array[GetCredentialRequest] = js.native
  
  var returnType: GetCredentialResponse = js.native
}
object ReturnTypeGetCredentialResponse {
  
  @scala.inline
  def apply(paramsType: js.Array[GetCredentialRequest], returnType: GetCredentialResponse): ReturnTypeGetCredentialResponse = {
    val __obj = js.Dynamic.literal(paramsType = paramsType.asInstanceOf[js.Any], returnType = returnType.asInstanceOf[js.Any])
    __obj.asInstanceOf[ReturnTypeGetCredentialResponse]
  }
  
  @scala.inline
  implicit class ReturnTypeGetCredentialResponseOps[Self <: ReturnTypeGetCredentialResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setParamsTypeVarargs(value: GetCredentialRequest*): Self = this.set("paramsType", js.Array(value :_*))
    
    @scala.inline
    def setParamsType(value: js.Array[GetCredentialRequest]): Self = this.set("paramsType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setReturnType(value: GetCredentialResponse): Self = this.set("returnType", value.asInstanceOf[js.Any])
  }
}
