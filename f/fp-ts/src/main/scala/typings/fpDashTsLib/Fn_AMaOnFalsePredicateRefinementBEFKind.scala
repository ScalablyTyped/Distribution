package typings
package fpDashTsLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Fn_AMaOnFalsePredicateRefinementBEFKind[F /* <: fpDashTsLib.libHKTMod.URIS */] extends js.Object {
  def apply[E, A](predicate: fpDashTsLib.libFunctionMod.Predicate[A], onFalse: js.Function1[/* a */ A, E]): js.Function1[/* ma */ fpDashTsLib.libHKTMod.Kind[F, A], fpDashTsLib.libHKTMod.Kind[F, A]] = js.native
}

