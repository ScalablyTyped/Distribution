package typings
package fpDashTsLib.libPipeableMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PipeableCompactable4[F /* <: fpDashTsLib.libHKTMod.URIS4 */] extends js.Object {
  def compact[X, U, L, A](fa: fpDashTsLib.libHKTMod.Kind4[F, X, U, L, fpDashTsLib.libOptionMod.Option[A]]): fpDashTsLib.libHKTMod.Kind4[F, X, U, L, A]
  def separate[X, U, L, A, B](fa: fpDashTsLib.libHKTMod.Kind4[F, X, U, L, fpDashTsLib.libEitherMod.Either[A, B]]): fpDashTsLib.libCompactableMod.Separated[
    fpDashTsLib.libHKTMod.Kind4[F, X, U, L, A], 
    fpDashTsLib.libHKTMod.Kind4[F, X, U, L, B]
  ]
}

object PipeableCompactable4 {
  @scala.inline
  def apply[F /* <: fpDashTsLib.libHKTMod.URIS4 */](
    compact: fpDashTsLib.libHKTMod.Kind4[F, js.Any, js.Any, js.Any, fpDashTsLib.libOptionMod.Option[js.Any]] => fpDashTsLib.libHKTMod.Kind4[F, js.Any, js.Any, js.Any, js.Any],
    separate: fpDashTsLib.libHKTMod.Kind4[F, js.Any, js.Any, js.Any, fpDashTsLib.libEitherMod.Either[js.Any, js.Any]] => fpDashTsLib.libCompactableMod.Separated[
      fpDashTsLib.libHKTMod.Kind4[F, js.Any, js.Any, js.Any, js.Any], 
      fpDashTsLib.libHKTMod.Kind4[F, js.Any, js.Any, js.Any, js.Any]
    ]
  ): PipeableCompactable4[F] = {
    val __obj = js.Dynamic.literal(compact = js.Any.fromFunction1(compact), separate = js.Any.fromFunction1(separate))
  
    __obj.asInstanceOf[PipeableCompactable4[F]]
  }
}

