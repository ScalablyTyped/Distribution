package typings
package fpDashTsLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Fn_FaPredicateRefinementABFKind2LSeparated[F /* <: fpDashTsLib.libHKTMod.URIS2 */] extends js.Object {
  def apply[A](predicate: fpDashTsLib.libFunctionMod.Predicate[A]): js.Function1[
    /* fa */ fpDashTsLib.libHKTMod.Kind2[F, _, A], 
    fpDashTsLib.libCompactableMod.Separated[fpDashTsLib.libHKTMod.Kind2[F, _, A], fpDashTsLib.libHKTMod.Kind2[F, _, A]]
  ] = js.native
}

