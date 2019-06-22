package typings
package fpDashTsLib.libPipeableMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PipeableCompactable2[F /* <: fpDashTsLib.libHKTMod.URIS2 */] extends js.Object {
  def compact[L, A](fa: fpDashTsLib.libHKTMod.Kind2[F, L, fpDashTsLib.libOptionMod.Option[A]]): fpDashTsLib.libHKTMod.Kind2[F, L, A]
  def separate[L, A, B](fa: fpDashTsLib.libHKTMod.Kind2[F, L, fpDashTsLib.libEitherMod.Either[A, B]]): fpDashTsLib.libCompactableMod.Separated[fpDashTsLib.libHKTMod.Kind2[F, L, A], fpDashTsLib.libHKTMod.Kind2[F, L, B]]
}

object PipeableCompactable2 {
  @scala.inline
  def apply[F /* <: fpDashTsLib.libHKTMod.URIS2 */](
    compact: fpDashTsLib.libHKTMod.Kind2[F, js.Any, fpDashTsLib.libOptionMod.Option[js.Any]] => fpDashTsLib.libHKTMod.Kind2[F, js.Any, js.Any],
    separate: fpDashTsLib.libHKTMod.Kind2[F, js.Any, fpDashTsLib.libEitherMod.Either[js.Any, js.Any]] => fpDashTsLib.libCompactableMod.Separated[
      fpDashTsLib.libHKTMod.Kind2[F, js.Any, js.Any], 
      fpDashTsLib.libHKTMod.Kind2[F, js.Any, js.Any]
    ]
  ): PipeableCompactable2[F] = {
    val __obj = js.Dynamic.literal(compact = js.Any.fromFunction1(compact), separate = js.Any.fromFunction1(separate))
  
    __obj.asInstanceOf[PipeableCompactable2[F]]
  }
}

