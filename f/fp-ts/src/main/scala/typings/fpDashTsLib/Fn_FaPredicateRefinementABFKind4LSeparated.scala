package typings
package fpDashTsLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Fn_FaPredicateRefinementABFKind4LSeparated[F /* <: fpDashTsLib.libHKTMod.URIS4 */] extends js.Object {
  def apply[A](predicate: fpDashTsLib.libFunctionMod.Predicate[A]): js.Function1[
    /* fa */ fpDashTsLib.libHKTMod.Kind4[F, _, _, _, A], 
    fpDashTsLib.libCompactableMod.Separated[
      fpDashTsLib.libHKTMod.Kind4[F, _, _, _, A], 
      fpDashTsLib.libHKTMod.Kind4[F, _, _, _, A]
    ]
  ] = js.native
}

