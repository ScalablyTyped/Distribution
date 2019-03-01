package typings
package flightLib.FlightNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DebugStatic extends js.Object {
  var events: flightLib.Anon_Action
}

object DebugStatic {
  @scala.inline
  def apply(events: flightLib.Anon_Action): DebugStatic = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("events")(events)
    __obj.asInstanceOf[DebugStatic]
  }
}

