package typings.gestalt.anon

import typings.std.HTMLVideoElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Time extends js.Object {
  var event: typings.react.mod.SyntheticEvent[HTMLVideoElement, typings.std.Event] = js.native
  var time: Double = js.native
}

object Time {
  @scala.inline
  def apply(event: typings.react.mod.SyntheticEvent[HTMLVideoElement, typings.std.Event], time: Double): Time = {
    val __obj = js.Dynamic.literal(event = event.asInstanceOf[js.Any], time = time.asInstanceOf[js.Any])
    __obj.asInstanceOf[Time]
  }
  @scala.inline
  implicit class TimeOps[Self <: Time] (val x: Self) extends AnyVal {
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
    def setEvent(value: typings.react.mod.SyntheticEvent[HTMLVideoElement, typings.std.Event]): Self = this.set("event", value.asInstanceOf[js.Any])
    @scala.inline
    def setTime(value: Double): Self = this.set("time", value.asInstanceOf[js.Any])
  }
  
}

