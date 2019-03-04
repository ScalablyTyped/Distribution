package typings
package fpDashTsLib.libFoldableWithIndexMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait FoldableWithIndexComposition12C[F /* <: fpDashTsLib.libHKTMod.URIS */, FI, G /* <: fpDashTsLib.libHKTMod.URIS2 */, GI, LG]
  extends fpDashTsLib.libFoldable2vMod.Foldable2vComposition12C[F, G, LG] {
  def foldMapWithIndex[M](M: fpDashTsLib.libMonoidMod.Monoid[M]): js.Function2[
    /* fga */ fpDashTsLib.libHKTMod.Type[F, fpDashTsLib.libHKTMod.Type2[G, LG, _]], 
    /* f */ js.Function2[/* i */ js.Tuple2[FI, GI], /* a */ js.Any, M], 
    M
  ]
  def foldrWithIndex[A, B](
    fga: fpDashTsLib.libHKTMod.Type[F, fpDashTsLib.libHKTMod.Type2[G, LG, A]],
    b: B,
    f: js.Function3[/* i */ js.Tuple2[FI, GI], /* a */ A, /* b */ B, B]
  ): B
  def reduceWithIndex[A, B](
    fga: fpDashTsLib.libHKTMod.Type[F, fpDashTsLib.libHKTMod.Type2[G, LG, A]],
    b: B,
    f: js.Function3[/* i */ js.Tuple2[FI, GI], /* b */ B, /* a */ A, B]
  ): B
}

object FoldableWithIndexComposition12C {
  @scala.inline
  def apply[F /* <: fpDashTsLib.libHKTMod.URIS */, FI, G /* <: fpDashTsLib.libHKTMod.URIS2 */, GI, LG](
    foldMap: js.Function1[
      fpDashTsLib.libMonoidMod.Monoid[js.Any], 
      js.Function2[
        /* fa */ fpDashTsLib.libHKTMod.Type[F, fpDashTsLib.libHKTMod.Type2[G, LG, _]], 
        /* f */ js.Function1[/* a */ js.Any, js.Any], 
        js.Any
      ]
    ],
    foldMapWithIndex: js.Function1[
      fpDashTsLib.libMonoidMod.Monoid[js.Any], 
      js.Function2[
        /* fga */ fpDashTsLib.libHKTMod.Type[F, fpDashTsLib.libHKTMod.Type2[G, LG, _]], 
        /* f */ js.Function2[/* i */ js.Tuple2[FI, GI], /* a */ js.Any, js.Any], 
        js.Any
      ]
    ],
    foldr: js.Function3[
      fpDashTsLib.libHKTMod.Type[F, fpDashTsLib.libHKTMod.Type2[G, LG, js.Any]], 
      js.Any, 
      js.Function2[js.Any, js.Any, js.Any], 
      js.Any
    ],
    foldrWithIndex: js.Function3[
      fpDashTsLib.libHKTMod.Type[F, fpDashTsLib.libHKTMod.Type2[G, LG, js.Any]], 
      js.Any, 
      js.Function3[/* i */ js.Tuple2[FI, GI], js.Any, js.Any, js.Any], 
      js.Any
    ],
    reduce: js.Function3[
      fpDashTsLib.libHKTMod.Type[F, fpDashTsLib.libHKTMod.Type2[G, LG, js.Any]], 
      js.Any, 
      js.Function2[js.Any, js.Any, js.Any], 
      js.Any
    ],
    reduceWithIndex: js.Function3[
      fpDashTsLib.libHKTMod.Type[F, fpDashTsLib.libHKTMod.Type2[G, LG, js.Any]], 
      js.Any, 
      js.Function3[/* i */ js.Tuple2[FI, GI], js.Any, js.Any, js.Any], 
      js.Any
    ]
  ): FoldableWithIndexComposition12C[F, FI, G, GI, LG] = {
    val __obj = js.Dynamic.literal(foldMap = foldMap, foldMapWithIndex = foldMapWithIndex, foldr = foldr, foldrWithIndex = foldrWithIndex, reduce = reduce, reduceWithIndex = reduceWithIndex)
  
    __obj.asInstanceOf[FoldableWithIndexComposition12C[F, FI, G, GI, LG]]
  }
}

