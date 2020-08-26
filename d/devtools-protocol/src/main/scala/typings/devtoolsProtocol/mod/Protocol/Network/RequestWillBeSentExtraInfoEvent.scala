package typings.devtoolsProtocol.mod.Protocol.Network

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait RequestWillBeSentExtraInfoEvent extends js.Object {
  /**
    * A list of cookies potentially associated to the requested URL. This includes both cookies sent with
    * the request and the ones not sent; the latter are distinguished by having blockedReason field set.
    */
  var associatedCookies: js.Array[BlockedCookieWithReason] = js.native
  /**
    * Raw request headers as they will be sent over the wire.
    */
  var headers: Headers = js.native
  /**
    * Request identifier. Used to match this information to an existing requestWillBeSent event.
    */
  var requestId: RequestId = js.native
}

object RequestWillBeSentExtraInfoEvent {
  @scala.inline
  def apply(associatedCookies: js.Array[BlockedCookieWithReason], headers: Headers, requestId: RequestId): RequestWillBeSentExtraInfoEvent = {
    val __obj = js.Dynamic.literal(associatedCookies = associatedCookies.asInstanceOf[js.Any], headers = headers.asInstanceOf[js.Any], requestId = requestId.asInstanceOf[js.Any])
    __obj.asInstanceOf[RequestWillBeSentExtraInfoEvent]
  }
  @scala.inline
  implicit class RequestWillBeSentExtraInfoEventOps[Self <: RequestWillBeSentExtraInfoEvent] (val x: Self) extends AnyVal {
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
    def setAssociatedCookiesVarargs(value: BlockedCookieWithReason*): Self = this.set("associatedCookies", js.Array(value :_*))
    @scala.inline
    def setAssociatedCookies(value: js.Array[BlockedCookieWithReason]): Self = this.set("associatedCookies", value.asInstanceOf[js.Any])
    @scala.inline
    def setHeaders(value: Headers): Self = this.set("headers", value.asInstanceOf[js.Any])
    @scala.inline
    def setRequestId(value: RequestId): Self = this.set("requestId", value.asInstanceOf[js.Any])
  }
  
}

