package typings
package fpDashTsLib.libFilterableMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Filter3[F /* <: fpDashTsLib.libHKTMod.URIS3 */] extends js.Object {
  def apply[U, L, A](fa: fpDashTsLib.libHKTMod.Type3[F, U, L, A], predicate: fpDashTsLib.libFunctionMod.Predicate[A]): fpDashTsLib.libHKTMod.Type3[F, U, L, A] = js.native
}

