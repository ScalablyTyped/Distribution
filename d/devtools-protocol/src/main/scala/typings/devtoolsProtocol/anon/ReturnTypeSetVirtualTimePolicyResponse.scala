package typings.devtoolsProtocol.anon

import typings.devtoolsProtocol.mod.Protocol.Emulation.SetVirtualTimePolicyRequest
import typings.devtoolsProtocol.mod.Protocol.Emulation.SetVirtualTimePolicyResponse
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ReturnTypeSetVirtualTimePolicyResponse extends js.Object {
  
  var paramsType: js.Array[SetVirtualTimePolicyRequest] = js.native
  
  var returnType: SetVirtualTimePolicyResponse = js.native
}
object ReturnTypeSetVirtualTimePolicyResponse {
  
  @scala.inline
  def apply(paramsType: js.Array[SetVirtualTimePolicyRequest], returnType: SetVirtualTimePolicyResponse): ReturnTypeSetVirtualTimePolicyResponse = {
    val __obj = js.Dynamic.literal(paramsType = paramsType.asInstanceOf[js.Any], returnType = returnType.asInstanceOf[js.Any])
    __obj.asInstanceOf[ReturnTypeSetVirtualTimePolicyResponse]
  }
  
  @scala.inline
  implicit class ReturnTypeSetVirtualTimePolicyResponseOps[Self <: ReturnTypeSetVirtualTimePolicyResponse] (val x: Self) extends AnyVal {
    
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
    def setParamsTypeVarargs(value: SetVirtualTimePolicyRequest*): Self = this.set("paramsType", js.Array(value :_*))
    
    @scala.inline
    def setParamsType(value: js.Array[SetVirtualTimePolicyRequest]): Self = this.set("paramsType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setReturnType(value: SetVirtualTimePolicyResponse): Self = this.set("returnType", value.asInstanceOf[js.Any])
  }
}
