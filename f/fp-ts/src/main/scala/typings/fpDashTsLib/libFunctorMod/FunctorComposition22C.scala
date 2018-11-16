package typings
package fpDashTsLib.libFunctorMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait FunctorComposition22C[F /* <: fpDashTsLib.libHKTMod.URIS2 */, G /* <: fpDashTsLib.libHKTMod.URIS2 */, M] extends js.Object {
  def map[L, A, B](
    fa: fpDashTsLib.libHKTMod.Type2[F, L, fpDashTsLib.libHKTMod.Type2[G, M, A]],
    f: js.Function1[/* a */ A, B]
  ): fpDashTsLib.libHKTMod.Type2[F, L, fpDashTsLib.libHKTMod.Type2[G, M, B]]
}

