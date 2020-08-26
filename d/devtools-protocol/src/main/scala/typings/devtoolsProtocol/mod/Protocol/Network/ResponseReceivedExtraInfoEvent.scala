package typings.devtoolsProtocol.mod.Protocol.Network

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ResponseReceivedExtraInfoEvent extends js.Object {
  /**
    * A list of cookies which were not stored from the response along with the corresponding
    * reasons for blocking. The cookies here may not be valid due to syntax errors, which
    * are represented by the invalid cookie line string instead of a proper cookie.
    */
  var blockedCookies: js.Array[BlockedSetCookieWithReason] = js.native
  /**
    * Raw response headers as they were received over the wire.
    */
  var headers: Headers = js.native
  /**
    * Raw response header text as it was received over the wire. The raw text may not always be
    * available, such as in the case of HTTP/2 or QUIC.
    */
  var headersText: js.UndefOr[String] = js.native
  /**
    * Request identifier. Used to match this information to another responseReceived event.
    */
  var requestId: RequestId = js.native
}

object ResponseReceivedExtraInfoEvent {
  @scala.inline
  def apply(blockedCookies: js.Array[BlockedSetCookieWithReason], headers: Headers, requestId: RequestId): ResponseReceivedExtraInfoEvent = {
    val __obj = js.Dynamic.literal(blockedCookies = blockedCookies.asInstanceOf[js.Any], headers = headers.asInstanceOf[js.Any], requestId = requestId.asInstanceOf[js.Any])
    __obj.asInstanceOf[ResponseReceivedExtraInfoEvent]
  }
  @scala.inline
  implicit class ResponseReceivedExtraInfoEventOps[Self <: ResponseReceivedExtraInfoEvent] (val x: Self) extends AnyVal {
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
    def setBlockedCookiesVarargs(value: BlockedSetCookieWithReason*): Self = this.set("blockedCookies", js.Array(value :_*))
    @scala.inline
    def setBlockedCookies(value: js.Array[BlockedSetCookieWithReason]): Self = this.set("blockedCookies", value.asInstanceOf[js.Any])
    @scala.inline
    def setHeaders(value: Headers): Self = this.set("headers", value.asInstanceOf[js.Any])
    @scala.inline
    def setRequestId(value: RequestId): Self = this.set("requestId", value.asInstanceOf[js.Any])
    @scala.inline
    def setHeadersText(value: String): Self = this.set("headersText", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteHeadersText: Self = this.set("headersText", js.undefined)
  }
  
}

