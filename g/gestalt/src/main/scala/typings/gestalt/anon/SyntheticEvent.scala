package typings.gestalt.anon

import typings.std.HTMLInputElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SyntheticEvent extends js.Object {
  var syntheticEvent: typings.react.mod.SyntheticEvent[HTMLInputElement, typings.std.Event] = js.native
  var value: String = js.native
}

object SyntheticEvent {
  @scala.inline
  def apply(
    syntheticEvent: typings.react.mod.SyntheticEvent[HTMLInputElement, typings.std.Event],
    value: String
  ): SyntheticEvent = {
    val __obj = js.Dynamic.literal(syntheticEvent = syntheticEvent.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    __obj.asInstanceOf[SyntheticEvent]
  }
  @scala.inline
  implicit class SyntheticEventOps[Self <: SyntheticEvent] (val x: Self) extends AnyVal {
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
    def setSyntheticEvent(value: typings.react.mod.SyntheticEvent[HTMLInputElement, typings.std.Event]): Self = this.set("syntheticEvent", value.asInstanceOf[js.Any])
    @scala.inline
    def setValue(value: String): Self = this.set("value", value.asInstanceOf[js.Any])
  }
  
}

