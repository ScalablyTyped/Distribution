package typings
package fpDashTsLib.libFunctorMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait FunctorComposition3C1[F /* <: fpDashTsLib.libHKTMod.URIS3 */, G /* <: fpDashTsLib.libHKTMod.URIS */, UF, LF] extends js.Object {
  def map[A, B](
    fa: fpDashTsLib.libHKTMod.Kind3[F, UF, LF, fpDashTsLib.libHKTMod.Kind[G, A]],
    f: js.Function1[/* a */ A, B]
  ): fpDashTsLib.libHKTMod.Kind3[F, UF, LF, fpDashTsLib.libHKTMod.Kind[G, B]]
}

object FunctorComposition3C1 {
  @scala.inline
  def apply[F /* <: fpDashTsLib.libHKTMod.URIS3 */, G /* <: fpDashTsLib.libHKTMod.URIS */, UF, LF](
    map: (fpDashTsLib.libHKTMod.Kind3[F, UF, LF, fpDashTsLib.libHKTMod.Kind[G, js.Any]], js.Function1[js.Any, js.Any]) => fpDashTsLib.libHKTMod.Kind3[F, UF, LF, fpDashTsLib.libHKTMod.Kind[G, js.Any]]
  ): FunctorComposition3C1[F, G, UF, LF] = {
    val __obj = js.Dynamic.literal(map = js.Any.fromFunction2(map))
  
    __obj.asInstanceOf[FunctorComposition3C1[F, G, UF, LF]]
  }
}

