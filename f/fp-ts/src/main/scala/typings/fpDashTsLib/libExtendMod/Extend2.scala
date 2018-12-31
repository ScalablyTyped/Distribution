package typings
package fpDashTsLib.libExtendMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Extend2[F /* <: fpDashTsLib.libHKTMod.URIS2 */]
  extends fpDashTsLib.libFunctorMod.Functor2[F] {
  def extend[L, A, B](
    ea: fpDashTsLib.libHKTMod.Type2[F, L, A],
    f: js.Function1[/* fa */ fpDashTsLib.libHKTMod.Type2[F, L, A], B]
  ): fpDashTsLib.libHKTMod.Type2[F, L, B]
}

