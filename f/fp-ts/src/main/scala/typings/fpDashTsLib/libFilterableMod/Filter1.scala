package typings
package fpDashTsLib.libFilterableMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Filter1[F /* <: fpDashTsLib.libHKTMod.URIS */] extends js.Object {
  def apply[A](fa: fpDashTsLib.libHKTMod.Type[F, A], predicate: fpDashTsLib.libFunctionMod.Predicate[A]): fpDashTsLib.libHKTMod.Type[F, A] = js.native
}

