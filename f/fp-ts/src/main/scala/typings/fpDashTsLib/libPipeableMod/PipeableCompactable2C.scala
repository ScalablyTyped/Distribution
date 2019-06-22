package typings
package fpDashTsLib.libPipeableMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PipeableCompactable2C[F /* <: fpDashTsLib.libHKTMod.URIS2 */, L] extends js.Object {
  def compact[A](fa: fpDashTsLib.libHKTMod.Kind2[F, L, fpDashTsLib.libOptionMod.Option[A]]): fpDashTsLib.libHKTMod.Kind2[F, L, A]
  def separate[A, B](fa: fpDashTsLib.libHKTMod.Kind2[F, L, fpDashTsLib.libEitherMod.Either[A, B]]): fpDashTsLib.libCompactableMod.Separated[fpDashTsLib.libHKTMod.Kind2[F, L, A], fpDashTsLib.libHKTMod.Kind2[F, L, B]]
}

object PipeableCompactable2C {
  @scala.inline
  def apply[F /* <: fpDashTsLib.libHKTMod.URIS2 */, L](
    compact: fpDashTsLib.libHKTMod.Kind2[F, L, fpDashTsLib.libOptionMod.Option[js.Any]] => fpDashTsLib.libHKTMod.Kind2[F, L, js.Any],
    separate: fpDashTsLib.libHKTMod.Kind2[F, L, fpDashTsLib.libEitherMod.Either[js.Any, js.Any]] => fpDashTsLib.libCompactableMod.Separated[
      fpDashTsLib.libHKTMod.Kind2[F, L, js.Any], 
      fpDashTsLib.libHKTMod.Kind2[F, L, js.Any]
    ]
  ): PipeableCompactable2C[F, L] = {
    val __obj = js.Dynamic.literal(compact = js.Any.fromFunction1(compact), separate = js.Any.fromFunction1(separate))
  
    __obj.asInstanceOf[PipeableCompactable2C[F, L]]
  }
}

