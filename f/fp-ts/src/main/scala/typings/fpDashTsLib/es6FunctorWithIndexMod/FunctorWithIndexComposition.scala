package typings
package fpDashTsLib.es6FunctorWithIndexMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait FunctorWithIndexComposition[F, FI, G, GI]
  extends fpDashTsLib.es6FunctorMod.FunctorComposition[F, G] {
  def mapWithIndex[A, B](
    fga: fpDashTsLib.es6HKTMod.HKT[F, fpDashTsLib.es6HKTMod.HKT[G, A]],
    f: js.Function2[/* i */ js.Tuple2[FI, GI], /* a */ A, B]
  ): fpDashTsLib.es6HKTMod.HKT[F, fpDashTsLib.es6HKTMod.HKT[G, B]]
}

object FunctorWithIndexComposition {
  @scala.inline
  def apply[F, FI, G, GI](
    map: (fpDashTsLib.es6HKTMod.HKT[F, fpDashTsLib.es6HKTMod.HKT[G, js.Any]], js.Function1[js.Any, js.Any]) => fpDashTsLib.es6HKTMod.HKT[F, fpDashTsLib.es6HKTMod.HKT[G, js.Any]],
    mapWithIndex: (fpDashTsLib.es6HKTMod.HKT[F, fpDashTsLib.es6HKTMod.HKT[G, js.Any]], js.Function2[/* i */ js.Tuple2[FI, GI], js.Any, js.Any]) => fpDashTsLib.es6HKTMod.HKT[F, fpDashTsLib.es6HKTMod.HKT[G, js.Any]]
  ): FunctorWithIndexComposition[F, FI, G, GI] = {
    val __obj = js.Dynamic.literal(map = js.Any.fromFunction2(map), mapWithIndex = js.Any.fromFunction2(mapWithIndex))
  
    __obj.asInstanceOf[FunctorWithIndexComposition[F, FI, G, GI]]
  }
}

