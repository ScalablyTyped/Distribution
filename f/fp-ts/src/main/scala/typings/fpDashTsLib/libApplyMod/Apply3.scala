package typings
package fpDashTsLib.libApplyMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Apply3[F /* <: fpDashTsLib.libHKTMod.URIS3 */]
  extends fpDashTsLib.libFunctorMod.Functor3[F] {
  def ap[U, L, A, B](
    fab: fpDashTsLib.libHKTMod.Type3[F, U, L, js.Function1[/* a */ A, B]],
    fa: fpDashTsLib.libHKTMod.Type3[F, U, L, A]
  ): fpDashTsLib.libHKTMod.Type3[F, U, L, B]
}

