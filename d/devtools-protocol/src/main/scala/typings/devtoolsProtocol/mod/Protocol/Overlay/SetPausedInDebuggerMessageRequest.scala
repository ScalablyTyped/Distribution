package typings.devtoolsProtocol.mod.Protocol.Overlay

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SetPausedInDebuggerMessageRequest extends StObject {
  
  /**
    * The message to display, also triggers resume and step over controls.
    */
  var message: js.UndefOr[String] = js.undefined
}
object SetPausedInDebuggerMessageRequest {
  
  @scala.inline
  def apply(): SetPausedInDebuggerMessageRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SetPausedInDebuggerMessageRequest]
  }
  
  @scala.inline
  implicit class SetPausedInDebuggerMessageRequestMutableBuilder[Self <: SetPausedInDebuggerMessageRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setMessage(value: String): Self = StObject.set(x, "message", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMessageUndefined: Self = StObject.set(x, "message", js.undefined)
  }
}
