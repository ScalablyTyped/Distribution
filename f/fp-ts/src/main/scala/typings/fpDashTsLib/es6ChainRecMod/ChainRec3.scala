package typings
package fpDashTsLib.es6ChainRecMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ChainRec3[F /* <: fpDashTsLib.es6HKTMod.URIS3 */]
  extends fpDashTsLib.es6ChainMod.Chain3[F] {
  def chainRec[U, L, A, B](
    a: A,
    f: js.Function1[
      /* a */ A, 
      fpDashTsLib.es6HKTMod.Kind3[F, U, L, fpDashTsLib.es6EitherMod.Either[A, B]]
    ]
  ): fpDashTsLib.es6HKTMod.Kind3[F, U, L, B]
}

object ChainRec3 {
  @scala.inline
  def apply[F /* <: fpDashTsLib.es6HKTMod.URIS3 */](
    URI: F,
    ap: (fpDashTsLib.es6HKTMod.Kind3[F, js.Any, js.Any, js.Function1[js.Any, js.Any]], fpDashTsLib.es6HKTMod.Kind3[F, js.Any, js.Any, js.Any]) => fpDashTsLib.es6HKTMod.Kind3[F, js.Any, js.Any, js.Any],
    chain: (fpDashTsLib.es6HKTMod.Kind3[F, js.Any, js.Any, js.Any], js.Function1[js.Any, fpDashTsLib.es6HKTMod.Kind3[F, js.Any, js.Any, js.Any]]) => fpDashTsLib.es6HKTMod.Kind3[F, js.Any, js.Any, js.Any],
    chainRec: (js.Any, js.Function1[
      js.Any, 
      fpDashTsLib.es6HKTMod.Kind3[F, js.Any, js.Any, fpDashTsLib.es6EitherMod.Either[js.Any, js.Any]]
    ]) => fpDashTsLib.es6HKTMod.Kind3[F, js.Any, js.Any, js.Any],
    map: (fpDashTsLib.es6HKTMod.Kind3[F, js.Any, js.Any, js.Any], js.Function1[js.Any, js.Any]) => fpDashTsLib.es6HKTMod.Kind3[F, js.Any, js.Any, js.Any]
  ): ChainRec3[F] = {
    val __obj = js.Dynamic.literal(URI = URI.asInstanceOf[js.Any], ap = js.Any.fromFunction2(ap), chain = js.Any.fromFunction2(chain), chainRec = js.Any.fromFunction2(chainRec), map = js.Any.fromFunction2(map))
  
    __obj.asInstanceOf[ChainRec3[F]]
  }
}

