package typings
package fpDashTsLib.libCompactableMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Compactable1[F /* <: fpDashTsLib.libHKTMod.URIS */] extends js.Object {
  val URI: F
  def compact[A](fa: fpDashTsLib.libHKTMod.Kind[F, fpDashTsLib.libOptionMod.Option[A]]): fpDashTsLib.libHKTMod.Kind[F, A]
  def separate[A, B](fa: fpDashTsLib.libHKTMod.Kind[F, fpDashTsLib.libEitherMod.Either[A, B]]): Separated[fpDashTsLib.libHKTMod.Kind[F, A], fpDashTsLib.libHKTMod.Kind[F, B]]
}

object Compactable1 {
  @scala.inline
  def apply[F /* <: fpDashTsLib.libHKTMod.URIS */](
    URI: F,
    compact: fpDashTsLib.libHKTMod.Kind[F, fpDashTsLib.libOptionMod.Option[js.Any]] => fpDashTsLib.libHKTMod.Kind[F, js.Any],
    separate: fpDashTsLib.libHKTMod.Kind[F, fpDashTsLib.libEitherMod.Either[js.Any, js.Any]] => Separated[fpDashTsLib.libHKTMod.Kind[F, js.Any], fpDashTsLib.libHKTMod.Kind[F, js.Any]]
  ): Compactable1[F] = {
    val __obj = js.Dynamic.literal(URI = URI.asInstanceOf[js.Any], compact = js.Any.fromFunction1(compact), separate = js.Any.fromFunction1(separate))
  
    __obj.asInstanceOf[Compactable1[F]]
  }
}

