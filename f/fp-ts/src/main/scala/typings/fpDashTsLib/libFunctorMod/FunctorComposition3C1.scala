package typings
package fpDashTsLib.libFunctorMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait FunctorComposition3C1[F /* <: fpDashTsLib.libHKTMod.URIS3 */, G /* <: fpDashTsLib.libHKTMod.URIS */, U, L] extends js.Object {
  def map[A, B](
    fa: fpDashTsLib.libHKTMod.Type3[F, U, L, fpDashTsLib.libHKTMod.Type[G, A]],
    f: js.Function1[/* a */ A, B]
  ): fpDashTsLib.libHKTMod.Type3[F, U, L, fpDashTsLib.libHKTMod.Type[G, B]]
}

