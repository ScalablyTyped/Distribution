package typings
package fpDashTsLib.es6MonadMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Monad3C[M /* <: fpDashTsLib.es6HKTMod.URIS3 */, U, L]
  extends fpDashTsLib.es6ApplicativeMod.Applicative3C[M, U, L]
     with fpDashTsLib.es6ChainMod.Chain3C[M, U, L]

object Monad3C {
  @scala.inline
  def apply[M /* <: fpDashTsLib.es6HKTMod.URIS3 */, U, L](
    URI: M,
    _L: L,
    _U: U,
    ap: (fpDashTsLib.es6HKTMod.Type3[M, U, L, js.Function1[js.Any, js.Any]], fpDashTsLib.es6HKTMod.Type3[M, U, L, js.Any]) => fpDashTsLib.es6HKTMod.Type3[M, U, L, js.Any],
    chain: (fpDashTsLib.es6HKTMod.Type3[M, U, L, js.Any], js.Function1[js.Any, fpDashTsLib.es6HKTMod.Type3[M, U, L, js.Any]]) => fpDashTsLib.es6HKTMod.Type3[M, U, L, js.Any],
    map: (fpDashTsLib.es6HKTMod.Type3[M, U, L, js.Any], js.Function1[js.Any, js.Any]) => fpDashTsLib.es6HKTMod.Type3[M, U, L, js.Any],
    of: js.Any => fpDashTsLib.es6HKTMod.Type3[M, U, L, js.Any]
  ): Monad3C[M, U, L] = {
    val __obj = js.Dynamic.literal(URI = URI.asInstanceOf[js.Any], _L = _L.asInstanceOf[js.Any], _U = _U.asInstanceOf[js.Any], ap = js.Any.fromFunction2(ap), chain = js.Any.fromFunction2(chain), map = js.Any.fromFunction2(map), of = js.Any.fromFunction1(of))
  
    __obj.asInstanceOf[Monad3C[M, U, L]]
  }
}

