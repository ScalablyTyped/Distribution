package typings.eventToPromise

import typings.node.eventsMod.EventEmitter
import typings.std.EventTarget
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
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
  @scala.inline
  def apply(emitter: EventSource, event: String): js.Promise[js.Any] = (^.asInstanceOf[js.Dynamic].apply(emitter.asInstanceOf[js.Any], event.asInstanceOf[js.Any])).asInstanceOf[js.Promise[js.Any]]
  @scala.inline
  def apply(emitter: EventSource, event: String, options: EventToPromiseOptions): js.Promise[js.Any] = (^.asInstanceOf[js.Dynamic].apply(emitter.asInstanceOf[js.Any], event.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Promise[js.Any]]
  
  @JSImport("event-to-promise", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @scala.inline
  def multi(emitter: EventSource, successEvents: js.Array[String]): js.Promise[js.Any] = (^.asInstanceOf[js.Dynamic].applyDynamic("multi")(emitter.asInstanceOf[js.Any], successEvents.asInstanceOf[js.Any])).asInstanceOf[js.Promise[js.Any]]
  @scala.inline
  def multi(emitter: EventSource, successEvents: js.Array[String], errorEvents: js.Array[String]): js.Promise[js.Any] = (^.asInstanceOf[js.Dynamic].applyDynamic("multi")(emitter.asInstanceOf[js.Any], successEvents.asInstanceOf[js.Any], errorEvents.asInstanceOf[js.Any])).asInstanceOf[js.Promise[js.Any]]
  
  type EventSource = EventEmitter | EventTarget
  
  trait EventToPromiseOptions extends StObject {
    
    /**  If true, all parameters of the emitted events are put in an array which is used to resolve/reject the promise. (default: `false`) */
    var array: js.UndefOr[Boolean] = js.undefined
    
    /** The name of the event which rejects the promise. (default: `'error'`) */
    var error: js.UndefOr[String] = js.undefined
    
    /** Whether the error event should be ignored and not reject the promise. (default: `false`) */
    var ignoreErrors: js.UndefOr[Boolean] = js.undefined
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
