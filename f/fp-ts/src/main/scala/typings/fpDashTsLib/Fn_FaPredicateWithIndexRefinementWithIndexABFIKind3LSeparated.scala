package typings
package fpDashTsLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Fn_FaPredicateWithIndexRefinementWithIndexABFIKind3LSeparated[I, F /* <: fpDashTsLib.libHKTMod.URIS3 */] extends js.Object {
  def apply[A](predicateWithIndex: fpDashTsLib.libFilterableWithIndexMod.PredicateWithIndex[I, A]): js.Function1[
    /* fa */ fpDashTsLib.libHKTMod.Kind3[F, _, _, A], 
    fpDashTsLib.libCompactableMod.Separated[fpDashTsLib.libHKTMod.Kind3[F, _, _, A], fpDashTsLib.libHKTMod.Kind3[F, _, _, A]]
  ] = js.native
}

