package typings
package fpDashTsLib.libProfunctorMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Profunctor4[F /* <: fpDashTsLib.libHKTMod.URIS4 */]
  extends fpDashTsLib.libFunctorMod.Functor4[F] {
  def promap[X, U, A, B, C, D](
    fbc: fpDashTsLib.libHKTMod.Kind4[F, X, U, B, C],
    f: js.Function1[/* a */ A, B],
    g: js.Function1[/* c */ C, D]
  ): fpDashTsLib.libHKTMod.Kind4[F, X, U, A, D]
}

object Profunctor4 {
  @scala.inline
  def apply[F /* <: fpDashTsLib.libHKTMod.URIS4 */](
    URI: F,
    map: (fpDashTsLib.libHKTMod.Kind4[F, js.Any, js.Any, js.Any, js.Any], js.Function1[js.Any, js.Any]) => fpDashTsLib.libHKTMod.Kind4[F, js.Any, js.Any, js.Any, js.Any],
    promap: (fpDashTsLib.libHKTMod.Kind4[F, js.Any, js.Any, js.Any, js.Any], js.Function1[js.Any, js.Any], js.Function1[js.Any, js.Any]) => fpDashTsLib.libHKTMod.Kind4[F, js.Any, js.Any, js.Any, js.Any]
  ): Profunctor4[F] = {
    val __obj = js.Dynamic.literal(URI = URI.asInstanceOf[js.Any], map = js.Any.fromFunction2(map), promap = js.Any.fromFunction3(promap))
  
    __obj.asInstanceOf[Profunctor4[F]]
  }
}

