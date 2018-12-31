package typings
package fpDashTsLib.libExtendMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Extend2C[F /* <: fpDashTsLib.libHKTMod.URIS2 */, L]
  extends fpDashTsLib.libFunctorMod.Functor2C[F, L] {
  def extend[A, B](
    ea: fpDashTsLib.libHKTMod.Type2[F, L, A],
    f: js.Function1[/* fa */ fpDashTsLib.libHKTMod.Type2[F, L, A], B]
  ): fpDashTsLib.libHKTMod.Type2[F, L, B]
}

