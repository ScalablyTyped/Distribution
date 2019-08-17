package typings.eventDashTargetDashShim

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object eventDashTargetDashShimMod {
  import typings.eventDashTargetDashShim.Anon_AddEventListener
  import typings.eventDashTargetDashShim.eventDashTargetDashShimMod.EventTargetNs.EventAttributes
  import typings.eventDashTargetDashShim.eventDashTargetDashShimMod.EventTargetNs.EventDefinition
  import typings.eventDashTargetDashShim.eventDashTargetDashShimMod.EventTargetNs.Mode

  type EventTarget[TEvents /* <: EventDefinition */, TEventAttributes /* <: EventDefinition */, TMode /* <: Mode */] = EventAttributes[TEventAttributes] with (Anon_AddEventListener[TEvents, TMode])
}
