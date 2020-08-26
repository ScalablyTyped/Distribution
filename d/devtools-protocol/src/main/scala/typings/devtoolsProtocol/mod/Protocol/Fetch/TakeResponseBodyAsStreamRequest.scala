package typings.devtoolsProtocol.mod.Protocol.Fetch

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TakeResponseBodyAsStreamRequest extends js.Object {
  var requestId: RequestId = js.native
}

object TakeResponseBodyAsStreamRequest {
  @scala.inline
  def apply(requestId: RequestId): TakeResponseBodyAsStreamRequest = {
    val __obj = js.Dynamic.literal(requestId = requestId.asInstanceOf[js.Any])
    __obj.asInstanceOf[TakeResponseBodyAsStreamRequest]
  }
  @scala.inline
  implicit class TakeResponseBodyAsStreamRequestOps[Self <: TakeResponseBodyAsStreamRequest] (val x: Self) extends AnyVal {
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
    def setRequestId(value: RequestId): Self = this.set("requestId", value.asInstanceOf[js.Any])
  }
  
}

