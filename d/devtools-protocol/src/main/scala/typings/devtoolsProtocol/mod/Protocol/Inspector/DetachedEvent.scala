package typings.devtoolsProtocol.mod.Protocol.Inspector

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DetachedEvent extends js.Object {
  /**
    * The reason why connection has been terminated.
    */
  var reason: String = js.native
}

object DetachedEvent {
  @scala.inline
  def apply(reason: String): DetachedEvent = {
    val __obj = js.Dynamic.literal(reason = reason.asInstanceOf[js.Any])
    __obj.asInstanceOf[DetachedEvent]
  }
  @scala.inline
  implicit class DetachedEventOps[Self <: DetachedEvent] (val x: Self) extends AnyVal {
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
    def setReason(value: String): Self = this.set("reason", value.asInstanceOf[js.Any])
  }
  
}

