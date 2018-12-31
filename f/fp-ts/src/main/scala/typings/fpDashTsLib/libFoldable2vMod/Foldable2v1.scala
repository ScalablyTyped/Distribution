package typings
package fpDashTsLib.libFoldable2vMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Foldable2v1[F /* <: fpDashTsLib.libHKTMod.URIS */]
  extends fpDashTsLib.libFoldableMod.Foldable1[F] {
  def foldMap[M](M: fpDashTsLib.libMonoidMod.Monoid[M]): js.Function2[
    /* fa */ fpDashTsLib.libHKTMod.Type[F, _], 
    /* f */ js.Function1[/* a */ js.Any, M], 
    M
  ]
  def foldr[A, B](fa: fpDashTsLib.libHKTMod.Type[F, A], b: B, f: js.Function2[/* a */ A, /* b */ B, B]): B
}

