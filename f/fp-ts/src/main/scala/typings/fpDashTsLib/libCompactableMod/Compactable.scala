package typings
package fpDashTsLib.libCompactableMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Compactable[F] extends js.Object {
  val URI: F
  /**
    * Compacts a data structure unwrapping inner Option
    */
  def compact[A](fa: fpDashTsLib.libHKTMod.HKT[F, fpDashTsLib.libOptionMod.Option[A]]): fpDashTsLib.libHKTMod.HKT[F, A]
  /**
    * Separates a data structure moving inner Left to the left side and inner Right to the right side of Separated
    */
  def separate[A, B](fa: fpDashTsLib.libHKTMod.HKT[F, fpDashTsLib.libEitherMod.Either[A, B]]): Separated[fpDashTsLib.libHKTMod.HKT[F, A], fpDashTsLib.libHKTMod.HKT[F, B]]
}

object Compactable {
  @scala.inline
  def apply[F](
    URI: F,
    compact: js.Function1[
      fpDashTsLib.libHKTMod.HKT[F, fpDashTsLib.libOptionMod.Option[js.Any]], 
      fpDashTsLib.libHKTMod.HKT[F, js.Any]
    ],
    separate: js.Function1[
      fpDashTsLib.libHKTMod.HKT[F, fpDashTsLib.libEitherMod.Either[js.Any, js.Any]], 
      Separated[fpDashTsLib.libHKTMod.HKT[F, js.Any], fpDashTsLib.libHKTMod.HKT[F, js.Any]]
    ]
  ): Compactable[F] = {
    val __obj = js.Dynamic.literal(URI = URI.asInstanceOf[js.Any], compact = compact, separate = separate)
  
    __obj.asInstanceOf[Compactable[F]]
  }
}

