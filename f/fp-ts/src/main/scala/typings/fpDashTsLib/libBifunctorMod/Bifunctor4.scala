package typings
package fpDashTsLib.libBifunctorMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Bifunctor4[F /* <: fpDashTsLib.libHKTMod.URIS4 */] extends js.Object {
  val URI: F
  def bimap[X, U, L, A, M, B](
    fla: fpDashTsLib.libHKTMod.Kind4[F, X, U, L, A],
    f: js.Function1[/* l */ L, M],
    g: js.Function1[/* a */ A, B]
  ): fpDashTsLib.libHKTMod.Kind4[F, X, U, M, B]
  def mapLeft[X, U, L, A, M](fla: fpDashTsLib.libHKTMod.Kind4[F, X, U, L, A], f: js.Function1[/* l */ L, M]): fpDashTsLib.libHKTMod.Kind4[F, X, U, M, A]
}

object Bifunctor4 {
  @scala.inline
  def apply[F /* <: fpDashTsLib.libHKTMod.URIS4 */](
    URI: F,
    bimap: (fpDashTsLib.libHKTMod.Kind4[F, js.Any, js.Any, js.Any, js.Any], js.Function1[js.Any, js.Any], js.Function1[js.Any, js.Any]) => fpDashTsLib.libHKTMod.Kind4[F, js.Any, js.Any, js.Any, js.Any],
    mapLeft: (fpDashTsLib.libHKTMod.Kind4[F, js.Any, js.Any, js.Any, js.Any], js.Function1[js.Any, js.Any]) => fpDashTsLib.libHKTMod.Kind4[F, js.Any, js.Any, js.Any, js.Any]
  ): Bifunctor4[F] = {
    val __obj = js.Dynamic.literal(URI = URI.asInstanceOf[js.Any], bimap = js.Any.fromFunction3(bimap), mapLeft = js.Any.fromFunction2(mapLeft))
  
    __obj.asInstanceOf[Bifunctor4[F]]
  }
}

