package typings
package fpDashTsLib.libCompactableMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Compactable1[F /* <: fpDashTsLib.libHKTMod.URIS */] extends js.Object {
  val URI: F
  def compact[A](fa: fpDashTsLib.libHKTMod.Type[F, fpDashTsLib.libOptionMod.Option[A]]): fpDashTsLib.libHKTMod.Type[F, A]
  def separate[A, B](fa: fpDashTsLib.libHKTMod.Type[F, fpDashTsLib.libEitherMod.Either[A, B]]): Separated[fpDashTsLib.libHKTMod.Type[F, A], fpDashTsLib.libHKTMod.Type[F, B]]
}

