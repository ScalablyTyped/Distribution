package typings
package fpDashTsLib.libProfunctorMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait Profunctor3[F /* <: fpDashTsLib.libHKTMod.URIS3 */]
  extends fpDashTsLib.libFunctorMod.Functor3[F] {
  def promap[U, A, B, C, D](
    fbc: fpDashTsLib.libHKTMod.Type3[F, U, B, C],
    f: js.Function1[/* a */ A, B],
    g: js.Function1[/* c */ C, D]
  ): fpDashTsLib.libHKTMod.Type3[F, U, A, D]
}

