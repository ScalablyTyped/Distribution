package typings
package eventDashTargetDashShimLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object eventDashTargetDashShimMod {
  type EventTarget[TEvents /* <: eventDashTargetDashShimLib.eventDashTargetDashShimMod.EventTargetNs.EventDefinition */, TEventAttributes /* <: eventDashTargetDashShimLib.eventDashTargetDashShimMod.EventTargetNs.EventDefinition */, TMode /* <: eventDashTargetDashShimLib.eventDashTargetDashShimMod.EventTargetNs.Mode */] = eventDashTargetDashShimLib.eventDashTargetDashShimMod.EventTargetNs.EventAttributes[TEventAttributes] with (eventDashTargetDashShimLib.Anon_AddEventListener[TEvents, TMode])
}
