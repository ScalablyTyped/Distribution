package typings.devtoolsProtocol.mod.Protocol.Page

import typings.devtoolsProtocol.devtoolsProtocolStrings.desktop
import typings.devtoolsProtocol.devtoolsProtocolStrings.mobile
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SetTouchEmulationEnabledRequest extends StObject {
  
  /**
    * Touch/gesture events configuration. Default: current platform. (SetTouchEmulationEnabledRequestConfiguration enum)
    */
  var configuration: js.UndefOr[mobile | desktop] = js.native
  
  /**
    * Whether the touch event emulation should be enabled.
    */
  var enabled: Boolean = js.native
}
object SetTouchEmulationEnabledRequest {
  
  @scala.inline
  def apply(enabled: Boolean): SetTouchEmulationEnabledRequest = {
    val __obj = js.Dynamic.literal(enabled = enabled.asInstanceOf[js.Any])
    __obj.asInstanceOf[SetTouchEmulationEnabledRequest]
  }
  
  @scala.inline
  implicit class SetTouchEmulationEnabledRequestMutableBuilder[Self <: SetTouchEmulationEnabledRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setConfiguration(value: mobile | desktop): Self = StObject.set(x, "configuration", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setConfigurationUndefined: Self = StObject.set(x, "configuration", js.undefined)
    
    @scala.inline
    def setEnabled(value: Boolean): Self = StObject.set(x, "enabled", value.asInstanceOf[js.Any])
  }
}
