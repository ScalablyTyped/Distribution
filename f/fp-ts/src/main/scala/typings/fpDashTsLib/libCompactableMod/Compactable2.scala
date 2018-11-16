package typings
package fpDashTsLib.libCompactableMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait Compactable2[F /* <: fpDashTsLib.libHKTMod.URIS2 */] extends js.Object {
  val URI: F
  def compact[L, A](fa: fpDashTsLib.libHKTMod.Type2[F, L, fpDashTsLib.libOptionMod.Option[A]]): fpDashTsLib.libHKTMod.Type2[F, L, A]
  def separate[L, A, B](fa: fpDashTsLib.libHKTMod.Type2[F, L, fpDashTsLib.libEitherMod.Either[A, B]]): Separated[fpDashTsLib.libHKTMod.Type2[F, L, A], fpDashTsLib.libHKTMod.Type2[F, L, B]]
}

