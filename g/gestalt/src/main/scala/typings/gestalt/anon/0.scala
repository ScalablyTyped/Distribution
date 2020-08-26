package typings.gestalt.anon

import typings.std.HTMLInputElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait `0` extends js.Object {
  var event: typings.react.mod.SyntheticEvent[HTMLInputElement, typings.std.Event] = js.native
}

object `0` {
  @scala.inline
  def apply(event: typings.react.mod.SyntheticEvent[HTMLInputElement, typings.std.Event]): `0` = {
    val __obj = js.Dynamic.literal(event = event.asInstanceOf[js.Any])
    __obj.asInstanceOf[`0`]
  }
  @scala.inline
  implicit class `0Ops`[Self <: `0`] (val x: Self) extends AnyVal {
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
    def setEvent(value: typings.react.mod.SyntheticEvent[HTMLInputElement, typings.std.Event]): Self = this.set("event", value.asInstanceOf[js.Any])
  }
  
}

