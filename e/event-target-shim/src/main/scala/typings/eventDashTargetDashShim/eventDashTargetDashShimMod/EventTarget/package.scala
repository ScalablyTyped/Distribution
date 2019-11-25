package typings.eventDashTargetDashShim.eventDashTargetDashShimMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object EventTarget {
  import org.scalablytyped.runtime.StringDictionary
  import typings.eventDashTargetDashShim.eventDashTargetDashShimMod.Event
  import typings.eventDashTargetDashShim.eventDashTargetDashShimStrings.AT_TARGET
  import typings.eventDashTargetDashShim.eventDashTargetDashShimStrings.BUBBLING_PHASE
  import typings.eventDashTargetDashShim.eventDashTargetDashShimStrings.CAPTURING_PHASE
  import typings.eventDashTargetDashShim.eventDashTargetDashShimStrings.NONE
  import typings.eventDashTargetDashShim.eventDashTargetDashShimStrings.`type`
  import typings.eventDashTargetDashShim.eventDashTargetDashShimStrings.bubbles
  import typings.eventDashTargetDashShim.eventDashTargetDashShimStrings.cancelBubble
  import typings.eventDashTargetDashShim.eventDashTargetDashShimStrings.cancelable
  import typings.eventDashTargetDashShim.eventDashTargetDashShimStrings.composed
  import typings.eventDashTargetDashShim.eventDashTargetDashShimStrings.currentTarget
  import typings.eventDashTargetDashShim.eventDashTargetDashShimStrings.defaultPrevented
  import typings.eventDashTargetDashShim.eventDashTargetDashShimStrings.eventPhase
  import typings.eventDashTargetDashShim.eventDashTargetDashShimStrings.isTrusted
  import typings.eventDashTargetDashShim.eventDashTargetDashShimStrings.returnValue
  import typings.eventDashTargetDashShim.eventDashTargetDashShimStrings.srcElement
  import typings.eventDashTargetDashShim.eventDashTargetDashShimStrings.target
  import typings.eventDashTargetDashShim.eventDashTargetDashShimStrings.timeStamp
  import typings.std.Exclude
  import typings.std.Partial
  import typings.std.Pick

  type EventAttributes[TEventAttributes /* <: EventDefinition */] = /* import warning: importer.ImportType#apply c Unsupported type mapping: 
  {[ P in keyof TEventAttributes ]: event-target-shim.event-target-shim.EventTarget.FunctionListener<TEventAttributes[P]> | null}
    */ typings.eventDashTargetDashShim.eventDashTargetDashShimStrings.EventAttributes with TEventAttributes
  /* Rewritten from type alias, can be one of: 
    - typings.eventDashTargetDashShim.eventDashTargetDashShimMod.Event
    - typings.eventDashTargetDashShim.eventDashTargetDashShimMod.EventTarget.NonStandardEvent
    - (typings.std.Pick[
  / * import warning: importer.ImportType#apply Failed type conversion: TEvents[TEventType] * / js.Any, 
  typings.std.Exclude[
    / * import warning: importer.ImportType#apply Failed type conversion: keyof TEvents[TEventType] * / js.Any, 
    typings.eventDashTargetDashShim.eventDashTargetDashShimMod.EventTarget.OmittableEventKeys
  ]]) with (typings.std.Partial[
  typings.std.Pick[
    typings.eventDashTargetDashShim.eventDashTargetDashShimMod.Event, 
    typings.eventDashTargetDashShim.eventDashTargetDashShimMod.EventTarget.OmittableEventKeys
  ]])
  */
  type EventData[TEvents /* <: EventDefinition */, TEventType /* <: String */, TMode /* <: Mode */] = (_EventData[TEvents, TEventType, TMode]) | ((Pick[
    /* import warning: importer.ImportType#apply Failed type conversion: TEvents[TEventType] */ js.Any, 
    Exclude[
      /* import warning: importer.ImportType#apply Failed type conversion: keyof TEvents[TEventType] */ js.Any, 
      OmittableEventKeys
    ]
  ]) with (Partial[Pick[Event, OmittableEventKeys]]))
  type EventDefinition = StringDictionary[Event]
  type EventType[TEvents /* <: EventDefinition */, TMode /* <: Mode */] = String
  type FunctionListener[TEvent] = js.Function1[/* event */ TEvent, Unit]
  type Listener[TEvent] = FunctionListener[TEvent] | ObjectListener[TEvent]
  type OmittableEventKeys = Exclude[
    `type` | target | currentTarget | srcElement | NONE | CAPTURING_PHASE | BUBBLING_PHASE | AT_TARGET | eventPhase | bubbles | cancelBubble | returnValue | cancelable | defaultPrevented | composed | isTrusted | timeStamp, 
    `type`
  ]
  type PickEvent[TEvents /* <: EventDefinition */, TEventType /* <: String */] = Event | (/* import warning: importer.ImportType#apply Failed type conversion: TEvents[TEventType] */ js.Any)
}
