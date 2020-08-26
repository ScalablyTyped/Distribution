package typings.devtoolsProtocol.anon

import typings.devtoolsProtocol.mod.Protocol.DOM.MoveToRequest
import typings.devtoolsProtocol.mod.Protocol.DOM.MoveToResponse
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ReturnTypeMoveToResponse extends js.Object {
  var paramsType: js.Array[MoveToRequest] = js.native
  var returnType: MoveToResponse = js.native
}

object ReturnTypeMoveToResponse {
  @scala.inline
  def apply(paramsType: js.Array[MoveToRequest], returnType: MoveToResponse): ReturnTypeMoveToResponse = {
    val __obj = js.Dynamic.literal(paramsType = paramsType.asInstanceOf[js.Any], returnType = returnType.asInstanceOf[js.Any])
    __obj.asInstanceOf[ReturnTypeMoveToResponse]
  }
  @scala.inline
  implicit class ReturnTypeMoveToResponseOps[Self <: ReturnTypeMoveToResponse] (val x: Self) extends AnyVal {
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
    def setParamsTypeVarargs(value: MoveToRequest*): Self = this.set("paramsType", js.Array(value :_*))
    @scala.inline
    def setParamsType(value: js.Array[MoveToRequest]): Self = this.set("paramsType", value.asInstanceOf[js.Any])
    @scala.inline
    def setReturnType(value: MoveToResponse): Self = this.set("returnType", value.asInstanceOf[js.Any])
  }
  
}

