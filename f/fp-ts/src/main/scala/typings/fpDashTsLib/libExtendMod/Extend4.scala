package typings
package fpDashTsLib.libExtendMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Extend4[W /* <: fpDashTsLib.libHKTMod.URIS4 */]
  extends fpDashTsLib.libFunctorMod.Functor4[W] {
  def extend[X, U, L, A, B](
    wa: fpDashTsLib.libHKTMod.Kind4[W, X, U, L, A],
    f: js.Function1[/* wa */ fpDashTsLib.libHKTMod.Kind4[W, X, U, L, A], B]
  ): fpDashTsLib.libHKTMod.Kind4[W, X, U, L, B]
}

object Extend4 {
  @scala.inline
  def apply[W /* <: fpDashTsLib.libHKTMod.URIS4 */](
    URI: W,
    extend: (fpDashTsLib.libHKTMod.Kind4[W, js.Any, js.Any, js.Any, js.Any], js.Function1[/* wa */ fpDashTsLib.libHKTMod.Kind4[W, js.Any, js.Any, js.Any, js.Any], js.Any]) => fpDashTsLib.libHKTMod.Kind4[W, js.Any, js.Any, js.Any, js.Any],
    map: (fpDashTsLib.libHKTMod.Kind4[W, js.Any, js.Any, js.Any, js.Any], js.Function1[js.Any, js.Any]) => fpDashTsLib.libHKTMod.Kind4[W, js.Any, js.Any, js.Any, js.Any]
  ): Extend4[W] = {
    val __obj = js.Dynamic.literal(URI = URI.asInstanceOf[js.Any], extend = js.Any.fromFunction2(extend), map = js.Any.fromFunction2(map))
  
    __obj.asInstanceOf[Extend4[W]]
  }
}

