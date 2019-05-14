package typings
package fpDashTsLib.es6TraversableMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TraversableComposition[F, G]
  extends fpDashTsLib.es6FoldableMod.FoldableComposition[F, G]
     with fpDashTsLib.es6FunctorMod.FunctorComposition[F, G] {
  def traverse[H](H: fpDashTsLib.es6ApplicativeMod.Applicative[H]): js.Function2[
    /* fga */ fpDashTsLib.es6HKTMod.HKT[F, fpDashTsLib.es6HKTMod.HKT[G, _]], 
    /* f */ js.Function1[/* a */ js.Any, fpDashTsLib.es6HKTMod.HKT[H, _]], 
    fpDashTsLib.es6HKTMod.HKT[H, fpDashTsLib.es6HKTMod.HKT[F, fpDashTsLib.es6HKTMod.HKT[G, _]]]
  ]
}

object TraversableComposition {
  @scala.inline
  def apply[F, G](
    map: (fpDashTsLib.es6HKTMod.HKT[F, fpDashTsLib.es6HKTMod.HKT[G, js.Any]], js.Function1[js.Any, js.Any]) => fpDashTsLib.es6HKTMod.HKT[F, fpDashTsLib.es6HKTMod.HKT[G, js.Any]],
    reduce: (fpDashTsLib.es6HKTMod.HKT[F, fpDashTsLib.es6HKTMod.HKT[G, js.Any]], js.Any, js.Function2[js.Any, js.Any, js.Any]) => js.Any,
    traverse: fpDashTsLib.es6ApplicativeMod.Applicative[js.Any] => js.Function2[
      /* fga */ fpDashTsLib.es6HKTMod.HKT[F, fpDashTsLib.es6HKTMod.HKT[G, _]], 
      /* f */ js.Function1[/* a */ js.Any, fpDashTsLib.es6HKTMod.HKT[js.Any, _]], 
      fpDashTsLib.es6HKTMod.HKT[js.Any, fpDashTsLib.es6HKTMod.HKT[F, fpDashTsLib.es6HKTMod.HKT[G, _]]]
    ]
  ): TraversableComposition[F, G] = {
    val __obj = js.Dynamic.literal(map = js.Any.fromFunction2(map), reduce = js.Any.fromFunction3(reduce), traverse = js.Any.fromFunction1(traverse))
  
    __obj.asInstanceOf[TraversableComposition[F, G]]
  }
}

