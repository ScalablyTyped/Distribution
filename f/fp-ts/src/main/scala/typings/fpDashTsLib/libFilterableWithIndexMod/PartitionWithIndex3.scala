package typings
package fpDashTsLib.libFilterableWithIndexMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait PartitionWithIndex3[F /* <: fpDashTsLib.libHKTMod.URIS3 */, I] extends js.Object {
  def apply[U, L, A](fa: fpDashTsLib.libHKTMod.Kind3[F, U, L, A], predicateWithIndex: PredicateWithIndex[I, A]): fpDashTsLib.libCompactableMod.Separated[fpDashTsLib.libHKTMod.Kind3[F, U, L, A], fpDashTsLib.libHKTMod.Kind3[F, U, L, A]] = js.native
}

