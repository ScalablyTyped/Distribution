package typings.ember.emberMod.Ember

import typings.ember.TypeofClassEventTarget
import typings.ember.TypeofClassPromise
import typings.ember.emberNumbers.`false`
import typings.ember.emberNumbers.`true`
import typings.ember.emberStrings.`_backtick^_backtick`
import typings.rsvp.Anon_1
import typings.rsvp.Anon_10
import typings.rsvp.Anon_2
import typings.rsvp.Anon_3
import typings.rsvp.Anon_4
import typings.rsvp.Anon_5
import typings.rsvp.Anon_6
import typings.rsvp.Anon_7
import typings.rsvp.Anon_8
import typings.rsvp.Anon_9
import typings.rsvp.rsvpMod.RSVP.Arg
import typings.rsvp.rsvpMod.RSVP.Deferred
import typings.rsvp.rsvpMod.RSVP.PromiseState
import typings.std.Iterable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("ember", "Ember.RSVP")
@js.native
object RSVP extends js.Object {
  var EventTarget: TypeofClassEventTarget = js.native
  var Promise: TypeofClassPromise = js.native
  val cast: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof Promise.cast */ js.Any = js.native
  val off: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof EventTarget.off */ js.Any = js.native
  val on: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof EventTarget.on */ js.Any = js.native
  def all[T](values: js.Array[T | js.Thenable[T]]): js.Promise[js.Array[T]] = js.native
  def all[TAll](values: Iterable[TAll | js.Thenable[TAll]]): js.Promise[js.Array[TAll]] = js.native
  def all[T1, T2](values: js.Tuple2[T1 | js.Thenable[T1], T2 | js.Thenable[T2]]): js.Promise[js.Tuple2[T1, T2]] = js.native
  def all[T1, T2, T3](values: js.Tuple3[T1 | js.Thenable[T1], T2 | js.Thenable[T2], T3 | js.Thenable[T3]]): js.Promise[js.Tuple3[T1, T2, T3]] = js.native
  def all[T1, T2, T3, T4](
    values: js.Tuple4[T1 | js.Thenable[T1], T2 | js.Thenable[T2], T3 | js.Thenable[T3], T4 | js.Thenable[T4]]
  ): js.Promise[js.Tuple4[T1, T2, T3, T4]] = js.native
  def all[T1, T2, T3, T4, T5](
    values: js.Tuple5[
      T1 | js.Thenable[T1], 
      T2 | js.Thenable[T2], 
      T3 | js.Thenable[T3], 
      T4 | js.Thenable[T4], 
      T5 | js.Thenable[T5]
    ]
  ): js.Promise[js.Tuple5[T1, T2, T3, T4, T5]] = js.native
  def all[T1, T2, T3, T4, T5, T6](
    values: js.Tuple6[
      T1 | js.Thenable[T1], 
      T2 | js.Thenable[T2], 
      T3 | js.Thenable[T3], 
      T4 | js.Thenable[T4], 
      T5 | js.Thenable[T5], 
      T6 | js.Thenable[T6]
    ]
  ): js.Promise[js.Tuple6[T1, T2, T3, T4, T5, T6]] = js.native
  def all[T1, T2, T3, T4, T5, T6, T7](
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
  def all[T1, T2, T3, T4, T5, T6, T7, T8](
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
  def all[T1, T2, T3, T4, T5, T6, T7, T8, T9](
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
  def all[T1, T2, T3, T4, T5, T6, T7, T8, T9, T10](
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
  def allSettled[T](entries: js.Array[Arg[T]]): typings.rsvp.rsvpMod.RSVP.Promise[js.Array[PromiseState[T]]] = js.native
  def allSettled[T](entries: js.Array[Arg[T]], label: java.lang.String): typings.rsvp.rsvpMod.RSVP.Promise[js.Array[PromiseState[T]]] = js.native
  def allSettled[T1, T2](entries: js.Tuple2[Arg[T1], Arg[T2]]): typings.rsvp.rsvpMod.RSVP.Promise[js.Tuple2[PromiseState[T1], PromiseState[T2]]] = js.native
  def allSettled[T1, T2](entries: js.Tuple2[Arg[T1], Arg[T2]], label: java.lang.String): typings.rsvp.rsvpMod.RSVP.Promise[js.Tuple2[PromiseState[T1], PromiseState[T2]]] = js.native
  def allSettled[T1, T2, T3](entries: js.Tuple3[Arg[T1], Arg[T2], Arg[T3]]): typings.rsvp.rsvpMod.RSVP.Promise[js.Tuple3[PromiseState[T1], PromiseState[T2], PromiseState[T3]]] = js.native
  def allSettled[T1, T2, T3](entries: js.Tuple3[Arg[T1], Arg[T2], Arg[T3]], label: java.lang.String): typings.rsvp.rsvpMod.RSVP.Promise[js.Tuple3[PromiseState[T1], PromiseState[T2], PromiseState[T3]]] = js.native
  def allSettled[T1, T2, T3, T4](entries: js.Tuple4[Arg[T1], Arg[T2], Arg[T3], Arg[T4]]): typings.rsvp.rsvpMod.RSVP.Promise[
    js.Tuple4[PromiseState[T1], PromiseState[T2], PromiseState[T3], PromiseState[T4]]
  ] = js.native
  def allSettled[T1, T2, T3, T4](entries: js.Tuple4[Arg[T1], Arg[T2], Arg[T3], Arg[T4]], label: java.lang.String): typings.rsvp.rsvpMod.RSVP.Promise[
    js.Tuple4[PromiseState[T1], PromiseState[T2], PromiseState[T3], PromiseState[T4]]
  ] = js.native
  def allSettled[T1, T2, T3, T4, T5](entries: js.Tuple5[Arg[T1], Arg[T2], Arg[T3], Arg[T4], Arg[T5]]): typings.rsvp.rsvpMod.RSVP.Promise[
    js.Tuple5[PromiseState[T1], PromiseState[T2], PromiseState[T3], PromiseState[T4], PromiseState[T5]]
  ] = js.native
  def allSettled[T1, T2, T3, T4, T5](entries: js.Tuple5[Arg[T1], Arg[T2], Arg[T3], Arg[T4], Arg[T5]], label: java.lang.String): typings.rsvp.rsvpMod.RSVP.Promise[
    js.Tuple5[PromiseState[T1], PromiseState[T2], PromiseState[T3], PromiseState[T4], PromiseState[T5]]
  ] = js.native
  def allSettled[T1, T2, T3, T4, T5, T6](entries: js.Tuple6[Arg[T1], Arg[T2], Arg[T3], Arg[T4], Arg[T5], Arg[T6]]): typings.rsvp.rsvpMod.RSVP.Promise[
    js.Tuple6[
      PromiseState[T1], 
      PromiseState[T2], 
      PromiseState[T3], 
      PromiseState[T4], 
      PromiseState[T5], 
      PromiseState[T6]
    ]
  ] = js.native
  def allSettled[T1, T2, T3, T4, T5, T6](entries: js.Tuple6[Arg[T1], Arg[T2], Arg[T3], Arg[T4], Arg[T5], Arg[T6]], label: java.lang.String): typings.rsvp.rsvpMod.RSVP.Promise[
    js.Tuple6[
      PromiseState[T1], 
      PromiseState[T2], 
      PromiseState[T3], 
      PromiseState[T4], 
      PromiseState[T5], 
      PromiseState[T6]
    ]
  ] = js.native
  def allSettled[T1, T2, T3, T4, T5, T6, T7](entries: js.Tuple7[Arg[T1], Arg[T2], Arg[T3], Arg[T4], Arg[T5], Arg[T6], Arg[T7]]): typings.rsvp.rsvpMod.RSVP.Promise[
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
  def allSettled[T1, T2, T3, T4, T5, T6, T7](
    entries: js.Tuple7[Arg[T1], Arg[T2], Arg[T3], Arg[T4], Arg[T5], Arg[T6], Arg[T7]],
    label: java.lang.String
  ): typings.rsvp.rsvpMod.RSVP.Promise[
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
  def allSettled[T1, T2, T3, T4, T5, T6, T7, T8](entries: js.Tuple8[Arg[T1], Arg[T2], Arg[T3], Arg[T4], Arg[T5], Arg[T6], Arg[T7], Arg[T8]]): typings.rsvp.rsvpMod.RSVP.Promise[
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
  def allSettled[T1, T2, T3, T4, T5, T6, T7, T8](
    entries: js.Tuple8[Arg[T1], Arg[T2], Arg[T3], Arg[T4], Arg[T5], Arg[T6], Arg[T7], Arg[T8]],
    label: java.lang.String
  ): typings.rsvp.rsvpMod.RSVP.Promise[
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
  def allSettled[T1, T2, T3, T4, T5, T6, T7, T8, T9](
    entries: js.Tuple9[Arg[T1], Arg[T2], Arg[T3], Arg[T4], Arg[T5], Arg[T6], Arg[T7], Arg[T8], Arg[T9]]
  ): typings.rsvp.rsvpMod.RSVP.Promise[
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
  def allSettled[T1, T2, T3, T4, T5, T6, T7, T8, T9](
    entries: js.Tuple9[Arg[T1], Arg[T2], Arg[T3], Arg[T4], Arg[T5], Arg[T6], Arg[T7], Arg[T8], Arg[T9]],
    label: java.lang.String
  ): typings.rsvp.rsvpMod.RSVP.Promise[
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
  def allSettled[T1, T2, T3, T4, T5, T6, T7, T8, T9, T10](
    entries: js.Tuple10[Arg[T1], Arg[T2], Arg[T3], Arg[T4], Arg[T5], Arg[T6], Arg[T7], Arg[T8], Arg[T9], Arg[T10]]
  ): typings.rsvp.rsvpMod.RSVP.Promise[
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
  def allSettled[T1, T2, T3, T4, T5, T6, T7, T8, T9, T10](
    entries: js.Tuple10[Arg[T1], Arg[T2], Arg[T3], Arg[T4], Arg[T5], Arg[T6], Arg[T7], Arg[T8], Arg[T9], Arg[T10]],
    label: java.lang.String
  ): typings.rsvp.rsvpMod.RSVP.Promise[
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
  def asap[T, U](callback: js.Function1[/* callbackArg */ T, U], arg: T): Unit = js.native
  def async[T, U](callback: js.Function1[/* callbackArg */ T, U], arg: T): Unit = js.native
  def configure[T](name: java.lang.String): T = js.native
  def configure[T](name: java.lang.String, value: T): Unit = js.native
  def defer[T](): Deferred[T] = js.native
  def defer[T](label: java.lang.String): Deferred[T] = js.native
  def denodeify[T, A](
    nodeFunc: js.Function2[
      /* arg1 */ A, 
      /* callback */ js.Function2[/* err */ js.Any, /* data */ T, Unit], 
      Unit
    ]
  ): js.Function1[/* arg1 */ A, typings.rsvp.rsvpMod.RSVP.Promise[T]] = js.native
  def denodeify[T, A, K1 /* <: java.lang.String */](
    nodeFunc: js.Function2[
      /* arg1 */ A, 
      /* callback */ js.Function2[/* err */ js.Any, /* data */ T, Unit], 
      Unit
    ],
    options: js.Array[K1]
  ): js.Function1[
    /* arg1 */ A, 
    typings.rsvp.rsvpMod.RSVP.Promise[
      /* import warning: importer.ImportType#apply c Unsupported type mapping: 
  {[ K in K1 ]: T}
    */ `_backtick^_backtick` with js.Any
    ]
  ] = js.native
  def denodeify[T1, T2, A, K1 /* <: java.lang.String */, K2 /* <: java.lang.String */](
    nodeFunc: js.Function2[
      /* arg1 */ A, 
      /* callback */ js.Function3[/* err */ js.Any, /* data1 */ T1, /* data2 */ T2, Unit], 
      Unit
    ],
    options: js.Tuple2[K1, K2]
  ): js.Function1[/* arg1 */ A, typings.rsvp.rsvpMod.RSVP.Promise[`_backtick^_backtick` with js.Any]] = js.native
  def denodeify[T1, T2, T3, A, K1 /* <: java.lang.String */, K2 /* <: java.lang.String */, K3 /* <: java.lang.String */](
    nodeFunc: js.Function2[
      /* arg1 */ A, 
      /* callback */ js.Function4[/* err */ js.Any, /* data1 */ T1, /* data2 */ T2, /* data3 */ T3, Unit], 
      Unit
    ],
    options: js.Tuple3[K1, K2, K3]
  ): js.Function1[/* arg1 */ A, typings.rsvp.rsvpMod.RSVP.Promise[`_backtick^_backtick` with js.Any]] = js.native
  @JSName("denodeify")
  def denodeify_T1T2A[T1, T2, A](
    nodeFunc: js.Function2[
      /* arg1 */ A, 
      /* callback */ js.Function3[/* err */ js.Any, /* data1 */ T1, /* data2 */ T2, Unit], 
      Unit
    ]
  ): js.Function1[/* arg1 */ A, typings.rsvp.rsvpMod.RSVP.Promise[T1]] = js.native
  // ----- denodeify ----- //
  // Here be absurd things because we don't have variadic types. All of
  // this will go away if we can ever write this:
  //
  //     denodeify<...T, ...A>(
  //         nodeFunc: (...args: ...A, callback: (err: any, ...cbArgs: ...T) => any) => void,
  //         options?: false
  //     ): (...args: ...A) => RSVP.Promise<...T>
  // That day, however, may never come. So, in the meantime, we do this.
  @JSName("denodeify")
  def denodeify_T1T2T3A[T1, T2, T3, A](
    nodeFunc: js.Function2[
      /* arg1 */ A, 
      /* callback */ js.Function4[/* err */ js.Any, /* data1 */ T1, /* data2 */ T2, /* data3 */ T3, Unit], 
      Unit
    ]
  ): js.Function1[/* arg1 */ A, typings.rsvp.rsvpMod.RSVP.Promise[T1]] = js.native
  @JSName("denodeify")
  def denodeify_false[T, A](
    nodeFunc: js.Function2[
      /* arg1 */ A, 
      /* callback */ js.Function2[/* err */ js.Any, /* data */ T, Unit], 
      Unit
    ],
    options: `false`
  ): js.Function1[/* arg1 */ A, typings.rsvp.rsvpMod.RSVP.Promise[T]] = js.native
  @JSName("denodeify")
  def denodeify_false_T1T2A[T1, T2, A](
    nodeFunc: js.Function2[
      /* arg1 */ A, 
      /* callback */ js.Function3[/* err */ js.Any, /* data1 */ T1, /* data2 */ T2, Unit], 
      Unit
    ],
    options: `false`
  ): js.Function1[/* arg1 */ A, typings.rsvp.rsvpMod.RSVP.Promise[T1]] = js.native
  @JSName("denodeify")
  def denodeify_false_T1T2T3A[T1, T2, T3, A](
    nodeFunc: js.Function2[
      /* arg1 */ A, 
      /* callback */ js.Function4[/* err */ js.Any, /* data1 */ T1, /* data2 */ T2, /* data3 */ T3, Unit], 
      Unit
    ],
    options: `false`
  ): js.Function1[/* arg1 */ A, typings.rsvp.rsvpMod.RSVP.Promise[T1]] = js.native
  @JSName("denodeify")
  def denodeify_true[T, A](
    nodeFunc: js.Function2[
      /* arg1 */ A, 
      /* callback */ js.Function2[/* err */ js.Any, /* data */ T, Unit], 
      Unit
    ],
    options: `true`
  ): js.Function1[/* arg1 */ A, typings.rsvp.rsvpMod.RSVP.Promise[js.Array[T]]] = js.native
  @JSName("denodeify")
  def denodeify_true_T1T2A[T1, T2, A](
    nodeFunc: js.Function2[
      /* arg1 */ A, 
      /* callback */ js.Function3[/* err */ js.Any, /* data1 */ T1, /* data2 */ T2, Unit], 
      Unit
    ],
    options: `true`
  ): js.Function1[/* arg1 */ A, typings.rsvp.rsvpMod.RSVP.Promise[js.Tuple2[T1, T2]]] = js.native
  @JSName("denodeify")
  def denodeify_true_T1T2T3A[T1, T2, T3, A](
    nodeFunc: js.Function2[
      /* arg1 */ A, 
      /* callback */ js.Function4[/* err */ js.Any, /* data1 */ T1, /* data2 */ T2, /* data3 */ T3, Unit], 
      Unit
    ],
    options: `true`
  ): js.Function1[/* arg1 */ A, typings.rsvp.rsvpMod.RSVP.Promise[js.Tuple3[T1, T2, T3]]] = js.native
  def filter[T](entries: js.Array[Arg[T]], filterFn: js.Function1[/* item */ T, Boolean]): typings.rsvp.rsvpMod.RSVP.Promise[js.Array[T]] = js.native
  def filter[T](entries: js.Array[Arg[T]], filterFn: js.Function1[/* item */ T, Boolean], label: java.lang.String): typings.rsvp.rsvpMod.RSVP.Promise[js.Array[T]] = js.native
  def filter[T1, T2](entries: js.Tuple2[Arg[T1], Arg[T2]], filterFn: js.Function1[/* item */ T1 | T2, Boolean]): typings.rsvp.rsvpMod.RSVP.Promise[js.Array[T1 | T2]] = js.native
  def filter[T1, T2](
    entries: js.Tuple2[Arg[T1], Arg[T2]],
    filterFn: js.Function1[/* item */ T1 | T2, Boolean],
    label: java.lang.String
  ): typings.rsvp.rsvpMod.RSVP.Promise[js.Array[T1 | T2]] = js.native
  def filter[T1, T2, T3](
    entries: js.Tuple3[Arg[T1], Arg[T2], Arg[T3]],
    filterFn: js.Function1[/* item */ T1 | T2 | T3, Boolean]
  ): typings.rsvp.rsvpMod.RSVP.Promise[js.Array[T1 | T2 | T3]] = js.native
  def filter[T1, T2, T3](
    entries: js.Tuple3[Arg[T1], Arg[T2], Arg[T3]],
    filterFn: js.Function1[/* item */ T1 | T2 | T3, Boolean],
    label: java.lang.String
  ): typings.rsvp.rsvpMod.RSVP.Promise[js.Array[T1 | T2 | T3]] = js.native
  def filter[T1, T2, T3, T4](
    entries: js.Tuple4[Arg[T1], Arg[T2], Arg[T3], Arg[T4]],
    filterFn: js.Function1[/* item */ T1 | T2 | T3 | T4, Boolean]
  ): typings.rsvp.rsvpMod.RSVP.Promise[js.Array[T1 | T2 | T3 | T4]] = js.native
  def filter[T1, T2, T3, T4](
    entries: js.Tuple4[Arg[T1], Arg[T2], Arg[T3], Arg[T4]],
    filterFn: js.Function1[/* item */ T1 | T2 | T3 | T4, Boolean],
    label: java.lang.String
  ): typings.rsvp.rsvpMod.RSVP.Promise[js.Array[T1 | T2 | T3 | T4]] = js.native
  def filter[T1, T2, T3, T4, T5](
    entries: js.Tuple5[Arg[T1], Arg[T2], Arg[T3], Arg[T4], Arg[T5]],
    filterFn: js.Function1[/* item */ T1 | T2 | T3 | T4 | T5, Boolean]
  ): typings.rsvp.rsvpMod.RSVP.Promise[js.Array[T1 | T2 | T3 | T4 | T5]] = js.native
  def filter[T1, T2, T3, T4, T5](
    entries: js.Tuple5[Arg[T1], Arg[T2], Arg[T3], Arg[T4], Arg[T5]],
    filterFn: js.Function1[/* item */ T1 | T2 | T3 | T4 | T5, Boolean],
    label: java.lang.String
  ): typings.rsvp.rsvpMod.RSVP.Promise[js.Array[T1 | T2 | T3 | T4 | T5]] = js.native
  def filter[T1, T2, T3, T4, T5, T6](
    entries: js.Tuple6[Arg[T1], Arg[T2], Arg[T3], Arg[T4], Arg[T5], Arg[T6]],
    filterFn: js.Function1[/* item */ T1 | T2 | T3 | T4 | T5 | T6, Boolean]
  ): typings.rsvp.rsvpMod.RSVP.Promise[(js.Array[T1 | T2 | T3 | T4 | T5 | T6]) with Anon_6] = js.native
  def filter[T1, T2, T3, T4, T5, T6](
    entries: js.Tuple6[Arg[T1], Arg[T2], Arg[T3], Arg[T4], Arg[T5], Arg[T6]],
    filterFn: js.Function1[/* item */ T1 | T2 | T3 | T4 | T5 | T6, Boolean],
    label: java.lang.String
  ): typings.rsvp.rsvpMod.RSVP.Promise[(js.Array[T1 | T2 | T3 | T4 | T5 | T6]) with Anon_6] = js.native
  def filter[T1, T2, T3, T4, T5, T6, T7](
    entries: js.Tuple7[Arg[T1], Arg[T2], Arg[T3], Arg[T4], Arg[T5], Arg[T6], Arg[T7]],
    filterFn: js.Function1[/* item */ T1 | T2 | T3 | T4 | T5 | T6 | T7, Boolean]
  ): typings.rsvp.rsvpMod.RSVP.Promise[js.Array[T1 | T2 | T3 | T4 | T5 | T6 | T7]] = js.native
  def filter[T1, T2, T3, T4, T5, T6, T7](
    entries: js.Tuple7[Arg[T1], Arg[T2], Arg[T3], Arg[T4], Arg[T5], Arg[T6], Arg[T7]],
    filterFn: js.Function1[/* item */ T1 | T2 | T3 | T4 | T5 | T6 | T7, Boolean],
    label: java.lang.String
  ): typings.rsvp.rsvpMod.RSVP.Promise[js.Array[T1 | T2 | T3 | T4 | T5 | T6 | T7]] = js.native
  def filter[T1, T2, T3, T4, T5, T6, T7, T8](
    entries: js.Tuple8[Arg[T1], Arg[T2], Arg[T3], Arg[T4], Arg[T5], Arg[T6], Arg[T7], Arg[T8]],
    filterFn: js.Function1[/* item */ T1 | T2 | T3 | T4 | T5 | T6 | T7 | T8, Boolean]
  ): typings.rsvp.rsvpMod.RSVP.Promise[js.Array[T1 | T2 | T3 | T4 | T5 | T6 | T7 | T8]] = js.native
  def filter[T1, T2, T3, T4, T5, T6, T7, T8](
    entries: js.Tuple8[Arg[T1], Arg[T2], Arg[T3], Arg[T4], Arg[T5], Arg[T6], Arg[T7], Arg[T8]],
    filterFn: js.Function1[/* item */ T1 | T2 | T3 | T4 | T5 | T6 | T7 | T8, Boolean],
    label: java.lang.String
  ): typings.rsvp.rsvpMod.RSVP.Promise[js.Array[T1 | T2 | T3 | T4 | T5 | T6 | T7 | T8]] = js.native
  def filter[T1, T2, T3, T4, T5, T6, T7, T8, T9](
    entries: js.Tuple9[Arg[T1], Arg[T2], Arg[T3], Arg[T4], Arg[T5], Arg[T6], Arg[T7], Arg[T8], Arg[T9]],
    filterFn: js.Function1[/* item */ T1 | T2 | T3 | T4 | T5 | T6 | T7 | T8 | T9, Boolean]
  ): typings.rsvp.rsvpMod.RSVP.Promise[js.Array[T1 | T2 | T3 | T4 | T5 | T6 | T7 | T8 | T9]] = js.native
  def filter[T1, T2, T3, T4, T5, T6, T7, T8, T9](
    entries: js.Tuple9[Arg[T1], Arg[T2], Arg[T3], Arg[T4], Arg[T5], Arg[T6], Arg[T7], Arg[T8], Arg[T9]],
    filterFn: js.Function1[/* item */ T1 | T2 | T3 | T4 | T5 | T6 | T7 | T8 | T9, Boolean],
    label: java.lang.String
  ): typings.rsvp.rsvpMod.RSVP.Promise[js.Array[T1 | T2 | T3 | T4 | T5 | T6 | T7 | T8 | T9]] = js.native
  def filter[T1, T2, T3, T4, T5, T6, T7, T8, T9, T10](
    entries: js.Tuple10[Arg[T1], Arg[T2], Arg[T3], Arg[T4], Arg[T5], Arg[T6], Arg[T7], Arg[T8], Arg[T9], Arg[T10]],
    filterFn: js.Function1[/* item */ T1 | T2 | T3 | T4 | T5 | T6 | T7 | T8 | T9 | T10, Boolean]
  ): typings.rsvp.rsvpMod.RSVP.Promise[js.Array[T1 | T2 | T3 | T4 | T5 | T6 | T7 | T8 | T9 | T10]] = js.native
  def filter[T1, T2, T3, T4, T5, T6, T7, T8, T9, T10](
    entries: js.Tuple10[Arg[T1], Arg[T2], Arg[T3], Arg[T4], Arg[T5], Arg[T6], Arg[T7], Arg[T8], Arg[T9], Arg[T10]],
    filterFn: js.Function1[/* item */ T1 | T2 | T3 | T4 | T5 | T6 | T7 | T8 | T9 | T10, Boolean],
    label: java.lang.String
  ): typings.rsvp.rsvpMod.RSVP.Promise[js.Array[T1 | T2 | T3 | T4 | T5 | T6 | T7 | T8 | T9 | T10]] = js.native
  // ----- hash and hashSettled ----- //
  def hash[T](
    `object`: /* import warning: importer.ImportType#apply c Unsupported type mapping: 
  {[ P in keyof T ]: rsvp.rsvp.RSVP.Arg<T[P]>}
    */ `_backtick^_backtick` with T
  ): typings.rsvp.rsvpMod.RSVP.Promise[T] = js.native
  def hash[T](
    `object`: /* import warning: importer.ImportType#apply c Unsupported type mapping: 
  {[ P in keyof T ]: rsvp.rsvp.RSVP.Arg<T[P]>}
    */ `_backtick^_backtick` with T,
    label: java.lang.String
  ): typings.rsvp.rsvpMod.RSVP.Promise[T] = js.native
  def hashSettled[T](
    `object`: /* import warning: importer.ImportType#apply c Unsupported type mapping: 
  {[ P in keyof T ]: rsvp.rsvp.RSVP.Arg<T[P]>}
    */ `_backtick^_backtick` with T
  ): typings.rsvp.rsvpMod.RSVP.Promise[
    /* import warning: importer.ImportType#apply c Unsupported type mapping: 
  {[ P in keyof T ]: rsvp.rsvp.RSVP.PromiseState<T[P]>}
    */ `_backtick^_backtick` with T
  ] = js.native
  def hashSettled[T](
    `object`: /* import warning: importer.ImportType#apply c Unsupported type mapping: 
  {[ P in keyof T ]: rsvp.rsvp.RSVP.Arg<T[P]>}
    */ `_backtick^_backtick` with T,
    label: java.lang.String
  ): typings.rsvp.rsvpMod.RSVP.Promise[
    /* import warning: importer.ImportType#apply c Unsupported type mapping: 
  {[ P in keyof T ]: rsvp.rsvp.RSVP.PromiseState<T[P]>}
    */ `_backtick^_backtick` with T
  ] = js.native
  def map[T, U](entries: js.Array[Arg[T]], mapFn: js.Function1[/* item */ T, U]): typings.rsvp.rsvpMod.RSVP.Promise[js.Array[U] with Anon_1] = js.native
  def map[T, U](entries: js.Array[Arg[T]], mapFn: js.Function1[/* item */ T, U], label: java.lang.String): typings.rsvp.rsvpMod.RSVP.Promise[js.Array[U] with Anon_1] = js.native
  def map[T1, T2, U](entries: js.Tuple2[Arg[T1], Arg[T2]], mapFn: js.Function1[/* item */ T1 | T2, U]): typings.rsvp.rsvpMod.RSVP.Promise[js.Array[U] with Anon_2] = js.native
  def map[T1, T2, U](
    entries: js.Tuple2[Arg[T1], Arg[T2]],
    mapFn: js.Function1[/* item */ T1 | T2, U],
    label: java.lang.String
  ): typings.rsvp.rsvpMod.RSVP.Promise[js.Array[U] with Anon_2] = js.native
  def map[T1, T2, T3, U](entries: js.Tuple3[Arg[T1], Arg[T2], Arg[T3]], mapFn: js.Function1[/* item */ T1 | T2 | T3, U]): typings.rsvp.rsvpMod.RSVP.Promise[js.Array[U] with Anon_3] = js.native
  def map[T1, T2, T3, U](
    entries: js.Tuple3[Arg[T1], Arg[T2], Arg[T3]],
    mapFn: js.Function1[/* item */ T1 | T2 | T3, U],
    label: java.lang.String
  ): typings.rsvp.rsvpMod.RSVP.Promise[js.Array[U] with Anon_3] = js.native
  def map[T1, T2, T3, T4, U](
    entries: js.Tuple4[Arg[T1], Arg[T2], Arg[T3], Arg[T4]],
    mapFn: js.Function1[/* item */ T1 | T2 | T3 | T4, U]
  ): typings.rsvp.rsvpMod.RSVP.Promise[js.Array[U] with Anon_4] = js.native
  def map[T1, T2, T3, T4, U](
    entries: js.Tuple4[Arg[T1], Arg[T2], Arg[T3], Arg[T4]],
    mapFn: js.Function1[/* item */ T1 | T2 | T3 | T4, U],
    label: java.lang.String
  ): typings.rsvp.rsvpMod.RSVP.Promise[js.Array[U] with Anon_4] = js.native
  def map[T1, T2, T3, T4, T5, U](
    entries: js.Tuple5[Arg[T1], Arg[T2], Arg[T3], Arg[T4], Arg[T5]],
    mapFn: js.Function1[/* item */ T1 | T2 | T3 | T4 | T5, U]
  ): typings.rsvp.rsvpMod.RSVP.Promise[js.Array[U] with Anon_5] = js.native
  def map[T1, T2, T3, T4, T5, U](
    entries: js.Tuple5[Arg[T1], Arg[T2], Arg[T3], Arg[T4], Arg[T5]],
    mapFn: js.Function1[/* item */ T1 | T2 | T3 | T4 | T5, U],
    label: java.lang.String
  ): typings.rsvp.rsvpMod.RSVP.Promise[js.Array[U] with Anon_5] = js.native
  def map[T1, T2, T3, T4, T5, T6, U](
    entries: js.Tuple6[Arg[T1], Arg[T2], Arg[T3], Arg[T4], Arg[T5], Arg[T6]],
    mapFn: js.Function1[/* item */ T1 | T2 | T3 | T4 | T5 | T6, U]
  ): typings.rsvp.rsvpMod.RSVP.Promise[js.Array[U] with Anon_6] = js.native
  def map[T1, T2, T3, T4, T5, T6, U](
    entries: js.Tuple6[Arg[T1], Arg[T2], Arg[T3], Arg[T4], Arg[T5], Arg[T6]],
    mapFn: js.Function1[/* item */ T1 | T2 | T3 | T4 | T5 | T6, U],
    label: java.lang.String
  ): typings.rsvp.rsvpMod.RSVP.Promise[js.Array[U] with Anon_6] = js.native
  def map[T1, T2, T3, T4, T5, T6, T7, U](
    entries: js.Tuple7[Arg[T1], Arg[T2], Arg[T3], Arg[T4], Arg[T5], Arg[T6], Arg[T7]],
    mapFn: js.Function1[/* item */ T1 | T2 | T3 | T4 | T5 | T6 | T7, U]
  ): typings.rsvp.rsvpMod.RSVP.Promise[js.Array[U] with Anon_7] = js.native
  def map[T1, T2, T3, T4, T5, T6, T7, U](
    entries: js.Tuple7[Arg[T1], Arg[T2], Arg[T3], Arg[T4], Arg[T5], Arg[T6], Arg[T7]],
    mapFn: js.Function1[/* item */ T1 | T2 | T3 | T4 | T5 | T6 | T7, U],
    label: java.lang.String
  ): typings.rsvp.rsvpMod.RSVP.Promise[js.Array[U] with Anon_7] = js.native
  def map[T1, T2, T3, T4, T5, T6, T7, T8, U](
    entries: js.Tuple8[Arg[T1], Arg[T2], Arg[T3], Arg[T4], Arg[T5], Arg[T6], Arg[T7], Arg[T8]],
    mapFn: js.Function1[/* item */ T1 | T2 | T3 | T4 | T5 | T6 | T7 | T8, U]
  ): typings.rsvp.rsvpMod.RSVP.Promise[js.Array[U] with Anon_8] = js.native
  def map[T1, T2, T3, T4, T5, T6, T7, T8, U](
    entries: js.Tuple8[Arg[T1], Arg[T2], Arg[T3], Arg[T4], Arg[T5], Arg[T6], Arg[T7], Arg[T8]],
    mapFn: js.Function1[/* item */ T1 | T2 | T3 | T4 | T5 | T6 | T7 | T8, U],
    label: java.lang.String
  ): typings.rsvp.rsvpMod.RSVP.Promise[js.Array[U] with Anon_8] = js.native
  def map[T1, T2, T3, T4, T5, T6, T7, T8, T9, U](
    entries: js.Tuple9[Arg[T1], Arg[T2], Arg[T3], Arg[T4], Arg[T5], Arg[T6], Arg[T7], Arg[T8], Arg[T9]],
    mapFn: js.Function1[/* item */ T1 | T2 | T3 | T4 | T5 | T6 | T7 | T8 | T9, U]
  ): typings.rsvp.rsvpMod.RSVP.Promise[js.Array[U] with Anon_9] = js.native
  def map[T1, T2, T3, T4, T5, T6, T7, T8, T9, U](
    entries: js.Tuple9[Arg[T1], Arg[T2], Arg[T3], Arg[T4], Arg[T5], Arg[T6], Arg[T7], Arg[T8], Arg[T9]],
    mapFn: js.Function1[/* item */ T1 | T2 | T3 | T4 | T5 | T6 | T7 | T8 | T9, U],
    label: java.lang.String
  ): typings.rsvp.rsvpMod.RSVP.Promise[js.Array[U] with Anon_9] = js.native
  def map[T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, U](
    entries: js.Tuple10[Arg[T1], Arg[T2], Arg[T3], Arg[T4], Arg[T5], Arg[T6], Arg[T7], Arg[T8], Arg[T9], Arg[T10]],
    mapFn: js.Function1[/* item */ T1 | T2 | T3 | T4 | T5 | T6 | T7 | T8 | T9 | T10, U]
  ): typings.rsvp.rsvpMod.RSVP.Promise[js.Array[U] with Anon_10] = js.native
  def map[T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, U](
    entries: js.Tuple10[Arg[T1], Arg[T2], Arg[T3], Arg[T4], Arg[T5], Arg[T6], Arg[T7], Arg[T8], Arg[T9], Arg[T10]],
    mapFn: js.Function1[/* item */ T1 | T2 | T3 | T4 | T5 | T6 | T7 | T8 | T9 | T10, U],
    label: java.lang.String
  ): typings.rsvp.rsvpMod.RSVP.Promise[js.Array[U] with Anon_10] = js.native
  def race[T](values: js.Array[T]): js.Promise[T] = js.native
  def race[T](values: Iterable[T | js.Thenable[T]]): js.Promise[T] = js.native
  def reject[T](): js.Promise[T] = js.native
  def reject[T](reason: js.Any): js.Promise[T] = js.native
  def resolve(): js.Promise[Unit] = js.native
  def resolve[T](value: T): js.Promise[T] = js.native
  def resolve[T](value: js.Thenable[T]): js.Promise[T] = js.native
  def rethrow(reason: js.Any): Unit = js.native
  type Promise[T] = typings.rsvp.rsvpMod.default.Promise[T]
}

