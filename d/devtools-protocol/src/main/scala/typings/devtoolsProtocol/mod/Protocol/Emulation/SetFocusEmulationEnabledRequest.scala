package typings.devtoolsProtocol.mod.Protocol.Emulation

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SetFocusEmulationEnabledRequest extends StObject {
  
  /**
    * Whether to enable to disable focus emulation.
    */
  var enabled: Boolean = js.native
}
object SetFocusEmulationEnabledRequest {
  
  @scala.inline
  def apply(enabled: Boolean): SetFocusEmulationEnabledRequest = {
    val __obj = js.Dynamic.literal(enabled = enabled.asInstanceOf[js.Any])
    __obj.asInstanceOf[SetFocusEmulationEnabledRequest]
  }
  
  @scala.inline
  implicit class SetFocusEmulationEnabledRequestMutableBuilder[Self <: SetFocusEmulationEnabledRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setEnabled(value: Boolean): Self = StObject.set(x, "enabled", value.asInstanceOf[js.Any])
  }
}
