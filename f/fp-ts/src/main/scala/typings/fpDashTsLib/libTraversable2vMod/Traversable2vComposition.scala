package typings
package fpDashTsLib.libTraversable2vMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Traversable2vComposition[F, G]
  extends fpDashTsLib.libFoldable2vMod.Foldable2vComposition[F, G]
     with fpDashTsLib.libFunctorMod.FunctorComposition[F, G] {
  def sequence[H](H: fpDashTsLib.libApplicativeMod.Applicative[H]): js.Function1[
    /* fga */ fpDashTsLib.libHKTMod.HKT[F, fpDashTsLib.libHKTMod.HKT[G, fpDashTsLib.libHKTMod.HKT[H, _]]], 
    fpDashTsLib.libHKTMod.HKT[H, fpDashTsLib.libHKTMod.HKT[F, fpDashTsLib.libHKTMod.HKT[G, _]]]
  ]
  def traverse[H](H: fpDashTsLib.libApplicativeMod.Applicative[H]): js.Function2[
    /* fga */ fpDashTsLib.libHKTMod.HKT[F, fpDashTsLib.libHKTMod.HKT[G, _]], 
    /* f */ js.Function1[/* a */ js.Any, fpDashTsLib.libHKTMod.HKT[H, _]], 
    fpDashTsLib.libHKTMod.HKT[H, fpDashTsLib.libHKTMod.HKT[F, fpDashTsLib.libHKTMod.HKT[G, _]]]
  ]
}

