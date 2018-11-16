package typings
package fpDashTsLib.libFreeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait FoldFree2C[M /* <: fpDashTsLib.libHKTMod.URIS2 */, L] extends js.Object {
  def apply[F /* <: fpDashTsLib.libHKTMod.URIS */, A](
    nt: js.Function1[/* fa */ fpDashTsLib.libHKTMod.Type[F, _], fpDashTsLib.libHKTMod.Type2[M, L, _]],
    fa: Free[F, A]
  ): fpDashTsLib.libHKTMod.Type2[M, L, A] = js.native
}

