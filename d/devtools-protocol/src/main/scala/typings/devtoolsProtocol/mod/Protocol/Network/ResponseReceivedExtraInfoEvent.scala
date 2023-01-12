package typings.devtoolsProtocol.mod.Protocol.Network

import typings.devtoolsProtocol.mod.Protocol.integer
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
  
  /**
    * The IP address space of the resource. The address space can only be determined once the transport
    * established the connection, so we can't send it in `requestWillBeSentExtraInfo`.
    */
  var resourceIPAddressSpace: IPAddressSpace
  
  /**
    * The status code of the response. This is useful in cases the request failed and no responseReceived
    * event is triggered, which is the case for, e.g., CORS errors. This is also the correct status code
    * for cached requests, where the status in responseReceived is a 200 and this will be 304.
    */
  var statusCode: integer
}
object ResponseReceivedExtraInfoEvent {
  
  inline def apply(
    blockedCookies: js.Array[BlockedSetCookieWithReason],
    headers: Headers,
    requestId: RequestId,
    resourceIPAddressSpace: IPAddressSpace,
    statusCode: integer
  ): ResponseReceivedExtraInfoEvent = {
    val __obj = js.Dynamic.literal(blockedCookies = blockedCookies.asInstanceOf[js.Any], headers = headers.asInstanceOf[js.Any], requestId = requestId.asInstanceOf[js.Any], resourceIPAddressSpace = resourceIPAddressSpace.asInstanceOf[js.Any], statusCode = statusCode.asInstanceOf[js.Any])
    __obj.asInstanceOf[ResponseReceivedExtraInfoEvent]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ResponseReceivedExtraInfoEvent] (val x: Self) extends AnyVal {
    
    inline def setBlockedCookies(value: js.Array[BlockedSetCookieWithReason]): Self = StObject.set(x, "blockedCookies", value.asInstanceOf[js.Any])
    
    inline def setBlockedCookiesVarargs(value: BlockedSetCookieWithReason*): Self = StObject.set(x, "blockedCookies", js.Array(value*))
    
    inline def setHeaders(value: Headers): Self = StObject.set(x, "headers", value.asInstanceOf[js.Any])
    
    inline def setHeadersText(value: String): Self = StObject.set(x, "headersText", value.asInstanceOf[js.Any])
    
    inline def setHeadersTextUndefined: Self = StObject.set(x, "headersText", js.undefined)
    
    inline def setRequestId(value: RequestId): Self = StObject.set(x, "requestId", value.asInstanceOf[js.Any])
    
    inline def setResourceIPAddressSpace(value: IPAddressSpace): Self = StObject.set(x, "resourceIPAddressSpace", value.asInstanceOf[js.Any])
    
    inline def setStatusCode(value: integer): Self = StObject.set(x, "statusCode", value.asInstanceOf[js.Any])
  }
}
