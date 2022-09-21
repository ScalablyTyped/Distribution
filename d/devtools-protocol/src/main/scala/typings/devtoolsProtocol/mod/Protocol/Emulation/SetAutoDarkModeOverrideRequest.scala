package typings.devtoolsProtocol.mod.Protocol.Emulation

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SetAutoDarkModeOverrideRequest extends StObject {
  
  /**
    * Whether to enable or disable automatic dark mode.
    * If not specified, any existing override will be cleared.
    */
  var enabled: js.UndefOr[Boolean] = js.undefined
}
object SetAutoDarkModeOverrideRequest {
  
  inline def apply(): SetAutoDarkModeOverrideRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SetAutoDarkModeOverrideRequest]
  }
  
  extension [Self <: SetAutoDarkModeOverrideRequest](x: Self) {
    
    inline def setEnabled(value: Boolean): Self = StObject.set(x, "enabled", value.asInstanceOf[js.Any])
    
    inline def setEnabledUndefined: Self = StObject.set(x, "enabled", js.undefined)
  }
}
