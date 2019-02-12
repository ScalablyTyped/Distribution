package typings
package eventDashTargetDashShimLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Anon_AddEventListener[TEvents /* <: eventDashTargetDashShimLib.eventDashTargetDashShimMod.EventTargetNs.EventDefinition */, TMode /* <: eventDashTargetDashShimLib.eventDashTargetDashShimMod.EventTargetNs.Mode */] extends js.Object {
  def addEventListener[TEventType /* <: eventDashTargetDashShimLib.eventDashTargetDashShimMod.EventTargetNs.EventType[TEvents, TMode] */](`type`: TEventType): scala.Unit = js.native
  /**
    * Add a given listener to this event target.
    * @param eventName The event name to add.
    * @param listener The listener to add.
    * @param options The options for this listener.
    */
  def addEventListener[TEventType /* <: eventDashTargetDashShimLib.eventDashTargetDashShimMod.EventTargetNs.EventType[TEvents, TMode] */](
    `type`: TEventType,
    listener: eventDashTargetDashShimLib.eventDashTargetDashShimMod.EventTargetNs.Listener[
      eventDashTargetDashShimLib.eventDashTargetDashShimMod.EventTargetNs.PickEvent[TEvents, TEventType]
    ]
  ): scala.Unit = js.native
  def addEventListener[TEventType /* <: eventDashTargetDashShimLib.eventDashTargetDashShimMod.EventTargetNs.EventType[TEvents, TMode] */](
    `type`: TEventType,
    listener: eventDashTargetDashShimLib.eventDashTargetDashShimMod.EventTargetNs.Listener[
      eventDashTargetDashShimLib.eventDashTargetDashShimMod.EventTargetNs.PickEvent[TEvents, TEventType]
    ],
    options: eventDashTargetDashShimLib.eventDashTargetDashShimMod.EventTargetNs.AddOptions
  ): scala.Unit = js.native
  def addEventListener[TEventType /* <: eventDashTargetDashShimLib.eventDashTargetDashShimMod.EventTargetNs.EventType[TEvents, TMode] */](
    `type`: TEventType,
    listener: eventDashTargetDashShimLib.eventDashTargetDashShimMod.EventTargetNs.Listener[
      eventDashTargetDashShimLib.eventDashTargetDashShimMod.EventTargetNs.PickEvent[TEvents, TEventType]
    ],
    options: scala.Boolean
  ): scala.Unit = js.native
  def addEventListener[TEventType /* <: eventDashTargetDashShimLib.eventDashTargetDashShimMod.EventTargetNs.EventType[TEvents, TMode] */](
    `type`: TEventType,
    listener: scala.Null,
    options: eventDashTargetDashShimLib.eventDashTargetDashShimMod.EventTargetNs.AddOptions
  ): scala.Unit = js.native
  def addEventListener[TEventType /* <: eventDashTargetDashShimLib.eventDashTargetDashShimMod.EventTargetNs.EventType[TEvents, TMode] */](`type`: TEventType, listener: scala.Null, options: scala.Boolean): scala.Unit = js.native
  /**
    * Dispatch a given event.
    * @param event The event to dispatch.
    * @returns `false` if canceled.
    */
  def dispatchEvent[TEventType /* <: eventDashTargetDashShimLib.eventDashTargetDashShimMod.EventTargetNs.EventType[TEvents, TMode] */](
    event: eventDashTargetDashShimLib.eventDashTargetDashShimMod.EventTargetNs.EventData[TEvents, TEventType, TMode]
  ): scala.Boolean = js.native
  def removeEventListener[TEventType /* <: eventDashTargetDashShimLib.eventDashTargetDashShimMod.EventTargetNs.EventType[TEvents, TMode] */](`type`: TEventType): scala.Unit = js.native
  /**
    * Remove a given listener from this event target.
    * @param eventName The event name to remove.
    * @param listener The listener to remove.
    * @param options The options for this listener.
    */
  def removeEventListener[TEventType /* <: eventDashTargetDashShimLib.eventDashTargetDashShimMod.EventTargetNs.EventType[TEvents, TMode] */](
    `type`: TEventType,
    listener: eventDashTargetDashShimLib.eventDashTargetDashShimMod.EventTargetNs.Listener[
      eventDashTargetDashShimLib.eventDashTargetDashShimMod.EventTargetNs.PickEvent[TEvents, TEventType]
    ]
  ): scala.Unit = js.native
  def removeEventListener[TEventType /* <: eventDashTargetDashShimLib.eventDashTargetDashShimMod.EventTargetNs.EventType[TEvents, TMode] */](
    `type`: TEventType,
    listener: eventDashTargetDashShimLib.eventDashTargetDashShimMod.EventTargetNs.Listener[
      eventDashTargetDashShimLib.eventDashTargetDashShimMod.EventTargetNs.PickEvent[TEvents, TEventType]
    ],
    options: eventDashTargetDashShimLib.eventDashTargetDashShimMod.EventTargetNs.RemoveOptions
  ): scala.Unit = js.native
  def removeEventListener[TEventType /* <: eventDashTargetDashShimLib.eventDashTargetDashShimMod.EventTargetNs.EventType[TEvents, TMode] */](
    `type`: TEventType,
    listener: eventDashTargetDashShimLib.eventDashTargetDashShimMod.EventTargetNs.Listener[
      eventDashTargetDashShimLib.eventDashTargetDashShimMod.EventTargetNs.PickEvent[TEvents, TEventType]
    ],
    options: scala.Boolean
  ): scala.Unit = js.native
  def removeEventListener[TEventType /* <: eventDashTargetDashShimLib.eventDashTargetDashShimMod.EventTargetNs.EventType[TEvents, TMode] */](
    `type`: TEventType,
    listener: scala.Null,
    options: eventDashTargetDashShimLib.eventDashTargetDashShimMod.EventTargetNs.RemoveOptions
  ): scala.Unit = js.native
  def removeEventListener[TEventType /* <: eventDashTargetDashShimLib.eventDashTargetDashShimMod.EventTargetNs.EventType[TEvents, TMode] */](`type`: TEventType, listener: scala.Null, options: scala.Boolean): scala.Unit = js.native
}

