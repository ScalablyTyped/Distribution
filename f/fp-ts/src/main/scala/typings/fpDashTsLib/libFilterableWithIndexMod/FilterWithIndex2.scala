package typings
package fpDashTsLib.libFilterableWithIndexMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait FilterWithIndex2[F /* <: fpDashTsLib.libHKTMod.URIS2 */, I] extends js.Object {
  def apply[L, A](fa: fpDashTsLib.libHKTMod.Type2[F, L, A], predicateWithIndex: PredicateWithIndex[I, A]): fpDashTsLib.libHKTMod.Type2[F, L, A] = js.native
}

