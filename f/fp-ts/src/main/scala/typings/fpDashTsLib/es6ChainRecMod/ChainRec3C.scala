package typings
package fpDashTsLib.es6ChainRecMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ChainRec3C[F /* <: fpDashTsLib.es6HKTMod.URIS3 */, U, L]
  extends fpDashTsLib.es6ChainMod.Chain3C[F, U, L] {
  def chainRec[A, B](
    a: A,
    f: js.Function1[
      /* a */ A, 
      fpDashTsLib.es6HKTMod.Kind3[F, U, L, fpDashTsLib.es6EitherMod.Either[A, B]]
    ]
  ): fpDashTsLib.es6HKTMod.Kind3[F, U, L, B]
}

object ChainRec3C {
  @scala.inline
  def apply[F /* <: fpDashTsLib.es6HKTMod.URIS3 */, U, L](
    URI: F,
    _L: L,
    _U: U,
    ap: (fpDashTsLib.es6HKTMod.Kind3[F, U, L, js.Function1[js.Any, js.Any]], fpDashTsLib.es6HKTMod.Kind3[F, U, L, js.Any]) => fpDashTsLib.es6HKTMod.Kind3[F, U, L, js.Any],
    chain: (fpDashTsLib.es6HKTMod.Kind3[F, U, L, js.Any], js.Function1[js.Any, fpDashTsLib.es6HKTMod.Kind3[F, U, L, js.Any]]) => fpDashTsLib.es6HKTMod.Kind3[F, U, L, js.Any],
    chainRec: (js.Any, js.Function1[
      js.Any, 
      fpDashTsLib.es6HKTMod.Kind3[F, U, L, fpDashTsLib.es6EitherMod.Either[js.Any, js.Any]]
    ]) => fpDashTsLib.es6HKTMod.Kind3[F, U, L, js.Any],
    map: (fpDashTsLib.es6HKTMod.Kind3[F, U, L, js.Any], js.Function1[js.Any, js.Any]) => fpDashTsLib.es6HKTMod.Kind3[F, U, L, js.Any]
  ): ChainRec3C[F, U, L] = {
    val __obj = js.Dynamic.literal(URI = URI.asInstanceOf[js.Any], _L = _L.asInstanceOf[js.Any], _U = _U.asInstanceOf[js.Any], ap = js.Any.fromFunction2(ap), chain = js.Any.fromFunction2(chain), chainRec = js.Any.fromFunction2(chainRec), map = js.Any.fromFunction2(map))
  
    __obj.asInstanceOf[ChainRec3C[F, U, L]]
  }
}

