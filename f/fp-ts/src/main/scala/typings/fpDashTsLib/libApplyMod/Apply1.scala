package typings
package fpDashTsLib.libApplyMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Apply1[F /* <: fpDashTsLib.libHKTMod.URIS */]
  extends fpDashTsLib.libFunctorMod.Functor1[F] {
  def ap[A, B](
    fab: fpDashTsLib.libHKTMod.Kind[F, js.Function1[/* a */ A, B]],
    fa: fpDashTsLib.libHKTMod.Kind[F, A]
  ): fpDashTsLib.libHKTMod.Kind[F, B]
}

object Apply1 {
  @scala.inline
  def apply[F /* <: fpDashTsLib.libHKTMod.URIS */](
    URI: F,
    ap: (fpDashTsLib.libHKTMod.Kind[F, js.Function1[js.Any, js.Any]], fpDashTsLib.libHKTMod.Kind[F, js.Any]) => fpDashTsLib.libHKTMod.Kind[F, js.Any],
    map: (fpDashTsLib.libHKTMod.Kind[F, js.Any], js.Function1[js.Any, js.Any]) => fpDashTsLib.libHKTMod.Kind[F, js.Any]
  ): Apply1[F] = {
    val __obj = js.Dynamic.literal(URI = URI.asInstanceOf[js.Any], ap = js.Any.fromFunction2(ap), map = js.Any.fromFunction2(map))
  
    __obj.asInstanceOf[Apply1[F]]
  }
}

