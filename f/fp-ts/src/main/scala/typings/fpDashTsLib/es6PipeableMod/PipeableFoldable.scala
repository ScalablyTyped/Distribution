package typings
package fpDashTsLib.es6PipeableMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PipeableFoldable[F] extends js.Object {
  def foldMap[M](M: fpDashTsLib.es6MonoidMod.Monoid[M]): js.Function1[
    /* f */ js.Function1[/* a */ js.Any, M], 
    js.Function1[/* fa */ fpDashTsLib.es6HKTMod.HKT[F, _], M]
  ]
  def reduce[A, B](b: B, f: js.Function2[/* b */ B, /* a */ A, B]): js.Function1[/* fa */ fpDashTsLib.es6HKTMod.HKT[F, A], B]
  def reduceRight[A, B](b: B, f: js.Function2[/* a */ A, /* b */ B, B]): js.Function1[/* fa */ fpDashTsLib.es6HKTMod.HKT[F, A], B]
}

object PipeableFoldable {
  @scala.inline
  def apply[F](
    foldMap: fpDashTsLib.es6MonoidMod.Monoid[js.Any] => js.Function1[
      /* f */ js.Function1[/* a */ js.Any, js.Any], 
      js.Function1[/* fa */ fpDashTsLib.es6HKTMod.HKT[F, _], js.Any]
    ],
    reduce: (js.Any, js.Function2[js.Any, js.Any, js.Any]) => js.Function1[/* fa */ fpDashTsLib.es6HKTMod.HKT[F, js.Any], js.Any],
    reduceRight: (js.Any, js.Function2[js.Any, js.Any, js.Any]) => js.Function1[/* fa */ fpDashTsLib.es6HKTMod.HKT[F, js.Any], js.Any]
  ): PipeableFoldable[F] = {
    val __obj = js.Dynamic.literal(foldMap = js.Any.fromFunction1(foldMap), reduce = js.Any.fromFunction2(reduce), reduceRight = js.Any.fromFunction2(reduceRight))
  
    __obj.asInstanceOf[PipeableFoldable[F]]
  }
}

