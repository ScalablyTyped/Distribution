package typings
package fpDashTsLib.libTraversableMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait TraversableComposition[F, G]
  extends fpDashTsLib.libFoldableMod.FoldableComposition[F, G]
     with fpDashTsLib.libFunctorMod.FunctorComposition[F, G] {
  def traverse[H](H: fpDashTsLib.libApplicativeMod.Applicative[H]): js.Function2[
    /* fga */ fpDashTsLib.libHKTMod.HKT[F, fpDashTsLib.libHKTMod.HKT[G, _]], 
    /* f */ js.Function1[/* a */ js.Any, fpDashTsLib.libHKTMod.HKT[H, _]], 
    fpDashTsLib.libHKTMod.HKT[H, fpDashTsLib.libHKTMod.HKT[F, fpDashTsLib.libHKTMod.HKT[G, _]]]
  ]
}

