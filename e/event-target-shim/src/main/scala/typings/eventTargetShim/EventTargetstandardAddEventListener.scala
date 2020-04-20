package typings.eventTargetShim

import typings.eventTargetShim.eventTargetShimStrings.standard
import typings.eventTargetShim.mod.EventTarget.AddOptions
import typings.eventTargetShim.mod.EventTarget.EventDefinition
import typings.eventTargetShim.mod.EventTarget.EventType
import typings.eventTargetShim.mod.EventTarget.Listener
import typings.eventTargetShim.mod.EventTarget.PickEvent
import typings.eventTargetShim.mod.EventTarget.RemoveOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined event-target-shim.event-target-shim.EventTarget<{}, {}, 'standard'> */
@js.native
trait EventTargetstandardAddEventListener[TEvents /* <: EventDefinition */] extends js.Object {
  def addEventListener[TEventType /* <: EventType[js.Object, standard] */](`type`: TEventType): Unit = js.native
  def addEventListener[TEventType /* <: EventType[js.Object, standard] */](`type`: TEventType, listener: Null, options: Boolean): Unit = js.native
  def addEventListener[TEventType /* <: EventType[js.Object, standard] */](`type`: TEventType, listener: Null, options: AddOptions): Unit = js.native
  /**
    * Add a given listener to this event target.
    * @param eventName The event name to add.
    * @param listener The listener to add.
    * @param options The options for this listener.
    */
  def addEventListener[TEventType /* <: EventType[js.Object, standard] */](`type`: TEventType, listener: Listener[PickEvent[js.Object, TEventType]]): Unit = js.native
  def addEventListener[TEventType /* <: EventType[js.Object, standard] */](`type`: TEventType, listener: Listener[PickEvent[js.Object, TEventType]], options: Boolean): Unit = js.native
  def addEventListener[TEventType /* <: EventType[js.Object, standard] */](`type`: TEventType, listener: Listener[PickEvent[js.Object, TEventType]], options: AddOptions): Unit = js.native
  /**
    * Dispatch a given event.
    * @param event The event to dispatch.
    * @returns `false` if canceled.
    */
  def dispatchEvent[TEventType /* <: EventType[js.Object, standard] */](
    event: /* import warning: SimplifyRecursiveTypeAlias.enterTsTypeRef rewrittenOpt applyOrElse Simplified recursive type alias event-target-shim.event-target-shim.EventTarget.EventData<{}, TEventType, 'standard'> */ js.Object
  ): Boolean = js.native
  def removeEventListener[TEventType /* <: EventType[js.Object, standard] */](`type`: TEventType): Unit = js.native
  def removeEventListener[TEventType /* <: EventType[js.Object, standard] */](`type`: TEventType, listener: Null, options: Boolean): Unit = js.native
  def removeEventListener[TEventType /* <: EventType[js.Object, standard] */](`type`: TEventType, listener: Null, options: RemoveOptions): Unit = js.native
  /**
    * Remove a given listener from this event target.
    * @param eventName The event name to remove.
    * @param listener The listener to remove.
    * @param options The options for this listener.
    */
  def removeEventListener[TEventType /* <: EventType[js.Object, standard] */](`type`: TEventType, listener: Listener[PickEvent[js.Object, TEventType]]): Unit = js.native
  def removeEventListener[TEventType /* <: EventType[js.Object, standard] */](`type`: TEventType, listener: Listener[PickEvent[js.Object, TEventType]], options: Boolean): Unit = js.native
  def removeEventListener[TEventType /* <: EventType[js.Object, standard] */](`type`: TEventType, listener: Listener[PickEvent[js.Object, TEventType]], options: RemoveOptions): Unit = js.native
}

