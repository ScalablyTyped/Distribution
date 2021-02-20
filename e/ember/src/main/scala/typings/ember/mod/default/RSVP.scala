package typings.ember.mod.default

import org.scalablytyped.runtime.TopLevel
import typings.ember.emberBooleans.`false`
import typings.ember.emberBooleans.`true`
import typings.ember.emberStrings.chained
import typings.ember.emberStrings.created
import typings.ember.emberStrings.error
import typings.ember.emberStrings.fulfilled
import typings.ember.emberStrings.rejected
import typings.rsvp.anon.Length
import typings.rsvp.anon.`0`
import typings.rsvp.anon.`1`
import typings.rsvp.anon.`2`
import typings.rsvp.anon.`3`
import typings.rsvp.anon.`4`
import typings.rsvp.anon.`5`
import typings.rsvp.anon.`6`
import typings.rsvp.anon.`7`
import typings.rsvp.anon.`8`
import typings.rsvp.mod.RSVP.Arg
import typings.rsvp.mod.RSVP.Deferred
import typings.rsvp.mod.RSVP.InstrumentEvent
import typings.rsvp.mod.RSVP.ObjectWithEventMixins
import typings.rsvp.mod.RSVP.PromiseState
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* was `typeof Rsvp` */
object RSVP {
  
  @JSImport("ember", "default.RSVP.EventTarget")
  @js.native
  class EventTarget ()
    extends typings.ember.mod.Ember.RSVP.EventTarget
  object EventTarget {
    
    /** `RSVP.EventTarget.mixin` extends an object with EventTarget methods. */
    /* static member */
    @JSImport("ember", "default.RSVP.EventTarget.mixin")
    @js.native
    def mixin(`object`: js.Object): ObjectWithEventMixins = js.native
    
    /**
      * You can use `off` to stop firing a particular callback for an event.
      *
      * If you don't pass a `callback` argument to `off`, ALL callbacks for the
      * event will not be executed when the event fires.
      */
    /* static member */
    @JSImport("ember", "default.RSVP.EventTarget.off")
    @js.native
    def off(eventName: java.lang.String): Unit = js.native
    @JSImport("ember", "default.RSVP.EventTarget.off")
    @js.native
    def off(eventName: java.lang.String, callback: js.Function1[/* value */ js.Any, Unit]): Unit = js.native
    
    /* static member */
    @JSImport("ember", "default.RSVP.EventTarget.on")
    @js.native
    def on(eventName: java.lang.String, callback: js.Function1[/* value */ js.Any, Unit]): Unit = js.native
    @JSImport("ember", "default.RSVP.EventTarget.on")
    @js.native
    def on_chained(eventName: chained, listener: js.Function1[/* event */ InstrumentEvent, Unit]): Unit = js.native
    /** Registers a callback to be executed when `eventName` is triggered */
    /* static member */
    @JSImport("ember", "default.RSVP.EventTarget.on")
    @js.native
    def on_created(eventName: created, listener: js.Function1[/* event */ InstrumentEvent, Unit]): Unit = js.native
    /* static member */
    @JSImport("ember", "default.RSVP.EventTarget.on")
    @js.native
    def on_error(eventName: error, errorHandler: js.Function1[/* reason */ js.Any, Unit]): Unit = js.native
    @JSImport("ember", "default.RSVP.EventTarget.on")
    @js.native
    def on_fulfilled(eventName: fulfilled, listener: js.Function1[/* event */ InstrumentEvent, Unit]): Unit = js.native
    @JSImport("ember", "default.RSVP.EventTarget.on")
    @js.native
    def on_rejected(eventName: rejected, listener: js.Function1[/* event */ InstrumentEvent, Unit]): Unit = js.native
    
    /**
      * Use `trigger` to fire custom events.
      *
      * You can also pass a value as a second argument to `trigger` that will be
      * passed as an argument to all event listeners for the event
      */
    /* static member */
    @JSImport("ember", "default.RSVP.EventTarget.trigger")
    @js.native
    def trigger(eventName: java.lang.String): Unit = js.native
    @JSImport("ember", "default.RSVP.EventTarget.trigger")
    @js.native
    def trigger(eventName: java.lang.String, options: js.UndefOr[scala.Nothing], label: java.lang.String): Unit = js.native
    @JSImport("ember", "default.RSVP.EventTarget.trigger")
    @js.native
    def trigger(eventName: java.lang.String, options: js.Any): Unit = js.native
    @JSImport("ember", "default.RSVP.EventTarget.trigger")
    @js.native
    def trigger(eventName: java.lang.String, options: js.Any, label: java.lang.String): Unit = js.native
  }
  
  @JSImport("ember", "default.RSVP.Promise")
  @js.native
  class Promise[T] protected ()
    extends typings.rsvp.mod.default.Promise[T] {
    def this(executor: js.Function2[
            /* resolve */ js.Function1[/* value */ js.UndefOr[Arg[T]], Unit], 
            /* reject */ js.Function1[/* reason */ js.UndefOr[js.Any], Unit], 
            Unit
          ]) = this()
    def this(
      executor: js.Function2[
            /* resolve */ js.Function1[/* value */ js.UndefOr[Arg[T]], Unit], 
            /* reject */ js.Function1[/* reason */ js.UndefOr[js.Any], Unit], 
            Unit
          ],
      label: java.lang.String
    ) = this()
  }
  object Promise {
    
    /* static member */
    @JSImport("ember", "default.RSVP.Promise.all")
    @js.native
    def all[T](values: js.Array[Arg[T]]): typings.rsvp.mod.RSVP.Promise[js.Array[T]] = js.native
    @JSImport("ember", "default.RSVP.Promise.all")
    @js.native
    def all[T](values: js.Array[Arg[T]], label: java.lang.String): typings.rsvp.mod.RSVP.Promise[js.Array[T]] = js.native
    /* static member */
    @JSImport("ember", "default.RSVP.Promise.all")
    @js.native
    def all[T1, T2](values: js.Tuple2[Arg[T1], Arg[T2]]): typings.rsvp.mod.RSVP.Promise[js.Tuple2[T1, T2]] = js.native
    @JSImport("ember", "default.RSVP.Promise.all")
    @js.native
    def all[T1, T2](values: js.Tuple2[Arg[T1], Arg[T2]], label: java.lang.String): typings.rsvp.mod.RSVP.Promise[js.Tuple2[T1, T2]] = js.native
    /* static member */
    @JSImport("ember", "default.RSVP.Promise.all")
    @js.native
    def all[T1, T2, T3](values: js.Tuple3[Arg[T1], Arg[T2], Arg[T3]]): typings.rsvp.mod.RSVP.Promise[js.Tuple3[T1, T2, T3]] = js.native
    @JSImport("ember", "default.RSVP.Promise.all")
    @js.native
    def all[T1, T2, T3](values: js.Tuple3[Arg[T1], Arg[T2], Arg[T3]], label: java.lang.String): typings.rsvp.mod.RSVP.Promise[js.Tuple3[T1, T2, T3]] = js.native
    /* static member */
    @JSImport("ember", "default.RSVP.Promise.all")
    @js.native
    def all[T1, T2, T3, T4](values: js.Tuple4[Arg[T1], Arg[T2], Arg[T3], Arg[T4]]): typings.rsvp.mod.RSVP.Promise[js.Tuple4[T1, T2, T3, T4]] = js.native
    @JSImport("ember", "default.RSVP.Promise.all")
    @js.native
    def all[T1, T2, T3, T4](values: js.Tuple4[Arg[T1], Arg[T2], Arg[T3], Arg[T4]], label: java.lang.String): typings.rsvp.mod.RSVP.Promise[js.Tuple4[T1, T2, T3, T4]] = js.native
    /* static member */
    @JSImport("ember", "default.RSVP.Promise.all")
    @js.native
    def all[T1, T2, T3, T4, T5](values: js.Tuple5[Arg[T1], Arg[T2], Arg[T3], Arg[T4], Arg[T5]]): typings.rsvp.mod.RSVP.Promise[js.Tuple5[T1, T2, T3, T4, T5]] = js.native
    @JSImport("ember", "default.RSVP.Promise.all")
    @js.native
    def all[T1, T2, T3, T4, T5](values: js.Tuple5[Arg[T1], Arg[T2], Arg[T3], Arg[T4], Arg[T5]], label: java.lang.String): typings.rsvp.mod.RSVP.Promise[js.Tuple5[T1, T2, T3, T4, T5]] = js.native
    /* static member */
    @JSImport("ember", "default.RSVP.Promise.all")
    @js.native
    def all[T1, T2, T3, T4, T5, T6](values: js.Tuple6[Arg[T1], Arg[T2], Arg[T3], Arg[T4], Arg[T5], Arg[T6]]): typings.rsvp.mod.RSVP.Promise[js.Tuple6[T1, T2, T3, T4, T5, T6]] = js.native
    @JSImport("ember", "default.RSVP.Promise.all")
    @js.native
    def all[T1, T2, T3, T4, T5, T6](values: js.Tuple6[Arg[T1], Arg[T2], Arg[T3], Arg[T4], Arg[T5], Arg[T6]], label: java.lang.String): typings.rsvp.mod.RSVP.Promise[js.Tuple6[T1, T2, T3, T4, T5, T6]] = js.native
    /* static member */
    @JSImport("ember", "default.RSVP.Promise.all")
    @js.native
    def all[T1, T2, T3, T4, T5, T6, T7](values: js.Tuple7[Arg[T1], Arg[T2], Arg[T3], Arg[T4], Arg[T5], Arg[T6], Arg[T7]]): typings.rsvp.mod.RSVP.Promise[js.Tuple7[T1, T2, T3, T4, T5, T6, T7]] = js.native
    @JSImport("ember", "default.RSVP.Promise.all")
    @js.native
    def all[T1, T2, T3, T4, T5, T6, T7](
      values: js.Tuple7[Arg[T1], Arg[T2], Arg[T3], Arg[T4], Arg[T5], Arg[T6], Arg[T7]],
      label: java.lang.String
    ): typings.rsvp.mod.RSVP.Promise[js.Tuple7[T1, T2, T3, T4, T5, T6, T7]] = js.native
    /* static member */
    @JSImport("ember", "default.RSVP.Promise.all")
    @js.native
    def all[T1, T2, T3, T4, T5, T6, T7, T8](values: js.Tuple8[Arg[T1], Arg[T2], Arg[T3], Arg[T4], Arg[T5], Arg[T6], Arg[T7], Arg[T8]]): typings.rsvp.mod.RSVP.Promise[js.Tuple8[T1, T2, T3, T4, T5, T6, T7, T8]] = js.native
    @JSImport("ember", "default.RSVP.Promise.all")
    @js.native
    def all[T1, T2, T3, T4, T5, T6, T7, T8](
      values: js.Tuple8[Arg[T1], Arg[T2], Arg[T3], Arg[T4], Arg[T5], Arg[T6], Arg[T7], Arg[T8]],
      label: java.lang.String
    ): typings.rsvp.mod.RSVP.Promise[js.Tuple8[T1, T2, T3, T4, T5, T6, T7, T8]] = js.native
    /* static member */
    @JSImport("ember", "default.RSVP.Promise.all")
    @js.native
    def all[T1, T2, T3, T4, T5, T6, T7, T8, T9](values: js.Tuple9[Arg[T1], Arg[T2], Arg[T3], Arg[T4], Arg[T5], Arg[T6], Arg[T7], Arg[T8], Arg[T9]]): typings.rsvp.mod.RSVP.Promise[js.Tuple9[T1, T2, T3, T4, T5, T6, T7, T8, T9]] = js.native
    @JSImport("ember", "default.RSVP.Promise.all")
    @js.native
    def all[T1, T2, T3, T4, T5, T6, T7, T8, T9](
      values: js.Tuple9[Arg[T1], Arg[T2], Arg[T3], Arg[T4], Arg[T5], Arg[T6], Arg[T7], Arg[T8], Arg[T9]],
      label: java.lang.String
    ): typings.rsvp.mod.RSVP.Promise[js.Tuple9[T1, T2, T3, T4, T5, T6, T7, T8, T9]] = js.native
    /* static member */
    @JSImport("ember", "default.RSVP.Promise.all")
    @js.native
    def all[T1, T2, T3, T4, T5, T6, T7, T8, T9, T10](
      values: js.Tuple10[Arg[T1], Arg[T2], Arg[T3], Arg[T4], Arg[T5], Arg[T6], Arg[T7], Arg[T8], Arg[T9], Arg[T10]]
    ): typings.rsvp.mod.RSVP.Promise[js.Tuple10[T1, T2, T3, T4, T5, T6, T7, T8, T9, T10]] = js.native
    @JSImport("ember", "default.RSVP.Promise.all")
    @js.native
    def all[T1, T2, T3, T4, T5, T6, T7, T8, T9, T10](
      values: js.Tuple10[Arg[T1], Arg[T2], Arg[T3], Arg[T4], Arg[T5], Arg[T6], Arg[T7], Arg[T8], Arg[T9], Arg[T10]],
      label: java.lang.String
    ): typings.rsvp.mod.RSVP.Promise[js.Tuple10[T1, T2, T3, T4, T5, T6, T7, T8, T9, T10]] = js.native
    
    /* static member */
    /* was `typeof RSVP.Promise.resolve` */
    @JSImport("ember", "default.RSVP.Promise.cast")
    @js.native
    def cast(): typings.rsvp.mod.RSVP.Promise[Unit] = js.native
    @JSImport("ember", "default.RSVP.Promise.cast")
    @js.native
    def cast[T](value: js.UndefOr[Arg[T]], label: java.lang.String): typings.rsvp.mod.RSVP.Promise[T] = js.native
    @JSImport("ember", "default.RSVP.Promise.cast")
    @js.native
    def cast[T](value: Arg[T]): typings.rsvp.mod.RSVP.Promise[T] = js.native
    /* static member */
    /* was `typeof RSVP.Promise.resolve` */
    @JSImport("ember", "default.RSVP.Promise.cast")
    @js.native
    def cast_T[T](): typings.rsvp.mod.RSVP.Promise[T] = js.native
    
    /* static member */
    @JSImport("ember", "default.RSVP.Promise.race")
    @js.native
    def race[T](values: js.Array[Arg[T]]): typings.rsvp.mod.RSVP.Promise[T] = js.native
    @JSImport("ember", "default.RSVP.Promise.race")
    @js.native
    def race[T](values: js.Array[Arg[T]], label: java.lang.String): typings.rsvp.mod.RSVP.Promise[T] = js.native
    /* static member */
    @JSImport("ember", "default.RSVP.Promise.race")
    @js.native
    def race[T1, T2](values: js.Tuple2[Arg[T1], Arg[T2]]): typings.rsvp.mod.RSVP.Promise[T1 | T2] = js.native
    @JSImport("ember", "default.RSVP.Promise.race")
    @js.native
    def race[T1, T2](values: js.Tuple2[Arg[T1], Arg[T2]], label: java.lang.String): typings.rsvp.mod.RSVP.Promise[T1 | T2] = js.native
    /* static member */
    @JSImport("ember", "default.RSVP.Promise.race")
    @js.native
    def race[T1, T2, T3](values: js.Tuple3[Arg[T1], Arg[T2], Arg[T3]]): typings.rsvp.mod.RSVP.Promise[T1 | T2 | T3] = js.native
    @JSImport("ember", "default.RSVP.Promise.race")
    @js.native
    def race[T1, T2, T3](values: js.Tuple3[Arg[T1], Arg[T2], Arg[T3]], label: java.lang.String): typings.rsvp.mod.RSVP.Promise[T1 | T2 | T3] = js.native
    /* static member */
    @JSImport("ember", "default.RSVP.Promise.race")
    @js.native
    def race[T1, T2, T3, T4](values: js.Tuple4[Arg[T1], Arg[T2], Arg[T3], Arg[T4]]): typings.rsvp.mod.RSVP.Promise[T1 | T2 | T3 | T4] = js.native
    @JSImport("ember", "default.RSVP.Promise.race")
    @js.native
    def race[T1, T2, T3, T4](values: js.Tuple4[Arg[T1], Arg[T2], Arg[T3], Arg[T4]], label: java.lang.String): typings.rsvp.mod.RSVP.Promise[T1 | T2 | T3 | T4] = js.native
    /* static member */
    @JSImport("ember", "default.RSVP.Promise.race")
    @js.native
    def race[T1, T2, T3, T4, T5](values: js.Tuple5[Arg[T1], Arg[T2], Arg[T3], Arg[T4], Arg[T5]]): typings.rsvp.mod.RSVP.Promise[T1 | T2 | T3 | T4 | T5] = js.native
    @JSImport("ember", "default.RSVP.Promise.race")
    @js.native
    def race[T1, T2, T3, T4, T5](values: js.Tuple5[Arg[T1], Arg[T2], Arg[T3], Arg[T4], Arg[T5]], label: java.lang.String): typings.rsvp.mod.RSVP.Promise[T1 | T2 | T3 | T4 | T5] = js.native
    /* static member */
    @JSImport("ember", "default.RSVP.Promise.race")
    @js.native
    def race[T1, T2, T3, T4, T5, T6](values: js.Tuple6[Arg[T1], Arg[T2], Arg[T3], Arg[T4], Arg[T5], Arg[T6]]): typings.rsvp.mod.RSVP.Promise[T1 | T2 | T3 | T4 | T5 | T6] = js.native
    @JSImport("ember", "default.RSVP.Promise.race")
    @js.native
    def race[T1, T2, T3, T4, T5, T6](values: js.Tuple6[Arg[T1], Arg[T2], Arg[T3], Arg[T4], Arg[T5], Arg[T6]], label: java.lang.String): typings.rsvp.mod.RSVP.Promise[T1 | T2 | T3 | T4 | T5 | T6] = js.native
    /* static member */
    @JSImport("ember", "default.RSVP.Promise.race")
    @js.native
    def race[T1, T2, T3, T4, T5, T6, T7](values: js.Tuple7[Arg[T1], Arg[T2], Arg[T3], Arg[T4], Arg[T5], Arg[T6], Arg[T7]]): typings.rsvp.mod.RSVP.Promise[T1 | T2 | T3 | T4 | T5 | T6 | T7] = js.native
    @JSImport("ember", "default.RSVP.Promise.race")
    @js.native
    def race[T1, T2, T3, T4, T5, T6, T7](
      values: js.Tuple7[Arg[T1], Arg[T2], Arg[T3], Arg[T4], Arg[T5], Arg[T6], Arg[T7]],
      label: java.lang.String
    ): typings.rsvp.mod.RSVP.Promise[T1 | T2 | T3 | T4 | T5 | T6 | T7] = js.native
    /* static member */
    @JSImport("ember", "default.RSVP.Promise.race")
    @js.native
    def race[T1, T2, T3, T4, T5, T6, T7, T8](values: js.Tuple8[Arg[T1], Arg[T2], Arg[T3], Arg[T4], Arg[T5], Arg[T6], Arg[T7], Arg[T8]]): typings.rsvp.mod.RSVP.Promise[T1 | T2 | T3 | T4 | T5 | T6 | T7 | T8] = js.native
    @JSImport("ember", "default.RSVP.Promise.race")
    @js.native
    def race[T1, T2, T3, T4, T5, T6, T7, T8](
      values: js.Tuple8[Arg[T1], Arg[T2], Arg[T3], Arg[T4], Arg[T5], Arg[T6], Arg[T7], Arg[T8]],
      label: java.lang.String
    ): typings.rsvp.mod.RSVP.Promise[T1 | T2 | T3 | T4 | T5 | T6 | T7 | T8] = js.native
    /* static member */
    @JSImport("ember", "default.RSVP.Promise.race")
    @js.native
    def race[T1, T2, T3, T4, T5, T6, T7, T8, T9](values: js.Tuple9[Arg[T1], Arg[T2], Arg[T3], Arg[T4], Arg[T5], Arg[T6], Arg[T7], Arg[T8], Arg[T9]]): typings.rsvp.mod.RSVP.Promise[T1 | T2 | T3 | T4 | T5 | T6 | T7 | T8 | T9] = js.native
    @JSImport("ember", "default.RSVP.Promise.race")
    @js.native
    def race[T1, T2, T3, T4, T5, T6, T7, T8, T9](
      values: js.Tuple9[Arg[T1], Arg[T2], Arg[T3], Arg[T4], Arg[T5], Arg[T6], Arg[T7], Arg[T8], Arg[T9]],
      label: java.lang.String
    ): typings.rsvp.mod.RSVP.Promise[T1 | T2 | T3 | T4 | T5 | T6 | T7 | T8 | T9] = js.native
    /* static member */
    @JSImport("ember", "default.RSVP.Promise.race")
    @js.native
    def race[T1, T2, T3, T4, T5, T6, T7, T8, T9, T10](
      values: js.Tuple10[
          Arg[T1], 
          Arg[T2], 
          Arg[T3], 
          Arg[T4], 
          Arg[T5], 
          Arg[T6], 
          Arg[T7], 
          Arg[T8], 
          Arg[T9], 
          T10 | js.Thenable[T10]
        ]
    ): typings.rsvp.mod.RSVP.Promise[T1 | T2 | T3 | T4 | T5 | T6 | T7 | T8 | T9 | T10] = js.native
    @JSImport("ember", "default.RSVP.Promise.race")
    @js.native
    def race[T1, T2, T3, T4, T5, T6, T7, T8, T9, T10](
      values: js.Tuple10[
          Arg[T1], 
          Arg[T2], 
          Arg[T3], 
          Arg[T4], 
          Arg[T5], 
          Arg[T6], 
          Arg[T7], 
          Arg[T8], 
          Arg[T9], 
          T10 | js.Thenable[T10]
        ],
      label: java.lang.String
    ): typings.rsvp.mod.RSVP.Promise[T1 | T2 | T3 | T4 | T5 | T6 | T7 | T8 | T9 | T10] = js.native
    
    /* static member */
    @JSImport("ember", "default.RSVP.Promise.reject")
    @js.native
    def reject(): typings.rsvp.mod.RSVP.Promise[scala.Nothing] = js.native
    @JSImport("ember", "default.RSVP.Promise.reject")
    @js.native
    def reject(reason: js.UndefOr[scala.Nothing], label: java.lang.String): typings.rsvp.mod.RSVP.Promise[scala.Nothing] = js.native
    @JSImport("ember", "default.RSVP.Promise.reject")
    @js.native
    def reject(reason: js.Any): typings.rsvp.mod.RSVP.Promise[scala.Nothing] = js.native
    @JSImport("ember", "default.RSVP.Promise.reject")
    @js.native
    def reject(reason: js.Any, label: java.lang.String): typings.rsvp.mod.RSVP.Promise[scala.Nothing] = js.native
    
    /* static member */
    @JSImport("ember", "default.RSVP.Promise.resolve")
    @js.native
    def resolve(): typings.rsvp.mod.RSVP.Promise[Unit] = js.native
    @JSImport("ember", "default.RSVP.Promise.resolve")
    @js.native
    def resolve[T](value: js.UndefOr[Arg[T]], label: java.lang.String): typings.rsvp.mod.RSVP.Promise[T] = js.native
    @JSImport("ember", "default.RSVP.Promise.resolve")
    @js.native
    def resolve[T](value: Arg[T]): typings.rsvp.mod.RSVP.Promise[T] = js.native
    /* static member */
    @JSImport("ember", "default.RSVP.Promise.resolve")
    @js.native
    def resolve_T[T](): typings.rsvp.mod.RSVP.Promise[T] = js.native
  }
  
  // RSVP supplies status for promises in certain places.
  @JSImport("ember", "default.RSVP.State")
  @js.native
  object State extends StObject {
    
    @JSBracketAccess
    def apply(value: java.lang.String): js.UndefOr[typings.rsvp.mod.RSVP.State with java.lang.String] = js.native
    
    /* "fulfilled" */ val fulfilled: typings.rsvp.mod.RSVP.State.fulfilled with java.lang.String = js.native
    
    /* "pending" */ val pending: typings.rsvp.mod.RSVP.State.pending with java.lang.String = js.native
    
    /* "rejected" */ val rejected: typings.rsvp.mod.RSVP.State.rejected with java.lang.String = js.native
  }
  
  /* static member */
  /* was `typeof Promise.all` */
  @JSImport("ember", "default.RSVP.all")
  @js.native
  def all[T](values: js.Array[Arg[T]]): typings.rsvp.mod.RSVP.Promise[js.Array[T]] = js.native
  @JSImport("ember", "default.RSVP.all")
  @js.native
  def all[T](values: js.Array[Arg[T]], label: java.lang.String): typings.rsvp.mod.RSVP.Promise[js.Array[T]] = js.native
  /* static member */
  /* was `typeof Promise.all` */
  @JSImport("ember", "default.RSVP.all")
  @js.native
  def all[T1, T2](values: js.Tuple2[Arg[T1], Arg[T2]]): typings.rsvp.mod.RSVP.Promise[js.Tuple2[T1, T2]] = js.native
  @JSImport("ember", "default.RSVP.all")
  @js.native
  def all[T1, T2](values: js.Tuple2[Arg[T1], Arg[T2]], label: java.lang.String): typings.rsvp.mod.RSVP.Promise[js.Tuple2[T1, T2]] = js.native
  /* static member */
  /* was `typeof Promise.all` */
  @JSImport("ember", "default.RSVP.all")
  @js.native
  def all[T1, T2, T3](values: js.Tuple3[Arg[T1], Arg[T2], Arg[T3]]): typings.rsvp.mod.RSVP.Promise[js.Tuple3[T1, T2, T3]] = js.native
  @JSImport("ember", "default.RSVP.all")
  @js.native
  def all[T1, T2, T3](values: js.Tuple3[Arg[T1], Arg[T2], Arg[T3]], label: java.lang.String): typings.rsvp.mod.RSVP.Promise[js.Tuple3[T1, T2, T3]] = js.native
  /* static member */
  /* was `typeof Promise.all` */
  @JSImport("ember", "default.RSVP.all")
  @js.native
  def all[T1, T2, T3, T4](values: js.Tuple4[Arg[T1], Arg[T2], Arg[T3], Arg[T4]]): typings.rsvp.mod.RSVP.Promise[js.Tuple4[T1, T2, T3, T4]] = js.native
  @JSImport("ember", "default.RSVP.all")
  @js.native
  def all[T1, T2, T3, T4](values: js.Tuple4[Arg[T1], Arg[T2], Arg[T3], Arg[T4]], label: java.lang.String): typings.rsvp.mod.RSVP.Promise[js.Tuple4[T1, T2, T3, T4]] = js.native
  /* static member */
  /* was `typeof Promise.all` */
  @JSImport("ember", "default.RSVP.all")
  @js.native
  def all[T1, T2, T3, T4, T5](values: js.Tuple5[Arg[T1], Arg[T2], Arg[T3], Arg[T4], Arg[T5]]): typings.rsvp.mod.RSVP.Promise[js.Tuple5[T1, T2, T3, T4, T5]] = js.native
  @JSImport("ember", "default.RSVP.all")
  @js.native
  def all[T1, T2, T3, T4, T5](values: js.Tuple5[Arg[T1], Arg[T2], Arg[T3], Arg[T4], Arg[T5]], label: java.lang.String): typings.rsvp.mod.RSVP.Promise[js.Tuple5[T1, T2, T3, T4, T5]] = js.native
  /* static member */
  /* was `typeof Promise.all` */
  @JSImport("ember", "default.RSVP.all")
  @js.native
  def all[T1, T2, T3, T4, T5, T6](values: js.Tuple6[Arg[T1], Arg[T2], Arg[T3], Arg[T4], Arg[T5], Arg[T6]]): typings.rsvp.mod.RSVP.Promise[js.Tuple6[T1, T2, T3, T4, T5, T6]] = js.native
  @JSImport("ember", "default.RSVP.all")
  @js.native
  def all[T1, T2, T3, T4, T5, T6](values: js.Tuple6[Arg[T1], Arg[T2], Arg[T3], Arg[T4], Arg[T5], Arg[T6]], label: java.lang.String): typings.rsvp.mod.RSVP.Promise[js.Tuple6[T1, T2, T3, T4, T5, T6]] = js.native
  /* static member */
  /* was `typeof Promise.all` */
  @JSImport("ember", "default.RSVP.all")
  @js.native
  def all[T1, T2, T3, T4, T5, T6, T7](values: js.Tuple7[Arg[T1], Arg[T2], Arg[T3], Arg[T4], Arg[T5], Arg[T6], Arg[T7]]): typings.rsvp.mod.RSVP.Promise[js.Tuple7[T1, T2, T3, T4, T5, T6, T7]] = js.native
  @JSImport("ember", "default.RSVP.all")
  @js.native
  def all[T1, T2, T3, T4, T5, T6, T7](
    values: js.Tuple7[Arg[T1], Arg[T2], Arg[T3], Arg[T4], Arg[T5], Arg[T6], Arg[T7]],
    label: java.lang.String
  ): typings.rsvp.mod.RSVP.Promise[js.Tuple7[T1, T2, T3, T4, T5, T6, T7]] = js.native
  /* static member */
  /* was `typeof Promise.all` */
  @JSImport("ember", "default.RSVP.all")
  @js.native
  def all[T1, T2, T3, T4, T5, T6, T7, T8](values: js.Tuple8[Arg[T1], Arg[T2], Arg[T3], Arg[T4], Arg[T5], Arg[T6], Arg[T7], Arg[T8]]): typings.rsvp.mod.RSVP.Promise[js.Tuple8[T1, T2, T3, T4, T5, T6, T7, T8]] = js.native
  @JSImport("ember", "default.RSVP.all")
  @js.native
  def all[T1, T2, T3, T4, T5, T6, T7, T8](
    values: js.Tuple8[Arg[T1], Arg[T2], Arg[T3], Arg[T4], Arg[T5], Arg[T6], Arg[T7], Arg[T8]],
    label: java.lang.String
  ): typings.rsvp.mod.RSVP.Promise[js.Tuple8[T1, T2, T3, T4, T5, T6, T7, T8]] = js.native
  /* static member */
  /* was `typeof Promise.all` */
  @JSImport("ember", "default.RSVP.all")
  @js.native
  def all[T1, T2, T3, T4, T5, T6, T7, T8, T9](values: js.Tuple9[Arg[T1], Arg[T2], Arg[T3], Arg[T4], Arg[T5], Arg[T6], Arg[T7], Arg[T8], Arg[T9]]): typings.rsvp.mod.RSVP.Promise[js.Tuple9[T1, T2, T3, T4, T5, T6, T7, T8, T9]] = js.native
  @JSImport("ember", "default.RSVP.all")
  @js.native
  def all[T1, T2, T3, T4, T5, T6, T7, T8, T9](
    values: js.Tuple9[Arg[T1], Arg[T2], Arg[T3], Arg[T4], Arg[T5], Arg[T6], Arg[T7], Arg[T8], Arg[T9]],
    label: java.lang.String
  ): typings.rsvp.mod.RSVP.Promise[js.Tuple9[T1, T2, T3, T4, T5, T6, T7, T8, T9]] = js.native
  /* static member */
  /* was `typeof Promise.all` */
  @JSImport("ember", "default.RSVP.all")
  @js.native
  def all[T1, T2, T3, T4, T5, T6, T7, T8, T9, T10](
    values: js.Tuple10[Arg[T1], Arg[T2], Arg[T3], Arg[T4], Arg[T5], Arg[T6], Arg[T7], Arg[T8], Arg[T9], Arg[T10]]
  ): typings.rsvp.mod.RSVP.Promise[js.Tuple10[T1, T2, T3, T4, T5, T6, T7, T8, T9, T10]] = js.native
  @JSImport("ember", "default.RSVP.all")
  @js.native
  def all[T1, T2, T3, T4, T5, T6, T7, T8, T9, T10](
    values: js.Tuple10[Arg[T1], Arg[T2], Arg[T3], Arg[T4], Arg[T5], Arg[T6], Arg[T7], Arg[T8], Arg[T9], Arg[T10]],
    label: java.lang.String
  ): typings.rsvp.mod.RSVP.Promise[js.Tuple10[T1, T2, T3, T4, T5, T6, T7, T8, T9, T10]] = js.native
  
  @JSImport("ember", "default.RSVP.allSettled")
  @js.native
  def allSettled[T](entries: js.Array[Arg[T]]): typings.rsvp.mod.RSVP.Promise[js.Array[PromiseState[T]]] = js.native
  @JSImport("ember", "default.RSVP.allSettled")
  @js.native
  def allSettled[T](entries: js.Array[Arg[T]], label: java.lang.String): typings.rsvp.mod.RSVP.Promise[js.Array[PromiseState[T]]] = js.native
  @JSImport("ember", "default.RSVP.allSettled")
  @js.native
  def allSettled[T1, T2](entries: js.Tuple2[Arg[T1], Arg[T2]]): typings.rsvp.mod.RSVP.Promise[js.Tuple2[PromiseState[T1], PromiseState[T2]]] = js.native
  @JSImport("ember", "default.RSVP.allSettled")
  @js.native
  def allSettled[T1, T2](entries: js.Tuple2[Arg[T1], Arg[T2]], label: java.lang.String): typings.rsvp.mod.RSVP.Promise[js.Tuple2[PromiseState[T1], PromiseState[T2]]] = js.native
  @JSImport("ember", "default.RSVP.allSettled")
  @js.native
  def allSettled[T1, T2, T3](entries: js.Tuple3[Arg[T1], Arg[T2], Arg[T3]]): typings.rsvp.mod.RSVP.Promise[js.Tuple3[PromiseState[T1], PromiseState[T2], PromiseState[T3]]] = js.native
  @JSImport("ember", "default.RSVP.allSettled")
  @js.native
  def allSettled[T1, T2, T3](entries: js.Tuple3[Arg[T1], Arg[T2], Arg[T3]], label: java.lang.String): typings.rsvp.mod.RSVP.Promise[js.Tuple3[PromiseState[T1], PromiseState[T2], PromiseState[T3]]] = js.native
  @JSImport("ember", "default.RSVP.allSettled")
  @js.native
  def allSettled[T1, T2, T3, T4](entries: js.Tuple4[Arg[T1], Arg[T2], Arg[T3], Arg[T4]]): typings.rsvp.mod.RSVP.Promise[
    js.Tuple4[PromiseState[T1], PromiseState[T2], PromiseState[T3], PromiseState[T4]]
  ] = js.native
  @JSImport("ember", "default.RSVP.allSettled")
  @js.native
  def allSettled[T1, T2, T3, T4](entries: js.Tuple4[Arg[T1], Arg[T2], Arg[T3], Arg[T4]], label: java.lang.String): typings.rsvp.mod.RSVP.Promise[
    js.Tuple4[PromiseState[T1], PromiseState[T2], PromiseState[T3], PromiseState[T4]]
  ] = js.native
  @JSImport("ember", "default.RSVP.allSettled")
  @js.native
  def allSettled[T1, T2, T3, T4, T5](entries: js.Tuple5[Arg[T1], Arg[T2], Arg[T3], Arg[T4], Arg[T5]]): typings.rsvp.mod.RSVP.Promise[
    js.Tuple5[PromiseState[T1], PromiseState[T2], PromiseState[T3], PromiseState[T4], PromiseState[T5]]
  ] = js.native
  @JSImport("ember", "default.RSVP.allSettled")
  @js.native
  def allSettled[T1, T2, T3, T4, T5](entries: js.Tuple5[Arg[T1], Arg[T2], Arg[T3], Arg[T4], Arg[T5]], label: java.lang.String): typings.rsvp.mod.RSVP.Promise[
    js.Tuple5[PromiseState[T1], PromiseState[T2], PromiseState[T3], PromiseState[T4], PromiseState[T5]]
  ] = js.native
  @JSImport("ember", "default.RSVP.allSettled")
  @js.native
  def allSettled[T1, T2, T3, T4, T5, T6](entries: js.Tuple6[Arg[T1], Arg[T2], Arg[T3], Arg[T4], Arg[T5], Arg[T6]]): typings.rsvp.mod.RSVP.Promise[
    js.Tuple6[
      PromiseState[T1], 
      PromiseState[T2], 
      PromiseState[T3], 
      PromiseState[T4], 
      PromiseState[T5], 
      PromiseState[T6]
    ]
  ] = js.native
  @JSImport("ember", "default.RSVP.allSettled")
  @js.native
  def allSettled[T1, T2, T3, T4, T5, T6](entries: js.Tuple6[Arg[T1], Arg[T2], Arg[T3], Arg[T4], Arg[T5], Arg[T6]], label: java.lang.String): typings.rsvp.mod.RSVP.Promise[
    js.Tuple6[
      PromiseState[T1], 
      PromiseState[T2], 
      PromiseState[T3], 
      PromiseState[T4], 
      PromiseState[T5], 
      PromiseState[T6]
    ]
  ] = js.native
  @JSImport("ember", "default.RSVP.allSettled")
  @js.native
  def allSettled[T1, T2, T3, T4, T5, T6, T7](entries: js.Tuple7[Arg[T1], Arg[T2], Arg[T3], Arg[T4], Arg[T5], Arg[T6], Arg[T7]]): typings.rsvp.mod.RSVP.Promise[
    js.Tuple7[
      PromiseState[T1], 
      PromiseState[T2], 
      PromiseState[T3], 
      PromiseState[T4], 
      PromiseState[T5], 
      PromiseState[T6], 
      PromiseState[T7]
    ]
  ] = js.native
  @JSImport("ember", "default.RSVP.allSettled")
  @js.native
  def allSettled[T1, T2, T3, T4, T5, T6, T7](
    entries: js.Tuple7[Arg[T1], Arg[T2], Arg[T3], Arg[T4], Arg[T5], Arg[T6], Arg[T7]],
    label: java.lang.String
  ): typings.rsvp.mod.RSVP.Promise[
    js.Tuple7[
      PromiseState[T1], 
      PromiseState[T2], 
      PromiseState[T3], 
      PromiseState[T4], 
      PromiseState[T5], 
      PromiseState[T6], 
      PromiseState[T7]
    ]
  ] = js.native
  @JSImport("ember", "default.RSVP.allSettled")
  @js.native
  def allSettled[T1, T2, T3, T4, T5, T6, T7, T8](entries: js.Tuple8[Arg[T1], Arg[T2], Arg[T3], Arg[T4], Arg[T5], Arg[T6], Arg[T7], Arg[T8]]): typings.rsvp.mod.RSVP.Promise[
    js.Tuple8[
      PromiseState[T1], 
      PromiseState[T2], 
      PromiseState[T3], 
      PromiseState[T4], 
      PromiseState[T5], 
      PromiseState[T6], 
      PromiseState[T7], 
      PromiseState[T8]
    ]
  ] = js.native
  @JSImport("ember", "default.RSVP.allSettled")
  @js.native
  def allSettled[T1, T2, T3, T4, T5, T6, T7, T8](
    entries: js.Tuple8[Arg[T1], Arg[T2], Arg[T3], Arg[T4], Arg[T5], Arg[T6], Arg[T7], Arg[T8]],
    label: java.lang.String
  ): typings.rsvp.mod.RSVP.Promise[
    js.Tuple8[
      PromiseState[T1], 
      PromiseState[T2], 
      PromiseState[T3], 
      PromiseState[T4], 
      PromiseState[T5], 
      PromiseState[T6], 
      PromiseState[T7], 
      PromiseState[T8]
    ]
  ] = js.native
  @JSImport("ember", "default.RSVP.allSettled")
  @js.native
  def allSettled[T1, T2, T3, T4, T5, T6, T7, T8, T9](
    entries: js.Tuple9[Arg[T1], Arg[T2], Arg[T3], Arg[T4], Arg[T5], Arg[T6], Arg[T7], Arg[T8], Arg[T9]]
  ): typings.rsvp.mod.RSVP.Promise[
    js.Tuple9[
      PromiseState[T1], 
      PromiseState[T2], 
      PromiseState[T3], 
      PromiseState[T4], 
      PromiseState[T5], 
      PromiseState[T6], 
      PromiseState[T7], 
      PromiseState[T8], 
      PromiseState[T9]
    ]
  ] = js.native
  @JSImport("ember", "default.RSVP.allSettled")
  @js.native
  def allSettled[T1, T2, T3, T4, T5, T6, T7, T8, T9](
    entries: js.Tuple9[Arg[T1], Arg[T2], Arg[T3], Arg[T4], Arg[T5], Arg[T6], Arg[T7], Arg[T8], Arg[T9]],
    label: java.lang.String
  ): typings.rsvp.mod.RSVP.Promise[
    js.Tuple9[
      PromiseState[T1], 
      PromiseState[T2], 
      PromiseState[T3], 
      PromiseState[T4], 
      PromiseState[T5], 
      PromiseState[T6], 
      PromiseState[T7], 
      PromiseState[T8], 
      PromiseState[T9]
    ]
  ] = js.native
  @JSImport("ember", "default.RSVP.allSettled")
  @js.native
  def allSettled[T1, T2, T3, T4, T5, T6, T7, T8, T9, T10](
    entries: js.Tuple10[Arg[T1], Arg[T2], Arg[T3], Arg[T4], Arg[T5], Arg[T6], Arg[T7], Arg[T8], Arg[T9], Arg[T10]]
  ): typings.rsvp.mod.RSVP.Promise[
    js.Tuple9[
      PromiseState[T1], 
      PromiseState[T2], 
      PromiseState[T3], 
      PromiseState[T4], 
      PromiseState[T5], 
      PromiseState[T6], 
      PromiseState[T7], 
      PromiseState[T8], 
      PromiseState[T9]
    ]
  ] = js.native
  @JSImport("ember", "default.RSVP.allSettled")
  @js.native
  def allSettled[T1, T2, T3, T4, T5, T6, T7, T8, T9, T10](
    entries: js.Tuple10[Arg[T1], Arg[T2], Arg[T3], Arg[T4], Arg[T5], Arg[T6], Arg[T7], Arg[T8], Arg[T9], Arg[T10]],
    label: java.lang.String
  ): typings.rsvp.mod.RSVP.Promise[
    js.Tuple9[
      PromiseState[T1], 
      PromiseState[T2], 
      PromiseState[T3], 
      PromiseState[T4], 
      PromiseState[T5], 
      PromiseState[T6], 
      PromiseState[T7], 
      PromiseState[T8], 
      PromiseState[T9]
    ]
  ] = js.native
  
  @JSImport("ember", "default.RSVP.asap")
  @js.native
  def asap[T, U](callback: js.Function1[/* callbackArg */ T, U], arg: T): Unit = js.native
  
  /* was `typeof asap` */
  @JSImport("ember", "default.RSVP.async")
  @js.native
  def async[T, U](callback: js.Function1[/* callbackArg */ T, U], arg: T): Unit = js.native
  
  /**
    * @deprecated
    */
  /* static member */
  /* was `typeof Promise.cast` */
  @JSImport("ember", "default.RSVP.cast")
  @js.native
  def cast(): typings.rsvp.mod.RSVP.Promise[Unit] = js.native
  /**
    * @deprecated
    */
  /* static member */
  /* was `typeof Promise.cast` */
  @JSImport("ember", "default.RSVP.cast")
  @js.native
  def cast[T](value: js.UndefOr[Arg[T]], label: java.lang.String): typings.rsvp.mod.RSVP.Promise[T] = js.native
  /**
    * @deprecated
    */
  /* static member */
  /* was `typeof Promise.cast` */
  @JSImport("ember", "default.RSVP.cast")
  @js.native
  def cast[T](value: Arg[T]): typings.rsvp.mod.RSVP.Promise[T] = js.native
  /**
    * @deprecated
    */
  /* static member */
  /* was `typeof Promise.cast` */
  @JSImport("ember", "default.RSVP.cast")
  @js.native
  def cast_T[T](): typings.rsvp.mod.RSVP.Promise[T] = js.native
  
  @JSImport("ember", "default.RSVP.configure")
  @js.native
  def configure[T](name: java.lang.String): T = js.native
  @JSImport("ember", "default.RSVP.configure")
  @js.native
  def configure[T](name: java.lang.String, value: T): Unit = js.native
  
  @JSImport("ember", "default.RSVP.defer")
  @js.native
  def defer[T](): Deferred[T] = js.native
  @JSImport("ember", "default.RSVP.defer")
  @js.native
  def defer[T](label: java.lang.String): Deferred[T] = js.native
  
  @JSImport("ember", "default.RSVP.denodeify")
  @js.native
  def denodeify[T, A](
    nodeFunc: js.Function2[
      /* arg1 */ A, 
      /* callback */ js.Function2[/* err */ js.Any, /* data */ T, Unit], 
      Unit
    ]
  ): js.Function1[/* arg1 */ A, typings.rsvp.mod.RSVP.Promise[T]] = js.native
  @JSImport("ember", "default.RSVP.denodeify")
  @js.native
  def denodeify[T, A, K1 /* <: java.lang.String */](
    nodeFunc: js.Function2[
      /* arg1 */ A, 
      /* callback */ js.Function2[/* err */ js.Any, /* data */ T, Unit], 
      Unit
    ],
    options: js.Array[K1]
  ): js.Function1[
    /* arg1 */ A, 
    typings.rsvp.mod.RSVP.Promise[
      /* import warning: importer.ImportType#apply c Unsupported type mapping: 
  {[ K in K1 ]: T}
    */ typings.ember.emberStrings.denodeify with TopLevel[js.Any]
    ]
  ] = js.native
  @JSImport("ember", "default.RSVP.denodeify")
  @js.native
  def denodeify[T1, T2, A, K1 /* <: java.lang.String */, K2 /* <: java.lang.String */](
    nodeFunc: js.Function2[
      /* arg1 */ A, 
      /* callback */ js.Function3[/* err */ js.Any, /* data1 */ T1, /* data2 */ T2, Unit], 
      Unit
    ],
    options: js.Tuple2[K1, K2]
  ): js.Function1[
    /* arg1 */ A, 
    typings.rsvp.mod.RSVP.Promise[typings.ember.emberStrings.denodeify with TopLevel[js.Any]]
  ] = js.native
  @JSImport("ember", "default.RSVP.denodeify")
  @js.native
  def denodeify[T1, T2, T3, A, K1 /* <: java.lang.String */, K2 /* <: java.lang.String */, K3 /* <: java.lang.String */](
    nodeFunc: js.Function2[
      /* arg1 */ A, 
      /* callback */ js.Function4[/* err */ js.Any, /* data1 */ T1, /* data2 */ T2, /* data3 */ T3, Unit], 
      Unit
    ],
    options: js.Tuple3[K1, K2, K3]
  ): js.Function1[
    /* arg1 */ A, 
    typings.rsvp.mod.RSVP.Promise[typings.ember.emberStrings.denodeify with TopLevel[js.Any]]
  ] = js.native
  @JSImport("ember", "default.RSVP.denodeify")
  @js.native
  def denodeify_T1T2A[T1, T2, A](
    nodeFunc: js.Function2[
      /* arg1 */ A, 
      /* callback */ js.Function3[/* err */ js.Any, /* data1 */ T1, /* data2 */ T2, Unit], 
      Unit
    ]
  ): js.Function1[/* arg1 */ A, typings.rsvp.mod.RSVP.Promise[T1]] = js.native
  // ----- denodeify ----- //
  // Here be absurd things because we don't have variadic types. All of
  // this will go away if we can ever write this:
  //
  //     denodeify<...T, ...A>(
  //         nodeFunc: (...args: ...A, callback: (err: any, ...cbArgs: ...T) => any) => void,
  //         options?: false
  //     ): (...args: ...A) => RSVP.Promise<...T>
  // That day, however, may never come. So, in the meantime, we do this.
  @JSImport("ember", "default.RSVP.denodeify")
  @js.native
  def denodeify_T1T2T3A[T1, T2, T3, A](
    nodeFunc: js.Function2[
      /* arg1 */ A, 
      /* callback */ js.Function4[/* err */ js.Any, /* data1 */ T1, /* data2 */ T2, /* data3 */ T3, Unit], 
      Unit
    ]
  ): js.Function1[/* arg1 */ A, typings.rsvp.mod.RSVP.Promise[T1]] = js.native
  @JSImport("ember", "default.RSVP.denodeify")
  @js.native
  def denodeify_false[T, A](
    nodeFunc: js.Function2[
      /* arg1 */ A, 
      /* callback */ js.Function2[/* err */ js.Any, /* data */ T, Unit], 
      Unit
    ],
    options: `false`
  ): js.Function1[/* arg1 */ A, typings.rsvp.mod.RSVP.Promise[T]] = js.native
  @JSImport("ember", "default.RSVP.denodeify")
  @js.native
  def denodeify_false_T1T2A[T1, T2, A](
    nodeFunc: js.Function2[
      /* arg1 */ A, 
      /* callback */ js.Function3[/* err */ js.Any, /* data1 */ T1, /* data2 */ T2, Unit], 
      Unit
    ],
    options: `false`
  ): js.Function1[/* arg1 */ A, typings.rsvp.mod.RSVP.Promise[T1]] = js.native
  @JSImport("ember", "default.RSVP.denodeify")
  @js.native
  def denodeify_false_T1T2T3A[T1, T2, T3, A](
    nodeFunc: js.Function2[
      /* arg1 */ A, 
      /* callback */ js.Function4[/* err */ js.Any, /* data1 */ T1, /* data2 */ T2, /* data3 */ T3, Unit], 
      Unit
    ],
    options: `false`
  ): js.Function1[/* arg1 */ A, typings.rsvp.mod.RSVP.Promise[T1]] = js.native
  @JSImport("ember", "default.RSVP.denodeify")
  @js.native
  def denodeify_true[T, A](
    nodeFunc: js.Function2[
      /* arg1 */ A, 
      /* callback */ js.Function2[/* err */ js.Any, /* data */ T, Unit], 
      Unit
    ],
    options: `true`
  ): js.Function1[/* arg1 */ A, typings.rsvp.mod.RSVP.Promise[js.Array[T]]] = js.native
  @JSImport("ember", "default.RSVP.denodeify")
  @js.native
  def denodeify_true_T1T2A[T1, T2, A](
    nodeFunc: js.Function2[
      /* arg1 */ A, 
      /* callback */ js.Function3[/* err */ js.Any, /* data1 */ T1, /* data2 */ T2, Unit], 
      Unit
    ],
    options: `true`
  ): js.Function1[/* arg1 */ A, typings.rsvp.mod.RSVP.Promise[js.Tuple2[T1, T2]]] = js.native
  @JSImport("ember", "default.RSVP.denodeify")
  @js.native
  def denodeify_true_T1T2T3A[T1, T2, T3, A](
    nodeFunc: js.Function2[
      /* arg1 */ A, 
      /* callback */ js.Function4[/* err */ js.Any, /* data1 */ T1, /* data2 */ T2, /* data3 */ T3, Unit], 
      Unit
    ],
    options: `true`
  ): js.Function1[/* arg1 */ A, typings.rsvp.mod.RSVP.Promise[js.Tuple3[T1, T2, T3]]] = js.native
  
  @JSImport("ember", "default.RSVP.filter")
  @js.native
  def filter[T](entries: js.Array[Arg[T]], filterFn: js.Function1[/* item */ T, Boolean]): typings.rsvp.mod.RSVP.Promise[js.Array[T]] = js.native
  @JSImport("ember", "default.RSVP.filter")
  @js.native
  def filter[T](entries: js.Array[Arg[T]], filterFn: js.Function1[/* item */ T, Boolean], label: java.lang.String): typings.rsvp.mod.RSVP.Promise[js.Array[T]] = js.native
  @JSImport("ember", "default.RSVP.filter")
  @js.native
  def filter[T1, T2](entries: js.Tuple2[Arg[T1], Arg[T2]], filterFn: js.Function1[/* item */ T1 | T2, Boolean]): typings.rsvp.mod.RSVP.Promise[js.Array[T1 | T2]] = js.native
  @JSImport("ember", "default.RSVP.filter")
  @js.native
  def filter[T1, T2](
    entries: js.Tuple2[Arg[T1], Arg[T2]],
    filterFn: js.Function1[/* item */ T1 | T2, Boolean],
    label: java.lang.String
  ): typings.rsvp.mod.RSVP.Promise[js.Array[T1 | T2]] = js.native
  @JSImport("ember", "default.RSVP.filter")
  @js.native
  def filter[T1, T2, T3](
    entries: js.Tuple3[Arg[T1], Arg[T2], Arg[T3]],
    filterFn: js.Function1[/* item */ T1 | T2 | T3, Boolean]
  ): typings.rsvp.mod.RSVP.Promise[js.Array[T1 | T2 | T3]] = js.native
  @JSImport("ember", "default.RSVP.filter")
  @js.native
  def filter[T1, T2, T3](
    entries: js.Tuple3[Arg[T1], Arg[T2], Arg[T3]],
    filterFn: js.Function1[/* item */ T1 | T2 | T3, Boolean],
    label: java.lang.String
  ): typings.rsvp.mod.RSVP.Promise[js.Array[T1 | T2 | T3]] = js.native
  @JSImport("ember", "default.RSVP.filter")
  @js.native
  def filter[T1, T2, T3, T4](
    entries: js.Tuple4[Arg[T1], Arg[T2], Arg[T3], Arg[T4]],
    filterFn: js.Function1[/* item */ T1 | T2 | T3 | T4, Boolean]
  ): typings.rsvp.mod.RSVP.Promise[js.Array[T1 | T2 | T3 | T4]] = js.native
  @JSImport("ember", "default.RSVP.filter")
  @js.native
  def filter[T1, T2, T3, T4](
    entries: js.Tuple4[Arg[T1], Arg[T2], Arg[T3], Arg[T4]],
    filterFn: js.Function1[/* item */ T1 | T2 | T3 | T4, Boolean],
    label: java.lang.String
  ): typings.rsvp.mod.RSVP.Promise[js.Array[T1 | T2 | T3 | T4]] = js.native
  @JSImport("ember", "default.RSVP.filter")
  @js.native
  def filter[T1, T2, T3, T4, T5](
    entries: js.Tuple5[Arg[T1], Arg[T2], Arg[T3], Arg[T4], Arg[T5]],
    filterFn: js.Function1[/* item */ T1 | T2 | T3 | T4 | T5, Boolean]
  ): typings.rsvp.mod.RSVP.Promise[js.Array[T1 | T2 | T3 | T4 | T5]] = js.native
  @JSImport("ember", "default.RSVP.filter")
  @js.native
  def filter[T1, T2, T3, T4, T5](
    entries: js.Tuple5[Arg[T1], Arg[T2], Arg[T3], Arg[T4], Arg[T5]],
    filterFn: js.Function1[/* item */ T1 | T2 | T3 | T4 | T5, Boolean],
    label: java.lang.String
  ): typings.rsvp.mod.RSVP.Promise[js.Array[T1 | T2 | T3 | T4 | T5]] = js.native
  @JSImport("ember", "default.RSVP.filter")
  @js.native
  def filter[T1, T2, T3, T4, T5, T6](
    entries: js.Tuple6[Arg[T1], Arg[T2], Arg[T3], Arg[T4], Arg[T5], Arg[T6]],
    filterFn: js.Function1[/* item */ T1 | T2 | T3 | T4 | T5 | T6, Boolean]
  ): typings.rsvp.mod.RSVP.Promise[(js.Array[T1 | T2 | T3 | T4 | T5 | T6]) with `3`] = js.native
  @JSImport("ember", "default.RSVP.filter")
  @js.native
  def filter[T1, T2, T3, T4, T5, T6](
    entries: js.Tuple6[Arg[T1], Arg[T2], Arg[T3], Arg[T4], Arg[T5], Arg[T6]],
    filterFn: js.Function1[/* item */ T1 | T2 | T3 | T4 | T5 | T6, Boolean],
    label: java.lang.String
  ): typings.rsvp.mod.RSVP.Promise[(js.Array[T1 | T2 | T3 | T4 | T5 | T6]) with `3`] = js.native
  @JSImport("ember", "default.RSVP.filter")
  @js.native
  def filter[T1, T2, T3, T4, T5, T6, T7](
    entries: js.Tuple7[Arg[T1], Arg[T2], Arg[T3], Arg[T4], Arg[T5], Arg[T6], Arg[T7]],
    filterFn: js.Function1[/* item */ T1 | T2 | T3 | T4 | T5 | T6 | T7, Boolean]
  ): typings.rsvp.mod.RSVP.Promise[js.Array[T1 | T2 | T3 | T4 | T5 | T6 | T7]] = js.native
  @JSImport("ember", "default.RSVP.filter")
  @js.native
  def filter[T1, T2, T3, T4, T5, T6, T7](
    entries: js.Tuple7[Arg[T1], Arg[T2], Arg[T3], Arg[T4], Arg[T5], Arg[T6], Arg[T7]],
    filterFn: js.Function1[/* item */ T1 | T2 | T3 | T4 | T5 | T6 | T7, Boolean],
    label: java.lang.String
  ): typings.rsvp.mod.RSVP.Promise[js.Array[T1 | T2 | T3 | T4 | T5 | T6 | T7]] = js.native
  @JSImport("ember", "default.RSVP.filter")
  @js.native
  def filter[T1, T2, T3, T4, T5, T6, T7, T8](
    entries: js.Tuple8[Arg[T1], Arg[T2], Arg[T3], Arg[T4], Arg[T5], Arg[T6], Arg[T7], Arg[T8]],
    filterFn: js.Function1[/* item */ T1 | T2 | T3 | T4 | T5 | T6 | T7 | T8, Boolean]
  ): typings.rsvp.mod.RSVP.Promise[js.Array[T1 | T2 | T3 | T4 | T5 | T6 | T7 | T8]] = js.native
  @JSImport("ember", "default.RSVP.filter")
  @js.native
  def filter[T1, T2, T3, T4, T5, T6, T7, T8](
    entries: js.Tuple8[Arg[T1], Arg[T2], Arg[T3], Arg[T4], Arg[T5], Arg[T6], Arg[T7], Arg[T8]],
    filterFn: js.Function1[/* item */ T1 | T2 | T3 | T4 | T5 | T6 | T7 | T8, Boolean],
    label: java.lang.String
  ): typings.rsvp.mod.RSVP.Promise[js.Array[T1 | T2 | T3 | T4 | T5 | T6 | T7 | T8]] = js.native
  @JSImport("ember", "default.RSVP.filter")
  @js.native
  def filter[T1, T2, T3, T4, T5, T6, T7, T8, T9](
    entries: js.Tuple9[Arg[T1], Arg[T2], Arg[T3], Arg[T4], Arg[T5], Arg[T6], Arg[T7], Arg[T8], Arg[T9]],
    filterFn: js.Function1[/* item */ T1 | T2 | T3 | T4 | T5 | T6 | T7 | T8 | T9, Boolean]
  ): typings.rsvp.mod.RSVP.Promise[js.Array[T1 | T2 | T3 | T4 | T5 | T6 | T7 | T8 | T9]] = js.native
  @JSImport("ember", "default.RSVP.filter")
  @js.native
  def filter[T1, T2, T3, T4, T5, T6, T7, T8, T9](
    entries: js.Tuple9[Arg[T1], Arg[T2], Arg[T3], Arg[T4], Arg[T5], Arg[T6], Arg[T7], Arg[T8], Arg[T9]],
    filterFn: js.Function1[/* item */ T1 | T2 | T3 | T4 | T5 | T6 | T7 | T8 | T9, Boolean],
    label: java.lang.String
  ): typings.rsvp.mod.RSVP.Promise[js.Array[T1 | T2 | T3 | T4 | T5 | T6 | T7 | T8 | T9]] = js.native
  @JSImport("ember", "default.RSVP.filter")
  @js.native
  def filter[T1, T2, T3, T4, T5, T6, T7, T8, T9, T10](
    entries: js.Tuple10[Arg[T1], Arg[T2], Arg[T3], Arg[T4], Arg[T5], Arg[T6], Arg[T7], Arg[T8], Arg[T9], Arg[T10]],
    filterFn: js.Function1[/* item */ T1 | T2 | T3 | T4 | T5 | T6 | T7 | T8 | T9 | T10, Boolean]
  ): typings.rsvp.mod.RSVP.Promise[js.Array[T1 | T2 | T3 | T4 | T5 | T6 | T7 | T8 | T9 | T10]] = js.native
  @JSImport("ember", "default.RSVP.filter")
  @js.native
  def filter[T1, T2, T3, T4, T5, T6, T7, T8, T9, T10](
    entries: js.Tuple10[Arg[T1], Arg[T2], Arg[T3], Arg[T4], Arg[T5], Arg[T6], Arg[T7], Arg[T8], Arg[T9], Arg[T10]],
    filterFn: js.Function1[/* item */ T1 | T2 | T3 | T4 | T5 | T6 | T7 | T8 | T9 | T10, Boolean],
    label: java.lang.String
  ): typings.rsvp.mod.RSVP.Promise[js.Array[T1 | T2 | T3 | T4 | T5 | T6 | T7 | T8 | T9 | T10]] = js.native
  
  // ----- hash and hashSettled ----- //
  @JSImport("ember", "default.RSVP.hash")
  @js.native
  def hash[T](
    `object`: /* import warning: importer.ImportType#apply c Unsupported type mapping: 
  {[ P in keyof T ]: rsvp.rsvp.RSVP.Arg<T[P]>}
    */ typings.ember.emberStrings.hash with TopLevel[T]
  ): typings.rsvp.mod.RSVP.Promise[T] = js.native
  @JSImport("ember", "default.RSVP.hash")
  @js.native
  def hash[T](
    `object`: /* import warning: importer.ImportType#apply c Unsupported type mapping: 
  {[ P in keyof T ]: rsvp.rsvp.RSVP.Arg<T[P]>}
    */ typings.ember.emberStrings.hash with TopLevel[T],
    label: java.lang.String
  ): typings.rsvp.mod.RSVP.Promise[T] = js.native
  
  @JSImport("ember", "default.RSVP.hashSettled")
  @js.native
  def hashSettled[T](
    `object`: /* import warning: importer.ImportType#apply c Unsupported type mapping: 
  {[ P in keyof T ]: rsvp.rsvp.RSVP.Arg<T[P]>}
    */ typings.ember.emberStrings.hashSettled with TopLevel[T]
  ): typings.rsvp.mod.RSVP.Promise[
    /* import warning: importer.ImportType#apply c Unsupported type mapping: 
  {[ P in keyof T ]: rsvp.rsvp.RSVP.PromiseState<T[P]>}
    */ typings.ember.emberStrings.hashSettled with TopLevel[T]
  ] = js.native
  @JSImport("ember", "default.RSVP.hashSettled")
  @js.native
  def hashSettled[T](
    `object`: /* import warning: importer.ImportType#apply c Unsupported type mapping: 
  {[ P in keyof T ]: rsvp.rsvp.RSVP.Arg<T[P]>}
    */ typings.ember.emberStrings.hashSettled with TopLevel[T],
    label: java.lang.String
  ): typings.rsvp.mod.RSVP.Promise[
    /* import warning: importer.ImportType#apply c Unsupported type mapping: 
  {[ P in keyof T ]: rsvp.rsvp.RSVP.PromiseState<T[P]>}
    */ typings.ember.emberStrings.hashSettled with TopLevel[T]
  ] = js.native
  
  @JSImport("ember", "default.RSVP.map")
  @js.native
  def map[T, U](entries: js.Array[Arg[T]], mapFn: js.Function1[/* item */ T, U]): typings.rsvp.mod.RSVP.Promise[js.Array[U] with `8`] = js.native
  @JSImport("ember", "default.RSVP.map")
  @js.native
  def map[T, U](entries: js.Array[Arg[T]], mapFn: js.Function1[/* item */ T, U], label: java.lang.String): typings.rsvp.mod.RSVP.Promise[js.Array[U] with `8`] = js.native
  @JSImport("ember", "default.RSVP.map")
  @js.native
  def map[T1, T2, U](entries: js.Tuple2[Arg[T1], Arg[T2]], mapFn: js.Function1[/* item */ T1 | T2, U]): typings.rsvp.mod.RSVP.Promise[js.Array[U] with `7`] = js.native
  @JSImport("ember", "default.RSVP.map")
  @js.native
  def map[T1, T2, U](
    entries: js.Tuple2[Arg[T1], Arg[T2]],
    mapFn: js.Function1[/* item */ T1 | T2, U],
    label: java.lang.String
  ): typings.rsvp.mod.RSVP.Promise[js.Array[U] with `7`] = js.native
  @JSImport("ember", "default.RSVP.map")
  @js.native
  def map[T1, T2, T3, U](entries: js.Tuple3[Arg[T1], Arg[T2], Arg[T3]], mapFn: js.Function1[/* item */ T1 | T2 | T3, U]): typings.rsvp.mod.RSVP.Promise[js.Array[U] with `6`] = js.native
  @JSImport("ember", "default.RSVP.map")
  @js.native
  def map[T1, T2, T3, U](
    entries: js.Tuple3[Arg[T1], Arg[T2], Arg[T3]],
    mapFn: js.Function1[/* item */ T1 | T2 | T3, U],
    label: java.lang.String
  ): typings.rsvp.mod.RSVP.Promise[js.Array[U] with `6`] = js.native
  @JSImport("ember", "default.RSVP.map")
  @js.native
  def map[T1, T2, T3, T4, U](
    entries: js.Tuple4[Arg[T1], Arg[T2], Arg[T3], Arg[T4]],
    mapFn: js.Function1[/* item */ T1 | T2 | T3 | T4, U]
  ): typings.rsvp.mod.RSVP.Promise[js.Array[U] with `5`] = js.native
  @JSImport("ember", "default.RSVP.map")
  @js.native
  def map[T1, T2, T3, T4, U](
    entries: js.Tuple4[Arg[T1], Arg[T2], Arg[T3], Arg[T4]],
    mapFn: js.Function1[/* item */ T1 | T2 | T3 | T4, U],
    label: java.lang.String
  ): typings.rsvp.mod.RSVP.Promise[js.Array[U] with `5`] = js.native
  @JSImport("ember", "default.RSVP.map")
  @js.native
  def map[T1, T2, T3, T4, T5, U](
    entries: js.Tuple5[Arg[T1], Arg[T2], Arg[T3], Arg[T4], Arg[T5]],
    mapFn: js.Function1[/* item */ T1 | T2 | T3 | T4 | T5, U]
  ): typings.rsvp.mod.RSVP.Promise[js.Array[U] with `4`] = js.native
  @JSImport("ember", "default.RSVP.map")
  @js.native
  def map[T1, T2, T3, T4, T5, U](
    entries: js.Tuple5[Arg[T1], Arg[T2], Arg[T3], Arg[T4], Arg[T5]],
    mapFn: js.Function1[/* item */ T1 | T2 | T3 | T4 | T5, U],
    label: java.lang.String
  ): typings.rsvp.mod.RSVP.Promise[js.Array[U] with `4`] = js.native
  @JSImport("ember", "default.RSVP.map")
  @js.native
  def map[T1, T2, T3, T4, T5, T6, U](
    entries: js.Tuple6[Arg[T1], Arg[T2], Arg[T3], Arg[T4], Arg[T5], Arg[T6]],
    mapFn: js.Function1[/* item */ T1 | T2 | T3 | T4 | T5 | T6, U]
  ): typings.rsvp.mod.RSVP.Promise[js.Array[U] with `3`] = js.native
  @JSImport("ember", "default.RSVP.map")
  @js.native
  def map[T1, T2, T3, T4, T5, T6, U](
    entries: js.Tuple6[Arg[T1], Arg[T2], Arg[T3], Arg[T4], Arg[T5], Arg[T6]],
    mapFn: js.Function1[/* item */ T1 | T2 | T3 | T4 | T5 | T6, U],
    label: java.lang.String
  ): typings.rsvp.mod.RSVP.Promise[js.Array[U] with `3`] = js.native
  @JSImport("ember", "default.RSVP.map")
  @js.native
  def map[T1, T2, T3, T4, T5, T6, T7, U](
    entries: js.Tuple7[Arg[T1], Arg[T2], Arg[T3], Arg[T4], Arg[T5], Arg[T6], Arg[T7]],
    mapFn: js.Function1[/* item */ T1 | T2 | T3 | T4 | T5 | T6 | T7, U]
  ): typings.rsvp.mod.RSVP.Promise[js.Array[U] with `2`] = js.native
  @JSImport("ember", "default.RSVP.map")
  @js.native
  def map[T1, T2, T3, T4, T5, T6, T7, U](
    entries: js.Tuple7[Arg[T1], Arg[T2], Arg[T3], Arg[T4], Arg[T5], Arg[T6], Arg[T7]],
    mapFn: js.Function1[/* item */ T1 | T2 | T3 | T4 | T5 | T6 | T7, U],
    label: java.lang.String
  ): typings.rsvp.mod.RSVP.Promise[js.Array[U] with `2`] = js.native
  @JSImport("ember", "default.RSVP.map")
  @js.native
  def map[T1, T2, T3, T4, T5, T6, T7, T8, U](
    entries: js.Tuple8[Arg[T1], Arg[T2], Arg[T3], Arg[T4], Arg[T5], Arg[T6], Arg[T7], Arg[T8]],
    mapFn: js.Function1[/* item */ T1 | T2 | T3 | T4 | T5 | T6 | T7 | T8, U]
  ): typings.rsvp.mod.RSVP.Promise[js.Array[U] with `1`] = js.native
  @JSImport("ember", "default.RSVP.map")
  @js.native
  def map[T1, T2, T3, T4, T5, T6, T7, T8, U](
    entries: js.Tuple8[Arg[T1], Arg[T2], Arg[T3], Arg[T4], Arg[T5], Arg[T6], Arg[T7], Arg[T8]],
    mapFn: js.Function1[/* item */ T1 | T2 | T3 | T4 | T5 | T6 | T7 | T8, U],
    label: java.lang.String
  ): typings.rsvp.mod.RSVP.Promise[js.Array[U] with `1`] = js.native
  @JSImport("ember", "default.RSVP.map")
  @js.native
  def map[T1, T2, T3, T4, T5, T6, T7, T8, T9, U](
    entries: js.Tuple9[Arg[T1], Arg[T2], Arg[T3], Arg[T4], Arg[T5], Arg[T6], Arg[T7], Arg[T8], Arg[T9]],
    mapFn: js.Function1[/* item */ T1 | T2 | T3 | T4 | T5 | T6 | T7 | T8 | T9, U]
  ): typings.rsvp.mod.RSVP.Promise[js.Array[U] with `0`] = js.native
  @JSImport("ember", "default.RSVP.map")
  @js.native
  def map[T1, T2, T3, T4, T5, T6, T7, T8, T9, U](
    entries: js.Tuple9[Arg[T1], Arg[T2], Arg[T3], Arg[T4], Arg[T5], Arg[T6], Arg[T7], Arg[T8], Arg[T9]],
    mapFn: js.Function1[/* item */ T1 | T2 | T3 | T4 | T5 | T6 | T7 | T8 | T9, U],
    label: java.lang.String
  ): typings.rsvp.mod.RSVP.Promise[js.Array[U] with `0`] = js.native
  @JSImport("ember", "default.RSVP.map")
  @js.native
  def map[T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, U](
    entries: js.Tuple10[Arg[T1], Arg[T2], Arg[T3], Arg[T4], Arg[T5], Arg[T6], Arg[T7], Arg[T8], Arg[T9], Arg[T10]],
    mapFn: js.Function1[/* item */ T1 | T2 | T3 | T4 | T5 | T6 | T7 | T8 | T9 | T10, U]
  ): typings.rsvp.mod.RSVP.Promise[js.Array[U] with Length] = js.native
  @JSImport("ember", "default.RSVP.map")
  @js.native
  def map[T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, U](
    entries: js.Tuple10[Arg[T1], Arg[T2], Arg[T3], Arg[T4], Arg[T5], Arg[T6], Arg[T7], Arg[T8], Arg[T9], Arg[T10]],
    mapFn: js.Function1[/* item */ T1 | T2 | T3 | T4 | T5 | T6 | T7 | T8 | T9 | T10, U],
    label: java.lang.String
  ): typings.rsvp.mod.RSVP.Promise[js.Array[U] with Length] = js.native
  
  /**
    * You can use `off` to stop firing a particular callback for an event.
    *
    * If you don't pass a `callback` argument to `off`, ALL callbacks for the
    * event will not be executed when the event fires.
    */
  /* static member */
  /* was `typeof EventTarget.off` */
  @JSImport("ember", "default.RSVP.off")
  @js.native
  def off(eventName: java.lang.String): Unit = js.native
  @JSImport("ember", "default.RSVP.off")
  @js.native
  def off(eventName: java.lang.String, callback: js.Function1[/* value */ js.Any, Unit]): Unit = js.native
  
  /* static member */
  /* was `typeof EventTarget.on` */
  @JSImport("ember", "default.RSVP.on")
  @js.native
  def on(eventName: java.lang.String, callback: js.Function1[/* value */ js.Any, Unit]): Unit = js.native
  @JSImport("ember", "default.RSVP.on")
  @js.native
  def on_chained(eventName: chained, listener: js.Function1[/* event */ InstrumentEvent, Unit]): Unit = js.native
  /** Registers a callback to be executed when `eventName` is triggered */
  /* static member */
  /* was `typeof EventTarget.on` */
  @JSImport("ember", "default.RSVP.on")
  @js.native
  def on_created(eventName: created, listener: js.Function1[/* event */ InstrumentEvent, Unit]): Unit = js.native
  /* static member */
  /* was `typeof EventTarget.on` */
  @JSImport("ember", "default.RSVP.on")
  @js.native
  def on_error(eventName: error, errorHandler: js.Function1[/* reason */ js.Any, Unit]): Unit = js.native
  @JSImport("ember", "default.RSVP.on")
  @js.native
  def on_fulfilled(eventName: fulfilled, listener: js.Function1[/* event */ InstrumentEvent, Unit]): Unit = js.native
  @JSImport("ember", "default.RSVP.on")
  @js.native
  def on_rejected(eventName: rejected, listener: js.Function1[/* event */ InstrumentEvent, Unit]): Unit = js.native
  
  /* static member */
  /* was `typeof Promise.race` */
  @JSImport("ember", "default.RSVP.race")
  @js.native
  def race[T](values: js.Array[Arg[T]]): typings.rsvp.mod.RSVP.Promise[T] = js.native
  @JSImport("ember", "default.RSVP.race")
  @js.native
  def race[T](values: js.Array[Arg[T]], label: java.lang.String): typings.rsvp.mod.RSVP.Promise[T] = js.native
  /* static member */
  /* was `typeof Promise.race` */
  @JSImport("ember", "default.RSVP.race")
  @js.native
  def race[T1, T2](values: js.Tuple2[Arg[T1], Arg[T2]]): typings.rsvp.mod.RSVP.Promise[T1 | T2] = js.native
  @JSImport("ember", "default.RSVP.race")
  @js.native
  def race[T1, T2](values: js.Tuple2[Arg[T1], Arg[T2]], label: java.lang.String): typings.rsvp.mod.RSVP.Promise[T1 | T2] = js.native
  /* static member */
  /* was `typeof Promise.race` */
  @JSImport("ember", "default.RSVP.race")
  @js.native
  def race[T1, T2, T3](values: js.Tuple3[Arg[T1], Arg[T2], Arg[T3]]): typings.rsvp.mod.RSVP.Promise[T1 | T2 | T3] = js.native
  @JSImport("ember", "default.RSVP.race")
  @js.native
  def race[T1, T2, T3](values: js.Tuple3[Arg[T1], Arg[T2], Arg[T3]], label: java.lang.String): typings.rsvp.mod.RSVP.Promise[T1 | T2 | T3] = js.native
  /* static member */
  /* was `typeof Promise.race` */
  @JSImport("ember", "default.RSVP.race")
  @js.native
  def race[T1, T2, T3, T4](values: js.Tuple4[Arg[T1], Arg[T2], Arg[T3], Arg[T4]]): typings.rsvp.mod.RSVP.Promise[T1 | T2 | T3 | T4] = js.native
  @JSImport("ember", "default.RSVP.race")
  @js.native
  def race[T1, T2, T3, T4](values: js.Tuple4[Arg[T1], Arg[T2], Arg[T3], Arg[T4]], label: java.lang.String): typings.rsvp.mod.RSVP.Promise[T1 | T2 | T3 | T4] = js.native
  /* static member */
  /* was `typeof Promise.race` */
  @JSImport("ember", "default.RSVP.race")
  @js.native
  def race[T1, T2, T3, T4, T5](values: js.Tuple5[Arg[T1], Arg[T2], Arg[T3], Arg[T4], Arg[T5]]): typings.rsvp.mod.RSVP.Promise[T1 | T2 | T3 | T4 | T5] = js.native
  @JSImport("ember", "default.RSVP.race")
  @js.native
  def race[T1, T2, T3, T4, T5](values: js.Tuple5[Arg[T1], Arg[T2], Arg[T3], Arg[T4], Arg[T5]], label: java.lang.String): typings.rsvp.mod.RSVP.Promise[T1 | T2 | T3 | T4 | T5] = js.native
  /* static member */
  /* was `typeof Promise.race` */
  @JSImport("ember", "default.RSVP.race")
  @js.native
  def race[T1, T2, T3, T4, T5, T6](values: js.Tuple6[Arg[T1], Arg[T2], Arg[T3], Arg[T4], Arg[T5], Arg[T6]]): typings.rsvp.mod.RSVP.Promise[T1 | T2 | T3 | T4 | T5 | T6] = js.native
  @JSImport("ember", "default.RSVP.race")
  @js.native
  def race[T1, T2, T3, T4, T5, T6](values: js.Tuple6[Arg[T1], Arg[T2], Arg[T3], Arg[T4], Arg[T5], Arg[T6]], label: java.lang.String): typings.rsvp.mod.RSVP.Promise[T1 | T2 | T3 | T4 | T5 | T6] = js.native
  /* static member */
  /* was `typeof Promise.race` */
  @JSImport("ember", "default.RSVP.race")
  @js.native
  def race[T1, T2, T3, T4, T5, T6, T7](values: js.Tuple7[Arg[T1], Arg[T2], Arg[T3], Arg[T4], Arg[T5], Arg[T6], Arg[T7]]): typings.rsvp.mod.RSVP.Promise[T1 | T2 | T3 | T4 | T5 | T6 | T7] = js.native
  @JSImport("ember", "default.RSVP.race")
  @js.native
  def race[T1, T2, T3, T4, T5, T6, T7](
    values: js.Tuple7[Arg[T1], Arg[T2], Arg[T3], Arg[T4], Arg[T5], Arg[T6], Arg[T7]],
    label: java.lang.String
  ): typings.rsvp.mod.RSVP.Promise[T1 | T2 | T3 | T4 | T5 | T6 | T7] = js.native
  /* static member */
  /* was `typeof Promise.race` */
  @JSImport("ember", "default.RSVP.race")
  @js.native
  def race[T1, T2, T3, T4, T5, T6, T7, T8](values: js.Tuple8[Arg[T1], Arg[T2], Arg[T3], Arg[T4], Arg[T5], Arg[T6], Arg[T7], Arg[T8]]): typings.rsvp.mod.RSVP.Promise[T1 | T2 | T3 | T4 | T5 | T6 | T7 | T8] = js.native
  @JSImport("ember", "default.RSVP.race")
  @js.native
  def race[T1, T2, T3, T4, T5, T6, T7, T8](
    values: js.Tuple8[Arg[T1], Arg[T2], Arg[T3], Arg[T4], Arg[T5], Arg[T6], Arg[T7], Arg[T8]],
    label: java.lang.String
  ): typings.rsvp.mod.RSVP.Promise[T1 | T2 | T3 | T4 | T5 | T6 | T7 | T8] = js.native
  /* static member */
  /* was `typeof Promise.race` */
  @JSImport("ember", "default.RSVP.race")
  @js.native
  def race[T1, T2, T3, T4, T5, T6, T7, T8, T9](values: js.Tuple9[Arg[T1], Arg[T2], Arg[T3], Arg[T4], Arg[T5], Arg[T6], Arg[T7], Arg[T8], Arg[T9]]): typings.rsvp.mod.RSVP.Promise[T1 | T2 | T3 | T4 | T5 | T6 | T7 | T8 | T9] = js.native
  @JSImport("ember", "default.RSVP.race")
  @js.native
  def race[T1, T2, T3, T4, T5, T6, T7, T8, T9](
    values: js.Tuple9[Arg[T1], Arg[T2], Arg[T3], Arg[T4], Arg[T5], Arg[T6], Arg[T7], Arg[T8], Arg[T9]],
    label: java.lang.String
  ): typings.rsvp.mod.RSVP.Promise[T1 | T2 | T3 | T4 | T5 | T6 | T7 | T8 | T9] = js.native
  /* static member */
  /* was `typeof Promise.race` */
  @JSImport("ember", "default.RSVP.race")
  @js.native
  def race[T1, T2, T3, T4, T5, T6, T7, T8, T9, T10](
    values: js.Tuple10[
      Arg[T1], 
      Arg[T2], 
      Arg[T3], 
      Arg[T4], 
      Arg[T5], 
      Arg[T6], 
      Arg[T7], 
      Arg[T8], 
      Arg[T9], 
      T10 | js.Thenable[T10]
    ]
  ): typings.rsvp.mod.RSVP.Promise[T1 | T2 | T3 | T4 | T5 | T6 | T7 | T8 | T9 | T10] = js.native
  @JSImport("ember", "default.RSVP.race")
  @js.native
  def race[T1, T2, T3, T4, T5, T6, T7, T8, T9, T10](
    values: js.Tuple10[
      Arg[T1], 
      Arg[T2], 
      Arg[T3], 
      Arg[T4], 
      Arg[T5], 
      Arg[T6], 
      Arg[T7], 
      Arg[T8], 
      Arg[T9], 
      T10 | js.Thenable[T10]
    ],
    label: java.lang.String
  ): typings.rsvp.mod.RSVP.Promise[T1 | T2 | T3 | T4 | T5 | T6 | T7 | T8 | T9 | T10] = js.native
  
  /* static member */
  /* was `typeof Promise.reject` */
  @JSImport("ember", "default.RSVP.reject")
  @js.native
  def reject(): typings.rsvp.mod.RSVP.Promise[scala.Nothing] = js.native
  @JSImport("ember", "default.RSVP.reject")
  @js.native
  def reject(reason: js.UndefOr[scala.Nothing], label: java.lang.String): typings.rsvp.mod.RSVP.Promise[scala.Nothing] = js.native
  @JSImport("ember", "default.RSVP.reject")
  @js.native
  def reject(reason: js.Any): typings.rsvp.mod.RSVP.Promise[scala.Nothing] = js.native
  @JSImport("ember", "default.RSVP.reject")
  @js.native
  def reject(reason: js.Any, label: java.lang.String): typings.rsvp.mod.RSVP.Promise[scala.Nothing] = js.native
  
  /* static member */
  /* was `typeof Promise.resolve` */
  @JSImport("ember", "default.RSVP.resolve")
  @js.native
  def resolve(): typings.rsvp.mod.RSVP.Promise[Unit] = js.native
  @JSImport("ember", "default.RSVP.resolve")
  @js.native
  def resolve[T](value: js.UndefOr[Arg[T]], label: java.lang.String): typings.rsvp.mod.RSVP.Promise[T] = js.native
  @JSImport("ember", "default.RSVP.resolve")
  @js.native
  def resolve[T](value: Arg[T]): typings.rsvp.mod.RSVP.Promise[T] = js.native
  /* static member */
  /* was `typeof Promise.resolve` */
  @JSImport("ember", "default.RSVP.resolve")
  @js.native
  def resolve_T[T](): typings.rsvp.mod.RSVP.Promise[T] = js.native
  
  @JSImport("ember", "default.RSVP.rethrow")
  @js.native
  def rethrow(reason: js.Any): Unit = js.native
}
