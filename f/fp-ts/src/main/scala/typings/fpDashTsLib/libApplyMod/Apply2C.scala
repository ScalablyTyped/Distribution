package typings
package fpDashTsLib.libApplyMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Apply2C[F /* <: fpDashTsLib.libHKTMod.URIS2 */, L]
  extends fpDashTsLib.libFunctorMod.Functor2C[F, L] {
  def ap[A, B](
    fab: fpDashTsLib.libHKTMod.Type2[F, L, js.Function1[/* a */ A, B]],
    fa: fpDashTsLib.libHKTMod.Type2[F, L, A]
  ): fpDashTsLib.libHKTMod.Type2[F, L, B]
}

