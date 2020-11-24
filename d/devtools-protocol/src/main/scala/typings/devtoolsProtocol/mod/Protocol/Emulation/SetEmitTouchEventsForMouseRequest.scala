package typings.devtoolsProtocol.mod.Protocol.Emulation

import typings.devtoolsProtocol.devtoolsProtocolStrings.desktop
import typings.devtoolsProtocol.devtoolsProtocolStrings.mobile
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SetEmitTouchEventsForMouseRequest extends js.Object {
  
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
  implicit class SetEmitTouchEventsForMouseRequestOps[Self <: SetEmitTouchEventsForMouseRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setEnabled(value: Boolean): Self = this.set("enabled", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setConfiguration(value: mobile | desktop): Self = this.set("configuration", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteConfiguration: Self = this.set("configuration", js.undefined)
  }
}
