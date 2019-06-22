package typings
package fpDashTsLib.es6ComonadMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Comonad2[F /* <: fpDashTsLib.es6HKTMod.URIS2 */]
  extends fpDashTsLib.es6ExtendMod.Extend2[F] {
  def extract[L, A](ca: fpDashTsLib.es6HKTMod.Kind2[F, L, A]): A
}

object Comonad2 {
  @scala.inline
  def apply[F /* <: fpDashTsLib.es6HKTMod.URIS2 */](
    URI: F,
    extend: (fpDashTsLib.es6HKTMod.Kind2[F, js.Any, js.Any], js.Function1[/* fa */ fpDashTsLib.es6HKTMod.Kind2[F, js.Any, js.Any], js.Any]) => fpDashTsLib.es6HKTMod.Kind2[F, js.Any, js.Any],
    extract: fpDashTsLib.es6HKTMod.Kind2[F, js.Any, js.Any] => js.Any,
    map: (fpDashTsLib.es6HKTMod.Kind2[F, js.Any, js.Any], js.Function1[js.Any, js.Any]) => fpDashTsLib.es6HKTMod.Kind2[F, js.Any, js.Any]
  ): Comonad2[F] = {
    val __obj = js.Dynamic.literal(URI = URI.asInstanceOf[js.Any], extend = js.Any.fromFunction2(extend), extract = js.Any.fromFunction1(extract), map = js.Any.fromFunction2(map))
  
    __obj.asInstanceOf[Comonad2[F]]
  }
}

