package typings.fabric.anon

import typings.std.Event
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait EEvent extends js.Object {
  var e: js.UndefOr[Event] = js.undefined
}

object EEvent {
  @scala.inline
  def apply(e: Event = null): EEvent = {
    val __obj = js.Dynamic.literal()
    if (e != null) __obj.updateDynamic("e")(e.asInstanceOf[js.Any])
    __obj.asInstanceOf[EEvent]
  }
}

