package typings.devtoolsProtocol.anon

import typings.devtoolsProtocol.mod.Protocol.Target.CreateTargetRequest
import typings.devtoolsProtocol.mod.Protocol.Target.CreateTargetResponse
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ReturnTypeCreateTargetResponse extends js.Object {
  var paramsType: js.Array[CreateTargetRequest] = js.native
  var returnType: CreateTargetResponse = js.native
}

object ReturnTypeCreateTargetResponse {
  @scala.inline
  def apply(paramsType: js.Array[CreateTargetRequest], returnType: CreateTargetResponse): ReturnTypeCreateTargetResponse = {
    val __obj = js.Dynamic.literal(paramsType = paramsType.asInstanceOf[js.Any], returnType = returnType.asInstanceOf[js.Any])
    __obj.asInstanceOf[ReturnTypeCreateTargetResponse]
  }
  @scala.inline
  implicit class ReturnTypeCreateTargetResponseOps[Self <: ReturnTypeCreateTargetResponse] (val x: Self) extends AnyVal {
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
    def setParamsTypeVarargs(value: CreateTargetRequest*): Self = this.set("paramsType", js.Array(value :_*))
    @scala.inline
    def setParamsType(value: js.Array[CreateTargetRequest]): Self = this.set("paramsType", value.asInstanceOf[js.Any])
    @scala.inline
    def setReturnType(value: CreateTargetResponse): Self = this.set("returnType", value.asInstanceOf[js.Any])
  }
  
}

