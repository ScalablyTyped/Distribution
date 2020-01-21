package typings.es6Promise

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("es6-promise", JSImport.Namespace)
@js.native
object mod extends js.Object {
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
            /* resolve */ js.Function1[/* value */ js.UndefOr[R | Thenable[R]], Unit], 
            /* reject */ js.Function1[/* error */ js.UndefOr[js.Any], Unit], 
            Unit
          ]) = this()
    /**
      * Sugar for promise.then(undefined, onRejected)
      *
      * @param onRejected called when/if "promise" rejects
      */
    def `catch`[U](): Promise[U] = js.native
    def `catch`[U](onRejected: js.Function1[/* error */ js.Any, U | Thenable[U]]): Promise[U] = js.native
    /**
      * onSettled is invoked when/if the "promise" settles (either rejects or fulfills).
      * The returned promise is settled when the `Thenable` returned by `onFinally` settles;
      * it is rejected if `onFinally` throws or rejects; otherwise it assumes the state of the
      * original Promise.
      *
      * @param onFinally called when/if "promise" settles
      */
    def `finally`(): Promise[R] = js.native
    def `finally`(onFinally: js.Function0[_ | Thenable[_]]): Promise[R] = js.native
  }
  
  @js.native
  trait Thenable[R] extends js.Object {
    def `then`[U](): Thenable[U] = js.native
    def `then`[U](onFulfilled: js.Function1[/* value */ R, U | Thenable[U]]): Thenable[U] = js.native
    def `then`[U](
      onFulfilled: js.Function1[/* value */ R, Thenable[U] | U],
      onRejected: js.Function1[/* error */ js.Any, Thenable[U] | U | Unit]
    ): Thenable[U] = js.native
  }
  
  def polyfill(): Unit = js.native
  /* static members */
  @js.native
  object Promise extends js.Object {
    def all[T1](values: js.Array[T1 | Thenable[T1]]): Promise[js.Array[T1]] = js.native
    def all[T1, T2](values: js.Tuple2[T1 | Thenable[T1], T2 | Thenable[T2]]): Promise[js.Tuple2[T1, T2]] = js.native
    def all[T1, T2, T3](values: js.Tuple3[T1 | Thenable[T1], T2 | Thenable[T2], T3 | Thenable[T3]]): Promise[js.Tuple3[T1, T2, T3]] = js.native
    def all[T1, T2, T3, T4](values: js.Tuple4[T1 | Thenable[T1], T2 | Thenable[T2], T3 | Thenable[T3], T4 | Thenable[T4]]): Promise[js.Tuple4[T1, T2, T3, T4]] = js.native
    def all[T1, T2, T3, T4, T5](
      values: js.Tuple5[
          T1 | Thenable[T1], 
          T2 | Thenable[T2], 
          T3 | Thenable[T3], 
          T4 | Thenable[T4], 
          T5 | Thenable[T5]
        ]
    ): Promise[js.Tuple5[T1, T2, T3, T4, T5]] = js.native
    def all[T1, T2, T3, T4, T5, T6](
      values: js.Tuple6[
          T1 | Thenable[T1], 
          T2 | Thenable[T2], 
          T3 | Thenable[T3], 
          T4 | Thenable[T4], 
          T5 | Thenable[T5], 
          T6 | Thenable[T6]
        ]
    ): Promise[js.Tuple6[T1, T2, T3, T4, T5, T6]] = js.native
    def all[T1, T2, T3, T4, T5, T6, T7](
      values: js.Tuple7[
          T1 | Thenable[T1], 
          T2 | Thenable[T2], 
          T3 | Thenable[T3], 
          T4 | Thenable[T4], 
          T5 | Thenable[T5], 
          T6 | Thenable[T6], 
          T7 | Thenable[T7]
        ]
    ): Promise[js.Tuple7[T1, T2, T3, T4, T5, T6, T7]] = js.native
    def all[T1, T2, T3, T4, T5, T6, T7, T8](
      values: js.Tuple8[
          T1 | Thenable[T1], 
          T2 | Thenable[T2], 
          T3 | Thenable[T3], 
          T4 | Thenable[T4], 
          T5 | Thenable[T5], 
          T6 | Thenable[T6], 
          T7 | Thenable[T7], 
          T8 | Thenable[T8]
        ]
    ): Promise[js.Tuple8[T1, T2, T3, T4, T5, T6, T7, T8]] = js.native
    def all[T1, T2, T3, T4, T5, T6, T7, T8, T9](
      values: js.Tuple9[
          T1 | Thenable[T1], 
          T2 | Thenable[T2], 
          T3 | Thenable[T3], 
          T4 | Thenable[T4], 
          T5 | Thenable[T5], 
          T6 | Thenable[T6], 
          T7 | Thenable[T7], 
          T8 | Thenable[T8], 
          T9 | Thenable[T9]
        ]
    ): Promise[js.Tuple9[T1, T2, T3, T4, T5, T6, T7, T8, T9]] = js.native
    /**
      * Make a promise that fulfills when every item in the array fulfills, and rejects if (and when) any item rejects.
      * the array passed to all can be a mixture of promise-like objects and other objects.
      * The fulfillment value is an array (in order) of fulfillment values. The rejection value is the first rejection value.
      */
    def all[T1, T2, T3, T4, T5, T6, T7, T8, T9, T10](
      values: js.Tuple10[
          T1 | Thenable[T1], 
          T2 | Thenable[T2], 
          T3 | Thenable[T3], 
          T4 | Thenable[T4], 
          T5 | Thenable[T5], 
          T6 | Thenable[T6], 
          T7 | Thenable[T7], 
          T8 | Thenable[T8], 
          T9 | Thenable[T9], 
          T10 | Thenable[T10]
        ]
    ): Promise[js.Tuple10[T1, T2, T3, T4, T5, T6, T7, T8, T9, T10]] = js.native
    @JSName("all")
    def all_TAll[TAll](values: js.Array[TAll | Thenable[TAll]]): Promise[js.Array[TAll]] = js.native
    /**
      * Make a Promise that fulfills when any item fulfills, and rejects if any item rejects.
      */
    def race[R](promises: js.Array[R | Thenable[R]]): Promise[R] = js.native
    /**
      * Make a promise that rejects to obj. For consistency and debugging (eg stack traces), obj should be an instanceof Error
      */
    def reject[R](error: js.Any): Promise[R] = js.native
    /**
      * Make a new promise from the thenable.
      * A thenable is promise-like in as far as it has a "then" method.
      */
    def resolve(): Promise[Unit] = js.native
    def resolve[R](value: R): Promise[R] = js.native
    def resolve[R](value: Thenable[R]): Promise[R] = js.native
  }
  
}

