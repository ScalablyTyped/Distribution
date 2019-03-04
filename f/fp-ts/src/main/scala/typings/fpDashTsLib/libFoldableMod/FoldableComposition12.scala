package typings
package fpDashTsLib.libFoldableMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait FoldableComposition12[F /* <: fpDashTsLib.libHKTMod.URIS */, G /* <: fpDashTsLib.libHKTMod.URIS2 */] extends js.Object {
  def reduce[LG, A, B](
    fga: fpDashTsLib.libHKTMod.Type[F, fpDashTsLib.libHKTMod.Type2[G, LG, A]],
    b: B,
    f: js.Function2[/* b */ B, /* a */ A, B]
  ): B
}

object FoldableComposition12 {
  @scala.inline
  def apply[F /* <: fpDashTsLib.libHKTMod.URIS */, G /* <: fpDashTsLib.libHKTMod.URIS2 */](
    reduce: js.Function3[
      fpDashTsLib.libHKTMod.Type[F, fpDashTsLib.libHKTMod.Type2[G, js.Any, js.Any]], 
      js.Any, 
      js.Function2[js.Any, js.Any, js.Any], 
      js.Any
    ]
  ): FoldableComposition12[F, G] = {
    val __obj = js.Dynamic.literal(reduce = reduce)
  
    __obj.asInstanceOf[FoldableComposition12[F, G]]
  }
}

