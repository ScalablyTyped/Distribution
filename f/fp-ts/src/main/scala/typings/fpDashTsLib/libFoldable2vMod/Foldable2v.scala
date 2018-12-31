package typings
package fpDashTsLib.libFoldable2vMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Foldable2v[F]
  extends fpDashTsLib.libFoldableMod.Foldable[F] {
  def foldMap[M](M: fpDashTsLib.libMonoidMod.Monoid[M]): js.Function2[/* fa */ fpDashTsLib.libHKTMod.HKT[F, _], /* f */ js.Function1[/* a */ js.Any, M], M]
  def foldr[A, B](fa: fpDashTsLib.libHKTMod.HKT[F, A], b: B, f: js.Function2[/* a */ A, /* b */ B, B]): B
}

