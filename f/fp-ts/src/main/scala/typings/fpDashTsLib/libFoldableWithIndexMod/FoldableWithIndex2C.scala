package typings
package fpDashTsLib.libFoldableWithIndexMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait FoldableWithIndex2C[F /* <: fpDashTsLib.libHKTMod.URIS2 */, I, L]
  extends fpDashTsLib.libFoldable2vMod.Foldable2v2C[F, L] {
  def foldMapWithIndex[M](M: fpDashTsLib.libMonoidMod.Monoid[M]): js.Function2[
    /* fa */ fpDashTsLib.libHKTMod.Type2[F, L, _], 
    /* f */ js.Function2[/* i */ I, /* a */ js.Any, M], 
    M
  ]
  def foldrWithIndex[A, B](
    fa: fpDashTsLib.libHKTMod.Type2[F, L, A],
    b: B,
    f: js.Function3[/* i */ I, /* a */ A, /* b */ B, B]
  ): B
  def reduceWithIndex[A, B](
    fa: fpDashTsLib.libHKTMod.Type2[F, L, A],
    b: B,
    f: js.Function3[/* i */ I, /* b */ B, /* a */ A, B]
  ): B
}

object FoldableWithIndex2C {
  @scala.inline
  def apply[F /* <: fpDashTsLib.libHKTMod.URIS2 */, I, L](
    URI: F,
    _L: L,
    foldMap: js.Function1[
      fpDashTsLib.libMonoidMod.Monoid[js.Any], 
      js.Function2[
        /* fa */ fpDashTsLib.libHKTMod.Type2[F, L, _], 
        /* f */ js.Function1[/* a */ js.Any, js.Any], 
        js.Any
      ]
    ],
    foldMapWithIndex: js.Function1[
      fpDashTsLib.libMonoidMod.Monoid[js.Any], 
      js.Function2[
        /* fa */ fpDashTsLib.libHKTMod.Type2[F, L, _], 
        /* f */ js.Function2[/* i */ I, /* a */ js.Any, js.Any], 
        js.Any
      ]
    ],
    foldr: js.Function3[
      fpDashTsLib.libHKTMod.Type2[F, L, js.Any], 
      js.Any, 
      js.Function2[js.Any, js.Any, js.Any], 
      js.Any
    ],
    foldrWithIndex: js.Function3[
      fpDashTsLib.libHKTMod.Type2[F, L, js.Any], 
      js.Any, 
      js.Function3[/* i */ I, js.Any, js.Any, js.Any], 
      js.Any
    ],
    reduce: js.Function3[
      fpDashTsLib.libHKTMod.Type2[F, L, js.Any], 
      js.Any, 
      js.Function2[js.Any, js.Any, js.Any], 
      js.Any
    ],
    reduceWithIndex: js.Function3[
      fpDashTsLib.libHKTMod.Type2[F, L, js.Any], 
      js.Any, 
      js.Function3[/* i */ I, js.Any, js.Any, js.Any], 
      js.Any
    ]
  ): FoldableWithIndex2C[F, I, L] = {
    val __obj = js.Dynamic.literal(URI = URI.asInstanceOf[js.Any], _L = _L.asInstanceOf[js.Any], foldMap = foldMap, foldMapWithIndex = foldMapWithIndex, foldr = foldr, foldrWithIndex = foldrWithIndex, reduce = reduce, reduceWithIndex = reduceWithIndex)
  
    __obj.asInstanceOf[FoldableWithIndex2C[F, I, L]]
  }
}

