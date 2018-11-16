package typings
package fpDashTsLib.libFoldableMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait FoldableComposition22[F /* <: fpDashTsLib.libHKTMod.URIS2 */, G /* <: fpDashTsLib.libHKTMod.URIS2 */] extends js.Object {
  def reduce[LF, LG, A, B](
    fga: fpDashTsLib.libHKTMod.Type2[F, LF, fpDashTsLib.libHKTMod.Type2[G, LG, A]],
    b: B,
    f: js.Function2[/* b */ B, /* a */ A, B]
  ): B
}

