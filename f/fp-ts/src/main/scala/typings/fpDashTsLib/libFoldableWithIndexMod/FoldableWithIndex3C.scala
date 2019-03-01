package typings
package fpDashTsLib.libFoldableWithIndexMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait FoldableWithIndex3C[F /* <: fpDashTsLib.libHKTMod.URIS3 */, I, U, L]
  extends fpDashTsLib.libFoldable2vMod.Foldable2v3C[F, U, L] {
  def foldMapWithIndex[M](M: fpDashTsLib.libMonoidMod.Monoid[M]): js.Function2[
    /* fa */ fpDashTsLib.libHKTMod.Type3[F, U, L, _], 
    /* f */ js.Function2[/* i */ I, /* a */ js.Any, M], 
    M
  ]
  def foldrWithIndex[A, B](
    fa: fpDashTsLib.libHKTMod.Type3[F, U, L, A],
    b: B,
    f: js.Function3[/* i */ I, /* a */ A, /* b */ B, B]
  ): B
  def reduceWithIndex[A, B](
    fa: fpDashTsLib.libHKTMod.Type3[F, U, L, A],
    b: B,
    f: js.Function3[/* i */ I, /* b */ B, /* a */ A, B]
  ): B
}

object FoldableWithIndex3C {
  @scala.inline
  def apply[F /* <: fpDashTsLib.libHKTMod.URIS3 */, I, U, L](
    URI: F,
    _L: L,
    _U: U,
    foldMap: js.Function1[
      fpDashTsLib.libMonoidMod.Monoid[js.Any], 
      js.Function2[
        /* fa */ fpDashTsLib.libHKTMod.Type3[F, U, L, _], 
        /* f */ js.Function1[/* a */ js.Any, js.Any], 
        js.Any
      ]
    ],
    foldMapWithIndex: js.Function1[
      fpDashTsLib.libMonoidMod.Monoid[js.Any], 
      js.Function2[
        /* fa */ fpDashTsLib.libHKTMod.Type3[F, U, L, _], 
        /* f */ js.Function2[/* i */ I, /* a */ js.Any, js.Any], 
        js.Any
      ]
    ],
    foldr: js.Function3[
      fpDashTsLib.libHKTMod.Type3[F, U, L, js.Any], 
      js.Any, 
      js.Function2[js.Any, js.Any, js.Any], 
      js.Any
    ],
    foldrWithIndex: js.Function3[
      fpDashTsLib.libHKTMod.Type3[F, U, L, js.Any], 
      js.Any, 
      js.Function3[/* i */ I, js.Any, js.Any, js.Any], 
      js.Any
    ],
    reduce: js.Function3[
      fpDashTsLib.libHKTMod.Type3[F, U, L, js.Any], 
      js.Any, 
      js.Function2[js.Any, js.Any, js.Any], 
      js.Any
    ],
    reduceWithIndex: js.Function3[
      fpDashTsLib.libHKTMod.Type3[F, U, L, js.Any], 
      js.Any, 
      js.Function3[/* i */ I, js.Any, js.Any, js.Any], 
      js.Any
    ]
  ): FoldableWithIndex3C[F, I, U, L] = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("URI")(URI.asInstanceOf[js.Any])
    __obj.updateDynamic("_L")(_L.asInstanceOf[js.Any])
    __obj.updateDynamic("_U")(_U.asInstanceOf[js.Any])
    __obj.updateDynamic("foldMap")(foldMap)
    __obj.updateDynamic("foldMapWithIndex")(foldMapWithIndex)
    __obj.updateDynamic("foldr")(foldr)
    __obj.updateDynamic("foldrWithIndex")(foldrWithIndex)
    __obj.updateDynamic("reduce")(reduce)
    __obj.updateDynamic("reduceWithIndex")(reduceWithIndex)
    __obj.asInstanceOf[FoldableWithIndex3C[F, I, U, L]]
  }
}

