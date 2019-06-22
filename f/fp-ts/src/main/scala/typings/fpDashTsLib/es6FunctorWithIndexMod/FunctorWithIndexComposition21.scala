package typings
package fpDashTsLib.es6FunctorWithIndexMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait FunctorWithIndexComposition21[F /* <: fpDashTsLib.es6HKTMod.URIS2 */, FI, G /* <: fpDashTsLib.es6HKTMod.URIS */, GI]
  extends fpDashTsLib.es6FunctorMod.FunctorComposition21[F, G] {
  def mapWithIndex[L, A, B](
    fa: fpDashTsLib.es6HKTMod.Kind2[F, L, fpDashTsLib.es6HKTMod.Kind[G, A]],
    f: js.Function2[/* i */ js.Tuple2[FI, GI], /* a */ A, B]
  ): fpDashTsLib.es6HKTMod.Kind2[F, L, fpDashTsLib.es6HKTMod.Kind[G, B]]
}

object FunctorWithIndexComposition21 {
  @scala.inline
  def apply[F /* <: fpDashTsLib.es6HKTMod.URIS2 */, FI, G /* <: fpDashTsLib.es6HKTMod.URIS */, GI](
    map: (fpDashTsLib.es6HKTMod.Kind2[F, js.Any, fpDashTsLib.es6HKTMod.Kind[G, js.Any]], js.Function1[js.Any, js.Any]) => fpDashTsLib.es6HKTMod.Kind2[F, js.Any, fpDashTsLib.es6HKTMod.Kind[G, js.Any]],
    mapWithIndex: (fpDashTsLib.es6HKTMod.Kind2[F, js.Any, fpDashTsLib.es6HKTMod.Kind[G, js.Any]], js.Function2[/* i */ js.Tuple2[FI, GI], js.Any, js.Any]) => fpDashTsLib.es6HKTMod.Kind2[F, js.Any, fpDashTsLib.es6HKTMod.Kind[G, js.Any]]
  ): FunctorWithIndexComposition21[F, FI, G, GI] = {
    val __obj = js.Dynamic.literal(map = js.Any.fromFunction2(map), mapWithIndex = js.Any.fromFunction2(mapWithIndex))
  
    __obj.asInstanceOf[FunctorWithIndexComposition21[F, FI, G, GI]]
  }
}

