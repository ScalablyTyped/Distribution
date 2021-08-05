package typings.devtoolsProtocol.mod.Protocol.Page

import typings.devtoolsProtocol.mod.Protocol.integer
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ScreencastFrameAckRequest extends StObject {
  
  /**
    * Frame number.
    */
  var sessionId: integer
}
object ScreencastFrameAckRequest {
  
  inline def apply(sessionId: integer): ScreencastFrameAckRequest = {
    val __obj = js.Dynamic.literal(sessionId = sessionId.asInstanceOf[js.Any])
    __obj.asInstanceOf[ScreencastFrameAckRequest]
  }
  
  extension [Self <: ScreencastFrameAckRequest](x: Self) {
    
    inline def setSessionId(value: integer): Self = StObject.set(x, "sessionId", value.asInstanceOf[js.Any])
  }
}
