package typings
package fpDashTsLib.libApplyMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Apply[F]
  extends fpDashTsLib.libFunctorMod.Functor[F] {
  def ap[A, B](fab: fpDashTsLib.libHKTMod.HKT[F, js.Function1[/* a */ A, B]], fa: fpDashTsLib.libHKTMod.HKT[F, A]): fpDashTsLib.libHKTMod.HKT[F, B]
}

object Apply {
  @scala.inline
  def apply[F](
    URI: F,
    ap: (fpDashTsLib.libHKTMod.HKT[F, js.Function1[js.Any, js.Any]], fpDashTsLib.libHKTMod.HKT[F, js.Any]) => fpDashTsLib.libHKTMod.HKT[F, js.Any],
    map: (fpDashTsLib.libHKTMod.HKT[F, js.Any], js.Function1[js.Any, js.Any]) => fpDashTsLib.libHKTMod.HKT[F, js.Any]
  ): Apply[F] = {
    val __obj = js.Dynamic.literal(URI = URI.asInstanceOf[js.Any], ap = js.Any.fromFunction2(ap), map = js.Any.fromFunction2(map))
  
    __obj.asInstanceOf[Apply[F]]
  }
}

