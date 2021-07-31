package typings.devtoolsProtocol.mod.Protocol.Network

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait RequestServedFromCacheEvent extends StObject {
  
  /**
    * Request identifier.
    */
  var requestId: RequestId
}
object RequestServedFromCacheEvent {
  
  @scala.inline
  def apply(requestId: RequestId): RequestServedFromCacheEvent = {
    val __obj = js.Dynamic.literal(requestId = requestId.asInstanceOf[js.Any])
    __obj.asInstanceOf[RequestServedFromCacheEvent]
  }
  
  @scala.inline
  implicit class RequestServedFromCacheEventMutableBuilder[Self <: RequestServedFromCacheEvent] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setRequestId(value: RequestId): Self = StObject.set(x, "requestId", value.asInstanceOf[js.Any])
  }
}
