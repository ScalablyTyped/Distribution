package typings
package fpDashTsLib.libFunctorWithIndexMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait FunctorWithIndexComposition12C[F /* <: fpDashTsLib.libHKTMod.URIS */, FI, G /* <: fpDashTsLib.libHKTMod.URIS2 */, GI, L]
  extends fpDashTsLib.libFunctorMod.FunctorComposition12C[F, G, L] {
  def mapWithIndex[A, B](
    fa: fpDashTsLib.libHKTMod.Type[F, fpDashTsLib.libHKTMod.Type2[G, L, A]],
    f: js.Function2[/* i */ js.Tuple2[FI, GI], /* a */ A, B]
  ): fpDashTsLib.libHKTMod.Type[F, fpDashTsLib.libHKTMod.Type2[G, L, B]]
}

object FunctorWithIndexComposition12C {
  @scala.inline
  def apply[F /* <: fpDashTsLib.libHKTMod.URIS */, FI, G /* <: fpDashTsLib.libHKTMod.URIS2 */, GI, L](
    map: js.Function2[
      fpDashTsLib.libHKTMod.Type[F, fpDashTsLib.libHKTMod.Type2[G, L, js.Any]], 
      js.Function1[js.Any, js.Any], 
      fpDashTsLib.libHKTMod.Type[F, fpDashTsLib.libHKTMod.Type2[G, L, js.Any]]
    ],
    mapWithIndex: js.Function2[
      fpDashTsLib.libHKTMod.Type[F, fpDashTsLib.libHKTMod.Type2[G, L, js.Any]], 
      js.Function2[/* i */ js.Tuple2[FI, GI], js.Any, js.Any], 
      fpDashTsLib.libHKTMod.Type[F, fpDashTsLib.libHKTMod.Type2[G, L, js.Any]]
    ]
  ): FunctorWithIndexComposition12C[F, FI, G, GI, L] = {
    val __obj = js.Dynamic.literal(map = map, mapWithIndex = mapWithIndex)
  
    __obj.asInstanceOf[FunctorWithIndexComposition12C[F, FI, G, GI, L]]
  }
}

