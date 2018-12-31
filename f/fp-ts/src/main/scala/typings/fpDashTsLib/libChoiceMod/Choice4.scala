package typings
package fpDashTsLib.libChoiceMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Choice4[F /* <: fpDashTsLib.libHKTMod.URIS4 */]
  extends fpDashTsLib.libProfunctorMod.Profunctor4[F] {
  def left[X, U, A, B, C](pab: fpDashTsLib.libHKTMod.Type4[F, X, U, A, B]): fpDashTsLib.libHKTMod.Type4[F, X, U, fpDashTsLib.libEitherMod.Either[A, C], fpDashTsLib.libEitherMod.Either[B, C]]
  def right[X, U, A, B, C](pbc: fpDashTsLib.libHKTMod.Type4[F, X, U, B, C]): fpDashTsLib.libHKTMod.Type4[F, X, U, fpDashTsLib.libEitherMod.Either[A, B], fpDashTsLib.libEitherMod.Either[A, C]]
}

