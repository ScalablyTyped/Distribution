package typings
package fpDashTsLib.libFilterableWithIndexMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait PartitionWithIndex1[F /* <: fpDashTsLib.libHKTMod.URIS */, I] extends js.Object {
  def apply[A](fa: fpDashTsLib.libHKTMod.Kind[F, A], predicateWithIndex: PredicateWithIndex[I, A]): fpDashTsLib.libCompactableMod.Separated[fpDashTsLib.libHKTMod.Kind[F, A], fpDashTsLib.libHKTMod.Kind[F, A]] = js.native
}

