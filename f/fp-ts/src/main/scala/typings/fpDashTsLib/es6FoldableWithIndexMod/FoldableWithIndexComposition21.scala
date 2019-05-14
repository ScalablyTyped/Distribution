package typings
package fpDashTsLib.es6FoldableWithIndexMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait FoldableWithIndexComposition21[F /* <: fpDashTsLib.es6HKTMod.URIS2 */, FI, G /* <: fpDashTsLib.es6HKTMod.URIS */, GI]
  extends fpDashTsLib.es6Foldable2vMod.Foldable2vComposition21[F, G] {
  def foldMapWithIndex[M](M: fpDashTsLib.es6MonoidMod.Monoid[M]): js.Function2[
    /* fga */ fpDashTsLib.es6HKTMod.Type2[F, _, fpDashTsLib.es6HKTMod.Type[G, _]], 
    /* f */ js.Function2[/* i */ js.Tuple2[FI, GI], /* a */ js.Any, M], 
    M
  ]
  def foldrWithIndex[LF, A, B](
    fga: fpDashTsLib.es6HKTMod.Type2[F, LF, fpDashTsLib.es6HKTMod.Type[G, A]],
    b: B,
    f: js.Function3[/* i */ js.Tuple2[FI, GI], /* a */ A, /* b */ B, B]
  ): B
  def reduceWithIndex[LF, A, B](
    fga: fpDashTsLib.es6HKTMod.Type2[F, LF, fpDashTsLib.es6HKTMod.Type[G, A]],
    b: B,
    f: js.Function3[/* i */ js.Tuple2[FI, GI], /* b */ B, /* a */ A, B]
  ): B
}

object FoldableWithIndexComposition21 {
  @scala.inline
  def apply[F /* <: fpDashTsLib.es6HKTMod.URIS2 */, FI, G /* <: fpDashTsLib.es6HKTMod.URIS */, GI](
    foldMap: fpDashTsLib.es6MonoidMod.Monoid[js.Any] => js.Function2[
      /* fa */ fpDashTsLib.es6HKTMod.Type2[F, _, fpDashTsLib.es6HKTMod.Type[G, _]], 
      /* f */ js.Function1[/* a */ js.Any, js.Any], 
      js.Any
    ],
    foldMapWithIndex: fpDashTsLib.es6MonoidMod.Monoid[js.Any] => js.Function2[
      /* fga */ fpDashTsLib.es6HKTMod.Type2[F, _, fpDashTsLib.es6HKTMod.Type[G, _]], 
      /* f */ js.Function2[/* i */ js.Tuple2[FI, GI], /* a */ js.Any, js.Any], 
      js.Any
    ],
    foldr: (fpDashTsLib.es6HKTMod.Type2[F, js.Any, fpDashTsLib.es6HKTMod.Type[G, js.Any]], js.Any, js.Function2[js.Any, js.Any, js.Any]) => js.Any,
    foldrWithIndex: (fpDashTsLib.es6HKTMod.Type2[F, js.Any, fpDashTsLib.es6HKTMod.Type[G, js.Any]], js.Any, js.Function3[/* i */ js.Tuple2[FI, GI], js.Any, js.Any, js.Any]) => js.Any,
    reduce: (fpDashTsLib.es6HKTMod.Type2[F, js.Any, fpDashTsLib.es6HKTMod.Type[G, js.Any]], js.Any, js.Function2[js.Any, js.Any, js.Any]) => js.Any,
    reduceWithIndex: (fpDashTsLib.es6HKTMod.Type2[F, js.Any, fpDashTsLib.es6HKTMod.Type[G, js.Any]], js.Any, js.Function3[/* i */ js.Tuple2[FI, GI], js.Any, js.Any, js.Any]) => js.Any
  ): FoldableWithIndexComposition21[F, FI, G, GI] = {
    val __obj = js.Dynamic.literal(foldMap = js.Any.fromFunction1(foldMap), foldMapWithIndex = js.Any.fromFunction1(foldMapWithIndex), foldr = js.Any.fromFunction3(foldr), foldrWithIndex = js.Any.fromFunction3(foldrWithIndex), reduce = js.Any.fromFunction3(reduce), reduceWithIndex = js.Any.fromFunction3(reduceWithIndex))
  
    __obj.asInstanceOf[FoldableWithIndexComposition21[F, FI, G, GI]]
  }
}

