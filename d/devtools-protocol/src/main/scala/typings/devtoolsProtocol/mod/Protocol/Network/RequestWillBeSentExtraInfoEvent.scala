package typings.devtoolsProtocol.mod.Protocol.Network

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait RequestWillBeSentExtraInfoEvent extends StObject {
  
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
  implicit class RequestWillBeSentExtraInfoEventMutableBuilder[Self <: RequestWillBeSentExtraInfoEvent] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAssociatedCookies(value: js.Array[BlockedCookieWithReason]): Self = StObject.set(x, "associatedCookies", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAssociatedCookiesVarargs(value: BlockedCookieWithReason*): Self = StObject.set(x, "associatedCookies", js.Array(value :_*))
    
    @scala.inline
    def setHeaders(value: Headers): Self = StObject.set(x, "headers", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRequestId(value: RequestId): Self = StObject.set(x, "requestId", value.asInstanceOf[js.Any])
  }
}
