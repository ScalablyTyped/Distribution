package typings
package fpDashTsLib.libFoldableMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Foldable3C[F /* <: fpDashTsLib.libHKTMod.URIS3 */, U, L] extends js.Object {
  val URI: F
  val _L: L
  val _U: U
  def reduce[A, B](fa: fpDashTsLib.libHKTMod.Kind3[F, U, L, A], b: B, f: js.Function2[/* b */ B, /* a */ A, B]): B
}

object Foldable3C {
  @scala.inline
  def apply[F /* <: fpDashTsLib.libHKTMod.URIS3 */, U, L](
    URI: F,
    _L: L,
    _U: U,
    reduce: (fpDashTsLib.libHKTMod.Kind3[F, U, L, js.Any], js.Any, js.Function2[js.Any, js.Any, js.Any]) => js.Any
  ): Foldable3C[F, U, L] = {
    val __obj = js.Dynamic.literal(URI = URI.asInstanceOf[js.Any], _L = _L.asInstanceOf[js.Any], _U = _U.asInstanceOf[js.Any], reduce = js.Any.fromFunction3(reduce))
  
    __obj.asInstanceOf[Foldable3C[F, U, L]]
  }
}

