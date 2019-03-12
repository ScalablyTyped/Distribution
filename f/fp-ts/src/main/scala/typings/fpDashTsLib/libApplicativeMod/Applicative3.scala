package typings
package fpDashTsLib.libApplicativeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Applicative3[F /* <: fpDashTsLib.libHKTMod.URIS3 */]
  extends fpDashTsLib.libApplyMod.Apply3[F] {
  def of[U, L, A](a: A): fpDashTsLib.libHKTMod.Type3[F, U, L, A]
}

object Applicative3 {
  @scala.inline
  def apply[F /* <: fpDashTsLib.libHKTMod.URIS3 */](
    URI: F,
    ap: (fpDashTsLib.libHKTMod.Type3[F, js.Any, js.Any, js.Function1[js.Any, js.Any]], fpDashTsLib.libHKTMod.Type3[F, js.Any, js.Any, js.Any]) => fpDashTsLib.libHKTMod.Type3[F, js.Any, js.Any, js.Any],
    map: (fpDashTsLib.libHKTMod.Type3[F, js.Any, js.Any, js.Any], js.Function1[js.Any, js.Any]) => fpDashTsLib.libHKTMod.Type3[F, js.Any, js.Any, js.Any],
    of: js.Any => fpDashTsLib.libHKTMod.Type3[F, js.Any, js.Any, js.Any]
  ): Applicative3[F] = {
    val __obj = js.Dynamic.literal(URI = URI.asInstanceOf[js.Any], ap = js.Any.fromFunction2(ap), map = js.Any.fromFunction2(map), of = js.Any.fromFunction1(of))
  
    __obj.asInstanceOf[Applicative3[F]]
  }
}

