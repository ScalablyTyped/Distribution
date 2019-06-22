package typings
package fpDashTsLib.libFunctorWithIndexMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait FunctorWithIndexComposition2C1[F /* <: fpDashTsLib.libHKTMod.URIS2 */, FI, G /* <: fpDashTsLib.libHKTMod.URIS */, GI, L]
  extends fpDashTsLib.libFunctorMod.FunctorComposition2C1[F, G, L] {
  def mapWithIndex[A, B](
    fa: fpDashTsLib.libHKTMod.Kind2[F, L, fpDashTsLib.libHKTMod.Kind[G, A]],
    f: js.Function2[/* i */ js.Tuple2[FI, GI], /* a */ A, B]
  ): fpDashTsLib.libHKTMod.Kind2[F, L, fpDashTsLib.libHKTMod.Kind[G, B]]
}

object FunctorWithIndexComposition2C1 {
  @scala.inline
  def apply[F /* <: fpDashTsLib.libHKTMod.URIS2 */, FI, G /* <: fpDashTsLib.libHKTMod.URIS */, GI, L](
    map: (fpDashTsLib.libHKTMod.Kind2[F, L, fpDashTsLib.libHKTMod.Kind[G, js.Any]], js.Function1[js.Any, js.Any]) => fpDashTsLib.libHKTMod.Kind2[F, L, fpDashTsLib.libHKTMod.Kind[G, js.Any]],
    mapWithIndex: (fpDashTsLib.libHKTMod.Kind2[F, L, fpDashTsLib.libHKTMod.Kind[G, js.Any]], js.Function2[/* i */ js.Tuple2[FI, GI], js.Any, js.Any]) => fpDashTsLib.libHKTMod.Kind2[F, L, fpDashTsLib.libHKTMod.Kind[G, js.Any]]
  ): FunctorWithIndexComposition2C1[F, FI, G, GI, L] = {
    val __obj = js.Dynamic.literal(map = js.Any.fromFunction2(map), mapWithIndex = js.Any.fromFunction2(mapWithIndex))
  
    __obj.asInstanceOf[FunctorWithIndexComposition2C1[F, FI, G, GI, L]]
  }
}

