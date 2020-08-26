package typings.devtoolsProtocol.mod.Protocol.Security

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait VisibleSecurityStateChangedEvent extends js.Object {
  /**
    * Security state information about the page.
    */
  var visibleSecurityState: VisibleSecurityState = js.native
}

object VisibleSecurityStateChangedEvent {
  @scala.inline
  def apply(visibleSecurityState: VisibleSecurityState): VisibleSecurityStateChangedEvent = {
    val __obj = js.Dynamic.literal(visibleSecurityState = visibleSecurityState.asInstanceOf[js.Any])
    __obj.asInstanceOf[VisibleSecurityStateChangedEvent]
  }
  @scala.inline
  implicit class VisibleSecurityStateChangedEventOps[Self <: VisibleSecurityStateChangedEvent] (val x: Self) extends AnyVal {
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
    def setVisibleSecurityState(value: VisibleSecurityState): Self = this.set("visibleSecurityState", value.asInstanceOf[js.Any])
  }
  
}

