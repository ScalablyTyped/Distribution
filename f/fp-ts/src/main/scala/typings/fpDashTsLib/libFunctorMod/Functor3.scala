package typings
package fpDashTsLib.libFunctorMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait Functor3[F /* <: fpDashTsLib.libHKTMod.URIS3 */] extends js.Object {
  val URI: F
  def map[U, L, A, B](fa: fpDashTsLib.libHKTMod.Type3[F, U, L, A], f: js.Function1[/* a */ A, B]): fpDashTsLib.libHKTMod.Type3[F, U, L, B]
}

