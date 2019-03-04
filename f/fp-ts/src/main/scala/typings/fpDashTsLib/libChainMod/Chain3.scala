package typings
package fpDashTsLib.libChainMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Chain3[F /* <: fpDashTsLib.libHKTMod.URIS3 */]
  extends fpDashTsLib.libApplyMod.Apply3[F] {
  def chain[U, L, A, B](
    fa: fpDashTsLib.libHKTMod.Type3[F, U, L, A],
    f: js.Function1[/* a */ A, fpDashTsLib.libHKTMod.Type3[F, U, L, B]]
  ): fpDashTsLib.libHKTMod.Type3[F, U, L, B]
}

object Chain3 {
  @scala.inline
  def apply[F /* <: fpDashTsLib.libHKTMod.URIS3 */](
    URI: F,
    ap: js.Function2[
      fpDashTsLib.libHKTMod.Type3[F, js.Any, js.Any, js.Function1[js.Any, js.Any]], 
      fpDashTsLib.libHKTMod.Type3[F, js.Any, js.Any, js.Any], 
      fpDashTsLib.libHKTMod.Type3[F, js.Any, js.Any, js.Any]
    ],
    chain: js.Function2[
      fpDashTsLib.libHKTMod.Type3[F, js.Any, js.Any, js.Any], 
      js.Function1[js.Any, fpDashTsLib.libHKTMod.Type3[F, js.Any, js.Any, js.Any]], 
      fpDashTsLib.libHKTMod.Type3[F, js.Any, js.Any, js.Any]
    ],
    map: js.Function2[
      fpDashTsLib.libHKTMod.Type3[F, js.Any, js.Any, js.Any], 
      js.Function1[js.Any, js.Any], 
      fpDashTsLib.libHKTMod.Type3[F, js.Any, js.Any, js.Any]
    ]
  ): Chain3[F] = {
    val __obj = js.Dynamic.literal(URI = URI.asInstanceOf[js.Any], ap = ap, chain = chain, map = map)
  
    __obj.asInstanceOf[Chain3[F]]
  }
}

