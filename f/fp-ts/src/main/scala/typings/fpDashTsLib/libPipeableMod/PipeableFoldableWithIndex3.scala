package typings
package fpDashTsLib.libPipeableMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PipeableFoldableWithIndex3[F /* <: fpDashTsLib.libHKTMod.URIS3 */, I] extends PipeableFoldable3[F] {
  def foldMapWithIndex[M](M: fpDashTsLib.libMonoidMod.Monoid[M]): js.Function1[
    /* f */ js.Function2[/* i */ I, /* a */ js.Any, M], 
    js.Function1[/* fa */ fpDashTsLib.libHKTMod.Kind3[F, _, _, _], M]
  ]
  def reduceRightWithIndex[A, B](b: B, f: js.Function3[/* i */ I, /* a */ A, /* b */ B, B]): js.Function1[/* fa */ fpDashTsLib.libHKTMod.Kind3[F, _, _, A], B]
  def reduceWithIndex[A, B](b: B, f: js.Function3[/* i */ I, /* b */ B, /* a */ A, B]): js.Function1[/* fa */ fpDashTsLib.libHKTMod.Kind3[F, _, _, A], B]
}

object PipeableFoldableWithIndex3 {
  @scala.inline
  def apply[F /* <: fpDashTsLib.libHKTMod.URIS3 */, I](
    foldMap: fpDashTsLib.libMonoidMod.Monoid[js.Any] => js.Function1[
      /* f */ js.Function1[/* a */ js.Any, js.Any], 
      js.Function1[/* fa */ fpDashTsLib.libHKTMod.Kind3[F, _, _, _], js.Any]
    ],
    foldMapWithIndex: fpDashTsLib.libMonoidMod.Monoid[js.Any] => js.Function1[
      /* f */ js.Function2[/* i */ I, /* a */ js.Any, js.Any], 
      js.Function1[/* fa */ fpDashTsLib.libHKTMod.Kind3[F, _, _, _], js.Any]
    ],
    reduce: (js.Any, js.Function2[js.Any, js.Any, js.Any]) => js.Function1[/* fa */ fpDashTsLib.libHKTMod.Kind3[F, _, _, js.Any], js.Any],
    reduceRight: (js.Any, js.Function2[js.Any, js.Any, js.Any]) => js.Function1[/* fa */ fpDashTsLib.libHKTMod.Kind3[F, _, _, js.Any], js.Any],
    reduceRightWithIndex: (js.Any, js.Function3[/* i */ I, js.Any, js.Any, js.Any]) => js.Function1[/* fa */ fpDashTsLib.libHKTMod.Kind3[F, _, _, js.Any], js.Any],
    reduceWithIndex: (js.Any, js.Function3[/* i */ I, js.Any, js.Any, js.Any]) => js.Function1[/* fa */ fpDashTsLib.libHKTMod.Kind3[F, _, _, js.Any], js.Any]
  ): PipeableFoldableWithIndex3[F, I] = {
    val __obj = js.Dynamic.literal(foldMap = js.Any.fromFunction1(foldMap), foldMapWithIndex = js.Any.fromFunction1(foldMapWithIndex), reduce = js.Any.fromFunction2(reduce), reduceRight = js.Any.fromFunction2(reduceRight), reduceRightWithIndex = js.Any.fromFunction2(reduceRightWithIndex), reduceWithIndex = js.Any.fromFunction2(reduceWithIndex))
  
    __obj.asInstanceOf[PipeableFoldableWithIndex3[F, I]]
  }
}

