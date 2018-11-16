package typings
package fpDashTsLib.libApplicativeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait ApplicativeComposition[F, G]
  extends fpDashTsLib.libFunctorMod.FunctorComposition[F, G] {
  def ap[A, B](
    fgab: fpDashTsLib.libHKTMod.HKT[F, fpDashTsLib.libHKTMod.HKT[G, js.Function1[/* a */ A, B]]],
    fga: fpDashTsLib.libHKTMod.HKT[F, fpDashTsLib.libHKTMod.HKT[G, A]]
  ): fpDashTsLib.libHKTMod.HKT[F, fpDashTsLib.libHKTMod.HKT[G, B]]
  def of[A](a: A): fpDashTsLib.libHKTMod.HKT[F, fpDashTsLib.libHKTMod.HKT[G, A]]
}

