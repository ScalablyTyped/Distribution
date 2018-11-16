package typings
package fpDashTsLib.libFoldableMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait Foldable3[F /* <: fpDashTsLib.libHKTMod.URIS3 */] extends js.Object {
  val URI: F
  def reduce[U, L, A, B](fa: fpDashTsLib.libHKTMod.Type3[F, U, L, A], b: B, f: js.Function2[/* b */ B, /* a */ A, B]): B
}

