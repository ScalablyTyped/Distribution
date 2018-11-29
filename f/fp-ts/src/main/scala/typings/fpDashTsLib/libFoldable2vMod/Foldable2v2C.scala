package typings
package fpDashTsLib.libFoldable2vMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait Foldable2v2C[F /* <: fpDashTsLib.libHKTMod.URIS2 */, L]
  extends fpDashTsLib.libFoldableMod.Foldable2C[F, L] {
  def foldMap[M](M: fpDashTsLib.libMonoidMod.Monoid[M]): js.Function2[
    /* fa */ fpDashTsLib.libHKTMod.Type2[F, L, _], 
    /* f */ js.Function1[/* a */ js.Any, M], 
    M
  ]
  def foldr[A, B](fa: fpDashTsLib.libHKTMod.Type2[F, L, A], b: B, f: js.Function2[/* a */ A, /* b */ B, B]): B
}

