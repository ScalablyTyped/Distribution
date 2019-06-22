package typings
package fpDashTsLib.libMonadMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Monad1[F /* <: fpDashTsLib.libHKTMod.URIS */]
  extends fpDashTsLib.libApplicativeMod.Applicative1[F]
     with fpDashTsLib.libChainMod.Chain1[F]

object Monad1 {
  @scala.inline
  def apply[F /* <: fpDashTsLib.libHKTMod.URIS */](
    URI: F,
    ap: (fpDashTsLib.libHKTMod.Kind[F, js.Function1[js.Any, js.Any]], fpDashTsLib.libHKTMod.Kind[F, js.Any]) => fpDashTsLib.libHKTMod.Kind[F, js.Any],
    chain: (fpDashTsLib.libHKTMod.Kind[F, js.Any], js.Function1[js.Any, fpDashTsLib.libHKTMod.Kind[F, js.Any]]) => fpDashTsLib.libHKTMod.Kind[F, js.Any],
    map: (fpDashTsLib.libHKTMod.Kind[F, js.Any], js.Function1[js.Any, js.Any]) => fpDashTsLib.libHKTMod.Kind[F, js.Any],
    of: js.Any => fpDashTsLib.libHKTMod.Kind[F, js.Any]
  ): Monad1[F] = {
    val __obj = js.Dynamic.literal(URI = URI.asInstanceOf[js.Any], ap = js.Any.fromFunction2(ap), chain = js.Any.fromFunction2(chain), map = js.Any.fromFunction2(map), of = js.Any.fromFunction1(of))
  
    __obj.asInstanceOf[Monad1[F]]
  }
}

