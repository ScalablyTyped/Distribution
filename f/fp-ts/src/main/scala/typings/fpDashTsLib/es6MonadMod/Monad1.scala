package typings
package fpDashTsLib.es6MonadMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Monad1[F /* <: fpDashTsLib.es6HKTMod.URIS */]
  extends fpDashTsLib.es6ApplicativeMod.Applicative1[F]
     with fpDashTsLib.es6ChainMod.Chain1[F]

object Monad1 {
  @scala.inline
  def apply[F /* <: fpDashTsLib.es6HKTMod.URIS */](
    URI: F,
    ap: (fpDashTsLib.es6HKTMod.Type[F, js.Function1[js.Any, js.Any]], fpDashTsLib.es6HKTMod.Type[F, js.Any]) => fpDashTsLib.es6HKTMod.Type[F, js.Any],
    chain: (fpDashTsLib.es6HKTMod.Type[F, js.Any], js.Function1[js.Any, fpDashTsLib.es6HKTMod.Type[F, js.Any]]) => fpDashTsLib.es6HKTMod.Type[F, js.Any],
    map: (fpDashTsLib.es6HKTMod.Type[F, js.Any], js.Function1[js.Any, js.Any]) => fpDashTsLib.es6HKTMod.Type[F, js.Any],
    of: js.Any => fpDashTsLib.es6HKTMod.Type[F, js.Any]
  ): Monad1[F] = {
    val __obj = js.Dynamic.literal(URI = URI.asInstanceOf[js.Any], ap = js.Any.fromFunction2(ap), chain = js.Any.fromFunction2(chain), map = js.Any.fromFunction2(map), of = js.Any.fromFunction1(of))
  
    __obj.asInstanceOf[Monad1[F]]
  }
}

