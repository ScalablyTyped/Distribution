package typings.eeDashFirst.eeDashFirstMod

import typings.node.eventsMod.EventEmitter
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("ee-first", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  /**
    * Get the first event in a set of event emitters and event pairs, then clean up after itself.
    * Invoke `listener` on the first event from the list specified in `eventSpec`.
    *
    * @param eventSpec Array of arrays, with each array in the format `[ee, ...event]`.
    * @param listener Will be called only once, the first time any of the given events are emitted.
    * If `error` is one of the listened events, then if that fires first, the `listener` will be given the `err` argument.
    * `listener`'s arguments:
    * - `err`: the first argument emitted from an error event, if applicable
    * - `ee`: the event emitter that fired
    * - `event`: the string event name that fired
    * - `args`: an array of the arguments that were emitted on the event
    */
  def apply[TEmitter /* <: EventEmitter */](eventSpec: js.Array[js.Array[TEmitter | String]], listener: Listener[TEmitter]): Thunk[TEmitter] = js.native
}

