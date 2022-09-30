package typings.dexie.mod

import typings.std.PromiseConstructor
import typings.std.PromiseLike
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait PromiseExtendedConstructor
  extends StObject
     with PromiseConstructor {
  
  def all[T](values: js.Array[T | PromiseLike[T]]): PromiseExtended[js.Array[T]] = js.native
  def all[T1, T2](values: js.Tuple2[T1 | PromiseLike[T1], T2 | PromiseLike[T2]]): PromiseExtended[js.Tuple2[T1, T2]] = js.native
  def all[T1, T2, T3](values: js.Tuple3[T1 | PromiseLike[T1], T2 | PromiseLike[T2], T3 | PromiseLike[T3]]): PromiseExtended[js.Tuple3[T1, T2, T3]] = js.native
  def all[T1, T2, T3, T4](
    values: js.Tuple4[T1 | PromiseLike[T1], T2 | PromiseLike[T2], T3 | PromiseLike[T3], T4 | PromiseLike[T4]]
  ): PromiseExtended[js.Tuple4[T1, T2, T3, T4]] = js.native
  def all[T1, T2, T3, T4, T5](
    values: js.Tuple5[
      T1 | PromiseLike[T1], 
      T2 | PromiseLike[T2], 
      T3 | PromiseLike[T3], 
      T4 | PromiseLike[T4], 
      T5 | PromiseLike[T5]
    ]
  ): PromiseExtended[js.Tuple5[T1, T2, T3, T4, T5]] = js.native
  def all[T1, T2, T3, T4, T5, T6](
    values: js.Tuple6[
      T1 | PromiseLike[T1], 
      T2 | PromiseLike[T2], 
      T3 | PromiseLike[T3], 
      T4 | PromiseLike[T4], 
      T5 | PromiseLike[T5], 
      T6 | PromiseLike[T6]
    ]
  ): PromiseExtended[js.Tuple6[T1, T2, T3, T4, T5, T6]] = js.native
  def all[T1, T2, T3, T4, T5, T6, T7](
    values: js.Tuple7[
      T1 | PromiseLike[T1], 
      T2 | PromiseLike[T2], 
      T3 | PromiseLike[T3], 
      T4 | PromiseLike[T4], 
      T5 | PromiseLike[T5], 
      T6 | PromiseLike[T6], 
      T7 | PromiseLike[T7]
    ]
  ): PromiseExtended[js.Tuple7[T1, T2, T3, T4, T5, T6, T7]] = js.native
  def all[T1, T2, T3, T4, T5, T6, T7, T8](
    values: js.Tuple8[
      T1 | PromiseLike[T1], 
      T2 | PromiseLike[T2], 
      T3 | PromiseLike[T3], 
      T4 | PromiseLike[T4], 
      T5 | PromiseLike[T5], 
      T6 | PromiseLike[T6], 
      T7 | PromiseLike[T7], 
      T8 | PromiseLike[T8]
    ]
  ): PromiseExtended[js.Tuple8[T1, T2, T3, T4, T5, T6, T7, T8]] = js.native
  def all[T1, T2, T3, T4, T5, T6, T7, T8, T9](
    values: js.Tuple9[
      T1 | PromiseLike[T1], 
      T2 | PromiseLike[T2], 
      T3 | PromiseLike[T3], 
      T4 | PromiseLike[T4], 
      T5 | PromiseLike[T5], 
      T6 | PromiseLike[T6], 
      T7 | PromiseLike[T7], 
      T8 | PromiseLike[T8], 
      T9 | PromiseLike[T9]
    ]
  ): PromiseExtended[js.Tuple9[T1, T2, T3, T4, T5, T6, T7, T8, T9]] = js.native
  def all[T1, T2, T3, T4, T5, T6, T7, T8, T9, T10](
    values: js.Tuple10[
      T1 | PromiseLike[T1], 
      T2 | PromiseLike[T2], 
      T3 | PromiseLike[T3], 
      T4 | PromiseLike[T4], 
      T5 | PromiseLike[T5], 
      T6 | PromiseLike[T6], 
      T7 | PromiseLike[T7], 
      T8 | PromiseLike[T8], 
      T9 | PromiseLike[T9], 
      T10 | PromiseLike[T10]
    ]
  ): PromiseExtended[js.Tuple10[T1, T2, T3, T4, T5, T6, T7, T8, T9, T10]] = js.native
  
  def race[T](values: js.Array[T | PromiseLike[T]]): PromiseExtended[T] = js.native
  def race[T1, T2](values: js.Tuple2[T1 | PromiseLike[T1], T2 | PromiseLike[T2]]): PromiseExtended[T1 | T2] = js.native
  def race[T1, T2, T3](values: js.Tuple3[T1 | PromiseLike[T1], T2 | PromiseLike[T2], T3 | PromiseLike[T3]]): PromiseExtended[T1 | T2 | T3] = js.native
  def race[T1, T2, T3, T4](
    values: js.Tuple4[T1 | PromiseLike[T1], T2 | PromiseLike[T2], T3 | PromiseLike[T3], T4 | PromiseLike[T4]]
  ): PromiseExtended[T1 | T2 | T3 | T4] = js.native
  def race[T1, T2, T3, T4, T5](
    values: js.Tuple5[
      T1 | PromiseLike[T1], 
      T2 | PromiseLike[T2], 
      T3 | PromiseLike[T3], 
      T4 | PromiseLike[T4], 
      T5 | PromiseLike[T5]
    ]
  ): PromiseExtended[T1 | T2 | T3 | T4 | T5] = js.native
  def race[T1, T2, T3, T4, T5, T6](
    values: js.Tuple6[
      T1 | PromiseLike[T1], 
      T2 | PromiseLike[T2], 
      T3 | PromiseLike[T3], 
      T4 | PromiseLike[T4], 
      T5 | PromiseLike[T5], 
      T6 | PromiseLike[T6]
    ]
  ): PromiseExtended[T1 | T2 | T3 | T4 | T5 | T6] = js.native
  def race[T1, T2, T3, T4, T5, T6, T7](
    values: js.Tuple7[
      T1 | PromiseLike[T1], 
      T2 | PromiseLike[T2], 
      T3 | PromiseLike[T3], 
      T4 | PromiseLike[T4], 
      T5 | PromiseLike[T5], 
      T6 | PromiseLike[T6], 
      T7 | PromiseLike[T7]
    ]
  ): PromiseExtended[T1 | T2 | T3 | T4 | T5 | T6 | T7] = js.native
  def race[T1, T2, T3, T4, T5, T6, T7, T8](
    values: js.Tuple8[
      T1 | PromiseLike[T1], 
      T2 | PromiseLike[T2], 
      T3 | PromiseLike[T3], 
      T4 | PromiseLike[T4], 
      T5 | PromiseLike[T5], 
      T6 | PromiseLike[T6], 
      T7 | PromiseLike[T7], 
      T8 | PromiseLike[T8]
    ]
  ): PromiseExtended[T1 | T2 | T3 | T4 | T5 | T6 | T7 | T8] = js.native
  def race[T1, T2, T3, T4, T5, T6, T7, T8, T9](
    values: js.Tuple9[
      T1 | PromiseLike[T1], 
      T2 | PromiseLike[T2], 
      T3 | PromiseLike[T3], 
      T4 | PromiseLike[T4], 
      T5 | PromiseLike[T5], 
      T6 | PromiseLike[T6], 
      T7 | PromiseLike[T7], 
      T8 | PromiseLike[T8], 
      T9 | PromiseLike[T9]
    ]
  ): PromiseExtended[T1 | T2 | T3 | T4 | T5 | T6 | T7 | T8 | T9] = js.native
  def race[T1, T2, T3, T4, T5, T6, T7, T8, T9, T10](
    values: js.Tuple10[
      T1 | PromiseLike[T1], 
      T2 | PromiseLike[T2], 
      T3 | PromiseLike[T3], 
      T4 | PromiseLike[T4], 
      T5 | PromiseLike[T5], 
      T6 | PromiseLike[T6], 
      T7 | PromiseLike[T7], 
      T8 | PromiseLike[T8], 
      T9 | PromiseLike[T9], 
      T10 | PromiseLike[T10]
    ]
  ): PromiseExtended[T1 | T2 | T3 | T4 | T5 | T6 | T7 | T8 | T9 | T10] = js.native
  
  @JSName("reject")
  def reject_T[T](reason: Any): PromiseExtended[T] = js.native
}
