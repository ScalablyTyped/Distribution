package typings.devtoolsProtocol.mod.Protocol.Emulation

import typings.devtoolsProtocol.devtoolsProtocolStrings.desktop
import typings.devtoolsProtocol.devtoolsProtocolStrings.mobile
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SetEmitTouchEventsForMouseRequest extends StObject {
  
  /**
    * Touch/gesture events configuration. Default: current platform. (SetEmitTouchEventsForMouseRequestConfiguration enum)
    */
  var configuration: js.UndefOr[mobile | desktop] = js.native
  
  /**
    * Whether touch emulation based on mouse input should be enabled.
    */
  var enabled: Boolean = js.native
}
object SetEmitTouchEventsForMouseRequest {
  
  @scala.inline
  def apply(enabled: Boolean): SetEmitTouchEventsForMouseRequest = {
    val __obj = js.Dynamic.literal(enabled = enabled.asInstanceOf[js.Any])
    __obj.asInstanceOf[SetEmitTouchEventsForMouseRequest]
  }
  
  @scala.inline
  implicit class SetEmitTouchEventsForMouseRequestMutableBuilder[Self <: SetEmitTouchEventsForMouseRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setConfiguration(value: mobile | desktop): Self = StObject.set(x, "configuration", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setConfigurationUndefined: Self = StObject.set(x, "configuration", js.undefined)
    
    @scala.inline
    def setEnabled(value: Boolean): Self = StObject.set(x, "enabled", value.asInstanceOf[js.Any])
  }
}
