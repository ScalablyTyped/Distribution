package typings.devtoolsProtocol.mod.Protocol.Debugger

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait RestartFrameRequest extends StObject {
  
  /**
    * Call frame identifier to evaluate on.
    */
  var callFrameId: CallFrameId = js.native
}
object RestartFrameRequest {
  
  @scala.inline
  def apply(callFrameId: CallFrameId): RestartFrameRequest = {
    val __obj = js.Dynamic.literal(callFrameId = callFrameId.asInstanceOf[js.Any])
    __obj.asInstanceOf[RestartFrameRequest]
  }
  
  @scala.inline
  implicit class RestartFrameRequestMutableBuilder[Self <: RestartFrameRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCallFrameId(value: CallFrameId): Self = StObject.set(x, "callFrameId", value.asInstanceOf[js.Any])
  }
}
