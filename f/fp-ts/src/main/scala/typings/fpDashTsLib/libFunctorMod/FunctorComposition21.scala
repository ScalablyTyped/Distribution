package typings
package fpDashTsLib.libFunctorMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait FunctorComposition21[F /* <: fpDashTsLib.libHKTMod.URIS2 */, G /* <: fpDashTsLib.libHKTMod.URIS */] extends js.Object {
  def map[LF, A, B](
    fa: fpDashTsLib.libHKTMod.Kind2[F, LF, fpDashTsLib.libHKTMod.Kind[G, A]],
    f: js.Function1[/* a */ A, B]
  ): fpDashTsLib.libHKTMod.Kind2[F, LF, fpDashTsLib.libHKTMod.Kind[G, B]]
}

object FunctorComposition21 {
  @scala.inline
  def apply[F /* <: fpDashTsLib.libHKTMod.URIS2 */, G /* <: fpDashTsLib.libHKTMod.URIS */](
    map: (fpDashTsLib.libHKTMod.Kind2[F, js.Any, fpDashTsLib.libHKTMod.Kind[G, js.Any]], js.Function1[js.Any, js.Any]) => fpDashTsLib.libHKTMod.Kind2[F, js.Any, fpDashTsLib.libHKTMod.Kind[G, js.Any]]
  ): FunctorComposition21[F, G] = {
    val __obj = js.Dynamic.literal(map = js.Any.fromFunction2(map))
  
    __obj.asInstanceOf[FunctorComposition21[F, G]]
  }
}

