package typings
package fpDashTsLib.libPipeableMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PipeableCompactable3[F /* <: fpDashTsLib.libHKTMod.URIS3 */] extends js.Object {
  def compact[U, L, A](fa: fpDashTsLib.libHKTMod.Kind3[F, U, L, fpDashTsLib.libOptionMod.Option[A]]): fpDashTsLib.libHKTMod.Kind3[F, U, L, A]
  def separate[U, L, A, B](fa: fpDashTsLib.libHKTMod.Kind3[F, U, L, fpDashTsLib.libEitherMod.Either[A, B]]): fpDashTsLib.libCompactableMod.Separated[fpDashTsLib.libHKTMod.Kind3[F, U, L, A], fpDashTsLib.libHKTMod.Kind3[F, U, L, B]]
}

object PipeableCompactable3 {
  @scala.inline
  def apply[F /* <: fpDashTsLib.libHKTMod.URIS3 */](
    compact: fpDashTsLib.libHKTMod.Kind3[F, js.Any, js.Any, fpDashTsLib.libOptionMod.Option[js.Any]] => fpDashTsLib.libHKTMod.Kind3[F, js.Any, js.Any, js.Any],
    separate: fpDashTsLib.libHKTMod.Kind3[F, js.Any, js.Any, fpDashTsLib.libEitherMod.Either[js.Any, js.Any]] => fpDashTsLib.libCompactableMod.Separated[
      fpDashTsLib.libHKTMod.Kind3[F, js.Any, js.Any, js.Any], 
      fpDashTsLib.libHKTMod.Kind3[F, js.Any, js.Any, js.Any]
    ]
  ): PipeableCompactable3[F] = {
    val __obj = js.Dynamic.literal(compact = js.Any.fromFunction1(compact), separate = js.Any.fromFunction1(separate))
  
    __obj.asInstanceOf[PipeableCompactable3[F]]
  }
}

