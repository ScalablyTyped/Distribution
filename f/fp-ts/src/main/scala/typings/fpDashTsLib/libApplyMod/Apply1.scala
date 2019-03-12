package typings
package fpDashTsLib.libApplyMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Apply1[F /* <: fpDashTsLib.libHKTMod.URIS */]
  extends fpDashTsLib.libFunctorMod.Functor1[F] {
  def ap[A, B](
    fab: fpDashTsLib.libHKTMod.Type[F, js.Function1[/* a */ A, B]],
    fa: fpDashTsLib.libHKTMod.Type[F, A]
  ): fpDashTsLib.libHKTMod.Type[F, B]
}

object Apply1 {
  @scala.inline
  def apply[F /* <: fpDashTsLib.libHKTMod.URIS */](
    URI: F,
    ap: (fpDashTsLib.libHKTMod.Type[F, js.Function1[js.Any, js.Any]], fpDashTsLib.libHKTMod.Type[F, js.Any]) => fpDashTsLib.libHKTMod.Type[F, js.Any],
    map: (fpDashTsLib.libHKTMod.Type[F, js.Any], js.Function1[js.Any, js.Any]) => fpDashTsLib.libHKTMod.Type[F, js.Any]
  ): Apply1[F] = {
    val __obj = js.Dynamic.literal(URI = URI.asInstanceOf[js.Any], ap = js.Any.fromFunction2(ap), map = js.Any.fromFunction2(map))
  
    __obj.asInstanceOf[Apply1[F]]
  }
}

