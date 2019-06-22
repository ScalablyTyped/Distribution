package typings
package fpDashTsLib.es6FoldableMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait FoldableComposition12[F /* <: fpDashTsLib.es6HKTMod.URIS */, G /* <: fpDashTsLib.es6HKTMod.URIS2 */] extends js.Object {
  def reduce[LG, A, B](
    fga: fpDashTsLib.es6HKTMod.Kind[F, fpDashTsLib.es6HKTMod.Kind2[G, LG, A]],
    b: B,
    f: js.Function2[/* b */ B, /* a */ A, B]
  ): B
}

object FoldableComposition12 {
  @scala.inline
  def apply[F /* <: fpDashTsLib.es6HKTMod.URIS */, G /* <: fpDashTsLib.es6HKTMod.URIS2 */](
    reduce: (fpDashTsLib.es6HKTMod.Kind[F, fpDashTsLib.es6HKTMod.Kind2[G, js.Any, js.Any]], js.Any, js.Function2[js.Any, js.Any, js.Any]) => js.Any
  ): FoldableComposition12[F, G] = {
    val __obj = js.Dynamic.literal(reduce = js.Any.fromFunction3(reduce))
  
    __obj.asInstanceOf[FoldableComposition12[F, G]]
  }
}

