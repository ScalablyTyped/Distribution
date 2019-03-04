package typings
package fpDashTsLib.libChainMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Chain3C[F /* <: fpDashTsLib.libHKTMod.URIS3 */, U, L]
  extends fpDashTsLib.libApplyMod.Apply3C[F, U, L] {
  def chain[A, B](
    fa: fpDashTsLib.libHKTMod.Type3[F, U, L, A],
    f: js.Function1[/* a */ A, fpDashTsLib.libHKTMod.Type3[F, U, L, B]]
  ): fpDashTsLib.libHKTMod.Type3[F, U, L, B]
}

object Chain3C {
  @scala.inline
  def apply[F /* <: fpDashTsLib.libHKTMod.URIS3 */, U, L](
    URI: F,
    _L: L,
    _U: U,
    ap: js.Function2[
      fpDashTsLib.libHKTMod.Type3[F, U, L, js.Function1[js.Any, js.Any]], 
      fpDashTsLib.libHKTMod.Type3[F, U, L, js.Any], 
      fpDashTsLib.libHKTMod.Type3[F, U, L, js.Any]
    ],
    chain: js.Function2[
      fpDashTsLib.libHKTMod.Type3[F, U, L, js.Any], 
      js.Function1[js.Any, fpDashTsLib.libHKTMod.Type3[F, U, L, js.Any]], 
      fpDashTsLib.libHKTMod.Type3[F, U, L, js.Any]
    ],
    map: js.Function2[
      fpDashTsLib.libHKTMod.Type3[F, U, L, js.Any], 
      js.Function1[js.Any, js.Any], 
      fpDashTsLib.libHKTMod.Type3[F, U, L, js.Any]
    ]
  ): Chain3C[F, U, L] = {
    val __obj = js.Dynamic.literal(URI = URI.asInstanceOf[js.Any], _L = _L.asInstanceOf[js.Any], _U = _U.asInstanceOf[js.Any], ap = ap, chain = chain, map = map)
  
    __obj.asInstanceOf[Chain3C[F, U, L]]
  }
}

