package typings
package fpDashTsLib.libFunctorMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait FunctorComposition21[F /* <: fpDashTsLib.libHKTMod.URIS2 */, G /* <: fpDashTsLib.libHKTMod.URIS */] extends js.Object {
  def map[L, A, B](
    fa: fpDashTsLib.libHKTMod.Type2[F, L, fpDashTsLib.libHKTMod.Type[G, A]],
    f: js.Function1[/* a */ A, B]
  ): fpDashTsLib.libHKTMod.Type2[F, L, fpDashTsLib.libHKTMod.Type[G, B]]
}

