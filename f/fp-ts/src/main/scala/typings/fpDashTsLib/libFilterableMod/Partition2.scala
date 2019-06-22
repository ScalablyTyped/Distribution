package typings
package fpDashTsLib.libFilterableMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Partition2[F /* <: fpDashTsLib.libHKTMod.URIS2 */] extends js.Object {
  def apply[L, A](fa: fpDashTsLib.libHKTMod.Kind2[F, L, A], predicate: fpDashTsLib.libFunctionMod.Predicate[A]): fpDashTsLib.libCompactableMod.Separated[fpDashTsLib.libHKTMod.Kind2[F, L, A], fpDashTsLib.libHKTMod.Kind2[F, L, A]] = js.native
}

