package typings.devtoolsProtocol.mod.Protocol.Fetch

import typings.devtoolsProtocol.mod.Protocol.Network.ErrorReason
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait FailRequestRequest extends js.Object {
  /**
    * Causes the request to fail with the given reason.
    */
  var errorReason: ErrorReason = js.native
  /**
    * An id the client received in requestPaused event.
    */
  var requestId: RequestId = js.native
}

object FailRequestRequest {
  @scala.inline
  def apply(errorReason: ErrorReason, requestId: RequestId): FailRequestRequest = {
    val __obj = js.Dynamic.literal(errorReason = errorReason.asInstanceOf[js.Any], requestId = requestId.asInstanceOf[js.Any])
    __obj.asInstanceOf[FailRequestRequest]
  }
  @scala.inline
  implicit class FailRequestRequestOps[Self <: FailRequestRequest] (val x: Self) extends AnyVal {
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
    def setErrorReason(value: ErrorReason): Self = this.set("errorReason", value.asInstanceOf[js.Any])
    @scala.inline
    def setRequestId(value: RequestId): Self = this.set("requestId", value.asInstanceOf[js.Any])
  }
  
}

