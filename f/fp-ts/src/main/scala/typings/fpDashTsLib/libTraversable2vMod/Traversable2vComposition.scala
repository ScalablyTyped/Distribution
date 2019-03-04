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

object Traversable2vComposition {
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
    map: js.Function2[
      fpDashTsLib.libHKTMod.HKT[F, fpDashTsLib.libHKTMod.HKT[G, js.Any]], 
      js.Function1[js.Any, js.Any], 
      fpDashTsLib.libHKTMod.HKT[F, fpDashTsLib.libHKTMod.HKT[G, js.Any]]
    ],
    reduce: js.Function3[
      fpDashTsLib.libHKTMod.HKT[F, fpDashTsLib.libHKTMod.HKT[G, js.Any]], 
      js.Any, 
      js.Function2[js.Any, js.Any, js.Any], 
      js.Any
    ],
    sequence: js.Function1[
      fpDashTsLib.libApplicativeMod.Applicative[js.Any], 
      js.Function1[
        /* fga */ fpDashTsLib.libHKTMod.HKT[F, fpDashTsLib.libHKTMod.HKT[G, fpDashTsLib.libHKTMod.HKT[js.Any, _]]], 
        fpDashTsLib.libHKTMod.HKT[js.Any, fpDashTsLib.libHKTMod.HKT[F, fpDashTsLib.libHKTMod.HKT[G, _]]]
      ]
    ],
    traverse: js.Function1[
      fpDashTsLib.libApplicativeMod.Applicative[js.Any], 
      js.Function2[
        /* fga */ fpDashTsLib.libHKTMod.HKT[F, fpDashTsLib.libHKTMod.HKT[G, _]], 
        /* f */ js.Function1[/* a */ js.Any, fpDashTsLib.libHKTMod.HKT[js.Any, _]], 
        fpDashTsLib.libHKTMod.HKT[js.Any, fpDashTsLib.libHKTMod.HKT[F, fpDashTsLib.libHKTMod.HKT[G, _]]]
      ]
    ]
  ): Traversable2vComposition[F, G] = {
    val __obj = js.Dynamic.literal(foldMap = foldMap, foldr = foldr, map = map, reduce = reduce, sequence = sequence, traverse = traverse)
  
    __obj.asInstanceOf[Traversable2vComposition[F, G]]
  }
}

