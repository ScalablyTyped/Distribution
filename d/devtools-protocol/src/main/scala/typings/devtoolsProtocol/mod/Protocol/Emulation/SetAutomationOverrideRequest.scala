package typings.devtoolsProtocol.mod.Protocol.Emulation

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SetAutomationOverrideRequest extends StObject {
  
  /**
    * Whether the override should be enabled.
    */
  var enabled: Boolean
}
object SetAutomationOverrideRequest {
  
  inline def apply(enabled: Boolean): SetAutomationOverrideRequest = {
    val __obj = js.Dynamic.literal(enabled = enabled.asInstanceOf[js.Any])
    __obj.asInstanceOf[SetAutomationOverrideRequest]
  }
  
  extension [Self <: SetAutomationOverrideRequest](x: Self) {
    
    inline def setEnabled(value: Boolean): Self = StObject.set(x, "enabled", value.asInstanceOf[js.Any])
  }
}
