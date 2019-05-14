package typings
package fpDashTsLib.es6MonadMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Monad[F]
  extends fpDashTsLib.es6ApplicativeMod.Applicative[F]
     with fpDashTsLib.es6ChainMod.Chain[F]

object Monad {
  @scala.inline
  def apply[F](
    URI: F,
    ap: (fpDashTsLib.es6HKTMod.HKT[F, js.Function1[js.Any, js.Any]], fpDashTsLib.es6HKTMod.HKT[F, js.Any]) => fpDashTsLib.es6HKTMod.HKT[F, js.Any],
    chain: (fpDashTsLib.es6HKTMod.HKT[F, js.Any], js.Function1[js.Any, fpDashTsLib.es6HKTMod.HKT[F, js.Any]]) => fpDashTsLib.es6HKTMod.HKT[F, js.Any],
    map: (fpDashTsLib.es6HKTMod.HKT[F, js.Any], js.Function1[js.Any, js.Any]) => fpDashTsLib.es6HKTMod.HKT[F, js.Any],
    of: js.Any => fpDashTsLib.es6HKTMod.HKT[F, js.Any]
  ): Monad[F] = {
    val __obj = js.Dynamic.literal(URI = URI.asInstanceOf[js.Any], ap = js.Any.fromFunction2(ap), chain = js.Any.fromFunction2(chain), map = js.Any.fromFunction2(map), of = js.Any.fromFunction1(of))
  
    __obj.asInstanceOf[Monad[F]]
  }
}

