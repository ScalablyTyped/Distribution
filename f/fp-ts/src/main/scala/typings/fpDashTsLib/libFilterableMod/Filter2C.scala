package typings
package fpDashTsLib.libFilterableMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Filter2C[F /* <: fpDashTsLib.libHKTMod.URIS2 */, L] extends js.Object {
  def apply[A](fa: fpDashTsLib.libHKTMod.Kind2[F, L, A], predicate: fpDashTsLib.libFunctionMod.Predicate[A]): fpDashTsLib.libHKTMod.Kind2[F, L, A] = js.native
}

