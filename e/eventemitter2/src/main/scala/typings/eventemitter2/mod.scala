package typings.eventemitter2

import typings.eventemitter2.eventemitter2Booleans.`true`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("eventemitter2", "EventEmitter2")
  @js.native
  class EventEmitter2 () extends StObject {
    def this(options: ConstructorOptions) = this()
    
    def addListener(event: event | eventNS, listener: ListenerFn): this.type | Listener = js.native
    
    def emit(event: event | eventNS, values: js.Any*): Boolean = js.native
    
    def emitAsync(event: event | eventNS, values: js.Any*): js.Promise[js.Array[js.Any]] = js.native
    
    def eventNames(): js.Array[event | eventNS] = js.native
    def eventNames(nsAsArray: Boolean): js.Array[event | eventNS] = js.native
    
    def getMaxListeners(): Double = js.native
    
    def hasListeners(): Boolean = js.native
    def hasListeners(event: String): Boolean = js.native
    
    def listenTo(target: GeneralEventEmitter, events: event | eventNS): this.type = js.native
    def listenTo(target: GeneralEventEmitter, events: event | eventNS, options: ListenToOptions): this.type = js.native
    def listenTo(target: GeneralEventEmitter, events: js.Array[event]): this.type = js.native
    def listenTo(target: GeneralEventEmitter, events: js.Array[event], options: ListenToOptions): this.type = js.native
    def listenTo(target: GeneralEventEmitter, events: js.Object): this.type = js.native
    def listenTo(target: GeneralEventEmitter, events: js.Object, options: ListenToOptions): this.type = js.native
    
    def listenerCount(): Double = js.native
    def listenerCount(event: event | eventNS): Double = js.native
    
    def listeners(): js.Array[ListenerFn] = js.native
    def listeners(event: event | eventNS): js.Array[ListenerFn] = js.native
    
    def listenersAny(): js.Array[ListenerFn] = js.native
    
    def many(event: event | eventNS, timesToListen: Double, listener: ListenerFn): this.type | Listener = js.native
    def many(event: event | eventNS, timesToListen: Double, listener: ListenerFn, options: Boolean): this.type | Listener = js.native
    def many(event: event | eventNS, timesToListen: Double, listener: ListenerFn, options: OnOptions): this.type | Listener = js.native
    
    def off(event: event | eventNS, listener: ListenerFn): this.type = js.native
    
    def offAny(listener: ListenerFn): this.type = js.native
    
    def on(event: event | eventNS, listener: ListenerFn): this.type | Listener = js.native
    def on(event: event | eventNS, listener: ListenerFn, options: Boolean): this.type | Listener = js.native
    def on(event: event | eventNS, listener: ListenerFn, options: OnOptions): this.type | Listener = js.native
    
    def onAny(listener: EventAndListener): this.type = js.native
    
    def once(event: event | eventNS, listener: ListenerFn): this.type | Listener = js.native
    def once(event: event | eventNS, listener: ListenerFn, options: OnOptions): this.type | Listener = js.native
    @JSName("once")
    def once_true(event: event | eventNS, listener: ListenerFn, options: `true`): this.type | Listener = js.native
    
    def prependAny(listener: EventAndListener): this.type = js.native
    
    def prependListener(event: event | eventNS, listener: ListenerFn): this.type | Listener = js.native
    def prependListener(event: event | eventNS, listener: ListenerFn, options: Boolean): this.type | Listener = js.native
    def prependListener(event: event | eventNS, listener: ListenerFn, options: OnOptions): this.type | Listener = js.native
    
    def prependMany(event: event | eventNS, timesToListen: Double, listener: ListenerFn): this.type | Listener = js.native
    def prependMany(event: event | eventNS, timesToListen: Double, listener: ListenerFn, options: Boolean): this.type | Listener = js.native
    def prependMany(event: event | eventNS, timesToListen: Double, listener: ListenerFn, options: OnOptions): this.type | Listener = js.native
    
    def prependOnceListener(event: event | eventNS, listener: ListenerFn): this.type | Listener = js.native
    def prependOnceListener(event: event | eventNS, listener: ListenerFn, options: Boolean): this.type | Listener = js.native
    def prependOnceListener(event: event | eventNS, listener: ListenerFn, options: OnOptions): this.type | Listener = js.native
    
    def removeAllListeners(): this.type = js.native
    def removeAllListeners(event: event | eventNS): this.type = js.native
    
    def removeListener(event: event | eventNS, listener: ListenerFn): this.type = js.native
    
    def setMaxListeners(n: Double): Unit = js.native
    
    def stopListeningTo(): Boolean = js.native
    def stopListeningTo(target: Unit, event: event | eventNS): Boolean = js.native
    def stopListeningTo(target: GeneralEventEmitter): Boolean = js.native
    def stopListeningTo(target: GeneralEventEmitter, event: event | eventNS): Boolean = js.native
    
    def waitFor(event: event | eventNS): CancelablePromise[js.Array[js.Any]] = js.native
    def waitFor(event: event | eventNS, filter: WaitForFilter): CancelablePromise[js.Array[js.Any]] = js.native
    def waitFor(event: event | eventNS, options: WaitForOptions): CancelablePromise[js.Array[js.Any]] = js.native
    def waitFor(event: event | eventNS, timeout: Double): CancelablePromise[js.Array[js.Any]] = js.native
  }
  /* static members */
  object EventEmitter2 {
    
    @JSImport("eventemitter2", "EventEmitter2")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("eventemitter2", "EventEmitter2.defaultMaxListeners")
    @js.native
    def defaultMaxListeners: Double = js.native
    @scala.inline
    def defaultMaxListeners_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("defaultMaxListeners")(x.asInstanceOf[js.Any])
    
    @scala.inline
    def once(emitter: EventEmitter2, event: event | eventNS): CancelablePromise[js.Array[js.Any]] = (^.asInstanceOf[js.Dynamic].applyDynamic("once")(emitter.asInstanceOf[js.Any], event.asInstanceOf[js.Any])).asInstanceOf[CancelablePromise[js.Array[js.Any]]]
    @scala.inline
    def once(emitter: EventEmitter2, event: event | eventNS, options: OnceOptions): CancelablePromise[js.Array[js.Any]] = (^.asInstanceOf[js.Dynamic].applyDynamic("once")(emitter.asInstanceOf[js.Any], event.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[CancelablePromise[js.Array[js.Any]]]
  }
  
  @js.native
  trait CancelablePromise[T]
    extends js.Promise[T] {
    
    def cancel(reason: String): Unit = js.native
  }
  
  trait ConstructorOptions extends StObject {
    
    /**
      * @default '.'
      * @description the delimiter used to segment namespaces.
      */
    var delimiter: js.UndefOr[String] = js.undefined
    
    /**
      * @default false
      * @description disable throwing uncaughtException if an error event is emitted and it has no listeners
      */
    var ignoreErrors: js.UndefOr[Boolean] = js.undefined
    
    /**
      * @default 10
      * @description the maximum amount of listeners that can be assigned to an event.
      */
    var maxListeners: js.UndefOr[Double] = js.undefined
    
    /**
      * @default false
      * @description set this to `true` if you want to emit the newListener events.
      */
    var newListener: js.UndefOr[Boolean] = js.undefined
    
    /**
      * @default false
      * @description set this to `true` if you want to emit the removeListener events.
      */
    var removeListener: js.UndefOr[Boolean] = js.undefined
    
    /**
      * @default false
      * @description show event name in memory leak message when more than maximum amount of listeners is assigned, default false
      */
    var verboseMemoryLeak: js.UndefOr[Boolean] = js.undefined
    
    /**
      * @default false
      * @description set this to `true` to use wildcards.
      */
    var wildcard: js.UndefOr[Boolean] = js.undefined
  }
  object ConstructorOptions {
    
    @scala.inline
    def apply(): ConstructorOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ConstructorOptions]
    }
    
    @scala.inline
    implicit class ConstructorOptionsMutableBuilder[Self <: ConstructorOptions] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setDelimiter(value: String): Self = StObject.set(x, "delimiter", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDelimiterUndefined: Self = StObject.set(x, "delimiter", js.undefined)
      
      @scala.inline
      def setIgnoreErrors(value: Boolean): Self = StObject.set(x, "ignoreErrors", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIgnoreErrorsUndefined: Self = StObject.set(x, "ignoreErrors", js.undefined)
      
      @scala.inline
      def setMaxListeners(value: Double): Self = StObject.set(x, "maxListeners", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMaxListenersUndefined: Self = StObject.set(x, "maxListeners", js.undefined)
      
      @scala.inline
      def setNewListener(value: Boolean): Self = StObject.set(x, "newListener", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setNewListenerUndefined: Self = StObject.set(x, "newListener", js.undefined)
      
      @scala.inline
      def setRemoveListener(value: Boolean): Self = StObject.set(x, "removeListener", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRemoveListenerUndefined: Self = StObject.set(x, "removeListener", js.undefined)
      
      @scala.inline
      def setVerboseMemoryLeak(value: Boolean): Self = StObject.set(x, "verboseMemoryLeak", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setVerboseMemoryLeakUndefined: Self = StObject.set(x, "verboseMemoryLeak", js.undefined)
      
      @scala.inline
      def setWildcard(value: Boolean): Self = StObject.set(x, "wildcard", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setWildcardUndefined: Self = StObject.set(x, "wildcard", js.undefined)
    }
  }
  
  type EventAndListener = js.Function2[/* event */ String | js.Array[String], /* repeated */ js.Any, Unit]
  
  trait GeneralEventEmitter extends StObject {
    
    var addEventListener: js.Function
    
    var removeEventListener: js.Function
  }
  object GeneralEventEmitter {
    
    @scala.inline
    def apply(addEventListener: js.Function, removeEventListener: js.Function): GeneralEventEmitter = {
      val __obj = js.Dynamic.literal(addEventListener = addEventListener.asInstanceOf[js.Any], removeEventListener = removeEventListener.asInstanceOf[js.Any])
      __obj.asInstanceOf[GeneralEventEmitter]
    }
    
    @scala.inline
    implicit class GeneralEventEmitterMutableBuilder[Self <: GeneralEventEmitter] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAddEventListener(value: js.Function): Self = StObject.set(x, "addEventListener", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRemoveEventListener(value: js.Function): Self = StObject.set(x, "removeEventListener", value.asInstanceOf[js.Any])
    }
  }
  
  trait ListenToOptions extends StObject {
    
    var off: js.UndefOr[js.Function2[/* event */ event | eventNS, /* handler */ js.Function, Unit]] = js.undefined
    
    var on: js.UndefOr[js.Function2[/* event */ event | eventNS, /* handler */ js.Function, Unit]] = js.undefined
    
    var reducers: js.Function | js.Object
  }
  object ListenToOptions {
    
    @scala.inline
    def apply(reducers: js.Function | js.Object): ListenToOptions = {
      val __obj = js.Dynamic.literal(reducers = reducers.asInstanceOf[js.Any])
      __obj.asInstanceOf[ListenToOptions]
    }
    
    @scala.inline
    implicit class ListenToOptionsMutableBuilder[Self <: ListenToOptions] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setOff(value: (/* event */ event | eventNS, /* handler */ js.Function) => Unit): Self = StObject.set(x, "off", js.Any.fromFunction2(value))
      
      @scala.inline
      def setOffUndefined: Self = StObject.set(x, "off", js.undefined)
      
      @scala.inline
      def setOn(value: (/* event */ event | eventNS, /* handler */ js.Function) => Unit): Self = StObject.set(x, "on", js.Any.fromFunction2(value))
      
      @scala.inline
      def setOnUndefined: Self = StObject.set(x, "on", js.undefined)
      
      @scala.inline
      def setReducers(value: js.Function | js.Object): Self = StObject.set(x, "reducers", value.asInstanceOf[js.Any])
    }
  }
  
  trait Listener extends StObject {
    
    var emitter: EventEmitter2
    
    var event: typings.eventemitter2.mod.event | eventNS
    
    def listener(values: js.Any*): Unit
    @JSName("listener")
    var listener_Original: ListenerFn
    
    def off(): this.type
  }
  object Listener {
    
    @scala.inline
    def apply(
      emitter: EventEmitter2,
      event: event | eventNS,
      listener: /* repeated */ js.Any => Unit,
      off: () => Listener
    ): Listener = {
      val __obj = js.Dynamic.literal(emitter = emitter.asInstanceOf[js.Any], event = event.asInstanceOf[js.Any], listener = js.Any.fromFunction1(listener), off = js.Any.fromFunction0(off))
      __obj.asInstanceOf[Listener]
    }
    
    @scala.inline
    implicit class ListenerMutableBuilder[Self <: Listener] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setEmitter(value: EventEmitter2): Self = StObject.set(x, "emitter", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setEvent(value: event | eventNS): Self = StObject.set(x, "event", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setEventVarargs(value: event*): Self = StObject.set(x, "event", js.Array(value :_*))
      
      @scala.inline
      def setListener(value: /* repeated */ js.Any => Unit): Self = StObject.set(x, "listener", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOff(value: () => Listener): Self = StObject.set(x, "off", js.Any.fromFunction0(value))
    }
  }
  
  type ListenerFn = js.Function1[/* repeated */ js.Any, Unit]
  
  trait OnOptions extends StObject {
    
    var async: js.UndefOr[Boolean] = js.undefined
    
    var nextTick: js.UndefOr[Boolean] = js.undefined
    
    var objectify: js.UndefOr[Boolean] = js.undefined
    
    var promisify: js.UndefOr[Boolean] = js.undefined
  }
  object OnOptions {
    
    @scala.inline
    def apply(): OnOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[OnOptions]
    }
    
    @scala.inline
    implicit class OnOptionsMutableBuilder[Self <: OnOptions] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAsync(value: Boolean): Self = StObject.set(x, "async", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAsyncUndefined: Self = StObject.set(x, "async", js.undefined)
      
      @scala.inline
      def setNextTick(value: Boolean): Self = StObject.set(x, "nextTick", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setNextTickUndefined: Self = StObject.set(x, "nextTick", js.undefined)
      
      @scala.inline
      def setObjectify(value: Boolean): Self = StObject.set(x, "objectify", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setObjectifyUndefined: Self = StObject.set(x, "objectify", js.undefined)
      
      @scala.inline
      def setPromisify(value: Boolean): Self = StObject.set(x, "promisify", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPromisifyUndefined: Self = StObject.set(x, "promisify", js.undefined)
    }
  }
  
  trait OnceOptions extends StObject {
    
    /**
      * @default Promise
      */
    var Promise: js.Function
    
    /**
      * @default false
      */
    var overload: Boolean
    
    /**
      * @default 0
      */
    var timeout: Double
  }
  object OnceOptions {
    
    @scala.inline
    def apply(Promise: js.Function, overload: Boolean, timeout: Double): OnceOptions = {
      val __obj = js.Dynamic.literal(Promise = Promise.asInstanceOf[js.Any], overload = overload.asInstanceOf[js.Any], timeout = timeout.asInstanceOf[js.Any])
      __obj.asInstanceOf[OnceOptions]
    }
    
    @scala.inline
    implicit class OnceOptionsMutableBuilder[Self <: OnceOptions] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setOverload(value: Boolean): Self = StObject.set(x, "overload", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPromise(value: js.Function): Self = StObject.set(x, "Promise", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTimeout(value: Double): Self = StObject.set(x, "timeout", value.asInstanceOf[js.Any])
    }
  }
  
  type WaitForFilter = js.Function1[/* repeated */ js.Any, Boolean]
  
  trait WaitForOptions extends StObject {
    
    /**
      * @default Promise
      */
    var Promise: js.Function
    
    /**
      * @default null
      */
    def filter(values: js.Any*): Boolean
    /**
      * @default null
      */
    @JSName("filter")
    var filter_Original: WaitForFilter
    
    /**
      * @default false
      */
    var handleError: Boolean
    
    /**
      * @default false
      */
    var overload: Boolean
    
    /**
      * @default 0
      */
    var timeout: Double
  }
  object WaitForOptions {
    
    @scala.inline
    def apply(
      Promise: js.Function,
      filter: /* repeated */ js.Any => Boolean,
      handleError: Boolean,
      overload: Boolean,
      timeout: Double
    ): WaitForOptions = {
      val __obj = js.Dynamic.literal(Promise = Promise.asInstanceOf[js.Any], filter = js.Any.fromFunction1(filter), handleError = handleError.asInstanceOf[js.Any], overload = overload.asInstanceOf[js.Any], timeout = timeout.asInstanceOf[js.Any])
      __obj.asInstanceOf[WaitForOptions]
    }
    
    @scala.inline
    implicit class WaitForOptionsMutableBuilder[Self <: WaitForOptions] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setFilter(value: /* repeated */ js.Any => Boolean): Self = StObject.set(x, "filter", js.Any.fromFunction1(value))
      
      @scala.inline
      def setHandleError(value: Boolean): Self = StObject.set(x, "handleError", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOverload(value: Boolean): Self = StObject.set(x, "overload", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPromise(value: js.Function): Self = StObject.set(x, "Promise", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTimeout(value: Double): Self = StObject.set(x, "timeout", value.asInstanceOf[js.Any])
    }
  }
  
  type event = js.Symbol | String
  
  type eventNS = String | js.Array[event]
}
