package typings
package fpDashTsLib.libMonadMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Monad3[M /* <: fpDashTsLib.libHKTMod.URIS3 */]
  extends fpDashTsLib.libApplicativeMod.Applicative3[M]
     with fpDashTsLib.libChainMod.Chain3[M]

object Monad3 {
  @scala.inline
  def apply[M /* <: fpDashTsLib.libHKTMod.URIS3 */](
    URI: M,
    ap: (fpDashTsLib.libHKTMod.Type3[M, js.Any, js.Any, js.Function1[js.Any, js.Any]], fpDashTsLib.libHKTMod.Type3[M, js.Any, js.Any, js.Any]) => fpDashTsLib.libHKTMod.Type3[M, js.Any, js.Any, js.Any],
    chain: (fpDashTsLib.libHKTMod.Type3[M, js.Any, js.Any, js.Any], js.Function1[js.Any, fpDashTsLib.libHKTMod.Type3[M, js.Any, js.Any, js.Any]]) => fpDashTsLib.libHKTMod.Type3[M, js.Any, js.Any, js.Any],
    map: (fpDashTsLib.libHKTMod.Type3[M, js.Any, js.Any, js.Any], js.Function1[js.Any, js.Any]) => fpDashTsLib.libHKTMod.Type3[M, js.Any, js.Any, js.Any],
    of: js.Any => fpDashTsLib.libHKTMod.Type3[M, js.Any, js.Any, js.Any]
  ): Monad3[M] = {
    val __obj = js.Dynamic.literal(URI = URI.asInstanceOf[js.Any], ap = js.Any.fromFunction2(ap), chain = js.Any.fromFunction2(chain), map = js.Any.fromFunction2(map), of = js.Any.fromFunction1(of))
  
    __obj.asInstanceOf[Monad3[M]]
  }
}

