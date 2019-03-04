package typings
package fpDashTsLib.libFunctorWithIndexMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait FunctorWithIndexComposition[F, FI, G, GI]
  extends fpDashTsLib.libFunctorMod.FunctorComposition[F, G] {
  def mapWithIndex[A, B](
    fga: fpDashTsLib.libHKTMod.HKT[F, fpDashTsLib.libHKTMod.HKT[G, A]],
    f: js.Function2[/* i */ js.Tuple2[FI, GI], /* a */ A, B]
  ): fpDashTsLib.libHKTMod.HKT[F, fpDashTsLib.libHKTMod.HKT[G, B]]
}

object FunctorWithIndexComposition {
  @scala.inline
  def apply[F, FI, G, GI](
    map: js.Function2[
      fpDashTsLib.libHKTMod.HKT[F, fpDashTsLib.libHKTMod.HKT[G, js.Any]], 
      js.Function1[js.Any, js.Any], 
      fpDashTsLib.libHKTMod.HKT[F, fpDashTsLib.libHKTMod.HKT[G, js.Any]]
    ],
    mapWithIndex: js.Function2[
      fpDashTsLib.libHKTMod.HKT[F, fpDashTsLib.libHKTMod.HKT[G, js.Any]], 
      js.Function2[/* i */ js.Tuple2[FI, GI], js.Any, js.Any], 
      fpDashTsLib.libHKTMod.HKT[F, fpDashTsLib.libHKTMod.HKT[G, js.Any]]
    ]
  ): FunctorWithIndexComposition[F, FI, G, GI] = {
    val __obj = js.Dynamic.literal(map = map, mapWithIndex = mapWithIndex)
  
    __obj.asInstanceOf[FunctorWithIndexComposition[F, FI, G, GI]]
  }
}

