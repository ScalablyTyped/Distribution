package typings
package fpDashTsLib.libFoldable2vMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait Foldable2v3[F /* <: fpDashTsLib.libHKTMod.URIS3 */]
  extends fpDashTsLib.libFoldableMod.Foldable3[F] {
  def foldMap[M](M: fpDashTsLib.libMonoidMod.Monoid[M]): js.Function2[
    /* fa */ fpDashTsLib.libHKTMod.Type3[F, _, _, _], 
    /* f */ js.Function1[/* a */ js.Any, M], 
    M
  ]
  def foldr[U, L, A, B](fa: fpDashTsLib.libHKTMod.Type3[F, U, L, A], b: B, f: js.Function2[/* a */ A, /* b */ B, B]): B
}

