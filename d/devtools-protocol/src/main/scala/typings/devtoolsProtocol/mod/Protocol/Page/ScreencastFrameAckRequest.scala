package typings.devtoolsProtocol.mod.Protocol.Page

import typings.devtoolsProtocol.mod.Protocol.integer
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ScreencastFrameAckRequest extends StObject {
  
  /**
    * Frame number.
    */
  var sessionId: integer = js.native
}
object ScreencastFrameAckRequest {
  
  @scala.inline
  def apply(sessionId: integer): ScreencastFrameAckRequest = {
    val __obj = js.Dynamic.literal(sessionId = sessionId.asInstanceOf[js.Any])
    __obj.asInstanceOf[ScreencastFrameAckRequest]
  }
  
  @scala.inline
  implicit class ScreencastFrameAckRequestMutableBuilder[Self <: ScreencastFrameAckRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setSessionId(value: integer): Self = StObject.set(x, "sessionId", value.asInstanceOf[js.Any])
  }
}
