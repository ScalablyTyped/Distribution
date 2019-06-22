package typings
package fpDashTsLib.libFunctorMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait FunctorComposition11[F /* <: fpDashTsLib.libHKTMod.URIS */, G /* <: fpDashTsLib.libHKTMod.URIS */] extends js.Object {
  def map[A, B](fa: fpDashTsLib.libHKTMod.Kind[F, fpDashTsLib.libHKTMod.Kind[G, A]], f: js.Function1[/* a */ A, B]): fpDashTsLib.libHKTMod.Kind[F, fpDashTsLib.libHKTMod.Kind[G, B]]
}

object FunctorComposition11 {
  @scala.inline
  def apply[F /* <: fpDashTsLib.libHKTMod.URIS */, G /* <: fpDashTsLib.libHKTMod.URIS */](
    map: (fpDashTsLib.libHKTMod.Kind[F, fpDashTsLib.libHKTMod.Kind[G, js.Any]], js.Function1[js.Any, js.Any]) => fpDashTsLib.libHKTMod.Kind[F, fpDashTsLib.libHKTMod.Kind[G, js.Any]]
  ): FunctorComposition11[F, G] = {
    val __obj = js.Dynamic.literal(map = js.Any.fromFunction2(map))
  
    __obj.asInstanceOf[FunctorComposition11[F, G]]
  }
}

