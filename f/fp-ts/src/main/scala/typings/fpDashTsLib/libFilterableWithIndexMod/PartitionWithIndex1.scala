package typings
package fpDashTsLib.libFilterableWithIndexMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait PartitionWithIndex1[F /* <: fpDashTsLib.libHKTMod.URIS */, I] extends js.Object {
  def apply[A](fa: fpDashTsLib.libHKTMod.Type[F, A], predicateWithIndex: PredicateWithIndex[I, A]): fpDashTsLib.libCompactableMod.Separated[fpDashTsLib.libHKTMod.Type[F, A], fpDashTsLib.libHKTMod.Type[F, A]] = js.native
}

