package typings
package fpDashTsLib.es6ChainRecMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ChainRec[F]
  extends fpDashTsLib.es6ChainMod.Chain[F] {
  def chainRec[A, B](
    a: A,
    f: js.Function1[/* a */ A, fpDashTsLib.es6HKTMod.HKT[F, fpDashTsLib.es6EitherMod.Either[A, B]]]
  ): fpDashTsLib.es6HKTMod.HKT[F, B]
}

object ChainRec {
  @scala.inline
  def apply[F](
    URI: F,
    ap: (fpDashTsLib.es6HKTMod.HKT[F, js.Function1[js.Any, js.Any]], fpDashTsLib.es6HKTMod.HKT[F, js.Any]) => fpDashTsLib.es6HKTMod.HKT[F, js.Any],
    chain: (fpDashTsLib.es6HKTMod.HKT[F, js.Any], js.Function1[js.Any, fpDashTsLib.es6HKTMod.HKT[F, js.Any]]) => fpDashTsLib.es6HKTMod.HKT[F, js.Any],
    chainRec: (js.Any, js.Function1[
      js.Any, 
      fpDashTsLib.es6HKTMod.HKT[F, fpDashTsLib.es6EitherMod.Either[js.Any, js.Any]]
    ]) => fpDashTsLib.es6HKTMod.HKT[F, js.Any],
    map: (fpDashTsLib.es6HKTMod.HKT[F, js.Any], js.Function1[js.Any, js.Any]) => fpDashTsLib.es6HKTMod.HKT[F, js.Any]
  ): ChainRec[F] = {
    val __obj = js.Dynamic.literal(URI = URI.asInstanceOf[js.Any], ap = js.Any.fromFunction2(ap), chain = js.Any.fromFunction2(chain), chainRec = js.Any.fromFunction2(chainRec), map = js.Any.fromFunction2(map))
  
    __obj.asInstanceOf[ChainRec[F]]
  }
}

