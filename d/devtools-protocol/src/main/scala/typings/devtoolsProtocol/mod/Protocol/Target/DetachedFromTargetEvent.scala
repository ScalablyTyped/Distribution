package typings.devtoolsProtocol.mod.Protocol.Target

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DetachedFromTargetEvent extends StObject {
  
  /**
    * Detached session identifier.
    */
  var sessionId: SessionID
  
  /**
    * Deprecated.
    */
  var targetId: js.UndefOr[TargetID] = js.undefined
}
object DetachedFromTargetEvent {
  
  @scala.inline
  def apply(sessionId: SessionID): DetachedFromTargetEvent = {
    val __obj = js.Dynamic.literal(sessionId = sessionId.asInstanceOf[js.Any])
    __obj.asInstanceOf[DetachedFromTargetEvent]
  }
  
  @scala.inline
  implicit class DetachedFromTargetEventMutableBuilder[Self <: DetachedFromTargetEvent] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setSessionId(value: SessionID): Self = StObject.set(x, "sessionId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTargetId(value: TargetID): Self = StObject.set(x, "targetId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTargetIdUndefined: Self = StObject.set(x, "targetId", js.undefined)
  }
}
