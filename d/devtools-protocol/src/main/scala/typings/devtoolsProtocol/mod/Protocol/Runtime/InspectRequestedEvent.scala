package typings.devtoolsProtocol.mod.Protocol.Runtime

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait InspectRequestedEvent extends js.Object {
  var hints: js.Any = js.native
  var `object`: RemoteObject = js.native
}

object InspectRequestedEvent {
  @scala.inline
  def apply(hints: js.Any, `object`: RemoteObject): InspectRequestedEvent = {
    val __obj = js.Dynamic.literal(hints = hints.asInstanceOf[js.Any])
    __obj.updateDynamic("object")(`object`.asInstanceOf[js.Any])
    __obj.asInstanceOf[InspectRequestedEvent]
  }
  @scala.inline
  implicit class InspectRequestedEventOps[Self <: InspectRequestedEvent] (val x: Self) extends AnyVal {
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
    def setHints(value: js.Any): Self = this.set("hints", value.asInstanceOf[js.Any])
    @scala.inline
    def setObject(value: RemoteObject): Self = this.set("object", value.asInstanceOf[js.Any])
  }
  
}

