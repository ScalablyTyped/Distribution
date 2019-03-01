package typings
package fpDashTsLib.libFoldableMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait FoldableComposition[F, G] extends js.Object {
  def reduce[A, B](
    fga: fpDashTsLib.libHKTMod.HKT[F, fpDashTsLib.libHKTMod.HKT[G, A]],
    b: B,
    f: js.Function2[/* b */ B, /* a */ A, B]
  ): B
}

object FoldableComposition {
  @scala.inline
  def apply[F, G](
    reduce: js.Function3[
      fpDashTsLib.libHKTMod.HKT[F, fpDashTsLib.libHKTMod.HKT[G, js.Any]], 
      js.Any, 
      js.Function2[js.Any, js.Any, js.Any], 
      js.Any
    ]
  ): FoldableComposition[F, G] = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("reduce")(reduce)
    __obj.asInstanceOf[FoldableComposition[F, G]]
  }
}

