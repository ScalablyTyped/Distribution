package typings
package fpDashTsLib.es6ExtendMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Extend3[F /* <: fpDashTsLib.es6HKTMod.URIS3 */]
  extends fpDashTsLib.es6FunctorMod.Functor3[F] {
  def extend[U, L, A, B](
    ea: fpDashTsLib.es6HKTMod.Type3[F, U, L, A],
    f: js.Function1[/* fa */ fpDashTsLib.es6HKTMod.Type3[F, U, L, A], B]
  ): fpDashTsLib.es6HKTMod.Type3[F, U, L, B]
}

object Extend3 {
  @scala.inline
  def apply[F /* <: fpDashTsLib.es6HKTMod.URIS3 */](
    URI: F,
    extend: (fpDashTsLib.es6HKTMod.Type3[F, js.Any, js.Any, js.Any], js.Function1[/* fa */ fpDashTsLib.es6HKTMod.Type3[F, js.Any, js.Any, js.Any], js.Any]) => fpDashTsLib.es6HKTMod.Type3[F, js.Any, js.Any, js.Any],
    map: (fpDashTsLib.es6HKTMod.Type3[F, js.Any, js.Any, js.Any], js.Function1[js.Any, js.Any]) => fpDashTsLib.es6HKTMod.Type3[F, js.Any, js.Any, js.Any]
  ): Extend3[F] = {
    val __obj = js.Dynamic.literal(URI = URI.asInstanceOf[js.Any], extend = js.Any.fromFunction2(extend), map = js.Any.fromFunction2(map))
  
    __obj.asInstanceOf[Extend3[F]]
  }
}

