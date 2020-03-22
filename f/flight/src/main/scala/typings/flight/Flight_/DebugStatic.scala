package typings.flight.Flight_

import typings.flight.AnonLogAll
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DebugStatic extends js.Object {
  var events: AnonLogAll
}

object DebugStatic {
  @scala.inline
  def apply(events: AnonLogAll): DebugStatic = {
    val __obj = js.Dynamic.literal(events = events.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[DebugStatic]
  }
}

