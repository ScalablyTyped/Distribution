package typings
package fpDashTsLib.libFoldableMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait Foldable2[F /* <: fpDashTsLib.libHKTMod.URIS2 */] extends js.Object {
  val URI: F
  def reduce[L, A, B](fa: fpDashTsLib.libHKTMod.Type2[F, L, A], b: B, f: js.Function2[/* b */ B, /* a */ A, B]): B
}

