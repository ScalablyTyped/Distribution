package typings.devtoolsProtocol.mod.Protocol.Page

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SetLifecycleEventsEnabledRequest extends js.Object {
  /**
    * If true, starts emitting lifecycle events.
    */
  var enabled: Boolean = js.native
}

object SetLifecycleEventsEnabledRequest {
  @scala.inline
  def apply(enabled: Boolean): SetLifecycleEventsEnabledRequest = {
    val __obj = js.Dynamic.literal(enabled = enabled.asInstanceOf[js.Any])
    __obj.asInstanceOf[SetLifecycleEventsEnabledRequest]
  }
  @scala.inline
  implicit class SetLifecycleEventsEnabledRequestOps[Self <: SetLifecycleEventsEnabledRequest] (val x: Self) extends AnyVal {
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
  }
  
}

