package typings
package fpDashTsLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Fn_FaPredicateWithIndexRefinementWithIndexAB[I, F /* <: fpDashTsLib.es6HKTMod.URIS */] extends js.Object {
  def apply[A](predicateWithIndex: fpDashTsLib.es6FilterableWithIndexMod.PredicateWithIndex[I, A]): js.Function1[
    /* fa */ fpDashTsLib.es6HKTMod.Kind[F, A], 
    fpDashTsLib.es6CompactableMod.Separated[fpDashTsLib.es6HKTMod.Kind[F, A], fpDashTsLib.es6HKTMod.Kind[F, A]]
  ] = js.native
}

