package typings.eeFirst

import typings.node.eventsMod.EventEmitter
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
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
  inline def apply[TEmitter /* <: EventEmitter */](eventSpec: js.Array[Array[TEmitter | String]], listener: Listener[TEmitter]): Thunk[TEmitter] = (^.asInstanceOf[js.Dynamic].apply(eventSpec.asInstanceOf[js.Any], listener.asInstanceOf[js.Any])).asInstanceOf[Thunk[TEmitter]]
  
  @JSImport("ee-first", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  type Listener[TEmitter /* <: EventEmitter */] = js.Function4[
    /* err */ Any, 
    /* ee */ TEmitter, 
    /* event */ js.Array[String], 
    /* args */ js.Array[Any], 
    Unit
  ]
  
  @js.native
  trait Thunk[TEmitter /* <: EventEmitter */] extends StObject {
    
    def apply(listener: Listener[TEmitter]): Unit = js.native
    
    /**
      * The group of listeners can be cancelled before being invoked and have all the event listeners removed
      * from the underlying event emitters.
      */
    def cancel(): Unit = js.native
  }
}
