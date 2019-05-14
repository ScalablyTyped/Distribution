package typings
package fpDashTsLib.es6CompactableMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Compactable2[F /* <: fpDashTsLib.es6HKTMod.URIS2 */] extends js.Object {
  val URI: F
  def compact[L, A](fa: fpDashTsLib.es6HKTMod.Type2[F, L, fpDashTsLib.es6OptionMod.Option[A]]): fpDashTsLib.es6HKTMod.Type2[F, L, A]
  def separate[L, A, B](fa: fpDashTsLib.es6HKTMod.Type2[F, L, fpDashTsLib.es6EitherMod.Either[A, B]]): Separated[fpDashTsLib.es6HKTMod.Type2[F, L, A], fpDashTsLib.es6HKTMod.Type2[F, L, B]]
}

object Compactable2 {
  @scala.inline
  def apply[F /* <: fpDashTsLib.es6HKTMod.URIS2 */](
    URI: F,
    compact: fpDashTsLib.es6HKTMod.Type2[F, js.Any, fpDashTsLib.es6OptionMod.Option[js.Any]] => fpDashTsLib.es6HKTMod.Type2[F, js.Any, js.Any],
    separate: fpDashTsLib.es6HKTMod.Type2[F, js.Any, fpDashTsLib.es6EitherMod.Either[js.Any, js.Any]] => Separated[
      fpDashTsLib.es6HKTMod.Type2[F, js.Any, js.Any], 
      fpDashTsLib.es6HKTMod.Type2[F, js.Any, js.Any]
    ]
  ): Compactable2[F] = {
    val __obj = js.Dynamic.literal(URI = URI.asInstanceOf[js.Any], compact = js.Any.fromFunction1(compact), separate = js.Any.fromFunction1(separate))
  
    __obj.asInstanceOf[Compactable2[F]]
  }
}

