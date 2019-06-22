package typings
package fpDashTsLib.libCompactableMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Compactable4[F /* <: fpDashTsLib.libHKTMod.URIS4 */] extends js.Object {
  val URI: F
  def compact[X, U, L, A](fa: fpDashTsLib.libHKTMod.Kind4[F, X, U, L, fpDashTsLib.libOptionMod.Option[A]]): fpDashTsLib.libHKTMod.Kind4[F, X, U, L, A]
  def separate[X, U, L, A, B](fa: fpDashTsLib.libHKTMod.Kind4[F, X, U, L, fpDashTsLib.libEitherMod.Either[A, B]]): Separated[
    fpDashTsLib.libHKTMod.Kind4[F, X, U, L, A], 
    fpDashTsLib.libHKTMod.Kind4[F, X, U, L, B]
  ]
}

object Compactable4 {
  @scala.inline
  def apply[F /* <: fpDashTsLib.libHKTMod.URIS4 */](
    URI: F,
    compact: fpDashTsLib.libHKTMod.Kind4[F, js.Any, js.Any, js.Any, fpDashTsLib.libOptionMod.Option[js.Any]] => fpDashTsLib.libHKTMod.Kind4[F, js.Any, js.Any, js.Any, js.Any],
    separate: fpDashTsLib.libHKTMod.Kind4[F, js.Any, js.Any, js.Any, fpDashTsLib.libEitherMod.Either[js.Any, js.Any]] => Separated[
      fpDashTsLib.libHKTMod.Kind4[F, js.Any, js.Any, js.Any, js.Any], 
      fpDashTsLib.libHKTMod.Kind4[F, js.Any, js.Any, js.Any, js.Any]
    ]
  ): Compactable4[F] = {
    val __obj = js.Dynamic.literal(URI = URI.asInstanceOf[js.Any], compact = js.Any.fromFunction1(compact), separate = js.Any.fromFunction1(separate))
  
    __obj.asInstanceOf[Compactable4[F]]
  }
}

