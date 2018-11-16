package typings
package fpDashTsLib.libContravariantMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait Contravariant3C[F /* <: fpDashTsLib.libHKTMod.URIS3 */, U, L] extends js.Object {
  val URI: F
  val _L: L
  val _U: U
  def contramap[A, B](fa: fpDashTsLib.libHKTMod.Type3[F, U, L, A], f: js.Function1[/* b */ B, A]): fpDashTsLib.libHKTMod.Type3[F, U, L, B]
}

