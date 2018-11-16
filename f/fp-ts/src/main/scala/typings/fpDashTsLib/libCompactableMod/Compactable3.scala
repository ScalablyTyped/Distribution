package typings
package fpDashTsLib.libCompactableMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait Compactable3[F /* <: fpDashTsLib.libHKTMod.URIS3 */] extends js.Object {
  val URI: F
  def compact[U, L, A](fa: fpDashTsLib.libHKTMod.Type3[F, U, L, fpDashTsLib.libOptionMod.Option[A]]): fpDashTsLib.libHKTMod.Type3[F, U, L, A]
  def separate[U, L, A, B](fa: fpDashTsLib.libHKTMod.Type3[F, U, L, fpDashTsLib.libEitherMod.Either[A, B]]): Separated[fpDashTsLib.libHKTMod.Type3[F, U, L, A], fpDashTsLib.libHKTMod.Type3[F, U, L, B]]
}

