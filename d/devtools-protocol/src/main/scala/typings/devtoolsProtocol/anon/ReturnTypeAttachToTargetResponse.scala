package typings.devtoolsProtocol.anon

import typings.devtoolsProtocol.mod.Protocol.Target.AttachToTargetRequest
import typings.devtoolsProtocol.mod.Protocol.Target.AttachToTargetResponse
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ReturnTypeAttachToTargetResponse extends js.Object {
  
  var paramsType: js.Array[AttachToTargetRequest] = js.native
  
  var returnType: AttachToTargetResponse = js.native
}
object ReturnTypeAttachToTargetResponse {
  
  @scala.inline
  def apply(paramsType: js.Array[AttachToTargetRequest], returnType: AttachToTargetResponse): ReturnTypeAttachToTargetResponse = {
    val __obj = js.Dynamic.literal(paramsType = paramsType.asInstanceOf[js.Any], returnType = returnType.asInstanceOf[js.Any])
    __obj.asInstanceOf[ReturnTypeAttachToTargetResponse]
  }
  
  @scala.inline
  implicit class ReturnTypeAttachToTargetResponseOps[Self <: ReturnTypeAttachToTargetResponse] (val x: Self) extends AnyVal {
    
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
    def setParamsTypeVarargs(value: AttachToTargetRequest*): Self = this.set("paramsType", js.Array(value :_*))
    
    @scala.inline
    def setParamsType(value: js.Array[AttachToTargetRequest]): Self = this.set("paramsType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setReturnType(value: AttachToTargetResponse): Self = this.set("returnType", value.asInstanceOf[js.Any])
  }
}
