package typings
package fpDashTsLib.libCompactableMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Compactable2C[F /* <: fpDashTsLib.libHKTMod.URIS2 */, L] extends js.Object {
  val URI: F
  val _L: L
  def compact[A](fa: fpDashTsLib.libHKTMod.Type2[F, L, fpDashTsLib.libOptionMod.Option[A]]): fpDashTsLib.libHKTMod.Type2[F, L, A]
  def separate[A, B](fa: fpDashTsLib.libHKTMod.Type2[F, L, fpDashTsLib.libEitherMod.Either[A, B]]): Separated[fpDashTsLib.libHKTMod.Type2[F, L, A], fpDashTsLib.libHKTMod.Type2[F, L, B]]
}

