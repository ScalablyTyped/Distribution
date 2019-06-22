package typings
package fpDashTsLib.es6FunctorWithIndexMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait FunctorWithIndexComposition3C1[F /* <: fpDashTsLib.es6HKTMod.URIS3 */, FI, G /* <: fpDashTsLib.es6HKTMod.URIS */, GI, UF, LF]
  extends fpDashTsLib.es6FunctorMod.FunctorComposition3C1[F, G, UF, LF] {
  def mapWithIndex[A, B](
    fa: fpDashTsLib.es6HKTMod.Kind3[F, UF, LF, fpDashTsLib.es6HKTMod.Kind[G, A]],
    f: js.Function2[/* i */ js.Tuple2[FI, GI], /* a */ A, B]
  ): fpDashTsLib.es6HKTMod.Kind3[F, UF, LF, fpDashTsLib.es6HKTMod.Kind[G, B]]
}

object FunctorWithIndexComposition3C1 {
  @scala.inline
  def apply[F /* <: fpDashTsLib.es6HKTMod.URIS3 */, FI, G /* <: fpDashTsLib.es6HKTMod.URIS */, GI, UF, LF](
    map: (fpDashTsLib.es6HKTMod.Kind3[F, UF, LF, fpDashTsLib.es6HKTMod.Kind[G, js.Any]], js.Function1[js.Any, js.Any]) => fpDashTsLib.es6HKTMod.Kind3[F, UF, LF, fpDashTsLib.es6HKTMod.Kind[G, js.Any]],
    mapWithIndex: (fpDashTsLib.es6HKTMod.Kind3[F, UF, LF, fpDashTsLib.es6HKTMod.Kind[G, js.Any]], js.Function2[/* i */ js.Tuple2[FI, GI], js.Any, js.Any]) => fpDashTsLib.es6HKTMod.Kind3[F, UF, LF, fpDashTsLib.es6HKTMod.Kind[G, js.Any]]
  ): FunctorWithIndexComposition3C1[F, FI, G, GI, UF, LF] = {
    val __obj = js.Dynamic.literal(map = js.Any.fromFunction2(map), mapWithIndex = js.Any.fromFunction2(mapWithIndex))
  
    __obj.asInstanceOf[FunctorWithIndexComposition3C1[F, FI, G, GI, UF, LF]]
  }
}

