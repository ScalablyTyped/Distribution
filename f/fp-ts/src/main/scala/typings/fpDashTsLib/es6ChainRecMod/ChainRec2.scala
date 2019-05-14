package typings
package fpDashTsLib.es6ChainRecMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ChainRec2[F /* <: fpDashTsLib.es6HKTMod.URIS2 */]
  extends fpDashTsLib.es6ChainMod.Chain2[F] {
  def chainRec[L, A, B](
    a: A,
    f: js.Function1[
      /* a */ A, 
      fpDashTsLib.es6HKTMod.Type2[F, L, fpDashTsLib.es6EitherMod.Either[A, B]]
    ]
  ): fpDashTsLib.es6HKTMod.Type2[F, L, B]
}

object ChainRec2 {
  @scala.inline
  def apply[F /* <: fpDashTsLib.es6HKTMod.URIS2 */](
    URI: F,
    ap: (fpDashTsLib.es6HKTMod.Type2[F, js.Any, js.Function1[js.Any, js.Any]], fpDashTsLib.es6HKTMod.Type2[F, js.Any, js.Any]) => fpDashTsLib.es6HKTMod.Type2[F, js.Any, js.Any],
    chain: (fpDashTsLib.es6HKTMod.Type2[F, js.Any, js.Any], js.Function1[js.Any, fpDashTsLib.es6HKTMod.Type2[F, js.Any, js.Any]]) => fpDashTsLib.es6HKTMod.Type2[F, js.Any, js.Any],
    chainRec: (js.Any, js.Function1[
      js.Any, 
      fpDashTsLib.es6HKTMod.Type2[F, js.Any, fpDashTsLib.es6EitherMod.Either[js.Any, js.Any]]
    ]) => fpDashTsLib.es6HKTMod.Type2[F, js.Any, js.Any],
    map: (fpDashTsLib.es6HKTMod.Type2[F, js.Any, js.Any], js.Function1[js.Any, js.Any]) => fpDashTsLib.es6HKTMod.Type2[F, js.Any, js.Any]
  ): ChainRec2[F] = {
    val __obj = js.Dynamic.literal(URI = URI.asInstanceOf[js.Any], ap = js.Any.fromFunction2(ap), chain = js.Any.fromFunction2(chain), chainRec = js.Any.fromFunction2(chainRec), map = js.Any.fromFunction2(map))
  
    __obj.asInstanceOf[ChainRec2[F]]
  }
}

