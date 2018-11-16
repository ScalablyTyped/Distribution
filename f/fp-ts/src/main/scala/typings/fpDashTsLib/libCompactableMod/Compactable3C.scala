package typings
package fpDashTsLib.libCompactableMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait Compactable3C[F /* <: fpDashTsLib.libHKTMod.URIS3 */, U, L] extends js.Object {
  val URI: F
  val _L: L
  val _U: U
  def compact[A](fa: fpDashTsLib.libHKTMod.Type3[F, U, L, fpDashTsLib.libOptionMod.Option[A]]): fpDashTsLib.libHKTMod.Type3[F, U, L, A]
  def separate[A, B](fa: fpDashTsLib.libHKTMod.Type3[F, U, L, fpDashTsLib.libEitherMod.Either[A, B]]): Separated[fpDashTsLib.libHKTMod.Type3[F, U, L, A], fpDashTsLib.libHKTMod.Type3[F, U, L, B]]
}

