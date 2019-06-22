package typings
package fpDashTsLib.es6SemigroupoidMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Semigroupoid3[F /* <: fpDashTsLib.es6HKTMod.URIS3 */] extends js.Object {
  val URI: F
  def compose[U, L, A, B](ab: fpDashTsLib.es6HKTMod.Kind3[F, U, A, B], la: fpDashTsLib.es6HKTMod.Kind3[F, U, L, A]): fpDashTsLib.es6HKTMod.Kind3[F, U, L, B]
}

object Semigroupoid3 {
  @scala.inline
  def apply[F /* <: fpDashTsLib.es6HKTMod.URIS3 */](
    URI: F,
    compose: (fpDashTsLib.es6HKTMod.Kind3[F, js.Any, js.Any, js.Any], fpDashTsLib.es6HKTMod.Kind3[F, js.Any, js.Any, js.Any]) => fpDashTsLib.es6HKTMod.Kind3[F, js.Any, js.Any, js.Any]
  ): Semigroupoid3[F] = {
    val __obj = js.Dynamic.literal(URI = URI.asInstanceOf[js.Any], compose = js.Any.fromFunction2(compose))
  
    __obj.asInstanceOf[Semigroupoid3[F]]
  }
}

