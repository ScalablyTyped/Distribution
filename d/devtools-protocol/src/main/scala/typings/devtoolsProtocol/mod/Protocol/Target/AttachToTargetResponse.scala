package typings.devtoolsProtocol.mod.Protocol.Target

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AttachToTargetResponse extends StObject {
  
  /**
    * Id assigned to the session.
    */
  var sessionId: SessionID
}
object AttachToTargetResponse {
  
  inline def apply(sessionId: SessionID): AttachToTargetResponse = {
    val __obj = js.Dynamic.literal(sessionId = sessionId.asInstanceOf[js.Any])
    __obj.asInstanceOf[AttachToTargetResponse]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: AttachToTargetResponse] (val x: Self) extends AnyVal {
    
    inline def setSessionId(value: SessionID): Self = StObject.set(x, "sessionId", value.asInstanceOf[js.Any])
  }
}
