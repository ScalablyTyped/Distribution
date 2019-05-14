package typings
package fpDashTsLib.es6MonadMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Monad2C[M /* <: fpDashTsLib.es6HKTMod.URIS2 */, L]
  extends fpDashTsLib.es6ApplicativeMod.Applicative2C[M, L]
     with fpDashTsLib.es6ChainMod.Chain2C[M, L]

object Monad2C {
  @scala.inline
  def apply[M /* <: fpDashTsLib.es6HKTMod.URIS2 */, L](
    URI: M,
    _L: L,
    ap: (fpDashTsLib.es6HKTMod.Type2[M, L, js.Function1[js.Any, js.Any]], fpDashTsLib.es6HKTMod.Type2[M, L, js.Any]) => fpDashTsLib.es6HKTMod.Type2[M, L, js.Any],
    chain: (fpDashTsLib.es6HKTMod.Type2[M, L, js.Any], js.Function1[js.Any, fpDashTsLib.es6HKTMod.Type2[M, L, js.Any]]) => fpDashTsLib.es6HKTMod.Type2[M, L, js.Any],
    map: (fpDashTsLib.es6HKTMod.Type2[M, L, js.Any], js.Function1[js.Any, js.Any]) => fpDashTsLib.es6HKTMod.Type2[M, L, js.Any],
    of: js.Any => fpDashTsLib.es6HKTMod.Type2[M, L, js.Any]
  ): Monad2C[M, L] = {
    val __obj = js.Dynamic.literal(URI = URI.asInstanceOf[js.Any], _L = _L.asInstanceOf[js.Any], ap = js.Any.fromFunction2(ap), chain = js.Any.fromFunction2(chain), map = js.Any.fromFunction2(map), of = js.Any.fromFunction1(of))
  
    __obj.asInstanceOf[Monad2C[M, L]]
  }
}

