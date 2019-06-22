package typings
package fpDashTsLib.es6ChainMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Chain4[F /* <: fpDashTsLib.es6HKTMod.URIS4 */]
  extends fpDashTsLib.es6ApplyMod.Apply4[F] {
  def chain[X, U, L, A, B](
    fa: fpDashTsLib.es6HKTMod.Kind4[F, X, U, L, A],
    f: js.Function1[/* a */ A, fpDashTsLib.es6HKTMod.Kind4[F, X, U, L, B]]
  ): fpDashTsLib.es6HKTMod.Kind4[F, X, U, L, B]
}

object Chain4 {
  @scala.inline
  def apply[F /* <: fpDashTsLib.es6HKTMod.URIS4 */](
    URI: F,
    ap: (fpDashTsLib.es6HKTMod.Kind4[F, js.Any, js.Any, js.Any, js.Function1[js.Any, js.Any]], fpDashTsLib.es6HKTMod.Kind4[F, js.Any, js.Any, js.Any, js.Any]) => fpDashTsLib.es6HKTMod.Kind4[F, js.Any, js.Any, js.Any, js.Any],
    chain: (fpDashTsLib.es6HKTMod.Kind4[F, js.Any, js.Any, js.Any, js.Any], js.Function1[js.Any, fpDashTsLib.es6HKTMod.Kind4[F, js.Any, js.Any, js.Any, js.Any]]) => fpDashTsLib.es6HKTMod.Kind4[F, js.Any, js.Any, js.Any, js.Any],
    map: (fpDashTsLib.es6HKTMod.Kind4[F, js.Any, js.Any, js.Any, js.Any], js.Function1[js.Any, js.Any]) => fpDashTsLib.es6HKTMod.Kind4[F, js.Any, js.Any, js.Any, js.Any]
  ): Chain4[F] = {
    val __obj = js.Dynamic.literal(URI = URI.asInstanceOf[js.Any], ap = js.Any.fromFunction2(ap), chain = js.Any.fromFunction2(chain), map = js.Any.fromFunction2(map))
  
    __obj.asInstanceOf[Chain4[F]]
  }
}

