package typings.devtoolsProtocol.anon

import typings.devtoolsProtocol.mod.Protocol.HeadlessExperimental.BeginFrameRequest
import typings.devtoolsProtocol.mod.Protocol.HeadlessExperimental.BeginFrameResponse
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ReturnTypeBeginFrameResponse extends js.Object {
  var paramsType: js.Array[js.UndefOr[BeginFrameRequest]] = js.native
  var returnType: BeginFrameResponse = js.native
}

object ReturnTypeBeginFrameResponse {
  @scala.inline
  def apply(paramsType: js.Array[js.UndefOr[BeginFrameRequest]], returnType: BeginFrameResponse): ReturnTypeBeginFrameResponse = {
    val __obj = js.Dynamic.literal(paramsType = paramsType.asInstanceOf[js.Any], returnType = returnType.asInstanceOf[js.Any])
    __obj.asInstanceOf[ReturnTypeBeginFrameResponse]
  }
  @scala.inline
  implicit class ReturnTypeBeginFrameResponseOps[Self <: ReturnTypeBeginFrameResponse] (val x: Self) extends AnyVal {
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
    def setParamsTypeVarargs(value: js.UndefOr[BeginFrameRequest]*): Self = this.set("paramsType", js.Array(value :_*))
    @scala.inline
    def setParamsType(value: js.Array[js.UndefOr[BeginFrameRequest]]): Self = this.set("paramsType", value.asInstanceOf[js.Any])
    @scala.inline
    def setReturnType(value: BeginFrameResponse): Self = this.set("returnType", value.asInstanceOf[js.Any])
  }
  
}

