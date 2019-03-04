package typings
package fpDashTsLib.libFunctorWithIndexMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait FunctorWithIndexComposition21[F /* <: fpDashTsLib.libHKTMod.URIS2 */, FI, G /* <: fpDashTsLib.libHKTMod.URIS */, GI]
  extends fpDashTsLib.libFunctorMod.FunctorComposition21[F, G] {
  def mapWithIndex[L, A, B](
    fa: fpDashTsLib.libHKTMod.Type2[F, L, fpDashTsLib.libHKTMod.Type[G, A]],
    f: js.Function2[/* i */ js.Tuple2[FI, GI], /* a */ A, B]
  ): fpDashTsLib.libHKTMod.Type2[F, L, fpDashTsLib.libHKTMod.Type[G, B]]
}

object FunctorWithIndexComposition21 {
  @scala.inline
  def apply[F /* <: fpDashTsLib.libHKTMod.URIS2 */, FI, G /* <: fpDashTsLib.libHKTMod.URIS */, GI](
    map: js.Function2[
      fpDashTsLib.libHKTMod.Type2[F, js.Any, fpDashTsLib.libHKTMod.Type[G, js.Any]], 
      js.Function1[js.Any, js.Any], 
      fpDashTsLib.libHKTMod.Type2[F, js.Any, fpDashTsLib.libHKTMod.Type[G, js.Any]]
    ],
    mapWithIndex: js.Function2[
      fpDashTsLib.libHKTMod.Type2[F, js.Any, fpDashTsLib.libHKTMod.Type[G, js.Any]], 
      js.Function2[/* i */ js.Tuple2[FI, GI], js.Any, js.Any], 
      fpDashTsLib.libHKTMod.Type2[F, js.Any, fpDashTsLib.libHKTMod.Type[G, js.Any]]
    ]
  ): FunctorWithIndexComposition21[F, FI, G, GI] = {
    val __obj = js.Dynamic.literal(map = map, mapWithIndex = mapWithIndex)
  
    __obj.asInstanceOf[FunctorWithIndexComposition21[F, FI, G, GI]]
  }
}

