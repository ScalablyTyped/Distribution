package typings
package es6DashPromiseLib.es6DashPromiseMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("es6-promise", "Promise")
@js.native
class Promise[R] protected () extends Thenable[R] {
  /**
    * If you call resolve in the body of the callback passed to the constructor,
    * your promise is fulfilled with result object passed to resolve.
    * If you call reject your promise is rejected with the object passed to resolve.
    * For consistency and debugging (eg stack traces), obj should be an instanceof Error.
    * Any errors thrown in the constructor callback will be implicitly passed to reject().
    */
  def this(callback: js.Function2[
      /* resolve */ js.Function1[/* value */ js.UndefOr[R | Thenable[R]], scala.Unit], 
      /* reject */ js.Function1[/* error */ js.UndefOr[js.Any], scala.Unit], 
      scala.Unit
    ]) = this()
  /**
    * Sugar for promise.then(undefined, onRejected)
    *
    * @param onRejected called when/if "promise" rejects
    */
  def `catch`[U](): Promise[U] = js.native
  def `catch`[U](onRejected: js.Function1[/* error */ js.Any, U | Thenable[U]]): Promise[U] = js.native
  /**
    * onSettled is invoked when/if the "promise" settles (either rejects or fulfills);
    *
    * @param onFinally called when/if "promise" settles
    */
  def `finally`[U](): Promise[U] = js.native
  def `finally`[U](onFinally: js.Function1[/* callback */ js.Any, U | Thenable[U]]): Promise[U] = js.native
}

/* static members */
@JSImport("es6-promise", "Promise")
@js.native
object Promise extends js.Object {
  def all[T1](values: js.Array[T1 | es6DashPromiseLib.es6DashPromiseMod.Thenable[T1]]): es6DashPromiseLib.es6DashPromiseMod.Promise[js.Array[T1]] = js.native
  def all[T1, T2](
    values: js.Tuple2[
      T1 | es6DashPromiseLib.es6DashPromiseMod.Thenable[T1], 
      T2 | es6DashPromiseLib.es6DashPromiseMod.Thenable[T2]
    ]
  ): es6DashPromiseLib.es6DashPromiseMod.Promise[js.Tuple2[T1, T2]] = js.native
  def all[T1, T2, T3](
    values: js.Tuple3[
      T1 | es6DashPromiseLib.es6DashPromiseMod.Thenable[T1], 
      T2 | es6DashPromiseLib.es6DashPromiseMod.Thenable[T2], 
      T3 | es6DashPromiseLib.es6DashPromiseMod.Thenable[T3]
    ]
  ): es6DashPromiseLib.es6DashPromiseMod.Promise[js.Tuple3[T1, T2, T3]] = js.native
  def all[T1, T2, T3, T4](
    values: js.Tuple4[
      T1 | es6DashPromiseLib.es6DashPromiseMod.Thenable[T1], 
      T2 | es6DashPromiseLib.es6DashPromiseMod.Thenable[T2], 
      T3 | es6DashPromiseLib.es6DashPromiseMod.Thenable[T3], 
      T4 | es6DashPromiseLib.es6DashPromiseMod.Thenable[T4]
    ]
  ): es6DashPromiseLib.es6DashPromiseMod.Promise[js.Tuple4[T1, T2, T3, T4]] = js.native
  def all[T1, T2, T3, T4, T5](
    values: js.Tuple5[
      T1 | es6DashPromiseLib.es6DashPromiseMod.Thenable[T1], 
      T2 | es6DashPromiseLib.es6DashPromiseMod.Thenable[T2], 
      T3 | es6DashPromiseLib.es6DashPromiseMod.Thenable[T3], 
      T4 | es6DashPromiseLib.es6DashPromiseMod.Thenable[T4], 
      T5 | es6DashPromiseLib.es6DashPromiseMod.Thenable[T5]
    ]
  ): es6DashPromiseLib.es6DashPromiseMod.Promise[js.Tuple5[T1, T2, T3, T4, T5]] = js.native
  def all[T1, T2, T3, T4, T5, T6](
    values: js.Tuple6[
      T1 | es6DashPromiseLib.es6DashPromiseMod.Thenable[T1], 
      T2 | es6DashPromiseLib.es6DashPromiseMod.Thenable[T2], 
      T3 | es6DashPromiseLib.es6DashPromiseMod.Thenable[T3], 
      T4 | es6DashPromiseLib.es6DashPromiseMod.Thenable[T4], 
      T5 | es6DashPromiseLib.es6DashPromiseMod.Thenable[T5], 
      T6 | es6DashPromiseLib.es6DashPromiseMod.Thenable[T6]
    ]
  ): es6DashPromiseLib.es6DashPromiseMod.Promise[js.Tuple6[T1, T2, T3, T4, T5, T6]] = js.native
  def all[T1, T2, T3, T4, T5, T6, T7](
    values: js.Tuple7[
      T1 | es6DashPromiseLib.es6DashPromiseMod.Thenable[T1], 
      T2 | es6DashPromiseLib.es6DashPromiseMod.Thenable[T2], 
      T3 | es6DashPromiseLib.es6DashPromiseMod.Thenable[T3], 
      T4 | es6DashPromiseLib.es6DashPromiseMod.Thenable[T4], 
      T5 | es6DashPromiseLib.es6DashPromiseMod.Thenable[T5], 
      T6 | es6DashPromiseLib.es6DashPromiseMod.Thenable[T6], 
      T7 | es6DashPromiseLib.es6DashPromiseMod.Thenable[T7]
    ]
  ): es6DashPromiseLib.es6DashPromiseMod.Promise[js.Tuple7[T1, T2, T3, T4, T5, T6, T7]] = js.native
  def all[T1, T2, T3, T4, T5, T6, T7, T8](
    values: js.Tuple8[
      T1 | es6DashPromiseLib.es6DashPromiseMod.Thenable[T1], 
      T2 | es6DashPromiseLib.es6DashPromiseMod.Thenable[T2], 
      T3 | es6DashPromiseLib.es6DashPromiseMod.Thenable[T3], 
      T4 | es6DashPromiseLib.es6DashPromiseMod.Thenable[T4], 
      T5 | es6DashPromiseLib.es6DashPromiseMod.Thenable[T5], 
      T6 | es6DashPromiseLib.es6DashPromiseMod.Thenable[T6], 
      T7 | es6DashPromiseLib.es6DashPromiseMod.Thenable[T7], 
      T8 | es6DashPromiseLib.es6DashPromiseMod.Thenable[T8]
    ]
  ): es6DashPromiseLib.es6DashPromiseMod.Promise[js.Tuple8[T1, T2, T3, T4, T5, T6, T7, T8]] = js.native
  def all[T1, T2, T3, T4, T5, T6, T7, T8, T9](
    values: js.Tuple9[
      T1 | es6DashPromiseLib.es6DashPromiseMod.Thenable[T1], 
      T2 | es6DashPromiseLib.es6DashPromiseMod.Thenable[T2], 
      T3 | es6DashPromiseLib.es6DashPromiseMod.Thenable[T3], 
      T4 | es6DashPromiseLib.es6DashPromiseMod.Thenable[T4], 
      T5 | es6DashPromiseLib.es6DashPromiseMod.Thenable[T5], 
      T6 | es6DashPromiseLib.es6DashPromiseMod.Thenable[T6], 
      T7 | es6DashPromiseLib.es6DashPromiseMod.Thenable[T7], 
      T8 | es6DashPromiseLib.es6DashPromiseMod.Thenable[T8], 
      T9 | es6DashPromiseLib.es6DashPromiseMod.Thenable[T9]
    ]
  ): es6DashPromiseLib.es6DashPromiseMod.Promise[js.Tuple9[T1, T2, T3, T4, T5, T6, T7, T8, T9]] = js.native
  /**
    * Make a promise that fulfills when every item in the array fulfills, and rejects if (and when) any item rejects.
    * the array passed to all can be a mixture of promise-like objects and other objects.
    * The fulfillment value is an array (in order) of fulfillment values. The rejection value is the first rejection value.
    */
  def all[T1, T2, T3, T4, T5, T6, T7, T8, T9, T10](
    values: js.Tuple10[
      T1 | es6DashPromiseLib.es6DashPromiseMod.Thenable[T1], 
      T2 | es6DashPromiseLib.es6DashPromiseMod.Thenable[T2], 
      T3 | es6DashPromiseLib.es6DashPromiseMod.Thenable[T3], 
      T4 | es6DashPromiseLib.es6DashPromiseMod.Thenable[T4], 
      T5 | es6DashPromiseLib.es6DashPromiseMod.Thenable[T5], 
      T6 | es6DashPromiseLib.es6DashPromiseMod.Thenable[T6], 
      T7 | es6DashPromiseLib.es6DashPromiseMod.Thenable[T7], 
      T8 | es6DashPromiseLib.es6DashPromiseMod.Thenable[T8], 
      T9 | es6DashPromiseLib.es6DashPromiseMod.Thenable[T9], 
      T10 | es6DashPromiseLib.es6DashPromiseMod.Thenable[T10]
    ]
  ): es6DashPromiseLib.es6DashPromiseMod.Promise[js.Tuple10[T1, T2, T3, T4, T5, T6, T7, T8, T9, T10]] = js.native
  @JSName("all")
  def all_TAll[TAll](values: js.Array[TAll | es6DashPromiseLib.es6DashPromiseMod.Thenable[TAll]]): es6DashPromiseLib.es6DashPromiseMod.Promise[js.Array[TAll]] = js.native
  /**
    * Make a Promise that fulfills when any item fulfills, and rejects if any item rejects.
    */
  def race[R](promises: js.Array[R | es6DashPromiseLib.es6DashPromiseMod.Thenable[R]]): es6DashPromiseLib.es6DashPromiseMod.Promise[R] = js.native
  /**
    * Make a promise that rejects to obj. For consistency and debugging (eg stack traces), obj should be an instanceof Error
    */
  def reject[R](error: js.Any): es6DashPromiseLib.es6DashPromiseMod.Promise[R] = js.native
  /**
    * Make a new promise from the thenable.
    * A thenable is promise-like in as far as it has a "then" method.
    */
  def resolve(): es6DashPromiseLib.es6DashPromiseMod.Promise[scala.Unit] = js.native
  def resolve[R](value: R): es6DashPromiseLib.es6DashPromiseMod.Promise[R] = js.native
  def resolve[R](value: es6DashPromiseLib.es6DashPromiseMod.Thenable[R]): es6DashPromiseLib.es6DashPromiseMod.Promise[R] = js.native
}

