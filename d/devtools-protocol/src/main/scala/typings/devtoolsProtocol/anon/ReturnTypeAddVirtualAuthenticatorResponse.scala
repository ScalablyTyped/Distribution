package typings.devtoolsProtocol.anon

import typings.devtoolsProtocol.mod.Protocol.WebAuthn.AddVirtualAuthenticatorRequest
import typings.devtoolsProtocol.mod.Protocol.WebAuthn.AddVirtualAuthenticatorResponse
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ReturnTypeAddVirtualAuthenticatorResponse extends js.Object {
  
  var paramsType: js.Array[AddVirtualAuthenticatorRequest] = js.native
  
  var returnType: AddVirtualAuthenticatorResponse = js.native
}
object ReturnTypeAddVirtualAuthenticatorResponse {
  
  @scala.inline
  def apply(paramsType: js.Array[AddVirtualAuthenticatorRequest], returnType: AddVirtualAuthenticatorResponse): ReturnTypeAddVirtualAuthenticatorResponse = {
    val __obj = js.Dynamic.literal(paramsType = paramsType.asInstanceOf[js.Any], returnType = returnType.asInstanceOf[js.Any])
    __obj.asInstanceOf[ReturnTypeAddVirtualAuthenticatorResponse]
  }
  
  @scala.inline
  implicit class ReturnTypeAddVirtualAuthenticatorResponseOps[Self <: ReturnTypeAddVirtualAuthenticatorResponse] (val x: Self) extends AnyVal {
    
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
    def setParamsTypeVarargs(value: AddVirtualAuthenticatorRequest*): Self = this.set("paramsType", js.Array(value :_*))
    
    @scala.inline
    def setParamsType(value: js.Array[AddVirtualAuthenticatorRequest]): Self = this.set("paramsType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setReturnType(value: AddVirtualAuthenticatorResponse): Self = this.set("returnType", value.asInstanceOf[js.Any])
  }
}
