package typings.devtoolsProtocol.anon

import typings.devtoolsProtocol.mod.Protocol.DOMDebugger.GetEventListenersRequest
import typings.devtoolsProtocol.mod.Protocol.DOMDebugger.GetEventListenersResponse
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ReturnTypeGetEventListenersResponse extends js.Object {
  var paramsType: js.Array[GetEventListenersRequest] = js.native
  var returnType: GetEventListenersResponse = js.native
}

object ReturnTypeGetEventListenersResponse {
  @scala.inline
  def apply(paramsType: js.Array[GetEventListenersRequest], returnType: GetEventListenersResponse): ReturnTypeGetEventListenersResponse = {
    val __obj = js.Dynamic.literal(paramsType = paramsType.asInstanceOf[js.Any], returnType = returnType.asInstanceOf[js.Any])
    __obj.asInstanceOf[ReturnTypeGetEventListenersResponse]
  }
  @scala.inline
  implicit class ReturnTypeGetEventListenersResponseOps[Self <: ReturnTypeGetEventListenersResponse] (val x: Self) extends AnyVal {
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
    def setParamsTypeVarargs(value: GetEventListenersRequest*): Self = this.set("paramsType", js.Array(value :_*))
    @scala.inline
    def setParamsType(value: js.Array[GetEventListenersRequest]): Self = this.set("paramsType", value.asInstanceOf[js.Any])
    @scala.inline
    def setReturnType(value: GetEventListenersResponse): Self = this.set("returnType", value.asInstanceOf[js.Any])
  }
  
}

