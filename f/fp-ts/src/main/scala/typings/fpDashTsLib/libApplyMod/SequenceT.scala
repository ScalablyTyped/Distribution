package typings
package fpDashTsLib.libApplyMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SequenceT[F] extends js.Object {
  def apply[A](a: fpDashTsLib.libHKTMod.HKT[F, A]): fpDashTsLib.libHKTMod.HKT[F, js.Array[A]] = js.native
  def apply[A, B](a: fpDashTsLib.libHKTMod.HKT[F, A], b: fpDashTsLib.libHKTMod.HKT[F, B]): fpDashTsLib.libHKTMod.HKT[F, js.Tuple2[A, B]] = js.native
  def apply[A, B, C](
    a: fpDashTsLib.libHKTMod.HKT[F, A],
    b: fpDashTsLib.libHKTMod.HKT[F, B],
    c: fpDashTsLib.libHKTMod.HKT[F, C]
  ): fpDashTsLib.libHKTMod.HKT[F, js.Tuple3[A, B, C]] = js.native
  def apply[A, B, C, D](
    a: fpDashTsLib.libHKTMod.HKT[F, A],
    b: fpDashTsLib.libHKTMod.HKT[F, B],
    c: fpDashTsLib.libHKTMod.HKT[F, C],
    d: fpDashTsLib.libHKTMod.HKT[F, D]
  ): fpDashTsLib.libHKTMod.HKT[F, js.Tuple4[A, B, C, D]] = js.native
  def apply[A, B, C, D, E](
    a: fpDashTsLib.libHKTMod.HKT[F, A],
    b: fpDashTsLib.libHKTMod.HKT[F, B],
    c: fpDashTsLib.libHKTMod.HKT[F, C],
    d: fpDashTsLib.libHKTMod.HKT[F, D],
    e: fpDashTsLib.libHKTMod.HKT[F, E]
  ): fpDashTsLib.libHKTMod.HKT[F, js.Tuple5[A, B, C, D, E]] = js.native
}

