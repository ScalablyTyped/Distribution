package typings
package fpDashTsLib.es6FunctorMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Functor4[F /* <: fpDashTsLib.es6HKTMod.URIS4 */] extends js.Object {
  val URI: F
  def map[X, U, L, A, B](fa: fpDashTsLib.es6HKTMod.Kind4[F, X, U, L, A], f: js.Function1[/* a */ A, B]): fpDashTsLib.es6HKTMod.Kind4[F, X, U, L, B]
}

object Functor4 {
  @scala.inline
  def apply[F /* <: fpDashTsLib.es6HKTMod.URIS4 */](
    URI: F,
    map: (fpDashTsLib.es6HKTMod.Kind4[F, js.Any, js.Any, js.Any, js.Any], js.Function1[js.Any, js.Any]) => fpDashTsLib.es6HKTMod.Kind4[F, js.Any, js.Any, js.Any, js.Any]
  ): Functor4[F] = {
    val __obj = js.Dynamic.literal(URI = URI.asInstanceOf[js.Any], map = js.Any.fromFunction2(map))
  
    __obj.asInstanceOf[Functor4[F]]
  }
}

