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

