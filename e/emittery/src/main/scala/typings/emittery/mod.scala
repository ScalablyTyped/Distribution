package typings.emittery

import typings.std.AsyncIterableIterator
import typings.std.Extract
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("emittery", JSImport.Namespace)
  @js.native
  class ^ ()
    extends StObject
       with Emittery
  @JSImport("emittery", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  /**
  	Async event emitter.
  	You must list supported events and the data type they emit, if any.
  	@example
  	```
  	import Emittery = require('emittery');
  	const emitter = new Emittery.Typed<{value: string}, 'open' | 'close'>();
  	emitter.emit('open');
  	emitter.emit('value', 'foo\n');
  	emitter.emit('value', 1); // TS compilation error
  	emitter.emit('end'); // TS compilation error
  	```
  	*/
  @JSImport("emittery", "Typed")
  @js.native
  class Typed[EventDataMap /* <: Events */, EmptyEvents /* <: EventName */] ()
    extends StObject
       with Emittery {
    
    def off[Name /* <: EmptyEvents */](eventName: Name, listener: js.Function0[Unit]): Unit = js.native
    
    def on[Name /* <: EmptyEvents */](eventName: Name, listener: js.Function0[Unit]): UnsubscribeFn = js.native
    
    @JSName("once")
    def once_Name_EmptyEvents[Name /* <: EmptyEvents */](eventName: Name): js.Promise[Unit] = js.native
  }
  
  /**
  	Fires when an event listener was added.
  	An object with `listener` and `eventName` (if `on` or `off` was used) is provided as event data.
  	@example
  	```
  	import Emittery = require('emittery');
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
  /* static member */
  @JSImport("emittery", "listenerAdded")
  @js.native
  val listenerAdded: js.Symbol = js.native
  
  /**
  	Fires when an event listener was removed.
  	An object with `listener` and `eventName` (if `on` or `off` was used) is provided as event data.
  	@example
  	```
  	import Emittery = require('emittery');
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
  /* static member */
  @JSImport("emittery", "listenerRemoved")
  @js.native
  val listenerRemoved: js.Symbol = js.native
  
  /**
  	In TypeScript, it returns a decorator which mixins `Emittery` as property `emitteryPropertyName` and `methodNames`, or all `Emittery` methods if `methodNames` is not defined, into the target class.
  	@example
  	```
  	import Emittery = require('emittery');
  	@Emittery.mixin('emittery')
  	class MyClass {}
  	const instance = new MyClass();
  	instance.emit('event');
  	```
  	*/
  /* static member */
  @scala.inline
  def mixin(emitteryPropertyName: String): js.Function = ^.asInstanceOf[js.Dynamic].applyDynamic("mixin")(emitteryPropertyName.asInstanceOf[js.Any]).asInstanceOf[js.Function]
  @scala.inline
  def mixin(emitteryPropertyName: String, methodNames: js.Array[String]): js.Function = (^.asInstanceOf[js.Dynamic].applyDynamic("mixin")(emitteryPropertyName.asInstanceOf[js.Any], methodNames.asInstanceOf[js.Any])).asInstanceOf[js.Function]
  @scala.inline
  def mixin(emitteryPropertyName: js.Symbol): js.Function = ^.asInstanceOf[js.Dynamic].applyDynamic("mixin")(emitteryPropertyName.asInstanceOf[js.Any]).asInstanceOf[js.Function]
  @scala.inline
  def mixin(emitteryPropertyName: js.Symbol, methodNames: js.Array[String]): js.Function = (^.asInstanceOf[js.Dynamic].applyDynamic("mixin")(emitteryPropertyName.asInstanceOf[js.Any], methodNames.asInstanceOf[js.Any])).asInstanceOf[js.Function]
  
  @js.native
  trait Emittery extends StObject {
    
    /**
    	Get an async iterator which buffers a tuple of an event name and data each time an event is emitted.
    	Call `return()` on the iterator to remove the subscription.
    	In the same way as for `events`, you can subscribe by using the `for await` statement.
    	@example
    	```
    	import Emittery = require('emittery');
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
    def anyEvent(): AsyncIterableIterator[js.Any] = js.native
    
    /**
    	Bind the given `methodNames`, or all `Emittery` methods if `methodNames` is not defined, into the `target` object.
    	@example
    	```
    	import Emittery = require('emittery');
    	const object = {};
    	new Emittery().bindMethods(object);
    	object.emit('event');
    	```
    	*/
    def bindMethods(target: js.Object): Unit = js.native
    def bindMethods(target: js.Object, methodNames: js.Array[String]): Unit = js.native
    
    /**
    	Clear all event listeners on the instance.
    	If `eventName` is given, only the listeners for that event are cleared.
    	*/
    def clearListeners(): Unit = js.native
    def clearListeners(eventName: EventNames): Unit = js.native
    
    /**
    	Trigger an event asynchronously, optionally with some data. Listeners are called in the order they were added, but executed concurrently.
    	@returns A promise that resolves when all the event listeners are done. *Done* meaning executed if synchronous or resolved when an async/promise-returning function. You usually wouldn't want to wait for this, but you could for example catch possible errors. If any of the listeners throw/reject, the returned promise will be rejected with the error, but the other listeners will not be affected.
    	*/
    def emit(eventName: EventName): js.Promise[Unit] = js.native
    def emit(eventName: EventName, eventData: js.Any): js.Promise[Unit] = js.native
    
    /**
    	Same as `emit()`, but it waits for each listener to resolve before triggering the next one. This can be useful if your events depend on each other. Although ideally they should not. Prefer `emit()` whenever possible.
    	If any of the listeners throw/reject, the returned promise will be rejected with the error and the remaining listeners will *not* be called.
    	@returns A promise that resolves when all the event listeners are done.
    	*/
    def emitSerial(eventName: EventName): js.Promise[Unit] = js.native
    def emitSerial(eventName: EventName, eventData: js.Any): js.Promise[Unit] = js.native
    
    /**
    	Get an async iterator which buffers data each time an event is emitted.
    	Call `return()` on the iterator to remove the subscription.
    	@example
    	```
    	import Emittery = require('emittery');
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
    	import Emittery = require('emittery');
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
    	import Emittery = require('emittery');
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
    def events(eventName: EventNames): AsyncIterableIterator[js.Any] = js.native
    
    /**
    	The number of listeners for the `eventName` or all events if not specified.
    	*/
    def listenerCount(): Double = js.native
    def listenerCount(eventName: EventNames): Double = js.native
    
    /**
    	Remove one or more event subscriptions.
    	@example
    	```
    	import Emittery = require('emittery');
    	const emitter = new Emittery();
    	const listener = data => console.log(data);
    	(async () => {
    		emitter.on(['🦄', '🐶', '🦊'], listener);
    		await emitter.emit('🦄', 'a');
    		await emitter.emit('🐶', 'b');
    		await emitter.emit('🦊', 'c');
    		emitter.off('🦄', listener);
    		emitter.off(['🐶', '🦊'], listener);
    		await emitter.emit('🦄', 'a'); // nothing happens
    		await emitter.emit('🐶', 'b'); // nothing happens
    		await emitter.emit('🦊', 'c'); // nothing happens
    	})();
    	```
    	*/
    def off(eventName: EventNames, listener: js.Function1[/* eventData */ js.UndefOr[js.Any], Unit]): Unit = js.native
    
    /**
    	Remove an `onAny` subscription.
    	*/
    def offAny(listener: js.Function2[/* eventName */ EventName, /* eventData */ js.UndefOr[js.Any], Unit]): Unit = js.native
    
    /**
    	Subscribe to one or more events.
    	Using the same listener multiple times for the same event will result in only one method call per emitted event.
    	@returns An unsubscribe method.
    	@example
    	```
    	import Emittery = require('emittery');
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
    def on(
      eventName: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof Emittery.listenerAdded */ js.Any,
      listener: js.Function1[/* eventData */ ListenerChangedData, Unit]
    ): UnsubscribeFn = js.native
    def on(eventName: EventNames, listener: js.Function1[/* eventData */ js.UndefOr[js.Any], Unit]): UnsubscribeFn = js.native
    
    /**
    	Subscribe to be notified about any event.
    	@returns A method to unsubscribe.
    	*/
    def onAny(listener: js.Function2[/* eventName */ EventName, /* eventData */ js.UndefOr[js.Any], js.Any]): UnsubscribeFn = js.native
    
    /**
    	Subscribe to one or more events only once. It will be unsubscribed after the first
    	event.
    	@returns The event data when `eventName` is emitted.
    	@example
    	```
    	import Emittery = require('emittery');
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
    def once(
      eventName: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof Emittery.listenerAdded */ js.Any
    ): js.Promise[ListenerChangedData] = js.native
    def once(eventName: EventNames): js.Promise[js.Any] = js.native
  }
  
  type EventName = String | js.Symbol
  
  type EventNameFromDataMap[EventDataMap] = Extract[/* keyof EventDataMap */ String, EventName]
  
  /**
  Emittery also accepts an array of strings and symbols as event names.
  */
  type EventNames = EventName | js.Array[EventName]
  
  /**
  	Maps event names to their emitted data type.
  	*/
  trait Events extends StObject
  
  /**
  	The data provided as `eventData` when listening for `Emittery.listenerAdded` or `Emittery.listenerRemoved`.
  	*/
  @js.native
  trait ListenerChangedData extends StObject {
    
    /**
    		The name of the event that was added or removed if `.on()` or `.off()` was used, or `undefined` if `.onAny()` or `.offAny()` was used.
    		*/
    var eventName: js.UndefOr[EventName] = js.native
    
    /**
    		The listener that was added or removed.
    		*/
    def listener(): Unit = js.native
    def listener(eventData: js.Any): Unit = js.native
  }
  
  /**
  	Removes an event subscription.
  	*/
  type UnsubscribeFn = js.Function0[Unit]
}
