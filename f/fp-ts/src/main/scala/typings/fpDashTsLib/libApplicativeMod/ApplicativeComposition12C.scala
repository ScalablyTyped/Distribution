package typings
package fpDashTsLib.libApplicativeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait ApplicativeComposition12C[F /* <: fpDashTsLib.libHKTMod.URIS */, G /* <: fpDashTsLib.libHKTMod.URIS2 */, L]
  extends fpDashTsLib.libFunctorMod.FunctorComposition12C[F, G, L] {
  def ap[A, B](
    fgab: fpDashTsLib.libHKTMod.Type[F, fpDashTsLib.libHKTMod.Type2[G, L, js.Function1[/* a */ A, B]]],
    fga: fpDashTsLib.libHKTMod.Type[F, fpDashTsLib.libHKTMod.Type2[G, L, A]]
  ): fpDashTsLib.libHKTMod.Type[F, fpDashTsLib.libHKTMod.Type2[G, L, B]]
  def of[A](a: A): fpDashTsLib.libHKTMod.Type[F, fpDashTsLib.libHKTMod.Type2[G, L, A]]
}

