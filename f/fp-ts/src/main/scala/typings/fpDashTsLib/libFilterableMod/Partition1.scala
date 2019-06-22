package typings
package fpDashTsLib.libFilterableMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Partition1[F /* <: fpDashTsLib.libHKTMod.URIS */] extends js.Object {
  def apply[A](fa: fpDashTsLib.libHKTMod.Kind[F, A], predicate: fpDashTsLib.libFunctionMod.Predicate[A]): fpDashTsLib.libCompactableMod.Separated[fpDashTsLib.libHKTMod.Kind[F, A], fpDashTsLib.libHKTMod.Kind[F, A]] = js.native
}

