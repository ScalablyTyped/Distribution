package typings.devtoolsProtocol.mod.Protocol.Emulation

import typings.devtoolsProtocol.mod.Protocol.integer
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SetTouchEmulationEnabledRequest extends StObject {
  
  /**
    * Whether the touch event emulation should be enabled.
    */
  var enabled: Boolean
  
  /**
    * Maximum touch points supported. Defaults to one.
    */
  var maxTouchPoints: js.UndefOr[integer] = js.undefined
}
object SetTouchEmulationEnabledRequest {
  
  inline def apply(enabled: Boolean): SetTouchEmulationEnabledRequest = {
    val __obj = js.Dynamic.literal(enabled = enabled.asInstanceOf[js.Any])
    __obj.asInstanceOf[SetTouchEmulationEnabledRequest]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: SetTouchEmulationEnabledRequest] (val x: Self) extends AnyVal {
    
    inline def setEnabled(value: Boolean): Self = StObject.set(x, "enabled", value.asInstanceOf[js.Any])
    
    inline def setMaxTouchPoints(value: integer): Self = StObject.set(x, "maxTouchPoints", value.asInstanceOf[js.Any])
    
    inline def setMaxTouchPointsUndefined: Self = StObject.set(x, "maxTouchPoints", js.undefined)
  }
}
