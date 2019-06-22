package typings
package fpDashTsLib.es6CompactableMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Compactable3C[F /* <: fpDashTsLib.es6HKTMod.URIS3 */, U, L] extends js.Object {
  val URI: F
  val _L: L
  val _U: U
  def compact[A](fa: fpDashTsLib.es6HKTMod.Kind3[F, U, L, fpDashTsLib.es6OptionMod.Option[A]]): fpDashTsLib.es6HKTMod.Kind3[F, U, L, A]
  def separate[A, B](fa: fpDashTsLib.es6HKTMod.Kind3[F, U, L, fpDashTsLib.es6EitherMod.Either[A, B]]): Separated[fpDashTsLib.es6HKTMod.Kind3[F, U, L, A], fpDashTsLib.es6HKTMod.Kind3[F, U, L, B]]
}

object Compactable3C {
  @scala.inline
  def apply[F /* <: fpDashTsLib.es6HKTMod.URIS3 */, U, L](
    URI: F,
    _L: L,
    _U: U,
    compact: fpDashTsLib.es6HKTMod.Kind3[F, U, L, fpDashTsLib.es6OptionMod.Option[js.Any]] => fpDashTsLib.es6HKTMod.Kind3[F, U, L, js.Any],
    separate: fpDashTsLib.es6HKTMod.Kind3[F, U, L, fpDashTsLib.es6EitherMod.Either[js.Any, js.Any]] => Separated[
      fpDashTsLib.es6HKTMod.Kind3[F, U, L, js.Any], 
      fpDashTsLib.es6HKTMod.Kind3[F, U, L, js.Any]
    ]
  ): Compactable3C[F, U, L] = {
    val __obj = js.Dynamic.literal(URI = URI.asInstanceOf[js.Any], _L = _L.asInstanceOf[js.Any], _U = _U.asInstanceOf[js.Any], compact = js.Any.fromFunction1(compact), separate = js.Any.fromFunction1(separate))
  
    __obj.asInstanceOf[Compactable3C[F, U, L]]
  }
}

