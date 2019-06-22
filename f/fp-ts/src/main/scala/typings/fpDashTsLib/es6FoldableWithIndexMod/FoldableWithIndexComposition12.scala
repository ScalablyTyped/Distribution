package typings
package fpDashTsLib.es6FoldableWithIndexMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait FoldableWithIndexComposition12[F /* <: fpDashTsLib.es6HKTMod.URIS */, FI, G /* <: fpDashTsLib.es6HKTMod.URIS2 */, GI]
  extends fpDashTsLib.es6Foldable2vMod.Foldable2vComposition12[F, G] {
  def foldMapWithIndex[M](M: fpDashTsLib.es6MonoidMod.Monoid[M]): js.Function2[
    /* fga */ fpDashTsLib.es6HKTMod.Kind[F, fpDashTsLib.es6HKTMod.Kind2[G, _, _]], 
    /* f */ js.Function2[/* i */ js.Tuple2[FI, GI], /* a */ js.Any, M], 
    M
  ]
  def foldrWithIndex[LG, A, B](
    fga: fpDashTsLib.es6HKTMod.Kind[F, fpDashTsLib.es6HKTMod.Kind2[G, LG, A]],
    b: B,
    f: js.Function3[/* i */ js.Tuple2[FI, GI], /* a */ A, /* b */ B, B]
  ): B
  def reduceWithIndex[LG, A, B](
    fga: fpDashTsLib.es6HKTMod.Kind[F, fpDashTsLib.es6HKTMod.Kind2[G, LG, A]],
    b: B,
    f: js.Function3[/* i */ js.Tuple2[FI, GI], /* b */ B, /* a */ A, B]
  ): B
}

object FoldableWithIndexComposition12 {
  @scala.inline
  def apply[F /* <: fpDashTsLib.es6HKTMod.URIS */, FI, G /* <: fpDashTsLib.es6HKTMod.URIS2 */, GI](
    foldMap: fpDashTsLib.es6MonoidMod.Monoid[js.Any] => js.Function2[
      /* fa */ fpDashTsLib.es6HKTMod.Kind[F, fpDashTsLib.es6HKTMod.Kind2[G, _, _]], 
      /* f */ js.Function1[/* a */ js.Any, js.Any], 
      js.Any
    ],
    foldMapWithIndex: fpDashTsLib.es6MonoidMod.Monoid[js.Any] => js.Function2[
      /* fga */ fpDashTsLib.es6HKTMod.Kind[F, fpDashTsLib.es6HKTMod.Kind2[G, _, _]], 
      /* f */ js.Function2[/* i */ js.Tuple2[FI, GI], /* a */ js.Any, js.Any], 
      js.Any
    ],
    foldr: (fpDashTsLib.es6HKTMod.Kind[F, fpDashTsLib.es6HKTMod.Kind2[G, js.Any, js.Any]], js.Any, js.Function2[js.Any, js.Any, js.Any]) => js.Any,
    foldrWithIndex: (fpDashTsLib.es6HKTMod.Kind[F, fpDashTsLib.es6HKTMod.Kind2[G, js.Any, js.Any]], js.Any, js.Function3[/* i */ js.Tuple2[FI, GI], js.Any, js.Any, js.Any]) => js.Any,
    reduce: (fpDashTsLib.es6HKTMod.Kind[F, fpDashTsLib.es6HKTMod.Kind2[G, js.Any, js.Any]], js.Any, js.Function2[js.Any, js.Any, js.Any]) => js.Any,
    reduceWithIndex: (fpDashTsLib.es6HKTMod.Kind[F, fpDashTsLib.es6HKTMod.Kind2[G, js.Any, js.Any]], js.Any, js.Function3[/* i */ js.Tuple2[FI, GI], js.Any, js.Any, js.Any]) => js.Any
  ): FoldableWithIndexComposition12[F, FI, G, GI] = {
    val __obj = js.Dynamic.literal(foldMap = js.Any.fromFunction1(foldMap), foldMapWithIndex = js.Any.fromFunction1(foldMapWithIndex), foldr = js.Any.fromFunction3(foldr), foldrWithIndex = js.Any.fromFunction3(foldrWithIndex), reduce = js.Any.fromFunction3(reduce), reduceWithIndex = js.Any.fromFunction3(reduceWithIndex))
  
    __obj.asInstanceOf[FoldableWithIndexComposition12[F, FI, G, GI]]
  }
}

