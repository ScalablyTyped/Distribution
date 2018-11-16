package typings
package fpDashTsLib.libFreeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait FoldFree3[M /* <: fpDashTsLib.libHKTMod.URIS3 */] extends js.Object {
  def apply[F /* <: fpDashTsLib.libHKTMod.URIS3 */, U, L, A](
    nt: js.Function1[
      /* fa */ fpDashTsLib.libHKTMod.Type3[F, U, L, _], 
      fpDashTsLib.libHKTMod.Type3[M, U, L, _]
    ],
    fa: Free[F, A]
  ): fpDashTsLib.libHKTMod.Type3[M, U, L, A] = js.native
}

