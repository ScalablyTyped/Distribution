package typings
package fpDashTsLib.es6FunctorWithIndexMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait FunctorWithIndexComposition12C[F /* <: fpDashTsLib.es6HKTMod.URIS */, FI, G /* <: fpDashTsLib.es6HKTMod.URIS2 */, GI, L]
  extends fpDashTsLib.es6FunctorMod.FunctorComposition12C[F, G, L] {
  def mapWithIndex[A, B](
    fa: fpDashTsLib.es6HKTMod.Type[F, fpDashTsLib.es6HKTMod.Type2[G, L, A]],
    f: js.Function2[/* i */ js.Tuple2[FI, GI], /* a */ A, B]
  ): fpDashTsLib.es6HKTMod.Type[F, fpDashTsLib.es6HKTMod.Type2[G, L, B]]
}

object FunctorWithIndexComposition12C {
  @scala.inline
  def apply[F /* <: fpDashTsLib.es6HKTMod.URIS */, FI, G /* <: fpDashTsLib.es6HKTMod.URIS2 */, GI, L](
    map: (fpDashTsLib.es6HKTMod.Type[F, fpDashTsLib.es6HKTMod.Type2[G, L, js.Any]], js.Function1[js.Any, js.Any]) => fpDashTsLib.es6HKTMod.Type[F, fpDashTsLib.es6HKTMod.Type2[G, L, js.Any]],
    mapWithIndex: (fpDashTsLib.es6HKTMod.Type[F, fpDashTsLib.es6HKTMod.Type2[G, L, js.Any]], js.Function2[/* i */ js.Tuple2[FI, GI], js.Any, js.Any]) => fpDashTsLib.es6HKTMod.Type[F, fpDashTsLib.es6HKTMod.Type2[G, L, js.Any]]
  ): FunctorWithIndexComposition12C[F, FI, G, GI, L] = {
    val __obj = js.Dynamic.literal(map = js.Any.fromFunction2(map), mapWithIndex = js.Any.fromFunction2(mapWithIndex))
  
    __obj.asInstanceOf[FunctorWithIndexComposition12C[F, FI, G, GI, L]]
  }
}

