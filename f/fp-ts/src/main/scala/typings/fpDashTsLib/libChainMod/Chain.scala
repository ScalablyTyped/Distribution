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
    ap: js.Function2[
      fpDashTsLib.libHKTMod.HKT[F, js.Function1[js.Any, js.Any]], 
      fpDashTsLib.libHKTMod.HKT[F, js.Any], 
      fpDashTsLib.libHKTMod.HKT[F, js.Any]
    ],
    chain: js.Function2[
      fpDashTsLib.libHKTMod.HKT[F, js.Any], 
      js.Function1[js.Any, fpDashTsLib.libHKTMod.HKT[F, js.Any]], 
      fpDashTsLib.libHKTMod.HKT[F, js.Any]
    ],
    map: js.Function2[
      fpDashTsLib.libHKTMod.HKT[F, js.Any], 
      js.Function1[js.Any, js.Any], 
      fpDashTsLib.libHKTMod.HKT[F, js.Any]
    ]
  ): Chain[F] = {
    val __obj = js.Dynamic.literal(URI = URI.asInstanceOf[js.Any], ap = ap, chain = chain, map = map)
  
    __obj.asInstanceOf[Chain[F]]
  }
}

