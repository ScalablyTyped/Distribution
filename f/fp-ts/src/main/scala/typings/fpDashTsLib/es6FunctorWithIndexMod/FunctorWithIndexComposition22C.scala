package typings
package fpDashTsLib.es6FunctorWithIndexMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait FunctorWithIndexComposition22C[F /* <: fpDashTsLib.es6HKTMod.URIS2 */, FI, G /* <: fpDashTsLib.es6HKTMod.URIS2 */, GI, LG]
  extends fpDashTsLib.es6FunctorMod.FunctorComposition22C[F, G, LG] {
  def mapWithIndex[L, A, B](
    fa: fpDashTsLib.es6HKTMod.Kind2[F, L, fpDashTsLib.es6HKTMod.Kind2[G, LG, A]],
    f: js.Function2[/* i */ js.Tuple2[FI, GI], /* a */ A, B]
  ): fpDashTsLib.es6HKTMod.Kind2[F, L, fpDashTsLib.es6HKTMod.Kind2[G, LG, B]]
}

object FunctorWithIndexComposition22C {
  @scala.inline
  def apply[F /* <: fpDashTsLib.es6HKTMod.URIS2 */, FI, G /* <: fpDashTsLib.es6HKTMod.URIS2 */, GI, LG](
    map: (fpDashTsLib.es6HKTMod.Kind2[F, js.Any, fpDashTsLib.es6HKTMod.Kind2[G, LG, js.Any]], js.Function1[js.Any, js.Any]) => fpDashTsLib.es6HKTMod.Kind2[F, js.Any, fpDashTsLib.es6HKTMod.Kind2[G, LG, js.Any]],
    mapWithIndex: (fpDashTsLib.es6HKTMod.Kind2[F, js.Any, fpDashTsLib.es6HKTMod.Kind2[G, LG, js.Any]], js.Function2[/* i */ js.Tuple2[FI, GI], js.Any, js.Any]) => fpDashTsLib.es6HKTMod.Kind2[F, js.Any, fpDashTsLib.es6HKTMod.Kind2[G, LG, js.Any]]
  ): FunctorWithIndexComposition22C[F, FI, G, GI, LG] = {
    val __obj = js.Dynamic.literal(map = js.Any.fromFunction2(map), mapWithIndex = js.Any.fromFunction2(mapWithIndex))
  
    __obj.asInstanceOf[FunctorWithIndexComposition22C[F, FI, G, GI, LG]]
  }
}

