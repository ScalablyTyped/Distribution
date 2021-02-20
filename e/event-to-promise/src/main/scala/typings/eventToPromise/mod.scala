package typings.eventToPromise

import typings.node.eventsMod.EventEmitter
import typings.std.EventTarget
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  /**
    * Wait for one event. The first parameter of the emitted event is used to resolve/reject the promise.
    * 
    * @param emitter  The event emitter you want to watch an event on.
    * @param event    The name of the event you want to watch.
    * @param options  An `Object` controlling advanced options.
    * @return         The returned promise has a `cancel()` method which can be used to remove the event listeners. Note that the promise will never settled if canceled.
    */
  @JSImport("event-to-promise", JSImport.Namespace)
  @js.native
  def apply(emitter: EventSource, event: String): js.Promise[_] = js.native
  @JSImport("event-to-promise", JSImport.Namespace)
  @js.native
  def apply(emitter: EventSource, event: String, options: EventToPromiseOptions): js.Promise[_] = js.native
  
  @JSImport("event-to-promise", "multi")
  @js.native
  def multi(emitter: EventSource, successEvents: js.Array[String]): js.Promise[_] = js.native
  @JSImport("event-to-promise", "multi")
  @js.native
  def multi(emitter: EventSource, successEvents: js.Array[String], errorEvents: js.Array[String]): js.Promise[_] = js.native
  
  type EventSource = EventEmitter | EventTarget
  
  @js.native
  trait EventToPromiseOptions extends StObject {
    
    /**  If true, all parameters of the emitted events are put in an array which is used to resolve/reject the promise. (default: `false`) */
    var array: js.UndefOr[Boolean] = js.native
    
    /** The name of the event which rejects the promise. (default: `'error'`) */
    var error: js.UndefOr[String] = js.native
    
    /** Whether the error event should be ignored and not reject the promise. (default: `false`) */
    var ignoreErrors: js.UndefOr[Boolean] = js.native
  }
  object EventToPromiseOptions {
    
    @scala.inline
    def apply(): EventToPromiseOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[EventToPromiseOptions]
    }
    
    @scala.inline
    implicit class EventToPromiseOptionsMutableBuilder[Self <: EventToPromiseOptions] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setArray(value: Boolean): Self = StObject.set(x, "array", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setArrayUndefined: Self = StObject.set(x, "array", js.undefined)
      
      @scala.inline
      def setError(value: String): Self = StObject.set(x, "error", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setErrorUndefined: Self = StObject.set(x, "error", js.undefined)
      
      @scala.inline
      def setIgnoreErrors(value: Boolean): Self = StObject.set(x, "ignoreErrors", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIgnoreErrorsUndefined: Self = StObject.set(x, "ignoreErrors", js.undefined)
    }
  }
}
