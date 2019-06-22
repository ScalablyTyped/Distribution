package typings
package fpDashTsLib.libFunctorMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait FunctorComposition22C[F /* <: fpDashTsLib.libHKTMod.URIS2 */, G /* <: fpDashTsLib.libHKTMod.URIS2 */, LG] extends js.Object {
  def map[LF, A, B](
    fa: fpDashTsLib.libHKTMod.Kind2[F, LF, fpDashTsLib.libHKTMod.Kind2[G, LG, A]],
    f: js.Function1[/* a */ A, B]
  ): fpDashTsLib.libHKTMod.Kind2[F, LF, fpDashTsLib.libHKTMod.Kind2[G, LG, B]]
}

object FunctorComposition22C {
  @scala.inline
  def apply[F /* <: fpDashTsLib.libHKTMod.URIS2 */, G /* <: fpDashTsLib.libHKTMod.URIS2 */, LG](
    map: (fpDashTsLib.libHKTMod.Kind2[F, js.Any, fpDashTsLib.libHKTMod.Kind2[G, LG, js.Any]], js.Function1[js.Any, js.Any]) => fpDashTsLib.libHKTMod.Kind2[F, js.Any, fpDashTsLib.libHKTMod.Kind2[G, LG, js.Any]]
  ): FunctorComposition22C[F, G, LG] = {
    val __obj = js.Dynamic.literal(map = js.Any.fromFunction2(map))
  
    __obj.asInstanceOf[FunctorComposition22C[F, G, LG]]
  }
}

