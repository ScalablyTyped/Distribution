package typings
package fpDashTsLib.libApplicativeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait ApplicativeComposition3C1[F /* <: fpDashTsLib.libHKTMod.URIS3 */, G /* <: fpDashTsLib.libHKTMod.URIS */, U, L]
  extends fpDashTsLib.libFunctorMod.FunctorComposition3C1[F, G, U, L] {
  def ap[A, B](
    fgab: fpDashTsLib.libHKTMod.Type3[F, U, L, fpDashTsLib.libHKTMod.Type[G, js.Function1[/* a */ A, B]]],
    fga: fpDashTsLib.libHKTMod.Type3[F, U, L, fpDashTsLib.libHKTMod.Type[G, A]]
  ): fpDashTsLib.libHKTMod.Type3[F, U, L, fpDashTsLib.libHKTMod.Type[G, B]]
  def of[A](a: A): fpDashTsLib.libHKTMod.Type3[F, U, L, fpDashTsLib.libHKTMod.Type[G, A]]
}

