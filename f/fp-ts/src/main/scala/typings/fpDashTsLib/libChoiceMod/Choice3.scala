package typings
package fpDashTsLib.libChoiceMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Choice3[F /* <: fpDashTsLib.libHKTMod.URIS3 */]
  extends fpDashTsLib.libProfunctorMod.Profunctor3[F] {
  def left[U, A, B, C](pab: fpDashTsLib.libHKTMod.Type3[F, U, A, B]): fpDashTsLib.libHKTMod.Type3[F, U, fpDashTsLib.libEitherMod.Either[A, C], fpDashTsLib.libEitherMod.Either[B, C]]
  def right[U, A, B, C](pbc: fpDashTsLib.libHKTMod.Type3[F, U, B, C]): fpDashTsLib.libHKTMod.Type3[F, U, fpDashTsLib.libEitherMod.Either[A, B], fpDashTsLib.libEitherMod.Either[A, C]]
}

