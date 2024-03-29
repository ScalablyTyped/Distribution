package typings.eventemitter3

import org.scalablytyped.runtime.Instantiable0
import typings.eventemitter3.mod.EventEmitter.EventArgs
import typings.eventemitter3.mod.EventEmitter.EventEmitterStatic
import typings.eventemitter3.mod.EventEmitter.EventNames
import typings.eventemitter3.mod.EventEmitter.ValidEventTypes
import typings.std.EventListener
import typings.std.Parameters
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("eventemitter3", JSImport.Default)
  @js.native
  open class default[EventTypes /* <: ValidEventTypes */, Context /* <: Any */] () extends EventEmitter[EventTypes, Context]
  object default {
    
    @JSImport("eventemitter3", JSImport.Default)
    @js.native
    val ^ : js.Any = js.native
    
    /* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
    @JSImport("eventemitter3", "default.EventEmitter")
    @js.native
    open class EventEmitter[EventTypes /* <: ValidEventTypes */, Context] ()
      extends typings.eventemitter3.mod.EventEmitter[EventTypes, Context]
    @JSImport("eventemitter3", "default.EventEmitter")
    @js.native
    val EventEmitter: EventEmitterStatic = js.native
    
    /* static member */
    @JSImport("eventemitter3", "default.prefixed")
    @js.native
    def prefixed: String | Boolean = js.native
    inline def prefixed_=(x: String | Boolean): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("prefixed")(x.asInstanceOf[js.Any])
  }
  
  @JSImport("eventemitter3", "EventEmitter")
  @js.native
  open class EventEmitter[EventTypes /* <: ValidEventTypes */, Context /* <: Any */] () extends StObject {
    
    def addListener[T /* <: EventNames[EventTypes] */](event: T, fn: EventListener): this.type = js.native
    def addListener[T /* <: EventNames[EventTypes] */](event: T, fn: EventListener, context: Context): this.type = js.native
    
    /**
      * Calls each of the listeners registered for a given event.
      */
    def emit[T /* <: EventNames[EventTypes] */](
      event: T,
      /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type EventEmitter.EventArgs<EventTypes, T> is not an array type */ args: EventArgs[EventTypes, T]
    ): Boolean = js.native
    
    /**
      * Return an array listing the events for which the emitter has registered
      * listeners.
      */
    def eventNames(): js.Array[EventNames[EventTypes]] = js.native
    
    /**
      * Return the number of listeners listening to a given event.
      */
    def listenerCount(event: EventNames[EventTypes]): Double = js.native
    
    /**
      * Return the listeners registered for a given event.
      */
    def listeners[T /* <: EventNames[EventTypes] */](event: T): js.Array[EventListener] = js.native
    
    def off[T /* <: EventNames[EventTypes] */](event: T): this.type = js.native
    def off[T /* <: EventNames[EventTypes] */](event: T, fn: Unit, context: Context): this.type = js.native
    def off[T /* <: EventNames[EventTypes] */](event: T, fn: Unit, context: Context, once: Boolean): this.type = js.native
    def off[T /* <: EventNames[EventTypes] */](event: T, fn: Unit, context: Unit, once: Boolean): this.type = js.native
    def off[T /* <: EventNames[EventTypes] */](event: T, fn: EventListener): this.type = js.native
    def off[T /* <: EventNames[EventTypes] */](event: T, fn: EventListener, context: Context): this.type = js.native
    def off[T /* <: EventNames[EventTypes] */](event: T, fn: EventListener, context: Context, once: Boolean): this.type = js.native
    def off[T /* <: EventNames[EventTypes] */](event: T, fn: EventListener, context: Unit, once: Boolean): this.type = js.native
    
    /**
      * Add a listener for a given event.
      */
    def on[T /* <: EventNames[EventTypes] */](event: T, fn: EventListener): this.type = js.native
    def on[T /* <: EventNames[EventTypes] */](event: T, fn: EventListener, context: Context): this.type = js.native
    
    /**
      * Add a one-time listener for a given event.
      */
    def once[T /* <: EventNames[EventTypes] */](event: T, fn: EventListener): this.type = js.native
    def once[T /* <: EventNames[EventTypes] */](event: T, fn: EventListener, context: Context): this.type = js.native
    
    /**
      * Remove all listeners, or those of the specified event.
      */
    def removeAllListeners(): this.type = js.native
    def removeAllListeners(event: EventNames[EventTypes]): this.type = js.native
    
    /**
      * Remove the listeners of a given event.
      */
    def removeListener[T /* <: EventNames[EventTypes] */](event: T): this.type = js.native
    def removeListener[T /* <: EventNames[EventTypes] */](event: T, fn: Unit, context: Context): this.type = js.native
    def removeListener[T /* <: EventNames[EventTypes] */](event: T, fn: Unit, context: Context, once: Boolean): this.type = js.native
    def removeListener[T /* <: EventNames[EventTypes] */](event: T, fn: Unit, context: Unit, once: Boolean): this.type = js.native
    def removeListener[T /* <: EventNames[EventTypes] */](event: T, fn: EventListener): this.type = js.native
    def removeListener[T /* <: EventNames[EventTypes] */](event: T, fn: EventListener, context: Context): this.type = js.native
    def removeListener[T /* <: EventNames[EventTypes] */](event: T, fn: EventListener, context: Context, once: Boolean): this.type = js.native
    def removeListener[T /* <: EventNames[EventTypes] */](event: T, fn: EventListener, context: Unit, once: Boolean): this.type = js.native
  }
  object EventEmitter {
    
    @JSImport("eventemitter3", "EventEmitter")
    @js.native
    val ^ : js.Any = js.native
    /* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
    @JSImport("eventemitter3", "EventEmitter.EventEmitter")
    @js.native
    open class EventEmitter[EventTypes /* <: ValidEventTypes */, Context] ()
      extends typings.eventemitter3.mod.EventEmitter[EventTypes, Context]
    @JSImport("eventemitter3", "EventEmitter.EventEmitter")
    @js.native
    val EventEmitter: EventEmitterStatic = js.native
    
    /* static member */
    @JSImport("eventemitter3", "EventEmitter.prefixed")
    @js.native
    def prefixed: String | Boolean = js.native
    inline def prefixed_=(x: String | Boolean): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("prefixed")(x.asInstanceOf[js.Any])
    
    /** NOTE: Mapped type definitions are impossible to translate to Scala.
      * See https://www.typescriptlang.org/docs/handbook/2/mapped-types.html for an intro.
      * You'll have to cast your way around this structure, unfortunately. 
      * TS definition: {{{
      {[ K in keyof T ]: T[K] extends (args : ...any): void? std.Parameters<T[K]> : T[K] extends std.Array<any>? T[K] : std.Array<any>}
      }}}
      */
    @js.native
    trait ArgumentMap[T /* <: js.Object */] extends StObject
    
    type EventArgs[T /* <: ValidEventTypes */, K /* <: EventNames[T] */] = Parameters[typings.eventemitter3.mod.EventEmitter.EventListener[T, K]]
    
    @js.native
    trait EventEmitterStatic
      extends StObject
         with Instantiable0[typings.eventemitter3.mod.EventEmitter[ValidEventTypes, js.Object]]
    
    /** NOTE: Conditional type definitions are impossible to translate to Scala.
      * See https://www.typescriptlang.org/docs/handbook/2/conditional-types.html for an intro.
      * This RHS of the type alias is guess work. You should cast if it's not correct in your case.
      * TS definition: {{{
      T extends string | symbol ? (args : ...any): void : (args : eventemitter3.eventemitter3.EventEmitter.ArgumentMap<std.Exclude<T, string | symbol>>[std.Extract<K, keyof T>]): void
      }}}
      */
    type EventListener[T /* <: ValidEventTypes */, K /* <: EventNames[T] */] = js.Function1[/* repeated */ Any, Unit]
    
    /** NOTE: Conditional type definitions are impossible to translate to Scala.
      * See https://www.typescriptlang.org/docs/handbook/2/conditional-types.html for an intro.
      * This RHS of the type alias is guess work. You should cast if it's not correct in your case.
      * TS definition: {{{
      T extends string | symbol ? T : keyof T
      }}}
      */
    type EventNames[T /* <: ValidEventTypes */] = T
    
    type ListenerFn[Args /* <: js.Array[Any] */] = js.Function1[/* args */ Args, Unit]
    
    type ValidEventTypes = String | js.Symbol | js.Object
  }
}
