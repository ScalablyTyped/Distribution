package typings
package fpDashTsLib.libContravariantMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait Contravariant1[F /* <: fpDashTsLib.libHKTMod.URIS */] extends js.Object {
  val URI: F
  def contramap[A, B](fa: fpDashTsLib.libHKTMod.Type[F, A], f: js.Function1[/* b */ B, A]): fpDashTsLib.libHKTMod.Type[F, B]
}

