package typings
package fpDashTsLib.libFunctorMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait Functor4[F /* <: fpDashTsLib.libHKTMod.URIS4 */] extends js.Object {
  val URI: F
  def map[X, U, L, A, B](fa: fpDashTsLib.libHKTMod.Type4[F, X, U, L, A], f: js.Function1[/* a */ A, B]): fpDashTsLib.libHKTMod.Type4[F, X, U, L, B]
}

