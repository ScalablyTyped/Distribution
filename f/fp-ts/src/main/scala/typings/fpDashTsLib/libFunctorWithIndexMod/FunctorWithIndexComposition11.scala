package typings
package fpDashTsLib.libFunctorWithIndexMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait FunctorWithIndexComposition11[F /* <: fpDashTsLib.libHKTMod.URIS */, FI, G /* <: fpDashTsLib.libHKTMod.URIS */, GI]
  extends fpDashTsLib.libFunctorMod.FunctorComposition11[F, G] {
  def mapWithIndex[A, B](
    fa: fpDashTsLib.libHKTMod.Type[F, fpDashTsLib.libHKTMod.Type[G, A]],
    f: js.Function2[/* i */ js.Tuple2[FI, GI], /* a */ A, B]
  ): fpDashTsLib.libHKTMod.Type[F, fpDashTsLib.libHKTMod.Type[G, B]]
}

object FunctorWithIndexComposition11 {
  @scala.inline
  def apply[F /* <: fpDashTsLib.libHKTMod.URIS */, FI, G /* <: fpDashTsLib.libHKTMod.URIS */, GI](
    map: js.Function2[
      fpDashTsLib.libHKTMod.Type[F, fpDashTsLib.libHKTMod.Type[G, js.Any]], 
      js.Function1[js.Any, js.Any], 
      fpDashTsLib.libHKTMod.Type[F, fpDashTsLib.libHKTMod.Type[G, js.Any]]
    ],
    mapWithIndex: js.Function2[
      fpDashTsLib.libHKTMod.Type[F, fpDashTsLib.libHKTMod.Type[G, js.Any]], 
      js.Function2[/* i */ js.Tuple2[FI, GI], js.Any, js.Any], 
      fpDashTsLib.libHKTMod.Type[F, fpDashTsLib.libHKTMod.Type[G, js.Any]]
    ]
  ): FunctorWithIndexComposition11[F, FI, G, GI] = {
    val __obj = js.Dynamic.literal(map = map, mapWithIndex = mapWithIndex)
  
    __obj.asInstanceOf[FunctorWithIndexComposition11[F, FI, G, GI]]
  }
}

