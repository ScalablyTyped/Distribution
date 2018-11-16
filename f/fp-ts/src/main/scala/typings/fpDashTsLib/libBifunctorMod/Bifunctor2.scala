package typings
package fpDashTsLib.libBifunctorMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait Bifunctor2[F /* <: fpDashTsLib.libHKTMod.URIS2 */] extends js.Object {
  val URI: F
  def bimap[L, A, M, B](
    fla: fpDashTsLib.libHKTMod.Type2[F, L, A],
    f: js.Function1[/* l */ L, M],
    g: js.Function1[/* a */ A, B]
  ): fpDashTsLib.libHKTMod.Type2[F, M, B]
}

