package typings
package fpDashTsLib.libApplicativeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait ApplicativeComposition22[F /* <: fpDashTsLib.libHKTMod.URIS2 */, G /* <: fpDashTsLib.libHKTMod.URIS2 */]
  extends fpDashTsLib.libFunctorMod.FunctorComposition22[F, G] {
  def ap[L, M, A, B](
    fgab: fpDashTsLib.libHKTMod.Type2[F, L, fpDashTsLib.libHKTMod.Type2[G, M, js.Function1[/* a */ A, B]]],
    fga: fpDashTsLib.libHKTMod.Type2[F, L, fpDashTsLib.libHKTMod.Type2[G, M, A]]
  ): fpDashTsLib.libHKTMod.Type2[F, L, fpDashTsLib.libHKTMod.Type2[G, M, B]]
  def of[L, M, A](a: A): fpDashTsLib.libHKTMod.Type2[F, L, fpDashTsLib.libHKTMod.Type2[G, M, A]]
}

