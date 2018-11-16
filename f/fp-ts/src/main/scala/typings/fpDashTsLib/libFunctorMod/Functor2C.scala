package typings
package fpDashTsLib.libFunctorMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait Functor2C[F /* <: fpDashTsLib.libHKTMod.URIS2 */, L] extends js.Object {
  val URI: F
  val _L: L
  def map[A, B](fa: fpDashTsLib.libHKTMod.Type2[F, L, A], f: js.Function1[/* a */ A, B]): fpDashTsLib.libHKTMod.Type2[F, L, B]
}

