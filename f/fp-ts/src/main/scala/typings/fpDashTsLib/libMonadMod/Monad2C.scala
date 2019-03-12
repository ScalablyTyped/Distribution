package typings
package fpDashTsLib.libMonadMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Monad2C[M /* <: fpDashTsLib.libHKTMod.URIS2 */, L]
  extends fpDashTsLib.libApplicativeMod.Applicative2C[M, L]
     with fpDashTsLib.libChainMod.Chain2C[M, L]

object Monad2C {
  @scala.inline
  def apply[M /* <: fpDashTsLib.libHKTMod.URIS2 */, L](
    URI: M,
    _L: L,
    ap: (fpDashTsLib.libHKTMod.Type2[M, L, js.Function1[js.Any, js.Any]], fpDashTsLib.libHKTMod.Type2[M, L, js.Any]) => fpDashTsLib.libHKTMod.Type2[M, L, js.Any],
    chain: (fpDashTsLib.libHKTMod.Type2[M, L, js.Any], js.Function1[js.Any, fpDashTsLib.libHKTMod.Type2[M, L, js.Any]]) => fpDashTsLib.libHKTMod.Type2[M, L, js.Any],
    map: (fpDashTsLib.libHKTMod.Type2[M, L, js.Any], js.Function1[js.Any, js.Any]) => fpDashTsLib.libHKTMod.Type2[M, L, js.Any],
    of: js.Any => fpDashTsLib.libHKTMod.Type2[M, L, js.Any]
  ): Monad2C[M, L] = {
    val __obj = js.Dynamic.literal(URI = URI.asInstanceOf[js.Any], _L = _L.asInstanceOf[js.Any], ap = js.Any.fromFunction2(ap), chain = js.Any.fromFunction2(chain), map = js.Any.fromFunction2(map), of = js.Any.fromFunction1(of))
  
    __obj.asInstanceOf[Monad2C[M, L]]
  }
}

