package typings
package fpDashTsLib.libFilterableWithIndexMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait PartitionWithIndex2[F /* <: fpDashTsLib.libHKTMod.URIS2 */, I] extends js.Object {
  def apply[L, A](fa: fpDashTsLib.libHKTMod.Kind2[F, L, A], predicateWithIndex: PredicateWithIndex[I, A]): fpDashTsLib.libCompactableMod.Separated[fpDashTsLib.libHKTMod.Kind2[F, L, A], fpDashTsLib.libHKTMod.Kind2[F, L, A]] = js.native
}

