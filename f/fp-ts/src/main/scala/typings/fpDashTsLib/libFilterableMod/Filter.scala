package typings
package fpDashTsLib.libFilterableMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Filter[F] extends js.Object {
  def apply[A](fa: fpDashTsLib.libHKTMod.HKT[F, A], predicate: fpDashTsLib.libFunctionMod.Predicate[A]): fpDashTsLib.libHKTMod.HKT[F, A] = js.native
}

