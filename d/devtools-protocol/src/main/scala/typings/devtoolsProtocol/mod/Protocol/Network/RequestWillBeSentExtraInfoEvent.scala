package typings.devtoolsProtocol.mod.Protocol.Network

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait RequestWillBeSentExtraInfoEvent extends StObject {
  
  /**
    * A list of cookies potentially associated to the requested URL. This includes both cookies sent with
    * the request and the ones not sent; the latter are distinguished by having blockedReason field set.
    */
  var associatedCookies: js.Array[BlockedCookieWithReason]
  
  /**
    * Raw request headers as they will be sent over the wire.
    */
  var headers: Headers
  
  /**
    * Request identifier. Used to match this information to an existing requestWillBeSent event.
    */
  var requestId: RequestId
}
object RequestWillBeSentExtraInfoEvent {
  
  inline def apply(associatedCookies: js.Array[BlockedCookieWithReason], headers: Headers, requestId: RequestId): RequestWillBeSentExtraInfoEvent = {
    val __obj = js.Dynamic.literal(associatedCookies = associatedCookies.asInstanceOf[js.Any], headers = headers.asInstanceOf[js.Any], requestId = requestId.asInstanceOf[js.Any])
    __obj.asInstanceOf[RequestWillBeSentExtraInfoEvent]
  }
  
  extension [Self <: RequestWillBeSentExtraInfoEvent](x: Self) {
    
    inline def setAssociatedCookies(value: js.Array[BlockedCookieWithReason]): Self = StObject.set(x, "associatedCookies", value.asInstanceOf[js.Any])
    
    inline def setAssociatedCookiesVarargs(value: BlockedCookieWithReason*): Self = StObject.set(x, "associatedCookies", js.Array(value :_*))
    
    inline def setHeaders(value: Headers): Self = StObject.set(x, "headers", value.asInstanceOf[js.Any])
    
    inline def setRequestId(value: RequestId): Self = StObject.set(x, "requestId", value.asInstanceOf[js.Any])
  }
}
