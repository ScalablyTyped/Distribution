package typings.devtoolsProtocol.anon

import typings.devtoolsProtocol.mod.Protocol.WebAuthn.GetCredentialsRequest
import typings.devtoolsProtocol.mod.Protocol.WebAuthn.GetCredentialsResponse
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ReturnTypeGetCredentialsResponse extends js.Object {
  
  var paramsType: js.Array[GetCredentialsRequest] = js.native
  
  var returnType: GetCredentialsResponse = js.native
}
object ReturnTypeGetCredentialsResponse {
  
  @scala.inline
  def apply(paramsType: js.Array[GetCredentialsRequest], returnType: GetCredentialsResponse): ReturnTypeGetCredentialsResponse = {
    val __obj = js.Dynamic.literal(paramsType = paramsType.asInstanceOf[js.Any], returnType = returnType.asInstanceOf[js.Any])
    __obj.asInstanceOf[ReturnTypeGetCredentialsResponse]
  }
  
  @scala.inline
  implicit class ReturnTypeGetCredentialsResponseOps[Self <: ReturnTypeGetCredentialsResponse] (val x: Self) extends AnyVal {
    
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
    def setParamsTypeVarargs(value: GetCredentialsRequest*): Self = this.set("paramsType", js.Array(value :_*))
    
    @scala.inline
    def setParamsType(value: js.Array[GetCredentialsRequest]): Self = this.set("paramsType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setReturnType(value: GetCredentialsResponse): Self = this.set("returnType", value.asInstanceOf[js.Any])
  }
}
