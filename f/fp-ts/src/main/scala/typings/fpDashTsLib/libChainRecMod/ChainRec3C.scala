package typings
package fpDashTsLib.libChainRecMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ChainRec3C[F /* <: fpDashTsLib.libHKTMod.URIS3 */, U, L]
  extends fpDashTsLib.libChainMod.Chain3C[F, U, L] {
  def chainRec[A, B](
    a: A,
    f: js.Function1[
      /* a */ A, 
      fpDashTsLib.libHKTMod.Kind3[F, U, L, fpDashTsLib.libEitherMod.Either[A, B]]
    ]
  ): fpDashTsLib.libHKTMod.Kind3[F, U, L, B]
}

object ChainRec3C {
  @scala.inline
  def apply[F /* <: fpDashTsLib.libHKTMod.URIS3 */, U, L](
    URI: F,
    _L: L,
    _U: U,
    ap: (fpDashTsLib.libHKTMod.Kind3[F, U, L, js.Function1[js.Any, js.Any]], fpDashTsLib.libHKTMod.Kind3[F, U, L, js.Any]) => fpDashTsLib.libHKTMod.Kind3[F, U, L, js.Any],
    chain: (fpDashTsLib.libHKTMod.Kind3[F, U, L, js.Any], js.Function1[js.Any, fpDashTsLib.libHKTMod.Kind3[F, U, L, js.Any]]) => fpDashTsLib.libHKTMod.Kind3[F, U, L, js.Any],
    chainRec: (js.Any, js.Function1[
      js.Any, 
      fpDashTsLib.libHKTMod.Kind3[F, U, L, fpDashTsLib.libEitherMod.Either[js.Any, js.Any]]
    ]) => fpDashTsLib.libHKTMod.Kind3[F, U, L, js.Any],
    map: (fpDashTsLib.libHKTMod.Kind3[F, U, L, js.Any], js.Function1[js.Any, js.Any]) => fpDashTsLib.libHKTMod.Kind3[F, U, L, js.Any]
  ): ChainRec3C[F, U, L] = {
    val __obj = js.Dynamic.literal(URI = URI.asInstanceOf[js.Any], _L = _L.asInstanceOf[js.Any], _U = _U.asInstanceOf[js.Any], ap = js.Any.fromFunction2(ap), chain = js.Any.fromFunction2(chain), chainRec = js.Any.fromFunction2(chainRec), map = js.Any.fromFunction2(map))
  
    __obj.asInstanceOf[ChainRec3C[F, U, L]]
  }
}

