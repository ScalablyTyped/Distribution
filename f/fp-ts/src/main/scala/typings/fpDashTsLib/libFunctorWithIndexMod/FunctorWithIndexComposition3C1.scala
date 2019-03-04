package typings
package fpDashTsLib.libFunctorWithIndexMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait FunctorWithIndexComposition3C1[F /* <: fpDashTsLib.libHKTMod.URIS3 */, FI, G /* <: fpDashTsLib.libHKTMod.URIS */, GI, UF, LF]
  extends fpDashTsLib.libFunctorMod.FunctorComposition3C1[F, G, UF, LF] {
  def mapWithIndex[A, B](
    fa: fpDashTsLib.libHKTMod.Type3[F, UF, LF, fpDashTsLib.libHKTMod.Type[G, A]],
    f: js.Function2[/* i */ js.Tuple2[FI, GI], /* a */ A, B]
  ): fpDashTsLib.libHKTMod.Type3[F, UF, LF, fpDashTsLib.libHKTMod.Type[G, B]]
}

object FunctorWithIndexComposition3C1 {
  @scala.inline
  def apply[F /* <: fpDashTsLib.libHKTMod.URIS3 */, FI, G /* <: fpDashTsLib.libHKTMod.URIS */, GI, UF, LF](
    map: js.Function2[
      fpDashTsLib.libHKTMod.Type3[F, UF, LF, fpDashTsLib.libHKTMod.Type[G, js.Any]], 
      js.Function1[js.Any, js.Any], 
      fpDashTsLib.libHKTMod.Type3[F, UF, LF, fpDashTsLib.libHKTMod.Type[G, js.Any]]
    ],
    mapWithIndex: js.Function2[
      fpDashTsLib.libHKTMod.Type3[F, UF, LF, fpDashTsLib.libHKTMod.Type[G, js.Any]], 
      js.Function2[/* i */ js.Tuple2[FI, GI], js.Any, js.Any], 
      fpDashTsLib.libHKTMod.Type3[F, UF, LF, fpDashTsLib.libHKTMod.Type[G, js.Any]]
    ]
  ): FunctorWithIndexComposition3C1[F, FI, G, GI, UF, LF] = {
    val __obj = js.Dynamic.literal(map = map, mapWithIndex = mapWithIndex)
  
    __obj.asInstanceOf[FunctorWithIndexComposition3C1[F, FI, G, GI, UF, LF]]
  }
}

