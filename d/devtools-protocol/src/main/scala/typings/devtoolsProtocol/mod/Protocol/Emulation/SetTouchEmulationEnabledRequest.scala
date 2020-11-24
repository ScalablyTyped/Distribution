package typings.devtoolsProtocol.mod.Protocol.Emulation

import typings.devtoolsProtocol.mod.Protocol.integer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SetTouchEmulationEnabledRequest extends js.Object {
  
  /**
    * Whether the touch event emulation should be enabled.
    */
  var enabled: Boolean = js.native
  
  /**
    * Maximum touch points supported. Defaults to one.
    */
  var maxTouchPoints: js.UndefOr[integer] = js.native
}
object SetTouchEmulationEnabledRequest {
  
  @scala.inline
  def apply(enabled: Boolean): SetTouchEmulationEnabledRequest = {
    val __obj = js.Dynamic.literal(enabled = enabled.asInstanceOf[js.Any])
    __obj.asInstanceOf[SetTouchEmulationEnabledRequest]
  }
  
  @scala.inline
  implicit class SetTouchEmulationEnabledRequestOps[Self <: SetTouchEmulationEnabledRequest] (val x: Self) extends AnyVal {
    
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
    def setMaxTouchPoints(value: integer): Self = this.set("maxTouchPoints", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMaxTouchPoints: Self = this.set("maxTouchPoints", js.undefined)
  }
}
