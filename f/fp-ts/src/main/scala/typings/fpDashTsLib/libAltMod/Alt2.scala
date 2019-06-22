package typings
package fpDashTsLib.libAltMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Alt2[F /* <: fpDashTsLib.libHKTMod.URIS2 */]
  extends fpDashTsLib.libFunctorMod.Functor2[F] {
  def alt[L, A](fx: fpDashTsLib.libHKTMod.Kind2[F, L, A], fy: fpDashTsLib.libHKTMod.Kind2[F, L, A]): fpDashTsLib.libHKTMod.Kind2[F, L, A]
}

object Alt2 {
  @scala.inline
  def apply[F /* <: fpDashTsLib.libHKTMod.URIS2 */](
    URI: F,
    alt: (fpDashTsLib.libHKTMod.Kind2[F, js.Any, js.Any], fpDashTsLib.libHKTMod.Kind2[F, js.Any, js.Any]) => fpDashTsLib.libHKTMod.Kind2[F, js.Any, js.Any],
    map: (fpDashTsLib.libHKTMod.Kind2[F, js.Any, js.Any], js.Function1[js.Any, js.Any]) => fpDashTsLib.libHKTMod.Kind2[F, js.Any, js.Any]
  ): Alt2[F] = {
    val __obj = js.Dynamic.literal(URI = URI.asInstanceOf[js.Any], alt = js.Any.fromFunction2(alt), map = js.Any.fromFunction2(map))
  
    __obj.asInstanceOf[Alt2[F]]
  }
}

