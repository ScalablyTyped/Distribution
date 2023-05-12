package typings.eventsOnce

import typings.node.eventsMod.DOMEventTarget
import typings.node.eventsMod.NodeEventTarget
import typings.node.eventsMod.StaticEventEmitterOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  /* static member */
  inline def apply(emitter: DOMEventTarget, eventName: String): js.Promise[js.Array[Any]] = (^.asInstanceOf[js.Dynamic].apply(emitter.asInstanceOf[js.Any], eventName.asInstanceOf[js.Any])).asInstanceOf[js.Promise[js.Array[Any]]]
  inline def apply(emitter: DOMEventTarget, eventName: String, options: StaticEventEmitterOptions): js.Promise[js.Array[Any]] = (^.asInstanceOf[js.Dynamic].apply(emitter.asInstanceOf[js.Any], eventName.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Promise[js.Array[Any]]]
  /**
    * Creates a `Promise` that is fulfilled when the `EventEmitter` emits the given
    * event or that is rejected if the `EventEmitter` emits `'error'` while waiting.
    * The `Promise` will resolve with an array of all the arguments emitted to the
    * given event.
    *
    * This method is intentionally generic and works with the web platform [EventTarget](https://dom.spec.whatwg.org/#interface-eventtarget) interface, which has no special`'error'` event
    * semantics and does not listen to the `'error'` event.
    *
    * ```js
    * import { once, EventEmitter } from 'node:events';
    * import process from 'node:process';
    *
    * const ee = new EventEmitter();
    *
    * process.nextTick(() => {
    *   ee.emit('myevent', 42);
    * });
    *
    * const [value] = await once(ee, 'myevent');
    * console.log(value);
    *
    * const err = new Error('kaboom');
    * process.nextTick(() => {
    *   ee.emit('error', err);
    * });
    *
    * try {
    *   await once(ee, 'myevent');
    * } catch (err) {
    *   console.error('error happened', err);
    * }
    * ```
    *
    * The special handling of the `'error'` event is only used when `events.once()`is used to wait for another event. If `events.once()` is used to wait for the
    * '`error'` event itself, then it is treated as any other kind of event without
    * special handling:
    *
    * ```js
    * import { EventEmitter, once } from 'node:events';
    *
    * const ee = new EventEmitter();
    *
    * once(ee, 'error')
    *   .then(([err]) => console.log('ok', err.message))
    *   .catch((err) => console.error('error', err.message));
    *
    * ee.emit('error', new Error('boom'));
    *
    * // Prints: ok boom
    * ```
    *
    * An `AbortSignal` can be used to cancel waiting for the event:
    *
    * ```js
    * import { EventEmitter, once } from 'node:events';
    *
    * const ee = new EventEmitter();
    * const ac = new AbortController();
    *
    * async function foo(emitter, event, signal) {
    *   try {
    *     await once(emitter, event, { signal });
    *     console.log('event emitted!');
    *   } catch (error) {
    *     if (error.name === 'AbortError') {
    *       console.error('Waiting for the event was canceled!');
    *     } else {
    *       console.error('There was an error', error.message);
    *     }
    *   }
    * }
    *
    * foo(ee, 'foo', ac.signal);
    * ac.abort(); // Abort waiting for the event
    * ee.emit('foo'); // Prints: Waiting for the event was canceled!
    * ```
    * @since v11.13.0, v10.16.0
    */
  /* static member */
  inline def apply(emitter: NodeEventTarget, eventName: String): js.Promise[js.Array[Any]] = (^.asInstanceOf[js.Dynamic].apply(emitter.asInstanceOf[js.Any], eventName.asInstanceOf[js.Any])).asInstanceOf[js.Promise[js.Array[Any]]]
  inline def apply(emitter: NodeEventTarget, eventName: String, options: StaticEventEmitterOptions): js.Promise[js.Array[Any]] = (^.asInstanceOf[js.Dynamic].apply(emitter.asInstanceOf[js.Any], eventName.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Promise[js.Array[Any]]]
  inline def apply(emitter: NodeEventTarget, eventName: js.Symbol): js.Promise[js.Array[Any]] = (^.asInstanceOf[js.Dynamic].apply(emitter.asInstanceOf[js.Any], eventName.asInstanceOf[js.Any])).asInstanceOf[js.Promise[js.Array[Any]]]
  inline def apply(emitter: NodeEventTarget, eventName: js.Symbol, options: StaticEventEmitterOptions): js.Promise[js.Array[Any]] = (^.asInstanceOf[js.Dynamic].apply(emitter.asInstanceOf[js.Any], eventName.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Promise[js.Array[Any]]]
  
  @JSImport("events.once", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
}
