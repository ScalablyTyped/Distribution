package typings
package fpDashTsLib.es6CompactableMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Compactable3[F /* <: fpDashTsLib.es6HKTMod.URIS3 */] extends js.Object {
  val URI: F
  def compact[U, L, A](fa: fpDashTsLib.es6HKTMod.Type3[F, U, L, fpDashTsLib.es6OptionMod.Option[A]]): fpDashTsLib.es6HKTMod.Type3[F, U, L, A]
  def separate[U, L, A, B](fa: fpDashTsLib.es6HKTMod.Type3[F, U, L, fpDashTsLib.es6EitherMod.Either[A, B]]): Separated[fpDashTsLib.es6HKTMod.Type3[F, U, L, A], fpDashTsLib.es6HKTMod.Type3[F, U, L, B]]
}

object Compactable3 {
  @scala.inline
  def apply[F /* <: fpDashTsLib.es6HKTMod.URIS3 */](
    URI: F,
    compact: fpDashTsLib.es6HKTMod.Type3[F, js.Any, js.Any, fpDashTsLib.es6OptionMod.Option[js.Any]] => fpDashTsLib.es6HKTMod.Type3[F, js.Any, js.Any, js.Any],
    separate: fpDashTsLib.es6HKTMod.Type3[F, js.Any, js.Any, fpDashTsLib.es6EitherMod.Either[js.Any, js.Any]] => Separated[
      fpDashTsLib.es6HKTMod.Type3[F, js.Any, js.Any, js.Any], 
      fpDashTsLib.es6HKTMod.Type3[F, js.Any, js.Any, js.Any]
    ]
  ): Compactable3[F] = {
    val __obj = js.Dynamic.literal(URI = URI.asInstanceOf[js.Any], compact = js.Any.fromFunction1(compact), separate = js.Any.fromFunction1(separate))
  
    __obj.asInstanceOf[Compactable3[F]]
  }
}

