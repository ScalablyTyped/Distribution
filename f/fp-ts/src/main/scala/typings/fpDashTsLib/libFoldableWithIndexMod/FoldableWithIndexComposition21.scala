package typings
package fpDashTsLib.libFoldableWithIndexMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait FoldableWithIndexComposition21[F /* <: fpDashTsLib.libHKTMod.URIS2 */, FI, G /* <: fpDashTsLib.libHKTMod.URIS */, GI]
  extends fpDashTsLib.libFoldable2vMod.Foldable2vComposition21[F, G] {
  def foldMapWithIndex[M](M: fpDashTsLib.libMonoidMod.Monoid[M]): js.Function2[
    /* fga */ fpDashTsLib.libHKTMod.Type2[F, _, fpDashTsLib.libHKTMod.Type[G, _]], 
    /* f */ js.Function2[/* i */ js.Tuple2[FI, GI], /* a */ js.Any, M], 
    M
  ]
  def foldrWithIndex[LF, A, B](
    fga: fpDashTsLib.libHKTMod.Type2[F, LF, fpDashTsLib.libHKTMod.Type[G, A]],
    b: B,
    f: js.Function3[/* i */ js.Tuple2[FI, GI], /* a */ A, /* b */ B, B]
  ): B
  def reduceWithIndex[LF, A, B](
    fga: fpDashTsLib.libHKTMod.Type2[F, LF, fpDashTsLib.libHKTMod.Type[G, A]],
    b: B,
    f: js.Function3[/* i */ js.Tuple2[FI, GI], /* b */ B, /* a */ A, B]
  ): B
}

object FoldableWithIndexComposition21 {
  @scala.inline
  def apply[F /* <: fpDashTsLib.libHKTMod.URIS2 */, FI, G /* <: fpDashTsLib.libHKTMod.URIS */, GI](
    foldMap: js.Function1[
      fpDashTsLib.libMonoidMod.Monoid[js.Any], 
      js.Function2[
        /* fa */ fpDashTsLib.libHKTMod.Type2[F, _, fpDashTsLib.libHKTMod.Type[G, _]], 
        /* f */ js.Function1[/* a */ js.Any, js.Any], 
        js.Any
      ]
    ],
    foldMapWithIndex: js.Function1[
      fpDashTsLib.libMonoidMod.Monoid[js.Any], 
      js.Function2[
        /* fga */ fpDashTsLib.libHKTMod.Type2[F, _, fpDashTsLib.libHKTMod.Type[G, _]], 
        /* f */ js.Function2[/* i */ js.Tuple2[FI, GI], /* a */ js.Any, js.Any], 
        js.Any
      ]
    ],
    foldr: js.Function3[
      fpDashTsLib.libHKTMod.Type2[F, js.Any, fpDashTsLib.libHKTMod.Type[G, js.Any]], 
      js.Any, 
      js.Function2[js.Any, js.Any, js.Any], 
      js.Any
    ],
    foldrWithIndex: js.Function3[
      fpDashTsLib.libHKTMod.Type2[F, js.Any, fpDashTsLib.libHKTMod.Type[G, js.Any]], 
      js.Any, 
      js.Function3[/* i */ js.Tuple2[FI, GI], js.Any, js.Any, js.Any], 
      js.Any
    ],
    reduce: js.Function3[
      fpDashTsLib.libHKTMod.Type2[F, js.Any, fpDashTsLib.libHKTMod.Type[G, js.Any]], 
      js.Any, 
      js.Function2[js.Any, js.Any, js.Any], 
      js.Any
    ],
    reduceWithIndex: js.Function3[
      fpDashTsLib.libHKTMod.Type2[F, js.Any, fpDashTsLib.libHKTMod.Type[G, js.Any]], 
      js.Any, 
      js.Function3[/* i */ js.Tuple2[FI, GI], js.Any, js.Any, js.Any], 
      js.Any
    ]
  ): FoldableWithIndexComposition21[F, FI, G, GI] = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("foldMap")(foldMap)
    __obj.updateDynamic("foldMapWithIndex")(foldMapWithIndex)
    __obj.updateDynamic("foldr")(foldr)
    __obj.updateDynamic("foldrWithIndex")(foldrWithIndex)
    __obj.updateDynamic("reduce")(reduce)
    __obj.updateDynamic("reduceWithIndex")(reduceWithIndex)
    __obj.asInstanceOf[FoldableWithIndexComposition21[F, FI, G, GI]]
  }
}

