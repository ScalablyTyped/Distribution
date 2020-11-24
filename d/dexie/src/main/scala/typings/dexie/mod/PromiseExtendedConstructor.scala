package typings.dexie.mod

import typings.std.PromiseConstructor
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait PromiseExtendedConstructor extends PromiseConstructor {
  
  def race[T1, T2](values: js.Tuple2[T1 | js.Thenable[T1], T2 | js.Thenable[T2]]): PromiseExtended[T1 | T2] = js.native
  def race[T1, T2, T3](values: js.Tuple3[T1 | js.Thenable[T1], T2 | js.Thenable[T2], T3 | js.Thenable[T3]]): PromiseExtended[T1 | T2 | T3] = js.native
  def race[T1, T2, T3, T4](
    values: js.Tuple4[T1 | js.Thenable[T1], T2 | js.Thenable[T2], T3 | js.Thenable[T3], T4 | js.Thenable[T4]]
  ): PromiseExtended[T1 | T2 | T3 | T4] = js.native
  def race[T1, T2, T3, T4, T5](
    values: js.Tuple5[
      T1 | js.Thenable[T1], 
      T2 | js.Thenable[T2], 
      T3 | js.Thenable[T3], 
      T4 | js.Thenable[T4], 
      T5 | js.Thenable[T5]
    ]
  ): PromiseExtended[T1 | T2 | T3 | T4 | T5] = js.native
  def race[T1, T2, T3, T4, T5, T6](
    values: js.Tuple6[
      T1 | js.Thenable[T1], 
      T2 | js.Thenable[T2], 
      T3 | js.Thenable[T3], 
      T4 | js.Thenable[T4], 
      T5 | js.Thenable[T5], 
      T6 | js.Thenable[T6]
    ]
  ): PromiseExtended[T1 | T2 | T3 | T4 | T5 | T6] = js.native
  def race[T1, T2, T3, T4, T5, T6, T7](
    values: js.Tuple7[
      T1 | js.Thenable[T1], 
      T2 | js.Thenable[T2], 
      T3 | js.Thenable[T3], 
      T4 | js.Thenable[T4], 
      T5 | js.Thenable[T5], 
      T6 | js.Thenable[T6], 
      T7 | js.Thenable[T7]
    ]
  ): PromiseExtended[T1 | T2 | T3 | T4 | T5 | T6 | T7] = js.native
  def race[T1, T2, T3, T4, T5, T6, T7, T8](
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
  ): PromiseExtended[T1 | T2 | T3 | T4 | T5 | T6 | T7 | T8] = js.native
  def race[T1, T2, T3, T4, T5, T6, T7, T8, T9](
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
  ): PromiseExtended[T1 | T2 | T3 | T4 | T5 | T6 | T7 | T8 | T9] = js.native
  def race[T1, T2, T3, T4, T5, T6, T7, T8, T9, T10](
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
  ): PromiseExtended[T1 | T2 | T3 | T4 | T5 | T6 | T7 | T8 | T9 | T10] = js.native
  
  @JSName("reject")
  def reject_T[T](reason: js.Any): PromiseExtended[T] = js.native
}
