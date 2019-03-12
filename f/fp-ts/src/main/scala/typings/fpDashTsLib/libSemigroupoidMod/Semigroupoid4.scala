package typings
package fpDashTsLib.libSemigroupoidMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Semigroupoid4[F /* <: fpDashTsLib.libHKTMod.URIS4 */] extends js.Object {
  val URI: F
  def compose[X, U, L, A, B](ab: fpDashTsLib.libHKTMod.Type4[F, X, U, A, B], la: fpDashTsLib.libHKTMod.Type4[F, X, U, L, A]): fpDashTsLib.libHKTMod.Type4[F, X, U, L, B]
}

object Semigroupoid4 {
  @scala.inline
  def apply[F /* <: fpDashTsLib.libHKTMod.URIS4 */](
    URI: F,
    compose: (fpDashTsLib.libHKTMod.Type4[F, js.Any, js.Any, js.Any, js.Any], fpDashTsLib.libHKTMod.Type4[F, js.Any, js.Any, js.Any, js.Any]) => fpDashTsLib.libHKTMod.Type4[F, js.Any, js.Any, js.Any, js.Any]
  ): Semigroupoid4[F] = {
    val __obj = js.Dynamic.literal(URI = URI.asInstanceOf[js.Any], compose = js.Any.fromFunction2(compose))
  
    __obj.asInstanceOf[Semigroupoid4[F]]
  }
}

