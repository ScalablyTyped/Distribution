package typings
package fpDashTsLib.libAltMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Alt4[F /* <: fpDashTsLib.libHKTMod.URIS4 */]
  extends fpDashTsLib.libFunctorMod.Functor4[F] {
  def alt[X, U, L, A](
    fx: fpDashTsLib.libHKTMod.Kind4[F, X, U, L, A],
    fy: js.Function0[fpDashTsLib.libHKTMod.Kind4[F, X, U, L, A]]
  ): fpDashTsLib.libHKTMod.Kind4[F, X, U, L, A]
}

object Alt4 {
  @scala.inline
  def apply[F /* <: fpDashTsLib.libHKTMod.URIS4 */](
    URI: F,
    alt: (fpDashTsLib.libHKTMod.Kind4[F, js.Any, js.Any, js.Any, js.Any], js.Function0[fpDashTsLib.libHKTMod.Kind4[F, js.Any, js.Any, js.Any, js.Any]]) => fpDashTsLib.libHKTMod.Kind4[F, js.Any, js.Any, js.Any, js.Any],
    map: (fpDashTsLib.libHKTMod.Kind4[F, js.Any, js.Any, js.Any, js.Any], js.Function1[js.Any, js.Any]) => fpDashTsLib.libHKTMod.Kind4[F, js.Any, js.Any, js.Any, js.Any]
  ): Alt4[F] = {
    val __obj = js.Dynamic.literal(URI = URI.asInstanceOf[js.Any], alt = js.Any.fromFunction2(alt), map = js.Any.fromFunction2(map))
  
    __obj.asInstanceOf[Alt4[F]]
  }
}

