package typings
package fpDashTsLib.es6CompactableMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Compactable2C[F /* <: fpDashTsLib.es6HKTMod.URIS2 */, L] extends js.Object {
  val URI: F
  val _L: L
  def compact[A](fa: fpDashTsLib.es6HKTMod.Type2[F, L, fpDashTsLib.es6OptionMod.Option[A]]): fpDashTsLib.es6HKTMod.Type2[F, L, A]
  def separate[A, B](fa: fpDashTsLib.es6HKTMod.Type2[F, L, fpDashTsLib.es6EitherMod.Either[A, B]]): Separated[fpDashTsLib.es6HKTMod.Type2[F, L, A], fpDashTsLib.es6HKTMod.Type2[F, L, B]]
}

object Compactable2C {
  @scala.inline
  def apply[F /* <: fpDashTsLib.es6HKTMod.URIS2 */, L](
    URI: F,
    _L: L,
    compact: fpDashTsLib.es6HKTMod.Type2[F, L, fpDashTsLib.es6OptionMod.Option[js.Any]] => fpDashTsLib.es6HKTMod.Type2[F, L, js.Any],
    separate: fpDashTsLib.es6HKTMod.Type2[F, L, fpDashTsLib.es6EitherMod.Either[js.Any, js.Any]] => Separated[
      fpDashTsLib.es6HKTMod.Type2[F, L, js.Any], 
      fpDashTsLib.es6HKTMod.Type2[F, L, js.Any]
    ]
  ): Compactable2C[F, L] = {
    val __obj = js.Dynamic.literal(URI = URI.asInstanceOf[js.Any], _L = _L.asInstanceOf[js.Any], compact = js.Any.fromFunction1(compact), separate = js.Any.fromFunction1(separate))
  
    __obj.asInstanceOf[Compactable2C[F, L]]
  }
}

