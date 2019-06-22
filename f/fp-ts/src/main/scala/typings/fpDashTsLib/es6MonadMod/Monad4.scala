package typings
package fpDashTsLib.es6MonadMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Monad4[M /* <: fpDashTsLib.es6HKTMod.URIS4 */]
  extends fpDashTsLib.es6ApplicativeMod.Applicative4[M]
     with fpDashTsLib.es6ChainMod.Chain4[M]

object Monad4 {
  @scala.inline
  def apply[M /* <: fpDashTsLib.es6HKTMod.URIS4 */](
    URI: M,
    ap: (fpDashTsLib.es6HKTMod.Kind4[M, js.Any, js.Any, js.Any, js.Function1[js.Any, js.Any]], fpDashTsLib.es6HKTMod.Kind4[M, js.Any, js.Any, js.Any, js.Any]) => fpDashTsLib.es6HKTMod.Kind4[M, js.Any, js.Any, js.Any, js.Any],
    chain: (fpDashTsLib.es6HKTMod.Kind4[M, js.Any, js.Any, js.Any, js.Any], js.Function1[js.Any, fpDashTsLib.es6HKTMod.Kind4[M, js.Any, js.Any, js.Any, js.Any]]) => fpDashTsLib.es6HKTMod.Kind4[M, js.Any, js.Any, js.Any, js.Any],
    map: (fpDashTsLib.es6HKTMod.Kind4[M, js.Any, js.Any, js.Any, js.Any], js.Function1[js.Any, js.Any]) => fpDashTsLib.es6HKTMod.Kind4[M, js.Any, js.Any, js.Any, js.Any],
    of: js.Any => fpDashTsLib.es6HKTMod.Kind4[M, js.Any, js.Any, js.Any, js.Any]
  ): Monad4[M] = {
    val __obj = js.Dynamic.literal(URI = URI.asInstanceOf[js.Any], ap = js.Any.fromFunction2(ap), chain = js.Any.fromFunction2(chain), map = js.Any.fromFunction2(map), of = js.Any.fromFunction1(of))
  
    __obj.asInstanceOf[Monad4[M]]
  }
}

