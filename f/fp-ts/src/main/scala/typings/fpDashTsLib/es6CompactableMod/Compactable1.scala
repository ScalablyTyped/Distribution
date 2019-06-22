package typings
package fpDashTsLib.es6CompactableMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Compactable1[F /* <: fpDashTsLib.es6HKTMod.URIS */] extends js.Object {
  val URI: F
  def compact[A](fa: fpDashTsLib.es6HKTMod.Kind[F, fpDashTsLib.es6OptionMod.Option[A]]): fpDashTsLib.es6HKTMod.Kind[F, A]
  def separate[A, B](fa: fpDashTsLib.es6HKTMod.Kind[F, fpDashTsLib.es6EitherMod.Either[A, B]]): Separated[fpDashTsLib.es6HKTMod.Kind[F, A], fpDashTsLib.es6HKTMod.Kind[F, B]]
}

object Compactable1 {
  @scala.inline
  def apply[F /* <: fpDashTsLib.es6HKTMod.URIS */](
    URI: F,
    compact: fpDashTsLib.es6HKTMod.Kind[F, fpDashTsLib.es6OptionMod.Option[js.Any]] => fpDashTsLib.es6HKTMod.Kind[F, js.Any],
    separate: fpDashTsLib.es6HKTMod.Kind[F, fpDashTsLib.es6EitherMod.Either[js.Any, js.Any]] => Separated[fpDashTsLib.es6HKTMod.Kind[F, js.Any], fpDashTsLib.es6HKTMod.Kind[F, js.Any]]
  ): Compactable1[F] = {
    val __obj = js.Dynamic.literal(URI = URI.asInstanceOf[js.Any], compact = js.Any.fromFunction1(compact), separate = js.Any.fromFunction1(separate))
  
    __obj.asInstanceOf[Compactable1[F]]
  }
}

