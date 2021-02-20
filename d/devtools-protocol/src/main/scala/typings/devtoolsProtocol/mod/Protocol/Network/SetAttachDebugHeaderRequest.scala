package typings.devtoolsProtocol.mod.Protocol.Network

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SetAttachDebugHeaderRequest extends StObject {
  
  /**
    * Whether to send a debug header.
    */
  var enabled: Boolean = js.native
}
object SetAttachDebugHeaderRequest {
  
  @scala.inline
  def apply(enabled: Boolean): SetAttachDebugHeaderRequest = {
    val __obj = js.Dynamic.literal(enabled = enabled.asInstanceOf[js.Any])
    __obj.asInstanceOf[SetAttachDebugHeaderRequest]
  }
  
  @scala.inline
  implicit class SetAttachDebugHeaderRequestMutableBuilder[Self <: SetAttachDebugHeaderRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setEnabled(value: Boolean): Self = StObject.set(x, "enabled", value.asInstanceOf[js.Any])
  }
}
