package typings
package fpDashTsLib.libBifunctorMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Bifunctor2[F /* <: fpDashTsLib.libHKTMod.URIS2 */] extends js.Object {
  val URI: F
  def bimap[L, A, M, B](
    fla: fpDashTsLib.libHKTMod.Type2[F, L, A],
    f: js.Function1[/* l */ L, M],
    g: js.Function1[/* a */ A, B]
  ): fpDashTsLib.libHKTMod.Type2[F, M, B]
}

object Bifunctor2 {
  @scala.inline
  def apply[F /* <: fpDashTsLib.libHKTMod.URIS2 */](
    URI: F,
    bimap: js.Function3[
      fpDashTsLib.libHKTMod.Type2[F, js.Any, js.Any], 
      js.Function1[js.Any, js.Any], 
      js.Function1[js.Any, js.Any], 
      fpDashTsLib.libHKTMod.Type2[F, js.Any, js.Any]
    ]
  ): Bifunctor2[F] = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("URI")(URI.asInstanceOf[js.Any])
    __obj.updateDynamic("bimap")(bimap)
    __obj.asInstanceOf[Bifunctor2[F]]
  }
}

