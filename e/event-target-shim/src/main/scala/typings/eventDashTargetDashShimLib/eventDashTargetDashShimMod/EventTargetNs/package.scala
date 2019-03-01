package typings
package eventDashTargetDashShimLib.eventDashTargetDashShimMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object EventTargetNs {
  type EventAttributes[TEventAttributes /* <: EventDefinition */] = /* import warning: ImportType.apply c Unsupported type mapping: 
  {[ P in keyof TEventAttributes ]: event-target-shim.event-target-shim.EventTarget.FunctionListener<TEventAttributes[P]> | null}
    */ eventDashTargetDashShimLib.eventDashTargetDashShimLibStrings.EventAttributes with TEventAttributes
  type EventData[TEvents /* <: EventDefinition */, TEventType /* <: java.lang.String */, TMode /* <: Mode */] = (_EventData[TEvents, TEventType, TMode]) | ((stdLib.Pick[
    /* import warning: ImportType.apply Failed type conversion: TEvents[TEventType] */ js.Any, 
    stdLib.Exclude[java.lang.String, OmittableEventKeys]
  ]) with (stdLib.Partial[
    stdLib.Pick[eventDashTargetDashShimLib.eventDashTargetDashShimMod.Event, OmittableEventKeys]
  ]))
  type EventType[TEvents /* <: EventDefinition */, TMode /* <: Mode */] = java.lang.String
  type FunctionListener[TEvent] = js.Function1[/* event */ TEvent, scala.Unit]
  type Listener[TEvent] = FunctionListener[TEvent] | ObjectListener[TEvent]
  type OmittableEventKeys = stdLib.Exclude[
    eventDashTargetDashShimLib.eventDashTargetDashShimLibStrings.`type` | eventDashTargetDashShimLib.eventDashTargetDashShimLibStrings.target | eventDashTargetDashShimLib.eventDashTargetDashShimLibStrings.currentTarget | eventDashTargetDashShimLib.eventDashTargetDashShimLibStrings.srcElement | eventDashTargetDashShimLib.eventDashTargetDashShimLibStrings.NONE | eventDashTargetDashShimLib.eventDashTargetDashShimLibStrings.CAPTURING_PHASE | eventDashTargetDashShimLib.eventDashTargetDashShimLibStrings.BUBBLING_PHASE | eventDashTargetDashShimLib.eventDashTargetDashShimLibStrings.AT_TARGET | eventDashTargetDashShimLib.eventDashTargetDashShimLibStrings.eventPhase | eventDashTargetDashShimLib.eventDashTargetDashShimLibStrings.bubbles | eventDashTargetDashShimLib.eventDashTargetDashShimLibStrings.cancelBubble | eventDashTargetDashShimLib.eventDashTargetDashShimLibStrings.returnValue | eventDashTargetDashShimLib.eventDashTargetDashShimLibStrings.cancelable | eventDashTargetDashShimLib.eventDashTargetDashShimLibStrings.defaultPrevented | eventDashTargetDashShimLib.eventDashTargetDashShimLibStrings.composed | eventDashTargetDashShimLib.eventDashTargetDashShimLibStrings.isTrusted | eventDashTargetDashShimLib.eventDashTargetDashShimLibStrings.timeStamp, 
    eventDashTargetDashShimLib.eventDashTargetDashShimLibStrings.`type`
  ]
  type PickEvent[TEvents /* <: EventDefinition */, TEventType /* <: java.lang.String */] = eventDashTargetDashShimLib.eventDashTargetDashShimMod.Event | (/* import warning: ImportType.apply Failed type conversion: TEvents[TEventType] */ js.Any)
}
