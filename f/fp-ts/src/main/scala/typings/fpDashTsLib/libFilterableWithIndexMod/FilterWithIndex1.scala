package typings
package fpDashTsLib.libFilterableWithIndexMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait FilterWithIndex1[F /* <: fpDashTsLib.libHKTMod.URIS */, I] extends js.Object {
  def apply[A](fa: fpDashTsLib.libHKTMod.Type[F, A], predicateWithIndex: PredicateWithIndex[I, A]): fpDashTsLib.libHKTMod.Type[F, A] = js.native
}

