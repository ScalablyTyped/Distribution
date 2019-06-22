package typings
package fpDashTsLib.es6PlusMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Plus2[F /* <: fpDashTsLib.es6HKTMod.URIS2 */]
  extends fpDashTsLib.es6AltMod.Alt2[F] {
  def zero[L, A](): fpDashTsLib.es6HKTMod.Kind2[F, L, A]
}

object Plus2 {
  @scala.inline
  def apply[F /* <: fpDashTsLib.es6HKTMod.URIS2 */](
    URI: F,
    alt: (fpDashTsLib.es6HKTMod.Kind2[F, js.Any, js.Any], fpDashTsLib.es6HKTMod.Kind2[F, js.Any, js.Any]) => fpDashTsLib.es6HKTMod.Kind2[F, js.Any, js.Any],
    map: (fpDashTsLib.es6HKTMod.Kind2[F, js.Any, js.Any], js.Function1[js.Any, js.Any]) => fpDashTsLib.es6HKTMod.Kind2[F, js.Any, js.Any],
    zero: () => fpDashTsLib.es6HKTMod.Kind2[F, js.Any, js.Any]
  ): Plus2[F] = {
    val __obj = js.Dynamic.literal(URI = URI.asInstanceOf[js.Any], alt = js.Any.fromFunction2(alt), map = js.Any.fromFunction2(map), zero = js.Any.fromFunction0(zero))
  
    __obj.asInstanceOf[Plus2[F]]
  }
}

