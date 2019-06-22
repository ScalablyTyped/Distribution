package typings
package fpDashTsLib.libPipeableMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PipeableFoldable3[F /* <: fpDashTsLib.libHKTMod.URIS3 */] extends js.Object {
  def foldMap[M](M: fpDashTsLib.libMonoidMod.Monoid[M]): js.Function1[
    /* f */ js.Function1[/* a */ js.Any, M], 
    js.Function1[/* fa */ fpDashTsLib.libHKTMod.Kind3[F, _, _, _], M]
  ]
  def reduce[A, B](b: B, f: js.Function2[/* b */ B, /* a */ A, B]): js.Function1[/* fa */ fpDashTsLib.libHKTMod.Kind3[F, _, _, A], B]
  def reduceRight[A, B](b: B, f: js.Function2[/* a */ A, /* b */ B, B]): js.Function1[/* fa */ fpDashTsLib.libHKTMod.Kind3[F, _, _, A], B]
}

object PipeableFoldable3 {
  @scala.inline
  def apply[F /* <: fpDashTsLib.libHKTMod.URIS3 */](
    foldMap: fpDashTsLib.libMonoidMod.Monoid[js.Any] => js.Function1[
      /* f */ js.Function1[/* a */ js.Any, js.Any], 
      js.Function1[/* fa */ fpDashTsLib.libHKTMod.Kind3[F, _, _, _], js.Any]
    ],
    reduce: (js.Any, js.Function2[js.Any, js.Any, js.Any]) => js.Function1[/* fa */ fpDashTsLib.libHKTMod.Kind3[F, _, _, js.Any], js.Any],
    reduceRight: (js.Any, js.Function2[js.Any, js.Any, js.Any]) => js.Function1[/* fa */ fpDashTsLib.libHKTMod.Kind3[F, _, _, js.Any], js.Any]
  ): PipeableFoldable3[F] = {
    val __obj = js.Dynamic.literal(foldMap = js.Any.fromFunction1(foldMap), reduce = js.Any.fromFunction2(reduce), reduceRight = js.Any.fromFunction2(reduceRight))
  
    __obj.asInstanceOf[PipeableFoldable3[F]]
  }
}

