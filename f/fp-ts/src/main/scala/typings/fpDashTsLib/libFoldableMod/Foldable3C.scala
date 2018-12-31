package typings
package fpDashTsLib.libFoldableMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Foldable3C[F /* <: fpDashTsLib.libHKTMod.URIS3 */, U, L] extends js.Object {
  val URI: F
  val _L: L
  val _U: U
  def reduce[A, B](fa: fpDashTsLib.libHKTMod.Type3[F, U, L, A], b: B, f: js.Function2[/* b */ B, /* a */ A, B]): B
}

