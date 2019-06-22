package typings
package fpDashTsLib.libCompactableMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Compactable3C[F /* <: fpDashTsLib.libHKTMod.URIS3 */, U, L] extends js.Object {
  val URI: F
  val _L: L
  val _U: U
  def compact[A](fa: fpDashTsLib.libHKTMod.Kind3[F, U, L, fpDashTsLib.libOptionMod.Option[A]]): fpDashTsLib.libHKTMod.Kind3[F, U, L, A]
  def separate[A, B](fa: fpDashTsLib.libHKTMod.Kind3[F, U, L, fpDashTsLib.libEitherMod.Either[A, B]]): Separated[fpDashTsLib.libHKTMod.Kind3[F, U, L, A], fpDashTsLib.libHKTMod.Kind3[F, U, L, B]]
}

object Compactable3C {
  @scala.inline
  def apply[F /* <: fpDashTsLib.libHKTMod.URIS3 */, U, L](
    URI: F,
    _L: L,
    _U: U,
    compact: fpDashTsLib.libHKTMod.Kind3[F, U, L, fpDashTsLib.libOptionMod.Option[js.Any]] => fpDashTsLib.libHKTMod.Kind3[F, U, L, js.Any],
    separate: fpDashTsLib.libHKTMod.Kind3[F, U, L, fpDashTsLib.libEitherMod.Either[js.Any, js.Any]] => Separated[
      fpDashTsLib.libHKTMod.Kind3[F, U, L, js.Any], 
      fpDashTsLib.libHKTMod.Kind3[F, U, L, js.Any]
    ]
  ): Compactable3C[F, U, L] = {
    val __obj = js.Dynamic.literal(URI = URI.asInstanceOf[js.Any], _L = _L.asInstanceOf[js.Any], _U = _U.asInstanceOf[js.Any], compact = js.Any.fromFunction1(compact), separate = js.Any.fromFunction1(separate))
  
    __obj.asInstanceOf[Compactable3C[F, U, L]]
  }
}

