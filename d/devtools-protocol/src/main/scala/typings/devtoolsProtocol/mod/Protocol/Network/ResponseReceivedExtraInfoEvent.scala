package typings.devtoolsProtocol.mod.Protocol.Network

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ResponseReceivedExtraInfoEvent extends StObject {
  
  /**
    * A list of cookies which were not stored from the response along with the corresponding
    * reasons for blocking. The cookies here may not be valid due to syntax errors, which
    * are represented by the invalid cookie line string instead of a proper cookie.
    */
  var blockedCookies: js.Array[BlockedSetCookieWithReason]
  
  /**
    * Raw response headers as they were received over the wire.
    */
  var headers: Headers
  
  /**
    * Raw response header text as it was received over the wire. The raw text may not always be
    * available, such as in the case of HTTP/2 or QUIC.
    */
  var headersText: js.UndefOr[String] = js.undefined
  
  /**
    * Request identifier. Used to match this information to another responseReceived event.
    */
  var requestId: RequestId
}
object ResponseReceivedExtraInfoEvent {
  
  @scala.inline
  def apply(blockedCookies: js.Array[BlockedSetCookieWithReason], headers: Headers, requestId: RequestId): ResponseReceivedExtraInfoEvent = {
    val __obj = js.Dynamic.literal(blockedCookies = blockedCookies.asInstanceOf[js.Any], headers = headers.asInstanceOf[js.Any], requestId = requestId.asInstanceOf[js.Any])
    __obj.asInstanceOf[ResponseReceivedExtraInfoEvent]
  }
  
  @scala.inline
  implicit class ResponseReceivedExtraInfoEventMutableBuilder[Self <: ResponseReceivedExtraInfoEvent] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setBlockedCookies(value: js.Array[BlockedSetCookieWithReason]): Self = StObject.set(x, "blockedCookies", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBlockedCookiesVarargs(value: BlockedSetCookieWithReason*): Self = StObject.set(x, "blockedCookies", js.Array(value :_*))
    
    @scala.inline
    def setHeaders(value: Headers): Self = StObject.set(x, "headers", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHeadersText(value: String): Self = StObject.set(x, "headersText", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHeadersTextUndefined: Self = StObject.set(x, "headersText", js.undefined)
    
    @scala.inline
    def setRequestId(value: RequestId): Self = StObject.set(x, "requestId", value.asInstanceOf[js.Any])
  }
}
