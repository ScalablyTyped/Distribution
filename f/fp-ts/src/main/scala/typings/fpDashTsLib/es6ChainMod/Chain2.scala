package typings
package fpDashTsLib.es6ChainMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Chain2[F /* <: fpDashTsLib.es6HKTMod.URIS2 */]
  extends fpDashTsLib.es6ApplyMod.Apply2[F] {
  def chain[L, A, B](
    fa: fpDashTsLib.es6HKTMod.Kind2[F, L, A],
    f: js.Function1[/* a */ A, fpDashTsLib.es6HKTMod.Kind2[F, L, B]]
  ): fpDashTsLib.es6HKTMod.Kind2[F, L, B]
}

object Chain2 {
  @scala.inline
  def apply[F /* <: fpDashTsLib.es6HKTMod.URIS2 */](
    URI: F,
    ap: (fpDashTsLib.es6HKTMod.Kind2[F, js.Any, js.Function1[js.Any, js.Any]], fpDashTsLib.es6HKTMod.Kind2[F, js.Any, js.Any]) => fpDashTsLib.es6HKTMod.Kind2[F, js.Any, js.Any],
    chain: (fpDashTsLib.es6HKTMod.Kind2[F, js.Any, js.Any], js.Function1[js.Any, fpDashTsLib.es6HKTMod.Kind2[F, js.Any, js.Any]]) => fpDashTsLib.es6HKTMod.Kind2[F, js.Any, js.Any],
    map: (fpDashTsLib.es6HKTMod.Kind2[F, js.Any, js.Any], js.Function1[js.Any, js.Any]) => fpDashTsLib.es6HKTMod.Kind2[F, js.Any, js.Any]
  ): Chain2[F] = {
    val __obj = js.Dynamic.literal(URI = URI.asInstanceOf[js.Any], ap = js.Any.fromFunction2(ap), chain = js.Any.fromFunction2(chain), map = js.Any.fromFunction2(map))
  
    __obj.asInstanceOf[Chain2[F]]
  }
}

