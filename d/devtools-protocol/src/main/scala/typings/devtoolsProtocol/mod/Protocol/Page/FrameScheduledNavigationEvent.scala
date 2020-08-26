package typings.devtoolsProtocol.mod.Protocol.Page

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait FrameScheduledNavigationEvent extends js.Object {
  /**
    * Delay (in seconds) until the navigation is scheduled to begin. The navigation is not
    * guaranteed to start.
    */
  var delay: Double = js.native
  /**
    * Id of the frame that has scheduled a navigation.
    */
  var frameId: FrameId = js.native
  /**
    * The reason for the navigation.
    */
  var reason: ClientNavigationReason = js.native
  /**
    * The destination URL for the scheduled navigation.
    */
  var url: String = js.native
}

object FrameScheduledNavigationEvent {
  @scala.inline
  def apply(delay: Double, frameId: FrameId, reason: ClientNavigationReason, url: String): FrameScheduledNavigationEvent = {
    val __obj = js.Dynamic.literal(delay = delay.asInstanceOf[js.Any], frameId = frameId.asInstanceOf[js.Any], reason = reason.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any])
    __obj.asInstanceOf[FrameScheduledNavigationEvent]
  }
  @scala.inline
  implicit class FrameScheduledNavigationEventOps[Self <: FrameScheduledNavigationEvent] (val x: Self) extends AnyVal {
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
    def setDelay(value: Double): Self = this.set("delay", value.asInstanceOf[js.Any])
    @scala.inline
    def setFrameId(value: FrameId): Self = this.set("frameId", value.asInstanceOf[js.Any])
    @scala.inline
    def setReason(value: ClientNavigationReason): Self = this.set("reason", value.asInstanceOf[js.Any])
    @scala.inline
    def setUrl(value: String): Self = this.set("url", value.asInstanceOf[js.Any])
  }
  
}

