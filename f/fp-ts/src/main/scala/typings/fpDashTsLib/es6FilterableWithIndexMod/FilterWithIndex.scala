package typings
package fpDashTsLib.es6FilterableWithIndexMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait FilterWithIndex[F, I] extends js.Object {
  def apply[A](fa: fpDashTsLib.es6HKTMod.HKT[F, A], predicateWithIndex: PredicateWithIndex[I, A]): fpDashTsLib.es6HKTMod.HKT[F, A] = js.native
}

