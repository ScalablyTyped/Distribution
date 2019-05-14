package typings
package fpDashTsLib.es6ChainMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Chain3[F /* <: fpDashTsLib.es6HKTMod.URIS3 */]
  extends fpDashTsLib.es6ApplyMod.Apply3[F] {
  def chain[U, L, A, B](
    fa: fpDashTsLib.es6HKTMod.Type3[F, U, L, A],
    f: js.Function1[/* a */ A, fpDashTsLib.es6HKTMod.Type3[F, U, L, B]]
  ): fpDashTsLib.es6HKTMod.Type3[F, U, L, B]
}

object Chain3 {
  @scala.inline
  def apply[F /* <: fpDashTsLib.es6HKTMod.URIS3 */](
    URI: F,
    ap: (fpDashTsLib.es6HKTMod.Type3[F, js.Any, js.Any, js.Function1[js.Any, js.Any]], fpDashTsLib.es6HKTMod.Type3[F, js.Any, js.Any, js.Any]) => fpDashTsLib.es6HKTMod.Type3[F, js.Any, js.Any, js.Any],
    chain: (fpDashTsLib.es6HKTMod.Type3[F, js.Any, js.Any, js.Any], js.Function1[js.Any, fpDashTsLib.es6HKTMod.Type3[F, js.Any, js.Any, js.Any]]) => fpDashTsLib.es6HKTMod.Type3[F, js.Any, js.Any, js.Any],
    map: (fpDashTsLib.es6HKTMod.Type3[F, js.Any, js.Any, js.Any], js.Function1[js.Any, js.Any]) => fpDashTsLib.es6HKTMod.Type3[F, js.Any, js.Any, js.Any]
  ): Chain3[F] = {
    val __obj = js.Dynamic.literal(URI = URI.asInstanceOf[js.Any], ap = js.Any.fromFunction2(ap), chain = js.Any.fromFunction2(chain), map = js.Any.fromFunction2(map))
  
    __obj.asInstanceOf[Chain3[F]]
  }
}

