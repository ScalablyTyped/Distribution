package typings
package fpDashTsLib.es6AlternativeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Alternative1[F /* <: fpDashTsLib.es6HKTMod.URIS */]
  extends fpDashTsLib.es6ApplicativeMod.Applicative1[F]
     with fpDashTsLib.es6PlusMod.Plus1[F]

object Alternative1 {
  @scala.inline
  def apply[F /* <: fpDashTsLib.es6HKTMod.URIS */](
    URI: F,
    alt: (fpDashTsLib.es6HKTMod.Type[F, js.Any], fpDashTsLib.es6HKTMod.Type[F, js.Any]) => fpDashTsLib.es6HKTMod.Type[F, js.Any],
    ap: (fpDashTsLib.es6HKTMod.Type[F, js.Function1[js.Any, js.Any]], fpDashTsLib.es6HKTMod.Type[F, js.Any]) => fpDashTsLib.es6HKTMod.Type[F, js.Any],
    map: (fpDashTsLib.es6HKTMod.Type[F, js.Any], js.Function1[js.Any, js.Any]) => fpDashTsLib.es6HKTMod.Type[F, js.Any],
    of: js.Any => fpDashTsLib.es6HKTMod.Type[F, js.Any],
    zero: () => fpDashTsLib.es6HKTMod.Type[F, js.Any]
  ): Alternative1[F] = {
    val __obj = js.Dynamic.literal(URI = URI.asInstanceOf[js.Any], alt = js.Any.fromFunction2(alt), ap = js.Any.fromFunction2(ap), map = js.Any.fromFunction2(map), of = js.Any.fromFunction1(of), zero = js.Any.fromFunction0(zero))
  
    __obj.asInstanceOf[Alternative1[F]]
  }
}

