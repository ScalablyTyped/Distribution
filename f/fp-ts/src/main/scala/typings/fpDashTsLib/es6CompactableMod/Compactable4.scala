package typings
package fpDashTsLib.es6CompactableMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Compactable4[F /* <: fpDashTsLib.es6HKTMod.URIS4 */] extends js.Object {
  val URI: F
  def compact[X, U, L, A](fa: fpDashTsLib.es6HKTMod.Kind4[F, X, U, L, fpDashTsLib.es6OptionMod.Option[A]]): fpDashTsLib.es6HKTMod.Kind4[F, X, U, L, A]
  def separate[X, U, L, A, B](fa: fpDashTsLib.es6HKTMod.Kind4[F, X, U, L, fpDashTsLib.es6EitherMod.Either[A, B]]): Separated[
    fpDashTsLib.es6HKTMod.Kind4[F, X, U, L, A], 
    fpDashTsLib.es6HKTMod.Kind4[F, X, U, L, B]
  ]
}

object Compactable4 {
  @scala.inline
  def apply[F /* <: fpDashTsLib.es6HKTMod.URIS4 */](
    URI: F,
    compact: fpDashTsLib.es6HKTMod.Kind4[F, js.Any, js.Any, js.Any, fpDashTsLib.es6OptionMod.Option[js.Any]] => fpDashTsLib.es6HKTMod.Kind4[F, js.Any, js.Any, js.Any, js.Any],
    separate: fpDashTsLib.es6HKTMod.Kind4[F, js.Any, js.Any, js.Any, fpDashTsLib.es6EitherMod.Either[js.Any, js.Any]] => Separated[
      fpDashTsLib.es6HKTMod.Kind4[F, js.Any, js.Any, js.Any, js.Any], 
      fpDashTsLib.es6HKTMod.Kind4[F, js.Any, js.Any, js.Any, js.Any]
    ]
  ): Compactable4[F] = {
    val __obj = js.Dynamic.literal(URI = URI.asInstanceOf[js.Any], compact = js.Any.fromFunction1(compact), separate = js.Any.fromFunction1(separate))
  
    __obj.asInstanceOf[Compactable4[F]]
  }
}

