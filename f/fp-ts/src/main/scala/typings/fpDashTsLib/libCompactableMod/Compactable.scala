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

