package typings.devtoolsProtocol.mod.Protocol.ApplicationCache

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait NetworkStateUpdatedEvent extends js.Object {
  var isNowOnline: Boolean = js.native
}

object NetworkStateUpdatedEvent {
  @scala.inline
  def apply(isNowOnline: Boolean): NetworkStateUpdatedEvent = {
    val __obj = js.Dynamic.literal(isNowOnline = isNowOnline.asInstanceOf[js.Any])
    __obj.asInstanceOf[NetworkStateUpdatedEvent]
  }
  @scala.inline
  implicit class NetworkStateUpdatedEventOps[Self <: NetworkStateUpdatedEvent] (val x: Self) extends AnyVal {
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
    def setIsNowOnline(value: Boolean): Self = this.set("isNowOnline", value.asInstanceOf[js.Any])
  }
  
}

