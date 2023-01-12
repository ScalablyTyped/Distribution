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
    * The client security state set for the request.
    */
  var clientSecurityState: js.UndefOr[ClientSecurityState] = js.undefined
  
  /**
    * Connection timing information for the request.
    */
  var connectTiming: ConnectTiming
  
  /**
    * Raw request headers as they will be sent over the wire.
    */
  var headers: Headers
  
  /**
    * Request identifier. Used to match this information to an existing requestWillBeSent event.
    */
  var requestId: RequestId
  
  /**
    * Whether the site has partitioned cookies stored in a partition different than the current one.
    */
  var siteHasCookieInOtherPartition: js.UndefOr[Boolean] = js.undefined
}
object RequestWillBeSentExtraInfoEvent {
  
  inline def apply(
    associatedCookies: js.Array[BlockedCookieWithReason],
    connectTiming: ConnectTiming,
    headers: Headers,
    requestId: RequestId
  ): RequestWillBeSentExtraInfoEvent = {
    val __obj = js.Dynamic.literal(associatedCookies = associatedCookies.asInstanceOf[js.Any], connectTiming = connectTiming.asInstanceOf[js.Any], headers = headers.asInstanceOf[js.Any], requestId = requestId.asInstanceOf[js.Any])
    __obj.asInstanceOf[RequestWillBeSentExtraInfoEvent]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: RequestWillBeSentExtraInfoEvent] (val x: Self) extends AnyVal {
    
    inline def setAssociatedCookies(value: js.Array[BlockedCookieWithReason]): Self = StObject.set(x, "associatedCookies", value.asInstanceOf[js.Any])
    
    inline def setAssociatedCookiesVarargs(value: BlockedCookieWithReason*): Self = StObject.set(x, "associatedCookies", js.Array(value*))
    
    inline def setClientSecurityState(value: ClientSecurityState): Self = StObject.set(x, "clientSecurityState", value.asInstanceOf[js.Any])
    
    inline def setClientSecurityStateUndefined: Self = StObject.set(x, "clientSecurityState", js.undefined)
    
    inline def setConnectTiming(value: ConnectTiming): Self = StObject.set(x, "connectTiming", value.asInstanceOf[js.Any])
    
    inline def setHeaders(value: Headers): Self = StObject.set(x, "headers", value.asInstanceOf[js.Any])
    
    inline def setRequestId(value: RequestId): Self = StObject.set(x, "requestId", value.asInstanceOf[js.Any])
    
    inline def setSiteHasCookieInOtherPartition(value: Boolean): Self = StObject.set(x, "siteHasCookieInOtherPartition", value.asInstanceOf[js.Any])
    
    inline def setSiteHasCookieInOtherPartitionUndefined: Self = StObject.set(x, "siteHasCookieInOtherPartition", js.undefined)
  }
}
