package typings.dexie.mod.Dexie

import org.scalablytyped.runtime.Instantiable1
import typings.std.Iterable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DexiePromiseConstructor
  extends Instantiable1[
      /* executor */ js.Function2[
        /* resolve */ js.Function1[/* value */ js.UndefOr[js.Object | js.Thenable[js.Object]], Unit], 
        /* reject */ js.Function1[/* reason */ js.UndefOr[js.Any], Unit], 
        Unit
      ], 
      Promise[js.Object]
    ] {
  def all[T](values: js.Array[T | js.Thenable[T]]): Promise[js.Array[T]] = js.native
  // From lib.es6.d.ts:
  def all[TAll](values: Iterable[TAll | js.Thenable[TAll]]): Promise[js.Array[TAll]] = js.native
  def all[T1, T2](values: js.Tuple2[T1 | js.Thenable[T1], T2 | js.Thenable[T2]]): Promise[js.Tuple2[T1, T2]] = js.native
  def all[T1, T2, T3](values: js.Tuple3[T1 | js.Thenable[T1], T2 | js.Thenable[T2], T3 | js.Thenable[T3]]): Promise[js.Tuple3[T1, T2, T3]] = js.native
  def all[T1, T2, T3, T4](
    values: js.Tuple4[T1 | js.Thenable[T1], T2 | js.Thenable[T2], T3 | js.Thenable[T3], T4 | js.Thenable[T4]]
  ): Promise[js.Tuple4[T1, T2, T3, T4]] = js.native
  def all[T1, T2, T3, T4, T5](
    values: js.Tuple5[
      T1 | js.Thenable[T1], 
      T2 | js.Thenable[T2], 
      T3 | js.Thenable[T3], 
      T4 | js.Thenable[T4], 
      T5 | js.Thenable[T5]
    ]
  ): Promise[js.Tuple5[T1, T2, T3, T4, T5]] = js.native
  def all[T1, T2, T3, T4, T5, T6](
    values: js.Tuple6[
      T1 | js.Thenable[T1], 
      T2 | js.Thenable[T2], 
      T3 | js.Thenable[T3], 
      T4 | js.Thenable[T4], 
      T5 | js.Thenable[T5], 
      T6 | js.Thenable[T6]
    ]
  ): Promise[js.Tuple6[T1, T2, T3, T4, T5, T6]] = js.native
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
  ): Promise[js.Tuple7[T1, T2, T3, T4, T5, T6, T7]] = js.native
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
  ): Promise[js.Tuple8[T1, T2, T3, T4, T5, T6, T7, T8]] = js.native
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
  ): Promise[js.Tuple9[T1, T2, T3, T4, T5, T6, T7, T8, T9]] = js.native
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
  ): Promise[js.Tuple10[T1, T2, T3, T4, T5, T6, T7, T8, T9, T10]] = js.native
  def race[T](values: Iterable[T | js.Thenable[T]]): Promise[T] = js.native
  def reject(reason: js.Any): Promise[scala.Nothing] = js.native
  @JSName("reject")
  def reject_T[T](reason: js.Any): Promise[T] = js.native
  def resolve(): Promise[Unit] = js.native
  def resolve[T](value: T): Promise[T] = js.native
  def resolve[T](value: js.Thenable[T]): Promise[T] = js.native
}

