package typings
package fpDashTsLib.libChainMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Chain2[F /* <: fpDashTsLib.libHKTMod.URIS2 */]
  extends fpDashTsLib.libApplyMod.Apply2[F] {
  def chain[L, A, B](
    fa: fpDashTsLib.libHKTMod.Type2[F, L, A],
    f: js.Function1[/* a */ A, fpDashTsLib.libHKTMod.Type2[F, L, B]]
  ): fpDashTsLib.libHKTMod.Type2[F, L, B]
}

object Chain2 {
  @scala.inline
  def apply[F /* <: fpDashTsLib.libHKTMod.URIS2 */](
    URI: F,
    ap: (fpDashTsLib.libHKTMod.Type2[F, js.Any, js.Function1[js.Any, js.Any]], fpDashTsLib.libHKTMod.Type2[F, js.Any, js.Any]) => fpDashTsLib.libHKTMod.Type2[F, js.Any, js.Any],
    chain: (fpDashTsLib.libHKTMod.Type2[F, js.Any, js.Any], js.Function1[js.Any, fpDashTsLib.libHKTMod.Type2[F, js.Any, js.Any]]) => fpDashTsLib.libHKTMod.Type2[F, js.Any, js.Any],
    map: (fpDashTsLib.libHKTMod.Type2[F, js.Any, js.Any], js.Function1[js.Any, js.Any]) => fpDashTsLib.libHKTMod.Type2[F, js.Any, js.Any]
  ): Chain2[F] = {
    val __obj = js.Dynamic.literal(URI = URI.asInstanceOf[js.Any], ap = js.Any.fromFunction2(ap), chain = js.Any.fromFunction2(chain), map = js.Any.fromFunction2(map))
  
    __obj.asInstanceOf[Chain2[F]]
  }
}

