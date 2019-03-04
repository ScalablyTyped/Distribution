package typings
package fpDashTsLib.libAltMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Alt3C[F /* <: fpDashTsLib.libHKTMod.URIS3 */, U, L]
  extends fpDashTsLib.libFunctorMod.Functor3C[F, U, L] {
  def alt[A](fx: fpDashTsLib.libHKTMod.Type3[F, U, L, A], fy: fpDashTsLib.libHKTMod.Type3[F, U, L, A]): fpDashTsLib.libHKTMod.Type3[F, U, L, A]
}

object Alt3C {
  @scala.inline
  def apply[F /* <: fpDashTsLib.libHKTMod.URIS3 */, U, L](
    URI: F,
    _L: L,
    _U: U,
    alt: js.Function2[
      fpDashTsLib.libHKTMod.Type3[F, U, L, js.Any], 
      fpDashTsLib.libHKTMod.Type3[F, U, L, js.Any], 
      fpDashTsLib.libHKTMod.Type3[F, U, L, js.Any]
    ],
    map: js.Function2[
      fpDashTsLib.libHKTMod.Type3[F, U, L, js.Any], 
      js.Function1[js.Any, js.Any], 
      fpDashTsLib.libHKTMod.Type3[F, U, L, js.Any]
    ]
  ): Alt3C[F, U, L] = {
    val __obj = js.Dynamic.literal(URI = URI.asInstanceOf[js.Any], _L = _L.asInstanceOf[js.Any], _U = _U.asInstanceOf[js.Any], alt = alt, map = map)
  
    __obj.asInstanceOf[Alt3C[F, U, L]]
  }
}

