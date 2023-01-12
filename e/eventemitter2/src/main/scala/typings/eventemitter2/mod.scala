package typings.eventemitter2

import typings.eventemitter2.eventemitter2Booleans.`true`
import typings.std.Promise
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("eventemitter2", JSImport.Default)
  @js.native
  open class default () extends EventEmitter2 {
    def this(options: ConstructorOptions) = this()
  }
  /* static members */
  object default {
    
    @JSImport("eventemitter2", JSImport.Default)
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("eventemitter2", "default.defaultMaxListeners")
    @js.native
    def defaultMaxListeners: Double = js.native
    inline def defaultMaxListeners_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("defaultMaxListeners")(x.asInstanceOf[js.Any])
    
    inline def once(emitter: EventEmitter2, event: event | eventNS): CancelablePromise[js.Array[Any]] = (^.asInstanceOf[js.Dynamic].applyDynamic("once")(emitter.asInstanceOf[js.Any], event.asInstanceOf[js.Any])).asInstanceOf[CancelablePromise[js.Array[Any]]]
    inline def once(emitter: EventEmitter2, event: event | eventNS, options: OnceOptions): CancelablePromise[js.Array[Any]] = (^.asInstanceOf[js.Dynamic].applyDynamic("once")(emitter.asInstanceOf[js.Any], event.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[CancelablePromise[js.Array[Any]]]
  }
  
  @JSImport("eventemitter2", "EventEmitter2")
  @js.native
  open class EventEmitter2 () extends StObject {
    def this(options: ConstructorOptions) = this()
    
    def addListener(event: event | eventNS, listener: ListenerFn): this.type | Listener = js.native
    
    def emit(event: event | eventNS, values: Any*): Boolean = js.native
    
    def emitAsync(event: event | eventNS, values: Any*): js.Promise[js.Array[Any]] = js.native
    
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
    
    def waitFor(event: event | eventNS): CancelablePromise[js.Array[Any]] = js.native
    def waitFor(event: event | eventNS, filter: WaitForFilter): CancelablePromise[js.Array[Any]] = js.native
    def waitFor(event: event | eventNS, options: WaitForOptions): CancelablePromise[js.Array[Any]] = js.native
    def waitFor(event: event | eventNS, timeout: Double): CancelablePromise[js.Array[Any]] = js.native
  }
  /* static members */
  object EventEmitter2 {
    
    @JSImport("eventemitter2", "EventEmitter2")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("eventemitter2", "EventEmitter2.defaultMaxListeners")
    @js.native
    def defaultMaxListeners: Double = js.native
    inline def defaultMaxListeners_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("defaultMaxListeners")(x.asInstanceOf[js.Any])
    
    inline def once(emitter: EventEmitter2, event: event | eventNS): CancelablePromise[js.Array[Any]] = (^.asInstanceOf[js.Dynamic].applyDynamic("once")(emitter.asInstanceOf[js.Any], event.asInstanceOf[js.Any])).asInstanceOf[CancelablePromise[js.Array[Any]]]
    inline def once(emitter: EventEmitter2, event: event | eventNS, options: OnceOptions): CancelablePromise[js.Array[Any]] = (^.asInstanceOf[js.Dynamic].applyDynamic("once")(emitter.asInstanceOf[js.Any], event.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[CancelablePromise[js.Array[Any]]]
  }
  
  @js.native
  trait CancelablePromise[T]
    extends StObject
       with Promise[T] {
    
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
    
    inline def apply(): ConstructorOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ConstructorOptions]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: ConstructorOptions] (val x: Self) extends AnyVal {
      
      inline def setDelimiter(value: String): Self = StObject.set(x, "delimiter", value.asInstanceOf[js.Any])
      
      inline def setDelimiterUndefined: Self = StObject.set(x, "delimiter", js.undefined)
      
      inline def setIgnoreErrors(value: Boolean): Self = StObject.set(x, "ignoreErrors", value.asInstanceOf[js.Any])
      
      inline def setIgnoreErrorsUndefined: Self = StObject.set(x, "ignoreErrors", js.undefined)
      
      inline def setMaxListeners(value: Double): Self = StObject.set(x, "maxListeners", value.asInstanceOf[js.Any])
      
      inline def setMaxListenersUndefined: Self = StObject.set(x, "maxListeners", js.undefined)
      
      inline def setNewListener(value: Boolean): Self = StObject.set(x, "newListener", value.asInstanceOf[js.Any])
      
      inline def setNewListenerUndefined: Self = StObject.set(x, "newListener", js.undefined)
      
      inline def setRemoveListener(value: Boolean): Self = StObject.set(x, "removeListener", value.asInstanceOf[js.Any])
      
      inline def setRemoveListenerUndefined: Self = StObject.set(x, "removeListener", js.undefined)
      
      inline def setVerboseMemoryLeak(value: Boolean): Self = StObject.set(x, "verboseMemoryLeak", value.asInstanceOf[js.Any])
      
      inline def setVerboseMemoryLeakUndefined: Self = StObject.set(x, "verboseMemoryLeak", js.undefined)
      
      inline def setWildcard(value: Boolean): Self = StObject.set(x, "wildcard", value.asInstanceOf[js.Any])
      
      inline def setWildcardUndefined: Self = StObject.set(x, "wildcard", js.undefined)
    }
  }
  
  type EventAndListener = js.Function2[/* event */ String | js.Array[String], /* repeated */ Any, Unit]
  
  trait GeneralEventEmitter extends StObject {
    
    def addEventListener(event: event, handler: ListenerFn): this.type
    
    var addListener: js.UndefOr[js.Function2[/* event */ event, /* handler */ ListenerFn, this.type]] = js.undefined
    
    var off: js.UndefOr[js.Function2[/* event */ event, /* handler */ ListenerFn, this.type]] = js.undefined
    
    var on: js.UndefOr[js.Function2[/* event */ event, /* handler */ ListenerFn, this.type]] = js.undefined
    
    def removeEventListener(event: event, handler: ListenerFn): this.type
    
    var removeListener: js.UndefOr[js.Function2[/* event */ event, /* handler */ ListenerFn, this.type]] = js.undefined
  }
  object GeneralEventEmitter {
    
    inline def apply(
      addEventListener: (event, ListenerFn) => GeneralEventEmitter,
      removeEventListener: (event, ListenerFn) => GeneralEventEmitter
    ): GeneralEventEmitter = {
      val __obj = js.Dynamic.literal(addEventListener = js.Any.fromFunction2(addEventListener), removeEventListener = js.Any.fromFunction2(removeEventListener))
      __obj.asInstanceOf[GeneralEventEmitter]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: GeneralEventEmitter] (val x: Self) extends AnyVal {
      
      inline def setAddEventListener(value: (event, ListenerFn) => GeneralEventEmitter): Self = StObject.set(x, "addEventListener", js.Any.fromFunction2(value))
      
      inline def setAddListener(value: (/* event */ event, /* handler */ ListenerFn) => GeneralEventEmitter): Self = StObject.set(x, "addListener", js.Any.fromFunction2(value))
      
      inline def setAddListenerUndefined: Self = StObject.set(x, "addListener", js.undefined)
      
      inline def setOff(value: (/* event */ event, /* handler */ ListenerFn) => GeneralEventEmitter): Self = StObject.set(x, "off", js.Any.fromFunction2(value))
      
      inline def setOffUndefined: Self = StObject.set(x, "off", js.undefined)
      
      inline def setOn(value: (/* event */ event, /* handler */ ListenerFn) => GeneralEventEmitter): Self = StObject.set(x, "on", js.Any.fromFunction2(value))
      
      inline def setOnUndefined: Self = StObject.set(x, "on", js.undefined)
      
      inline def setRemoveEventListener(value: (event, ListenerFn) => GeneralEventEmitter): Self = StObject.set(x, "removeEventListener", js.Any.fromFunction2(value))
      
      inline def setRemoveListener(value: (/* event */ event, /* handler */ ListenerFn) => GeneralEventEmitter): Self = StObject.set(x, "removeListener", js.Any.fromFunction2(value))
      
      inline def setRemoveListenerUndefined: Self = StObject.set(x, "removeListener", js.undefined)
    }
  }
  
  trait ListenToOptions extends StObject {
    
    var off: js.UndefOr[js.Function2[/* event */ event | eventNS, /* handler */ ListenerFn, Unit]] = js.undefined
    
    var on: js.UndefOr[js.Function2[/* event */ event | eventNS, /* handler */ ListenerFn, Unit]] = js.undefined
    
    var reducers: js.Function | js.Object
  }
  object ListenToOptions {
    
    inline def apply(reducers: js.Function | js.Object): ListenToOptions = {
      val __obj = js.Dynamic.literal(reducers = reducers.asInstanceOf[js.Any])
      __obj.asInstanceOf[ListenToOptions]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: ListenToOptions] (val x: Self) extends AnyVal {
      
      inline def setOff(value: (/* event */ event | eventNS, /* handler */ ListenerFn) => Unit): Self = StObject.set(x, "off", js.Any.fromFunction2(value))
      
      inline def setOffUndefined: Self = StObject.set(x, "off", js.undefined)
      
      inline def setOn(value: (/* event */ event | eventNS, /* handler */ ListenerFn) => Unit): Self = StObject.set(x, "on", js.Any.fromFunction2(value))
      
      inline def setOnUndefined: Self = StObject.set(x, "on", js.undefined)
      
      inline def setReducers(value: js.Function | js.Object): Self = StObject.set(x, "reducers", value.asInstanceOf[js.Any])
    }
  }
  
  trait Listener extends StObject {
    
    var emitter: EventEmitter2
    
    var event: typings.eventemitter2.mod.event | eventNS
    
    def listener(values: Any*): Unit
    @JSName("listener")
    var listener_Original: ListenerFn
    
    def off(): this.type
  }
  object Listener {
    
    inline def apply(
      emitter: EventEmitter2,
      event: event | eventNS,
      listener: /* repeated */ Any => Unit,
      off: () => Listener
    ): Listener = {
      val __obj = js.Dynamic.literal(emitter = emitter.asInstanceOf[js.Any], event = event.asInstanceOf[js.Any], listener = js.Any.fromFunction1(listener), off = js.Any.fromFunction0(off))
      __obj.asInstanceOf[Listener]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Listener] (val x: Self) extends AnyVal {
      
      inline def setEmitter(value: EventEmitter2): Self = StObject.set(x, "emitter", value.asInstanceOf[js.Any])
      
      inline def setEvent(value: event | eventNS): Self = StObject.set(x, "event", value.asInstanceOf[js.Any])
      
      inline def setEventVarargs(value: event*): Self = StObject.set(x, "event", js.Array(value*))
      
      inline def setListener(value: /* repeated */ Any => Unit): Self = StObject.set(x, "listener", js.Any.fromFunction1(value))
      
      inline def setOff(value: () => Listener): Self = StObject.set(x, "off", js.Any.fromFunction0(value))
    }
  }
  
  type ListenerFn = js.Function1[/* repeated */ Any, Unit]
  
  trait OnOptions extends StObject {
    
    var async: js.UndefOr[Boolean] = js.undefined
    
    var nextTick: js.UndefOr[Boolean] = js.undefined
    
    var objectify: js.UndefOr[Boolean] = js.undefined
    
    var promisify: js.UndefOr[Boolean] = js.undefined
  }
  object OnOptions {
    
    inline def apply(): OnOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[OnOptions]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: OnOptions] (val x: Self) extends AnyVal {
      
      inline def setAsync(value: Boolean): Self = StObject.set(x, "async", value.asInstanceOf[js.Any])
      
      inline def setAsyncUndefined: Self = StObject.set(x, "async", js.undefined)
      
      inline def setNextTick(value: Boolean): Self = StObject.set(x, "nextTick", value.asInstanceOf[js.Any])
      
      inline def setNextTickUndefined: Self = StObject.set(x, "nextTick", js.undefined)
      
      inline def setObjectify(value: Boolean): Self = StObject.set(x, "objectify", value.asInstanceOf[js.Any])
      
      inline def setObjectifyUndefined: Self = StObject.set(x, "objectify", js.undefined)
      
      inline def setPromisify(value: Boolean): Self = StObject.set(x, "promisify", value.asInstanceOf[js.Any])
      
      inline def setPromisifyUndefined: Self = StObject.set(x, "promisify", js.undefined)
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
    
    inline def apply(Promise: js.Function, overload: Boolean, timeout: Double): OnceOptions = {
      val __obj = js.Dynamic.literal(Promise = Promise.asInstanceOf[js.Any], overload = overload.asInstanceOf[js.Any], timeout = timeout.asInstanceOf[js.Any])
      __obj.asInstanceOf[OnceOptions]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: OnceOptions] (val x: Self) extends AnyVal {
      
      inline def setOverload(value: Boolean): Self = StObject.set(x, "overload", value.asInstanceOf[js.Any])
      
      inline def setPromise(value: js.Function): Self = StObject.set(x, "Promise", value.asInstanceOf[js.Any])
      
      inline def setTimeout(value: Double): Self = StObject.set(x, "timeout", value.asInstanceOf[js.Any])
    }
  }
  
  type WaitForFilter = js.Function1[/* repeated */ Any, Boolean]
  
  trait WaitForOptions extends StObject {
    
    /**
      * @default Promise
      */
    var Promise: js.Function
    
    /**
      * @default null
      */
    def filter(values: Any*): Boolean
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
    
    inline def apply(
      Promise: js.Function,
      filter: /* repeated */ Any => Boolean,
      handleError: Boolean,
      overload: Boolean,
      timeout: Double
    ): WaitForOptions = {
      val __obj = js.Dynamic.literal(Promise = Promise.asInstanceOf[js.Any], filter = js.Any.fromFunction1(filter), handleError = handleError.asInstanceOf[js.Any], overload = overload.asInstanceOf[js.Any], timeout = timeout.asInstanceOf[js.Any])
      __obj.asInstanceOf[WaitForOptions]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: WaitForOptions] (val x: Self) extends AnyVal {
      
      inline def setFilter(value: /* repeated */ Any => Boolean): Self = StObject.set(x, "filter", js.Any.fromFunction1(value))
      
      inline def setHandleError(value: Boolean): Self = StObject.set(x, "handleError", value.asInstanceOf[js.Any])
      
      inline def setOverload(value: Boolean): Self = StObject.set(x, "overload", value.asInstanceOf[js.Any])
      
      inline def setPromise(value: js.Function): Self = StObject.set(x, "Promise", value.asInstanceOf[js.Any])
      
      inline def setTimeout(value: Double): Self = StObject.set(x, "timeout", value.asInstanceOf[js.Any])
    }
  }
  
  type event = js.Symbol | String
  
  type eventNS = String | js.Array[event]
}
