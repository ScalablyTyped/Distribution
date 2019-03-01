package typings
package fpDashTsLib.libSemigroupoidMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Semigroupoid3[F /* <: fpDashTsLib.libHKTMod.URIS3 */] extends js.Object {
  val URI: F
  def compose[U, L, A, B](ab: fpDashTsLib.libHKTMod.Type3[F, U, A, B], la: fpDashTsLib.libHKTMod.Type3[F, U, L, A]): fpDashTsLib.libHKTMod.Type3[F, U, L, B]
}

object Semigroupoid3 {
  @scala.inline
  def apply[F /* <: fpDashTsLib.libHKTMod.URIS3 */](
    URI: F,
    compose: js.Function2[
      fpDashTsLib.libHKTMod.Type3[F, js.Any, js.Any, js.Any], 
      fpDashTsLib.libHKTMod.Type3[F, js.Any, js.Any, js.Any], 
      fpDashTsLib.libHKTMod.Type3[F, js.Any, js.Any, js.Any]
    ]
  ): Semigroupoid3[F] = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("URI")(URI.asInstanceOf[js.Any])
    __obj.updateDynamic("compose")(compose)
    __obj.asInstanceOf[Semigroupoid3[F]]
  }
}

