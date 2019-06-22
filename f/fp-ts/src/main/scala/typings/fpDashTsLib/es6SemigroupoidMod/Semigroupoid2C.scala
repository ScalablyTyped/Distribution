package typings
package fpDashTsLib.es6SemigroupoidMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Semigroupoid2C[F /* <: fpDashTsLib.es6HKTMod.URIS2 */, L] extends js.Object {
  val URI: F
  def compose[A, B](ab: fpDashTsLib.es6HKTMod.Kind2[F, A, B], la: fpDashTsLib.es6HKTMod.Kind2[F, L, A]): fpDashTsLib.es6HKTMod.Kind2[F, L, B]
}

object Semigroupoid2C {
  @scala.inline
  def apply[F /* <: fpDashTsLib.es6HKTMod.URIS2 */, L](
    URI: F,
    compose: (fpDashTsLib.es6HKTMod.Kind2[F, js.Any, js.Any], fpDashTsLib.es6HKTMod.Kind2[F, L, js.Any]) => fpDashTsLib.es6HKTMod.Kind2[F, L, js.Any]
  ): Semigroupoid2C[F, L] = {
    val __obj = js.Dynamic.literal(URI = URI.asInstanceOf[js.Any], compose = js.Any.fromFunction2(compose))
  
    __obj.asInstanceOf[Semigroupoid2C[F, L]]
  }
}

