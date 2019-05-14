package typings
package fpDashTsLib.libFilterableWithIndexMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait FilterWithIndex[F, I] extends js.Object {
  def apply[A](fa: fpDashTsLib.libHKTMod.HKT[F, A], predicateWithIndex: PredicateWithIndex[I, A]): fpDashTsLib.libHKTMod.HKT[F, A] = js.native
}

