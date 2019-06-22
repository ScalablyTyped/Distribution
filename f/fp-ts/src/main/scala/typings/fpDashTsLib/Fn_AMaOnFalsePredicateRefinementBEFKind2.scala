package typings
package fpDashTsLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Fn_AMaOnFalsePredicateRefinementBEFKind2[F /* <: fpDashTsLib.libHKTMod.URIS2 */] extends js.Object {
  def apply[E, A](predicate: fpDashTsLib.libFunctionMod.Predicate[A], onFalse: js.Function1[/* a */ A, E]): js.Function1[
    /* ma */ fpDashTsLib.libHKTMod.Kind2[F, E, A], 
    fpDashTsLib.libHKTMod.Kind2[F, E, A]
  ] = js.native
}

