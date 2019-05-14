package typings
package fpDashTsLib.es6FoldableMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait FoldableComposition[F, G] extends js.Object {
  def reduce[A, B](
    fga: fpDashTsLib.es6HKTMod.HKT[F, fpDashTsLib.es6HKTMod.HKT[G, A]],
    b: B,
    f: js.Function2[/* b */ B, /* a */ A, B]
  ): B
}

object FoldableComposition {
  @scala.inline
  def apply[F, G](
    reduce: (fpDashTsLib.es6HKTMod.HKT[F, fpDashTsLib.es6HKTMod.HKT[G, js.Any]], js.Any, js.Function2[js.Any, js.Any, js.Any]) => js.Any
  ): FoldableComposition[F, G] = {
    val __obj = js.Dynamic.literal(reduce = js.Any.fromFunction3(reduce))
  
    __obj.asInstanceOf[FoldableComposition[F, G]]
  }
}

