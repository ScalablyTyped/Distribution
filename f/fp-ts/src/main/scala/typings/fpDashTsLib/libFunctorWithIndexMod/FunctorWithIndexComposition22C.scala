package typings
package fpDashTsLib.libFunctorWithIndexMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait FunctorWithIndexComposition22C[F /* <: fpDashTsLib.libHKTMod.URIS2 */, FI, G /* <: fpDashTsLib.libHKTMod.URIS2 */, GI, LG]
  extends fpDashTsLib.libFunctorMod.FunctorComposition22C[F, G, LG] {
  def mapWithIndex[L, A, B](
    fa: fpDashTsLib.libHKTMod.Type2[F, L, fpDashTsLib.libHKTMod.Type2[G, LG, A]],
    f: js.Function2[/* i */ js.Tuple2[FI, GI], /* a */ A, B]
  ): fpDashTsLib.libHKTMod.Type2[F, L, fpDashTsLib.libHKTMod.Type2[G, LG, B]]
}

object FunctorWithIndexComposition22C {
  @scala.inline
  def apply[F /* <: fpDashTsLib.libHKTMod.URIS2 */, FI, G /* <: fpDashTsLib.libHKTMod.URIS2 */, GI, LG](
    map: js.Function2[
      fpDashTsLib.libHKTMod.Type2[F, js.Any, fpDashTsLib.libHKTMod.Type2[G, LG, js.Any]], 
      js.Function1[js.Any, js.Any], 
      fpDashTsLib.libHKTMod.Type2[F, js.Any, fpDashTsLib.libHKTMod.Type2[G, LG, js.Any]]
    ],
    mapWithIndex: js.Function2[
      fpDashTsLib.libHKTMod.Type2[F, js.Any, fpDashTsLib.libHKTMod.Type2[G, LG, js.Any]], 
      js.Function2[/* i */ js.Tuple2[FI, GI], js.Any, js.Any], 
      fpDashTsLib.libHKTMod.Type2[F, js.Any, fpDashTsLib.libHKTMod.Type2[G, LG, js.Any]]
    ]
  ): FunctorWithIndexComposition22C[F, FI, G, GI, LG] = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("map")(map)
    __obj.updateDynamic("mapWithIndex")(mapWithIndex)
    __obj.asInstanceOf[FunctorWithIndexComposition22C[F, FI, G, GI, LG]]
  }
}

