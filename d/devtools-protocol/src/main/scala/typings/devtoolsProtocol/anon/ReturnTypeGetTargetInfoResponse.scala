package typings.devtoolsProtocol.anon

import typings.devtoolsProtocol.mod.Protocol.Target.GetTargetInfoRequest
import typings.devtoolsProtocol.mod.Protocol.Target.GetTargetInfoResponse
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ReturnTypeGetTargetInfoResponse extends js.Object {
  
  var paramsType: js.Array[js.UndefOr[GetTargetInfoRequest]] = js.native
  
  var returnType: GetTargetInfoResponse = js.native
}
object ReturnTypeGetTargetInfoResponse {
  
  @scala.inline
  def apply(paramsType: js.Array[js.UndefOr[GetTargetInfoRequest]], returnType: GetTargetInfoResponse): ReturnTypeGetTargetInfoResponse = {
    val __obj = js.Dynamic.literal(paramsType = paramsType.asInstanceOf[js.Any], returnType = returnType.asInstanceOf[js.Any])
    __obj.asInstanceOf[ReturnTypeGetTargetInfoResponse]
  }
  
  @scala.inline
  implicit class ReturnTypeGetTargetInfoResponseOps[Self <: ReturnTypeGetTargetInfoResponse] (val x: Self) extends AnyVal {
    
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
    def setParamsTypeVarargs(value: js.UndefOr[GetTargetInfoRequest]*): Self = this.set("paramsType", js.Array(value :_*))
    
    @scala.inline
    def setParamsType(value: js.Array[js.UndefOr[GetTargetInfoRequest]]): Self = this.set("paramsType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setReturnType(value: GetTargetInfoResponse): Self = this.set("returnType", value.asInstanceOf[js.Any])
  }
}
