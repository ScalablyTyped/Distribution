package typings
package fpDashTsLib.libExtendMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Extend3C[F /* <: fpDashTsLib.libHKTMod.URIS3 */, U, L]
  extends fpDashTsLib.libFunctorMod.Functor3C[F, U, L] {
  def extend[A, B](
    ea: fpDashTsLib.libHKTMod.Type3[F, U, L, A],
    f: js.Function1[/* fa */ fpDashTsLib.libHKTMod.Type3[F, U, L, A], B]
  ): fpDashTsLib.libHKTMod.Type3[F, U, L, B]
}

object Extend3C {
  @scala.inline
  def apply[F /* <: fpDashTsLib.libHKTMod.URIS3 */, U, L](
    URI: F,
    _L: L,
    _U: U,
    extend: js.Function2[
      fpDashTsLib.libHKTMod.Type3[F, U, L, js.Any], 
      js.Function1[/* fa */ fpDashTsLib.libHKTMod.Type3[F, U, L, js.Any], js.Any], 
      fpDashTsLib.libHKTMod.Type3[F, U, L, js.Any]
    ],
    map: js.Function2[
      fpDashTsLib.libHKTMod.Type3[F, U, L, js.Any], 
      js.Function1[js.Any, js.Any], 
      fpDashTsLib.libHKTMod.Type3[F, U, L, js.Any]
    ]
  ): Extend3C[F, U, L] = {
    val __obj = js.Dynamic.literal(URI = URI.asInstanceOf[js.Any], _L = _L.asInstanceOf[js.Any], _U = _U.asInstanceOf[js.Any], extend = extend, map = map)
  
    __obj.asInstanceOf[Extend3C[F, U, L]]
  }
}

