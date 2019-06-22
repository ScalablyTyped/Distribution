package typings
package fpDashTsLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Fn_AMaOnFalsePredicateRefinementBEFKind4[F /* <: fpDashTsLib.libHKTMod.URIS4 */] extends js.Object {
  def apply[E, A](predicate: fpDashTsLib.libFunctionMod.Predicate[A], onFalse: js.Function1[/* a */ A, E]): js.Function1[
    /* ma */ fpDashTsLib.libHKTMod.Kind4[F, _, _, E, A], 
    fpDashTsLib.libHKTMod.Kind4[F, _, _, E, A]
  ] = js.native
}

