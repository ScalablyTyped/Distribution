package typings
package fpDashTsLib.libExtendMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Extend1[F /* <: fpDashTsLib.libHKTMod.URIS */]
  extends fpDashTsLib.libFunctorMod.Functor1[F] {
  def extend[A, B](
    ea: fpDashTsLib.libHKTMod.Type[F, A],
    f: js.Function1[/* fa */ fpDashTsLib.libHKTMod.Type[F, A], B]
  ): fpDashTsLib.libHKTMod.Type[F, B]
}

object Extend1 {
  @scala.inline
  def apply[F /* <: fpDashTsLib.libHKTMod.URIS */](
    URI: F,
    extend: js.Function2[
      fpDashTsLib.libHKTMod.Type[F, js.Any], 
      js.Function1[/* fa */ fpDashTsLib.libHKTMod.Type[F, js.Any], js.Any], 
      fpDashTsLib.libHKTMod.Type[F, js.Any]
    ],
    map: js.Function2[
      fpDashTsLib.libHKTMod.Type[F, js.Any], 
      js.Function1[js.Any, js.Any], 
      fpDashTsLib.libHKTMod.Type[F, js.Any]
    ]
  ): Extend1[F] = {
    val __obj = js.Dynamic.literal(URI = URI.asInstanceOf[js.Any], extend = extend, map = map)
  
    __obj.asInstanceOf[Extend1[F]]
  }
}

