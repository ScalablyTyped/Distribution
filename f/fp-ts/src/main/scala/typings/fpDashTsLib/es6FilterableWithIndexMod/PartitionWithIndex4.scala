package typings
package fpDashTsLib.es6FilterableWithIndexMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait PartitionWithIndex4[F /* <: fpDashTsLib.es6HKTMod.URIS4 */, I] extends js.Object {
  def apply[X, U, L, A](fa: fpDashTsLib.es6HKTMod.Kind4[F, X, U, L, A], predicateWithIndex: PredicateWithIndex[I, A]): fpDashTsLib.es6CompactableMod.Separated[
    fpDashTsLib.es6HKTMod.Kind4[F, X, U, L, A], 
    fpDashTsLib.es6HKTMod.Kind4[F, X, U, L, A]
  ] = js.native
}

