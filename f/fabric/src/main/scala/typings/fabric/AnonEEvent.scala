package typings.fabric

import typings.std.Event_
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonEEvent extends js.Object {
  var e: js.UndefOr[Event_] = js.undefined
}

object AnonEEvent {
  @scala.inline
  def apply(e: Event_ = null): AnonEEvent = {
    val __obj = js.Dynamic.literal()
    if (e != null) __obj.updateDynamic("e")(e.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonEEvent]
  }
}

