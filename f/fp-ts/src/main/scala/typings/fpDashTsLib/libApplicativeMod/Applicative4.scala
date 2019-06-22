package typings
package fpDashTsLib.libApplicativeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Applicative4[F /* <: fpDashTsLib.libHKTMod.URIS4 */]
  extends fpDashTsLib.libApplyMod.Apply4[F] {
  def of[X, U, L, A](a: A): fpDashTsLib.libHKTMod.Kind4[F, X, U, L, A]
}

object Applicative4 {
  @scala.inline
  def apply[F /* <: fpDashTsLib.libHKTMod.URIS4 */](
    URI: F,
    ap: (fpDashTsLib.libHKTMod.Kind4[F, js.Any, js.Any, js.Any, js.Function1[js.Any, js.Any]], fpDashTsLib.libHKTMod.Kind4[F, js.Any, js.Any, js.Any, js.Any]) => fpDashTsLib.libHKTMod.Kind4[F, js.Any, js.Any, js.Any, js.Any],
    map: (fpDashTsLib.libHKTMod.Kind4[F, js.Any, js.Any, js.Any, js.Any], js.Function1[js.Any, js.Any]) => fpDashTsLib.libHKTMod.Kind4[F, js.Any, js.Any, js.Any, js.Any],
    of: js.Any => fpDashTsLib.libHKTMod.Kind4[F, js.Any, js.Any, js.Any, js.Any]
  ): Applicative4[F] = {
    val __obj = js.Dynamic.literal(URI = URI.asInstanceOf[js.Any], ap = js.Any.fromFunction2(ap), map = js.Any.fromFunction2(map), of = js.Any.fromFunction1(of))
  
    __obj.asInstanceOf[Applicative4[F]]
  }
}

