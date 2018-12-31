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

