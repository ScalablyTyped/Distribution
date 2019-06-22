package typings
package fpDashTsLib.es6MonadMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Monad3[M /* <: fpDashTsLib.es6HKTMod.URIS3 */]
  extends fpDashTsLib.es6ApplicativeMod.Applicative3[M]
     with fpDashTsLib.es6ChainMod.Chain3[M]

object Monad3 {
  @scala.inline
  def apply[M /* <: fpDashTsLib.es6HKTMod.URIS3 */](
    URI: M,
    ap: (fpDashTsLib.es6HKTMod.Kind3[M, js.Any, js.Any, js.Function1[js.Any, js.Any]], fpDashTsLib.es6HKTMod.Kind3[M, js.Any, js.Any, js.Any]) => fpDashTsLib.es6HKTMod.Kind3[M, js.Any, js.Any, js.Any],
    chain: (fpDashTsLib.es6HKTMod.Kind3[M, js.Any, js.Any, js.Any], js.Function1[js.Any, fpDashTsLib.es6HKTMod.Kind3[M, js.Any, js.Any, js.Any]]) => fpDashTsLib.es6HKTMod.Kind3[M, js.Any, js.Any, js.Any],
    map: (fpDashTsLib.es6HKTMod.Kind3[M, js.Any, js.Any, js.Any], js.Function1[js.Any, js.Any]) => fpDashTsLib.es6HKTMod.Kind3[M, js.Any, js.Any, js.Any],
    of: js.Any => fpDashTsLib.es6HKTMod.Kind3[M, js.Any, js.Any, js.Any]
  ): Monad3[M] = {
    val __obj = js.Dynamic.literal(URI = URI.asInstanceOf[js.Any], ap = js.Any.fromFunction2(ap), chain = js.Any.fromFunction2(chain), map = js.Any.fromFunction2(map), of = js.Any.fromFunction1(of))
  
    __obj.asInstanceOf[Monad3[M]]
  }
}

