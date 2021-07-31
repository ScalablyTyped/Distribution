package typings.devtoolsProtocol.mod.Protocol.Target

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DetachFromTargetRequest extends StObject {
  
  /**
    * Session to detach.
    */
  var sessionId: js.UndefOr[SessionID] = js.undefined
  
  /**
    * Deprecated.
    */
  var targetId: js.UndefOr[TargetID] = js.undefined
}
object DetachFromTargetRequest {
  
  @scala.inline
  def apply(): DetachFromTargetRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DetachFromTargetRequest]
  }
  
  @scala.inline
  implicit class DetachFromTargetRequestMutableBuilder[Self <: DetachFromTargetRequest] (val x: Self) extends AnyVal {
    
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
