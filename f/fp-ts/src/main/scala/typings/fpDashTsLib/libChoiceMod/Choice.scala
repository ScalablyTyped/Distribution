package typings
package fpDashTsLib.libChoiceMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait Choice[F]
  extends fpDashTsLib.libProfunctorMod.Profunctor[F] {
  def left[A, B, C](pab: fpDashTsLib.libHKTMod.HKT2[F, A, B]): fpDashTsLib.libHKTMod.HKT2[F, fpDashTsLib.libEitherMod.Either[A, C], fpDashTsLib.libEitherMod.Either[B, C]]
  def right[A, B, C](pbc: fpDashTsLib.libHKTMod.HKT2[F, B, C]): fpDashTsLib.libHKTMod.HKT2[F, fpDashTsLib.libEitherMod.Either[A, B], fpDashTsLib.libEitherMod.Either[A, C]]
}

