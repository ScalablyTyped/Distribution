package typings
package fpDashTsLib.libFoldable2vMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait Foldable2vComposition12[F /* <: fpDashTsLib.libHKTMod.URIS */, G /* <: fpDashTsLib.libHKTMod.URIS2 */]
  extends fpDashTsLib.libFoldableMod.FoldableComposition12[F, G] {
  def foldMap[M](M: fpDashTsLib.libMonoidMod.Monoid[M]): js.Function2[
    /* fa */ fpDashTsLib.libHKTMod.Type[F, fpDashTsLib.libHKTMod.Type2[G, _, _]], 
    /* f */ js.Function1[/* a */ js.Any, M], 
    M
  ]
  def foldr[L, A, B](
    fa: fpDashTsLib.libHKTMod.Type[F, fpDashTsLib.libHKTMod.Type2[G, L, A]],
    b: B,
    f: js.Function2[/* a */ A, /* b */ B, B]
  ): B
}

