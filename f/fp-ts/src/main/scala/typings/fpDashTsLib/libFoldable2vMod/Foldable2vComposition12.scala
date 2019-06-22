package typings
package fpDashTsLib.libFoldable2vMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Foldable2vComposition12[F /* <: fpDashTsLib.libHKTMod.URIS */, G /* <: fpDashTsLib.libHKTMod.URIS2 */]
  extends fpDashTsLib.libFoldableMod.FoldableComposition12[F, G] {
  def foldMap[M](M: fpDashTsLib.libMonoidMod.Monoid[M]): js.Function2[
    /* fa */ fpDashTsLib.libHKTMod.Kind[F, fpDashTsLib.libHKTMod.Kind2[G, _, _]], 
    /* f */ js.Function1[/* a */ js.Any, M], 
    M
  ]
  def foldr[LG, A, B](
    fa: fpDashTsLib.libHKTMod.Kind[F, fpDashTsLib.libHKTMod.Kind2[G, LG, A]],
    b: B,
    f: js.Function2[/* a */ A, /* b */ B, B]
  ): B
}

object Foldable2vComposition12 {
  @scala.inline
  def apply[F /* <: fpDashTsLib.libHKTMod.URIS */, G /* <: fpDashTsLib.libHKTMod.URIS2 */](
    foldMap: fpDashTsLib.libMonoidMod.Monoid[js.Any] => js.Function2[
      /* fa */ fpDashTsLib.libHKTMod.Kind[F, fpDashTsLib.libHKTMod.Kind2[G, _, _]], 
      /* f */ js.Function1[/* a */ js.Any, js.Any], 
      js.Any
    ],
    foldr: (fpDashTsLib.libHKTMod.Kind[F, fpDashTsLib.libHKTMod.Kind2[G, js.Any, js.Any]], js.Any, js.Function2[js.Any, js.Any, js.Any]) => js.Any,
    reduce: (fpDashTsLib.libHKTMod.Kind[F, fpDashTsLib.libHKTMod.Kind2[G, js.Any, js.Any]], js.Any, js.Function2[js.Any, js.Any, js.Any]) => js.Any
  ): Foldable2vComposition12[F, G] = {
    val __obj = js.Dynamic.literal(foldMap = js.Any.fromFunction1(foldMap), foldr = js.Any.fromFunction3(foldr), reduce = js.Any.fromFunction3(reduce))
  
    __obj.asInstanceOf[Foldable2vComposition12[F, G]]
  }
}

