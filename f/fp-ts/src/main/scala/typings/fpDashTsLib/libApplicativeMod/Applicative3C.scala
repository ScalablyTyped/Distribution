package typings
package fpDashTsLib.libApplicativeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Applicative3C[F /* <: fpDashTsLib.libHKTMod.URIS3 */, U, L]
  extends fpDashTsLib.libApplyMod.Apply3C[F, U, L] {
  def of[A](a: A): fpDashTsLib.libHKTMod.Type3[F, U, L, A]
}

object Applicative3C {
  @scala.inline
  def apply[F /* <: fpDashTsLib.libHKTMod.URIS3 */, U, L](
    URI: F,
    _L: L,
    _U: U,
    ap: js.Function2[
      fpDashTsLib.libHKTMod.Type3[F, U, L, js.Function1[js.Any, js.Any]], 
      fpDashTsLib.libHKTMod.Type3[F, U, L, js.Any], 
      fpDashTsLib.libHKTMod.Type3[F, U, L, js.Any]
    ],
    map: js.Function2[
      fpDashTsLib.libHKTMod.Type3[F, U, L, js.Any], 
      js.Function1[js.Any, js.Any], 
      fpDashTsLib.libHKTMod.Type3[F, U, L, js.Any]
    ],
    of: js.Function1[js.Any, fpDashTsLib.libHKTMod.Type3[F, U, L, js.Any]]
  ): Applicative3C[F, U, L] = {
    val __obj = js.Dynamic.literal(URI = URI.asInstanceOf[js.Any], _L = _L.asInstanceOf[js.Any], _U = _U.asInstanceOf[js.Any], ap = ap, map = map, of = of)
  
    __obj.asInstanceOf[Applicative3C[F, U, L]]
  }
}

