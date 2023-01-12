package typings.devtoolsProtocol.mod.Protocol.Target

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AttachToBrowserTargetResponse extends StObject {
  
  /**
    * Id assigned to the session.
    */
  var sessionId: SessionID
}
object AttachToBrowserTargetResponse {
  
  inline def apply(sessionId: SessionID): AttachToBrowserTargetResponse = {
    val __obj = js.Dynamic.literal(sessionId = sessionId.asInstanceOf[js.Any])
    __obj.asInstanceOf[AttachToBrowserTargetResponse]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: AttachToBrowserTargetResponse] (val x: Self) extends AnyVal {
    
    inline def setSessionId(value: SessionID): Self = StObject.set(x, "sessionId", value.asInstanceOf[js.Any])
  }
}
