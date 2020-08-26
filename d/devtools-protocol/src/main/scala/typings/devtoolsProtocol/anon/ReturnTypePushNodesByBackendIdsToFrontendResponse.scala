package typings.devtoolsProtocol.anon

import typings.devtoolsProtocol.mod.Protocol.DOM.PushNodesByBackendIdsToFrontendRequest
import typings.devtoolsProtocol.mod.Protocol.DOM.PushNodesByBackendIdsToFrontendResponse
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ReturnTypePushNodesByBackendIdsToFrontendResponse extends js.Object {
  var paramsType: js.Array[PushNodesByBackendIdsToFrontendRequest] = js.native
  var returnType: PushNodesByBackendIdsToFrontendResponse = js.native
}

object ReturnTypePushNodesByBackendIdsToFrontendResponse {
  @scala.inline
  def apply(
    paramsType: js.Array[PushNodesByBackendIdsToFrontendRequest],
    returnType: PushNodesByBackendIdsToFrontendResponse
  ): ReturnTypePushNodesByBackendIdsToFrontendResponse = {
    val __obj = js.Dynamic.literal(paramsType = paramsType.asInstanceOf[js.Any], returnType = returnType.asInstanceOf[js.Any])
    __obj.asInstanceOf[ReturnTypePushNodesByBackendIdsToFrontendResponse]
  }
  @scala.inline
  implicit class ReturnTypePushNodesByBackendIdsToFrontendResponseOps[Self <: ReturnTypePushNodesByBackendIdsToFrontendResponse] (val x: Self) extends AnyVal {
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
    def setParamsTypeVarargs(value: PushNodesByBackendIdsToFrontendRequest*): Self = this.set("paramsType", js.Array(value :_*))
    @scala.inline
    def setParamsType(value: js.Array[PushNodesByBackendIdsToFrontendRequest]): Self = this.set("paramsType", value.asInstanceOf[js.Any])
    @scala.inline
    def setReturnType(value: PushNodesByBackendIdsToFrontendResponse): Self = this.set("returnType", value.asInstanceOf[js.Any])
  }
  
}

