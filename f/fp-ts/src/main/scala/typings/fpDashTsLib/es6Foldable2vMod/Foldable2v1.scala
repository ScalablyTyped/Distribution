package typings
package fpDashTsLib.es6Foldable2vMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Foldable2v1[F /* <: fpDashTsLib.es6HKTMod.URIS */]
  extends fpDashTsLib.es6FoldableMod.Foldable1[F] {
  def foldMap[M](M: fpDashTsLib.es6MonoidMod.Monoid[M]): js.Function2[
    /* fa */ fpDashTsLib.es6HKTMod.Kind[F, _], 
    /* f */ js.Function1[/* a */ js.Any, M], 
    M
  ]
  def foldr[A, B](fa: fpDashTsLib.es6HKTMod.Kind[F, A], b: B, f: js.Function2[/* a */ A, /* b */ B, B]): B
}

object Foldable2v1 {
  @scala.inline
  def apply[F /* <: fpDashTsLib.es6HKTMod.URIS */](
    URI: F,
    foldMap: fpDashTsLib.es6MonoidMod.Monoid[js.Any] => js.Function2[
      /* fa */ fpDashTsLib.es6HKTMod.Kind[F, _], 
      /* f */ js.Function1[/* a */ js.Any, js.Any], 
      js.Any
    ],
    foldr: (fpDashTsLib.es6HKTMod.Kind[F, js.Any], js.Any, js.Function2[js.Any, js.Any, js.Any]) => js.Any,
    reduce: (fpDashTsLib.es6HKTMod.Kind[F, js.Any], js.Any, js.Function2[js.Any, js.Any, js.Any]) => js.Any
  ): Foldable2v1[F] = {
    val __obj = js.Dynamic.literal(URI = URI.asInstanceOf[js.Any], foldMap = js.Any.fromFunction1(foldMap), foldr = js.Any.fromFunction3(foldr), reduce = js.Any.fromFunction3(reduce))
  
    __obj.asInstanceOf[Foldable2v1[F]]
  }
}

