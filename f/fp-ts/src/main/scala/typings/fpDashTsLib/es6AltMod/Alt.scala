package typings
package fpDashTsLib.es6AltMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Alt[F]
  extends fpDashTsLib.es6FunctorMod.Functor[F] {
  def alt[A](fx: fpDashTsLib.es6HKTMod.HKT[F, A], fy: fpDashTsLib.es6HKTMod.HKT[F, A]): fpDashTsLib.es6HKTMod.HKT[F, A]
}

object Alt {
  @scala.inline
  def apply[F](
    URI: F,
    alt: (fpDashTsLib.es6HKTMod.HKT[F, js.Any], fpDashTsLib.es6HKTMod.HKT[F, js.Any]) => fpDashTsLib.es6HKTMod.HKT[F, js.Any],
    map: (fpDashTsLib.es6HKTMod.HKT[F, js.Any], js.Function1[js.Any, js.Any]) => fpDashTsLib.es6HKTMod.HKT[F, js.Any]
  ): Alt[F] = {
    val __obj = js.Dynamic.literal(URI = URI.asInstanceOf[js.Any], alt = js.Any.fromFunction2(alt), map = js.Any.fromFunction2(map))
  
    __obj.asInstanceOf[Alt[F]]
  }
}

