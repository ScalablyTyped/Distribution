package typings
package fpDashTsLib.libFoldableMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait FoldableComposition21[F /* <: fpDashTsLib.libHKTMod.URIS2 */, G /* <: fpDashTsLib.libHKTMod.URIS */] extends js.Object {
  def reduce[LF, A, B](
    fga: fpDashTsLib.libHKTMod.Type2[F, LF, fpDashTsLib.libHKTMod.Type[G, A]],
    b: B,
    f: js.Function2[/* b */ B, /* a */ A, B]
  ): B
}

object FoldableComposition21 {
  @scala.inline
  def apply[F /* <: fpDashTsLib.libHKTMod.URIS2 */, G /* <: fpDashTsLib.libHKTMod.URIS */](
    reduce: js.Function3[
      fpDashTsLib.libHKTMod.Type2[F, js.Any, fpDashTsLib.libHKTMod.Type[G, js.Any]], 
      js.Any, 
      js.Function2[js.Any, js.Any, js.Any], 
      js.Any
    ]
  ): FoldableComposition21[F, G] = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("reduce")(reduce)
    __obj.asInstanceOf[FoldableComposition21[F, G]]
  }
}

