package typings
package fpDashTsLib.es6SemigroupoidMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Semigroupoid[F] extends js.Object {
  val URI: F
  def compose[L, A, B](ab: fpDashTsLib.es6HKTMod.HKT2[F, A, B], la: fpDashTsLib.es6HKTMod.HKT2[F, L, A]): fpDashTsLib.es6HKTMod.HKT2[F, L, B]
}

object Semigroupoid {
  @scala.inline
  def apply[F](
    URI: F,
    compose: (fpDashTsLib.es6HKTMod.HKT2[F, js.Any, js.Any], fpDashTsLib.es6HKTMod.HKT2[F, js.Any, js.Any]) => fpDashTsLib.es6HKTMod.HKT2[F, js.Any, js.Any]
  ): Semigroupoid[F] = {
    val __obj = js.Dynamic.literal(URI = URI.asInstanceOf[js.Any], compose = js.Any.fromFunction2(compose))
  
    __obj.asInstanceOf[Semigroupoid[F]]
  }
}

