package typings
package fpDashTsLib.es6AlternativeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Alternative2[F /* <: fpDashTsLib.es6HKTMod.URIS2 */]
  extends fpDashTsLib.es6ApplicativeMod.Applicative2[F]
     with fpDashTsLib.es6PlusMod.Plus2[F]

object Alternative2 {
  @scala.inline
  def apply[F /* <: fpDashTsLib.es6HKTMod.URIS2 */](
    URI: F,
    alt: (fpDashTsLib.es6HKTMod.Type2[F, js.Any, js.Any], fpDashTsLib.es6HKTMod.Type2[F, js.Any, js.Any]) => fpDashTsLib.es6HKTMod.Type2[F, js.Any, js.Any],
    ap: (fpDashTsLib.es6HKTMod.Type2[F, js.Any, js.Function1[js.Any, js.Any]], fpDashTsLib.es6HKTMod.Type2[F, js.Any, js.Any]) => fpDashTsLib.es6HKTMod.Type2[F, js.Any, js.Any],
    map: (fpDashTsLib.es6HKTMod.Type2[F, js.Any, js.Any], js.Function1[js.Any, js.Any]) => fpDashTsLib.es6HKTMod.Type2[F, js.Any, js.Any],
    of: js.Any => fpDashTsLib.es6HKTMod.Type2[F, js.Any, js.Any],
    zero: () => fpDashTsLib.es6HKTMod.Type2[F, js.Any, js.Any]
  ): Alternative2[F] = {
    val __obj = js.Dynamic.literal(URI = URI.asInstanceOf[js.Any], alt = js.Any.fromFunction2(alt), ap = js.Any.fromFunction2(ap), map = js.Any.fromFunction2(map), of = js.Any.fromFunction1(of), zero = js.Any.fromFunction0(zero))
  
    __obj.asInstanceOf[Alternative2[F]]
  }
}

