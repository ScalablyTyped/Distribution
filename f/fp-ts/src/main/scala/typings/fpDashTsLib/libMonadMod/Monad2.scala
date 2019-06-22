package typings
package fpDashTsLib.libMonadMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Monad2[M /* <: fpDashTsLib.libHKTMod.URIS2 */]
  extends fpDashTsLib.libApplicativeMod.Applicative2[M]
     with fpDashTsLib.libChainMod.Chain2[M]

object Monad2 {
  @scala.inline
  def apply[M /* <: fpDashTsLib.libHKTMod.URIS2 */](
    URI: M,
    ap: (fpDashTsLib.libHKTMod.Kind2[M, js.Any, js.Function1[js.Any, js.Any]], fpDashTsLib.libHKTMod.Kind2[M, js.Any, js.Any]) => fpDashTsLib.libHKTMod.Kind2[M, js.Any, js.Any],
    chain: (fpDashTsLib.libHKTMod.Kind2[M, js.Any, js.Any], js.Function1[js.Any, fpDashTsLib.libHKTMod.Kind2[M, js.Any, js.Any]]) => fpDashTsLib.libHKTMod.Kind2[M, js.Any, js.Any],
    map: (fpDashTsLib.libHKTMod.Kind2[M, js.Any, js.Any], js.Function1[js.Any, js.Any]) => fpDashTsLib.libHKTMod.Kind2[M, js.Any, js.Any],
    of: js.Any => fpDashTsLib.libHKTMod.Kind2[M, js.Any, js.Any]
  ): Monad2[M] = {
    val __obj = js.Dynamic.literal(URI = URI.asInstanceOf[js.Any], ap = js.Any.fromFunction2(ap), chain = js.Any.fromFunction2(chain), map = js.Any.fromFunction2(map), of = js.Any.fromFunction1(of))
  
    __obj.asInstanceOf[Monad2[M]]
  }
}

