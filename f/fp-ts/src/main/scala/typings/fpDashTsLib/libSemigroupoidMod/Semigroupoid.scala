package typings
package fpDashTsLib.libSemigroupoidMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Semigroupoid[F] extends js.Object {
  val URI: F
  def compose[L, A, B](ab: fpDashTsLib.libHKTMod.HKT2[F, A, B], la: fpDashTsLib.libHKTMod.HKT2[F, L, A]): fpDashTsLib.libHKTMod.HKT2[F, L, B]
}

object Semigroupoid {
  @scala.inline
  def apply[F](
    URI: F,
    compose: (fpDashTsLib.libHKTMod.HKT2[F, js.Any, js.Any], fpDashTsLib.libHKTMod.HKT2[F, js.Any, js.Any]) => fpDashTsLib.libHKTMod.HKT2[F, js.Any, js.Any]
  ): Semigroupoid[F] = {
    val __obj = js.Dynamic.literal(URI = URI.asInstanceOf[js.Any], compose = js.Any.fromFunction2(compose))
  
    __obj.asInstanceOf[Semigroupoid[F]]
  }
}

