package typings
package fpDashTsLib.libBifunctorMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Bifunctor3[F /* <: fpDashTsLib.libHKTMod.URIS3 */] extends js.Object {
  val URI: F
  def bimap[U, L, A, M, B](
    fla: fpDashTsLib.libHKTMod.Type3[F, U, L, A],
    f: js.Function1[/* l */ L, M],
    g: js.Function1[/* a */ A, B]
  ): fpDashTsLib.libHKTMod.Type3[F, U, M, B]
}

object Bifunctor3 {
  @scala.inline
  def apply[F /* <: fpDashTsLib.libHKTMod.URIS3 */](
    URI: F,
    bimap: js.Function3[
      fpDashTsLib.libHKTMod.Type3[F, js.Any, js.Any, js.Any], 
      js.Function1[js.Any, js.Any], 
      js.Function1[js.Any, js.Any], 
      fpDashTsLib.libHKTMod.Type3[F, js.Any, js.Any, js.Any]
    ]
  ): Bifunctor3[F] = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("URI")(URI.asInstanceOf[js.Any])
    __obj.updateDynamic("bimap")(bimap)
    __obj.asInstanceOf[Bifunctor3[F]]
  }
}

