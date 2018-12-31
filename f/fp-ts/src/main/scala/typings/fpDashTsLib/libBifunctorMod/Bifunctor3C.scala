package typings
package fpDashTsLib.libBifunctorMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Bifunctor3C[F /* <: fpDashTsLib.libHKTMod.URIS3 */, U] extends js.Object {
  val URI: F
  val _U: U
  def bimap[L, A, M, B](
    fla: fpDashTsLib.libHKTMod.Type3[F, U, L, A],
    f: js.Function1[/* l */ L, M],
    g: js.Function1[/* a */ A, B]
  ): fpDashTsLib.libHKTMod.Type3[F, U, M, B]
}

