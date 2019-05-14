package typings
package fpDashTsLib.es6CompactableMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Compactable[F] extends js.Object {
  val URI: F
  /**
    * Compacts a data structure unwrapping inner Option
    */
  def compact[A](fa: fpDashTsLib.es6HKTMod.HKT[F, fpDashTsLib.es6OptionMod.Option[A]]): fpDashTsLib.es6HKTMod.HKT[F, A]
  /**
    * Separates a data structure moving inner Left to the left side and inner Right to the right side of Separated
    */
  def separate[A, B](fa: fpDashTsLib.es6HKTMod.HKT[F, fpDashTsLib.es6EitherMod.Either[A, B]]): Separated[fpDashTsLib.es6HKTMod.HKT[F, A], fpDashTsLib.es6HKTMod.HKT[F, B]]
}

object Compactable {
  @scala.inline
  def apply[F](
    URI: F,
    compact: fpDashTsLib.es6HKTMod.HKT[F, fpDashTsLib.es6OptionMod.Option[js.Any]] => fpDashTsLib.es6HKTMod.HKT[F, js.Any],
    separate: fpDashTsLib.es6HKTMod.HKT[F, fpDashTsLib.es6EitherMod.Either[js.Any, js.Any]] => Separated[fpDashTsLib.es6HKTMod.HKT[F, js.Any], fpDashTsLib.es6HKTMod.HKT[F, js.Any]]
  ): Compactable[F] = {
    val __obj = js.Dynamic.literal(URI = URI.asInstanceOf[js.Any], compact = js.Any.fromFunction1(compact), separate = js.Any.fromFunction1(separate))
  
    __obj.asInstanceOf[Compactable[F]]
  }
}

