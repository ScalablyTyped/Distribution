package typings
package fpDashTsLib.es6PipeableMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PipeableFoldableWithIndex1[F /* <: fpDashTsLib.es6HKTMod.URIS */, I] extends PipeableFoldable1[F] {
  def foldMapWithIndex[M](M: fpDashTsLib.es6MonoidMod.Monoid[M]): js.Function1[
    /* f */ js.Function2[/* i */ I, /* a */ js.Any, M], 
    js.Function1[/* fa */ fpDashTsLib.es6HKTMod.Kind[F, _], M]
  ]
  def reduceRightWithIndex[A, B](b: B, f: js.Function3[/* i */ I, /* a */ A, /* b */ B, B]): js.Function1[/* fa */ fpDashTsLib.es6HKTMod.Kind[F, A], B]
  def reduceWithIndex[A, B](b: B, f: js.Function3[/* i */ I, /* b */ B, /* a */ A, B]): js.Function1[/* fa */ fpDashTsLib.es6HKTMod.Kind[F, A], B]
}

object PipeableFoldableWithIndex1 {
  @scala.inline
  def apply[F /* <: fpDashTsLib.es6HKTMod.URIS */, I](
    foldMap: fpDashTsLib.es6MonoidMod.Monoid[js.Any] => js.Function1[
      /* f */ js.Function1[/* a */ js.Any, js.Any], 
      js.Function1[/* fa */ fpDashTsLib.es6HKTMod.Kind[F, _], js.Any]
    ],
    foldMapWithIndex: fpDashTsLib.es6MonoidMod.Monoid[js.Any] => js.Function1[
      /* f */ js.Function2[/* i */ I, /* a */ js.Any, js.Any], 
      js.Function1[/* fa */ fpDashTsLib.es6HKTMod.Kind[F, _], js.Any]
    ],
    reduce: (js.Any, js.Function2[js.Any, js.Any, js.Any]) => js.Function1[/* fa */ fpDashTsLib.es6HKTMod.Kind[F, js.Any], js.Any],
    reduceRight: (js.Any, js.Function2[js.Any, js.Any, js.Any]) => js.Function1[/* fa */ fpDashTsLib.es6HKTMod.Kind[F, js.Any], js.Any],
    reduceRightWithIndex: (js.Any, js.Function3[/* i */ I, js.Any, js.Any, js.Any]) => js.Function1[/* fa */ fpDashTsLib.es6HKTMod.Kind[F, js.Any], js.Any],
    reduceWithIndex: (js.Any, js.Function3[/* i */ I, js.Any, js.Any, js.Any]) => js.Function1[/* fa */ fpDashTsLib.es6HKTMod.Kind[F, js.Any], js.Any]
  ): PipeableFoldableWithIndex1[F, I] = {
    val __obj = js.Dynamic.literal(foldMap = js.Any.fromFunction1(foldMap), foldMapWithIndex = js.Any.fromFunction1(foldMapWithIndex), reduce = js.Any.fromFunction2(reduce), reduceRight = js.Any.fromFunction2(reduceRight), reduceRightWithIndex = js.Any.fromFunction2(reduceRightWithIndex), reduceWithIndex = js.Any.fromFunction2(reduceWithIndex))
  
    __obj.asInstanceOf[PipeableFoldableWithIndex1[F, I]]
  }
}

