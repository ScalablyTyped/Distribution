package typings.flight.Flight

import typings.flight.anon.LogAll
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DebugStatic extends js.Object {
  var events: LogAll = js.native
}

object DebugStatic {
  @scala.inline
  def apply(events: LogAll): DebugStatic = {
    val __obj = js.Dynamic.literal(events = events.asInstanceOf[js.Any])
    __obj.asInstanceOf[DebugStatic]
  }
  @scala.inline
  implicit class DebugStaticOps[Self <: DebugStatic] (val x: Self) extends AnyVal {
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
    def setEvents(value: LogAll): Self = this.set("events", value.asInstanceOf[js.Any])
  }
  
}

