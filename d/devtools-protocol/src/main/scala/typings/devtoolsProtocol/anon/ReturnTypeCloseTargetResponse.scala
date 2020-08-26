package typings.devtoolsProtocol.anon

import typings.devtoolsProtocol.mod.Protocol.Target.CloseTargetRequest
import typings.devtoolsProtocol.mod.Protocol.Target.CloseTargetResponse
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ReturnTypeCloseTargetResponse extends js.Object {
  var paramsType: js.Array[CloseTargetRequest] = js.native
  var returnType: CloseTargetResponse = js.native
}

object ReturnTypeCloseTargetResponse {
  @scala.inline
  def apply(paramsType: js.Array[CloseTargetRequest], returnType: CloseTargetResponse): ReturnTypeCloseTargetResponse = {
    val __obj = js.Dynamic.literal(paramsType = paramsType.asInstanceOf[js.Any], returnType = returnType.asInstanceOf[js.Any])
    __obj.asInstanceOf[ReturnTypeCloseTargetResponse]
  }
  @scala.inline
  implicit class ReturnTypeCloseTargetResponseOps[Self <: ReturnTypeCloseTargetResponse] (val x: Self) extends AnyVal {
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
    def setParamsTypeVarargs(value: CloseTargetRequest*): Self = this.set("paramsType", js.Array(value :_*))
    @scala.inline
    def setParamsType(value: js.Array[CloseTargetRequest]): Self = this.set("paramsType", value.asInstanceOf[js.Any])
    @scala.inline
    def setReturnType(value: CloseTargetResponse): Self = this.set("returnType", value.asInstanceOf[js.Any])
  }
  
}

