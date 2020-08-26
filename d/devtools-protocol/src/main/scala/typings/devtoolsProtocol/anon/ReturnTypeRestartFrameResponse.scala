package typings.devtoolsProtocol.anon

import typings.devtoolsProtocol.mod.Protocol.Debugger.RestartFrameRequest
import typings.devtoolsProtocol.mod.Protocol.Debugger.RestartFrameResponse
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ReturnTypeRestartFrameResponse extends js.Object {
  var paramsType: js.Array[RestartFrameRequest] = js.native
  var returnType: RestartFrameResponse = js.native
}

object ReturnTypeRestartFrameResponse {
  @scala.inline
  def apply(paramsType: js.Array[RestartFrameRequest], returnType: RestartFrameResponse): ReturnTypeRestartFrameResponse = {
    val __obj = js.Dynamic.literal(paramsType = paramsType.asInstanceOf[js.Any], returnType = returnType.asInstanceOf[js.Any])
    __obj.asInstanceOf[ReturnTypeRestartFrameResponse]
  }
  @scala.inline
  implicit class ReturnTypeRestartFrameResponseOps[Self <: ReturnTypeRestartFrameResponse] (val x: Self) extends AnyVal {
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
    def setParamsTypeVarargs(value: RestartFrameRequest*): Self = this.set("paramsType", js.Array(value :_*))
    @scala.inline
    def setParamsType(value: js.Array[RestartFrameRequest]): Self = this.set("paramsType", value.asInstanceOf[js.Any])
    @scala.inline
    def setReturnType(value: RestartFrameResponse): Self = this.set("returnType", value.asInstanceOf[js.Any])
  }
  
}

