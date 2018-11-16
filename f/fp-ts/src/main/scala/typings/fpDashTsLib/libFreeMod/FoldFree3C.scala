package typings
package fpDashTsLib.libFreeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait FoldFree3C[M /* <: fpDashTsLib.libHKTMod.URIS3 */, U, L] extends js.Object {
  def apply[F /* <: fpDashTsLib.libHKTMod.URIS2 */, A](
    nt: js.Function1[
      /* fa */ fpDashTsLib.libHKTMod.Type2[F, L, _], 
      fpDashTsLib.libHKTMod.Type3[M, U, L, _]
    ],
    fa: Free[F, A]
  ): fpDashTsLib.libHKTMod.Type3[M, U, L, A] = js.native
}

