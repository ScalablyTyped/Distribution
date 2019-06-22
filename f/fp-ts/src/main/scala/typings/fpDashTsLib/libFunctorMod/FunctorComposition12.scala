package typings
package fpDashTsLib.libFunctorMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait FunctorComposition12[F /* <: fpDashTsLib.libHKTMod.URIS */, G /* <: fpDashTsLib.libHKTMod.URIS2 */] extends js.Object {
  def map[LG, A, B](
    fa: fpDashTsLib.libHKTMod.Kind[F, fpDashTsLib.libHKTMod.Kind2[G, LG, A]],
    f: js.Function1[/* a */ A, B]
  ): fpDashTsLib.libHKTMod.Kind[F, fpDashTsLib.libHKTMod.Kind2[G, LG, B]]
}

object FunctorComposition12 {
  @scala.inline
  def apply[F /* <: fpDashTsLib.libHKTMod.URIS */, G /* <: fpDashTsLib.libHKTMod.URIS2 */](
    map: (fpDashTsLib.libHKTMod.Kind[F, fpDashTsLib.libHKTMod.Kind2[G, js.Any, js.Any]], js.Function1[js.Any, js.Any]) => fpDashTsLib.libHKTMod.Kind[F, fpDashTsLib.libHKTMod.Kind2[G, js.Any, js.Any]]
  ): FunctorComposition12[F, G] = {
    val __obj = js.Dynamic.literal(map = js.Any.fromFunction2(map))
  
    __obj.asInstanceOf[FunctorComposition12[F, G]]
  }
}

