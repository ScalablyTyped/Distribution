package typings
package fpDashTsLib.libFunctorMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Functor2[F /* <: fpDashTsLib.libHKTMod.URIS2 */] extends js.Object {
  val URI: F
  def map[L, A, B](fa: fpDashTsLib.libHKTMod.Type2[F, L, A], f: js.Function1[/* a */ A, B]): fpDashTsLib.libHKTMod.Type2[F, L, B]
}

object Functor2 {
  @scala.inline
  def apply[F /* <: fpDashTsLib.libHKTMod.URIS2 */](
    URI: F,
    map: js.Function2[
      fpDashTsLib.libHKTMod.Type2[F, js.Any, js.Any], 
      js.Function1[js.Any, js.Any], 
      fpDashTsLib.libHKTMod.Type2[F, js.Any, js.Any]
    ]
  ): Functor2[F] = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("URI")(URI.asInstanceOf[js.Any])
    __obj.updateDynamic("map")(map)
    __obj.asInstanceOf[Functor2[F]]
  }
}

