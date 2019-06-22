package typings
package fpDashTsLib.libPipeableMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PipeableCompactable1[F /* <: fpDashTsLib.libHKTMod.URIS */] extends js.Object {
  def compact[A](fa: fpDashTsLib.libHKTMod.Kind[F, fpDashTsLib.libOptionMod.Option[A]]): fpDashTsLib.libHKTMod.Kind[F, A]
  def separate[A, B](fa: fpDashTsLib.libHKTMod.Kind[F, fpDashTsLib.libEitherMod.Either[A, B]]): fpDashTsLib.libCompactableMod.Separated[fpDashTsLib.libHKTMod.Kind[F, A], fpDashTsLib.libHKTMod.Kind[F, B]]
}

object PipeableCompactable1 {
  @scala.inline
  def apply[F /* <: fpDashTsLib.libHKTMod.URIS */](
    compact: fpDashTsLib.libHKTMod.Kind[F, fpDashTsLib.libOptionMod.Option[js.Any]] => fpDashTsLib.libHKTMod.Kind[F, js.Any],
    separate: fpDashTsLib.libHKTMod.Kind[F, fpDashTsLib.libEitherMod.Either[js.Any, js.Any]] => fpDashTsLib.libCompactableMod.Separated[fpDashTsLib.libHKTMod.Kind[F, js.Any], fpDashTsLib.libHKTMod.Kind[F, js.Any]]
  ): PipeableCompactable1[F] = {
    val __obj = js.Dynamic.literal(compact = js.Any.fromFunction1(compact), separate = js.Any.fromFunction1(separate))
  
    __obj.asInstanceOf[PipeableCompactable1[F]]
  }
}

