package typings
package fpDashTsLib.es6PipeableMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PipeableFoldable2C[F /* <: fpDashTsLib.es6HKTMod.URIS2 */, L] extends js.Object {
  def foldMap[M](M: fpDashTsLib.es6MonoidMod.Monoid[M]): js.Function1[
    /* f */ js.Function1[/* a */ js.Any, M], 
    js.Function1[/* fa */ fpDashTsLib.es6HKTMod.Kind2[F, L, _], M]
  ]
  def reduce[A, B](b: B, f: js.Function2[/* b */ B, /* a */ A, B]): js.Function1[/* fa */ fpDashTsLib.es6HKTMod.Kind2[F, L, A], B]
  def reduceRight[A, B](b: B, f: js.Function2[/* a */ A, /* b */ B, B]): js.Function1[/* fa */ fpDashTsLib.es6HKTMod.Kind2[F, L, A], B]
}

object PipeableFoldable2C {
  @scala.inline
  def apply[F /* <: fpDashTsLib.es6HKTMod.URIS2 */, L](
    foldMap: fpDashTsLib.es6MonoidMod.Monoid[js.Any] => js.Function1[
      /* f */ js.Function1[/* a */ js.Any, js.Any], 
      js.Function1[/* fa */ fpDashTsLib.es6HKTMod.Kind2[F, L, _], js.Any]
    ],
    reduce: (js.Any, js.Function2[js.Any, js.Any, js.Any]) => js.Function1[/* fa */ fpDashTsLib.es6HKTMod.Kind2[F, L, js.Any], js.Any],
    reduceRight: (js.Any, js.Function2[js.Any, js.Any, js.Any]) => js.Function1[/* fa */ fpDashTsLib.es6HKTMod.Kind2[F, L, js.Any], js.Any]
  ): PipeableFoldable2C[F, L] = {
    val __obj = js.Dynamic.literal(foldMap = js.Any.fromFunction1(foldMap), reduce = js.Any.fromFunction2(reduce), reduceRight = js.Any.fromFunction2(reduceRight))
  
    __obj.asInstanceOf[PipeableFoldable2C[F, L]]
  }
}

