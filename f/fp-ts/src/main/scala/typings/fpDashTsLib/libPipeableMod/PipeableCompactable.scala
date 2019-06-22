package typings
package fpDashTsLib.libPipeableMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PipeableCompactable[F] extends js.Object {
  def compact[A](fa: fpDashTsLib.libHKTMod.HKT[F, fpDashTsLib.libOptionMod.Option[A]]): fpDashTsLib.libHKTMod.HKT[F, A]
  def separate[A, B](fa: fpDashTsLib.libHKTMod.HKT[F, fpDashTsLib.libEitherMod.Either[A, B]]): fpDashTsLib.libCompactableMod.Separated[fpDashTsLib.libHKTMod.HKT[F, A], fpDashTsLib.libHKTMod.HKT[F, B]]
}

object PipeableCompactable {
  @scala.inline
  def apply[F](
    compact: fpDashTsLib.libHKTMod.HKT[F, fpDashTsLib.libOptionMod.Option[js.Any]] => fpDashTsLib.libHKTMod.HKT[F, js.Any],
    separate: fpDashTsLib.libHKTMod.HKT[F, fpDashTsLib.libEitherMod.Either[js.Any, js.Any]] => fpDashTsLib.libCompactableMod.Separated[fpDashTsLib.libHKTMod.HKT[F, js.Any], fpDashTsLib.libHKTMod.HKT[F, js.Any]]
  ): PipeableCompactable[F] = {
    val __obj = js.Dynamic.literal(compact = js.Any.fromFunction1(compact), separate = js.Any.fromFunction1(separate))
  
    __obj.asInstanceOf[PipeableCompactable[F]]
  }
}

