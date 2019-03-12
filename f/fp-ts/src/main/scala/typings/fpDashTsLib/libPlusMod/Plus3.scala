package typings
package fpDashTsLib.libPlusMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Plus3[F /* <: fpDashTsLib.libHKTMod.URIS3 */]
  extends fpDashTsLib.libAltMod.Alt3[F] {
  def zero[U, L, A](): fpDashTsLib.libHKTMod.Type3[F, U, L, A]
}

object Plus3 {
  @scala.inline
  def apply[F /* <: fpDashTsLib.libHKTMod.URIS3 */](
    URI: F,
    alt: (fpDashTsLib.libHKTMod.Type3[F, js.Any, js.Any, js.Any], fpDashTsLib.libHKTMod.Type3[F, js.Any, js.Any, js.Any]) => fpDashTsLib.libHKTMod.Type3[F, js.Any, js.Any, js.Any],
    map: (fpDashTsLib.libHKTMod.Type3[F, js.Any, js.Any, js.Any], js.Function1[js.Any, js.Any]) => fpDashTsLib.libHKTMod.Type3[F, js.Any, js.Any, js.Any],
    zero: () => fpDashTsLib.libHKTMod.Type3[F, js.Any, js.Any, js.Any]
  ): Plus3[F] = {
    val __obj = js.Dynamic.literal(URI = URI.asInstanceOf[js.Any], alt = js.Any.fromFunction2(alt), map = js.Any.fromFunction2(map), zero = js.Any.fromFunction0(zero))
  
    __obj.asInstanceOf[Plus3[F]]
  }
}

