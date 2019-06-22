package typings
package fpDashTsLib.es6SemigroupoidMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Semigroupoid4[F /* <: fpDashTsLib.es6HKTMod.URIS4 */] extends js.Object {
  val URI: F
  def compose[X, U, L, A, B](ab: fpDashTsLib.es6HKTMod.Kind4[F, X, U, A, B], la: fpDashTsLib.es6HKTMod.Kind4[F, X, U, L, A]): fpDashTsLib.es6HKTMod.Kind4[F, X, U, L, B]
}

object Semigroupoid4 {
  @scala.inline
  def apply[F /* <: fpDashTsLib.es6HKTMod.URIS4 */](
    URI: F,
    compose: (fpDashTsLib.es6HKTMod.Kind4[F, js.Any, js.Any, js.Any, js.Any], fpDashTsLib.es6HKTMod.Kind4[F, js.Any, js.Any, js.Any, js.Any]) => fpDashTsLib.es6HKTMod.Kind4[F, js.Any, js.Any, js.Any, js.Any]
  ): Semigroupoid4[F] = {
    val __obj = js.Dynamic.literal(URI = URI.asInstanceOf[js.Any], compose = js.Any.fromFunction2(compose))
  
    __obj.asInstanceOf[Semigroupoid4[F]]
  }
}

