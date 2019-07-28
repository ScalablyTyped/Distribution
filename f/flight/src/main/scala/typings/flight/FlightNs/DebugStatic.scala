package typings.flight.FlightNs

import typings.flight.Anon_Action
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DebugStatic extends js.Object {
  var events: Anon_Action
}

object DebugStatic {
  @scala.inline
  def apply(events: Anon_Action): DebugStatic = {
    val __obj = js.Dynamic.literal(events = events)
  
    __obj.asInstanceOf[DebugStatic]
  }
}

