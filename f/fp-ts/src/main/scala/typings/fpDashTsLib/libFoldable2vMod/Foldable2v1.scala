package typings
package fpDashTsLib.libFoldable2vMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Foldable2v1[F /* <: fpDashTsLib.libHKTMod.URIS */]
  extends fpDashTsLib.libFoldableMod.Foldable1[F] {
  def foldMap[M](M: fpDashTsLib.libMonoidMod.Monoid[M]): js.Function2[
    /* fa */ fpDashTsLib.libHKTMod.Type[F, _], 
    /* f */ js.Function1[/* a */ js.Any, M], 
    M
  ]
  def foldr[A, B](fa: fpDashTsLib.libHKTMod.Type[F, A], b: B, f: js.Function2[/* a */ A, /* b */ B, B]): B
}

object Foldable2v1 {
  @scala.inline
  def apply[F /* <: fpDashTsLib.libHKTMod.URIS */](
    URI: F,
    foldMap: js.Function1[
      fpDashTsLib.libMonoidMod.Monoid[js.Any], 
      js.Function2[
        /* fa */ fpDashTsLib.libHKTMod.Type[F, _], 
        /* f */ js.Function1[/* a */ js.Any, js.Any], 
        js.Any
      ]
    ],
    foldr: js.Function3[
      fpDashTsLib.libHKTMod.Type[F, js.Any], 
      js.Any, 
      js.Function2[js.Any, js.Any, js.Any], 
      js.Any
    ],
    reduce: js.Function3[
      fpDashTsLib.libHKTMod.Type[F, js.Any], 
      js.Any, 
      js.Function2[js.Any, js.Any, js.Any], 
      js.Any
    ]
  ): Foldable2v1[F] = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("URI")(URI.asInstanceOf[js.Any])
    __obj.updateDynamic("foldMap")(foldMap)
    __obj.updateDynamic("foldr")(foldr)
    __obj.updateDynamic("reduce")(reduce)
    __obj.asInstanceOf[Foldable2v1[F]]
  }
}

