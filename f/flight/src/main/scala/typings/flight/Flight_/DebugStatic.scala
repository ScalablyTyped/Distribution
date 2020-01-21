package typings.flight.Flight_

import typings.flight.AnonAction
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DebugStatic extends js.Object {
  var events: AnonAction
}

object DebugStatic {
  @scala.inline
  def apply(events: AnonAction): DebugStatic = {
    val __obj = js.Dynamic.literal(events = events.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[DebugStatic]
  }
}

