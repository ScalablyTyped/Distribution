package typings
package fpDashTsLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Fn_FaPredicate[F] extends js.Object {
  def apply[A](predicate: fpDashTsLib.es6FunctionMod.Predicate[A]): js.Function1[
    /* fa */ fpDashTsLib.es6HKTMod.HKT[F, A], 
    fpDashTsLib.es6CompactableMod.Separated[fpDashTsLib.es6HKTMod.HKT[F, A], fpDashTsLib.es6HKTMod.HKT[F, A]]
  ] = js.native
}

