package typings
package fpDashTsLib.libChainMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Chain2C[F /* <: fpDashTsLib.libHKTMod.URIS2 */, L]
  extends fpDashTsLib.libApplyMod.Apply2C[F, L] {
  def chain[A, B](
    fa: fpDashTsLib.libHKTMod.Kind2[F, L, A],
    f: js.Function1[/* a */ A, fpDashTsLib.libHKTMod.Kind2[F, L, B]]
  ): fpDashTsLib.libHKTMod.Kind2[F, L, B]
}

object Chain2C {
  @scala.inline
  def apply[F /* <: fpDashTsLib.libHKTMod.URIS2 */, L](
    URI: F,
    _L: L,
    ap: (fpDashTsLib.libHKTMod.Kind2[F, L, js.Function1[js.Any, js.Any]], fpDashTsLib.libHKTMod.Kind2[F, L, js.Any]) => fpDashTsLib.libHKTMod.Kind2[F, L, js.Any],
    chain: (fpDashTsLib.libHKTMod.Kind2[F, L, js.Any], js.Function1[js.Any, fpDashTsLib.libHKTMod.Kind2[F, L, js.Any]]) => fpDashTsLib.libHKTMod.Kind2[F, L, js.Any],
    map: (fpDashTsLib.libHKTMod.Kind2[F, L, js.Any], js.Function1[js.Any, js.Any]) => fpDashTsLib.libHKTMod.Kind2[F, L, js.Any]
  ): Chain2C[F, L] = {
    val __obj = js.Dynamic.literal(URI = URI.asInstanceOf[js.Any], _L = _L.asInstanceOf[js.Any], ap = js.Any.fromFunction2(ap), chain = js.Any.fromFunction2(chain), map = js.Any.fromFunction2(map))
  
    __obj.asInstanceOf[Chain2C[F, L]]
  }
}

