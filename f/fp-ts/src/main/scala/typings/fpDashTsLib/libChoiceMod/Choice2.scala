package typings
package fpDashTsLib.libChoiceMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait Choice2[F /* <: fpDashTsLib.libHKTMod.URIS2 */]
  extends fpDashTsLib.libProfunctorMod.Profunctor2[F] {
  def left[A, B, C](pab: fpDashTsLib.libHKTMod.Type2[F, A, B]): fpDashTsLib.libHKTMod.Type2[F, fpDashTsLib.libEitherMod.Either[A, C], fpDashTsLib.libEitherMod.Either[B, C]]
  def right[A, B, C](pbc: fpDashTsLib.libHKTMod.Type2[F, B, C]): fpDashTsLib.libHKTMod.Type2[F, fpDashTsLib.libEitherMod.Either[A, B], fpDashTsLib.libEitherMod.Either[A, C]]
}

