package typings
package fpDashTsLib.libExtendMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Extend3[F /* <: fpDashTsLib.libHKTMod.URIS3 */]
  extends fpDashTsLib.libFunctorMod.Functor3[F] {
  def extend[U, L, A, B](
    ea: fpDashTsLib.libHKTMod.Type3[F, U, L, A],
    f: js.Function1[/* fa */ fpDashTsLib.libHKTMod.Type3[F, U, L, A], B]
  ): fpDashTsLib.libHKTMod.Type3[F, U, L, B]
}

object Extend3 {
  @scala.inline
  def apply[F /* <: fpDashTsLib.libHKTMod.URIS3 */](
    URI: F,
    extend: js.Function2[
      fpDashTsLib.libHKTMod.Type3[F, js.Any, js.Any, js.Any], 
      js.Function1[/* fa */ fpDashTsLib.libHKTMod.Type3[F, js.Any, js.Any, js.Any], js.Any], 
      fpDashTsLib.libHKTMod.Type3[F, js.Any, js.Any, js.Any]
    ],
    map: js.Function2[
      fpDashTsLib.libHKTMod.Type3[F, js.Any, js.Any, js.Any], 
      js.Function1[js.Any, js.Any], 
      fpDashTsLib.libHKTMod.Type3[F, js.Any, js.Any, js.Any]
    ]
  ): Extend3[F] = {
    val __obj = js.Dynamic.literal(URI = URI.asInstanceOf[js.Any], extend = extend, map = map)
  
    __obj.asInstanceOf[Extend3[F]]
  }
}

