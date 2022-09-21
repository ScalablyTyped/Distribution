package typings.eventemitterAsyncresource

import org.scalablytyped.runtime.Instantiable0
import org.scalablytyped.runtime.Instantiable1
import org.scalablytyped.runtime.Instantiable2
import typings.eventemitterAsyncresource.mod.EventEmitterAsyncResource
import typings.eventemitterAsyncresource.mod.Options
import typings.node.asyncHooksMod.AsyncResource
import typings.node.eventsMod.DOMEventTarget
import typings.node.eventsMod.EventEmitter
import typings.node.eventsMod.NodeEventTarget
import typings.node.eventsMod.StaticEventEmitterOptions
import typings.std.AsyncIterableIterator
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  @js.native
  trait Instantiable
    extends StObject
       with Instantiable0[EventEmitter]
       with Instantiable1[
          /* import warning: importer.ImportType#apply Failed type conversion: infer T */ /* options */ js.Any, 
          EventEmitter
        ]
  
  @js.native
  trait InstantiableAsyncResource
    extends StObject
       with Instantiable1[/* name */ String, AsyncResource]
       with Instantiable2[
          /* name */ String, 
          /* import warning: importer.ImportType#apply Failed type conversion: infer T */ /* options */ js.Any, 
          AsyncResource
        ]
  
  trait Name extends StObject {
    
    var name: js.UndefOr[String] = js.undefined
  }
  object Name {
    
    inline def apply(): Name = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Name]
    }
    
    extension [Self <: Name](x: Self) {
      
      inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    }
  }
  
  @js.native
  trait TypeofAsyncResource extends StObject {
    
    /**
      * Binds the given function to the current execution context.
      *
      * The returned function will have an `asyncResource` property referencing
      * the `AsyncResource` to which the function is bound.
      * @since v14.8.0, v12.19.0
      * @param fn The function to bind to the current execution context.
      * @param type An optional name to associate with the underlying `AsyncResource`.
      */
    /* static member */
    def bind[Func /* <: js.ThisFunction1[/* this */ ThisArg, /* repeated */ Any, Any] */, ThisArg](fn: Func): Func & typings.node.anon.AsyncResource = js.native
    def bind[Func /* <: js.ThisFunction1[/* this */ ThisArg, /* repeated */ Any, Any] */, ThisArg](fn: Func, `type`: String): Func & typings.node.anon.AsyncResource = js.native
    def bind[Func /* <: js.ThisFunction1[/* this */ ThisArg, /* repeated */ Any, Any] */, ThisArg](fn: Func, `type`: String, thisArg: ThisArg): Func & typings.node.anon.AsyncResource = js.native
    def bind[Func /* <: js.ThisFunction1[/* this */ ThisArg, /* repeated */ Any, Any] */, ThisArg](fn: Func, `type`: Unit, thisArg: ThisArg): Func & typings.node.anon.AsyncResource = js.native
  }
  
  @js.native
  trait TypeofEventEmitter extends StObject {
    
    /* static member */
    val captureRejectionSymbol: js.Symbol = js.native
    
    /**
      * Sets or gets the default captureRejection value for all emitters.
      */
    // TODO: These should be described using static getter/setter pairs:
    /* static member */
    var captureRejections: Boolean = js.native
    
    /* static member */
    var defaultMaxListeners: Double = js.native
    
    /**
      * This symbol shall be used to install a listener for only monitoring `'error'`
      * events. Listeners installed using this symbol are called before the regular
      * `'error'` listeners are called.
      *
      * Installing a listener using this symbol does not change the behavior once an
      * `'error'` event is emitted, therefore the process will still crash if no
      * regular `'error'` listener is installed.
      */
    /* static member */
    val errorMonitor: js.Symbol = js.native
    
    /**
      * Returns a copy of the array of listeners for the event named `eventName`.
      *
      * For `EventEmitter`s this behaves exactly the same as calling `.listeners` on
      * the emitter.
      *
      * For `EventTarget`s this is the only way to get the event listeners for the
      * event target. This is useful for debugging and diagnostic purposes.
      *
      * ```js
      * const { getEventListeners, EventEmitter } = require('events');
      *
      * {
      *   const ee = new EventEmitter();
      *   const listener = () => console.log('Events are fun');
      *   ee.on('foo', listener);
      *   getEventListeners(ee, 'foo'); // [listener]
      * }
      * {
      *   const et = new EventTarget();
      *   const listener = () => console.log('Events are fun');
      *   et.addEventListener('foo', listener);
      *   getEventListeners(et, 'foo'); // [listener]
      * }
      * ```
      * @since v15.2.0, v14.17.0
      */
    /* static member */
    def getEventListeners(emitter: DOMEventTarget, name: String): js.Array[js.Function] = js.native
    def getEventListeners(emitter: DOMEventTarget, name: js.Symbol): js.Array[js.Function] = js.native
    def getEventListeners(emitter: typings.node.eventsMod.global.NodeJS.EventEmitter, name: String): js.Array[js.Function] = js.native
    def getEventListeners(emitter: typings.node.eventsMod.global.NodeJS.EventEmitter, name: js.Symbol): js.Array[js.Function] = js.native
    
    /**
      * A class method that returns the number of listeners for the given `eventName`registered on the given `emitter`.
      *
      * ```js
      * const { EventEmitter, listenerCount } = require('events');
      * const myEmitter = new EventEmitter();
      * myEmitter.on('event', () => {});
      * myEmitter.on('event', () => {});
      * console.log(listenerCount(myEmitter, 'event'));
      * // Prints: 2
      * ```
      * @since v0.9.12
      * @deprecated Since v3.2.0 - Use `listenerCount` instead.
      * @param emitter The emitter to query
      * @param eventName The event name
      */
    /* static member */
    def listenerCount(emitter: typings.node.eventsMod.global.NodeJS.EventEmitter, eventName: String): Double = js.native
    def listenerCount(emitter: typings.node.eventsMod.global.NodeJS.EventEmitter, eventName: js.Symbol): Double = js.native
    
    /**
      * ```js
      * const { on, EventEmitter } = require('events');
      *
      * (async () => {
      *   const ee = new EventEmitter();
      *
      *   // Emit later on
      *   process.nextTick(() => {
      *     ee.emit('foo', 'bar');
      *     ee.emit('foo', 42);
      *   });
      *
      *   for await (const event of on(ee, 'foo')) {
      *     // The execution of this inner block is synchronous and it
      *     // processes one event at a time (even with await). Do not use
      *     // if concurrent execution is required.
      *     console.log(event); // prints ['bar'] [42]
      *   }
      *   // Unreachable here
      * })();
      * ```
      *
      * Returns an `AsyncIterator` that iterates `eventName` events. It will throw
      * if the `EventEmitter` emits `'error'`. It removes all listeners when
      * exiting the loop. The `value` returned by each iteration is an array
      * composed of the emitted event arguments.
      *
      * An `AbortSignal` can be used to cancel waiting on events:
      *
      * ```js
      * const { on, EventEmitter } = require('events');
      * const ac = new AbortController();
      *
      * (async () => {
      *   const ee = new EventEmitter();
      *
      *   // Emit later on
      *   process.nextTick(() => {
      *     ee.emit('foo', 'bar');
      *     ee.emit('foo', 42);
      *   });
      *
      *   for await (const event of on(ee, 'foo', { signal: ac.signal })) {
      *     // The execution of this inner block is synchronous and it
      *     // processes one event at a time (even with await). Do not use
      *     // if concurrent execution is required.
      *     console.log(event); // prints ['bar'] [42]
      *   }
      *   // Unreachable here
      * })();
      *
      * process.nextTick(() => ac.abort());
      * ```
      * @since v13.6.0, v12.16.0
      * @param eventName The name of the event being listened for
      * @return that iterates `eventName` events emitted by the `emitter`
      */
    /* static member */
    def on(emitter: typings.node.eventsMod.global.NodeJS.EventEmitter, eventName: String): AsyncIterableIterator[Any] = js.native
    def on(
      emitter: typings.node.eventsMod.global.NodeJS.EventEmitter,
      eventName: String,
      options: StaticEventEmitterOptions
    ): AsyncIterableIterator[Any] = js.native
    
    /* static member */
    def once(emitter: DOMEventTarget, eventName: String): js.Promise[js.Array[Any]] = js.native
    def once(emitter: DOMEventTarget, eventName: String, options: StaticEventEmitterOptions): js.Promise[js.Array[Any]] = js.native
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
      * const { once, EventEmitter } = require('events');
      *
      * async function run() {
      *   const ee = new EventEmitter();
      *
      *   process.nextTick(() => {
      *     ee.emit('myevent', 42);
      *   });
      *
      *   const [value] = await once(ee, 'myevent');
      *   console.log(value);
      *
      *   const err = new Error('kaboom');
      *   process.nextTick(() => {
      *     ee.emit('error', err);
      *   });
      *
      *   try {
      *     await once(ee, 'myevent');
      *   } catch (err) {
      *     console.log('error happened', err);
      *   }
      * }
      *
      * run();
      * ```
      *
      * The special handling of the `'error'` event is only used when `events.once()`is used to wait for another event. If `events.once()` is used to wait for the
      * '`error'` event itself, then it is treated as any other kind of event without
      * special handling:
      *
      * ```js
      * const { EventEmitter, once } = require('events');
      *
      * const ee = new EventEmitter();
      *
      * once(ee, 'error')
      *   .then(([err]) => console.log('ok', err.message))
      *   .catch((err) => console.log('error', err.message));
      *
      * ee.emit('error', new Error('boom'));
      *
      * // Prints: ok boom
      * ```
      *
      * An `AbortSignal` can be used to cancel waiting for the event:
      *
      * ```js
      * const { EventEmitter, once } = require('events');
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
    def once(emitter: NodeEventTarget, eventName: String): js.Promise[js.Array[Any]] = js.native
    def once(emitter: NodeEventTarget, eventName: String, options: StaticEventEmitterOptions): js.Promise[js.Array[Any]] = js.native
    def once(emitter: NodeEventTarget, eventName: js.Symbol): js.Promise[js.Array[Any]] = js.native
    def once(emitter: NodeEventTarget, eventName: js.Symbol, options: StaticEventEmitterOptions): js.Promise[js.Array[Any]] = js.native
    
    /**
      * ```js
      * const {
      *   setMaxListeners,
      *   EventEmitter
      * } = require('events');
      *
      * const target = new EventTarget();
      * const emitter = new EventEmitter();
      *
      * setMaxListeners(5, target, emitter);
      * ```
      * @since v15.4.0
      * @param n A non-negative number. The maximum number of listeners per `EventTarget` event.
      * @param eventsTargets Zero or more {EventTarget} or {EventEmitter} instances. If none are specified, `n` is set as the default max for all newly created {EventTarget} and {EventEmitter}
      * objects.
      */
    /* static member */
    def setMaxListeners(n: Double, eventTargets: (DOMEventTarget | typings.node.eventsMod.global.NodeJS.EventEmitter)*): Unit = js.native
    def setMaxListeners(n: Unit, eventTargets: (DOMEventTarget | typings.node.eventsMod.global.NodeJS.EventEmitter)*): Unit = js.native
  }
  
  @js.native
  trait TypeofEventEmitterAsyncRe
    extends StObject
       with Instantiable0[EventEmitterAsyncResource]
       with Instantiable1[(/* options */ Options) | (/* options */ String), EventEmitterAsyncResource] {
    
    def EventEmitterAsyncResource: /* import warning: importer.ImportType#apply Failed type conversion: typeof EventEmitterAsyncResource */ js.Any = js.native
  }
}
