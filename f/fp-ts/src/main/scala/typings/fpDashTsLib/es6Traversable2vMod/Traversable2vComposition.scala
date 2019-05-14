package typings
package fpDashTsLib.es6Traversable2vMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Traversable2vComposition[F, G]
  extends fpDashTsLib.es6Foldable2vMod.Foldable2vComposition[F, G]
     with fpDashTsLib.es6FunctorMod.FunctorComposition[F, G] {
  def sequence[H](H: fpDashTsLib.es6ApplicativeMod.Applicative[H]): js.Function1[
    /* fga */ fpDashTsLib.es6HKTMod.HKT[F, fpDashTsLib.es6HKTMod.HKT[G, fpDashTsLib.es6HKTMod.HKT[H, _]]], 
    fpDashTsLib.es6HKTMod.HKT[H, fpDashTsLib.es6HKTMod.HKT[F, fpDashTsLib.es6HKTMod.HKT[G, _]]]
  ]
  def traverse[H](H: fpDashTsLib.es6ApplicativeMod.Applicative[H]): js.Function2[
    /* fga */ fpDashTsLib.es6HKTMod.HKT[F, fpDashTsLib.es6HKTMod.HKT[G, _]], 
    /* f */ js.Function1[/* a */ js.Any, fpDashTsLib.es6HKTMod.HKT[H, _]], 
    fpDashTsLib.es6HKTMod.HKT[H, fpDashTsLib.es6HKTMod.HKT[F, fpDashTsLib.es6HKTMod.HKT[G, _]]]
  ]
}

object Traversable2vComposition {
  @scala.inline
  def apply[F, G](
    foldMap: fpDashTsLib.es6MonoidMod.Monoid[js.Any] => js.Function2[
      /* fa */ fpDashTsLib.es6HKTMod.HKT[F, fpDashTsLib.es6HKTMod.HKT[G, _]], 
      /* f */ js.Function1[/* a */ js.Any, js.Any], 
      js.Any
    ],
    foldr: (fpDashTsLib.es6HKTMod.HKT[F, fpDashTsLib.es6HKTMod.HKT[G, js.Any]], js.Any, js.Function2[js.Any, js.Any, js.Any]) => js.Any,
    map: (fpDashTsLib.es6HKTMod.HKT[F, fpDashTsLib.es6HKTMod.HKT[G, js.Any]], js.Function1[js.Any, js.Any]) => fpDashTsLib.es6HKTMod.HKT[F, fpDashTsLib.es6HKTMod.HKT[G, js.Any]],
    reduce: (fpDashTsLib.es6HKTMod.HKT[F, fpDashTsLib.es6HKTMod.HKT[G, js.Any]], js.Any, js.Function2[js.Any, js.Any, js.Any]) => js.Any,
    sequence: fpDashTsLib.es6ApplicativeMod.Applicative[js.Any] => js.Function1[
      /* fga */ fpDashTsLib.es6HKTMod.HKT[F, fpDashTsLib.es6HKTMod.HKT[G, fpDashTsLib.es6HKTMod.HKT[js.Any, _]]], 
      fpDashTsLib.es6HKTMod.HKT[js.Any, fpDashTsLib.es6HKTMod.HKT[F, fpDashTsLib.es6HKTMod.HKT[G, _]]]
    ],
    traverse: fpDashTsLib.es6ApplicativeMod.Applicative[js.Any] => js.Function2[
      /* fga */ fpDashTsLib.es6HKTMod.HKT[F, fpDashTsLib.es6HKTMod.HKT[G, _]], 
      /* f */ js.Function1[/* a */ js.Any, fpDashTsLib.es6HKTMod.HKT[js.Any, _]], 
      fpDashTsLib.es6HKTMod.HKT[js.Any, fpDashTsLib.es6HKTMod.HKT[F, fpDashTsLib.es6HKTMod.HKT[G, _]]]
    ]
  ): Traversable2vComposition[F, G] = {
    val __obj = js.Dynamic.literal(foldMap = js.Any.fromFunction1(foldMap), foldr = js.Any.fromFunction3(foldr), map = js.Any.fromFunction2(map), reduce = js.Any.fromFunction3(reduce), sequence = js.Any.fromFunction1(sequence), traverse = js.Any.fromFunction1(traverse))
  
    __obj.asInstanceOf[Traversable2vComposition[F, G]]
  }
}

