package typings
package fpDashTsLib.libFilterableMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Filter3C[F /* <: fpDashTsLib.libHKTMod.URIS3 */, U, L] extends js.Object {
  def apply[A](fa: fpDashTsLib.libHKTMod.Kind3[F, U, L, A], predicate: fpDashTsLib.libFunctionMod.Predicate[A]): fpDashTsLib.libHKTMod.Kind3[F, U, L, A] = js.native
}

