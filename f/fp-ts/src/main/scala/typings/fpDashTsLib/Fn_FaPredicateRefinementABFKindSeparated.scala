package typings
package fpDashTsLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Fn_FaPredicateRefinementABFKindSeparated[F /* <: fpDashTsLib.libHKTMod.URIS */] extends js.Object {
  def apply[A](predicate: fpDashTsLib.libFunctionMod.Predicate[A]): js.Function1[
    /* fa */ fpDashTsLib.libHKTMod.Kind[F, A], 
    fpDashTsLib.libCompactableMod.Separated[fpDashTsLib.libHKTMod.Kind[F, A], fpDashTsLib.libHKTMod.Kind[F, A]]
  ] = js.native
}

