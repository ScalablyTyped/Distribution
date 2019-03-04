package typings
package fpDashTsLib.libMonadMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Monad[F]
  extends fpDashTsLib.libApplicativeMod.Applicative[F]
     with fpDashTsLib.libChainMod.Chain[F]

object Monad {
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
    ],
    of: js.Function1[js.Any, fpDashTsLib.libHKTMod.HKT[F, js.Any]]
  ): Monad[F] = {
    val __obj = js.Dynamic.literal(URI = URI.asInstanceOf[js.Any], ap = ap, chain = chain, map = map, of = of)
  
    __obj.asInstanceOf[Monad[F]]
  }
}

