package typings
package fpDashTsLib.es6SemigroupoidMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Semigroupoid2[F /* <: fpDashTsLib.es6HKTMod.URIS2 */] extends js.Object {
  val URI: F
  def compose[L, A, B](ab: fpDashTsLib.es6HKTMod.Type2[F, A, B], la: fpDashTsLib.es6HKTMod.Type2[F, L, A]): fpDashTsLib.es6HKTMod.Type2[F, L, B]
}

object Semigroupoid2 {
  @scala.inline
  def apply[F /* <: fpDashTsLib.es6HKTMod.URIS2 */](
    URI: F,
    compose: (fpDashTsLib.es6HKTMod.Type2[F, js.Any, js.Any], fpDashTsLib.es6HKTMod.Type2[F, js.Any, js.Any]) => fpDashTsLib.es6HKTMod.Type2[F, js.Any, js.Any]
  ): Semigroupoid2[F] = {
    val __obj = js.Dynamic.literal(URI = URI.asInstanceOf[js.Any], compose = js.Any.fromFunction2(compose))
  
    __obj.asInstanceOf[Semigroupoid2[F]]
  }
}

