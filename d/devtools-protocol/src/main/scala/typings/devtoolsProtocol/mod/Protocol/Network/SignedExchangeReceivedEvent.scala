package typings.devtoolsProtocol.mod.Protocol.Network

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SignedExchangeReceivedEvent extends js.Object {
  /**
    * Information about the signed exchange response.
    */
  var info: SignedExchangeInfo = js.native
  /**
    * Request identifier.
    */
  var requestId: RequestId = js.native
}

object SignedExchangeReceivedEvent {
  @scala.inline
  def apply(info: SignedExchangeInfo, requestId: RequestId): SignedExchangeReceivedEvent = {
    val __obj = js.Dynamic.literal(info = info.asInstanceOf[js.Any], requestId = requestId.asInstanceOf[js.Any])
    __obj.asInstanceOf[SignedExchangeReceivedEvent]
  }
  @scala.inline
  implicit class SignedExchangeReceivedEventOps[Self <: SignedExchangeReceivedEvent] (val x: Self) extends AnyVal {
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
    def setInfo(value: SignedExchangeInfo): Self = this.set("info", value.asInstanceOf[js.Any])
    @scala.inline
    def setRequestId(value: RequestId): Self = this.set("requestId", value.asInstanceOf[js.Any])
  }
  
}

