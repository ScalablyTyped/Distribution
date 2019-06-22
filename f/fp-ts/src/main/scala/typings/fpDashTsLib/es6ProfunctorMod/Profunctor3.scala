package typings
package fpDashTsLib.es6ProfunctorMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Profunctor3[F /* <: fpDashTsLib.es6HKTMod.URIS3 */]
  extends fpDashTsLib.es6FunctorMod.Functor3[F] {
  def promap[U, A, B, C, D](
    fbc: fpDashTsLib.es6HKTMod.Kind3[F, U, B, C],
    f: js.Function1[/* a */ A, B],
    g: js.Function1[/* c */ C, D]
  ): fpDashTsLib.es6HKTMod.Kind3[F, U, A, D]
}

object Profunctor3 {
  @scala.inline
  def apply[F /* <: fpDashTsLib.es6HKTMod.URIS3 */](
    URI: F,
    map: (fpDashTsLib.es6HKTMod.Kind3[F, js.Any, js.Any, js.Any], js.Function1[js.Any, js.Any]) => fpDashTsLib.es6HKTMod.Kind3[F, js.Any, js.Any, js.Any],
    promap: (fpDashTsLib.es6HKTMod.Kind3[F, js.Any, js.Any, js.Any], js.Function1[js.Any, js.Any], js.Function1[js.Any, js.Any]) => fpDashTsLib.es6HKTMod.Kind3[F, js.Any, js.Any, js.Any]
  ): Profunctor3[F] = {
    val __obj = js.Dynamic.literal(URI = URI.asInstanceOf[js.Any], map = js.Any.fromFunction2(map), promap = js.Any.fromFunction3(promap))
  
    __obj.asInstanceOf[Profunctor3[F]]
  }
}

