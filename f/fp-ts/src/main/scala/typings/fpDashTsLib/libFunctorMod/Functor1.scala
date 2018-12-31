package typings
package fpDashTsLib.libFunctorMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Functor1[F /* <: fpDashTsLib.libHKTMod.URIS */] extends js.Object {
  val URI: F
  def map[A, B](fa: fpDashTsLib.libHKTMod.Type[F, A], f: js.Function1[/* a */ A, B]): fpDashTsLib.libHKTMod.Type[F, B]
}

