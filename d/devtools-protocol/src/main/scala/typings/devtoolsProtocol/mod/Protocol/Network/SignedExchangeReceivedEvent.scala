package typings.devtoolsProtocol.mod.Protocol.Network

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SignedExchangeReceivedEvent extends StObject {
  
  /**
    * Information about the signed exchange response.
    */
  var info: SignedExchangeInfo
  
  /**
    * Request identifier.
    */
  var requestId: RequestId
}
object SignedExchangeReceivedEvent {
  
  @scala.inline
  def apply(info: SignedExchangeInfo, requestId: RequestId): SignedExchangeReceivedEvent = {
    val __obj = js.Dynamic.literal(info = info.asInstanceOf[js.Any], requestId = requestId.asInstanceOf[js.Any])
    __obj.asInstanceOf[SignedExchangeReceivedEvent]
  }
  
  @scala.inline
  implicit class SignedExchangeReceivedEventMutableBuilder[Self <: SignedExchangeReceivedEvent] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setInfo(value: SignedExchangeInfo): Self = StObject.set(x, "info", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRequestId(value: RequestId): Self = StObject.set(x, "requestId", value.asInstanceOf[js.Any])
  }
}
