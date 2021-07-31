package typings.devtoolsProtocol.mod.Protocol.Target

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SendMessageToTargetRequest extends StObject {
  
  var message: String
  
  /**
    * Identifier of the session.
    */
  var sessionId: js.UndefOr[SessionID] = js.undefined
  
  /**
    * Deprecated.
    */
  var targetId: js.UndefOr[TargetID] = js.undefined
}
object SendMessageToTargetRequest {
  
  @scala.inline
  def apply(message: String): SendMessageToTargetRequest = {
    val __obj = js.Dynamic.literal(message = message.asInstanceOf[js.Any])
    __obj.asInstanceOf[SendMessageToTargetRequest]
  }
  
  @scala.inline
  implicit class SendMessageToTargetRequestMutableBuilder[Self <: SendMessageToTargetRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setMessage(value: String): Self = StObject.set(x, "message", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSessionId(value: SessionID): Self = StObject.set(x, "sessionId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSessionIdUndefined: Self = StObject.set(x, "sessionId", js.undefined)
    
    @scala.inline
    def setTargetId(value: TargetID): Self = StObject.set(x, "targetId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTargetIdUndefined: Self = StObject.set(x, "targetId", js.undefined)
  }
}
