package typings
package fpDashTsLib.es6FilterableMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Filter[F] extends js.Object {
  def apply[A](fa: fpDashTsLib.es6HKTMod.HKT[F, A], predicate: fpDashTsLib.es6FunctionMod.Predicate[A]): fpDashTsLib.es6HKTMod.HKT[F, A] = js.native
}

