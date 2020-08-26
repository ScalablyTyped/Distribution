package typings.devtoolsProtocol.mod.Protocol.Page

import typings.devtoolsProtocol.devtoolsProtocolStrings.desktop
import typings.devtoolsProtocol.devtoolsProtocolStrings.mobile
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SetTouchEmulationEnabledRequest extends js.Object {
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
    def setConfiguration(value: mobile | desktop): Self = this.set("configuration", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteConfiguration: Self = this.set("configuration", js.undefined)
  }
  
}

