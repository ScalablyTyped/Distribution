package typings
package fpDashTsLib.es6FoldableMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait FoldableComposition22[F /* <: fpDashTsLib.es6HKTMod.URIS2 */, G /* <: fpDashTsLib.es6HKTMod.URIS2 */] extends js.Object {
  def reduce[LF, LG, A, B](
    fga: fpDashTsLib.es6HKTMod.Kind2[F, LF, fpDashTsLib.es6HKTMod.Kind2[G, LG, A]],
    b: B,
    f: js.Function2[/* b */ B, /* a */ A, B]
  ): B
}

object FoldableComposition22 {
  @scala.inline
  def apply[F /* <: fpDashTsLib.es6HKTMod.URIS2 */, G /* <: fpDashTsLib.es6HKTMod.URIS2 */](
    reduce: (fpDashTsLib.es6HKTMod.Kind2[F, js.Any, fpDashTsLib.es6HKTMod.Kind2[G, js.Any, js.Any]], js.Any, js.Function2[js.Any, js.Any, js.Any]) => js.Any
  ): FoldableComposition22[F, G] = {
    val __obj = js.Dynamic.literal(reduce = js.Any.fromFunction3(reduce))
  
    __obj.asInstanceOf[FoldableComposition22[F, G]]
  }
}

