package typings
package fpDashTsLib.libApplicativeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Applicative2C[F /* <: fpDashTsLib.libHKTMod.URIS2 */, L]
  extends fpDashTsLib.libApplyMod.Apply2C[F, L] {
  def of[A](a: A): fpDashTsLib.libHKTMod.Type2[F, L, A]
}

object Applicative2C {
  @scala.inline
  def apply[F /* <: fpDashTsLib.libHKTMod.URIS2 */, L](
    URI: F,
    _L: L,
    ap: js.Function2[
      fpDashTsLib.libHKTMod.Type2[F, L, js.Function1[js.Any, js.Any]], 
      fpDashTsLib.libHKTMod.Type2[F, L, js.Any], 
      fpDashTsLib.libHKTMod.Type2[F, L, js.Any]
    ],
    map: js.Function2[
      fpDashTsLib.libHKTMod.Type2[F, L, js.Any], 
      js.Function1[js.Any, js.Any], 
      fpDashTsLib.libHKTMod.Type2[F, L, js.Any]
    ],
    of: js.Function1[js.Any, fpDashTsLib.libHKTMod.Type2[F, L, js.Any]]
  ): Applicative2C[F, L] = {
    val __obj = js.Dynamic.literal(URI = URI.asInstanceOf[js.Any], _L = _L.asInstanceOf[js.Any], ap = ap, map = map, of = of)
  
    __obj.asInstanceOf[Applicative2C[F, L]]
  }
}

