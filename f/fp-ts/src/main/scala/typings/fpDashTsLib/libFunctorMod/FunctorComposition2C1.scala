package typings
package fpDashTsLib.libFunctorMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait FunctorComposition2C1[F /* <: fpDashTsLib.libHKTMod.URIS2 */, G /* <: fpDashTsLib.libHKTMod.URIS */, L] extends js.Object {
  def map[A, B](
    fa: fpDashTsLib.libHKTMod.Type2[F, L, fpDashTsLib.libHKTMod.Type[G, A]],
    f: js.Function1[/* a */ A, B]
  ): fpDashTsLib.libHKTMod.Type2[F, L, fpDashTsLib.libHKTMod.Type[G, B]]
}

