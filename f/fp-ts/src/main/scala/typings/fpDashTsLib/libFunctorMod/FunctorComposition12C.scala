package typings
package fpDashTsLib.libFunctorMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait FunctorComposition12C[F /* <: fpDashTsLib.libHKTMod.URIS */, G /* <: fpDashTsLib.libHKTMod.URIS2 */, L] extends js.Object {
  def map[A, B](
    fa: fpDashTsLib.libHKTMod.Type[F, fpDashTsLib.libHKTMod.Type2[G, L, A]],
    f: js.Function1[/* a */ A, B]
  ): fpDashTsLib.libHKTMod.Type[F, fpDashTsLib.libHKTMod.Type2[G, L, B]]
}

