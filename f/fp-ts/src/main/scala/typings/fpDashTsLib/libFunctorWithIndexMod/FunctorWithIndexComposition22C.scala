package typings
package fpDashTsLib.libFunctorWithIndexMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait FunctorWithIndexComposition22C[F /* <: fpDashTsLib.libHKTMod.URIS2 */, FI, G /* <: fpDashTsLib.libHKTMod.URIS2 */, GI, LG]
  extends fpDashTsLib.libFunctorMod.FunctorComposition22C[F, G, LG] {
  def mapWithIndex[L, A, B](
    fa: fpDashTsLib.libHKTMod.Kind2[F, L, fpDashTsLib.libHKTMod.Kind2[G, LG, A]],
    f: js.Function2[/* i */ js.Tuple2[FI, GI], /* a */ A, B]
  ): fpDashTsLib.libHKTMod.Kind2[F, L, fpDashTsLib.libHKTMod.Kind2[G, LG, B]]
}

object FunctorWithIndexComposition22C {
  @scala.inline
  def apply[F /* <: fpDashTsLib.libHKTMod.URIS2 */, FI, G /* <: fpDashTsLib.libHKTMod.URIS2 */, GI, LG](
    map: (fpDashTsLib.libHKTMod.Kind2[F, js.Any, fpDashTsLib.libHKTMod.Kind2[G, LG, js.Any]], js.Function1[js.Any, js.Any]) => fpDashTsLib.libHKTMod.Kind2[F, js.Any, fpDashTsLib.libHKTMod.Kind2[G, LG, js.Any]],
    mapWithIndex: (fpDashTsLib.libHKTMod.Kind2[F, js.Any, fpDashTsLib.libHKTMod.Kind2[G, LG, js.Any]], js.Function2[/* i */ js.Tuple2[FI, GI], js.Any, js.Any]) => fpDashTsLib.libHKTMod.Kind2[F, js.Any, fpDashTsLib.libHKTMod.Kind2[G, LG, js.Any]]
  ): FunctorWithIndexComposition22C[F, FI, G, GI, LG] = {
    val __obj = js.Dynamic.literal(map = js.Any.fromFunction2(map), mapWithIndex = js.Any.fromFunction2(mapWithIndex))
  
    __obj.asInstanceOf[FunctorWithIndexComposition22C[F, FI, G, GI, LG]]
  }
}

