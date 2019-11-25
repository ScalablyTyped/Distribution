package typings.fabric

import typings.std.Event
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_EEvent extends js.Object {
  var e: js.UndefOr[Event] = js.undefined
}

object Anon_EEvent {
  @scala.inline
  def apply(e: Event = null): Anon_EEvent = {
    val __obj = js.Dynamic.literal()
    if (e != null) __obj.updateDynamic("e")(e.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_EEvent]
  }
}

