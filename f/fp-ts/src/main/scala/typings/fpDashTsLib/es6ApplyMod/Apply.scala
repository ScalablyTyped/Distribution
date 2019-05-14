package typings
package fpDashTsLib.es6ApplyMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Apply[F]
  extends fpDashTsLib.es6FunctorMod.Functor[F] {
  def ap[A, B](fab: fpDashTsLib.es6HKTMod.HKT[F, js.Function1[/* a */ A, B]], fa: fpDashTsLib.es6HKTMod.HKT[F, A]): fpDashTsLib.es6HKTMod.HKT[F, B]
}

object Apply {
  @scala.inline
  def apply[F](
    URI: F,
    ap: (fpDashTsLib.es6HKTMod.HKT[F, js.Function1[js.Any, js.Any]], fpDashTsLib.es6HKTMod.HKT[F, js.Any]) => fpDashTsLib.es6HKTMod.HKT[F, js.Any],
    map: (fpDashTsLib.es6HKTMod.HKT[F, js.Any], js.Function1[js.Any, js.Any]) => fpDashTsLib.es6HKTMod.HKT[F, js.Any]
  ): Apply[F] = {
    val __obj = js.Dynamic.literal(URI = URI.asInstanceOf[js.Any], ap = js.Any.fromFunction2(ap), map = js.Any.fromFunction2(map))
  
    __obj.asInstanceOf[Apply[F]]
  }
}

