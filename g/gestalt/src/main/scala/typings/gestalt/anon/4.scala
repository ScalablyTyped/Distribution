package typings.gestalt.anon

import typings.std.HTMLVideoElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait `4` extends js.Object {
  var event: typings.react.mod.SyntheticEvent[HTMLVideoElement, typings.std.Event] = js.native
}

object `4` {
  @scala.inline
  def apply(event: typings.react.mod.SyntheticEvent[HTMLVideoElement, typings.std.Event]): `4` = {
    val __obj = js.Dynamic.literal(event = event.asInstanceOf[js.Any])
    __obj.asInstanceOf[`4`]
  }
  @scala.inline
  implicit class `4Ops`[Self <: `4`] (val x: Self) extends AnyVal {
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
  }
  
}

