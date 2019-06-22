package typings
package fpDashTsLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Fn_AMa[F] extends js.Object {
  def apply[E, A](predicate: fpDashTsLib.es6FunctionMod.Predicate[A], onFalse: js.Function1[/* a */ A, E]): js.Function1[/* ma */ fpDashTsLib.es6HKTMod.HKT[F, A], fpDashTsLib.es6HKTMod.HKT[F, A]] = js.native
}

