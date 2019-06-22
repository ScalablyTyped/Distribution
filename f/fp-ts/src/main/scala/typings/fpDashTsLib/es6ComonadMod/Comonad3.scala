package typings
package fpDashTsLib.es6ComonadMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Comonad3[F /* <: fpDashTsLib.es6HKTMod.URIS3 */]
  extends fpDashTsLib.es6ExtendMod.Extend3[F] {
  def extract[U, L, A](ca: fpDashTsLib.es6HKTMod.Kind3[F, U, L, A]): A
}

object Comonad3 {
  @scala.inline
  def apply[F /* <: fpDashTsLib.es6HKTMod.URIS3 */](
    URI: F,
    extend: (fpDashTsLib.es6HKTMod.Kind3[F, js.Any, js.Any, js.Any], js.Function1[/* fa */ fpDashTsLib.es6HKTMod.Kind3[F, js.Any, js.Any, js.Any], js.Any]) => fpDashTsLib.es6HKTMod.Kind3[F, js.Any, js.Any, js.Any],
    extract: fpDashTsLib.es6HKTMod.Kind3[F, js.Any, js.Any, js.Any] => js.Any,
    map: (fpDashTsLib.es6HKTMod.Kind3[F, js.Any, js.Any, js.Any], js.Function1[js.Any, js.Any]) => fpDashTsLib.es6HKTMod.Kind3[F, js.Any, js.Any, js.Any]
  ): Comonad3[F] = {
    val __obj = js.Dynamic.literal(URI = URI.asInstanceOf[js.Any], extend = js.Any.fromFunction2(extend), extract = js.Any.fromFunction1(extract), map = js.Any.fromFunction2(map))
  
    __obj.asInstanceOf[Comonad3[F]]
  }
}

