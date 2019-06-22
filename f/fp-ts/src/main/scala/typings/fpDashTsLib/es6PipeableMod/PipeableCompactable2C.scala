package typings
package fpDashTsLib.es6PipeableMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PipeableCompactable2C[F /* <: fpDashTsLib.es6HKTMod.URIS2 */, L] extends js.Object {
  def compact[A](fa: fpDashTsLib.es6HKTMod.Kind2[F, L, fpDashTsLib.es6OptionMod.Option[A]]): fpDashTsLib.es6HKTMod.Kind2[F, L, A]
  def separate[A, B](fa: fpDashTsLib.es6HKTMod.Kind2[F, L, fpDashTsLib.es6EitherMod.Either[A, B]]): fpDashTsLib.es6CompactableMod.Separated[fpDashTsLib.es6HKTMod.Kind2[F, L, A], fpDashTsLib.es6HKTMod.Kind2[F, L, B]]
}

object PipeableCompactable2C {
  @scala.inline
  def apply[F /* <: fpDashTsLib.es6HKTMod.URIS2 */, L](
    compact: fpDashTsLib.es6HKTMod.Kind2[F, L, fpDashTsLib.es6OptionMod.Option[js.Any]] => fpDashTsLib.es6HKTMod.Kind2[F, L, js.Any],
    separate: fpDashTsLib.es6HKTMod.Kind2[F, L, fpDashTsLib.es6EitherMod.Either[js.Any, js.Any]] => fpDashTsLib.es6CompactableMod.Separated[
      fpDashTsLib.es6HKTMod.Kind2[F, L, js.Any], 
      fpDashTsLib.es6HKTMod.Kind2[F, L, js.Any]
    ]
  ): PipeableCompactable2C[F, L] = {
    val __obj = js.Dynamic.literal(compact = js.Any.fromFunction1(compact), separate = js.Any.fromFunction1(separate))
  
    __obj.asInstanceOf[PipeableCompactable2C[F, L]]
  }
}

