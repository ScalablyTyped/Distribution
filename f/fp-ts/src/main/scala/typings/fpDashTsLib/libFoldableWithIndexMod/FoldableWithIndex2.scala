package typings
package fpDashTsLib.libFoldableWithIndexMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait FoldableWithIndex2[F /* <: fpDashTsLib.libHKTMod.URIS2 */, I]
  extends fpDashTsLib.libFoldable2vMod.Foldable2v2[F] {
  def foldMapWithIndex[M](M: fpDashTsLib.libMonoidMod.Monoid[M]): js.Function2[
    /* fa */ fpDashTsLib.libHKTMod.Type2[F, _, _], 
    /* f */ js.Function2[/* i */ I, /* a */ js.Any, M], 
    M
  ]
  def foldrWithIndex[L, A, B](
    fa: fpDashTsLib.libHKTMod.Type2[F, L, A],
    b: B,
    f: js.Function3[/* i */ I, /* a */ A, /* b */ B, B]
  ): B
  def reduceWithIndex[L, A, B](
    fa: fpDashTsLib.libHKTMod.Type2[F, L, A],
    b: B,
    f: js.Function3[/* i */ I, /* b */ B, /* a */ A, B]
  ): B
}

object FoldableWithIndex2 {
  @scala.inline
  def apply[F /* <: fpDashTsLib.libHKTMod.URIS2 */, I](
    URI: F,
    foldMap: js.Function1[
      fpDashTsLib.libMonoidMod.Monoid[js.Any], 
      js.Function2[
        /* fa */ fpDashTsLib.libHKTMod.Type2[F, _, _], 
        /* f */ js.Function1[/* a */ js.Any, js.Any], 
        js.Any
      ]
    ],
    foldMapWithIndex: js.Function1[
      fpDashTsLib.libMonoidMod.Monoid[js.Any], 
      js.Function2[
        /* fa */ fpDashTsLib.libHKTMod.Type2[F, _, _], 
        /* f */ js.Function2[/* i */ I, /* a */ js.Any, js.Any], 
        js.Any
      ]
    ],
    foldr: js.Function3[
      fpDashTsLib.libHKTMod.Type2[F, js.Any, js.Any], 
      js.Any, 
      js.Function2[js.Any, js.Any, js.Any], 
      js.Any
    ],
    foldrWithIndex: js.Function3[
      fpDashTsLib.libHKTMod.Type2[F, js.Any, js.Any], 
      js.Any, 
      js.Function3[/* i */ I, js.Any, js.Any, js.Any], 
      js.Any
    ],
    reduce: js.Function3[
      fpDashTsLib.libHKTMod.Type2[F, js.Any, js.Any], 
      js.Any, 
      js.Function2[js.Any, js.Any, js.Any], 
      js.Any
    ],
    reduceWithIndex: js.Function3[
      fpDashTsLib.libHKTMod.Type2[F, js.Any, js.Any], 
      js.Any, 
      js.Function3[/* i */ I, js.Any, js.Any, js.Any], 
      js.Any
    ]
  ): FoldableWithIndex2[F, I] = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("URI")(URI.asInstanceOf[js.Any])
    __obj.updateDynamic("foldMap")(foldMap)
    __obj.updateDynamic("foldMapWithIndex")(foldMapWithIndex)
    __obj.updateDynamic("foldr")(foldr)
    __obj.updateDynamic("foldrWithIndex")(foldrWithIndex)
    __obj.updateDynamic("reduce")(reduce)
    __obj.updateDynamic("reduceWithIndex")(reduceWithIndex)
    __obj.asInstanceOf[FoldableWithIndex2[F, I]]
  }
}

