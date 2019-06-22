package typings
package fpDashTsLib.es6SemigroupoidMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Semigroupoid3C[F /* <: fpDashTsLib.es6HKTMod.URIS3 */, U] extends js.Object {
  val URI: F
  val _U: U
  def compose[L, A, B](ab: fpDashTsLib.es6HKTMod.Kind3[F, U, A, B], la: fpDashTsLib.es6HKTMod.Kind3[F, U, L, A]): fpDashTsLib.es6HKTMod.Kind3[F, U, L, B]
}

object Semigroupoid3C {
  @scala.inline
  def apply[F /* <: fpDashTsLib.es6HKTMod.URIS3 */, U](
    URI: F,
    _U: U,
    compose: (fpDashTsLib.es6HKTMod.Kind3[F, U, js.Any, js.Any], fpDashTsLib.es6HKTMod.Kind3[F, U, js.Any, js.Any]) => fpDashTsLib.es6HKTMod.Kind3[F, U, js.Any, js.Any]
  ): Semigroupoid3C[F, U] = {
    val __obj = js.Dynamic.literal(URI = URI.asInstanceOf[js.Any], _U = _U.asInstanceOf[js.Any], compose = js.Any.fromFunction2(compose))
  
    __obj.asInstanceOf[Semigroupoid3C[F, U]]
  }
}

