package typings
package fpDashTsLib.es6PipeableMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PipeableCompactable4[F /* <: fpDashTsLib.es6HKTMod.URIS4 */] extends js.Object {
  def compact[X, U, L, A](fa: fpDashTsLib.es6HKTMod.Kind4[F, X, U, L, fpDashTsLib.es6OptionMod.Option[A]]): fpDashTsLib.es6HKTMod.Kind4[F, X, U, L, A]
  def separate[X, U, L, A, B](fa: fpDashTsLib.es6HKTMod.Kind4[F, X, U, L, fpDashTsLib.es6EitherMod.Either[A, B]]): fpDashTsLib.es6CompactableMod.Separated[
    fpDashTsLib.es6HKTMod.Kind4[F, X, U, L, A], 
    fpDashTsLib.es6HKTMod.Kind4[F, X, U, L, B]
  ]
}

object PipeableCompactable4 {
  @scala.inline
  def apply[F /* <: fpDashTsLib.es6HKTMod.URIS4 */](
    compact: fpDashTsLib.es6HKTMod.Kind4[F, js.Any, js.Any, js.Any, fpDashTsLib.es6OptionMod.Option[js.Any]] => fpDashTsLib.es6HKTMod.Kind4[F, js.Any, js.Any, js.Any, js.Any],
    separate: fpDashTsLib.es6HKTMod.Kind4[F, js.Any, js.Any, js.Any, fpDashTsLib.es6EitherMod.Either[js.Any, js.Any]] => fpDashTsLib.es6CompactableMod.Separated[
      fpDashTsLib.es6HKTMod.Kind4[F, js.Any, js.Any, js.Any, js.Any], 
      fpDashTsLib.es6HKTMod.Kind4[F, js.Any, js.Any, js.Any, js.Any]
    ]
  ): PipeableCompactable4[F] = {
    val __obj = js.Dynamic.literal(compact = js.Any.fromFunction1(compact), separate = js.Any.fromFunction1(separate))
  
    __obj.asInstanceOf[PipeableCompactable4[F]]
  }
}

