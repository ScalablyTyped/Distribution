package typings
package fpDashTsLib.libApplicativeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait ApplicativeComposition21[F /* <: fpDashTsLib.libHKTMod.URIS2 */, G /* <: fpDashTsLib.libHKTMod.URIS */]
  extends fpDashTsLib.libFunctorMod.FunctorComposition21[F, G] {
  def ap[L, A, B](
    fgab: fpDashTsLib.libHKTMod.Type2[F, L, fpDashTsLib.libHKTMod.Type[G, js.Function1[/* a */ A, B]]],
    fga: fpDashTsLib.libHKTMod.Type2[F, L, fpDashTsLib.libHKTMod.Type[G, A]]
  ): fpDashTsLib.libHKTMod.Type2[F, L, fpDashTsLib.libHKTMod.Type[G, B]]
  def of[L, A](a: A): fpDashTsLib.libHKTMod.Type2[F, L, fpDashTsLib.libHKTMod.Type[G, A]]
}

