package typings
package fpDashTsLib.libFilterableWithIndexMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait FilterWithIndex2C[F /* <: fpDashTsLib.libHKTMod.URIS2 */, I, L] extends js.Object {
  def apply[A](fa: fpDashTsLib.libHKTMod.Kind2[F, L, A], predicateWithIndex: PredicateWithIndex[I, A]): fpDashTsLib.libHKTMod.Kind2[F, L, A] = js.native
}

