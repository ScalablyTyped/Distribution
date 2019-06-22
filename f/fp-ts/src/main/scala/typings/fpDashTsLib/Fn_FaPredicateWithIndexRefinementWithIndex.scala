package typings
package fpDashTsLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Fn_FaPredicateWithIndexRefinementWithIndex[I, F] extends js.Object {
  def apply[A](predicateWithIndex: fpDashTsLib.es6FilterableWithIndexMod.PredicateWithIndex[I, A]): js.Function1[
    /* fa */ fpDashTsLib.es6HKTMod.HKT[F, A], 
    fpDashTsLib.es6CompactableMod.Separated[fpDashTsLib.es6HKTMod.HKT[F, A], fpDashTsLib.es6HKTMod.HKT[F, A]]
  ] = js.native
}

