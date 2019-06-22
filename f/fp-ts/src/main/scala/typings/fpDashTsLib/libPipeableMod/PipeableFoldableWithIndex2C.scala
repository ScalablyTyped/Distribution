package typings
package fpDashTsLib.libPipeableMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PipeableFoldableWithIndex2C[F /* <: fpDashTsLib.libHKTMod.URIS2 */, I, L] extends PipeableFoldable2C[F, L] {
  def foldMapWithIndex[M](M: fpDashTsLib.libMonoidMod.Monoid[M]): js.Function1[
    /* f */ js.Function2[/* i */ I, /* a */ js.Any, M], 
    js.Function1[/* fa */ fpDashTsLib.libHKTMod.Kind2[F, L, _], M]
  ]
  def reduceRightWithIndex[A, B](b: B, f: js.Function3[/* i */ I, /* a */ A, /* b */ B, B]): js.Function1[/* fa */ fpDashTsLib.libHKTMod.Kind2[F, L, A], B]
  def reduceWithIndex[A, B](b: B, f: js.Function3[/* i */ I, /* b */ B, /* a */ A, B]): js.Function1[/* fa */ fpDashTsLib.libHKTMod.Kind2[F, L, A], B]
}

object PipeableFoldableWithIndex2C {
  @scala.inline
  def apply[F /* <: fpDashTsLib.libHKTMod.URIS2 */, I, L](
    foldMap: fpDashTsLib.libMonoidMod.Monoid[js.Any] => js.Function1[
      /* f */ js.Function1[/* a */ js.Any, js.Any], 
      js.Function1[/* fa */ fpDashTsLib.libHKTMod.Kind2[F, L, _], js.Any]
    ],
    foldMapWithIndex: fpDashTsLib.libMonoidMod.Monoid[js.Any] => js.Function1[
      /* f */ js.Function2[/* i */ I, /* a */ js.Any, js.Any], 
      js.Function1[/* fa */ fpDashTsLib.libHKTMod.Kind2[F, L, _], js.Any]
    ],
    reduce: (js.Any, js.Function2[js.Any, js.Any, js.Any]) => js.Function1[/* fa */ fpDashTsLib.libHKTMod.Kind2[F, L, js.Any], js.Any],
    reduceRight: (js.Any, js.Function2[js.Any, js.Any, js.Any]) => js.Function1[/* fa */ fpDashTsLib.libHKTMod.Kind2[F, L, js.Any], js.Any],
    reduceRightWithIndex: (js.Any, js.Function3[/* i */ I, js.Any, js.Any, js.Any]) => js.Function1[/* fa */ fpDashTsLib.libHKTMod.Kind2[F, L, js.Any], js.Any],
    reduceWithIndex: (js.Any, js.Function3[/* i */ I, js.Any, js.Any, js.Any]) => js.Function1[/* fa */ fpDashTsLib.libHKTMod.Kind2[F, L, js.Any], js.Any]
  ): PipeableFoldableWithIndex2C[F, I, L] = {
    val __obj = js.Dynamic.literal(foldMap = js.Any.fromFunction1(foldMap), foldMapWithIndex = js.Any.fromFunction1(foldMapWithIndex), reduce = js.Any.fromFunction2(reduce), reduceRight = js.Any.fromFunction2(reduceRight), reduceRightWithIndex = js.Any.fromFunction2(reduceRightWithIndex), reduceWithIndex = js.Any.fromFunction2(reduceWithIndex))
  
    __obj.asInstanceOf[PipeableFoldableWithIndex2C[F, I, L]]
  }
}

