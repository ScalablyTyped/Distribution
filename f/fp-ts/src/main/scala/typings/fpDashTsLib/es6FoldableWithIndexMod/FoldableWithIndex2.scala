package typings
package fpDashTsLib.es6FoldableWithIndexMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait FoldableWithIndex2[F /* <: fpDashTsLib.es6HKTMod.URIS2 */, I]
  extends fpDashTsLib.es6Foldable2vMod.Foldable2v2[F] {
  def foldMapWithIndex[M](M: fpDashTsLib.es6MonoidMod.Monoid[M]): js.Function2[
    /* fa */ fpDashTsLib.es6HKTMod.Kind2[F, _, _], 
    /* f */ js.Function2[/* i */ I, /* a */ js.Any, M], 
    M
  ]
  def foldrWithIndex[L, A, B](
    fa: fpDashTsLib.es6HKTMod.Kind2[F, L, A],
    b: B,
    f: js.Function3[/* i */ I, /* a */ A, /* b */ B, B]
  ): B
  def reduceWithIndex[L, A, B](
    fa: fpDashTsLib.es6HKTMod.Kind2[F, L, A],
    b: B,
    f: js.Function3[/* i */ I, /* b */ B, /* a */ A, B]
  ): B
}

object FoldableWithIndex2 {
  @scala.inline
  def apply[F /* <: fpDashTsLib.es6HKTMod.URIS2 */, I](
    URI: F,
    foldMap: fpDashTsLib.es6MonoidMod.Monoid[js.Any] => js.Function2[
      /* fa */ fpDashTsLib.es6HKTMod.Kind2[F, _, _], 
      /* f */ js.Function1[/* a */ js.Any, js.Any], 
      js.Any
    ],
    foldMapWithIndex: fpDashTsLib.es6MonoidMod.Monoid[js.Any] => js.Function2[
      /* fa */ fpDashTsLib.es6HKTMod.Kind2[F, _, _], 
      /* f */ js.Function2[/* i */ I, /* a */ js.Any, js.Any], 
      js.Any
    ],
    foldr: (fpDashTsLib.es6HKTMod.Kind2[F, js.Any, js.Any], js.Any, js.Function2[js.Any, js.Any, js.Any]) => js.Any,
    foldrWithIndex: (fpDashTsLib.es6HKTMod.Kind2[F, js.Any, js.Any], js.Any, js.Function3[/* i */ I, js.Any, js.Any, js.Any]) => js.Any,
    reduce: (fpDashTsLib.es6HKTMod.Kind2[F, js.Any, js.Any], js.Any, js.Function2[js.Any, js.Any, js.Any]) => js.Any,
    reduceWithIndex: (fpDashTsLib.es6HKTMod.Kind2[F, js.Any, js.Any], js.Any, js.Function3[/* i */ I, js.Any, js.Any, js.Any]) => js.Any
  ): FoldableWithIndex2[F, I] = {
    val __obj = js.Dynamic.literal(URI = URI.asInstanceOf[js.Any], foldMap = js.Any.fromFunction1(foldMap), foldMapWithIndex = js.Any.fromFunction1(foldMapWithIndex), foldr = js.Any.fromFunction3(foldr), foldrWithIndex = js.Any.fromFunction3(foldrWithIndex), reduce = js.Any.fromFunction3(reduce), reduceWithIndex = js.Any.fromFunction3(reduceWithIndex))
  
    __obj.asInstanceOf[FoldableWithIndex2[F, I]]
  }
}

