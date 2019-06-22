package typings
package fpDashTsLib.libChainMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Chain4[F /* <: fpDashTsLib.libHKTMod.URIS4 */]
  extends fpDashTsLib.libApplyMod.Apply4[F] {
  def chain[X, U, L, A, B](
    fa: fpDashTsLib.libHKTMod.Kind4[F, X, U, L, A],
    f: js.Function1[/* a */ A, fpDashTsLib.libHKTMod.Kind4[F, X, U, L, B]]
  ): fpDashTsLib.libHKTMod.Kind4[F, X, U, L, B]
}

object Chain4 {
  @scala.inline
  def apply[F /* <: fpDashTsLib.libHKTMod.URIS4 */](
    URI: F,
    ap: (fpDashTsLib.libHKTMod.Kind4[F, js.Any, js.Any, js.Any, js.Function1[js.Any, js.Any]], fpDashTsLib.libHKTMod.Kind4[F, js.Any, js.Any, js.Any, js.Any]) => fpDashTsLib.libHKTMod.Kind4[F, js.Any, js.Any, js.Any, js.Any],
    chain: (fpDashTsLib.libHKTMod.Kind4[F, js.Any, js.Any, js.Any, js.Any], js.Function1[js.Any, fpDashTsLib.libHKTMod.Kind4[F, js.Any, js.Any, js.Any, js.Any]]) => fpDashTsLib.libHKTMod.Kind4[F, js.Any, js.Any, js.Any, js.Any],
    map: (fpDashTsLib.libHKTMod.Kind4[F, js.Any, js.Any, js.Any, js.Any], js.Function1[js.Any, js.Any]) => fpDashTsLib.libHKTMod.Kind4[F, js.Any, js.Any, js.Any, js.Any]
  ): Chain4[F] = {
    val __obj = js.Dynamic.literal(URI = URI.asInstanceOf[js.Any], ap = js.Any.fromFunction2(ap), chain = js.Any.fromFunction2(chain), map = js.Any.fromFunction2(map))
  
    __obj.asInstanceOf[Chain4[F]]
  }
}

