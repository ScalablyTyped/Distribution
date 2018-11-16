package typings
package fpDashTsLib.libFoldableMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait FoldableComposition21[F /* <: fpDashTsLib.libHKTMod.URIS2 */, G /* <: fpDashTsLib.libHKTMod.URIS */] extends js.Object {
  def reduce[L, A, B](
    fga: fpDashTsLib.libHKTMod.Type2[F, L, fpDashTsLib.libHKTMod.Type[G, A]],
    b: B,
    f: js.Function2[/* b */ B, /* a */ A, B]
  ): B
}

