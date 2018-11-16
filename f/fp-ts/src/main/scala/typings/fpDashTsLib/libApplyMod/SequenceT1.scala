package typings
package fpDashTsLib.libApplyMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SequenceT1[F /* <: fpDashTsLib.libHKTMod.URIS */] extends js.Object {
  def apply[A](a: fpDashTsLib.libHKTMod.Type[F, A]): fpDashTsLib.libHKTMod.Type[F, js.Array[A]] = js.native
  def apply[A, B](a: fpDashTsLib.libHKTMod.Type[F, A], b: fpDashTsLib.libHKTMod.Type[F, B]): fpDashTsLib.libHKTMod.Type[F, js.Tuple2[A, B]] = js.native
  def apply[A, B, C](
    a: fpDashTsLib.libHKTMod.Type[F, A],
    b: fpDashTsLib.libHKTMod.Type[F, B],
    c: fpDashTsLib.libHKTMod.Type[F, C]
  ): fpDashTsLib.libHKTMod.Type[F, js.Tuple3[A, B, C]] = js.native
  def apply[A, B, C, D](
    a: fpDashTsLib.libHKTMod.Type[F, A],
    b: fpDashTsLib.libHKTMod.Type[F, B],
    c: fpDashTsLib.libHKTMod.Type[F, C],
    d: fpDashTsLib.libHKTMod.Type[F, D]
  ): fpDashTsLib.libHKTMod.Type[F, js.Tuple4[A, B, C, D]] = js.native
  def apply[A, B, C, D, E](
    a: fpDashTsLib.libHKTMod.Type[F, A],
    b: fpDashTsLib.libHKTMod.Type[F, B],
    c: fpDashTsLib.libHKTMod.Type[F, C],
    d: fpDashTsLib.libHKTMod.Type[F, D],
    e: fpDashTsLib.libHKTMod.Type[F, E]
  ): fpDashTsLib.libHKTMod.Type[F, js.Tuple5[A, B, C, D, E]] = js.native
}

