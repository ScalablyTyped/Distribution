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

