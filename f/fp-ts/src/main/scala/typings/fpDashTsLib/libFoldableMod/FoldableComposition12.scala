package typings
package fpDashTsLib.libFoldableMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait FoldableComposition12[F /* <: fpDashTsLib.libHKTMod.URIS */, G /* <: fpDashTsLib.libHKTMod.URIS2 */] extends js.Object {
  def reduce[L, A, B](
    fga: fpDashTsLib.libHKTMod.Type[F, fpDashTsLib.libHKTMod.Type2[G, L, A]],
    b: B,
    f: js.Function2[/* b */ B, /* a */ A, B]
  ): B
}

