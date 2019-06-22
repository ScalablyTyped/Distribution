package typings
package fpDashTsLib.es6FunctorWithIndexMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait FunctorWithIndexComposition12[F /* <: fpDashTsLib.es6HKTMod.URIS */, FI, G /* <: fpDashTsLib.es6HKTMod.URIS2 */, GI]
  extends fpDashTsLib.es6FunctorMod.FunctorComposition12[F, G] {
  def mapWithIndex[L, A, B](
    fa: fpDashTsLib.es6HKTMod.Kind[F, fpDashTsLib.es6HKTMod.Kind2[G, L, A]],
    f: js.Function2[/* i */ js.Tuple2[FI, GI], /* a */ A, B]
  ): fpDashTsLib.es6HKTMod.Kind[F, fpDashTsLib.es6HKTMod.Kind2[G, L, B]]
}

object FunctorWithIndexComposition12 {
  @scala.inline
  def apply[F /* <: fpDashTsLib.es6HKTMod.URIS */, FI, G /* <: fpDashTsLib.es6HKTMod.URIS2 */, GI](
    map: (fpDashTsLib.es6HKTMod.Kind[F, fpDashTsLib.es6HKTMod.Kind2[G, js.Any, js.Any]], js.Function1[js.Any, js.Any]) => fpDashTsLib.es6HKTMod.Kind[F, fpDashTsLib.es6HKTMod.Kind2[G, js.Any, js.Any]],
    mapWithIndex: (fpDashTsLib.es6HKTMod.Kind[F, fpDashTsLib.es6HKTMod.Kind2[G, js.Any, js.Any]], js.Function2[/* i */ js.Tuple2[FI, GI], js.Any, js.Any]) => fpDashTsLib.es6HKTMod.Kind[F, fpDashTsLib.es6HKTMod.Kind2[G, js.Any, js.Any]]
  ): FunctorWithIndexComposition12[F, FI, G, GI] = {
    val __obj = js.Dynamic.literal(map = js.Any.fromFunction2(map), mapWithIndex = js.Any.fromFunction2(mapWithIndex))
  
    __obj.asInstanceOf[FunctorWithIndexComposition12[F, FI, G, GI]]
  }
}

