package typings
package fpDashTsLib.es6FunctorMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Functor[F] extends js.Object {
  val URI: F
  def map[A, B](fa: fpDashTsLib.es6HKTMod.HKT[F, A], f: js.Function1[/* a */ A, B]): fpDashTsLib.es6HKTMod.HKT[F, B]
}

object Functor {
  @scala.inline
  def apply[F](
    URI: F,
    map: (fpDashTsLib.es6HKTMod.HKT[F, js.Any], js.Function1[js.Any, js.Any]) => fpDashTsLib.es6HKTMod.HKT[F, js.Any]
  ): Functor[F] = {
    val __obj = js.Dynamic.literal(URI = URI.asInstanceOf[js.Any], map = js.Any.fromFunction2(map))
  
    __obj.asInstanceOf[Functor[F]]
  }
}

