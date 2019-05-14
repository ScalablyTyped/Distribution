package typings
package fpDashTsLib.es6ProfunctorMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Profunctor2C[F /* <: fpDashTsLib.es6HKTMod.URIS2 */, L]
  extends fpDashTsLib.es6FunctorMod.Functor2C[F, L] {
  def promap[A, C, D](
    flc: fpDashTsLib.es6HKTMod.Type2[F, L, C],
    f: js.Function1[/* a */ A, L],
    g: js.Function1[/* c */ C, D]
  ): fpDashTsLib.es6HKTMod.Type2[F, A, D]
}

object Profunctor2C {
  @scala.inline
  def apply[F /* <: fpDashTsLib.es6HKTMod.URIS2 */, L](
    URI: F,
    _L: L,
    map: (fpDashTsLib.es6HKTMod.Type2[F, L, js.Any], js.Function1[js.Any, js.Any]) => fpDashTsLib.es6HKTMod.Type2[F, L, js.Any],
    promap: (fpDashTsLib.es6HKTMod.Type2[F, L, js.Any], js.Function1[js.Any, L], js.Function1[js.Any, js.Any]) => fpDashTsLib.es6HKTMod.Type2[F, js.Any, js.Any]
  ): Profunctor2C[F, L] = {
    val __obj = js.Dynamic.literal(URI = URI.asInstanceOf[js.Any], _L = _L.asInstanceOf[js.Any], map = js.Any.fromFunction2(map), promap = js.Any.fromFunction3(promap))
  
    __obj.asInstanceOf[Profunctor2C[F, L]]
  }
}

