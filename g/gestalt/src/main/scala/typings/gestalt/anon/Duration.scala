package typings.gestalt.anon

import typings.std.HTMLVideoElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Duration extends js.Object {
  var duration: Double = js.native
  var event: typings.react.mod.SyntheticEvent[HTMLVideoElement, typings.std.Event] = js.native
}

object Duration {
  @scala.inline
  def apply(duration: Double, event: typings.react.mod.SyntheticEvent[HTMLVideoElement, typings.std.Event]): Duration = {
    val __obj = js.Dynamic.literal(duration = duration.asInstanceOf[js.Any], event = event.asInstanceOf[js.Any])
    __obj.asInstanceOf[Duration]
  }
  @scala.inline
  implicit class DurationOps[Self <: Duration] (val x: Self) extends AnyVal {
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
    def setDuration(value: Double): Self = this.set("duration", value.asInstanceOf[js.Any])
    @scala.inline
    def setEvent(value: typings.react.mod.SyntheticEvent[HTMLVideoElement, typings.std.Event]): Self = this.set("event", value.asInstanceOf[js.Any])
  }
  
}

