package typings
package fpDashTsLib.libFunctorWithIndexMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait FunctorWithIndexComposition12[F /* <: fpDashTsLib.libHKTMod.URIS */, FI, G /* <: fpDashTsLib.libHKTMod.URIS2 */, GI]
  extends fpDashTsLib.libFunctorMod.FunctorComposition12[F, G] {
  def mapWithIndex[L, A, B](
    fa: fpDashTsLib.libHKTMod.Type[F, fpDashTsLib.libHKTMod.Type2[G, L, A]],
    f: js.Function2[/* i */ js.Tuple2[FI, GI], /* a */ A, B]
  ): fpDashTsLib.libHKTMod.Type[F, fpDashTsLib.libHKTMod.Type2[G, L, B]]
}

object FunctorWithIndexComposition12 {
  @scala.inline
  def apply[F /* <: fpDashTsLib.libHKTMod.URIS */, FI, G /* <: fpDashTsLib.libHKTMod.URIS2 */, GI](
    map: js.Function2[
      fpDashTsLib.libHKTMod.Type[F, fpDashTsLib.libHKTMod.Type2[G, js.Any, js.Any]], 
      js.Function1[js.Any, js.Any], 
      fpDashTsLib.libHKTMod.Type[F, fpDashTsLib.libHKTMod.Type2[G, js.Any, js.Any]]
    ],
    mapWithIndex: js.Function2[
      fpDashTsLib.libHKTMod.Type[F, fpDashTsLib.libHKTMod.Type2[G, js.Any, js.Any]], 
      js.Function2[/* i */ js.Tuple2[FI, GI], js.Any, js.Any], 
      fpDashTsLib.libHKTMod.Type[F, fpDashTsLib.libHKTMod.Type2[G, js.Any, js.Any]]
    ]
  ): FunctorWithIndexComposition12[F, FI, G, GI] = {
    val __obj = js.Dynamic.literal(map = map, mapWithIndex = mapWithIndex)
  
    __obj.asInstanceOf[FunctorWithIndexComposition12[F, FI, G, GI]]
  }
}

