package typings
package fpDashTsLib.libBifunctorMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Bifunctor3C[F /* <: fpDashTsLib.libHKTMod.URIS3 */, U] extends js.Object {
  val URI: F
  val _U: U
  def bimap[L, A, M, B](
    fla: fpDashTsLib.libHKTMod.Type3[F, U, L, A],
    f: js.Function1[/* l */ L, M],
    g: js.Function1[/* a */ A, B]
  ): fpDashTsLib.libHKTMod.Type3[F, U, M, B]
}

object Bifunctor3C {
  @scala.inline
  def apply[F /* <: fpDashTsLib.libHKTMod.URIS3 */, U](
    URI: F,
    _U: U,
    bimap: (fpDashTsLib.libHKTMod.Type3[F, U, js.Any, js.Any], js.Function1[js.Any, js.Any], js.Function1[js.Any, js.Any]) => fpDashTsLib.libHKTMod.Type3[F, U, js.Any, js.Any]
  ): Bifunctor3C[F, U] = {
    val __obj = js.Dynamic.literal(URI = URI.asInstanceOf[js.Any], _U = _U.asInstanceOf[js.Any], bimap = js.Any.fromFunction3(bimap))
  
    __obj.asInstanceOf[Bifunctor3C[F, U]]
  }
}

