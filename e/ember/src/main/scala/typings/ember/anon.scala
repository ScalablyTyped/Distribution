package typings.ember

import org.scalablytyped.runtime.Instantiable0
import org.scalablytyped.runtime.Instantiable1
import typings.ember.emberStrings.chained
import typings.ember.emberStrings.created
import typings.ember.emberStrings.error
import typings.ember.emberStrings.fulfilled
import typings.ember.emberStrings.rejected
import typings.emberObject.anon.Id
import typings.emberObject.anon.Until
import typings.emberObject.computedMod.ComputedProperty
import typings.rsvp.mod.RSVP.Arg
import typings.rsvp.mod.RSVP.InstrumentEvent
import typings.rsvp.mod.RSVP.ObjectWithEventMixins
import typings.rsvp.mod.default.EventTarget
import typings.rsvp.mod.default.Promise
import typings.std.Iterable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobalScope
@js.native
object anon extends js.Object {
  @js.native
  trait FnCall extends js.Object {
    def apply[T](values: js.Array[T | js.Thenable[T]]): js.Promise[js.Array[T]] = js.native
    def apply[T](values: Iterable[T | js.Thenable[T]]): js.Promise[js.Array[T]] = js.native
    def apply[T1, T2](values: js.Tuple2[T1 | js.Thenable[T1], T2 | js.Thenable[T2]]): js.Promise[js.Tuple2[T1, T2]] = js.native
    def apply[T1, T2, T3](values: js.Tuple3[T1 | js.Thenable[T1], T2 | js.Thenable[T2], T3 | js.Thenable[T3]]): js.Promise[js.Tuple3[T1, T2, T3]] = js.native
    def apply[T1, T2, T3, T4](
      values: js.Tuple4[T1 | js.Thenable[T1], T2 | js.Thenable[T2], T3 | js.Thenable[T3], T4 | js.Thenable[T4]]
    ): js.Promise[js.Tuple4[T1, T2, T3, T4]] = js.native
    def apply[T1, T2, T3, T4, T5](
      values: js.Tuple5[
          T1 | js.Thenable[T1], 
          T2 | js.Thenable[T2], 
          T3 | js.Thenable[T3], 
          T4 | js.Thenable[T4], 
          T5 | js.Thenable[T5]
        ]
    ): js.Promise[js.Tuple5[T1, T2, T3, T4, T5]] = js.native
    def apply[T1, T2, T3, T4, T5, T6](
      values: js.Tuple6[
          T1 | js.Thenable[T1], 
          T2 | js.Thenable[T2], 
          T3 | js.Thenable[T3], 
          T4 | js.Thenable[T4], 
          T5 | js.Thenable[T5], 
          T6 | js.Thenable[T6]
        ]
    ): js.Promise[js.Tuple6[T1, T2, T3, T4, T5, T6]] = js.native
    def apply[T1, T2, T3, T4, T5, T6, T7](
      values: js.Tuple7[
          T1 | js.Thenable[T1], 
          T2 | js.Thenable[T2], 
          T3 | js.Thenable[T3], 
          T4 | js.Thenable[T4], 
          T5 | js.Thenable[T5], 
          T6 | js.Thenable[T6], 
          T7 | js.Thenable[T7]
        ]
    ): js.Promise[js.Tuple7[T1, T2, T3, T4, T5, T6, T7]] = js.native
    def apply[T1, T2, T3, T4, T5, T6, T7, T8](
      values: js.Tuple8[
          T1 | js.Thenable[T1], 
          T2 | js.Thenable[T2], 
          T3 | js.Thenable[T3], 
          T4 | js.Thenable[T4], 
          T5 | js.Thenable[T5], 
          T6 | js.Thenable[T6], 
          T7 | js.Thenable[T7], 
          T8 | js.Thenable[T8]
        ]
    ): js.Promise[js.Tuple8[T1, T2, T3, T4, T5, T6, T7, T8]] = js.native
    def apply[T1, T2, T3, T4, T5, T6, T7, T8, T9](
      values: js.Tuple9[
          T1 | js.Thenable[T1], 
          T2 | js.Thenable[T2], 
          T3 | js.Thenable[T3], 
          T4 | js.Thenable[T4], 
          T5 | js.Thenable[T5], 
          T6 | js.Thenable[T6], 
          T7 | js.Thenable[T7], 
          T8 | js.Thenable[T8], 
          T9 | js.Thenable[T9]
        ]
    ): js.Promise[js.Tuple9[T1, T2, T3, T4, T5, T6, T7, T8, T9]] = js.native
    def apply[T1, T2, T3, T4, T5, T6, T7, T8, T9, T10](
      values: js.Tuple10[
          T1 | js.Thenable[T1], 
          T2 | js.Thenable[T2], 
          T3 | js.Thenable[T3], 
          T4 | js.Thenable[T4], 
          T5 | js.Thenable[T5], 
          T6 | js.Thenable[T6], 
          T7 | js.Thenable[T7], 
          T8 | js.Thenable[T8], 
          T9 | js.Thenable[T9], 
          T10 | js.Thenable[T10]
        ]
    ): js.Promise[js.Tuple10[T1, T2, T3, T4, T5, T6, T7, T8, T9, T10]] = js.native
  }
  
  @js.native
  trait FnCallCallbackArg extends js.Object {
    def apply[T, U](callback: js.Function1[/* callbackArg */ T, U], arg: T): Unit = js.native
  }
  
  @js.native
  trait FnCallDependentKeyAdditionalDependentKeysCallback extends js.Object {
    def apply(
      dependentKey: String,
      additionalDependentKeys: js.Array[String],
      callback: js.Function3[/* value */ js.Any, /* index */ Double, /* array */ js.Array[_], Boolean]
    ): ComputedProperty[js.Array[_], js.Array[_]] = js.native
    def apply(
      dependentKey: String,
      callback: js.Function3[/* value */ js.Any, /* index */ Double, /* array */ js.Array[_], Boolean]
    ): ComputedProperty[js.Array[_], js.Array[_]] = js.native
  }
  
  @js.native
  trait FnCallDependentKeyCallback extends js.Object {
    def apply[U](
      dependentKey: String,
      callback: js.Function3[/* value */ js.Any, /* index */ Double, /* array */ js.Array[_], U]
    ): ComputedProperty[js.Array[U], js.Array[U]] = js.native
  }
  
  @js.native
  trait FnCallDependentKeyOptions extends js.Object {
    def apply(dependentKey: String): ComputedProperty[_, _] = js.native
    def apply(dependentKey: String, options: Id): ComputedProperty[_, _] = js.native
    def apply(dependentKey: String, options: Until): ComputedProperty[_, _] = js.native
  }
  
  @js.native
  trait FnCallItemsKeyDependentKeysSortDefinition extends js.Object {
    def apply(itemsKey: String, dependentKeys: js.Array[String], sortDefinition: String): ComputedProperty[js.Array[_], js.Array[_]] = js.native
    def apply(
      itemsKey: String,
      dependentKeys: js.Array[String],
      sortDefinition: js.Function2[/* itemA */ js.Any, /* itemB */ js.Any, Double]
    ): ComputedProperty[js.Array[_], js.Array[_]] = js.native
    def apply(itemsKey: String, sortDefinition: String): ComputedProperty[js.Array[_], js.Array[_]] = js.native
    def apply(itemsKey: String, sortDefinition: js.Function2[/* itemA */ js.Any, /* itemB */ js.Any, Double]): ComputedProperty[js.Array[_], js.Array[_]] = js.native
  }
  
  @js.native
  trait FnCallReason extends js.Object {
    def apply[T](): js.Promise[T] = js.native
    def apply[T](reason: js.Any): js.Promise[T] = js.native
  }
  
  @js.native
  trait FnCallValue extends js.Object {
    def apply(): js.Promise[Unit] = js.native
    def apply[T](value: T): js.Promise[T] = js.native
    def apply[T](value: js.Thenable[T]): js.Promise[T] = js.native
  }
  
  @js.native
  trait FnCallValues extends js.Object {
    def apply[T](values: js.Array[T]): js.Promise[T] = js.native
    def apply[T](values: Iterable[T | js.Thenable[T]]): js.Promise[T] = js.native
  }
  
  @js.native
  trait TypeofEventTarget extends Instantiable0[EventTarget] {
    /** `RSVP.EventTarget.mixin` extends an object with EventTarget methods. */
    def mixin(`object`: js.Object): ObjectWithEventMixins = js.native
    /**
      * You can use `off` to stop firing a particular callback for an event.
      *
      * If you don't pass a `callback` argument to `off`, ALL callbacks for the
      * event will not be executed when the event fires.
      */
    def off(eventName: String): Unit = js.native
    def off(eventName: String, callback: js.Function1[/* value */ js.Any, Unit]): Unit = js.native
    def on(eventName: String, callback: js.Function1[/* value */ js.Any, Unit]): Unit = js.native
    @JSName("on")
    def on_chained(eventName: chained, listener: js.Function1[/* event */ InstrumentEvent, Unit]): Unit = js.native
    /** Registers a callback to be executed when `eventName` is triggered */
    @JSName("on")
    def on_created(eventName: created, listener: js.Function1[/* event */ InstrumentEvent, Unit]): Unit = js.native
    @JSName("on")
    def on_error(eventName: error, errorHandler: js.Function1[/* reason */ js.Any, Unit]): Unit = js.native
    @JSName("on")
    def on_fulfilled(eventName: fulfilled, listener: js.Function1[/* event */ InstrumentEvent, Unit]): Unit = js.native
    @JSName("on")
    def on_rejected(eventName: rejected, listener: js.Function1[/* event */ InstrumentEvent, Unit]): Unit = js.native
    /**
      * Use `trigger` to fire custom events.
      *
      * You can also pass a value as a second argument to `trigger` that will be
      * passed as an argument to all event listeners for the event
      */
    def trigger(eventName: String): Unit = js.native
    def trigger(eventName: String, options: js.Any): Unit = js.native
    def trigger(eventName: String, options: js.Any, label: String): Unit = js.native
  }
  
  @js.native
  trait TypeofPromise
    extends Instantiable1[
          /* executor */ js.Function2[
            /* resolve */ js.Function1[
              /* value */ js.UndefOr[Arg[/* import warning: RewrittenClass.unapply cls was tparam T */ js.Any]], 
              Unit
            ], 
            /* reject */ js.Function1[/* reason */ js.UndefOr[js.Any], Unit], 
            Unit
          ], 
          Promise[js.Object]
        ] {
    /**
      * @deprecated
      */
    var cast: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof RSVP.Promise.resolve */ js.Any = js.native
    def all[T](values: js.Array[Arg[T]]): typings.rsvp.mod.RSVP.Promise[js.Array[T]] = js.native
    def all[T](values: js.Array[Arg[T]], label: String): typings.rsvp.mod.RSVP.Promise[js.Array[T]] = js.native
    def all[T1, T2](values: js.Tuple2[Arg[T1], Arg[T2]]): typings.rsvp.mod.RSVP.Promise[js.Tuple2[T1, T2]] = js.native
    def all[T1, T2](values: js.Tuple2[Arg[T1], Arg[T2]], label: String): typings.rsvp.mod.RSVP.Promise[js.Tuple2[T1, T2]] = js.native
    def all[T1, T2, T3](values: js.Tuple3[Arg[T1], Arg[T2], Arg[T3]]): typings.rsvp.mod.RSVP.Promise[js.Tuple3[T1, T2, T3]] = js.native
    def all[T1, T2, T3](values: js.Tuple3[Arg[T1], Arg[T2], Arg[T3]], label: String): typings.rsvp.mod.RSVP.Promise[js.Tuple3[T1, T2, T3]] = js.native
    def all[T1, T2, T3, T4](values: js.Tuple4[Arg[T1], Arg[T2], Arg[T3], Arg[T4]]): typings.rsvp.mod.RSVP.Promise[js.Tuple4[T1, T2, T3, T4]] = js.native
    def all[T1, T2, T3, T4](values: js.Tuple4[Arg[T1], Arg[T2], Arg[T3], Arg[T4]], label: String): typings.rsvp.mod.RSVP.Promise[js.Tuple4[T1, T2, T3, T4]] = js.native
    def all[T1, T2, T3, T4, T5](values: js.Tuple5[Arg[T1], Arg[T2], Arg[T3], Arg[T4], Arg[T5]]): typings.rsvp.mod.RSVP.Promise[js.Tuple5[T1, T2, T3, T4, T5]] = js.native
    def all[T1, T2, T3, T4, T5](values: js.Tuple5[Arg[T1], Arg[T2], Arg[T3], Arg[T4], Arg[T5]], label: String): typings.rsvp.mod.RSVP.Promise[js.Tuple5[T1, T2, T3, T4, T5]] = js.native
    def all[T1, T2, T3, T4, T5, T6](values: js.Tuple6[Arg[T1], Arg[T2], Arg[T3], Arg[T4], Arg[T5], Arg[T6]]): typings.rsvp.mod.RSVP.Promise[js.Tuple6[T1, T2, T3, T4, T5, T6]] = js.native
    def all[T1, T2, T3, T4, T5, T6](values: js.Tuple6[Arg[T1], Arg[T2], Arg[T3], Arg[T4], Arg[T5], Arg[T6]], label: String): typings.rsvp.mod.RSVP.Promise[js.Tuple6[T1, T2, T3, T4, T5, T6]] = js.native
    def all[T1, T2, T3, T4, T5, T6, T7](values: js.Tuple7[Arg[T1], Arg[T2], Arg[T3], Arg[T4], Arg[T5], Arg[T6], Arg[T7]]): typings.rsvp.mod.RSVP.Promise[js.Tuple7[T1, T2, T3, T4, T5, T6, T7]] = js.native
    def all[T1, T2, T3, T4, T5, T6, T7](values: js.Tuple7[Arg[T1], Arg[T2], Arg[T3], Arg[T4], Arg[T5], Arg[T6], Arg[T7]], label: String): typings.rsvp.mod.RSVP.Promise[js.Tuple7[T1, T2, T3, T4, T5, T6, T7]] = js.native
    def all[T1, T2, T3, T4, T5, T6, T7, T8](values: js.Tuple8[Arg[T1], Arg[T2], Arg[T3], Arg[T4], Arg[T5], Arg[T6], Arg[T7], Arg[T8]]): typings.rsvp.mod.RSVP.Promise[js.Tuple8[T1, T2, T3, T4, T5, T6, T7, T8]] = js.native
    def all[T1, T2, T3, T4, T5, T6, T7, T8](
      values: js.Tuple8[Arg[T1], Arg[T2], Arg[T3], Arg[T4], Arg[T5], Arg[T6], Arg[T7], Arg[T8]],
      label: String
    ): typings.rsvp.mod.RSVP.Promise[js.Tuple8[T1, T2, T3, T4, T5, T6, T7, T8]] = js.native
    def all[T1, T2, T3, T4, T5, T6, T7, T8, T9](values: js.Tuple9[Arg[T1], Arg[T2], Arg[T3], Arg[T4], Arg[T5], Arg[T6], Arg[T7], Arg[T8], Arg[T9]]): typings.rsvp.mod.RSVP.Promise[js.Tuple9[T1, T2, T3, T4, T5, T6, T7, T8, T9]] = js.native
    def all[T1, T2, T3, T4, T5, T6, T7, T8, T9](
      values: js.Tuple9[Arg[T1], Arg[T2], Arg[T3], Arg[T4], Arg[T5], Arg[T6], Arg[T7], Arg[T8], Arg[T9]],
      label: String
    ): typings.rsvp.mod.RSVP.Promise[js.Tuple9[T1, T2, T3, T4, T5, T6, T7, T8, T9]] = js.native
    def all[T1, T2, T3, T4, T5, T6, T7, T8, T9, T10](
      values: js.Tuple10[Arg[T1], Arg[T2], Arg[T3], Arg[T4], Arg[T5], Arg[T6], Arg[T7], Arg[T8], Arg[T9], Arg[T10]]
    ): typings.rsvp.mod.RSVP.Promise[js.Tuple10[T1, T2, T3, T4, T5, T6, T7, T8, T9, T10]] = js.native
    def all[T1, T2, T3, T4, T5, T6, T7, T8, T9, T10](
      values: js.Tuple10[Arg[T1], Arg[T2], Arg[T3], Arg[T4], Arg[T5], Arg[T6], Arg[T7], Arg[T8], Arg[T9], Arg[T10]],
      label: String
    ): typings.rsvp.mod.RSVP.Promise[js.Tuple10[T1, T2, T3, T4, T5, T6, T7, T8, T9, T10]] = js.native
    def race[T](values: js.Array[Arg[T]]): typings.rsvp.mod.RSVP.Promise[T] = js.native
    def race[T](values: js.Array[Arg[T]], label: String): typings.rsvp.mod.RSVP.Promise[T] = js.native
    def race[T1, T2](values: js.Tuple2[Arg[T1], Arg[T2]]): typings.rsvp.mod.RSVP.Promise[T1 | T2] = js.native
    def race[T1, T2](values: js.Tuple2[Arg[T1], Arg[T2]], label: String): typings.rsvp.mod.RSVP.Promise[T1 | T2] = js.native
    def race[T1, T2, T3](values: js.Tuple3[Arg[T1], Arg[T2], Arg[T3]]): typings.rsvp.mod.RSVP.Promise[T1 | T2 | T3] = js.native
    def race[T1, T2, T3](values: js.Tuple3[Arg[T1], Arg[T2], Arg[T3]], label: String): typings.rsvp.mod.RSVP.Promise[T1 | T2 | T3] = js.native
    def race[T1, T2, T3, T4](values: js.Tuple4[Arg[T1], Arg[T2], Arg[T3], Arg[T4]]): typings.rsvp.mod.RSVP.Promise[T1 | T2 | T3 | T4] = js.native
    def race[T1, T2, T3, T4](values: js.Tuple4[Arg[T1], Arg[T2], Arg[T3], Arg[T4]], label: String): typings.rsvp.mod.RSVP.Promise[T1 | T2 | T3 | T4] = js.native
    def race[T1, T2, T3, T4, T5](values: js.Tuple5[Arg[T1], Arg[T2], Arg[T3], Arg[T4], Arg[T5]]): typings.rsvp.mod.RSVP.Promise[T1 | T2 | T3 | T4 | T5] = js.native
    def race[T1, T2, T3, T4, T5](values: js.Tuple5[Arg[T1], Arg[T2], Arg[T3], Arg[T4], Arg[T5]], label: String): typings.rsvp.mod.RSVP.Promise[T1 | T2 | T3 | T4 | T5] = js.native
    def race[T1, T2, T3, T4, T5, T6](values: js.Tuple6[Arg[T1], Arg[T2], Arg[T3], Arg[T4], Arg[T5], Arg[T6]]): typings.rsvp.mod.RSVP.Promise[T1 | T2 | T3 | T4 | T5 | T6] = js.native
    def race[T1, T2, T3, T4, T5, T6](values: js.Tuple6[Arg[T1], Arg[T2], Arg[T3], Arg[T4], Arg[T5], Arg[T6]], label: String): typings.rsvp.mod.RSVP.Promise[T1 | T2 | T3 | T4 | T5 | T6] = js.native
    def race[T1, T2, T3, T4, T5, T6, T7](values: js.Tuple7[Arg[T1], Arg[T2], Arg[T3], Arg[T4], Arg[T5], Arg[T6], Arg[T7]]): typings.rsvp.mod.RSVP.Promise[T1 | T2 | T3 | T4 | T5 | T6 | T7] = js.native
    def race[T1, T2, T3, T4, T5, T6, T7](values: js.Tuple7[Arg[T1], Arg[T2], Arg[T3], Arg[T4], Arg[T5], Arg[T6], Arg[T7]], label: String): typings.rsvp.mod.RSVP.Promise[T1 | T2 | T3 | T4 | T5 | T6 | T7] = js.native
    def race[T1, T2, T3, T4, T5, T6, T7, T8](values: js.Tuple8[Arg[T1], Arg[T2], Arg[T3], Arg[T4], Arg[T5], Arg[T6], Arg[T7], Arg[T8]]): typings.rsvp.mod.RSVP.Promise[T1 | T2 | T3 | T4 | T5 | T6 | T7 | T8] = js.native
    def race[T1, T2, T3, T4, T5, T6, T7, T8](
      values: js.Tuple8[Arg[T1], Arg[T2], Arg[T3], Arg[T4], Arg[T5], Arg[T6], Arg[T7], Arg[T8]],
      label: String
    ): typings.rsvp.mod.RSVP.Promise[T1 | T2 | T3 | T4 | T5 | T6 | T7 | T8] = js.native
    def race[T1, T2, T3, T4, T5, T6, T7, T8, T9](values: js.Tuple9[Arg[T1], Arg[T2], Arg[T3], Arg[T4], Arg[T5], Arg[T6], Arg[T7], Arg[T8], Arg[T9]]): typings.rsvp.mod.RSVP.Promise[T1 | T2 | T3 | T4 | T5 | T6 | T7 | T8 | T9] = js.native
    def race[T1, T2, T3, T4, T5, T6, T7, T8, T9](
      values: js.Tuple9[Arg[T1], Arg[T2], Arg[T3], Arg[T4], Arg[T5], Arg[T6], Arg[T7], Arg[T8], Arg[T9]],
      label: String
    ): typings.rsvp.mod.RSVP.Promise[T1 | T2 | T3 | T4 | T5 | T6 | T7 | T8 | T9] = js.native
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
      label: String
    ): typings.rsvp.mod.RSVP.Promise[T1 | T2 | T3 | T4 | T5 | T6 | T7 | T8 | T9 | T10] = js.native
    def reject(): typings.rsvp.mod.RSVP.Promise[scala.Nothing] = js.native
    def reject(reason: js.Any): typings.rsvp.mod.RSVP.Promise[scala.Nothing] = js.native
    def reject(reason: js.Any, label: String): typings.rsvp.mod.RSVP.Promise[scala.Nothing] = js.native
    def resolve(): typings.rsvp.mod.RSVP.Promise[Unit] = js.native
    def resolve[T](value: Arg[T]): typings.rsvp.mod.RSVP.Promise[T] = js.native
    def resolve[T](value: Arg[T], label: String): typings.rsvp.mod.RSVP.Promise[T] = js.native
    @JSName("resolve")
    def resolve_T[T](): typings.rsvp.mod.RSVP.Promise[T] = js.native
  }
  
}

