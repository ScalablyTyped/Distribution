package typings
package fpDashTsLib.libFoldable2vMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Foldable2vComposition[F, G]
  extends fpDashTsLib.libFoldableMod.FoldableComposition[F, G] {
  def foldMap[M](M: fpDashTsLib.libMonoidMod.Monoid[M]): js.Function2[
    /* fa */ fpDashTsLib.libHKTMod.HKT[F, fpDashTsLib.libHKTMod.HKT[G, _]], 
    /* f */ js.Function1[/* a */ js.Any, M], 
    M
  ]
  def foldr[A, B](
    fa: fpDashTsLib.libHKTMod.HKT[F, fpDashTsLib.libHKTMod.HKT[G, A]],
    b: B,
    f: js.Function2[/* a */ A, /* b */ B, B]
  ): B
}

object Foldable2vComposition {
  @scala.inline
  def apply[F, G](
    foldMap: js.Function1[
      fpDashTsLib.libMonoidMod.Monoid[js.Any], 
      js.Function2[
        /* fa */ fpDashTsLib.libHKTMod.HKT[F, fpDashTsLib.libHKTMod.HKT[G, _]], 
        /* f */ js.Function1[/* a */ js.Any, js.Any], 
        js.Any
      ]
    ],
    foldr: js.Function3[
      fpDashTsLib.libHKTMod.HKT[F, fpDashTsLib.libHKTMod.HKT[G, js.Any]], 
      js.Any, 
      js.Function2[js.Any, js.Any, js.Any], 
      js.Any
    ],
    reduce: js.Function3[
      fpDashTsLib.libHKTMod.HKT[F, fpDashTsLib.libHKTMod.HKT[G, js.Any]], 
      js.Any, 
      js.Function2[js.Any, js.Any, js.Any], 
      js.Any
    ]
  ): Foldable2vComposition[F, G] = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("foldMap")(foldMap)
    __obj.updateDynamic("foldr")(foldr)
    __obj.updateDynamic("reduce")(reduce)
    __obj.asInstanceOf[Foldable2vComposition[F, G]]
  }
}

