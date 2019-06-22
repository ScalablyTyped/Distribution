package typings
package fpDashTsLib.es6FoldableMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait FoldableComposition3C1[F /* <: fpDashTsLib.es6HKTMod.URIS3 */, G /* <: fpDashTsLib.es6HKTMod.URIS */, UF, LF] extends js.Object {
  def reduce[A, B](
    fga: fpDashTsLib.es6HKTMod.Kind3[F, UF, LF, fpDashTsLib.es6HKTMod.Kind[G, A]],
    b: B,
    f: js.Function2[/* b */ B, /* a */ A, B]
  ): B
}

object FoldableComposition3C1 {
  @scala.inline
  def apply[F /* <: fpDashTsLib.es6HKTMod.URIS3 */, G /* <: fpDashTsLib.es6HKTMod.URIS */, UF, LF](
    reduce: (fpDashTsLib.es6HKTMod.Kind3[F, UF, LF, fpDashTsLib.es6HKTMod.Kind[G, js.Any]], js.Any, js.Function2[js.Any, js.Any, js.Any]) => js.Any
  ): FoldableComposition3C1[F, G, UF, LF] = {
    val __obj = js.Dynamic.literal(reduce = js.Any.fromFunction3(reduce))
  
    __obj.asInstanceOf[FoldableComposition3C1[F, G, UF, LF]]
  }
}

