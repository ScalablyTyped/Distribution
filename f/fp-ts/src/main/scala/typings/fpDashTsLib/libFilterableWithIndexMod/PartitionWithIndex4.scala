package typings
package fpDashTsLib.libFilterableWithIndexMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait PartitionWithIndex4[F /* <: fpDashTsLib.libHKTMod.URIS4 */, I] extends js.Object {
  def apply[X, U, L, A](fa: fpDashTsLib.libHKTMod.Kind4[F, X, U, L, A], predicateWithIndex: PredicateWithIndex[I, A]): fpDashTsLib.libCompactableMod.Separated[
    fpDashTsLib.libHKTMod.Kind4[F, X, U, L, A], 
    fpDashTsLib.libHKTMod.Kind4[F, X, U, L, A]
  ] = js.native
}

