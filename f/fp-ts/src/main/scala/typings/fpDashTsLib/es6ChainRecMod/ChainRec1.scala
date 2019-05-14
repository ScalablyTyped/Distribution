package typings
package fpDashTsLib.es6ChainRecMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ChainRec1[F /* <: fpDashTsLib.es6HKTMod.URIS */]
  extends fpDashTsLib.es6ChainMod.Chain1[F] {
  def chainRec[A, B](
    a: A,
    f: js.Function1[/* a */ A, fpDashTsLib.es6HKTMod.Type[F, fpDashTsLib.es6EitherMod.Either[A, B]]]
  ): fpDashTsLib.es6HKTMod.Type[F, B]
}

object ChainRec1 {
  @scala.inline
  def apply[F /* <: fpDashTsLib.es6HKTMod.URIS */](
    URI: F,
    ap: (fpDashTsLib.es6HKTMod.Type[F, js.Function1[js.Any, js.Any]], fpDashTsLib.es6HKTMod.Type[F, js.Any]) => fpDashTsLib.es6HKTMod.Type[F, js.Any],
    chain: (fpDashTsLib.es6HKTMod.Type[F, js.Any], js.Function1[js.Any, fpDashTsLib.es6HKTMod.Type[F, js.Any]]) => fpDashTsLib.es6HKTMod.Type[F, js.Any],
    chainRec: (js.Any, js.Function1[
      js.Any, 
      fpDashTsLib.es6HKTMod.Type[F, fpDashTsLib.es6EitherMod.Either[js.Any, js.Any]]
    ]) => fpDashTsLib.es6HKTMod.Type[F, js.Any],
    map: (fpDashTsLib.es6HKTMod.Type[F, js.Any], js.Function1[js.Any, js.Any]) => fpDashTsLib.es6HKTMod.Type[F, js.Any]
  ): ChainRec1[F] = {
    val __obj = js.Dynamic.literal(URI = URI.asInstanceOf[js.Any], ap = js.Any.fromFunction2(ap), chain = js.Any.fromFunction2(chain), chainRec = js.Any.fromFunction2(chainRec), map = js.Any.fromFunction2(map))
  
    __obj.asInstanceOf[ChainRec1[F]]
  }
}

