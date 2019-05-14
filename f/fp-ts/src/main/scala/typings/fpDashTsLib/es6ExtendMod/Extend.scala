package typings
package fpDashTsLib.es6ExtendMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Extend[F]
  extends fpDashTsLib.es6FunctorMod.Functor[F] {
  def extend[A, B](ea: fpDashTsLib.es6HKTMod.HKT[F, A], f: js.Function1[/* fa */ fpDashTsLib.es6HKTMod.HKT[F, A], B]): fpDashTsLib.es6HKTMod.HKT[F, B]
}

object Extend {
  @scala.inline
  def apply[F](
    URI: F,
    extend: (fpDashTsLib.es6HKTMod.HKT[F, js.Any], js.Function1[/* fa */ fpDashTsLib.es6HKTMod.HKT[F, js.Any], js.Any]) => fpDashTsLib.es6HKTMod.HKT[F, js.Any],
    map: (fpDashTsLib.es6HKTMod.HKT[F, js.Any], js.Function1[js.Any, js.Any]) => fpDashTsLib.es6HKTMod.HKT[F, js.Any]
  ): Extend[F] = {
    val __obj = js.Dynamic.literal(URI = URI.asInstanceOf[js.Any], extend = js.Any.fromFunction2(extend), map = js.Any.fromFunction2(map))
  
    __obj.asInstanceOf[Extend[F]]
  }
}

