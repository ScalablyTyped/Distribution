package typings
package fpDashTsLib.libAltMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Alt3[F /* <: fpDashTsLib.libHKTMod.URIS3 */]
  extends fpDashTsLib.libFunctorMod.Functor3[F] {
  def alt[U, L, A](fx: fpDashTsLib.libHKTMod.Kind3[F, U, L, A], fy: fpDashTsLib.libHKTMod.Kind3[F, U, L, A]): fpDashTsLib.libHKTMod.Kind3[F, U, L, A]
}

object Alt3 {
  @scala.inline
  def apply[F /* <: fpDashTsLib.libHKTMod.URIS3 */](
    URI: F,
    alt: (fpDashTsLib.libHKTMod.Kind3[F, js.Any, js.Any, js.Any], fpDashTsLib.libHKTMod.Kind3[F, js.Any, js.Any, js.Any]) => fpDashTsLib.libHKTMod.Kind3[F, js.Any, js.Any, js.Any],
    map: (fpDashTsLib.libHKTMod.Kind3[F, js.Any, js.Any, js.Any], js.Function1[js.Any, js.Any]) => fpDashTsLib.libHKTMod.Kind3[F, js.Any, js.Any, js.Any]
  ): Alt3[F] = {
    val __obj = js.Dynamic.literal(URI = URI.asInstanceOf[js.Any], alt = js.Any.fromFunction2(alt), map = js.Any.fromFunction2(map))
  
    __obj.asInstanceOf[Alt3[F]]
  }
}

