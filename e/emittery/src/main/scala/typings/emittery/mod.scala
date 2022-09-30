package typings.emittery

import typings.emittery.anon.Instantiable
import typings.std.AsyncIterableIterator
import typings.std.Promise
import typings.std.PropertyKey
import typings.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("emittery", JSImport.Default)
  @js.native
  /**
  	Create a new Emittery instance with the specified options.
  	@returns An instance of Emittery that you can use to listen for and emit events.
  	*/
  open class default[EventData, // TODO: Use `unknown` instead of `any`.
  AllEventData, DatalessEvents] ()
    extends StObject
       with Emittery[EventData, AllEventData, DatalessEvents] {
    def this(options: Options[EventData]) = this()
  }
  /* static members */
  object default {
    
    @JSImport("emittery", JSImport.Default)
    @js.native
    val ^ : js.Any = js.native
    
    /**
    	Toggle debug mode for all instances.
    	Default: `true` if the `DEBUG` environment variable is set to `emittery` or `*`, otherwise `false`.
    	@example
    	```
    	import Emittery from 'emittery';
    	Emittery.isDebugEnabled = true;
    	const emitter1 = new Emittery({debug: {name: 'myEmitter1'}});
    	const emitter2 = new Emittery({debug: {name: 'myEmitter2'}});
    	emitter1.on('test', data => {
    		// …
    	});
    	emitter2.on('otherTest', data => {
    		// …
    	});
    	emitter1.emit('test');
    	//=> [16:43:20.417][emittery:subscribe][myEmitter1] Event Name: test
    	//	data: undefined
    	emitter2.emit('otherTest');
    	//=> [16:43:20.417][emittery:subscribe][myEmitter2] Event Name: otherTest
    	//	data: undefined
    	```
    	*/
    @JSImport("emittery", "default.isDebugEnabled")
    @js.native
    def isDebugEnabled: Boolean = js.native
    inline def isDebugEnabled_=(x: Boolean): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("isDebugEnabled")(x.asInstanceOf[js.Any])
    
    /**
    	Fires when an event listener was added.
    	An object with `listener` and `eventName` (if `on` or `off` was used) is provided as event data.
    	@example
    	```
    	import Emittery from 'emittery';
    	const emitter = new Emittery();
    	emitter.on(Emittery.listenerAdded, ({listener, eventName}) => {
    		console.log(listener);
    		//=> data => {}
    		console.log(eventName);
    		//=> '🦄'
    	});
    	emitter.on('🦄', data => {
    		// Handle data
    	});
    	```
    	*/
    @JSImport("emittery", "default.listenerAdded")
    @js.native
    val listenerAdded: js.Symbol = js.native
    
    /**
    	Fires when an event listener was removed.
    	An object with `listener` and `eventName` (if `on` or `off` was used) is provided as event data.
    	@example
    	```
    	import Emittery from 'emittery';
    	const emitter = new Emittery();
    	const off = emitter.on('🦄', data => {
    		// Handle data
    	});
    	emitter.on(Emittery.listenerRemoved, ({listener, eventName}) => {
    		console.log(listener);
    		//=> data => {}
    		console.log(eventName);
    		//=> '🦄'
    	});
    	off();
    	```
    	*/
    @JSImport("emittery", "default.listenerRemoved")
    @js.native
    val listenerRemoved: js.Symbol = js.native
    
    /**
    	In TypeScript, it returns a decorator which mixins `Emittery` as property `emitteryPropertyName` and `methodNames`, or all `Emittery` methods if `methodNames` is not defined, into the target class.
    	@example
    	```
    	import Emittery from 'emittery';
    	@Emittery.mixin('emittery')
    	class MyClass {}
    	const instance = new MyClass();
    	instance.emit('event');
    	```
    	*/
    inline def mixin(emitteryPropertyName: String): js.Function1[/* klass */ Instantiable, Instantiable] = ^.asInstanceOf[js.Dynamic].applyDynamic("mixin")(emitteryPropertyName.asInstanceOf[js.Any]).asInstanceOf[js.Function1[/* klass */ Instantiable, Instantiable]]
    inline def mixin(emitteryPropertyName: String, methodNames: js.Array[String]): js.Function1[/* klass */ Instantiable, Instantiable] = (^.asInstanceOf[js.Dynamic].applyDynamic("mixin")(emitteryPropertyName.asInstanceOf[js.Any], methodNames.asInstanceOf[js.Any])).asInstanceOf[js.Function1[/* klass */ Instantiable, Instantiable]]
    inline def mixin(emitteryPropertyName: js.Symbol): js.Function1[/* klass */ Instantiable, Instantiable] = ^.asInstanceOf[js.Dynamic].applyDynamic("mixin")(emitteryPropertyName.asInstanceOf[js.Any]).asInstanceOf[js.Function1[/* klass */ Instantiable, Instantiable]]
    inline def mixin(emitteryPropertyName: js.Symbol, methodNames: js.Array[String]): js.Function1[/* klass */ Instantiable, Instantiable] = (^.asInstanceOf[js.Dynamic].applyDynamic("mixin")(emitteryPropertyName.asInstanceOf[js.Any], methodNames.asInstanceOf[js.Any])).asInstanceOf[js.Function1[/* klass */ Instantiable, Instantiable]]
  }
  
  // Helper type for turning the passed `EventData` type map into a list of string keys that don't require data alongside the event name when emitting. Uses the same trick that `Omit` does internally to filter keys by building a map of keys to keys we want to keep, and then accessing all the keys to return just the list of keys we want to keep.
  type DatalessEventNames[EventData] = /* import warning: importer.ImportType#apply Failed type conversion: {[ Key in keyof EventData ]: EventData[Key] extends undefined? Key : never}[keyof EventData] */ js.Any
  
  type DebugLogger[EventData, Name /* <: /* keyof EventData */ String */] = js.Function4[
    /* type */ String, 
    /* debugName */ String, 
    /* eventName */ js.UndefOr[Name], 
    /* eventData */ js.UndefOr[
      /* import warning: importer.ImportType#apply Failed type conversion: EventData[Name] */ js.Any
    ], 
    Unit
  ]
  
  trait DebugOptions[EventData] extends StObject {
    
    /**
    	Toggle debug logging just for this instance.
    	@default false
    	@example
    	```
    	import Emittery from 'emittery';
    	const emitter1 = new Emittery({debug: {name: 'emitter1', enabled: true}});
    	const emitter2 = new Emittery({debug: {name: 'emitter2'}});
    	emitter1.on('test', data => {
    		// …
    	});
    	emitter2.on('test', data => {
    		// …
    	});
    	emitter1.emit('test');
    	//=> [16:43:20.417][emittery:subscribe][emitter1] Event Name: test
    	//	data: undefined
    	emitter2.emit('test');
    	```
    	*/
    val enabled: js.UndefOr[Boolean] = js.undefined
    
    /**
    	Function that handles debug data.
    	@default
    	```
    	(type, debugName, eventName, eventData) => {
    		eventData = JSON.stringify(eventData);
    		if (typeof eventName === 'symbol' || typeof eventName === 'number') {
    			eventName = eventName.toString();
    		}
    		const currentTime = new Date();
    		const logTime = `${currentTime.getHours()}:${currentTime.getMinutes()}:${currentTime.getSeconds()}.${currentTime.getMilliseconds()}`;
    		console.log(`[${logTime}][emittery:${type}][${debugName}] Event Name: ${eventName}\n\tdata: ${eventData}`);
    	}
    	```
    	@example
    	```
    	import Emittery from 'emittery';
    	const myLogger = (type, debugName, eventName, eventData) => {
    		console.log(`[${type}]: ${eventName}`);
    	};
    	const emitter = new Emittery({
    		debug: {
    			name: 'myEmitter',
    			enabled: true,
    			logger: myLogger
    		}
    	});
    	emitter.on('test', data => {
    		// …
    	});
    	emitter.emit('test');
    	//=> [subscribe]: test
    	```
    	*/
    val logger: js.UndefOr[DebugLogger[EventData, /* keyof EventData */ String]] = js.undefined
    
    /**
    	Define a name for the instance of Emittery to use when outputting debug data.
    	@default undefined
    	@example
    	```
    	import Emittery from 'emittery';
    	Emittery.isDebugEnabled = true;
    	const emitter = new Emittery({debug: {name: 'myEmitter'}});
    	emitter.on('test', data => {
    		// …
    	});
    	emitter.emit('test');
    	//=> [16:43:20.417][emittery:subscribe][myEmitter] Event Name: test
    	//	data: undefined
    	```
    	*/
    val name: String
  }
  object DebugOptions {
    
    inline def apply[EventData](name: String): DebugOptions[EventData] = {
      val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any])
      __obj.asInstanceOf[DebugOptions[EventData]]
    }
    
    extension [Self <: DebugOptions[?], EventData](x: Self & DebugOptions[EventData]) {
      
      inline def setEnabled(value: Boolean): Self = StObject.set(x, "enabled", value.asInstanceOf[js.Any])
      
      inline def setEnabledUndefined: Self = StObject.set(x, "enabled", js.undefined)
      
      inline def setLogger(
        value: (/* type */ String, /* debugName */ String, /* eventName */ js.UndefOr[/* keyof EventData */ String], /* eventData */ js.UndefOr[
              /* import warning: importer.ImportType#apply Failed type conversion: EventData[Name] */ js.Any
            ]) => Unit
      ): Self = StObject.set(x, "logger", js.Any.fromFunction4(value))
      
      inline def setLoggerUndefined: Self = StObject.set(x, "logger", js.undefined)
      
      inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait Emittery[EventData, // TODO: Use `unknown` instead of `any`.
  AllEventData, DatalessEvents] extends StObject {
    
    /**
    	Get an async iterator which buffers a tuple of an event name and data each time an event is emitted.
    	Call `return()` on the iterator to remove the subscription.
    	In the same way as for `events`, you can subscribe by using the `for await` statement.
    	@example
    	```
    	import Emittery from 'emittery';
    	const emitter = new Emittery();
    	const iterator = emitter.anyEvent();
    	emitter.emit('🦄', '🌈1'); // Buffered
    	emitter.emit('🌟', '🌈2'); // Buffered
    	iterator.next()
    		.then(({value, done}) => {
    			// done is false
    			// value is ['🦄', '🌈1']
    			return iterator.next();
    		})
    		.then(({value, done}) => {
    			// done is false
    			// value is ['🌟', '🌈2']
    			// revoke subscription
    			return iterator.return();
    		})
    		.then(({done}) => {
    			// done is true
    		});
    	```
    	*/
    def anyEvent(): AsyncIterableIterator[
        js.Tuple2[
          /* keyof EventData */ String, 
          /* import warning: importer.ImportType#apply Failed type conversion: EventData[keyof EventData] */ js.Any
        ]
      ] = js.native
    
    /**
    	Bind the given `methodNames`, or all `Emittery` methods if `methodNames` is not defined, into the `target` object.
    	@example
    	```
    	import Emittery from 'emittery';
    	const object = {};
    	new Emittery().bindMethods(object);
    	object.emit('event');
    	```
    	*/
    def bindMethods(target: Record[String, Any]): Unit = js.native
    def bindMethods(target: Record[String, Any], methodNames: js.Array[String]): Unit = js.native
    
    /**
    	Clear all event listeners on the instance.
    	If `eventName` is given, only the listeners for that event are cleared.
    	*/
    def clearListeners[Name /* <: /* keyof EventData */ String */](): Unit = js.native
    def clearListeners[Name /* <: /* keyof EventData */ String */](eventName: Name): Unit = js.native
    def clearListeners[Name /* <: /* keyof EventData */ String */](eventName: js.Array[Name]): Unit = js.native
    
    // eslint-disable-line @typescript-eslint/prefer-function-type
    /**
    	Debugging options for the current instance.
    	*/
    var debug: DebugOptions[EventData] = js.native
    
    /**
    	Trigger an event asynchronously, optionally with some data. Listeners are called in the order they were added, but executed concurrently.
    	@returns A promise that resolves when all the event listeners are done. *Done* meaning executed if synchronous or resolved when an async/promise-returning function. You usually wouldn't want to wait for this, but you could for example catch possible errors. If any of the listeners throw/reject, the returned promise will be rejected with the error, but the other listeners will not be affected.
    	*/
    def emit[Name /* <: DatalessEvents */](eventName: Name): js.Promise[Unit] = js.native
    def emit[Name /* <: /* keyof EventData */ String */](
      eventName: Name,
      eventData: /* import warning: importer.ImportType#apply Failed type conversion: EventData[Name] */ js.Any
    ): js.Promise[Unit] = js.native
    
    /**
    	Same as `emit()`, but it waits for each listener to resolve before triggering the next one. This can be useful if your events depend on each other. Although ideally they should not. Prefer `emit()` whenever possible.
    	If any of the listeners throw/reject, the returned promise will be rejected with the error and the remaining listeners will *not* be called.
    	@returns A promise that resolves when all the event listeners are done.
    	*/
    def emitSerial[Name /* <: DatalessEvents */](eventName: Name): js.Promise[Unit] = js.native
    def emitSerial[Name /* <: /* keyof EventData */ String */](
      eventName: Name,
      eventData: /* import warning: importer.ImportType#apply Failed type conversion: EventData[Name] */ js.Any
    ): js.Promise[Unit] = js.native
    
    /**
    	Get an async iterator which buffers data each time an event is emitted.
    	Call `return()` on the iterator to remove the subscription.
    	@example
    	```
    	import Emittery from 'emittery';
    	const emitter = new Emittery();
    	const iterator = emitter.events('🦄');
    	emitter.emit('🦄', '🌈1'); // Buffered
    	emitter.emit('🦄', '🌈2'); // Buffered
    	iterator
    		.next()
    		.then(({value, done}) => {
    			// done === false
    			// value === '🌈1'
    			return iterator.next();
    		})
    		.then(({value, done}) => {
    			// done === false
    			// value === '🌈2'
    			// Revoke subscription
    			return iterator.return();
    		})
    		.then(({done}) => {
    			// done === true
    		});
    	```
    	In practice you would usually consume the events using the [for await](https://developer.mozilla.org/en-US/docs/Web/JavaScript/Reference/Statements/for-await...of) statement. In that case, to revoke the subscription simply break the loop.
    	@example
    	```
    	import Emittery from 'emittery';
    	const emitter = new Emittery();
    	const iterator = emitter.events('🦄');
    	emitter.emit('🦄', '🌈1'); // Buffered
    	emitter.emit('🦄', '🌈2'); // Buffered
    	// In an async context.
    	for await (const data of iterator) {
    		if (data === '🌈2') {
    			break; // Revoke the subscription when we see the value `🌈2`.
    		}
    	}
    	```
    	It accepts multiple event names.
    	@example
    	```
    	import Emittery from 'emittery';
    	const emitter = new Emittery();
    	const iterator = emitter.events(['🦄', '🦊']);
    	emitter.emit('🦄', '🌈1'); // Buffered
    	emitter.emit('🦊', '🌈2'); // Buffered
    	iterator
    		.next()
    		.then(({value, done}) => {
    			// done === false
    			// value === '🌈1'
    			return iterator.next();
    		})
    		.then(({value, done}) => {
    			// done === false
    			// value === '🌈2'
    			// Revoke subscription
    			return iterator.return();
    		})
    		.then(({done}) => {
    			// done === true
    		});
    	```
    	*/
    def events[Name /* <: /* keyof EventData */ String */](eventName: Name): AsyncIterableIterator[
        /* import warning: importer.ImportType#apply Failed type conversion: EventData[Name] */ js.Any
      ] = js.native
    def events[Name /* <: /* keyof EventData */ String */](eventName: js.Array[Name]): AsyncIterableIterator[
        /* import warning: importer.ImportType#apply Failed type conversion: EventData[Name] */ js.Any
      ] = js.native
    
    /**
    	The number of listeners for the `eventName` or all events if not specified.
    	*/
    def listenerCount[Name /* <: /* keyof EventData */ String */](): Double = js.native
    def listenerCount[Name /* <: /* keyof EventData */ String */](eventName: Name): Double = js.native
    def listenerCount[Name /* <: /* keyof EventData */ String */](eventName: js.Array[Name]): Double = js.native
    
    /**
    	Remove one or more event subscriptions.
    	@example
    	```
    	import Emittery from 'emittery';
    	const emitter = new Emittery();
    	const listener = data => {
    		console.log(data);
    	};
    	emitter.on(['🦄', '🐶', '🦊'], listener);
    	await emitter.emit('🦄', 'a');
    	await emitter.emit('🐶', 'b');
    	await emitter.emit('🦊', 'c');
    	emitter.off('🦄', listener);
    	emitter.off(['🐶', '🦊'], listener);
    	await emitter.emit('🦄', 'a'); // nothing happens
    	await emitter.emit('🐶', 'b'); // nothing happens
    	await emitter.emit('🦊', 'c'); // nothing happens
    	```
    	*/
    def off[Name /* <: /* keyof AllEventData */ String */](
      eventName: Name,
      listener: js.Function1[
          /* import warning: importer.ImportType#apply Failed type conversion: AllEventData[Name] */ /* eventData */ js.Any, 
          Unit | js.Promise[Unit]
        ]
    ): Unit = js.native
    def off[Name /* <: /* keyof AllEventData */ String */](
      eventName: js.Array[Name],
      listener: js.Function1[
          /* import warning: importer.ImportType#apply Failed type conversion: AllEventData[Name] */ /* eventData */ js.Any, 
          Unit | js.Promise[Unit]
        ]
    ): Unit = js.native
    
    /**
    	Remove an `onAny` subscription.
    	*/
    def offAny(
      listener: js.Function2[
          /* keyof EventData */ /* eventName */ String, 
          /* import warning: importer.ImportType#apply Failed type conversion: EventData[keyof EventData] */ /* eventData */ js.Any, 
          Unit | js.Promise[Unit]
        ]
    ): Unit = js.native
    
    /**
    	Subscribe to one or more events.
    	Using the same listener multiple times for the same event will result in only one method call per emitted event.
    	@returns An unsubscribe method.
    	@example
    	```
    	import Emittery from 'emittery';
    	const emitter = new Emittery();
    	emitter.on('🦄', data => {
    		console.log(data);
    	});
    	emitter.on(['🦄', '🐶'], data => {
    		console.log(data);
    	});
    	emitter.emit('🦄', '🌈'); // log => '🌈' x2
    	emitter.emit('🐶', '🍖'); // log => '🍖'
    	```
    	*/
    def on[Name /* <: /* keyof AllEventData */ String */](
      eventName: Name,
      listener: js.Function1[
          /* import warning: importer.ImportType#apply Failed type conversion: AllEventData[Name] */ /* eventData */ js.Any, 
          Unit | js.Promise[Unit]
        ]
    ): UnsubscribeFunction = js.native
    def on[Name /* <: /* keyof AllEventData */ String */](
      eventName: js.Array[Name],
      listener: js.Function1[
          /* import warning: importer.ImportType#apply Failed type conversion: AllEventData[Name] */ /* eventData */ js.Any, 
          Unit | js.Promise[Unit]
        ]
    ): UnsubscribeFunction = js.native
    
    /**
    	Subscribe to be notified about any event.
    	@returns A method to unsubscribe.
    	*/
    def onAny(
      listener: js.Function2[
          /* keyof EventData */ /* eventName */ String, 
          /* import warning: importer.ImportType#apply Failed type conversion: EventData[keyof EventData] */ /* eventData */ js.Any, 
          Unit | js.Promise[Unit]
        ]
    ): UnsubscribeFunction = js.native
    
    /**
    	Subscribe to one or more events only once. It will be unsubscribed after the first
    	event.
    	@returns The promise of event data when `eventName` is emitted. This promise is extended with an `off` method.
    	@example
    	```
    	import Emittery from 'emittery';
    	const emitter = new Emittery();
    	emitter.once('🦄').then(data => {
    		console.log(data);
    		//=> '🌈'
    	});
    	emitter.once(['🦄', '🐶']).then(data => {
    		console.log(data);
    	});
    	emitter.emit('🦄', '🌈'); // Logs `🌈` twice
    	emitter.emit('🐶', '🍖'); // Nothing happens
    	```
    	*/
    def once[Name /* <: /* keyof AllEventData */ String */](eventName: Name): EmitteryOncePromise[
        /* import warning: importer.ImportType#apply Failed type conversion: AllEventData[Name] */ js.Any
      ] = js.native
    def once[Name /* <: /* keyof AllEventData */ String */](eventName: js.Array[Name]): EmitteryOncePromise[
        /* import warning: importer.ImportType#apply Failed type conversion: AllEventData[Name] */ js.Any
      ] = js.native
  }
  
  @js.native
  trait EmitteryOncePromise[T]
    extends StObject
       with Promise[T] {
    
    def off(): Unit = js.native
  }
  
  type EventName = PropertyKey
  
  @js.native
  trait ListenerChangedData extends StObject {
    
    /**
    	The name of the event that was added or removed if `.on()` or `.off()` was used, or `undefined` if `.onAny()` or `.offAny()` was used.
    	*/
    var eventName: js.UndefOr[EventName] = js.native
    
    /**
    	The listener that was added or removed.
    	*/
    def listener(): Unit | js.Promise[Unit] = js.native
    def listener(eventData: Any): Unit | js.Promise[Unit] = js.native
  }
  
  @js.native
  trait OmnipresentEventData extends StObject
  
  trait Options[EventData] extends StObject {
    
    val debug: js.UndefOr[DebugOptions[EventData]] = js.undefined
  }
  object Options {
    
    inline def apply[EventData](): Options[EventData] = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Options[EventData]]
    }
    
    extension [Self <: Options[?], EventData](x: Self & Options[EventData]) {
      
      inline def setDebug(value: DebugOptions[EventData]): Self = StObject.set(x, "debug", value.asInstanceOf[js.Any])
      
      inline def setDebugUndefined: Self = StObject.set(x, "debug", js.undefined)
    }
  }
  
  type UnsubscribeFunction = js.Function0[Unit]
}
