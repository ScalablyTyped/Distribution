package typings
package fpDashTsLib.es6FunctorWithIndexMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait FunctorWithIndexComposition11[F /* <: fpDashTsLib.es6HKTMod.URIS */, FI, G /* <: fpDashTsLib.es6HKTMod.URIS */, GI]
  extends fpDashTsLib.es6FunctorMod.FunctorComposition11[F, G] {
  def mapWithIndex[A, B](
    fa: fpDashTsLib.es6HKTMod.Kind[F, fpDashTsLib.es6HKTMod.Kind[G, A]],
    f: js.Function2[/* i */ js.Tuple2[FI, GI], /* a */ A, B]
  ): fpDashTsLib.es6HKTMod.Kind[F, fpDashTsLib.es6HKTMod.Kind[G, B]]
}

object FunctorWithIndexComposition11 {
  @scala.inline
  def apply[F /* <: fpDashTsLib.es6HKTMod.URIS */, FI, G /* <: fpDashTsLib.es6HKTMod.URIS */, GI](
    map: (fpDashTsLib.es6HKTMod.Kind[F, fpDashTsLib.es6HKTMod.Kind[G, js.Any]], js.Function1[js.Any, js.Any]) => fpDashTsLib.es6HKTMod.Kind[F, fpDashTsLib.es6HKTMod.Kind[G, js.Any]],
    mapWithIndex: (fpDashTsLib.es6HKTMod.Kind[F, fpDashTsLib.es6HKTMod.Kind[G, js.Any]], js.Function2[/* i */ js.Tuple2[FI, GI], js.Any, js.Any]) => fpDashTsLib.es6HKTMod.Kind[F, fpDashTsLib.es6HKTMod.Kind[G, js.Any]]
  ): FunctorWithIndexComposition11[F, FI, G, GI] = {
    val __obj = js.Dynamic.literal(map = js.Any.fromFunction2(map), mapWithIndex = js.Any.fromFunction2(mapWithIndex))
  
    __obj.asInstanceOf[FunctorWithIndexComposition11[F, FI, G, GI]]
  }
}

