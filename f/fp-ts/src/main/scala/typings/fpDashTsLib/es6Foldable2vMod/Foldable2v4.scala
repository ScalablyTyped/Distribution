package typings
package fpDashTsLib.es6Foldable2vMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Foldable2v4[F /* <: fpDashTsLib.es6HKTMod.URIS4 */] extends js.Object {
  val URI: F
  def foldMap[M](M: fpDashTsLib.es6MonoidMod.Monoid[M]): js.Function2[
    /* fa */ fpDashTsLib.es6HKTMod.Kind4[F, _, _, _, _], 
    /* f */ js.Function1[/* a */ js.Any, M], 
    M
  ]
  def reduce[X, U, L, A, B](fa: fpDashTsLib.es6HKTMod.Kind4[F, X, U, L, A], b: B, f: js.Function2[/* b */ B, /* a */ A, B]): B
  def reduceRight[X, U, L, A, B](fa: fpDashTsLib.es6HKTMod.Kind4[F, X, U, L, A], b: B, f: js.Function2[/* a */ A, /* b */ B, B]): B
}

object Foldable2v4 {
  @scala.inline
  def apply[F /* <: fpDashTsLib.es6HKTMod.URIS4 */](
    URI: F,
    foldMap: fpDashTsLib.es6MonoidMod.Monoid[js.Any] => js.Function2[
      /* fa */ fpDashTsLib.es6HKTMod.Kind4[F, _, _, _, _], 
      /* f */ js.Function1[/* a */ js.Any, js.Any], 
      js.Any
    ],
    reduce: (fpDashTsLib.es6HKTMod.Kind4[F, js.Any, js.Any, js.Any, js.Any], js.Any, js.Function2[js.Any, js.Any, js.Any]) => js.Any,
    reduceRight: (fpDashTsLib.es6HKTMod.Kind4[F, js.Any, js.Any, js.Any, js.Any], js.Any, js.Function2[js.Any, js.Any, js.Any]) => js.Any
  ): Foldable2v4[F] = {
    val __obj = js.Dynamic.literal(URI = URI.asInstanceOf[js.Any], foldMap = js.Any.fromFunction1(foldMap), reduce = js.Any.fromFunction3(reduce), reduceRight = js.Any.fromFunction3(reduceRight))
  
    __obj.asInstanceOf[Foldable2v4[F]]
  }
}

