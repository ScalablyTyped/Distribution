package typings
package fpDashTsLib.libFilterableWithIndexMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait PartitionWithIndex3C[F /* <: fpDashTsLib.libHKTMod.URIS3 */, I, U, L] extends js.Object {
  def apply[A](fa: fpDashTsLib.libHKTMod.Type3[F, U, L, A], predicateWithIndex: PredicateWithIndex[I, A]): fpDashTsLib.libCompactableMod.Separated[fpDashTsLib.libHKTMod.Type3[F, U, L, A], fpDashTsLib.libHKTMod.Type3[F, U, L, A]] = js.native
}

