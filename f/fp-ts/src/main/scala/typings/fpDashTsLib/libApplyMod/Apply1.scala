package typings
package fpDashTsLib.libApplyMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Apply1[F /* <: fpDashTsLib.libHKTMod.URIS */]
  extends fpDashTsLib.libFunctorMod.Functor1[F] {
  def ap[A, B](
    fab: fpDashTsLib.libHKTMod.Type[F, js.Function1[/* a */ A, B]],
    fa: fpDashTsLib.libHKTMod.Type[F, A]
  ): fpDashTsLib.libHKTMod.Type[F, B]
}

