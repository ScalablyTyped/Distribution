package typings.devtoolsProtocol.mod.Protocol.Target

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AttachedToTargetEvent extends StObject {
  
  /**
    * Identifier assigned to the session used to send/receive messages.
    */
  var sessionId: SessionID
  
  var targetInfo: TargetInfo
  
  var waitingForDebugger: Boolean
}
object AttachedToTargetEvent {
  
  @scala.inline
  def apply(sessionId: SessionID, targetInfo: TargetInfo, waitingForDebugger: Boolean): AttachedToTargetEvent = {
    val __obj = js.Dynamic.literal(sessionId = sessionId.asInstanceOf[js.Any], targetInfo = targetInfo.asInstanceOf[js.Any], waitingForDebugger = waitingForDebugger.asInstanceOf[js.Any])
    __obj.asInstanceOf[AttachedToTargetEvent]
  }
  
  @scala.inline
  implicit class AttachedToTargetEventMutableBuilder[Self <: AttachedToTargetEvent] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setSessionId(value: SessionID): Self = StObject.set(x, "sessionId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTargetInfo(value: TargetInfo): Self = StObject.set(x, "targetInfo", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWaitingForDebugger(value: Boolean): Self = StObject.set(x, "waitingForDebugger", value.asInstanceOf[js.Any])
  }
}
