package typings
package fpDashTsLib.es6PipeableMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PipeableCompactable[F] extends js.Object {
  def compact[A](fa: fpDashTsLib.es6HKTMod.HKT[F, fpDashTsLib.es6OptionMod.Option[A]]): fpDashTsLib.es6HKTMod.HKT[F, A]
  def separate[A, B](fa: fpDashTsLib.es6HKTMod.HKT[F, fpDashTsLib.es6EitherMod.Either[A, B]]): fpDashTsLib.es6CompactableMod.Separated[fpDashTsLib.es6HKTMod.HKT[F, A], fpDashTsLib.es6HKTMod.HKT[F, B]]
}

object PipeableCompactable {
  @scala.inline
  def apply[F](
    compact: fpDashTsLib.es6HKTMod.HKT[F, fpDashTsLib.es6OptionMod.Option[js.Any]] => fpDashTsLib.es6HKTMod.HKT[F, js.Any],
    separate: fpDashTsLib.es6HKTMod.HKT[F, fpDashTsLib.es6EitherMod.Either[js.Any, js.Any]] => fpDashTsLib.es6CompactableMod.Separated[fpDashTsLib.es6HKTMod.HKT[F, js.Any], fpDashTsLib.es6HKTMod.HKT[F, js.Any]]
  ): PipeableCompactable[F] = {
    val __obj = js.Dynamic.literal(compact = js.Any.fromFunction1(compact), separate = js.Any.fromFunction1(separate))
  
    __obj.asInstanceOf[PipeableCompactable[F]]
  }
}

