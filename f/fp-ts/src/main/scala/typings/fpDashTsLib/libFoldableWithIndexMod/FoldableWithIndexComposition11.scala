package typings
package fpDashTsLib.libFoldableWithIndexMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait FoldableWithIndexComposition11[F /* <: fpDashTsLib.libHKTMod.URIS */, FI, G /* <: fpDashTsLib.libHKTMod.URIS */, GI]
  extends fpDashTsLib.libFoldable2vMod.Foldable2vComposition11[F, G] {
  def foldMapWithIndex[M](M: fpDashTsLib.libMonoidMod.Monoid[M]): js.Function2[
    /* fga */ fpDashTsLib.libHKTMod.Kind[F, fpDashTsLib.libHKTMod.Kind[G, _]], 
    /* f */ js.Function2[/* i */ js.Tuple2[FI, GI], /* a */ js.Any, M], 
    M
  ]
  def foldrWithIndex[A, B](
    fga: fpDashTsLib.libHKTMod.Kind[F, fpDashTsLib.libHKTMod.Kind[G, A]],
    b: B,
    f: js.Function3[/* i */ js.Tuple2[FI, GI], /* a */ A, /* b */ B, B]
  ): B
  def reduceWithIndex[A, B](
    fga: fpDashTsLib.libHKTMod.Kind[F, fpDashTsLib.libHKTMod.Kind[G, A]],
    b: B,
    f: js.Function3[/* i */ js.Tuple2[FI, GI], /* b */ B, /* a */ A, B]
  ): B
}

object FoldableWithIndexComposition11 {
  @scala.inline
  def apply[F /* <: fpDashTsLib.libHKTMod.URIS */, FI, G /* <: fpDashTsLib.libHKTMod.URIS */, GI](
    foldMap: fpDashTsLib.libMonoidMod.Monoid[js.Any] => js.Function2[
      /* fa */ fpDashTsLib.libHKTMod.Kind[F, fpDashTsLib.libHKTMod.Kind[G, _]], 
      /* f */ js.Function1[/* a */ js.Any, js.Any], 
      js.Any
    ],
    foldMapWithIndex: fpDashTsLib.libMonoidMod.Monoid[js.Any] => js.Function2[
      /* fga */ fpDashTsLib.libHKTMod.Kind[F, fpDashTsLib.libHKTMod.Kind[G, _]], 
      /* f */ js.Function2[/* i */ js.Tuple2[FI, GI], /* a */ js.Any, js.Any], 
      js.Any
    ],
    foldr: (fpDashTsLib.libHKTMod.Kind[F, fpDashTsLib.libHKTMod.Kind[G, js.Any]], js.Any, js.Function2[js.Any, js.Any, js.Any]) => js.Any,
    foldrWithIndex: (fpDashTsLib.libHKTMod.Kind[F, fpDashTsLib.libHKTMod.Kind[G, js.Any]], js.Any, js.Function3[/* i */ js.Tuple2[FI, GI], js.Any, js.Any, js.Any]) => js.Any,
    reduce: (fpDashTsLib.libHKTMod.Kind[F, fpDashTsLib.libHKTMod.Kind[G, js.Any]], js.Any, js.Function2[js.Any, js.Any, js.Any]) => js.Any,
    reduceWithIndex: (fpDashTsLib.libHKTMod.Kind[F, fpDashTsLib.libHKTMod.Kind[G, js.Any]], js.Any, js.Function3[/* i */ js.Tuple2[FI, GI], js.Any, js.Any, js.Any]) => js.Any
  ): FoldableWithIndexComposition11[F, FI, G, GI] = {
    val __obj = js.Dynamic.literal(foldMap = js.Any.fromFunction1(foldMap), foldMapWithIndex = js.Any.fromFunction1(foldMapWithIndex), foldr = js.Any.fromFunction3(foldr), foldrWithIndex = js.Any.fromFunction3(foldrWithIndex), reduce = js.Any.fromFunction3(reduce), reduceWithIndex = js.Any.fromFunction3(reduceWithIndex))
  
    __obj.asInstanceOf[FoldableWithIndexComposition11[F, FI, G, GI]]
  }
}

