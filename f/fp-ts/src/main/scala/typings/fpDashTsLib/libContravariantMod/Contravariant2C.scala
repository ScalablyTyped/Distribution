package typings
package fpDashTsLib.libContravariantMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Contravariant2C[F /* <: fpDashTsLib.libHKTMod.URIS2 */, L] extends js.Object {
  val URI: F
  val _L: L
  def contramap[A, B](fa: fpDashTsLib.libHKTMod.Type2[F, L, A], f: js.Function1[/* b */ B, A]): fpDashTsLib.libHKTMod.Type2[F, L, B]
}

