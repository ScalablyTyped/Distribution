package typings.gestalt.anon

import typings.std.HTMLDivElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Volume extends js.Object {
  var event: typings.react.mod.SyntheticEvent[HTMLDivElement, typings.std.Event] = js.native
  var volume: Double = js.native
}

object Volume {
  @scala.inline
  def apply(event: typings.react.mod.SyntheticEvent[HTMLDivElement, typings.std.Event], volume: Double): Volume = {
    val __obj = js.Dynamic.literal(event = event.asInstanceOf[js.Any], volume = volume.asInstanceOf[js.Any])
    __obj.asInstanceOf[Volume]
  }
  @scala.inline
  implicit class VolumeOps[Self <: Volume] (val x: Self) extends AnyVal {
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
    def setEvent(value: typings.react.mod.SyntheticEvent[HTMLDivElement, typings.std.Event]): Self = this.set("event", value.asInstanceOf[js.Any])
    @scala.inline
    def setVolume(value: Double): Self = this.set("volume", value.asInstanceOf[js.Any])
  }
  
}

