package typings
package fpDashTsLib.libFilterableMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Filter4[F /* <: fpDashTsLib.libHKTMod.URIS4 */] extends js.Object {
  def apply[X, U, L, A](fa: fpDashTsLib.libHKTMod.Kind4[F, X, U, L, A], predicate: fpDashTsLib.libFunctionMod.Predicate[A]): fpDashTsLib.libHKTMod.Kind4[F, X, U, L, A] = js.native
}

