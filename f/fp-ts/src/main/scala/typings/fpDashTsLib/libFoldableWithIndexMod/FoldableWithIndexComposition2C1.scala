package typings
package fpDashTsLib.libFoldableWithIndexMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait FoldableWithIndexComposition2C1[F /* <: fpDashTsLib.libHKTMod.URIS2 */, FI, G /* <: fpDashTsLib.libHKTMod.URIS */, GI, LF]
  extends fpDashTsLib.libFoldable2vMod.Foldable2vComposition2C1[F, G, LF] {
  def foldMapWithIndex[M](M: fpDashTsLib.libMonoidMod.Monoid[M]): js.Function2[
    /* fga */ fpDashTsLib.libHKTMod.Type2[F, LF, fpDashTsLib.libHKTMod.Type[G, _]], 
    /* f */ js.Function2[/* i */ js.Tuple2[FI, GI], /* a */ js.Any, M], 
    M
  ]
  def foldrWithIndex[A, B](
    fga: fpDashTsLib.libHKTMod.Type2[F, LF, fpDashTsLib.libHKTMod.Type[G, A]],
    b: B,
    f: js.Function3[/* i */ js.Tuple2[FI, GI], /* a */ A, /* b */ B, B]
  ): B
  def reduceWithIndex[A, B](
    fga: fpDashTsLib.libHKTMod.Type2[F, LF, fpDashTsLib.libHKTMod.Type[G, A]],
    b: B,
    f: js.Function3[/* i */ js.Tuple2[FI, GI], /* b */ B, /* a */ A, B]
  ): B
}

object FoldableWithIndexComposition2C1 {
  @scala.inline
  def apply[F /* <: fpDashTsLib.libHKTMod.URIS2 */, FI, G /* <: fpDashTsLib.libHKTMod.URIS */, GI, LF](
    foldMap: js.Function1[
      fpDashTsLib.libMonoidMod.Monoid[js.Any], 
      js.Function2[
        /* fa */ fpDashTsLib.libHKTMod.Type2[F, LF, fpDashTsLib.libHKTMod.Type[G, _]], 
        /* f */ js.Function1[/* a */ js.Any, js.Any], 
        js.Any
      ]
    ],
    foldMapWithIndex: js.Function1[
      fpDashTsLib.libMonoidMod.Monoid[js.Any], 
      js.Function2[
        /* fga */ fpDashTsLib.libHKTMod.Type2[F, LF, fpDashTsLib.libHKTMod.Type[G, _]], 
        /* f */ js.Function2[/* i */ js.Tuple2[FI, GI], /* a */ js.Any, js.Any], 
        js.Any
      ]
    ],
    foldr: js.Function3[
      fpDashTsLib.libHKTMod.Type2[F, LF, fpDashTsLib.libHKTMod.Type[G, js.Any]], 
      js.Any, 
      js.Function2[js.Any, js.Any, js.Any], 
      js.Any
    ],
    foldrWithIndex: js.Function3[
      fpDashTsLib.libHKTMod.Type2[F, LF, fpDashTsLib.libHKTMod.Type[G, js.Any]], 
      js.Any, 
      js.Function3[/* i */ js.Tuple2[FI, GI], js.Any, js.Any, js.Any], 
      js.Any
    ],
    reduce: js.Function3[
      fpDashTsLib.libHKTMod.Type2[F, LF, fpDashTsLib.libHKTMod.Type[G, js.Any]], 
      js.Any, 
      js.Function2[js.Any, js.Any, js.Any], 
      js.Any
    ],
    reduceWithIndex: js.Function3[
      fpDashTsLib.libHKTMod.Type2[F, LF, fpDashTsLib.libHKTMod.Type[G, js.Any]], 
      js.Any, 
      js.Function3[/* i */ js.Tuple2[FI, GI], js.Any, js.Any, js.Any], 
      js.Any
    ]
  ): FoldableWithIndexComposition2C1[F, FI, G, GI, LF] = {
    val __obj = js.Dynamic.literal(foldMap = foldMap, foldMapWithIndex = foldMapWithIndex, foldr = foldr, foldrWithIndex = foldrWithIndex, reduce = reduce, reduceWithIndex = reduceWithIndex)
  
    __obj.asInstanceOf[FoldableWithIndexComposition2C1[F, FI, G, GI, LF]]
  }
}

