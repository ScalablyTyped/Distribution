package typings
package fpDashTsLib.libMonadMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Monad3C[M /* <: fpDashTsLib.libHKTMod.URIS3 */, U, L]
  extends fpDashTsLib.libApplicativeMod.Applicative3C[M, U, L]
     with fpDashTsLib.libChainMod.Chain3C[M, U, L]

object Monad3C {
  @scala.inline
  def apply[M /* <: fpDashTsLib.libHKTMod.URIS3 */, U, L](
    URI: M,
    _L: L,
    _U: U,
    ap: (fpDashTsLib.libHKTMod.Type3[M, U, L, js.Function1[js.Any, js.Any]], fpDashTsLib.libHKTMod.Type3[M, U, L, js.Any]) => fpDashTsLib.libHKTMod.Type3[M, U, L, js.Any],
    chain: (fpDashTsLib.libHKTMod.Type3[M, U, L, js.Any], js.Function1[js.Any, fpDashTsLib.libHKTMod.Type3[M, U, L, js.Any]]) => fpDashTsLib.libHKTMod.Type3[M, U, L, js.Any],
    map: (fpDashTsLib.libHKTMod.Type3[M, U, L, js.Any], js.Function1[js.Any, js.Any]) => fpDashTsLib.libHKTMod.Type3[M, U, L, js.Any],
    of: js.Any => fpDashTsLib.libHKTMod.Type3[M, U, L, js.Any]
  ): Monad3C[M, U, L] = {
    val __obj = js.Dynamic.literal(URI = URI.asInstanceOf[js.Any], _L = _L.asInstanceOf[js.Any], _U = _U.asInstanceOf[js.Any], ap = js.Any.fromFunction2(ap), chain = js.Any.fromFunction2(chain), map = js.Any.fromFunction2(map), of = js.Any.fromFunction1(of))
  
    __obj.asInstanceOf[Monad3C[M, U, L]]
  }
}

