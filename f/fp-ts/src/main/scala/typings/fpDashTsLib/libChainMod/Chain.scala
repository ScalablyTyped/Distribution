package typings
package fpDashTsLib.libChainMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Chain[F]
  extends fpDashTsLib.libApplyMod.Apply[F] {
  def chain[A, B](fa: fpDashTsLib.libHKTMod.HKT[F, A], f: js.Function1[/* a */ A, fpDashTsLib.libHKTMod.HKT[F, B]]): fpDashTsLib.libHKTMod.HKT[F, B]
}

object Chain {
  @scala.inline
  def apply[F](
    URI: F,
    ap: (fpDashTsLib.libHKTMod.HKT[F, js.Function1[js.Any, js.Any]], fpDashTsLib.libHKTMod.HKT[F, js.Any]) => fpDashTsLib.libHKTMod.HKT[F, js.Any],
    chain: (fpDashTsLib.libHKTMod.HKT[F, js.Any], js.Function1[js.Any, fpDashTsLib.libHKTMod.HKT[F, js.Any]]) => fpDashTsLib.libHKTMod.HKT[F, js.Any],
    map: (fpDashTsLib.libHKTMod.HKT[F, js.Any], js.Function1[js.Any, js.Any]) => fpDashTsLib.libHKTMod.HKT[F, js.Any]
  ): Chain[F] = {
    val __obj = js.Dynamic.literal(URI = URI.asInstanceOf[js.Any], ap = js.Any.fromFunction2(ap), chain = js.Any.fromFunction2(chain), map = js.Any.fromFunction2(map))
  
    __obj.asInstanceOf[Chain[F]]
  }
}

