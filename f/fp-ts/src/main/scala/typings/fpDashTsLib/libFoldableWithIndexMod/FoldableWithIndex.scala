package typings
package fpDashTsLib.libFoldableWithIndexMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait FoldableWithIndex[F, I]
  extends fpDashTsLib.libFoldable2vMod.Foldable2v[F] {
  def foldMapWithIndex[M](M: fpDashTsLib.libMonoidMod.Monoid[M]): js.Function2[
    /* fa */ fpDashTsLib.libHKTMod.HKT[F, _], 
    /* f */ js.Function2[/* i */ I, /* a */ js.Any, M], 
    M
  ]
  def foldrWithIndex[A, B](fa: fpDashTsLib.libHKTMod.HKT[F, A], b: B, f: js.Function3[/* i */ I, /* a */ A, /* b */ B, B]): B
  def reduceWithIndex[A, B](fa: fpDashTsLib.libHKTMod.HKT[F, A], b: B, f: js.Function3[/* i */ I, /* b */ B, /* a */ A, B]): B
}

object FoldableWithIndex {
  @scala.inline
  def apply[F, I](
    URI: F,
    foldMap: js.Function1[
      fpDashTsLib.libMonoidMod.Monoid[js.Any], 
      js.Function2[
        /* fa */ fpDashTsLib.libHKTMod.HKT[F, _], 
        /* f */ js.Function1[/* a */ js.Any, js.Any], 
        js.Any
      ]
    ],
    foldMapWithIndex: js.Function1[
      fpDashTsLib.libMonoidMod.Monoid[js.Any], 
      js.Function2[
        /* fa */ fpDashTsLib.libHKTMod.HKT[F, _], 
        /* f */ js.Function2[/* i */ I, /* a */ js.Any, js.Any], 
        js.Any
      ]
    ],
    foldr: js.Function3[
      fpDashTsLib.libHKTMod.HKT[F, js.Any], 
      js.Any, 
      js.Function2[js.Any, js.Any, js.Any], 
      js.Any
    ],
    foldrWithIndex: js.Function3[
      fpDashTsLib.libHKTMod.HKT[F, js.Any], 
      js.Any, 
      js.Function3[/* i */ I, js.Any, js.Any, js.Any], 
      js.Any
    ],
    reduce: js.Function3[
      fpDashTsLib.libHKTMod.HKT[F, js.Any], 
      js.Any, 
      js.Function2[js.Any, js.Any, js.Any], 
      js.Any
    ],
    reduceWithIndex: js.Function3[
      fpDashTsLib.libHKTMod.HKT[F, js.Any], 
      js.Any, 
      js.Function3[/* i */ I, js.Any, js.Any, js.Any], 
      js.Any
    ]
  ): FoldableWithIndex[F, I] = {
    val __obj = js.Dynamic.literal(URI = URI.asInstanceOf[js.Any], foldMap = foldMap, foldMapWithIndex = foldMapWithIndex, foldr = foldr, foldrWithIndex = foldrWithIndex, reduce = reduce, reduceWithIndex = reduceWithIndex)
  
    __obj.asInstanceOf[FoldableWithIndex[F, I]]
  }
}

